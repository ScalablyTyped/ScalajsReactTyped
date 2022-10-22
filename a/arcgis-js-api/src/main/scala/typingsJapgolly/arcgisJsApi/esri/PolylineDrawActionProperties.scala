package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.click
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.freehand
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hybrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineDrawActionProperties
  extends StObject
     with DrawActionProperties {
  
  /**
    * The drawing mode.
    *
    * @default hybrid
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#mode)
    */
  var mode: js.UndefOr[hybrid | freehand | click] = js.undefined
}
object PolylineDrawActionProperties {
  
  inline def apply(): PolylineDrawActionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineDrawActionProperties]
  }
  
  extension [Self <: PolylineDrawActionProperties](x: Self) {
    
    inline def setMode(value: hybrid | freehand | click): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
