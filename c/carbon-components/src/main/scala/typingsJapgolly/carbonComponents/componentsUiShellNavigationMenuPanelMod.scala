package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUiShellNavigationMenuPanelMod {
  
  @JSImport("carbon-components/components/ui-shell/navigation-menu-panel", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NavigationMenuPanel {
    
    /* CompleteClass */
    override def _changeState(state: String, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def createdByLauncher(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def shouldStateBeChanged(state: String): Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("carbon-components/components/ui-shell/navigation-menu-panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/components/ui-shell/navigation-menu-panel", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait NavigationMenuPanel extends StObject {
    
    def _changeState(state: String, callback: js.Function0[Unit]): Unit
    
    def createdByLauncher(event: Event): Unit
    
    def shouldStateBeChanged(state: String): Boolean
  }
  object NavigationMenuPanel {
    
    inline def apply(
      _changeState: (String, js.Function0[Unit]) => Callback,
      createdByLauncher: Event => Callback,
      shouldStateBeChanged: String => Boolean
    ): NavigationMenuPanel = {
      val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (_changeState(t0, t1)).runNow()), createdByLauncher = js.Any.fromFunction1((t0: Event) => createdByLauncher(t0).runNow()), shouldStateBeChanged = js.Any.fromFunction1(shouldStateBeChanged))
      __obj.asInstanceOf[NavigationMenuPanel]
    }
    
    extension [Self <: NavigationMenuPanel](x: Self) {
      
      inline def setCreatedByLauncher(value: Event => Callback): Self = StObject.set(x, "createdByLauncher", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setShouldStateBeChanged(value: String => Boolean): Self = StObject.set(x, "shouldStateBeChanged", js.Any.fromFunction1(value))
      
      inline def set_changeState(value: (String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "_changeState", js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait NavigationMenuPanelOptions extends StObject {
    
    var attribLabelCollapse: String
    
    var attribLabelExpand: String
    
    var classNavigationMenuPanelHeaderActionActive: String
    
    var eventAfterCollapsed: String
    
    var eventAfterExpanded: String
    
    var eventBeforeCollapsed: String
    
    var eventBeforeExpanded: String
    
    var initEventNames: js.Array[String]
    
    var selectorFocusableMenuItem: String
  }
  object NavigationMenuPanelOptions {
    
    inline def apply(
      attribLabelCollapse: String,
      attribLabelExpand: String,
      classNavigationMenuPanelHeaderActionActive: String,
      eventAfterCollapsed: String,
      eventAfterExpanded: String,
      eventBeforeCollapsed: String,
      eventBeforeExpanded: String,
      initEventNames: js.Array[String],
      selectorFocusableMenuItem: String
    ): NavigationMenuPanelOptions = {
      val __obj = js.Dynamic.literal(attribLabelCollapse = attribLabelCollapse.asInstanceOf[js.Any], attribLabelExpand = attribLabelExpand.asInstanceOf[js.Any], classNavigationMenuPanelHeaderActionActive = classNavigationMenuPanelHeaderActionActive.asInstanceOf[js.Any], eventAfterCollapsed = eventAfterCollapsed.asInstanceOf[js.Any], eventAfterExpanded = eventAfterExpanded.asInstanceOf[js.Any], eventBeforeCollapsed = eventBeforeCollapsed.asInstanceOf[js.Any], eventBeforeExpanded = eventBeforeExpanded.asInstanceOf[js.Any], initEventNames = initEventNames.asInstanceOf[js.Any], selectorFocusableMenuItem = selectorFocusableMenuItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationMenuPanelOptions]
    }
    
    extension [Self <: NavigationMenuPanelOptions](x: Self) {
      
      inline def setAttribLabelCollapse(value: String): Self = StObject.set(x, "attribLabelCollapse", value.asInstanceOf[js.Any])
      
      inline def setAttribLabelExpand(value: String): Self = StObject.set(x, "attribLabelExpand", value.asInstanceOf[js.Any])
      
      inline def setClassNavigationMenuPanelHeaderActionActive(value: String): Self = StObject.set(x, "classNavigationMenuPanelHeaderActionActive", value.asInstanceOf[js.Any])
      
      inline def setEventAfterCollapsed(value: String): Self = StObject.set(x, "eventAfterCollapsed", value.asInstanceOf[js.Any])
      
      inline def setEventAfterExpanded(value: String): Self = StObject.set(x, "eventAfterExpanded", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeCollapsed(value: String): Self = StObject.set(x, "eventBeforeCollapsed", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeExpanded(value: String): Self = StObject.set(x, "eventBeforeExpanded", value.asInstanceOf[js.Any])
      
      inline def setInitEventNames(value: js.Array[String]): Self = StObject.set(x, "initEventNames", value.asInstanceOf[js.Any])
      
      inline def setInitEventNamesVarargs(value: String*): Self = StObject.set(x, "initEventNames", js.Array(value*))
      
      inline def setSelectorFocusableMenuItem(value: String): Self = StObject.set(x, "selectorFocusableMenuItem", value.asInstanceOf[js.Any])
    }
  }
}
