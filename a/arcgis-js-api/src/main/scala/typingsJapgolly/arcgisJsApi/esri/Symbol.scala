package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`label-3d`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`line-3d`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`mesh-3d`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`picture-fill`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`point-3d`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`polygon-3d`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`shield-label-symbol`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-line`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-marker`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`web-style`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.cim
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The color of the symbol.
    *
    * @default black
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
    */
  var color: Color_ = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#type)
    */
  val `type`: `simple-marker` | `picture-marker` | `simple-line` | `simple-fill` | `picture-fill` | text | `shield-label-symbol` | `point-3d` | `line-3d` | `polygon-3d` | `web-style` | `mesh-3d` | `label-3d` | cim = js.native
}
