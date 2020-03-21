package typingsJapgolly.officeUiFabricReact.navTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.icomponentasMod.IComponentAs
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavProps extends js.Object {
  /**
    * (Optional) The nav container aria label.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Additional css class to apply to the Nav
    * @defaultvalue undefined
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the INav interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[INav]] = js.undefined
  /**
    * (Optional) The nav container aria label. The link name is prepended to this label.
    * If not provided, the aria label will default to the link name.
    *
    * @deprecated - Use expandAriaLabel and collapseAriaLabel on groups instead
    */
  var expandButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * A collection of link groups to display in the navigation bar
    */
  var groups: js.Array[INavLinkGroup] | Null
  /**
    * (Optional) The key of the nav item initially selected.
    */
  var initialSelectedKey: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the navigation component renders on top of other content in the UI
    */
  var isOnTop: js.UndefOr[Boolean] = js.undefined
  /**
    * Render a custom link in place of the normal one.
    * This replaces the entire button rather than simply button content
    */
  var linkAs: js.UndefOr[IComponentAs[INavButtonProps]] = js.undefined
  /**
    * Function callback invoked when a link in the navigation is clicked
    */
  var onLinkClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], 
      /* item */ js.UndefOr[INavLink], 
      Unit
    ]
  ] = js.undefined
  /**
    * Function callback invoked when the chevron on a link is clicked
    */
  var onLinkExpandClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], 
      /* item */ js.UndefOr[INavLink], 
      Unit
    ]
  ] = js.undefined
  /**
    * Used to customize how content inside the group header is rendered
    * @defaultvalue Default group header rendering
    */
  var onRenderGroupHeader: js.UndefOr[IRenderFunction[INavLinkGroup]] = js.undefined
  /**
    * Used to customize how content inside the link tag is rendered
    * @defaultvalue Default link rendering
    */
  var onRenderLink: js.UndefOr[IRenderFunction[INavLink]] = js.undefined
  /**
    * (Optional) The nav link selected state aria label.
    */
  var selectedAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * (Optional) The key of the nav item selected by caller.
    */
  var selectedKey: js.UndefOr[String] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[INavStyleProps, INavStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object INavProps {
  @scala.inline
  def apply(
    ariaLabel: String = null,
    className: String = null,
    componentRef: IRefObject[INav] = null,
    expandButtonAriaLabel: String = null,
    groups: js.Array[INavLinkGroup] = null,
    initialSelectedKey: String = null,
    isOnTop: js.UndefOr[Boolean] = js.undefined,
    linkAs: IComponentAs[INavButtonProps] = null,
    onLinkClick: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], /* item */ js.UndefOr[INavLink]) => Callback = null,
    onLinkExpandClick: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], /* item */ js.UndefOr[INavLink]) => Callback = null,
    onRenderGroupHeader: (/* props */ js.UndefOr[INavLinkGroup], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[INavLinkGroup], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderLink: (/* props */ js.UndefOr[INavLink], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[INavLink], Element | Null]]) => CallbackTo[Element | Null] = null,
    selectedAriaLabel: String = null,
    selectedKey: String = null,
    styles: IStyleFunctionOrObject[INavStyleProps, INavStyles] = null,
    theme: ITheme = null
  ): INavProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (expandButtonAriaLabel != null) __obj.updateDynamic("expandButtonAriaLabel")(expandButtonAriaLabel.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (initialSelectedKey != null) __obj.updateDynamic("initialSelectedKey")(initialSelectedKey.asInstanceOf[js.Any])
    if (!js.isUndefined(isOnTop)) __obj.updateDynamic("isOnTop")(isOnTop.asInstanceOf[js.Any])
    if (linkAs != null) __obj.updateDynamic("linkAs")(linkAs.asInstanceOf[js.Any])
    if (onLinkClick != null) __obj.updateDynamic("onLinkClick")(js.Any.fromFunction2((t0: /* ev */ js.UndefOr[japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]], t1: /* item */ js.UndefOr[typingsJapgolly.officeUiFabricReact.navTypesMod.INavLink]) => onLinkClick(t0, t1).runNow()))
    if (onLinkExpandClick != null) __obj.updateDynamic("onLinkExpandClick")(js.Any.fromFunction2((t0: /* ev */ js.UndefOr[japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]], t1: /* item */ js.UndefOr[typingsJapgolly.officeUiFabricReact.navTypesMod.INavLink]) => onLinkExpandClick(t0, t1).runNow()))
    if (onRenderGroupHeader != null) __obj.updateDynamic("onRenderGroupHeader")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.navTypesMod.INavLinkGroup], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.navTypesMod.INavLinkGroup], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderGroupHeader(t0, t1).runNow()))
    if (onRenderLink != null) __obj.updateDynamic("onRenderLink")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.navTypesMod.INavLink], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.navTypesMod.INavLink], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderLink(t0, t1).runNow()))
    if (selectedAriaLabel != null) __obj.updateDynamic("selectedAriaLabel")(selectedAriaLabel.asInstanceOf[js.Any])
    if (selectedKey != null) __obj.updateDynamic("selectedKey")(selectedKey.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavProps]
  }
}

