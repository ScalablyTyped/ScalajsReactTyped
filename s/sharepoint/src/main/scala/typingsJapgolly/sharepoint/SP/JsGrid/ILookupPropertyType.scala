package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.anon.BLimitToList
import typingsJapgolly.sharepoint.anon.DataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILookupPropertyType
  extends StObject
     with IPropertyType {
  
  def DataToLocalized(dataValue: Any): String
  
  def GetImageSource(record: IRecord, dataValue: Any): String
  
  def GetIsLimitedToList(): Boolean
  
  def GetItems(fnCallback: Any): Unit
  
  def GetSerializableLookupPropType(): BLimitToList
  
  def GetStyleId(dataValue: Any): String
  
  def LocalizedToData(localized: String): Any
}
object ILookupPropertyType {
  
  inline def apply(
    BeginValidateNormalizeConvert: (Double, String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Callback,
    DataToLocalized: Any => String,
    GetImageSource: (IRecord, Any) => String,
    GetIsLimitedToList: CallbackTo[Boolean],
    GetItems: Any => Callback,
    GetSerializableLookupPropType: CallbackTo[BLimitToList],
    GetStyleId: Any => String,
    ID: String,
    LocalizedToData: String => Any
  ): ILookupPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6((t0: Double, t1: String, t2: Any, t3: Boolean, t4: js.Function1[/* args */ DataValue, Unit], t5: Any) => (BeginValidateNormalizeConvert(t0, t1, t2, t3, t4, t5)).runNow()), DataToLocalized = js.Any.fromFunction1(DataToLocalized), GetImageSource = js.Any.fromFunction2(GetImageSource), GetIsLimitedToList = GetIsLimitedToList.toJsFn, GetItems = js.Any.fromFunction1((t0: Any) => GetItems(t0).runNow()), GetSerializableLookupPropType = GetSerializableLookupPropType.toJsFn, GetStyleId = js.Any.fromFunction1(GetStyleId), ID = ID.asInstanceOf[js.Any], LocalizedToData = js.Any.fromFunction1(LocalizedToData))
    __obj.asInstanceOf[ILookupPropertyType]
  }
  
  extension [Self <: ILookupPropertyType](x: Self) {
    
    inline def setDataToLocalized(value: Any => String): Self = StObject.set(x, "DataToLocalized", js.Any.fromFunction1(value))
    
    inline def setGetImageSource(value: (IRecord, Any) => String): Self = StObject.set(x, "GetImageSource", js.Any.fromFunction2(value))
    
    inline def setGetIsLimitedToList(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetIsLimitedToList", value.toJsFn)
    
    inline def setGetItems(value: Any => Callback): Self = StObject.set(x, "GetItems", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGetSerializableLookupPropType(value: CallbackTo[BLimitToList]): Self = StObject.set(x, "GetSerializableLookupPropType", value.toJsFn)
    
    inline def setGetStyleId(value: Any => String): Self = StObject.set(x, "GetStyleId", js.Any.fromFunction1(value))
    
    inline def setLocalizedToData(value: String => Any): Self = StObject.set(x, "LocalizedToData", js.Any.fromFunction1(value))
  }
}
