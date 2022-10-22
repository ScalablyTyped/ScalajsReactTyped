package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellPaneContainer extends StObject {
  
  def AddTab(TabId: String, tabTitle: String, insertBeforeTabId: String): IShellPaneTab
  
  val Content: Any
  
  val Events: IShellPaneContainerEvents
  
  def Focus(): Unit
  
  def GetSelectedTab(): IShellPaneTab
  
  def GetTab(TabId: String): IShellPaneTab
  
  val IsFocused: Boolean
  
  var Minimized: Boolean
  
  def SetDefaultSize(defaultSize: Double, resizeToDefault: Boolean): Unit
  
  def SetDefaultVisibility(Visible: Boolean, resetToDefault: Boolean): Unit
  
  val ShellFrame: IShellFrame
  
  var Size: Double
  
  val TabTitleSize: Double
  
  var Visible: Boolean
}
object IShellPaneContainer {
  
  inline def apply(
    AddTab: (String, String, String) => IShellPaneTab,
    Content: Any,
    Events: IShellPaneContainerEvents,
    Focus: Callback,
    GetSelectedTab: CallbackTo[IShellPaneTab],
    GetTab: String => IShellPaneTab,
    IsFocused: Boolean,
    Minimized: Boolean,
    SetDefaultSize: (Double, Boolean) => Callback,
    SetDefaultVisibility: (Boolean, Boolean) => Callback,
    ShellFrame: IShellFrame,
    Size: Double,
    TabTitleSize: Double,
    Visible: Boolean
  ): IShellPaneContainer = {
    val __obj = js.Dynamic.literal(AddTab = js.Any.fromFunction3(AddTab), Content = Content.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Focus = Focus.toJsFn, GetSelectedTab = GetSelectedTab.toJsFn, GetTab = js.Any.fromFunction1(GetTab), IsFocused = IsFocused.asInstanceOf[js.Any], Minimized = Minimized.asInstanceOf[js.Any], SetDefaultSize = js.Any.fromFunction2((t0: Double, t1: Boolean) => (SetDefaultSize(t0, t1)).runNow()), SetDefaultVisibility = js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (SetDefaultVisibility(t0, t1)).runNow()), ShellFrame = ShellFrame.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TabTitleSize = TabTitleSize.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellPaneContainer]
  }
  
  extension [Self <: IShellPaneContainer](x: Self) {
    
    inline def setAddTab(value: (String, String, String) => IShellPaneTab): Self = StObject.set(x, "AddTab", js.Any.fromFunction3(value))
    
    inline def setContent(value: Any): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: IShellPaneContainerEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "Focus", value.toJsFn)
    
    inline def setGetSelectedTab(value: CallbackTo[IShellPaneTab]): Self = StObject.set(x, "GetSelectedTab", value.toJsFn)
    
    inline def setGetTab(value: String => IShellPaneTab): Self = StObject.set(x, "GetTab", js.Any.fromFunction1(value))
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "IsFocused", value.asInstanceOf[js.Any])
    
    inline def setMinimized(value: Boolean): Self = StObject.set(x, "Minimized", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultSize(value: (Double, Boolean) => Callback): Self = StObject.set(x, "SetDefaultSize", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSetDefaultVisibility(value: (Boolean, Boolean) => Callback): Self = StObject.set(x, "SetDefaultVisibility", js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setShellFrame(value: IShellFrame): Self = StObject.set(x, "ShellFrame", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setTabTitleSize(value: Double): Self = StObject.set(x, "TabTitleSize", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
