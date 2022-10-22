package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.anon.BDelayInit
import typingsJapgolly.sharepoint.anon.DataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMultiValuePropertyType
  extends StObject
     with IPropertyType {
  
  def GetSerializableMultiValuePropType(): BDelayInit
  
  def InitSingleValuePropType(): Unit
  
  def LocStrArrayToLocStr(locStrArray: js.Array[String]): String
  
  def LocStrToLocStrArray(locStr: String): js.Array[String]
  
  var bMultiValue: Boolean
  
  var separator: String
  
  var singleValuePropType: String
}
object IMultiValuePropertyType {
  
  inline def apply(
    BeginValidateNormalizeConvert: (Double, String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Callback,
    GetSerializableMultiValuePropType: CallbackTo[BDelayInit],
    ID: String,
    InitSingleValuePropType: Callback,
    LocStrArrayToLocStr: js.Array[String] => String,
    LocStrToLocStrArray: String => js.Array[String],
    bMultiValue: Boolean,
    separator: String,
    singleValuePropType: String
  ): IMultiValuePropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6((t0: Double, t1: String, t2: Any, t3: Boolean, t4: js.Function1[/* args */ DataValue, Unit], t5: Any) => (BeginValidateNormalizeConvert(t0, t1, t2, t3, t4, t5)).runNow()), GetSerializableMultiValuePropType = GetSerializableMultiValuePropType.toJsFn, ID = ID.asInstanceOf[js.Any], InitSingleValuePropType = InitSingleValuePropType.toJsFn, LocStrArrayToLocStr = js.Any.fromFunction1(LocStrArrayToLocStr), LocStrToLocStrArray = js.Any.fromFunction1(LocStrToLocStrArray), bMultiValue = bMultiValue.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], singleValuePropType = singleValuePropType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiValuePropertyType]
  }
  
  extension [Self <: IMultiValuePropertyType](x: Self) {
    
    inline def setBMultiValue(value: Boolean): Self = StObject.set(x, "bMultiValue", value.asInstanceOf[js.Any])
    
    inline def setGetSerializableMultiValuePropType(value: CallbackTo[BDelayInit]): Self = StObject.set(x, "GetSerializableMultiValuePropType", value.toJsFn)
    
    inline def setInitSingleValuePropType(value: Callback): Self = StObject.set(x, "InitSingleValuePropType", value.toJsFn)
    
    inline def setLocStrArrayToLocStr(value: js.Array[String] => String): Self = StObject.set(x, "LocStrArrayToLocStr", js.Any.fromFunction1(value))
    
    inline def setLocStrToLocStrArray(value: String => js.Array[String]): Self = StObject.set(x, "LocStrToLocStrArray", js.Any.fromFunction1(value))
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSingleValuePropType(value: String): Self = StObject.set(x, "singleValuePropType", value.asInstanceOf[js.Any])
  }
}
