package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "UpdateCustomerResponse")
@js.native
class UpdateCustomerResponse () extends js.Object {
  /**
    * The updated customer.
    */
  var customer: js.UndefOr[Customer] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}

