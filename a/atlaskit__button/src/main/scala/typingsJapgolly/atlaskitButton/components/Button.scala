package typingsJapgolly.atlaskitButton.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.atlaskitButton.mod.ButtonAppearances
import typingsJapgolly.atlaskitButton.mod.ButtonProps
import typingsJapgolly.atlaskitButton.mod.ButtonSpacing
import typingsJapgolly.atlaskitButton.mod.ButtonType
import typingsJapgolly.atlaskitButton.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  def apply(
    appearance: ButtonAppearances = null,
    ariaControls: String = null,
    ariaExpanded: js.UndefOr[Boolean] = js.undefined,
    ariaHaspopup: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    component: ComponentClassP[js.Object] = null,
    form: String = null,
    href: String = null,
    iconAfter: VdomElement = null,
    iconBefore: VdomElement = null,
    id: String = null,
    innerRef: /* instance */ js.Any => Callback = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    onClick: ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    shouldFitContainer: js.UndefOr[Boolean] = js.undefined,
    spacing: ButtonSpacing = null,
    tabIndex: Int | Double = null,
    target: String = null,
    `type`: ButtonType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ButtonProps, default, Unit, ButtonProps] = {
    val __obj = js.Dynamic.literal()
  
      if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (ariaControls != null) __obj.updateDynamic("ariaControls")(ariaControls.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaExpanded)) __obj.updateDynamic("ariaExpanded")(ariaExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaHaspopup)) __obj.updateDynamic("ariaHaspopup")(ariaHaspopup.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (iconAfter != null) __obj.updateDynamic("iconAfter")(iconAfter.rawElement.asInstanceOf[js.Any])
    if (iconBefore != null) __obj.updateDynamic("iconBefore")(iconBefore.rawElement.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1((t0: /* instance */ js.Any) => innerRef(t0).runNow()))
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onClick(t0).runNow()))
    if (!js.isUndefined(shouldFitContainer)) __obj.updateDynamic("shouldFitContainer")(shouldFitContainer.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atlaskitButton.mod.ButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atlaskitButton.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atlaskitButton.mod.ButtonProps])(children: _*)
  }
  @JSImport("@atlaskit/button", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

