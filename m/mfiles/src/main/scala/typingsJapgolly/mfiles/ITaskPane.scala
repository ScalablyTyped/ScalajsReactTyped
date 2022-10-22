package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITaskPane extends StObject {
  
  def AddCustomCommandToGroup(customCommand: Double, group: Double, orderPriority: Double): Unit
  
  val Available: Boolean
  
  def CreateGroup(groupName: String, priority: Double): Double
  
  def DeleteGroup(groupID: Double): Unit
  
  val Events: ITaskPaneEvents
  
  def RemoveCustomCommandFromGroup(customCommand: Double, group: Double): Unit
  
  def SetLogo(filename: String): Unit
  
  def SetTheme(theme: ITheme): Unit
  
  var Visible: Boolean
}
object ITaskPane {
  
  inline def apply(
    AddCustomCommandToGroup: (Double, Double, Double) => Callback,
    Available: Boolean,
    CreateGroup: (String, Double) => Double,
    DeleteGroup: Double => Callback,
    Events: ITaskPaneEvents,
    RemoveCustomCommandFromGroup: (Double, Double) => Callback,
    SetLogo: String => Callback,
    SetTheme: ITheme => Callback,
    Visible: Boolean
  ): ITaskPane = {
    val __obj = js.Dynamic.literal(AddCustomCommandToGroup = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (AddCustomCommandToGroup(t0, t1, t2)).runNow()), Available = Available.asInstanceOf[js.Any], CreateGroup = js.Any.fromFunction2(CreateGroup), DeleteGroup = js.Any.fromFunction1((t0: Double) => DeleteGroup(t0).runNow()), Events = Events.asInstanceOf[js.Any], RemoveCustomCommandFromGroup = js.Any.fromFunction2((t0: Double, t1: Double) => (RemoveCustomCommandFromGroup(t0, t1)).runNow()), SetLogo = js.Any.fromFunction1((t0: String) => SetLogo(t0).runNow()), SetTheme = js.Any.fromFunction1((t0: ITheme) => SetTheme(t0).runNow()), Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskPane]
  }
  
  extension [Self <: ITaskPane](x: Self) {
    
    inline def setAddCustomCommandToGroup(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "AddCustomCommandToGroup", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "Available", value.asInstanceOf[js.Any])
    
    inline def setCreateGroup(value: (String, Double) => Double): Self = StObject.set(x, "CreateGroup", js.Any.fromFunction2(value))
    
    inline def setDeleteGroup(value: Double => Callback): Self = StObject.set(x, "DeleteGroup", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setEvents(value: ITaskPaneEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomCommandFromGroup(value: (Double, Double) => Callback): Self = StObject.set(x, "RemoveCustomCommandFromGroup", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetLogo(value: String => Callback): Self = StObject.set(x, "SetLogo", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetTheme(value: ITheme => Callback): Self = StObject.set(x, "SetTheme", js.Any.fromFunction1((t0: ITheme) => value(t0).runNow()))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
