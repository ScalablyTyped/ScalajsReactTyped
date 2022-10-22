package typingsJapgolly.winrt.global.Windows.Devices

import typingsJapgolly.winrt.Windows.Devices.Sensors.SimpleOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sensors {
  
  @JSGlobal("Windows.Devices.Sensors.Accelerometer")
  @js.native
  open class Accelerometer ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.Accelerometer {
    
    /* CompleteClass */
    override def getCurrentReading(): typingsJapgolly.winrt.Windows.Devices.Sensors.AccelerometerReading = js.native
    
    /* CompleteClass */
    var minimumReportInterval: Double = js.native
    
    /* CompleteClass */
    var onreadingchanged: Any = js.native
    
    /* CompleteClass */
    var onshaken: Any = js.native
    
    /* CompleteClass */
    var reportInterval: Double = js.native
  }
  /* static members */
  object Accelerometer {
    
    @JSGlobal("Windows.Devices.Sensors.Accelerometer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefault(): typingsJapgolly.winrt.Windows.Devices.Sensors.Accelerometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrt.Windows.Devices.Sensors.Accelerometer]
  }
  
  @JSGlobal("Windows.Devices.Sensors.AccelerometerReading")
  @js.native
  open class AccelerometerReading ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.AccelerometerReading {
    
    /* CompleteClass */
    var accelerationX: Double = js.native
    
    /* CompleteClass */
    var accelerationY: Double = js.native
    
    /* CompleteClass */
    var accelerationZ: Double = js.native
    
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.AccelerometerReadingChangedEventArgs")
  @js.native
  open class AccelerometerReadingChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.AccelerometerReadingChangedEventArgs {
    
    /* CompleteClass */
    var reading: typingsJapgolly.winrt.Windows.Devices.Sensors.AccelerometerReading = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.AccelerometerShakenEventArgs")
  @js.native
  open class AccelerometerShakenEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.AccelerometerShakenEventArgs {
    
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.Compass")
  @js.native
  open class Compass ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.Compass {
    
    /* CompleteClass */
    override def getCurrentReading(): typingsJapgolly.winrt.Windows.Devices.Sensors.CompassReading = js.native
    
    /* CompleteClass */
    var minimumReportInterval: Double = js.native
    
    /* CompleteClass */
    var onreadingchanged: Any = js.native
    
    /* CompleteClass */
    var reportInterval: Double = js.native
  }
  /* static members */
  object Compass {
    
    @JSGlobal("Windows.Devices.Sensors.Compass")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefault(): typingsJapgolly.winrt.Windows.Devices.Sensors.Compass = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrt.Windows.Devices.Sensors.Compass]
  }
  
  @JSGlobal("Windows.Devices.Sensors.CompassReading")
  @js.native
  open class CompassReading ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.CompassReading {
    
    /* CompleteClass */
    var headingMagneticNorth: Double = js.native
    
    /* CompleteClass */
    var headingTrueNorth: Double = js.native
    
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.CompassReadingChangedEventArgs")
  @js.native
  open class CompassReadingChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.CompassReadingChangedEventArgs {
    
    /* CompleteClass */
    var reading: typingsJapgolly.winrt.Windows.Devices.Sensors.CompassReading = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.Gyrometer")
  @js.native
  open class Gyrometer ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.Gyrometer {
    
    /* CompleteClass */
    override def getCurrentReading(): typingsJapgolly.winrt.Windows.Devices.Sensors.GyrometerReading = js.native
    
    /* CompleteClass */
    var minimumReportInterval: Double = js.native
    
    /* CompleteClass */
    var onreadingchanged: Any = js.native
    
    /* CompleteClass */
    var reportInterval: Double = js.native
  }
  /* static members */
  object Gyrometer {
    
    @JSGlobal("Windows.Devices.Sensors.Gyrometer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefault(): typingsJapgolly.winrt.Windows.Devices.Sensors.Gyrometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrt.Windows.Devices.Sensors.Gyrometer]
  }
  
  @JSGlobal("Windows.Devices.Sensors.GyrometerReading")
  @js.native
  open class GyrometerReading ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.GyrometerReading {
    
    /* CompleteClass */
    var angularVelocityX: Double = js.native
    
    /* CompleteClass */
    var angularVelocityY: Double = js.native
    
    /* CompleteClass */
    var angularVelocityZ: Double = js.native
    
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.GyrometerReadingChangedEventArgs")
  @js.native
  open class GyrometerReadingChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.GyrometerReadingChangedEventArgs {
    
    /* CompleteClass */
    var reading: typingsJapgolly.winrt.Windows.Devices.Sensors.GyrometerReading = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.Inclinometer")
  @js.native
  open class Inclinometer ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.Inclinometer {
    
    /* CompleteClass */
    override def getCurrentReading(): typingsJapgolly.winrt.Windows.Devices.Sensors.InclinometerReading = js.native
    
    /* CompleteClass */
    var minimumReportInterval: Double = js.native
    
    /* CompleteClass */
    var onreadingchanged: Any = js.native
    
    /* CompleteClass */
    var reportInterval: Double = js.native
  }
  /* static members */
  object Inclinometer {
    
    @JSGlobal("Windows.Devices.Sensors.Inclinometer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefault(): typingsJapgolly.winrt.Windows.Devices.Sensors.Inclinometer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrt.Windows.Devices.Sensors.Inclinometer]
  }
  
  @JSGlobal("Windows.Devices.Sensors.InclinometerReading")
  @js.native
  open class InclinometerReading ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.InclinometerReading {
    
    /* CompleteClass */
    var pitchDegrees: Double = js.native
    
    /* CompleteClass */
    var rollDegrees: Double = js.native
    
    /* CompleteClass */
    var timestamp: js.Date = js.native
    
    /* CompleteClass */
    var yawDegrees: Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.InclinometerReadingChangedEventArgs")
  @js.native
  open class InclinometerReadingChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.InclinometerReadingChangedEventArgs {
    
    /* CompleteClass */
    var reading: typingsJapgolly.winrt.Windows.Devices.Sensors.InclinometerReading = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.LightSensor")
  @js.native
  open class LightSensor ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.LightSensor {
    
    /* CompleteClass */
    override def getCurrentReading(): typingsJapgolly.winrt.Windows.Devices.Sensors.LightSensorReading = js.native
    
    /* CompleteClass */
    var minimumReportInterval: Double = js.native
    
    /* CompleteClass */
    var onreadingchanged: Any = js.native
    
    /* CompleteClass */
    var reportInterval: Double = js.native
  }
  /* static members */
  object LightSensor {
    
    @JSGlobal("Windows.Devices.Sensors.LightSensor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefault(): typingsJapgolly.winrt.Windows.Devices.Sensors.LightSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrt.Windows.Devices.Sensors.LightSensor]
  }
  
  @JSGlobal("Windows.Devices.Sensors.LightSensorReading")
  @js.native
  open class LightSensorReading ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.LightSensorReading {
    
    /* CompleteClass */
    var illuminanceInLux: Double = js.native
    
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.LightSensorReadingChangedEventArgs")
  @js.native
  open class LightSensorReadingChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.LightSensorReadingChangedEventArgs {
    
    /* CompleteClass */
    var reading: typingsJapgolly.winrt.Windows.Devices.Sensors.LightSensorReading = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.OrientationSensor")
  @js.native
  open class OrientationSensor ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.OrientationSensor {
    
    /* CompleteClass */
    override def getCurrentReading(): typingsJapgolly.winrt.Windows.Devices.Sensors.OrientationSensorReading = js.native
    
    /* CompleteClass */
    var minimumReportInterval: Double = js.native
    
    /* CompleteClass */
    var onreadingchanged: Any = js.native
    
    /* CompleteClass */
    var reportInterval: Double = js.native
  }
  /* static members */
  object OrientationSensor {
    
    @JSGlobal("Windows.Devices.Sensors.OrientationSensor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefault(): typingsJapgolly.winrt.Windows.Devices.Sensors.OrientationSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrt.Windows.Devices.Sensors.OrientationSensor]
  }
  
  @JSGlobal("Windows.Devices.Sensors.OrientationSensorReading")
  @js.native
  open class OrientationSensorReading ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.OrientationSensorReading {
    
    /* CompleteClass */
    var quaternion: typingsJapgolly.winrt.Windows.Devices.Sensors.SensorQuaternion = js.native
    
    /* CompleteClass */
    var rotationMatrix: typingsJapgolly.winrt.Windows.Devices.Sensors.SensorRotationMatrix = js.native
    
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.OrientationSensorReadingChangedEventArgs")
  @js.native
  open class OrientationSensorReadingChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.OrientationSensorReadingChangedEventArgs {
    
    /* CompleteClass */
    var reading: typingsJapgolly.winrt.Windows.Devices.Sensors.OrientationSensorReading = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.SensorQuaternion")
  @js.native
  open class SensorQuaternion ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.SensorQuaternion {
    
    /* CompleteClass */
    var w: Double = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
    
    /* CompleteClass */
    var z: Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.SensorRotationMatrix")
  @js.native
  open class SensorRotationMatrix ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.SensorRotationMatrix {
    
    /* CompleteClass */
    var m11: Double = js.native
    
    /* CompleteClass */
    var m12: Double = js.native
    
    /* CompleteClass */
    var m13: Double = js.native
    
    /* CompleteClass */
    var m21: Double = js.native
    
    /* CompleteClass */
    var m22: Double = js.native
    
    /* CompleteClass */
    var m23: Double = js.native
    
    /* CompleteClass */
    var m31: Double = js.native
    
    /* CompleteClass */
    var m32: Double = js.native
    
    /* CompleteClass */
    var m33: Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.SimpleOrientation")
  @js.native
  object SimpleOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Devices.Sensors.SimpleOrientation & Double] = js.native
    
    /* 5 */ val facedown: typingsJapgolly.winrt.Windows.Devices.Sensors.SimpleOrientation.facedown & Double = js.native
    
    /* 4 */ val faceup: typingsJapgolly.winrt.Windows.Devices.Sensors.SimpleOrientation.faceup & Double = js.native
    
    /* 0 */ val notRotated: typingsJapgolly.winrt.Windows.Devices.Sensors.SimpleOrientation.notRotated & Double = js.native
    
    /* 2 */ val rotated180DegreesCounterclockwise: typingsJapgolly.winrt.Windows.Devices.Sensors.SimpleOrientation.rotated180DegreesCounterclockwise & Double = js.native
    
    /* 3 */ val rotated270DegreesCounterclockwise: typingsJapgolly.winrt.Windows.Devices.Sensors.SimpleOrientation.rotated270DegreesCounterclockwise & Double = js.native
    
    /* 1 */ val rotated90DegreesCounterclockwise: typingsJapgolly.winrt.Windows.Devices.Sensors.SimpleOrientation.rotated90DegreesCounterclockwise & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
  @js.native
  open class SimpleOrientationSensor ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.SimpleOrientationSensor {
    
    /* CompleteClass */
    override def getCurrentOrientation(): SimpleOrientation = js.native
    
    /* CompleteClass */
    var onorientationchanged: Any = js.native
  }
  /* static members */
  object SimpleOrientationSensor {
    
    @JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDefault(): typingsJapgolly.winrt.Windows.Devices.Sensors.SimpleOrientationSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrt.Windows.Devices.Sensors.SimpleOrientationSensor]
  }
  
  @JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensorOrientationChangedEventArgs")
  @js.native
  open class SimpleOrientationSensorOrientationChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Sensors.SimpleOrientationSensorOrientationChangedEventArgs {
    
    /* CompleteClass */
    var orientation: SimpleOrientation = js.native
    
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
}
