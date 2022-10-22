package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.attachments
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.custom_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.expression
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.fields
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.media
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content_
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-Content.html#type)
    */
  val `type`: text | fields | media | attachments | custom_ | expression = js.native
}
