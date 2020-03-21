package typingsJapgolly.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSuppressedDestinationResponse extends js.Object {
  /**
    * An object containing information about the suppressed email address.
    */
  var SuppressedDestination: typingsJapgolly.awsSdk.sesv2Mod.SuppressedDestination = js.native
}

object GetSuppressedDestinationResponse {
  @scala.inline
  def apply(SuppressedDestination: SuppressedDestination): GetSuppressedDestinationResponse = {
    val __obj = js.Dynamic.literal(SuppressedDestination = SuppressedDestination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSuppressedDestinationResponse]
  }
}

