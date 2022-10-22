package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFormatRules extends StObject {
  
  def Add(Name: String): AutoFormatRule
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Insert(Name: String, Index: Any): AutoFormatRule
  
  def Item(Index: Any): AutoFormatRule
  
  /* private */ @JSName("Outlook.AutoFormatRules_typekey")
  var OutlookDotAutoFormatRules_typekey: AutoFormatRules
  
  val Parent: Any
  
  def Remove(Index: Any): Unit
  
  def RemoveAll(): Unit
  
  def Save(): Unit
  
  val Session: NameSpace
}
object AutoFormatRules {
  
  inline def apply(
    Add: String => AutoFormatRule,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Insert: (String, Any) => AutoFormatRule,
    Item: Any => AutoFormatRule,
    OutlookDotAutoFormatRules_typekey: AutoFormatRules,
    Parent: Any,
    Remove: Any => Callback,
    RemoveAll: Callback,
    Save: Callback,
    Session: NameSpace
  ): AutoFormatRules = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Insert = js.Any.fromFunction2(Insert), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1((t0: Any) => Remove(t0).runNow()), RemoveAll = RemoveAll.toJsFn, Save = Save.toJsFn, Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AutoFormatRules_typekey")(OutlookDotAutoFormatRules_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFormatRules]
  }
  
  extension [Self <: AutoFormatRules](x: Self) {
    
    inline def setAdd(value: String => AutoFormatRule): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setInsert(value: (String, Any) => AutoFormatRule): Self = StObject.set(x, "Insert", js.Any.fromFunction2(value))
    
    inline def setItem(value: Any => AutoFormatRule): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotAutoFormatRules_typekey(value: AutoFormatRules): Self = StObject.set(x, "Outlook.AutoFormatRules_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Any => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemoveAll(value: Callback): Self = StObject.set(x, "RemoveAll", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
