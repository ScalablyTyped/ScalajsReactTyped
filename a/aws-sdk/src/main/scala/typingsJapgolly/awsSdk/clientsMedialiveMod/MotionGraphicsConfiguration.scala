package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionGraphicsConfiguration extends StObject {
  
  var MotionGraphicsInsertion: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.MotionGraphicsInsertion] = js.undefined
  
  /**
    * Motion Graphics Settings
    */
  var MotionGraphicsSettings: typingsJapgolly.awsSdk.clientsMedialiveMod.MotionGraphicsSettings
}
object MotionGraphicsConfiguration {
  
  inline def apply(MotionGraphicsSettings: MotionGraphicsSettings): MotionGraphicsConfiguration = {
    val __obj = js.Dynamic.literal(MotionGraphicsSettings = MotionGraphicsSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionGraphicsConfiguration]
  }
  
  extension [Self <: MotionGraphicsConfiguration](x: Self) {
    
    inline def setMotionGraphicsInsertion(value: MotionGraphicsInsertion): Self = StObject.set(x, "MotionGraphicsInsertion", value.asInstanceOf[js.Any])
    
    inline def setMotionGraphicsInsertionUndefined: Self = StObject.set(x, "MotionGraphicsInsertion", js.undefined)
    
    inline def setMotionGraphicsSettings(value: MotionGraphicsSettings): Self = StObject.set(x, "MotionGraphicsSettings", value.asInstanceOf[js.Any])
  }
}
