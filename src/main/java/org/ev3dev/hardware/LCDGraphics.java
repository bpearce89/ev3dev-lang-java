package org.ev3dev.hardware;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import org.ev3dev.exception.EV3LibraryException;

public class LCDGraphics extends Graphics {
	
	public static final int LINE_LEN = 24;
	
	public static final int ROWS = 128;
	
	public static final int BUF_SIZE = LINE_LEN * ROWS;
	
	private LCD lcd;
	
	private boolean whiteColor = false;
	
	private byte[] buf;
	
	private int transx = 0;
	
	private int transy = 0;

	public LCDGraphics() {
		lcd = new LCD();
		buf = new byte[BUF_SIZE];
	}
	
	/**
	 * Applies the Graphics context onto the ev3dev's LCD
	 */
	public void flush(){
		lcd.draw(buf);
	}

	@Override
	public Graphics create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void translate(int x, int y) {
		this.transx = x;
		this.transy = y;
	}
	
	public void setWhiteColor(){
		whiteColor = true;
	}
	
	public void setBlackColor(){
		whiteColor = false;
	}

	@Override
	public Color getColor() {
		return whiteColor ? Color.WHITE : Color.BLACK;
	}

	@Override
	public void setColor(Color c) throws EV3LibraryException{
		if (c == null || !c.equals(Color.BLACK) || !c.equals(Color.WHITE)){
			throw new EV3LibraryException("The EV3 LCD only supports Color.BLACK and Color.WHITE");
		}
		whiteColor = c.equals(Color.WHITE);
	}

	/**
	 * The ev3 LCD does not support PaintMode
	 */
	@Override
	public void setPaintMode() {
		throw new EV3LibraryException("The EV3 LCD does not support PaintMode");
	}

	/**
	 * The ev3 LCD does not support XORMode
	 */
	@Override
	public void setXORMode(Color c1) {
		throw new EV3LibraryException("The EV3 LCD does not support XORMode");
	}

	@Override
	public Font getFont() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFont(Font font) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FontMetrics getFontMetrics(Font f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle getClipBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clipRect(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setClip(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Shape getClip() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClip(Shape clip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void copyArea(int x, int y, int width, int height, int dx, int dy) {
		
	}

	@Override
	public void drawLine(int x1, int y1, int x2, int y2) {
		
	}

	@Override
	public void fillRect(int x, int y, int width, int height) {
		for (int i = 0; i < height; i++){
			for (int j = 0; j < width; j++){
				buf[(((i+y) * LINE_LEN)) + (x + j) / 8] = (byte) 0xff;
			}
		}
	}

	@Override
	public void clearRect(int x, int y, int width, int height) {
		for (int i = 0; i < height; i++){
			for (int j = 0; j < width; j++){
				buf[(((i+y) * LINE_LEN)) + (x + j) / 8] = (byte) 0x00;
			}
		}
	}

	@Override
	public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawOval(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillOval(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawString(String str, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawString(AttributedCharacterIterator iterator, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
			ImageObserver observer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
			Color bgcolor, ImageObserver observer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
