package typingsJapgolly.reactTypingAnimation.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypingProps extends js.Object {
  var children: Node
  var className: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[Node] = js.undefined
  var cursorClassName: js.UndefOr[String] = js.undefined
  var hideCursor: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var onAfterType: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBeforeType: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFinishedTyping: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onStartedTyping: js.UndefOr[js.Function0[Unit]] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var startDelay: js.UndefOr[Double] = js.undefined
}

object TypingProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    className: String = null,
    cursor: VdomNode = null,
    cursorClassName: String = null,
    hideCursor: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    onAfterType: js.UndefOr[Callback] = js.undefined,
    onBeforeType: js.UndefOr[Callback] = js.undefined,
    onFinishedTyping: js.UndefOr[Callback] = js.undefined,
    onStartedTyping: js.UndefOr[Callback] = js.undefined,
    speed: Int | Double = null,
    startDelay: Int | Double = null
  ): TypingProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.rawNode.asInstanceOf[js.Any])
    if (cursorClassName != null) __obj.updateDynamic("cursorClassName")(cursorClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCursor)) __obj.updateDynamic("hideCursor")(hideCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    onAfterType.foreach(p => __obj.updateDynamic("onAfterType")(p.toJsFn))
    onBeforeType.foreach(p => __obj.updateDynamic("onBeforeType")(p.toJsFn))
    onFinishedTyping.foreach(p => __obj.updateDynamic("onFinishedTyping")(p.toJsFn))
    onStartedTyping.foreach(p => __obj.updateDynamic("onStartedTyping")(p.toJsFn))
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingProps]
  }
}

