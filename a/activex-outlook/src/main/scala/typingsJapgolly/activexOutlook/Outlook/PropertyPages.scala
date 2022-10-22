package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyPages extends StObject {
  
  def Add(Page: Any, Title: String): Unit
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: Any): Any
  
  /* private */ @JSName("Outlook.PropertyPages_typekey")
  var OutlookDotPropertyPages_typekey: PropertyPages
  
  val Parent: Any
  
  def Remove(Index: Any): Unit
  
  val Session: NameSpace
}
object PropertyPages {
  
  inline def apply(
    Add: (Any, String) => Callback,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: Any => Any,
    OutlookDotPropertyPages_typekey: PropertyPages,
    Parent: Any,
    Remove: Any => Callback,
    Session: NameSpace
  ): PropertyPages = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Any, t1: String) => (Add(t0, t1)).runNow()), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1((t0: Any) => Remove(t0).runNow()), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.PropertyPages_typekey")(OutlookDotPropertyPages_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPages]
  }
  
  extension [Self <: PropertyPages](x: Self) {
    
    inline def setAdd(value: (Any, String) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Any): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotPropertyPages_typekey(value: PropertyPages): Self = StObject.set(x, "Outlook.PropertyPages_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Any => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
