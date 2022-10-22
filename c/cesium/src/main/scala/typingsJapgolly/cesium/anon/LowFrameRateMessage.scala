package typingsJapgolly.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LowFrameRateMessage extends StObject {
  
  var container: org.scalajs.dom.Element | String
  
  var lowFrameRateMessage: js.UndefOr[String] = js.undefined
  
  var scene: typingsJapgolly.cesium.mod.Scene
}
object LowFrameRateMessage {
  
  inline def apply(container: org.scalajs.dom.Element | String, scene: typingsJapgolly.cesium.mod.Scene): LowFrameRateMessage = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowFrameRateMessage]
  }
  
  extension [Self <: LowFrameRateMessage](x: Self) {
    
    inline def setContainer(value: org.scalajs.dom.Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setLowFrameRateMessage(value: String): Self = StObject.set(x, "lowFrameRateMessage", value.asInstanceOf[js.Any])
    
    inline def setLowFrameRateMessageUndefined: Self = StObject.set(x, "lowFrameRateMessage", js.undefined)
    
    inline def setScene(value: typingsJapgolly.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
