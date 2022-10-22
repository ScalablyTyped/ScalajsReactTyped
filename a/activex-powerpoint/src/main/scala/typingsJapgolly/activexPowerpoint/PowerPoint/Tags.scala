package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tags extends StObject {
  
  def Add(Name: String, Value: String): Unit
  
  def AddBinary(Name: String, FilePath: String): Unit
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  def BinaryValue(Name: String): Double
  
  val Count: Double
  
  def Delete(Name: String): Unit
  
  def Item(Name: String): String
  
  def Name(Index: Double): String
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Tags_typekey")
  var PowerPointDotTags_typekey: Tags
  
  def Value(Index: Double): String
}
object Tags {
  
  inline def apply(
    Add: (String, String) => Callback,
    AddBinary: (String, String) => Callback,
    Application: Application,
    BinaryValue: String => Double,
    Count: Double,
    Delete: String => Callback,
    Item: String => String,
    Name: Double => String,
    Parent: Any,
    PowerPointDotTags_typekey: Tags,
    Value: Double => String
  ): Tags = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: String, t1: String) => (Add(t0, t1)).runNow()), AddBinary = js.Any.fromFunction2((t0: String, t1: String) => (AddBinary(t0, t1)).runNow()), Application = Application.asInstanceOf[js.Any], BinaryValue = js.Any.fromFunction1(BinaryValue), Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction1((t0: String) => Delete(t0).runNow()), Item = js.Any.fromFunction1(Item), Name = js.Any.fromFunction1(Name), Parent = Parent.asInstanceOf[js.Any], Value = js.Any.fromFunction1(Value))
    __obj.updateDynamic("PowerPoint.Tags_typekey")(PowerPointDotTags_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
  
  extension [Self <: Tags](x: Self) {
    
    inline def setAdd(value: (String, String) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setAddBinary(value: (String, String) => Callback): Self = StObject.set(x, "AddBinary", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBinaryValue(value: String => Double): Self = StObject.set(x, "BinaryValue", js.Any.fromFunction1(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: String => Callback): Self = StObject.set(x, "Delete", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setItem(value: String => String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setName(value: Double => String): Self = StObject.set(x, "Name", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotTags_typekey(value: Tags): Self = StObject.set(x, "PowerPoint.Tags_typekey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double => String): Self = StObject.set(x, "Value", js.Any.fromFunction1(value))
  }
}
