package typingsJapgolly.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Final state of the test, including error details if necessary.
  */
@js.native
trait SchemaTestStatus extends js.Object {
  /**
    * Error details if applicable.
    */
  var details: js.UndefOr[String] = js.native
  /**
    * Status of the test.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaTestStatus {
  @scala.inline
  def apply(details: String = null, status: String = null): SchemaTestStatus = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestStatus]
  }
}

