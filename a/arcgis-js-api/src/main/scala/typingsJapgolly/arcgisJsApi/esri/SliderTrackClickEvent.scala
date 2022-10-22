package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`track-click`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderTrackClickEvent extends StObject {
  
  var `type`: `track-click`
  
  var value: Double
}
object SliderTrackClickEvent {
  
  inline def apply(value: Double): SliderTrackClickEvent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("track-click")
    __obj.asInstanceOf[SliderTrackClickEvent]
  }
  
  extension [Self <: SliderTrackClickEvent](x: Self) {
    
    inline def setType(value: `track-click`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
