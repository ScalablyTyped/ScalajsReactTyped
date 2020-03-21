package typingsJapgolly.reactHeadroom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactHeadroomProps extends js.Object {
  var calcHeightOnResize: js.UndefOr[Boolean] = js.undefined
  var children: Node
  var className: js.UndefOr[String] = js.undefined
  var disable: js.UndefOr[Boolean] = js.undefined
  var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
  var downTolerance: js.UndefOr[Double] = js.undefined
  var onPin: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onUnfix: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onUnpin: js.UndefOr[js.Function0[Unit]] = js.undefined
  var parent: js.UndefOr[js.Function0[_]] = js.undefined
  var pinStart: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var upTolerance: js.UndefOr[Double] = js.undefined
  var wrapperStyle: js.UndefOr[CSSProperties] = js.undefined
}

object ReactHeadroomProps {
  @scala.inline
  def apply(
    calcHeightOnResize: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    downTolerance: Int | Double = null,
    onPin: js.UndefOr[Callback] = js.undefined,
    onUnfix: js.UndefOr[Callback] = js.undefined,
    onUnpin: js.UndefOr[Callback] = js.undefined,
    parent: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    pinStart: Int | Double = null,
    style: CSSProperties = null,
    upTolerance: Int | Double = null,
    wrapperStyle: CSSProperties = null
  ): ReactHeadroomProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calcHeightOnResize)) __obj.updateDynamic("calcHeightOnResize")(calcHeightOnResize.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.asInstanceOf[js.Any])
    if (downTolerance != null) __obj.updateDynamic("downTolerance")(downTolerance.asInstanceOf[js.Any])
    onPin.foreach(p => __obj.updateDynamic("onPin")(p.toJsFn))
    onUnfix.foreach(p => __obj.updateDynamic("onUnfix")(p.toJsFn))
    onUnpin.foreach(p => __obj.updateDynamic("onUnpin")(p.toJsFn))
    parent.foreach(p => __obj.updateDynamic("parent")(p.toJsFn))
    if (pinStart != null) __obj.updateDynamic("pinStart")(pinStart.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (upTolerance != null) __obj.updateDynamic("upTolerance")(upTolerance.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactHeadroomProps]
  }
}

