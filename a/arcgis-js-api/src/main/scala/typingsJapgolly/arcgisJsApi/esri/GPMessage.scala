package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`process-definition`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`process-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`process-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.abort
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.empty
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.error
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.informative
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPMessage
  extends Accessor
     with JSONSupport {
  /**
    * The geoprocessing message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#description)
    */
  var description: String = js.native
  /**
    * The geoprocessing message type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#type)
    */
  var `type`: informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort = js.native
}

@JSGlobal("__esri.GPMessage")
@js.native
object GPMessage extends TopLevel[GPMessageConstructor]

