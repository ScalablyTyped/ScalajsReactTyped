package typingsJapgolly.officeUiFabricReact.commandBarTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.PartialIContextualMenuIte
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typingsJapgolly.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typingsJapgolly.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsJapgolly.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuRenderItem
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuSection
import typingsJapgolly.officeUiFabricReact.iconTypesMod.IIconProps
import typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsJapgolly.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typingsJapgolly.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerClassNames
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.icomponentasMod.IComponentAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBarItemProps extends IContextualMenuItem {
  /**
    * Custom styles for individual button
    */
  var buttonStyles: js.UndefOr[IButtonStyles] = js.undefined
  /**
    * A custom cache key to be used for this item. If `cacheKey` is changed, the cache will invalidate.
    * Defaults to `key` value.
    */
  var cacheKey: js.UndefOr[String] = js.undefined
  /**
    * Method to override the render of the individual command bar button.
    * Not used when item is rendered in overflow.
    * @defaultvalue CommandBarButton
    */
  var commandBarButtonAs: js.UndefOr[IComponentAs[ICommandBarItemProps]] = js.undefined
  /**
    * Show only an icon for this item, not text.
    * Does not apply if item is in the overflow.
    * @defaultvalue false
    */
  var iconOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Context under which the item is being rendered.
    * This value is mutated by the CommandBar and is useful for adjusting the `onRender` function.
    */
  var renderedInOverflow: js.UndefOr[Boolean] = js.undefined
  /**
    * Props for the tooltip when in `iconOnly` mode.
    */
  var tooltipHostProps: js.UndefOr[ITooltipHostProps] = js.undefined
}

object ICommandBarItemProps {
  @scala.inline
  def apply(
    key: String,
    ariaLabel: String = null,
    buttonStyles: IButtonStyles = null,
    cacheKey: String = null,
    canCheck: js.UndefOr[Boolean] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    commandBarButtonAs: IComponentAs[ICommandBarItemProps] = null,
    componentRef: IRefObject[IContextualMenuRenderItem] = null,
    customOnRenderListLength: Int | Double = null,
    data: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getItemClassNames: (/* theme */ ITheme, /* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* isAnchorLink */ Boolean, /* knownIcon */ Boolean, /* itemClassName */ js.UndefOr[String], /* dividerClassName */ js.UndefOr[String], /* iconClassName */ js.UndefOr[String], /* subMenuClassName */ js.UndefOr[String], /* primaryDisabled */ js.UndefOr[Boolean]) => CallbackTo[IMenuItemClassNames] = null,
    getSplitButtonVerticalDividerClassNames: /* theme */ ITheme => CallbackTo[IVerticalDividerClassNames] = null,
    href: String = null,
    iconOnly: js.UndefOr[Boolean] = js.undefined,
    iconProps: IIconProps = null,
    inactive: js.UndefOr[Boolean] = js.undefined,
    itemProps: PartialIContextualMenuIte = null,
    itemType: ContextualMenuItemType = null,
    keytipProps: IKeytipProps = null,
    name: String = null,
    onClick: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => CallbackTo[Boolean | Unit] = null,
    onMouseDown: (/* item */ IContextualMenuItem, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onRender: (/* item */ js.Any, /* dismissMenu */ js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit]) => CallbackTo[Node] = null,
    onRenderIcon: (/* props */ js.UndefOr[IContextualMenuItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuItemProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    primaryDisabled: js.UndefOr[Boolean] = js.undefined,
    rel: String = null,
    renderedInOverflow: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    secondaryText: String = null,
    sectionProps: IContextualMenuSection = null,
    shortCut: String = null,
    split: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    subMenuProps: IContextualMenuProps = null,
    submenuIconProps: IIconProps = null,
    target: String = null,
    text: String = null,
    title: String = null,
    tooltipHostProps: ITooltipHostProps = null
  ): ICommandBarItemProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (buttonStyles != null) __obj.updateDynamic("buttonStyles")(buttonStyles.asInstanceOf[js.Any])
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey.asInstanceOf[js.Any])
    if (!js.isUndefined(canCheck)) __obj.updateDynamic("canCheck")(canCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (commandBarButtonAs != null) __obj.updateDynamic("commandBarButtonAs")(commandBarButtonAs.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (customOnRenderListLength != null) __obj.updateDynamic("customOnRenderListLength")(customOnRenderListLength.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (getItemClassNames != null) __obj.updateDynamic("getItemClassNames")(js.Any.fromFunction11((t0: /* theme */ typingsJapgolly.uifabricStyling.ithemeMod.ITheme, t1: /* disabled */ scala.Boolean, t2: /* expanded */ scala.Boolean, t3: /* checked */ scala.Boolean, t4: /* isAnchorLink */ scala.Boolean, t5: /* knownIcon */ scala.Boolean, t6: /* itemClassName */ js.UndefOr[java.lang.String], t7: /* dividerClassName */ js.UndefOr[java.lang.String], t8: /* iconClassName */ js.UndefOr[java.lang.String], t9: /* subMenuClassName */ js.UndefOr[java.lang.String], t10: /* primaryDisabled */ js.UndefOr[scala.Boolean]) => getItemClassNames(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10).runNow()))
    if (getSplitButtonVerticalDividerClassNames != null) __obj.updateDynamic("getSplitButtonVerticalDividerClassNames")(js.Any.fromFunction1((t0: /* theme */ typingsJapgolly.uifabricStyling.ithemeMod.ITheme) => getSplitButtonVerticalDividerClassNames(t0).runNow()))
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(iconOnly)) __obj.updateDynamic("iconOnly")(iconOnly.asInstanceOf[js.Any])
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps.asInstanceOf[js.Any])
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (itemProps != null) __obj.updateDynamic("itemProps")(itemProps.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* ev */ js.UndefOr[
  japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]], t1: /* item */ js.UndefOr[typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem]) => onClick(t0, t1).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onMouseDown(t0, t1).runNow()))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* dismissMenu */ js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[scala.Boolean], scala.Unit]) => onRender(t0, t1).runNow()))
    if (onRenderIcon != null) __obj.updateDynamic("onRenderIcon")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[
  typingsJapgolly.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[
      typingsJapgolly.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
    ], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderIcon(t0, t1).runNow()))
    if (!js.isUndefined(primaryDisabled)) __obj.updateDynamic("primaryDisabled")(primaryDisabled.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (!js.isUndefined(renderedInOverflow)) __obj.updateDynamic("renderedInOverflow")(renderedInOverflow.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (sectionProps != null) __obj.updateDynamic("sectionProps")(sectionProps.asInstanceOf[js.Any])
    if (shortCut != null) __obj.updateDynamic("shortCut")(shortCut.asInstanceOf[js.Any])
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subMenuProps != null) __obj.updateDynamic("subMenuProps")(subMenuProps.asInstanceOf[js.Any])
    if (submenuIconProps != null) __obj.updateDynamic("submenuIconProps")(submenuIconProps.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltipHostProps != null) __obj.updateDynamic("tooltipHostProps")(tooltipHostProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBarItemProps]
  }
}

