package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.carbonComponents.anon.PartialSideNavOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUiShellSideNavMod {
  
  @JSImport("carbon-components/components/ui-shell/side-nav", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SideNav {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialSideNavOptions) = this()
    
    /* CompleteClass */
    override def _handleClick(evt: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def changeState(state: String): Unit = js.native
    
    /* CompleteClass */
    override def isNavExpanded(): Boolean = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/ui-shell/side-nav", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/ui-shell/side-nav", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("carbon-components/components/ui-shell/side-nav", "default.options")
    @js.native
    def options: SideNavOptions = js.native
    inline def options_=(x: SideNavOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    /* static member */
    object state {
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.state")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.state.COLLAPSED")
      @js.native
      def COLLAPSED: String = js.native
      inline def COLLAPSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLLAPSED")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/side-nav", "default.state.EXPANDED")
      @js.native
      def EXPANDED: String = js.native
      inline def EXPANDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXPANDED")(x.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait SideNav extends StObject {
    
    def _handleClick(evt: MouseEvent): Unit
    
    def changeState(state: String): Unit
    
    def isNavExpanded(): Boolean
  }
  object SideNav {
    
    inline def apply(
      _handleClick: MouseEvent => Callback,
      changeState: String => Callback,
      isNavExpanded: CallbackTo[Boolean]
    ): SideNav = {
      val __obj = js.Dynamic.literal(_handleClick = js.Any.fromFunction1((t0: MouseEvent) => _handleClick(t0).runNow()), changeState = js.Any.fromFunction1((t0: String) => changeState(t0).runNow()), isNavExpanded = isNavExpanded.toJsFn)
      __obj.asInstanceOf[SideNav]
    }
    
    extension [Self <: SideNav](x: Self) {
      
      inline def setChangeState(value: String => Callback): Self = StObject.set(x, "changeState", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setIsNavExpanded(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNavExpanded", value.toJsFn)
      
      inline def set_handleClick(value: MouseEvent => Callback): Self = StObject.set(x, "_handleClick", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    }
  }
  
  trait SideNavOptions extends StObject {
    
    var classSideNavExpanded: String
    
    var classSideNavItemActive: String
    
    var classSideNavLinkCurrent: String
    
    var selectorInit: String
    
    var selectorSideNavItem: String
    
    var selectorSideNavLink: String
    
    var selectorSideNavLinkCurrent: String
    
    var selectorSideNavSubmenu: String
    
    var selectorSideNavToggle: String
  }
  object SideNavOptions {
    
    inline def apply(
      classSideNavExpanded: String,
      classSideNavItemActive: String,
      classSideNavLinkCurrent: String,
      selectorInit: String,
      selectorSideNavItem: String,
      selectorSideNavLink: String,
      selectorSideNavLinkCurrent: String,
      selectorSideNavSubmenu: String,
      selectorSideNavToggle: String
    ): SideNavOptions = {
      val __obj = js.Dynamic.literal(classSideNavExpanded = classSideNavExpanded.asInstanceOf[js.Any], classSideNavItemActive = classSideNavItemActive.asInstanceOf[js.Any], classSideNavLinkCurrent = classSideNavLinkCurrent.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorSideNavItem = selectorSideNavItem.asInstanceOf[js.Any], selectorSideNavLink = selectorSideNavLink.asInstanceOf[js.Any], selectorSideNavLinkCurrent = selectorSideNavLinkCurrent.asInstanceOf[js.Any], selectorSideNavSubmenu = selectorSideNavSubmenu.asInstanceOf[js.Any], selectorSideNavToggle = selectorSideNavToggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideNavOptions]
    }
    
    extension [Self <: SideNavOptions](x: Self) {
      
      inline def setClassSideNavExpanded(value: String): Self = StObject.set(x, "classSideNavExpanded", value.asInstanceOf[js.Any])
      
      inline def setClassSideNavItemActive(value: String): Self = StObject.set(x, "classSideNavItemActive", value.asInstanceOf[js.Any])
      
      inline def setClassSideNavLinkCurrent(value: String): Self = StObject.set(x, "classSideNavLinkCurrent", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorSideNavItem(value: String): Self = StObject.set(x, "selectorSideNavItem", value.asInstanceOf[js.Any])
      
      inline def setSelectorSideNavLink(value: String): Self = StObject.set(x, "selectorSideNavLink", value.asInstanceOf[js.Any])
      
      inline def setSelectorSideNavLinkCurrent(value: String): Self = StObject.set(x, "selectorSideNavLinkCurrent", value.asInstanceOf[js.Any])
      
      inline def setSelectorSideNavSubmenu(value: String): Self = StObject.set(x, "selectorSideNavSubmenu", value.asInstanceOf[js.Any])
      
      inline def setSelectorSideNavToggle(value: String): Self = StObject.set(x, "selectorSideNavToggle", value.asInstanceOf[js.Any])
    }
  }
}
