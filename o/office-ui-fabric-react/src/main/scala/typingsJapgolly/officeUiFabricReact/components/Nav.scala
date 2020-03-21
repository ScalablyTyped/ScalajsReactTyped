package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.navTypesMod.INav
import typingsJapgolly.officeUiFabricReact.navTypesMod.INavButtonProps
import typingsJapgolly.officeUiFabricReact.navTypesMod.INavLink
import typingsJapgolly.officeUiFabricReact.navTypesMod.INavLinkGroup
import typingsJapgolly.officeUiFabricReact.navTypesMod.INavProps
import typingsJapgolly.officeUiFabricReact.navTypesMod.INavStyleProps
import typingsJapgolly.officeUiFabricReact.navTypesMod.INavStyles
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.icomponentasMod.IComponentAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Nav {
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
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    INavProps, 
    MountedWithRawType[INavProps, js.Object, RawMounted[INavProps, js.Object]]
  ] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.navTypesMod.INavProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.navTypesMod.INavProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "Nav")
  @js.native
  object componentImport extends js.Object
  
}

