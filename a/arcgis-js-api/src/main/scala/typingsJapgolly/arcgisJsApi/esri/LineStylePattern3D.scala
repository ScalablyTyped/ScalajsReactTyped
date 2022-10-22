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
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineStylePattern3D
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The pattern style.
    *
    * @default solid
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-LineStylePattern3D.html#style)
    */
  var style: dash | `dash-dot` | dot | `long-dash` | `long-dash-dot` | `long-dash-dot-dot` | none_ | `short-dash` | `short-dash-dot` | `short-dash-dot-dot` | `short-dot` | solid = js.native
  
  /**
    * The pattern type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-LineStylePattern3D.html#type)
    */
  val `type`: style = js.native
}
