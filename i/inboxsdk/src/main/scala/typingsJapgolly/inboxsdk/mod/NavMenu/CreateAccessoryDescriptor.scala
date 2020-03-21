package typingsJapgolly.inboxsdk.mod.NavMenu

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.CREATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccessoryDescriptor extends js.Object {
  var `type`: CREATE
  def onClick(): Unit
}

object CreateAccessoryDescriptor {
  @scala.inline
  def apply(onClick: Callback, `type`: CREATE): CreateAccessoryDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessoryDescriptor]
  }
}

