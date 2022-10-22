package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recipients extends StObject {
  
  def Add(Name: String): Recipient
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: Any): Recipient
  
  /* private */ @JSName("Outlook.Recipients_typekey")
  var OutlookDotRecipients_typekey: Recipients
  
  val Parent: Any
  
  def Remove(Index: Double): Unit
  
  def ResolveAll(): Boolean
  
  val Session: NameSpace
}
object Recipients {
  
  inline def apply(
    Add: String => Recipient,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: Any => Recipient,
    OutlookDotRecipients_typekey: Recipients,
    Parent: Any,
    Remove: Double => Callback,
    ResolveAll: CallbackTo[Boolean],
    Session: NameSpace
  ): Recipients = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()), ResolveAll = ResolveAll.toJsFn, Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Recipients_typekey")(OutlookDotRecipients_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recipients]
  }
  
  extension [Self <: Recipients](x: Self) {
    
    inline def setAdd(value: String => Recipient): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Recipient): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotRecipients_typekey(value: Recipients): Self = StObject.set(x, "Outlook.Recipients_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setResolveAll(value: CallbackTo[Boolean]): Self = StObject.set(x, "ResolveAll", value.toJsFn)
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
