package typingsJapgolly.backlogJs.mod.Option.Group

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchGroupParams extends js.Object {
  var members: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object PatchGroupParams {
  @scala.inline
  def apply(members: js.Array[String] = null, name: String = null): PatchGroupParams = {
    val __obj = js.Dynamic.literal()
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchGroupParams]
  }
}

