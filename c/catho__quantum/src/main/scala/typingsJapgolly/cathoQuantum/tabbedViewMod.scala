package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.cathoQuantum.anon.BaseFontSizeBreakpointsComponents
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabbedViewMod {
  
  @JSImport("@catho/quantum/TabbedView", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TabbedViewProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/TabbedView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/TabbedView", "default.Tab")
    @js.native
    def Tab: japgolly.scalajs.react.facade.React.Component[TabProps & js.Object, js.Object] = js.native
    inline def Tab_=(x: japgolly.scalajs.react.facade.React.Component[TabProps & js.Object, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
  }
  
  type Tab = japgolly.scalajs.react.facade.React.Component[TabProps & js.Object, js.Object]
  
  trait TabProps extends StObject {
    
    var badge: js.UndefOr[Node] = js.undefined
    
    var children: js.Array[Node] | Node
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var title: String
  }
  object TabProps {
    
    inline def apply(title: String): TabProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[TabProps]
    }
    
    extension [Self <: TabProps](x: Self) {
      
      inline def setBadge(value: VdomNode): Self = StObject.set(x, "badge", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBadgeNull: Self = StObject.set(x, "badge", null)
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setBadgeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "badge", js.Array(value*))
      
      inline def setBadgeVdomElement(value: VdomElement): Self = StObject.set(x, "badge", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[Node] | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type TabbedView = japgolly.scalajs.react.facade.React.Component[TabbedViewProps & js.Object, js.Object]
  
  trait TabbedViewProps extends StObject {
    
    var activeTab: js.UndefOr[String] = js.undefined
    
    var children: js.Array[Node] | Node
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var onTabClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var skin: js.UndefOr[neutral | primary] = js.undefined
    
    var theme: js.UndefOr[BaseFontSizeBreakpointsComponents] = js.undefined
  }
  object TabbedViewProps {
    
    inline def apply(): TabbedViewProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[TabbedViewProps]
    }
    
    extension [Self <: TabbedViewProps](x: Self) {
      
      inline def setActiveTab(value: String): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      inline def setChildren(value: js.Array[Node] | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setOnTabClick(value: Callback): Self = StObject.set(x, "onTabClick", value.toJsFn)
      
      inline def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
      
      inline def setSkin(value: neutral | primary): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: BaseFontSizeBreakpointsComponents): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
