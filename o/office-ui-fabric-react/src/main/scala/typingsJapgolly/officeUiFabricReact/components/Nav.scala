package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.IFocusZoneProps
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsNavNavDottypesMod.INav
import typingsJapgolly.officeUiFabricReact.libComponentsNavNavDottypesMod.INavButtonProps
import typingsJapgolly.officeUiFabricReact.libComponentsNavNavDottypesMod.INavLink
import typingsJapgolly.officeUiFabricReact.libComponentsNavNavDottypesMod.INavLinkGroup
import typingsJapgolly.officeUiFabricReact.libComponentsNavNavDottypesMod.INavProps
import typingsJapgolly.officeUiFabricReact.libComponentsNavNavDottypesMod.INavStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsNavNavDottypesMod.INavStyles
import typingsJapgolly.officeUiFabricReact.libComponentsNavNavDottypesMod.IRenderGroupHeaderProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libIcomponentasMod.IComponentAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Nav {
  
  @JSImport("office-ui-fabric-react", "Nav")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[INav]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ INav | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ INav | Null) => value(t0).runNow()))
    
    inline def expandButtonAriaLabel(value: String): this.type = set("expandButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def focusZoneProps(value: IFocusZoneProps): this.type = set("focusZoneProps", value.asInstanceOf[js.Any])
    
    inline def groups(value: js.Array[INavLinkGroup]): this.type = set("groups", value.asInstanceOf[js.Any])
    
    inline def groupsNull: this.type = set("groups", null)
    
    inline def groupsVarargs(value: INavLinkGroup*): this.type = set("groups", js.Array(value*))
    
    inline def initialSelectedKey(value: String): this.type = set("initialSelectedKey", value.asInstanceOf[js.Any])
    
    inline def isOnTop(value: Boolean): this.type = set("isOnTop", value.asInstanceOf[js.Any])
    
    inline def linkAs(value: IComponentAs[INavButtonProps]): this.type = set("linkAs", value.asInstanceOf[js.Any])
    
    inline def onLinkClick(
      value: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], /* item */ js.UndefOr[INavLink]) => Callback
    ): this.type = set("onLinkClick", js.Any.fromFunction2((t0: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], t1: /* item */ js.UndefOr[INavLink]) => (value(t0, t1)).runNow()))
    
    inline def onLinkExpandClick(
      value: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], /* item */ js.UndefOr[INavLink]) => Callback
    ): this.type = set("onLinkExpandClick", js.Any.fromFunction2((t0: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], t1: /* item */ js.UndefOr[INavLink]) => (value(t0, t1)).runNow()))
    
    inline def onRenderGroupHeader(
      value: (/* props */ js.UndefOr[IRenderGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IRenderGroupHeaderProps], Element | Null]]) => Element | Null
    ): this.type = set("onRenderGroupHeader", js.Any.fromFunction2(value))
    
    inline def onRenderLink(
      value: (/* props */ js.UndefOr[INavLink], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[INavLink], Element | Null]]) => Element | Null
    ): this.type = set("onRenderLink", js.Any.fromFunction2(value))
    
    inline def selectedAriaLabel(value: String): this.type = set("selectedAriaLabel", value.asInstanceOf[js.Any])
    
    inline def selectedKey(value: String): this.type = set("selectedKey", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[INavStyleProps, INavStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: INavStyleProps => DeepPartial[INavStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Nav.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: INavProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
