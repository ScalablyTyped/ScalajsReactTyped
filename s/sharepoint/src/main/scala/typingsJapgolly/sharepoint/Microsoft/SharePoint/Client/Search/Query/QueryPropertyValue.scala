package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPropertyValue
  extends StObject
     with ClientValueObject {
  
  def get_boolVal(): Boolean
  
  def get_intVal(): Double
  
  def get_queryPropertyValueTypeIndex(): Double
  
  def get_strArray(): js.Array[String]
  
  def get_strVal(): String
  
  def set_boolVal(value: Boolean): Boolean
  
  def set_intVal(value: Double): Double
  
  def set_queryPropertyValueTypeIndex(value: Double): Unit
  
  def set_strArray(value: js.Array[String]): js.Array[String]
  
  def set_strVal(value: String): String
}
object QueryPropertyValue {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_boolVal: CallbackTo[Boolean],
    get_intVal: CallbackTo[Double],
    get_queryPropertyValueTypeIndex: CallbackTo[Double],
    get_strArray: CallbackTo[js.Array[String]],
    get_strVal: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_boolVal: Boolean => Boolean,
    set_intVal: Double => Double,
    set_queryPropertyValueTypeIndex: Double => Callback,
    set_strArray: js.Array[String] => js.Array[String],
    set_strVal: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): QueryPropertyValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_boolVal = get_boolVal.toJsFn, get_intVal = get_intVal.toJsFn, get_queryPropertyValueTypeIndex = get_queryPropertyValueTypeIndex.toJsFn, get_strArray = get_strArray.toJsFn, get_strVal = get_strVal.toJsFn, get_typeId = get_typeId.toJsFn, set_boolVal = js.Any.fromFunction1(set_boolVal), set_intVal = js.Any.fromFunction1(set_intVal), set_queryPropertyValueTypeIndex = js.Any.fromFunction1((t0: Double) => set_queryPropertyValueTypeIndex(t0).runNow()), set_strArray = js.Any.fromFunction1(set_strArray), set_strVal = js.Any.fromFunction1(set_strVal), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[QueryPropertyValue]
  }
  
  extension [Self <: QueryPropertyValue](x: Self) {
    
    inline def setGet_boolVal(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_boolVal", value.toJsFn)
    
    inline def setGet_intVal(value: CallbackTo[Double]): Self = StObject.set(x, "get_intVal", value.toJsFn)
    
    inline def setGet_queryPropertyValueTypeIndex(value: CallbackTo[Double]): Self = StObject.set(x, "get_queryPropertyValueTypeIndex", value.toJsFn)
    
    inline def setGet_strArray(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "get_strArray", value.toJsFn)
    
    inline def setGet_strVal(value: CallbackTo[String]): Self = StObject.set(x, "get_strVal", value.toJsFn)
    
    inline def setSet_boolVal(value: Boolean => Boolean): Self = StObject.set(x, "set_boolVal", js.Any.fromFunction1(value))
    
    inline def setSet_intVal(value: Double => Double): Self = StObject.set(x, "set_intVal", js.Any.fromFunction1(value))
    
    inline def setSet_queryPropertyValueTypeIndex(value: Double => Callback): Self = StObject.set(x, "set_queryPropertyValueTypeIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_strArray(value: js.Array[String] => js.Array[String]): Self = StObject.set(x, "set_strArray", js.Any.fromFunction1(value))
    
    inline def setSet_strVal(value: String => String): Self = StObject.set(x, "set_strVal", js.Any.fromFunction1(value))
  }
}
