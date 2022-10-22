package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  def Add(): Action
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: Any): Action
  
  /* private */ @JSName("Outlook.Actions_typekey")
  var OutlookDotActions_typekey: Actions
  
  val Parent: Any
  
  def Remove(Index: Double): Unit
  
  val Session: NameSpace
}
object Actions {
  
  inline def apply(
    Add: CallbackTo[Action],
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: Any => Action,
    OutlookDotActions_typekey: Actions,
    Parent: Any,
    Remove: Double => Callback,
    Session: NameSpace
  ): Actions = {
    val __obj = js.Dynamic.literal(Add = Add.toJsFn, Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Actions_typekey")(OutlookDotActions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setAdd(value: CallbackTo[Action]): Self = StObject.set(x, "Add", value.toJsFn)
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Action): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotActions_typekey(value: Actions): Self = StObject.set(x, "Outlook.Actions_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
