package typingsJapgolly.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * The unique ID of the publishing destination.
    */
  var DestinationId: String = js.native
  /**
    * The type of resource used for the publishing destination. Currently, only S3 is supported.
    */
  var DestinationType: typingsJapgolly.awsSdk.guarddutyMod.DestinationType = js.native
  /**
    * The status of the publishing destination.
    */
  var Status: PublishingStatus = js.native
}

object Destination {
  @scala.inline
  def apply(DestinationId: String, DestinationType: DestinationType, Status: PublishingStatus): Destination = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Destination]
  }
}

