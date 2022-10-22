package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.IFocusZoneProps
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.anon.ContainsFocus
import typingsJapgolly.officeUiFabricReact.libCommonDirectionalHintMod.DirectionalHint
import typingsJapgolly.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDotclassNamesMod.IContextualMenuClassNames
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenu
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuItem
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuListProps
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuProps
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuStyles
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemDottypesMod.IContextualMenuItemProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricReactHooks.libUseTargetMod.Target
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libIrectangleMod.IRectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContextualMenu {
  
  inline def apply(items: js.Array[IContextualMenuItem]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IContextualMenuProps]))
  }
  
  @JSImport("office-ui-fabric-react", "ContextualMenu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def alignTargetEdge(value: Boolean): this.type = set("alignTargetEdge", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def beakWidth(value: Double): this.type = set("beakWidth", value.asInstanceOf[js.Any])
    
    inline def bounds(
      value: IRectangle | (js.Function2[
          /* target */ js.UndefOr[Target], 
          /* targetWindow */ js.UndefOr[Window], 
          js.UndefOr[IRectangle]
        ])
    ): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def boundsFunction2(
      value: (/* target */ js.UndefOr[Target], /* targetWindow */ js.UndefOr[Window]) => js.UndefOr[IRectangle]
    ): this.type = set("bounds", js.Any.fromFunction2(value))
    
    inline def calloutProps(value: ICalloutProps): this.type = set("calloutProps", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IContextualMenu]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IContextualMenu | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IContextualMenu | Null) => value(t0).runNow()))
    
    inline def contextualMenuItemAs(
      value: (ComponentClassP[IContextualMenuItemProps & js.Object]) | FunctionComponent[IContextualMenuItemProps]
    ): this.type = set("contextualMenuItemAs", value.asInstanceOf[js.Any])
    
    inline def coverTarget(value: Boolean): this.type = set("coverTarget", value.asInstanceOf[js.Any])
    
    inline def delayUpdateFocusOnHover(value: Boolean): this.type = set("delayUpdateFocusOnHover", value.asInstanceOf[js.Any])
    
    inline def directionalHint(value: DirectionalHint): this.type = set("directionalHint", value.asInstanceOf[js.Any])
    
    inline def directionalHintFixed(value: Boolean): this.type = set("directionalHintFixed", value.asInstanceOf[js.Any])
    
    inline def directionalHintForRTL(value: DirectionalHint): this.type = set("directionalHintForRTL", value.asInstanceOf[js.Any])
    
    inline def doNotLayer(value: Boolean): this.type = set("doNotLayer", value.asInstanceOf[js.Any])
    
    inline def focusZoneProps(value: IFocusZoneProps): this.type = set("focusZoneProps", value.asInstanceOf[js.Any])
    
    inline def gapSpace(value: Double): this.type = set("gapSpace", value.asInstanceOf[js.Any])
    
    inline def getMenuClassNames(value: (/* theme */ ITheme, /* className */ js.UndefOr[String]) => IContextualMenuClassNames): this.type = set("getMenuClassNames", js.Any.fromFunction2(value))
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def isBeakVisible(value: Boolean): this.type = set("isBeakVisible", value.asInstanceOf[js.Any])
    
    inline def isSubMenu(value: Boolean): this.type = set("isSubMenu", value.asInstanceOf[js.Any])
    
    inline def labelElementId(value: String): this.type = set("labelElementId", value.asInstanceOf[js.Any])
    
    inline def onDismiss(
      value: (/* ev */ js.UndefOr[ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]], /* dismissAll */ js.UndefOr[Boolean]) => Callback
    ): this.type = set("onDismiss", js.Any.fromFunction2((t0: /* ev */ js.UndefOr[ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]], t1: /* dismissAll */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
    
    inline def onItemClick(
      value: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit
    ): this.type = set("onItemClick", js.Any.fromFunction2(value))
    
    inline def onMenuDismissed(value: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Callback): this.type = set("onMenuDismissed", js.Any.fromFunction1((t0: /* contextualMenu */ js.UndefOr[IContextualMenuProps]) => value(t0).runNow()))
    
    inline def onMenuOpened(value: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Callback): this.type = set("onMenuOpened", js.Any.fromFunction1((t0: /* contextualMenu */ js.UndefOr[IContextualMenuProps]) => value(t0).runNow()))
    
    inline def onRenderMenuList(
      value: (/* props */ js.UndefOr[IContextualMenuListProps], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[IContextualMenuListProps], 
            typingsJapgolly.react.mod.global.JSX.Element | Null
          ]
        ]) => typingsJapgolly.react.mod.global.JSX.Element | Null
    ): this.type = set("onRenderMenuList", js.Any.fromFunction2(value))
    
    inline def onRenderSubMenu(
      value: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[IContextualMenuProps], 
            typingsJapgolly.react.mod.global.JSX.Element | Null
          ]
        ]) => typingsJapgolly.react.mod.global.JSX.Element | Null
    ): this.type = set("onRenderSubMenu", js.Any.fromFunction2(value))
    
    inline def onRestoreFocus(value: /* options */ ContainsFocus => Callback): this.type = set("onRestoreFocus", js.Any.fromFunction1((t0: /* options */ ContainsFocus) => value(t0).runNow()))
    
    inline def responsiveMode(value: ResponsiveMode): this.type = set("responsiveMode", value.asInstanceOf[js.Any])
    
    inline def shouldFocusOnContainer(value: Boolean): this.type = set("shouldFocusOnContainer", value.asInstanceOf[js.Any])
    
    inline def shouldFocusOnMount(value: Boolean): this.type = set("shouldFocusOnMount", value.asInstanceOf[js.Any])
    
    inline def shouldUpdateWhenHidden(value: Boolean): this.type = set("shouldUpdateWhenHidden", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IContextualMenuStyleProps => DeepPartial[IContextualMenuStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def subMenuHoverDelay(value: Double): this.type = set("subMenuHoverDelay", value.asInstanceOf[js.Any])
    
    inline def target(value: Target): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def targetNull: this.type = set("target", null)
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def useTargetAsMinWidth(value: Boolean): this.type = set("useTargetAsMinWidth", value.asInstanceOf[js.Any])
    
    inline def useTargetWidth(value: Boolean): this.type = set("useTargetWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IContextualMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
