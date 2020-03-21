package typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.PartialIContextualMenuIte
import typingsJapgolly.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typingsJapgolly.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsJapgolly.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuRenderItem
import typingsJapgolly.officeUiFabricReact.iconTypesMod.IIconProps
import typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsJapgolly.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerClassNames
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuItem
  extends /**
  * Any additional properties to use when custom rendering menu items.
  */
/* propertyName */ StringDictionary[js.Any] {
  /**
    * Optional accessibility label (aria-label) attribute that will be stamped on to the element.
    * If none is specified, the aria-label attribute will contain the item name
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Whether or not this menu item can be checked
    * @defaultvalue false
    */
  var canCheck: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not this menu item is currently checked.
    * @defaultvalue false
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional CSS class to apply to the menu item.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IContextualMenuRenderItem interface. This will get passed down to ContextualMenuItem.
    */
  var componentRef: js.UndefOr[IRefObject[IContextualMenuRenderItem]] = js.undefined
  /**
    * When rendering a custom menu component that is passed in, the component might also be a list of
    * elements. We want to keep track of the correct index our menu is using based off of
    * the length of the custom list. It is up to the user to increment the count for their list.
    */
  var customOnRenderListLength: js.UndefOr[Double] = js.undefined
  /**
    * Any custom data the developer wishes to associate with the menu item.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether the menu item is disabled
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Method to provide the classnames to style the individual items inside a menu.
    * @deprecated Use `styles` prop of `IContextualMenuItemProps` to leverage mergeStyles API.
    */
  var getItemClassNames: js.UndefOr[
    js.Function11[
      /* theme */ ITheme, 
      /* disabled */ Boolean, 
      /* expanded */ Boolean, 
      /* checked */ Boolean, 
      /* isAnchorLink */ Boolean, 
      /* knownIcon */ Boolean, 
      /* itemClassName */ js.UndefOr[String], 
      /* dividerClassName */ js.UndefOr[String], 
      /* iconClassName */ js.UndefOr[String], 
      /* subMenuClassName */ js.UndefOr[String], 
      /* primaryDisabled */ js.UndefOr[Boolean], 
      IMenuItemClassNames
    ]
  ] = js.undefined
  /**
    * Method to provide the classnames to style the Vertical Divider of a split button inside a menu.
    * Default value is the `getSplitButtonVerticalDividerClassNames` func defined in `ContextualMenu.classnames.ts`.
    * @defaultvalue getSplitButtonVerticalDividerClassNames
    */
  var getSplitButtonVerticalDividerClassNames: js.UndefOr[js.Function1[/* theme */ ITheme, IVerticalDividerClassNames]] = js.undefined
  /**
    * Navigate to this URL when the menu item is clicked.
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * Props for the Icon.
    */
  var iconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * This prop is no longer used. All contextual menu items are now focusable when disabled.
    * @deprecated in 6.38.2 will be removed in 7.0.0
    */
  var inactive: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional IContextualMenuItemProps overrides to customize behaviors such as item styling via `styles`.
    */
  var itemProps: js.UndefOr[PartialIContextualMenuIte] = js.undefined
  var itemType: js.UndefOr[ContextualMenuItemType] = js.undefined
  /**
    * Unique id to identify the item
    */
  var key: String
  /**
    * Keytip for this contextual menu item
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * Text description for the menu item to display
    * @deprecated Use `text` instead.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Callback for when the menu item is invoked. If `ev.preventDefault()` is called in `onClick`,
    * the click will not close the menu.
    * Returning true will dismiss the menu even if `ev.preventDefault()` was called.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]], 
      /* item */ js.UndefOr[IContextualMenuItem], 
      Boolean | Unit
    ]
  ] = js.undefined
  /**
    * A function to be executed on mouse down. This is executed before an `onClick` event and can
    * be used to interrupt native on click events as well. The click event should still handle
    * the commands. This should only be used in special cases when react and non-react are mixed.
    */
  var onMouseDown: js.UndefOr[
    js.Function2[/* item */ IContextualMenuItem, /* event */ ReactMouseEventFrom[HTMLElement], Unit]
  ] = js.undefined
  /**
    * Method to custom render this menu item.
    * For keyboard accessibility, the top-level rendered item should be a focusable element
    * (like an anchor or a button) or have the `data-is-focusable` property set to true.
    *
    * @param item - Item to render. Will typically be of type `IContextualMenuItem`.
    * (When rendering a command bar item, will be `ICommandBarItemProps`.)
    * @param dismissMenu - Function to dismiss the menu. Can be used to ensure that a custom menu
    * item click dismisses the menu. (Will be undefined if rendering a command bar item.)
    */
  var onRender: js.UndefOr[
    js.Function2[
      /* item */ js.Any, 
      /* dismissMenu */ js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit], 
      Node
    ]
  ] = js.undefined
  /**
    * Custom render function for the menu item icon
    */
  var onRenderIcon: js.UndefOr[IRenderFunction[IContextualMenuItemProps]] = js.undefined
  /**
    * If the menu item is a split button, this prop disables purely the primary action of the button.
    * @defaultvalue false
    */
  var primaryDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Link relation setting when using `href`. If `target` is `_blank`, `rel` is defaulted to a value to prevent clickjacking.
    */
  var rel: js.UndefOr[String] = js.undefined
  /**
    * Optional override for the menu button's role. Defaults to `menuitem` or `menuitemcheckbox`.
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * Seconday description for the menu item to display
    */
  var secondaryText: js.UndefOr[String] = js.undefined
  /**
    * Properties to apply to render this item as a section.
    * This prop is mutually exclusive with `subMenuProps`.
    */
  var sectionProps: js.UndefOr[IContextualMenuSection] = js.undefined
  /**
    * @deprecated Not used
    */
  var shortCut: js.UndefOr[String] = js.undefined
  /**
    * Whether or not this menu item is a splitButton.
    * @defaultvalue false
    */
  var split: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional styles to apply to the menu item
    * @deprecated in favor of the `styles` prop to leverage mergeStyles API.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Properties to apply to a submenu to this item.
    *
    * The ContextualMenu will provide default values for `target`, `onDismiss`, `isSubMenu`,
    * `id`, `shouldFocusOnMount`, `directionalHint`, `className`, and `gapSpace`, all of which
    * can be overridden.
    */
  var subMenuProps: js.UndefOr[IContextualMenuProps] = js.undefined
  /**
    * Props for the Icon used for the chevron.
    */
  var submenuIconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Target window when using `href`.
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * Text description for the menu item to display
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Optional title for displaying text when hovering over an item.
    */
  var title: js.UndefOr[String] = js.undefined
}

object IContextualMenuItem {
  @scala.inline
  def apply(
    key: String,
    StringDictionary: /**
    * Any additional properties to use when custom rendering menu items.
    */
  /* propertyName */ StringDictionary[js.Any] = null,
    ariaLabel: String = null,
    canCheck: js.UndefOr[Boolean] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    componentRef: IRefObject[IContextualMenuRenderItem] = null,
    customOnRenderListLength: Int | Double = null,
    data: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getItemClassNames: (/* theme */ ITheme, /* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* isAnchorLink */ Boolean, /* knownIcon */ Boolean, /* itemClassName */ js.UndefOr[String], /* dividerClassName */ js.UndefOr[String], /* iconClassName */ js.UndefOr[String], /* subMenuClassName */ js.UndefOr[String], /* primaryDisabled */ js.UndefOr[Boolean]) => CallbackTo[IMenuItemClassNames] = null,
    getSplitButtonVerticalDividerClassNames: /* theme */ ITheme => CallbackTo[IVerticalDividerClassNames] = null,
    href: String = null,
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
    title: String = null
  ): IContextualMenuItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(canCheck)) __obj.updateDynamic("canCheck")(canCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (customOnRenderListLength != null) __obj.updateDynamic("customOnRenderListLength")(customOnRenderListLength.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (getItemClassNames != null) __obj.updateDynamic("getItemClassNames")(js.Any.fromFunction11((t0: /* theme */ typingsJapgolly.uifabricStyling.ithemeMod.ITheme, t1: /* disabled */ scala.Boolean, t2: /* expanded */ scala.Boolean, t3: /* checked */ scala.Boolean, t4: /* isAnchorLink */ scala.Boolean, t5: /* knownIcon */ scala.Boolean, t6: /* itemClassName */ js.UndefOr[java.lang.String], t7: /* dividerClassName */ js.UndefOr[java.lang.String], t8: /* iconClassName */ js.UndefOr[java.lang.String], t9: /* subMenuClassName */ js.UndefOr[java.lang.String], t10: /* primaryDisabled */ js.UndefOr[scala.Boolean]) => getItemClassNames(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10).runNow()))
    if (getSplitButtonVerticalDividerClassNames != null) __obj.updateDynamic("getSplitButtonVerticalDividerClassNames")(js.Any.fromFunction1((t0: /* theme */ typingsJapgolly.uifabricStyling.ithemeMod.ITheme) => getSplitButtonVerticalDividerClassNames(t0).runNow()))
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[IContextualMenuItem]
  }
}

