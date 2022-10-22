package typingsJapgolly.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleItems extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: Any): Any
  
  /* private */ @JSName("Outlook.SimpleItems_typekey")
  var OutlookDotSimpleItems_typekey: SimpleItems
  
  val Parent: Any
  
  val Session: NameSpace
}
object SimpleItems {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: Any => Any,
    OutlookDotSimpleItems_typekey: SimpleItems,
    Parent: Any,
    Session: NameSpace
  ): SimpleItems = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SimpleItems_typekey")(OutlookDotSimpleItems_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleItems]
  }
  
  extension [Self <: SimpleItems](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Any): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotSimpleItems_typekey(value: SimpleItems): Self = StObject.set(x, "Outlook.SimpleItems_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
