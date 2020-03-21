package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.calloutTypesMod.Target
import typingsJapgolly.officeUiFabricReact.contextualMenuClassNamesMod.IContextualMenuClassNames
import typingsJapgolly.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenu
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuListProps
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuStyleProps
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuStyles
import typingsJapgolly.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.IFocusZoneProps
import typingsJapgolly.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.Window_
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ContextualMenu {
  def apply(
    items: js.Array[IContextualMenuItem],
    alignTargetEdge: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    beakWidth: Int | Double = null,
    bounds: IRectangle | (js.Function2[
      /* target */ js.UndefOr[Target], 
      /* targetWindow */ js.UndefOr[Window_], 
      js.UndefOr[IRectangle]
    ]) = null,
    calloutProps: ICalloutProps = null,
    className: String = null,
    componentRef: IRefObject[IContextualMenu] = null,
    contextualMenuItemAs: (ComponentClassP[IContextualMenuItemProps with js.Object]) | FunctionComponent[IContextualMenuItemProps] = null,
    coverTarget: js.UndefOr[Boolean] = js.undefined,
    delayUpdateFocusOnHover: js.UndefOr[Boolean] = js.undefined,
    directionalHint: DirectionalHint = null,
    directionalHintFixed: js.UndefOr[Boolean] = js.undefined,
    directionalHintForRTL: DirectionalHint = null,
    doNotLayer: js.UndefOr[Boolean] = js.undefined,
    focusZoneProps: IFocusZoneProps = null,
    gapSpace: Int | Double = null,
    getMenuClassNames: (/* theme */ ITheme, /* className */ js.UndefOr[String]) => CallbackTo[IContextualMenuClassNames] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isBeakVisible: js.UndefOr[Boolean] = js.undefined,
    isSubMenu: js.UndefOr[Boolean] = js.undefined,
    labelElementId: String = null,
    onDismiss: (/* ev */ js.UndefOr[ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]], /* dismissAll */ js.UndefOr[Boolean]) => Callback = null,
    onItemClick: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => CallbackTo[Boolean | Unit] = null,
    onMenuDismissed: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Callback = null,
    onMenuOpened: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Callback = null,
    onRenderMenuList: (/* props */ js.UndefOr[IContextualMenuListProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IContextualMenuListProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    onRenderSubMenu: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IContextualMenuProps], 
        japgolly.scalajs.react.raw.React.Element | Null
      ]
    ]) => CallbackTo[japgolly.scalajs.react.raw.React.Element | Null] = null,
    responsiveMode: ResponsiveMode = null,
    shouldFocusOnContainer: js.UndefOr[Boolean] = js.undefined,
    shouldFocusOnMount: js.UndefOr[Boolean] = js.undefined,
    shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles] = null,
    subMenuHoverDelay: Int | Double = null,
    target: Target = null,
    theme: ITheme = null,
    title: String = null,
    useTargetAsMinWidth: js.UndefOr[Boolean] = js.undefined,
    useTargetWidth: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IContextualMenuProps, 
    MountedWithRawType[IContextualMenuProps, js.Object, RawMounted[IContextualMenuProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
      if (!js.isUndefined(alignTargetEdge)) __obj.updateDynamic("alignTargetEdge")(alignTargetEdge.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextualMenuItemAs != null) __obj.updateDynamic("contextualMenuItemAs")(contextualMenuItemAs.asInstanceOf[js.Any])
    if (!js.isUndefined(coverTarget)) __obj.updateDynamic("coverTarget")(coverTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(delayUpdateFocusOnHover)) __obj.updateDynamic("delayUpdateFocusOnHover")(delayUpdateFocusOnHover.asInstanceOf[js.Any])
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed.asInstanceOf[js.Any])
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotLayer)) __obj.updateDynamic("doNotLayer")(doNotLayer.asInstanceOf[js.Any])
    if (focusZoneProps != null) __obj.updateDynamic("focusZoneProps")(focusZoneProps.asInstanceOf[js.Any])
    if (gapSpace != null) __obj.updateDynamic("gapSpace")(gapSpace.asInstanceOf[js.Any])
    if (getMenuClassNames != null) __obj.updateDynamic("getMenuClassNames")(js.Any.fromFunction2((t0: /* theme */ typingsJapgolly.uifabricStyling.ithemeMod.ITheme, t1: /* className */ js.UndefOr[java.lang.String]) => getMenuClassNames(t0, t1).runNow()))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isBeakVisible)) __obj.updateDynamic("isBeakVisible")(isBeakVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isSubMenu)) __obj.updateDynamic("isSubMenu")(isSubMenu.asInstanceOf[js.Any])
    if (labelElementId != null) __obj.updateDynamic("labelElementId")(labelElementId.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction2((t0: /* ev */ js.UndefOr[
  japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]], t1: /* dismissAll */ js.UndefOr[scala.Boolean]) => onDismiss(t0, t1).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2((t0: /* ev */ js.UndefOr[
  japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]], t1: /* item */ js.UndefOr[typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem]) => onItemClick(t0, t1).runNow()))
    if (onMenuDismissed != null) __obj.updateDynamic("onMenuDismissed")(js.Any.fromFunction1((t0: /* contextualMenu */ js.UndefOr[typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps]) => onMenuDismissed(t0).runNow()))
    if (onMenuOpened != null) __obj.updateDynamic("onMenuOpened")(js.Any.fromFunction1((t0: /* contextualMenu */ js.UndefOr[typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps]) => onMenuOpened(t0).runNow()))
    if (onRenderMenuList != null) __obj.updateDynamic("onRenderMenuList")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[
  typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuListProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[
      typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuListProps
    ], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderMenuList(t0, t1).runNow()))
    if (onRenderSubMenu != null) __obj.updateDynamic("onRenderSubMenu")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderSubMenu(t0, t1).runNow()))
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusOnContainer)) __obj.updateDynamic("shouldFocusOnContainer")(shouldFocusOnContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusOnMount)) __obj.updateDynamic("shouldFocusOnMount")(shouldFocusOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldUpdateWhenHidden)) __obj.updateDynamic("shouldUpdateWhenHidden")(shouldUpdateWhenHidden.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subMenuHoverDelay != null) __obj.updateDynamic("subMenuHoverDelay")(subMenuHoverDelay.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(useTargetAsMinWidth)) __obj.updateDynamic("useTargetAsMinWidth")(useTargetAsMinWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(useTargetWidth)) __obj.updateDynamic("useTargetWidth")(useTargetWidth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "ContextualMenu")
  @js.native
  object componentImport extends js.Object
  
}

