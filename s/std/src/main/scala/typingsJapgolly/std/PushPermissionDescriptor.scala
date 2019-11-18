package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushPermissionDescriptor extends PermissionDescriptor {
  @JSName("name")
  var name_PushPermissionDescriptor: push
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object PushPermissionDescriptor {
  @scala.inline
  def apply(name: push, userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined): PushPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(userVisibleOnly)) __obj.updateDynamic("userVisibleOnly")(userVisibleOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushPermissionDescriptor]
  }
}

