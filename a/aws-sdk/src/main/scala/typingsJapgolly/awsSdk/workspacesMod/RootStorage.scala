package typingsJapgolly.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootStorage extends js.Object {
  /**
    * The size of the root volume.
    */
  var Capacity: js.UndefOr[NonEmptyString] = js.native
}

object RootStorage {
  @scala.inline
  def apply(Capacity: NonEmptyString = null): RootStorage = {
    val __obj = js.Dynamic.literal()
    if (Capacity != null) __obj.updateDynamic("Capacity")(Capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootStorage]
  }
}

