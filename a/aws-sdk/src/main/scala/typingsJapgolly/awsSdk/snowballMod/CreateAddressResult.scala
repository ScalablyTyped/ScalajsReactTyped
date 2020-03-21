package typingsJapgolly.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAddressResult extends js.Object {
  /**
    * The automatically generated ID for a specific address. You'll use this ID when you create a job to specify which address you want the Snowball for that job shipped to.
    */
  var AddressId: js.UndefOr[String] = js.native
}

object CreateAddressResult {
  @scala.inline
  def apply(AddressId: String = null): CreateAddressResult = {
    val __obj = js.Dynamic.literal()
    if (AddressId != null) __obj.updateDynamic("AddressId")(AddressId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAddressResult]
  }
}

