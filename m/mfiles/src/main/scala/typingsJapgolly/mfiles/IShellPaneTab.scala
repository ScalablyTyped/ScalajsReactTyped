package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellPaneTab extends StObject {
  
  val Events: IShellPaneTabEvents
  
  val IsBuiltIn: Boolean
  
  def Remove(): Unit
  
  def Select(): Unit
  
  val Selected: Boolean
  
  def ShowDashboard(dashboardID: String, data: Any): Unit
  
  def ShowEmptyContent(): Unit
  
  def ShowFilePreview(file: String): Unit
  
  def ShowObjectVersionProperties(propertyValuesWithIcons: IPropertyValuesWithIconClues): Unit
  
  def ShowPersistentContent(sessionHandle: Double): Unit
  
  def ShowSSRSReport(reportURL: String): Unit
  
  val TabId: String
  
  var Title: String
  
  def Unselect(): Unit
  
  var Visible: Boolean
}
object IShellPaneTab {
  
  inline def apply(
    Events: IShellPaneTabEvents,
    IsBuiltIn: Boolean,
    Remove: Callback,
    Select: Callback,
    Selected: Boolean,
    ShowDashboard: (String, Any) => Callback,
    ShowEmptyContent: Callback,
    ShowFilePreview: String => Callback,
    ShowObjectVersionProperties: IPropertyValuesWithIconClues => Callback,
    ShowPersistentContent: Double => Callback,
    ShowSSRSReport: String => Callback,
    TabId: String,
    Title: String,
    Unselect: Callback,
    Visible: Boolean
  ): IShellPaneTab = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], IsBuiltIn = IsBuiltIn.asInstanceOf[js.Any], Remove = Remove.toJsFn, Select = Select.toJsFn, Selected = Selected.asInstanceOf[js.Any], ShowDashboard = js.Any.fromFunction2((t0: String, t1: Any) => (ShowDashboard(t0, t1)).runNow()), ShowEmptyContent = ShowEmptyContent.toJsFn, ShowFilePreview = js.Any.fromFunction1((t0: String) => ShowFilePreview(t0).runNow()), ShowObjectVersionProperties = js.Any.fromFunction1((t0: IPropertyValuesWithIconClues) => ShowObjectVersionProperties(t0).runNow()), ShowPersistentContent = js.Any.fromFunction1((t0: Double) => ShowPersistentContent(t0).runNow()), ShowSSRSReport = js.Any.fromFunction1((t0: String) => ShowSSRSReport(t0).runNow()), TabId = TabId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Unselect = Unselect.toJsFn, Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellPaneTab]
  }
  
  extension [Self <: IShellPaneTab](x: Self) {
    
    inline def setEvents(value: IShellPaneTabEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setIsBuiltIn(value: Boolean): Self = StObject.set(x, "IsBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "Remove", value.toJsFn)
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "Selected", value.asInstanceOf[js.Any])
    
    inline def setShowDashboard(value: (String, Any) => Callback): Self = StObject.set(x, "ShowDashboard", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setShowEmptyContent(value: Callback): Self = StObject.set(x, "ShowEmptyContent", value.toJsFn)
    
    inline def setShowFilePreview(value: String => Callback): Self = StObject.set(x, "ShowFilePreview", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setShowObjectVersionProperties(value: IPropertyValuesWithIconClues => Callback): Self = StObject.set(x, "ShowObjectVersionProperties", js.Any.fromFunction1((t0: IPropertyValuesWithIconClues) => value(t0).runNow()))
    
    inline def setShowPersistentContent(value: Double => Callback): Self = StObject.set(x, "ShowPersistentContent", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setShowSSRSReport(value: String => Callback): Self = StObject.set(x, "ShowSSRSReport", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTabId(value: String): Self = StObject.set(x, "TabId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setUnselect(value: Callback): Self = StObject.set(x, "Unselect", value.toJsFn)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
