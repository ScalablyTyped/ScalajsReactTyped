package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyOptionGroupResult extends js.Object {
  var OptionGroup: js.UndefOr[typingsJapgolly.awsSdk.rdsMod.OptionGroup] = js.native
}

object CopyOptionGroupResult {
  @scala.inline
  def apply(OptionGroup: OptionGroup = null): CopyOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    if (OptionGroup != null) __obj.updateDynamic("OptionGroup")(OptionGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyOptionGroupResult]
  }
}

