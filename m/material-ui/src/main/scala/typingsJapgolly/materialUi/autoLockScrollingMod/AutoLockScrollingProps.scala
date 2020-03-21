package typingsJapgolly.materialUi.autoLockScrollingMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoLockScrollingProps extends Props[AutoLockScrolling] {
  var lock: Boolean
}

object AutoLockScrollingProps {
  @scala.inline
  def apply(
    lock: Boolean,
    children: VdomNode = null,
    key: Key = null,
    ref: LegacyRef[AutoLockScrolling] = null
  ): AutoLockScrollingProps = {
    val __obj = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoLockScrollingProps]
  }
}

