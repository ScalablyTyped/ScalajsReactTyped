package typingsJapgolly.reactBurgerMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBurgerMenu.mod.Props
import typingsJapgolly.reactBurgerMenu.mod.State
import typingsJapgolly.reactBurgerMenu.mod.Styles
import typingsJapgolly.reactBurgerMenu.reactBurgerMenuBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_Props271522615[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    bodyClassName: String = null,
    burgerBarClassName: String = null,
    burgerButtonClassName: String = null,
    className: String = null,
    crossButtonClassName: String = null,
    crossClassName: String = null,
    customBurgerIcon: Element | `false` = null,
    customCrossIcon: Element | `false` = null,
    customOnKeyDown: /* event */ ReactKeyboardEventFrom[org.scalajs.dom.raw.Element] => Callback = null,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined,
    disableOverlayClick: Boolean | js.Function0[Boolean] = null,
    htmlClassName: String = null,
    id: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemClassName: String = null,
    itemListClassName: String = null,
    menuClassName: String = null,
    morphShapeClassName: String = null,
    noOverlay: js.UndefOr[Boolean] = js.undefined,
    noTransition: js.UndefOr[Boolean] = js.undefined,
    onStateChange: /* state */ State => Callback = null,
    outerContainerId: String = null,
    overlayClassName: String = null,
    pageWrapId: String = null,
    right: js.UndefOr[Boolean] = js.undefined,
    styles: Styles = null,
    width: Double | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, ComponentRef, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (burgerBarClassName != null) __obj.updateDynamic("burgerBarClassName")(burgerBarClassName.asInstanceOf[js.Any])
    if (burgerButtonClassName != null) __obj.updateDynamic("burgerButtonClassName")(burgerButtonClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crossButtonClassName != null) __obj.updateDynamic("crossButtonClassName")(crossButtonClassName.asInstanceOf[js.Any])
    if (crossClassName != null) __obj.updateDynamic("crossClassName")(crossClassName.asInstanceOf[js.Any])
    if (customBurgerIcon != null) __obj.updateDynamic("customBurgerIcon")(customBurgerIcon.asInstanceOf[js.Any])
    if (customCrossIcon != null) __obj.updateDynamic("customCrossIcon")(customCrossIcon.asInstanceOf[js.Any])
    if (customOnKeyDown != null) __obj.updateDynamic("customOnKeyDown")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => customOnKeyDown(t0).runNow()))
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCloseOnEsc)) __obj.updateDynamic("disableCloseOnEsc")(disableCloseOnEsc.asInstanceOf[js.Any])
    if (disableOverlayClick != null) __obj.updateDynamic("disableOverlayClick")(disableOverlayClick.asInstanceOf[js.Any])
    if (htmlClassName != null) __obj.updateDynamic("htmlClassName")(htmlClassName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (itemClassName != null) __obj.updateDynamic("itemClassName")(itemClassName.asInstanceOf[js.Any])
    if (itemListClassName != null) __obj.updateDynamic("itemListClassName")(itemListClassName.asInstanceOf[js.Any])
    if (menuClassName != null) __obj.updateDynamic("menuClassName")(menuClassName.asInstanceOf[js.Any])
    if (morphShapeClassName != null) __obj.updateDynamic("morphShapeClassName")(morphShapeClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(noOverlay)) __obj.updateDynamic("noOverlay")(noOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(noTransition)) __obj.updateDynamic("noTransition")(noTransition.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.reactBurgerMenu.mod.State) => onStateChange(t0).runNow()))
    if (outerContainerId != null) __obj.updateDynamic("outerContainerId")(outerContainerId.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (pageWrapId != null) __obj.updateDynamic("pageWrapId")(pageWrapId.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBurgerMenu.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBurgerMenu.mod.Props])(children: _*)
  }
}

