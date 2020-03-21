package typingsJapgolly.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAdditionalAssignmentsForHITRequest extends js.Object {
  /**
    * The ID of the HIT to extend.
    */
  var HITId: EntityId = js.native
  /**
    * The number of additional assignments to request for this HIT.
    */
  var NumberOfAdditionalAssignments: Integer = js.native
  /**
    *  A unique identifier for this request, which allows you to retry the call on error without extending the HIT multiple times. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the extend HIT already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return an error with a message containing the request ID. 
    */
  var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.native
}

object CreateAdditionalAssignmentsForHITRequest {
  @scala.inline
  def apply(
    HITId: EntityId,
    NumberOfAdditionalAssignments: Integer,
    UniqueRequestToken: IdempotencyToken = null
  ): CreateAdditionalAssignmentsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any], NumberOfAdditionalAssignments = NumberOfAdditionalAssignments.asInstanceOf[js.Any])
    if (UniqueRequestToken != null) __obj.updateDynamic("UniqueRequestToken")(UniqueRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAdditionalAssignmentsForHITRequest]
  }
}

