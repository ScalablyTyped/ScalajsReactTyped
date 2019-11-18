package typingsJapgolly.materialDashUi.internalClearFixMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.Key
import typingsJapgolly.react.reactMod.LegacyRef
import typingsJapgolly.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearFixProps extends Props[ClearFix] {
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ClearFixProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    key: Key = null,
    ref: LegacyRef[ClearFix] = null,
    style: CSSProperties = null
  ): ClearFixProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearFixProps]
  }
}

