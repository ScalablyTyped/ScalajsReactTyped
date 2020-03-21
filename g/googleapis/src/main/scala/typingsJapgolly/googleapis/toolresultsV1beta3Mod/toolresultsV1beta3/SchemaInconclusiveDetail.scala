package typingsJapgolly.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInconclusiveDetail extends js.Object {
  /**
    * If the end user aborted the test execution before a pass or fail could be
    * determined. For example, the user pressed ctrl-c which sent a kill signal
    * to the test runner while the test was running.
    */
  var abortedByUser: js.UndefOr[Boolean] = js.native
  /**
    * If the test runner could not determine success or failure because the
    * test depends on a component other than the system under test which
    * failed.  For example, a mobile test requires provisioning a device where
    * the test executes, and that provisioning can fail.
    */
  var infrastructureFailure: js.UndefOr[Boolean] = js.native
}

object SchemaInconclusiveDetail {
  @scala.inline
  def apply(
    abortedByUser: js.UndefOr[Boolean] = js.undefined,
    infrastructureFailure: js.UndefOr[Boolean] = js.undefined
  ): SchemaInconclusiveDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortedByUser)) __obj.updateDynamic("abortedByUser")(abortedByUser.asInstanceOf[js.Any])
    if (!js.isUndefined(infrastructureFailure)) __obj.updateDynamic("infrastructureFailure")(infrastructureFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInconclusiveDetail]
  }
}

