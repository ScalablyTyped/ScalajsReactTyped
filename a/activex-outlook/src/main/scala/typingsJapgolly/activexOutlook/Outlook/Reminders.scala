package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reminders extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: Any): Reminder
  
  /* private */ @JSName("Outlook.Reminders_typekey")
  var OutlookDotReminders_typekey: Reminders
  
  val Parent: Any
  
  def Remove(Index: Any): Unit
  
  val Session: NameSpace
}
object Reminders {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: Any => Reminder,
    OutlookDotReminders_typekey: Reminders,
    Parent: Any,
    Remove: Any => Callback,
    Session: NameSpace
  ): Reminders = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1((t0: Any) => Remove(t0).runNow()), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Reminders_typekey")(OutlookDotReminders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reminders]
  }
  
  extension [Self <: Reminders](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Reminder): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotReminders_typekey(value: Reminders): Self = StObject.set(x, "Outlook.Reminders_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Any => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
