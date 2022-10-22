package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antd.antdStrings.lg
import typingsJapgolly.antd.antdStrings.md
import typingsJapgolly.antd.antdStrings.sm
import typingsJapgolly.antd.antdStrings.xl
import typingsJapgolly.antd.antdStrings.xs
import typingsJapgolly.antd.antdStrings.xxl
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLayoutSiderMod extends Shortcut {
  
  @JSImport("antd/lib/layout/Sider", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SiderProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("antd/lib/layout/Sider", "SiderContext")
  @js.native
  val SiderContext: Context[SiderContextProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.clickTrigger
    - typingsJapgolly.antd.antdStrings.responsive
  */
  trait CollapseType extends StObject
  object CollapseType {
    
    inline def clickTrigger: typingsJapgolly.antd.antdStrings.clickTrigger = "clickTrigger".asInstanceOf[typingsJapgolly.antd.antdStrings.clickTrigger]
    
    inline def responsive: typingsJapgolly.antd.antdStrings.responsive = "responsive".asInstanceOf[typingsJapgolly.antd.antdStrings.responsive]
  }
  
  trait SiderContextProps extends StObject {
    
    var siderCollapsed: js.UndefOr[Boolean] = js.undefined
  }
  object SiderContextProps {
    
    inline def apply(): SiderContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiderContextProps]
    }
    
    extension [Self <: SiderContextProps](x: Self) {
      
      inline def setSiderCollapsed(value: Boolean): Self = StObject.set(x, "siderCollapsed", value.asInstanceOf[js.Any])
      
      inline def setSiderCollapsedUndefined: Self = StObject.set(x, "siderCollapsed", js.undefined)
    }
  }
  
  trait SiderProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var breakpoint: js.UndefOr[xs | sm | md | lg | xl | xxl] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var collapsedWidth: js.UndefOr[Double | String] = js.undefined
    
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    var defaultCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var onBreakpoint: js.UndefOr[js.Function1[/* broken */ Boolean, Unit]] = js.undefined
    
    var onCollapse: js.UndefOr[js.Function2[/* collapsed */ Boolean, /* type */ CollapseType, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var reverseArrow: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[SiderTheme] = js.undefined
    
    var trigger: js.UndefOr[Node] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var zeroWidthTriggerStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object SiderProps {
    
    inline def apply(): SiderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiderProps]
    }
    
    extension [Self <: SiderProps](x: Self) {
      
      inline def setBreakpoint(value: xs | sm | md | lg | xl | xxl): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setCollapsedWidth(value: Double | String): Self = StObject.set(x, "collapsedWidth", value.asInstanceOf[js.Any])
      
      inline def setCollapsedWidthUndefined: Self = StObject.set(x, "collapsedWidth", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setDefaultCollapsed(value: Boolean): Self = StObject.set(x, "defaultCollapsed", value.asInstanceOf[js.Any])
      
      inline def setDefaultCollapsedUndefined: Self = StObject.set(x, "defaultCollapsed", js.undefined)
      
      inline def setOnBreakpoint(value: /* broken */ Boolean => Callback): Self = StObject.set(x, "onBreakpoint", js.Any.fromFunction1((t0: /* broken */ Boolean) => value(t0).runNow()))
      
      inline def setOnBreakpointUndefined: Self = StObject.set(x, "onBreakpoint", js.undefined)
      
      inline def setOnCollapse(value: (/* collapsed */ Boolean, /* type */ CollapseType) => Callback): Self = StObject.set(x, "onCollapse", js.Any.fromFunction2((t0: /* collapsed */ Boolean, t1: /* type */ CollapseType) => (value(t0, t1)).runNow()))
      
      inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setReverseArrow(value: Boolean): Self = StObject.set(x, "reverseArrow", value.asInstanceOf[js.Any])
      
      inline def setReverseArrowUndefined: Self = StObject.set(x, "reverseArrow", js.undefined)
      
      inline def setTheme(value: SiderTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTrigger(value: VdomNode): Self = StObject.set(x, "trigger", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTriggerNull: Self = StObject.set(x, "trigger", null)
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setTriggerVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "trigger", js.Array(value*))
      
      inline def setTriggerVdomElement(value: VdomElement): Self = StObject.set(x, "trigger", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZeroWidthTriggerStyle(value: CSSProperties): Self = StObject.set(x, "zeroWidthTriggerStyle", value.asInstanceOf[js.Any])
      
      inline def setZeroWidthTriggerStyleUndefined: Self = StObject.set(x, "zeroWidthTriggerStyle", js.undefined)
    }
  }
  
  trait SiderState extends StObject {
    
    var below: Boolean
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
  }
  object SiderState {
    
    inline def apply(below: Boolean): SiderState = {
      val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any])
      __obj.asInstanceOf[SiderState]
    }
    
    extension [Self <: SiderState](x: Self) {
      
      inline def setBelow(value: Boolean): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.light
    - typingsJapgolly.antd.antdStrings.dark
  */
  trait SiderTheme extends StObject
  object SiderTheme {
    
    inline def dark: typingsJapgolly.antd.antdStrings.dark = "dark".asInstanceOf[typingsJapgolly.antd.antdStrings.dark]
    
    inline def light: typingsJapgolly.antd.antdStrings.light = "light".asInstanceOf[typingsJapgolly.antd.antdStrings.light]
  }
  
  type _To = ForwardRefExoticComponent[SiderProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libLayoutSiderMod.foo` */
  override def _to: ForwardRefExoticComponent[SiderProps & RefAttributes[HTMLDivElement]] = default
}
