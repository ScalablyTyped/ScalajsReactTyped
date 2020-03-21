package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonPrefix extends js.Object {
  /**
    * Container for the specified common prefix.
    */
  var Prefix: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.Prefix] = js.native
}

object CommonPrefix {
  @scala.inline
  def apply(Prefix: Prefix = null): CommonPrefix = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonPrefix]
  }
}

