package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexOffice.Office.CustomXMLPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerData extends StObject {
  
  def Add(): CustomXMLPart
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val Count: Double
  
  def Delete(Id: String): Unit
  
  def Item(Id: String): CustomXMLPart
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.CustomerData_typekey")
  var PowerPointDotCustomerData_typekey: CustomerData
}
object CustomerData {
  
  inline def apply(
    Add: CallbackTo[CustomXMLPart],
    Application: Application,
    Count: Double,
    Delete: String => Callback,
    Item: String => CustomXMLPart,
    Parent: Any,
    PowerPointDotCustomerData_typekey: CustomerData
  ): CustomerData = {
    val __obj = js.Dynamic.literal(Add = Add.toJsFn, Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction1((t0: String) => Delete(t0).runNow()), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.CustomerData_typekey")(PowerPointDotCustomerData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerData]
  }
  
  extension [Self <: CustomerData](x: Self) {
    
    inline def setAdd(value: CallbackTo[CustomXMLPart]): Self = StObject.set(x, "Add", value.toJsFn)
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: String => Callback): Self = StObject.set(x, "Delete", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setItem(value: String => CustomXMLPart): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotCustomerData_typekey(value: CustomerData): Self = StObject.set(x, "PowerPoint.CustomerData_typekey", value.asInstanceOf[js.Any])
  }
}
