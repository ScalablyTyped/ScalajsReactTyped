package typingsJapgolly.reactCollapsible

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactCollapsible.reactCollapsibleStrings.auto
import typingsJapgolly.reactCollapsible.reactCollapsibleStrings.hidden
import typingsJapgolly.reactCollapsible.reactCollapsibleStrings.inherit
import typingsJapgolly.reactCollapsible.reactCollapsibleStrings.initial
import typingsJapgolly.reactCollapsible.reactCollapsibleStrings.scroll
import typingsJapgolly.reactCollapsible.reactCollapsibleStrings.unset
import typingsJapgolly.reactCollapsible.reactCollapsibleStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleProps
  extends AllHTMLAttributes[Collapsible]
     with ClassAttributes[Collapsible] {
  var accordionPosition: js.UndefOr[String | Double] = js.undefined
  var classParentString: js.UndefOr[String] = js.undefined
  var contentContainerTagName: js.UndefOr[String] = js.undefined
  var contentInnerClassName: js.UndefOr[String] = js.undefined
  var contentOuterClassName: js.UndefOr[String] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var handleTriggerClick: js.UndefOr[js.Function1[/* accordionPosition */ js.UndefOr[String | Double], Unit]] = js.undefined
  var lazyRender: js.UndefOr[Boolean] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onClosing: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpening: js.UndefOr[js.Function0[Unit]] = js.undefined
  var openedClassName: js.UndefOr[String] = js.undefined
  var overflowWhenOpen: js.UndefOr[hidden | visible | auto | scroll | inherit | initial | unset] = js.undefined
  var transitionCloseTime: js.UndefOr[Double | Null] = js.undefined
  var transitionTime: js.UndefOr[Double] = js.undefined
  var trigger: String | Element
  var triggerClassName: js.UndefOr[String] = js.undefined
  var triggerDisabled: js.UndefOr[Boolean] = js.undefined
  var triggerOpenedClassName: js.UndefOr[String] = js.undefined
  var triggerSibling: js.UndefOr[Element] = js.undefined
  var triggerStyle: js.UndefOr[Null | js.Object] = js.undefined
  var triggerTagName: js.UndefOr[String] = js.undefined
  var triggerWhenOpen: js.UndefOr[String | Element] = js.undefined
}

object CollapsibleProps {
  @scala.inline
  def apply(
    trigger: String | Element,
    AllHTMLAttributes: AllHTMLAttributes[Collapsible] = null,
    ClassAttributes: ClassAttributes[Collapsible] = null,
    accordionPosition: String | Double = null,
    classParentString: String = null,
    contentContainerTagName: String = null,
    contentInnerClassName: String = null,
    contentOuterClassName: String = null,
    easing: String = null,
    handleTriggerClick: /* accordionPosition */ js.UndefOr[String | Double] => Callback = null,
    lazyRender: js.UndefOr[Boolean] = js.undefined,
    onClose: js.UndefOr[Callback] = js.undefined,
    onClosing: js.UndefOr[Callback] = js.undefined,
    onOpen: js.UndefOr[Callback] = js.undefined,
    onOpening: js.UndefOr[Callback] = js.undefined,
    openedClassName: String = null,
    overflowWhenOpen: hidden | visible | auto | scroll | inherit | initial | unset = null,
    transitionCloseTime: Int | Double = null,
    transitionTime: Int | Double = null,
    triggerClassName: String = null,
    triggerDisabled: js.UndefOr[Boolean] = js.undefined,
    triggerOpenedClassName: String = null,
    triggerSibling: VdomElement = null,
    triggerStyle: js.Object = null,
    triggerTagName: String = null,
    triggerWhenOpen: String | Element = null
  ): CollapsibleProps = {
    val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (accordionPosition != null) __obj.updateDynamic("accordionPosition")(accordionPosition.asInstanceOf[js.Any])
    if (classParentString != null) __obj.updateDynamic("classParentString")(classParentString.asInstanceOf[js.Any])
    if (contentContainerTagName != null) __obj.updateDynamic("contentContainerTagName")(contentContainerTagName.asInstanceOf[js.Any])
    if (contentInnerClassName != null) __obj.updateDynamic("contentInnerClassName")(contentInnerClassName.asInstanceOf[js.Any])
    if (contentOuterClassName != null) __obj.updateDynamic("contentOuterClassName")(contentOuterClassName.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (handleTriggerClick != null) __obj.updateDynamic("handleTriggerClick")(js.Any.fromFunction1((t0: /* accordionPosition */ js.UndefOr[java.lang.String | scala.Double]) => handleTriggerClick(t0).runNow()))
    if (!js.isUndefined(lazyRender)) __obj.updateDynamic("lazyRender")(lazyRender.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onClosing.foreach(p => __obj.updateDynamic("onClosing")(p.toJsFn))
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    onOpening.foreach(p => __obj.updateDynamic("onOpening")(p.toJsFn))
    if (openedClassName != null) __obj.updateDynamic("openedClassName")(openedClassName.asInstanceOf[js.Any])
    if (overflowWhenOpen != null) __obj.updateDynamic("overflowWhenOpen")(overflowWhenOpen.asInstanceOf[js.Any])
    if (transitionCloseTime != null) __obj.updateDynamic("transitionCloseTime")(transitionCloseTime.asInstanceOf[js.Any])
    if (transitionTime != null) __obj.updateDynamic("transitionTime")(transitionTime.asInstanceOf[js.Any])
    if (triggerClassName != null) __obj.updateDynamic("triggerClassName")(triggerClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerDisabled)) __obj.updateDynamic("triggerDisabled")(triggerDisabled.asInstanceOf[js.Any])
    if (triggerOpenedClassName != null) __obj.updateDynamic("triggerOpenedClassName")(triggerOpenedClassName.asInstanceOf[js.Any])
    if (triggerSibling != null) __obj.updateDynamic("triggerSibling")(triggerSibling.rawElement.asInstanceOf[js.Any])
    if (triggerStyle != null) __obj.updateDynamic("triggerStyle")(triggerStyle.asInstanceOf[js.Any])
    if (triggerTagName != null) __obj.updateDynamic("triggerTagName")(triggerTagName.asInstanceOf[js.Any])
    if (triggerWhenOpen != null) __obj.updateDynamic("triggerWhenOpen")(triggerWhenOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleProps]
  }
}

