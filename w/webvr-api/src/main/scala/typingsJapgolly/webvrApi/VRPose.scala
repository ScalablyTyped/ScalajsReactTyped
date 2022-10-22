package typingsJapgolly.webvrApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VRPose extends StObject {
  
  val angularAcceleration: js.typedarray.Float32Array | Null
  
  val angularVelocity: js.typedarray.Float32Array | Null
  
  val linearAcceleration: js.typedarray.Float32Array | Null
  
  val linearVelocity: js.typedarray.Float32Array | Null
  
  val orientation: js.typedarray.Float32Array | Null
  
  val position: js.typedarray.Float32Array | Null
  
  val timestamp: Double
}
object VRPose {
  
  inline def apply(timestamp: Double): VRPose = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], angularAcceleration = null, angularVelocity = null, linearAcceleration = null, linearVelocity = null, orientation = null, position = null)
    __obj.asInstanceOf[VRPose]
  }
  
  extension [Self <: VRPose](x: Self) {
    
    inline def setAngularAcceleration(value: js.typedarray.Float32Array): Self = StObject.set(x, "angularAcceleration", value.asInstanceOf[js.Any])
    
    inline def setAngularAccelerationNull: Self = StObject.set(x, "angularAcceleration", null)
    
    inline def setAngularVelocity(value: js.typedarray.Float32Array): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
    
    inline def setAngularVelocityNull: Self = StObject.set(x, "angularVelocity", null)
    
    inline def setLinearAcceleration(value: js.typedarray.Float32Array): Self = StObject.set(x, "linearAcceleration", value.asInstanceOf[js.Any])
    
    inline def setLinearAccelerationNull: Self = StObject.set(x, "linearAcceleration", null)
    
    inline def setLinearVelocity(value: js.typedarray.Float32Array): Self = StObject.set(x, "linearVelocity", value.asInstanceOf[js.Any])
    
    inline def setLinearVelocityNull: Self = StObject.set(x, "linearVelocity", null)
    
    inline def setOrientation(value: js.typedarray.Float32Array): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    inline def setPosition(value: js.typedarray.Float32Array): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
