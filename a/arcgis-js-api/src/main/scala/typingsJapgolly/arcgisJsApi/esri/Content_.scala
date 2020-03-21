package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.attachments
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.fields
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.media
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content_
  extends Accessor
     with JSONSupport {
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-Content.html#type)
    */
  val `type`: text | fields | media | attachments = js.native
}

@JSGlobal("__esri.Content")
@js.native
object Content_ extends TopLevel[ContentConstructor]

