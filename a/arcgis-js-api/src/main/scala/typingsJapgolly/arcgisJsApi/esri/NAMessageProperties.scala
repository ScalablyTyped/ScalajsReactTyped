package typingsJapgolly.arcgisJsApi.esri

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

trait NAMessageProperties extends js.Object {
  /**
    * A description of the network analyst message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-NAMessage.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The network analyst message type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-NAMessage.html#type)
    */
  var `type`: js.UndefOr[
    informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort
  ] = js.undefined
}

object NAMessageProperties {
  @scala.inline
  def apply(
    description: String = null,
    `type`: informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort = null
  ): NAMessageProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NAMessageProperties]
  }
}

