package typingsJapgolly.popmotionPose.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionProps extends StObject {
  
  var dimensions: Dimensions
  
  var from: String | Double
  
  var key: String
  
  var prevPoseKey: String
  
  var to: String | Double
  
  var velocity: Double
}
object TransitionProps {
  
  inline def apply(
    dimensions: Dimensions,
    from: String | Double,
    key: String,
    prevPoseKey: String,
    to: String | Double,
    velocity: Double
  ): TransitionProps = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], prevPoseKey = prevPoseKey.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProps]
  }
  
  extension [Self <: TransitionProps](x: Self) {
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPrevPoseKey(value: String): Self = StObject.set(x, "prevPoseKey", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String | Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
