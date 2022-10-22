package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`object`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.extrude
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.fill
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.icon
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.line
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.path
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.text
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.water
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol3DLayer
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The 3D symbol layer type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html#type)
    */
  val `type`: icon | `object` | line | path | fill | water | extrude | text = js.native
}
