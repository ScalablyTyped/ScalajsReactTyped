package typingsJapgolly.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestMessageLogDetails extends js.Object {
  /**
    * Date when the resource is created
    */
  var dateCreated: js.Date
  /**
    * Id of the resource
    */
  var entryId: Double
  /**
    * Message of the resource
    */
  var message: String
}

object TestMessageLogDetails {
  @scala.inline
  def apply(dateCreated: js.Date, entryId: Double, message: String): TestMessageLogDetails = {
    val __obj = js.Dynamic.literal(dateCreated = dateCreated.asInstanceOf[js.Any], entryId = entryId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestMessageLogDetails]
  }
}

