package typingsJapgolly.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to specify the type of Resource which needs to be considered for the API call
  */
trait ResourceType extends js.Object {
  var `type`: String
}

object ResourceType {
  @scala.inline
  def apply(`type`: String): ResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceType]
  }
}

