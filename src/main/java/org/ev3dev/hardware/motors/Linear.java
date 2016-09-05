//-----------------------------------------------------------------------------
//~autogen autogen-header

//~autogen
//-----------------------------------------------------------------------------

package org.ev3dev.hardware.motors;

//-----------------------------------------------------------------------------

import java.io.IOException;

import org.ev3dev.exception.InvalidPortException;
import org.ev3dev.hardware.Device;
import org.ev3dev.hardware.ports.LegoPort;
import org.ev3dev.io.Sysfs;

//-----------------------------------------------------------------------------

//~autogen generic-classes classes.motor>currentClass


//~autogen


/**
 * The motor class for Firgelli linear actuators.
 * @author Anthony
 *
 */
public class Linear extends Device{
	
	/**
	 * The Sysfs class's <code>address</code> property name
	 */
	public static final String SYSFS_PROPERTY_ADDRESS = "address";
	
	/**
	 * The Sysfs class's <code>command</code> property name
	 */
	public static final String SYSFS_PROPERTY_COMMAND = "command";
	
	/**
	 * The Sysfs class's <code>commands</code> property name
	 */
	public static final String SYSFS_PROPERTY_COMMANDS = "commands";
	
	/**
	 * The Sysfs class's <code>driver_name</code> property name
	 */
	public static final String SYSFS_PROPERTY_DRIVER_NAME = "driver_name";
	
	/**
	 * The Sysfs class's <code>duty_cycle</code> property name
	 */
	public static final String SYSFS_PROPERTY_DUTY_CYCLE = "duty_cycle";
	
	/**
	 * The Sysfs class's <code>duty_cycle_sp</code> property name
	 */
	public static final String SYSFS_PROPERTY_DUTY_CYCLE_SP = "duty_cycle_sp";
	
	/**
	 * The Sysfs class's <code>polarity</code> property name
	 */
	public static final String SYSFS_PROPERTY_POLARITY = "polarity";
	
	/**
	 * The Sysfs class's <code>position</code> property name
	 */
	public static final String SYSFS_PROPERTY_POSITION = "position";
	
	/**
	 * The Sysfs class's <code>position_p</code> property name
	 */
	public static final String SYSFS_PROPERTY_POSITION_P = "hold_pid/Kp";
	
	/**
	 * The Sysfs class's <code>position_i</code> property name
	 */
	public static final String SYSFS_PROPERTY_POSITION_I = "hold_pid/Ki";
	
	/**
	 * The Sysfs class's <code>position_d</code> property name
	 */
	public static final String SYSFS_PROPERTY_POSITION_D = "hold_pid/Kd";
	
	/**
	 * The Sysfs class's <code>position_sp</code> property name
	 */
	public static final String SYSFS_PROPERTY_POSITION_SP = "position_sp";
	
	/**
	 * The Sysfs class's <code>speed</code> property name
	 */
	public static final String SYSFS_PROPERTY_SPEED = "speed";
	
	/**
	 * The Sysfs class's <code>speed_sp</code> property name
	 */
	public static final String SYSFS_PROPERTY_SPEED_SP = "speed_sp";
	
	/**
	 * The Sysfs class's <code>ramp_up_sp</code> property name
	 */
	public static final String SYSFS_PROPERTY_RAMP_UP_SP = "ramp_up_sp";
	
	/**
	 * The Sysfs class's <code>ramp_down_sp</code> property name
	 */
	public static final String SYSFS_PROPERTY_RAMP_DOWN_SP = "ramp_down_sp";
	
	/**
	 * The Sysfs class's <code>state</code> property name
	 */
	public static final String SYSFS_PROPERTY_STATE = "state";
	
	/**
	 * The Sysfs class's <code>stop_action</code> property name
	 */
	public static final String SYSFS_PROPERTY_STOP_ACTION = "stop_action";
	
	/**
	 * The Sysfs class's <code>stop_actions</code> property name
	 */
	public static final String SYSFS_PROPERTY_STOP_ACTIONS = "stop_actions";
	
	/**
	 * The Sysfs class's <code>time_sp</code> property name
	 */
	public static final String SYSFS_PROPERTY_TIME_SP = "time_sp";
	
	/**
	 * The Sysfs class's <code>max_speed</code> property name
	 */
	public static final String SYSFS_PROPERTY_MAX_SPEED = "max_speed";
	
	/**
	 * The Sysfs class's <code>count_per_m</code> property name
	 */
	public static final String SYSFS_PROPERTY_COUNT_PER_M = "count_per_m";
	
	/**
	 * The Sysfs class's <code>full_travel_count</code> property name
	 */
	public static final String SYSFS_PROPERTY_FULL_TRAVEL_COUNT = "full_travel_count";
	
	/**
	 * The Sysfs class's <code>run-forever</code> command
	 */
	public static final String SYSFS_COMMAND_RUN_FOREVER = "run-forever";
	
	/**
	 * The Sysfs class's <code>run-to-abs-pos</code> command
	 */
	public static final String SYSFS_COMMAND_RUN_TO_ABS_POS = "run-to-abs-pos";
	
	/**
	 * The Sysfs class's <code>run-to-rel-pos</code> command
	 */
	public static final String SYSFS_COMMAND_RUN_TO_REL_POS = "run-to-rel-pos";
	
	/**
	 * The Sysfs class's <code>run-timed</code> command
	 */
	public static final String SYSFS_COMMAND_RUN_TIMED = "run-timed";
	
	/**
	 * The Sysfs class's <code>run-direct</code> command
	 */
	public static final String SYSFS_COMMAND_RUN_DIRECT = "run-direct";
	
	/**
	 * The Sysfs class's <code>stop</code> command
	 */
	public static final String SYSFS_COMMAND_STOP = "stop";
	
	/**
	 * The Sysfs class's <code>reset</code> command
	 */
	public static final String SYSFS_COMMAND_RESET = "reset";
	
	/**
	 * This Sysfs's class name (e.g. <code>/sys/class/lego-sensor</code>, and <code>lego-sensor</code> is the class name)
	 */
	public static final String MOTOR_CLASS_NAME = "tacho-motor";
	
	/**
	 * This Sysfs's class name prefix (e.g. <code>/sys/class/lego-sensor/sensor0</code>, and <code>sensor</code> is the class name prefix without the [N] value.)
	 */
	public static final String LINEAR_MOTOR_CLASS_NAME_PREFIX = "linear";
	
	/**
	 * The driver name for the L12 EV3 100mm by Actuonix
	 */
	public static final String DRIVER_NAME_100MM = "act-l12-ev3-100";
	
	/**
	 * The driver name for the L12 EV3 100mm by Actuonix
	 */
	public static final String DRIVER_NAME_50MM = "act-l12-ev3-50";
	
//-----------------------------------------------------------------------------

	private String address;
	
//-----------------------------------------------------------------------------
	
	/***
	 * Creates a new Linear motor object.
	 * @param port LegoPort
	 * @throws InvalidPortException If the LegoPort isn't a OUTPUT, invalid or a tacho-motor.
	 * @throws IOException If the LegoPort specified goes wrong
	 */
	public Linear(LegoPort port) throws InvalidPortException, IOException{
		super(port, MOTOR_CLASS_NAME, LINEAR_MOTOR_CLASS_NAME_PREFIX);
		if (!port.getDriverName().equals(DRIVER_NAME_100MM) && !port.getDriverName().equals(DRIVER_NAME_50MM)){
			throw new InvalidPortException("The port does not connect to a Actuonix L12 EV3 100mm or 50mm linear motor!");
		}
		
		address = port.getAddress();
		
		//Verify is the LegoPort connecting a motor / is a output
		if (!address.contains("out")){
			throw new InvalidPortException("The specified port (" + port.getAddress() + ") isn't a output.");
		}
	}

//-----------------------------------------------------------------------------
	
//~autogen generic-get-set classes.motor>currentClass
	/***
	 * Get the address of this motor.
	 * @return LegoPort address described in String
	 * @throws IOException If the motor doesn't exist or IO ERROR
	 */
	public String getAddress() throws IOException{
		if (!this.isConnected()){
			return null;
		}
		return this.getAttribute(SYSFS_PROPERTY_ADDRESS);
	}
	
	/***
	 * Generic method to send commands to the motor controller.
	 * @param command Command that suits for the motor driver
	 * @throws IOException If I/O goes wrong
	 */
	public void sendCommand(String command) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_COMMAND, command);
	}
	
	/***
	 * Cause the motor to run until another command is sent
	 * @throws IOException If I/O goes wrong
	 */
	public void runForever() throws IOException{
		if (!this.isConnected()){
			return;
		}
		sendCommand(SYSFS_COMMAND_RUN_FOREVER);
	}
	
	/***
	 * Run to an absolute position specified by <b>position_sp</b>
	 *  and then stop using the command specified in <b>stop_command</b>
	 * @throws IOException If I/O goes wrong
	 */
	public void runToAbsPos() throws IOException{
		if (!this.isConnected()){
			return;
		}
		sendCommand(SYSFS_COMMAND_RUN_TO_ABS_POS);
	}
	
	/***
	 * Run to a position relative to the current position value.
	 * The new position will be <b>current position</b> + <b>position_sp</b>.
	 * When the new position is reached, the motor will stop
	 *  using the command specified by <b>stop_command</b>.
	 * @throws IOException If I/O goes wrong.
	 */
	public void runToRelPos() throws IOException{
		if (!this.isConnected()){
			return;
		}
		sendCommand(SYSFS_COMMAND_RUN_TO_REL_POS);
	}
	
	/***
	 * Run the motor for the amount of time specified in <b>time_sp</b>
	 *  and then stop the motor using the command specified by
	 *  <b>stop_command</b>
	 * @throws IOException If I/O goes wrong
	 */
	public void runTimed() throws IOException{
		if (!this.isConnected()){
			return;
		}
		sendCommand(SYSFS_COMMAND_RUN_TIMED);
	}
	
	/***
	 * Run the motor at the duty cycle specified by <b>duty_cycle_sp</b>.
	 *  Unlike other run commands, changing <b>duty_cycle_sp</b> while
	 *   running will take effect immediately
	 * @throws IOException If I/O goes wrong
	 */
	public void runDirect() throws IOException{
		if (!this.isConnected()){
			return;
		}
		sendCommand(SYSFS_COMMAND_RUN_DIRECT);
	}
	
	/**
	 * Stop any of the run commands before they are complete using the command specified by <b>stop_command</b>.
	 * @throws IOException If I/O goes wrong
	 */
	public void stop() throws IOException{
		if (!this.isConnected()){
			return;
		}
		sendCommand(SYSFS_COMMAND_STOP);
	}
	
	/**
	 * Reset all of the motor parameter attributes to their default value. This will also have the effect of stopping the motor.
	 * @throws IOException If I/O goes wrong
	 */
	public void reset() throws IOException{
		if (!this.isConnected()){
			return;
		}
		sendCommand(SYSFS_COMMAND_RESET);
	}
	
	/**
	 * Returns a list of commands that are supported by the motor controller.
	 *  Possible values are run-forever, run-to-abs-pos, run-to-rel-pos,
	 *   run-timed, run-direct, stop and reset. Not all commands may be supported.
	 * @return A String Arrays with all the supported commands
	 * @throws IOException If I/O goes wrong
	 */
	public String[] getCommands() throws IOException{
		if (!this.isConnected()){
			return null;
		}
		String str = this.getAttribute(SYSFS_PROPERTY_COMMANDS);
		return Sysfs.separateSpace(str);
	}
	
	/**
	 * Returns the number of tacho counts in one metre of the motor.
	 * @return Counts per metre
	 * @throws IOException If I/O goes wrong
	 */
	public int getCountPerMetre() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String countpermetre = this.getAttribute(SYSFS_PROPERTY_COUNT_PER_M);
		return Integer.parseInt(countpermetre);
	}
	
	/**
	 * Returns the name of the driver that provides this tacho motor device.
	 * @return The name of the driver
	 * @throws IOException If I/O goes wrong
	 */
	public String getDriverName() throws IOException{
		if (!this.isConnected()){
			return null;
		}
		return this.getAttribute(SYSFS_PROPERTY_DRIVER_NAME);
	}
	
	
	/**
	 * Returns the current duty cycle of the motor. Units are percent. Values are -100 to 100.
	 * @return Percentage
	 * @throws IOException If I/O goes wrong
	 */
	public int getDutyCycle() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String dutycycle = this.getAttribute(SYSFS_PROPERTY_DUTY_CYCLE);
		return Integer.parseInt(dutycycle);
	}
	
	/**
	 * Writing sets the duty cycle setpoint. Reading returns the current value. Units are in percent.
	 *  Valid values are -100 to 100. A negative value causes the motor to rotate in reverse.
	 *   This value is only used when speed_regulation is off.
	 * @return Percentage
	 * @throws IOException If I/O goes wrong
	 */
	public int getDutyCycleSP() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String dutycyclesp = this.getAttribute(SYSFS_PROPERTY_DUTY_CYCLE_SP);
		return Integer.parseInt(dutycyclesp);
	}
	
	/**
	 * Writing sets the duty cycle setpoint. Reading returns the current value. Units are in percent.
	 *  Valid values are -100 to 100. A negative value causes the motor to rotate in reverse.
	 *   This value is only used when speed_regulation is off.
	 * @param sp Percentage
	 * @throws IOException If I/O goes wrong
	 */
	public void setDutyCycleSP(int sp) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_DUTY_CYCLE_SP, Integer.toString(sp));
	}
	
	/**
	 * Sets the polarity of the motor. With normal polarity, a positive duty cycle will cause the motor to rotate clockwise.
	 *  With inversed polarity, a positive duty cycle will cause the motor to rotate counter-clockwise. Valid values are normal and inversed.
	 * @return The polarity of the motor
	 * @throws IOException If I/O goes wrong
	 */
	public String getPolarity() throws IOException{
		if (!this.isConnected()){
			return null;
		}
		return this.getAttribute(SYSFS_PROPERTY_POLARITY);
	}
	
	/**
	 * Sets the polarity of the motor. With normal polarity, a positive duty cycle will cause the motor to rotate clockwise. With inversed polarity,
	 *  a positive duty cycle will cause the motor to rotate counter-clockwise. Valid values are normal and inversed.
	 * @param polarity The polarity of the motor
	 * @throws IOException If I/O goes wrong
	 */
	public void setPolarity(String polarity) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_POLARITY, polarity);
	}
	
	/**
	 * Returns the current position of the motor in pulses of the rotary encoder. When the motor rotates clockwise, the position will increase. Likewise,
	 *  rotating counter-clockwise causes the position to decrease. Writing will set the position to that value.
	 * @return The current position
	 * @throws IOException If I/O goes wrong
	 */
	public int getPosition() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String str = this.getAttribute("position_p");
		return Integer.parseInt(str);
	}
	
	/**
	 * Returns the current position of the motor in pulses of the rotary encoder. When the motor rotates clockwise, the position will increase.
	 *  Likewise, rotating counter-clockwise causes the position to decrease. Writing will set the position to that value.
	 * @param position The current position
	 * @throws IOException If I/O goes wrong
	 */
	public void setPosition(int position) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_POSITION, Integer.toString(position));
	}
	
	/**
	 * The proportional constant for the position PID.
	 * @return The proportional constant for the position PID.
	 * @throws IOException If I/O goes wrong
	 */
	public int getPosition_P() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String str = this.getAttribute(SYSFS_PROPERTY_POSITION_P);
		return Integer.parseInt(str);
	}
	
	/**
	 * The integral constant for the position PID.
	 * @return The integral constant for the position PID.
	 * @throws IOException If I/O goes wrong
	 */
	public int getPosition_I() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String str = this.getAttribute(SYSFS_PROPERTY_POSITION_I);
		return Integer.parseInt(str);
	}
	
	/**
	 * The derivative constant for the position PID.
	 * @return The derivative constant for the position PID.
	 * @throws IOException If I/O goes wrong
	 */
	public int getPosition_D() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String str = this.getAttribute(SYSFS_PROPERTY_POSITION_D);
		return Integer.parseInt(str);
	}
	
	/**
	 * The proportional constant for the position PID.
	 * @param position_p The proportional constant for the position PID.
	 * @throws IOException If I/O goes wrong
	 */
	public void setPosition_P(int position_p) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_POSITION_P, Integer.toString(position_p));
	}
	
	/**
	 * The integral constant for the position PID.
	 * @param position_i The integral constant for the position PID.
	 * @throws IOException If I/O goes wrong
	 */
	public void setPosition_I(int position_i) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_POSITION_I, Integer.toString(position_i));
	}
	
	/**
	 * The derivative constant for the position PID.
	 * @param position_d The derivative constant for the position PID.
	 * @throws IOException If I/O goes wrong
	 */
	public void setPosition_D(int position_d) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_POSITION_D, Integer.toString(position_d));
	}
	
	/**
	 * Writing specifies the target position for the run-to-abs-pos and run-to-rel-pos commands. Reading returns the current value.
	 *  Units are in tacho counts. You can use the value returned by counts_per_rot to convert tacho counts to/from rotations or degrees.
	 * @return The target position
	 * @throws IOException if I/O goes wrong
	 */
	public int getPosition_SP() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String str = this.getAttribute(SYSFS_PROPERTY_POSITION_SP);
		return Integer.parseInt(str);
	}

	/**
	 * Writing specifies the target position for the run-to-abs-pos and run-to-rel-pos commands. Reading returns the current value.
	 *  Units are in tacho counts. You can use the value returned by counts_per_rot to convert tacho counts to/from rotations or degrees.
	 * @param position_sp The target position
	 * @throws IOException If I/O goes wrong
	 */
	public void setPosition_SP(int position_sp) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_POSITION_SP, Integer.toString(position_sp));
	}
	
	/**
	 * Returns the current motor speed in tacho counts per second. Note, this is not necessarily degrees
	 *  (although it is for LEGO motors). Use the count_per_rot attribute to convert this value to RPM or deg/sec.
	 * @return The current speed
	 * @throws IOException If I/O goes wrong
	 */
	public int getSpeed() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String str = this.getAttribute(SYSFS_PROPERTY_SPEED);
		return Integer.parseInt(str);
	}
	
	/**
	 * Writing sets the target speed in tacho counts per second used when speed_regulation is on.
	 *  Reading returns the current value. Use the count_per_rot attribute to convert RPM or deg/sec to tacho counts per second.
	 * @return The target speed
	 * @throws IOException If I/O goes wrong
	 */
	public int getSpeed_SP() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String str = this.getAttribute(SYSFS_PROPERTY_SPEED);
		return Integer.parseInt(str);
	}
	
	/**
	 * Writing sets the target speed in tacho counts per second used when speed_regulation is on. Reading returns the current value.
	 *  Use the count_per_rot attribute to convert RPM or deg/sec to tacho counts per second.
	 * @param speed_sp The target speed
	 * @throws IOException If I/O goes wrong
	 */
	public void setSpeed_SP(int speed_sp) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_SPEED_SP, Integer.toString(speed_sp));
	}
	
	/**
	 * Writing sets the ramp up setpoint. Reading returns the current value. Units are in milliseconds.
	 *  When set to a value bigger than 0, the motor will ramp the power sent to the motor from 0 to 100% duty
	 *   cycle over the span of this setpoint when starting the motor. If the maximum duty cycle is
	 *    limited by duty_cycle_sp or speed regulation,
	 *  the actual ramp time duration will be less than the setpoint.
	 * @return The ramp-up set-point
	 * @throws IOException If I/O goes wrong
	 */
	public int getRamp_Up_SP() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String str = this.getAttribute(SYSFS_PROPERTY_RAMP_UP_SP);
		return Integer.parseInt(str);
	}
	
	/**
	 * Writing sets the ramp up setpoint. Reading returns the current value. Units are in milliseconds.
	 *  When set to a value bigger than 0, the motor will ramp the power sent to the motor from 0 to 100% duty
	 *   cycle over the span of this setpoint when starting the motor. If the maximum duty cycle is
	 *    limited by duty_cycle_sp or speed regulation,
	 *  the actual ramp time duration will be less than the setpoint.
	 * @param ramp_up_sp The ramp-up set-point
	 * @throws IOException If I/O goes wrong
	 */
	public void setRamp_Up_SP(int ramp_up_sp) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_RAMP_UP_SP, Integer.toString(ramp_up_sp));
	}
	
	/**
	 * Writing sets the ramp down setpoint. Reading returns the current value. Units are in milliseconds.
	 *  When set to a value bigger than 0, the motor will ramp the power sent to the motor from 100% duty cycle down
	 *   to 0 over the span of this setpoint when stopping the motor. If the starting
	 *  duty cycle is less than 100%, the ramp time duration will be less than the full span of the setpoint.
	 * @return The ramp-down set-point
	 * @throws IOException If I/O goes wrong
	 */
	public int getRamp_Down_SP() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String str = this.getAttribute(SYSFS_PROPERTY_RAMP_DOWN_SP);
		return Integer.parseInt(str);
	}
	
	/**
	 * Writing sets the ramp down setpoint. Reading returns the current value. Units are in milliseconds.
	 *  When set to a value bigger than 0, the motor will ramp the power sent to the motor from 100% duty cycle down
	 *   to 0 over the span of this setpoint when stopping the motor. If the starting
	 *  duty cycle is less than 100%, the ramp time duration will be less than the full span of the setpoint.
	 * @param ramp_down_sp The ramp-down set-point
	 * @throws IOException If I/O goes wrong
	 */
	public void setRamp_Down_SP(int ramp_down_sp) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_RAMP_DOWN_SP, Integer.toString(ramp_down_sp));
	}
	
	/**
	 * <b>This function returns a string that is likely a "spaced-array".</b><br>
	 * <b>Use this function to directly to return a String array:</b>
	 * <pre>
	 * getState()
	 * </pre>
	 * Reading returns a list of state flags. Possible flags are running, ramping holding and stalled.
	 * @return A list of state flags. String spaced-array
	 * @throws IOException If I/O goes wrong
	 */
	public String getStateViaString() throws IOException{
		if (!this.isConnected()){
			return null;
		}
		return this.getAttribute(SYSFS_PROPERTY_STATE);
	}
	
	/**
	 * Reading returns a list of state flags. Possible flags are running, ramping holding and stalled.
	 * @return A list(String array) of state flags.
	 * @throws IOException If I/O goes wrong
	 */
	public String[] getState() throws IOException{
		if (!this.isConnected()){
			return null;
		}
		String str = getStateViaString();
		return Sysfs.separateSpace(str);
	}
	
	/**
	 * Reading returns the current stop command. Writing sets the stop command. The value determines the motors behavior when command is set to stop.
	 *  Also, it determines the motors behavior when a run command completes. See stop_commands for a list of possible values.
	 * @return A stop command that listed using <code>getStopCommands()</code>
	 * @throws IOException If I/O goes wrong
	 */
	public String getStopAction() throws IOException{
		if (!this.isConnected()){
			return null;
		}
		return this.getAttribute(SYSFS_PROPERTY_STOP_ACTION);
	}
	
	/**
	 * Reading returns the current stop command. Writing sets the stop command. The value determines the motors behavior when command is set to stop.
	 *  Also, it determines the motors behavior when a run command completes. See stop_commands for a list of possible values.
	 * @param stop_command A stop command that listed using <code>getStopCommands()</code>
	 * @throws IOException If I/O goes wrong
	 */
	public void setStopAction(String stop_action) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_STOP_ACTION, stop_action);
	}
	
	/**
	 * <b>This function returns a string that is likely a "spaced-array".</b><br>
	 * <b>Use this function to directly to return a String array:</b>
	 * <pre>
	 * getStopCommands()
	 * </pre>
	 * Returns a list of stop modes supported by the motor controller. Possible values are coast,
	 *  brake and hold. coast means that power will be removed from the motor and it will freely
	 *   coast to a stop. brake means that power will be removed from the motor and a passive
	 *    electrical load will be placed on the motor. This is usually done by shorting the motor
	 *     terminals together. This load will absorb the energy from the rotation of the motors
	 *      and cause the motor to stop more quickly than coasting. hold does not remove power from
	 *       the motor. Instead it actively try to hold the motor at the current position.
	 *  If an external force tries to turn the motor, the motor will ��push back�� to maintain its position.
	 * @return A list of stop modes supported by the motor controller
	 * @throws IOException If I/O goes wrong
	 */
	public String getStopCommandsViaString() throws IOException{
		if (!this.isConnected()){
			return null;
		}
		return this.getAttribute(SYSFS_PROPERTY_STOP_ACTIONS);
	}
	
	/**
	 * Returns a list of stop modes supported by the motor controller. Possible values are coast,
	 *  brake and hold. coast means that power will be removed from the motor and it will freely
	 *   coast to a stop. brake means that power will be removed from the motor and a passive
	 *    electrical load will be placed on the motor. This is usually done by shorting the motor
	 *     terminals together. This load will absorb the energy from the rotation of the motors
	 *      and cause the motor to stop more quickly than coasting. hold does not remove power from
	 *       the motor. Instead it actively try to hold the motor at the current position.
	 *  If an external force tries to turn the motor, the motor will ��push back�� to maintain its position.
	 * @return A list of stop modes supported by the motor controller
	 * @throws IOException If I/O goes wrong
	 */
	public String[] getStopCommands() throws IOException{
		if (!this.isConnected()){
			return null;
		}
		String str = getStopCommandsViaString();
		return Sysfs.separateSpace(str);
	}
	
	/**
	 * Writing specifies the amount of time the motor will run when using the run-timed command. Reading returns the current value. Units are in milliseconds.
	 * @return Amount of time in ms
	 * @throws IOException If I/O goes wrong
	 */
	public int getTime_SP() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String str = this.getAttribute(SYSFS_PROPERTY_TIME_SP);
		return Integer.parseInt(str);
	}
	
	/**
	 * Writing specifies the amount of time the motor will run when using the run-timed command. Reading returns the current value. Units are in milliseconds.
	 * @param time_sp Amount of time in ms
	 * @throws IOException If I/O goes wrong
	 */
	public void setTime_SP(int time_sp) throws IOException{
		if (!this.isConnected()){
			return;
		}
		this.setAttribute(SYSFS_PROPERTY_TIME_SP, Integer.toString(time_sp));
	}
	
	/**
	 * This returns the maximum speed of the motor with no load at 9V.
	 * @return The maximum speed
	 * @throws IOException If I/O goes wrong
	 */
	public int getMax_Speed() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String str = this.getAttribute(SYSFS_PROPERTY_MAX_SPEED);
		return Integer.parseInt(str);
	}
	
	public int getFullTravelCount() throws IOException{
		if (!this.isConnected()){
			return -1;
		}
		String str = this.getAttribute(SYSFS_PROPERTY_FULL_TRAVEL_COUNT);
		return Integer.parseInt(str);
	}
	
//~autogen
}
//-----------------------------------------------------------------------------