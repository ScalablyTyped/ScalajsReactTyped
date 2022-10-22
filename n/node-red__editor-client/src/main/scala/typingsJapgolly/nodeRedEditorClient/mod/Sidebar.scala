package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodeRedEditorClient.anon.EnableOnEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sidebar extends StObject {
  
  def addTab(options: EnableOnEdit): Unit
  
  var config: SidebarConfig
  
  def containsTab(id: String): Boolean
  
  var context: SidebarContext
  
  var help: SidebarHelp
  
  var info: SidebarInfo
  
  def init(): Unit
  
  def removeTab(id: String): Unit
  
  def show(id: String): Unit
  
  def toggleSidebar(state: Boolean): Unit
  
  var versionControl: SidebarVersionControl
}
object Sidebar {
  
  inline def apply(
    addTab: EnableOnEdit => Callback,
    config: SidebarConfig,
    containsTab: String => Boolean,
    context: SidebarContext,
    help: SidebarHelp,
    info: SidebarInfo,
    init: Callback,
    removeTab: String => Callback,
    show: String => Callback,
    toggleSidebar: Boolean => Callback,
    versionControl: SidebarVersionControl
  ): Sidebar = {
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction1((t0: EnableOnEdit) => addTab(t0).runNow()), config = config.asInstanceOf[js.Any], containsTab = js.Any.fromFunction1(containsTab), context = context.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], init = init.toJsFn, removeTab = js.Any.fromFunction1((t0: String) => removeTab(t0).runNow()), show = js.Any.fromFunction1((t0: String) => show(t0).runNow()), toggleSidebar = js.Any.fromFunction1((t0: Boolean) => toggleSidebar(t0).runNow()), versionControl = versionControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sidebar]
  }
  
  extension [Self <: Sidebar](x: Self) {
    
    inline def setAddTab(value: EnableOnEdit => Callback): Self = StObject.set(x, "addTab", js.Any.fromFunction1((t0: EnableOnEdit) => value(t0).runNow()))
    
    inline def setConfig(value: SidebarConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setContainsTab(value: String => Boolean): Self = StObject.set(x, "containsTab", js.Any.fromFunction1(value))
    
    inline def setContext(value: SidebarContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: SidebarHelp): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: SidebarInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setRemoveTab(value: String => Callback): Self = StObject.set(x, "removeTab", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setShow(value: String => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setToggleSidebar(value: Boolean => Callback): Self = StObject.set(x, "toggleSidebar", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setVersionControl(value: SidebarVersionControl): Self = StObject.set(x, "versionControl", value.asInstanceOf[js.Any])
  }
}
