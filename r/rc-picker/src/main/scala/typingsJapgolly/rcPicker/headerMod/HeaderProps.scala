package typingsJapgolly.rcPicker.headerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var nextIcon: js.UndefOr[Node] = js.undefined
  /** Next one step */
  var onNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Last one step */
  var onPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Next multiple steps */
  var onSuperNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Last multiple steps */
  var onSuperPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prefixCls: String
  var prevIcon: js.UndefOr[Node] = js.undefined
  var superNextIcon: js.UndefOr[Node] = js.undefined
  var superPrevIcon: js.UndefOr[Node] = js.undefined
}

object HeaderProps {
  @scala.inline
  def apply(
    prefixCls: String,
    children: VdomNode = null,
    nextIcon: VdomNode = null,
    onNext: js.UndefOr[Callback] = js.undefined,
    onPrev: js.UndefOr[Callback] = js.undefined,
    onSuperNext: js.UndefOr[Callback] = js.undefined,
    onSuperPrev: js.UndefOr[Callback] = js.undefined,
    prevIcon: VdomNode = null,
    superNextIcon: VdomNode = null,
    superPrevIcon: VdomNode = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.rawNode.asInstanceOf[js.Any])
    onNext.foreach(p => __obj.updateDynamic("onNext")(p.toJsFn))
    onPrev.foreach(p => __obj.updateDynamic("onPrev")(p.toJsFn))
    onSuperNext.foreach(p => __obj.updateDynamic("onSuperNext")(p.toJsFn))
    onSuperPrev.foreach(p => __obj.updateDynamic("onSuperPrev")(p.toJsFn))
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.rawNode.asInstanceOf[js.Any])
    if (superNextIcon != null) __obj.updateDynamic("superNextIcon")(superNextIcon.rawNode.asInstanceOf[js.Any])
    if (superPrevIcon != null) __obj.updateDynamic("superPrevIcon")(superPrevIcon.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
}

