package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`dash-dot`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot-dot`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`long-dash`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot-dot`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`short-dash`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`short-dot`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.dash
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.dot
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineStylePattern3DProperties extends StObject {
  
  /**
    * The pattern style.
    *
    * @default solid
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-LineStylePattern3D.html#style)
    */
  var style: js.UndefOr[
    dash | `dash-dot` | dot | `long-dash` | `long-dash-dot` | `long-dash-dot-dot` | none_ | `short-dash` | `short-dash-dot` | `short-dash-dot-dot` | `short-dot` | solid
  ] = js.undefined
}
object LineStylePattern3DProperties {
  
  inline def apply(): LineStylePattern3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStylePattern3DProperties]
  }
  
  extension [Self <: LineStylePattern3DProperties](x: Self) {
    
    inline def setStyle(
      value: dash | `dash-dot` | dot | `long-dash` | `long-dash-dot` | `long-dash-dot-dot` | none_ | `short-dash` | `short-dash-dot` | `short-dash-dot-dot` | `short-dot` | solid
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
