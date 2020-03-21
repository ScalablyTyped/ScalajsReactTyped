package typingsJapgolly.mangopay2NodejsSdk.mod

import typingsJapgolly.mangopay2NodejsSdk.mod.address.AddressData
import typingsJapgolly.mangopay2NodejsSdk.mod.models.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingData extends js.Object {
  var Address: typingsJapgolly.mangopay2NodejsSdk.mod.models.Address | AddressData | String
}

object BillingData {
  @scala.inline
  def apply(Address: Address | AddressData | String): BillingData = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BillingData]
  }
}

