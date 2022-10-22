package typingsJapgolly.svelteLeafletjs.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.leaflet.mod.ControlPosition
import typingsJapgolly.leaflet.mod.Control_.Scale
import typingsJapgolly.leaflet.mod.Control_.ScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScaleControl extends StObject {
  
  var getScaleControl: js.UndefOr[js.Function0[Scale]] = js.undefined
  
  var options: js.UndefOr[ScaleOptions] = js.undefined
  
  var position: js.UndefOr[ControlPosition] = js.undefined
}
object GetScaleControl {
  
  inline def apply(): GetScaleControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetScaleControl]
  }
  
  extension [Self <: GetScaleControl](x: Self) {
    
    inline def setGetScaleControl(value: CallbackTo[Scale]): Self = StObject.set(x, "getScaleControl", value.toJsFn)
    
    inline def setGetScaleControlUndefined: Self = StObject.set(x, "getScaleControl", js.undefined)
    
    inline def setOptions(value: ScaleOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
