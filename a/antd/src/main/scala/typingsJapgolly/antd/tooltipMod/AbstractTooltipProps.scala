package typingsJapgolly.antd.tooltipMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.placementsMod.AdjustOverflow
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractTooltipProps extends js.Object {
  var align: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ js.Any
  ] = js.undefined
  var arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined
  var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.undefined
  var builtinPlacements: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
  ] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultVisible: js.UndefOr[Boolean] = js.undefined
  /** Internal. Hide tooltip when hidden. This will be renamed in future. */
  var destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var getTooltipContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var mouseEnterDelay: js.UndefOr[Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var openClassName: js.UndefOr[String] = js.undefined
  var overlayClassName: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var placement: js.UndefOr[TooltipPlacement] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ js.Any
  ] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AbstractTooltipProps {
  @scala.inline
  def apply(
    align: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ js.Any = null,
    arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined,
    autoAdjustOverflow: Boolean | AdjustOverflow = null,
    builtinPlacements: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any = null,
    children: VdomNode = null,
    className: String = null,
    defaultVisible: js.UndefOr[Boolean] = js.undefined,
    destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    getTooltipContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onVisibleChange: /* visible */ Boolean => Callback = null,
    openClassName: String = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: TooltipPlacement = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    transitionName: String = null,
    trigger: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AbstractTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter.asInstanceOf[js.Any])
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyTooltipOnHide)) __obj.updateDynamic("destroyTooltipOnHide")(destroyTooltipOnHide.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getTooltipContainer(t0).runNow()))
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onVisibleChange(t0).runNow()))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractTooltipProps]
  }
}

