package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RetrieveEmployeeResponse")
@js.native
class RetrieveEmployeeResponse () extends js.Object {
  /**
    * The response object.
    */
  var employee: js.UndefOr[Employee] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}

