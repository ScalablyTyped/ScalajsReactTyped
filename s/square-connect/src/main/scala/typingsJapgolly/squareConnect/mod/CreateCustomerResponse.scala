package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateCustomerResponse")
@js.native
class CreateCustomerResponse () extends js.Object {
  /**
    * The created customer.
    */
  var customer: js.UndefOr[Customer] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}

