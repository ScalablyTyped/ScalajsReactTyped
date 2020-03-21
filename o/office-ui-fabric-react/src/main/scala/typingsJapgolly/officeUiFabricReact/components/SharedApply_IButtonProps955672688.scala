package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsJapgolly.officeUiFabricReact.baseButtonClassNamesMod.IButtonClassNames
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.ButtonType
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButton
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typingsJapgolly.officeUiFabricReact.iconTypesMod.IIconProps
import typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsJapgolly.officeUiFabricReact.splitButtonClassNamesMod.ISplitButtonClassNames
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.AnchorHTMLAttributes
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.uifabricMergeStyles.istyleMod.IStyle
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.icomponentasMod.IComponentAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IButtonProps955672688[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[
      HTMLAnchorElement | HTMLButtonElement | HTMLDivElement | typingsJapgolly.officeUiFabricReact.baseButtonMod.BaseButton | typingsJapgolly.officeUiFabricReact.buttonButtonMod.Button | HTMLSpanElement
    ] = null,
    allowDisabledFocus: js.UndefOr[Boolean] = js.undefined,
    ariaDescription: String = null,
    ariaHidden: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    buttonType: ButtonType = null,
    componentRef: IRefObject[IButton] = null,
    data: js.Any = null,
    defaultRender: js.Any = null,
    description: IStyle = null,
    getClassNames: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* hasMenu */ Boolean, /* isSplit */ js.UndefOr[Boolean], /* allowDisabledFocus */ Boolean) => CallbackTo[IButtonClassNames] = null,
    getSplitButtonClassNames: (/* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* allowDisabledFocus */ Boolean) => CallbackTo[ISplitButtonClassNames] = null,
    iconProps: IIconProps = null,
    keytipProps: IKeytipProps = null,
    menuAs: IComponentAs[IContextualMenuProps] = null,
    menuIconProps: IIconProps = null,
    menuProps: IContextualMenuProps = null,
    menuTriggerKeyCode: Int | Double = null,
    onAfterMenuDismiss: js.UndefOr[Callback] = js.undefined,
    onMenuClick: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]], /* button */ js.UndefOr[IButtonProps]) => Callback = null,
    onRenderAriaDescription: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderChildren: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderDescription: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderIcon: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderMenu: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderMenuIcon: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderText: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    persistMenu: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[Boolean] = js.undefined,
    primaryActionButtonProps: IButtonProps = null,
    primaryDisabled: js.UndefOr[Boolean] = js.undefined,
    renderPersistedMenuHiddenOnMount: js.UndefOr[Boolean] = js.undefined,
    rootProps: ButtonHTMLAttributes[HTMLButtonElement] | AnchorHTMLAttributes[HTMLAnchorElement] = null,
    secondaryText: String = null,
    split: js.UndefOr[Boolean] = js.undefined,
    splitButtonAriaLabel: String = null,
    splitButtonMenuProps: IButtonProps = null,
    styles: IButtonStyles = null,
    text: String = null,
    theme: ITheme = null,
    toggle: js.UndefOr[Boolean] = js.undefined,
    toggled: js.UndefOr[Boolean] = js.undefined,
    uniqueId: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IButtonProps, ComponentRef, Unit, IButtonProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (!js.isUndefined(allowDisabledFocus)) __obj.updateDynamic("allowDisabledFocus")(allowDisabledFocus.asInstanceOf[js.Any])
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaHidden)) __obj.updateDynamic("ariaHidden")(ariaHidden.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction11((t0: /* theme */ typingsJapgolly.uifabricStyling.ithemeMod.ITheme, t1: /* className */ java.lang.String, t2: /* variantClassName */ java.lang.String, t3: /* iconClassName */ js.UndefOr[java.lang.String], t4: /* menuIconClassName */ js.UndefOr[java.lang.String], t5: /* disabled */ scala.Boolean, t6: /* checked */ scala.Boolean, t7: /* expanded */ scala.Boolean, t8: /* hasMenu */ scala.Boolean, t9: /* isSplit */ js.UndefOr[scala.Boolean], t10: /* allowDisabledFocus */ scala.Boolean) => getClassNames(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10).runNow()))
    if (getSplitButtonClassNames != null) __obj.updateDynamic("getSplitButtonClassNames")(js.Any.fromFunction4((t0: /* disabled */ scala.Boolean, t1: /* expanded */ scala.Boolean, t2: /* checked */ scala.Boolean, t3: /* allowDisabledFocus */ scala.Boolean) => getSplitButtonClassNames(t0, t1, t2, t3).runNow()))
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps.asInstanceOf[js.Any])
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    if (menuAs != null) __obj.updateDynamic("menuAs")(menuAs.asInstanceOf[js.Any])
    if (menuIconProps != null) __obj.updateDynamic("menuIconProps")(menuIconProps.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps.asInstanceOf[js.Any])
    if (menuTriggerKeyCode != null) __obj.updateDynamic("menuTriggerKeyCode")(menuTriggerKeyCode.asInstanceOf[js.Any])
    onAfterMenuDismiss.foreach(p => __obj.updateDynamic("onAfterMenuDismiss")(p.toJsFn))
    if (onMenuClick != null) __obj.updateDynamic("onMenuClick")(js.Any.fromFunction2((t0: /* ev */ js.UndefOr[
  japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]], t1: /* button */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps]) => onMenuClick(t0, t1).runNow()))
    if (onRenderAriaDescription != null) __obj.updateDynamic("onRenderAriaDescription")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderAriaDescription(t0, t1).runNow()))
    if (onRenderChildren != null) __obj.updateDynamic("onRenderChildren")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderChildren(t0, t1).runNow()))
    if (onRenderDescription != null) __obj.updateDynamic("onRenderDescription")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderDescription(t0, t1).runNow()))
    if (onRenderIcon != null) __obj.updateDynamic("onRenderIcon")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderIcon(t0, t1).runNow()))
    if (onRenderMenu != null) __obj.updateDynamic("onRenderMenu")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderMenu(t0, t1).runNow()))
    if (onRenderMenuIcon != null) __obj.updateDynamic("onRenderMenuIcon")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderMenuIcon(t0, t1).runNow()))
    if (onRenderText != null) __obj.updateDynamic("onRenderText")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderText(t0, t1).runNow()))
    if (!js.isUndefined(persistMenu)) __obj.updateDynamic("persistMenu")(persistMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (primaryActionButtonProps != null) __obj.updateDynamic("primaryActionButtonProps")(primaryActionButtonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryDisabled)) __obj.updateDynamic("primaryDisabled")(primaryDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPersistedMenuHiddenOnMount)) __obj.updateDynamic("renderPersistedMenuHiddenOnMount")(renderPersistedMenuHiddenOnMount.asInstanceOf[js.Any])
    if (rootProps != null) __obj.updateDynamic("rootProps")(rootProps.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (splitButtonAriaLabel != null) __obj.updateDynamic("splitButtonAriaLabel")(splitButtonAriaLabel.asInstanceOf[js.Any])
    if (splitButtonMenuProps != null) __obj.updateDynamic("splitButtonMenuProps")(splitButtonMenuProps.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (!js.isUndefined(toggled)) __obj.updateDynamic("toggled")(toggled.asInstanceOf[js.Any])
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps])(children: _*)
  }
}

