package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridField extends StObject {
  
  def CompareSingleDataEqual(dataValue1: Any, dataValue2: Any): Boolean
  
  def GetDefaultCellStyleId(): Any
  
  def GetEditMode(): EditMode
  
  def GetIsMultiValue(): Boolean
  
  def GetMultiValuePropType(): Any
  
  def GetPropType(): Any
  
  def GetSingleValuePropType(): Any
  
  def SetEditMode(mode: EditMode): Unit
  
  def SetIsMultiValue(listSeparator: Any): Unit
  
  def SetSingleValuePropType(svPropType: Any): Unit
  
  var csrInfo: Any
  
  var dateOnly: Boolean
  
  var hasDataValue: Boolean
  
  var hasLocalizedValue: Boolean
  
  var key: String
  
  var textDirection: TextDirection
}
object GridField {
  
  inline def apply(
    CompareSingleDataEqual: (Any, Any) => Boolean,
    GetDefaultCellStyleId: CallbackTo[Any],
    GetEditMode: CallbackTo[EditMode],
    GetIsMultiValue: CallbackTo[Boolean],
    GetMultiValuePropType: CallbackTo[Any],
    GetPropType: CallbackTo[Any],
    GetSingleValuePropType: CallbackTo[Any],
    SetEditMode: EditMode => Callback,
    SetIsMultiValue: Any => Callback,
    SetSingleValuePropType: Any => Callback,
    csrInfo: Any,
    dateOnly: Boolean,
    hasDataValue: Boolean,
    hasLocalizedValue: Boolean,
    key: String,
    textDirection: TextDirection
  ): GridField = {
    val __obj = js.Dynamic.literal(CompareSingleDataEqual = js.Any.fromFunction2(CompareSingleDataEqual), GetDefaultCellStyleId = GetDefaultCellStyleId.toJsFn, GetEditMode = GetEditMode.toJsFn, GetIsMultiValue = GetIsMultiValue.toJsFn, GetMultiValuePropType = GetMultiValuePropType.toJsFn, GetPropType = GetPropType.toJsFn, GetSingleValuePropType = GetSingleValuePropType.toJsFn, SetEditMode = js.Any.fromFunction1((t0: EditMode) => SetEditMode(t0).runNow()), SetIsMultiValue = js.Any.fromFunction1((t0: Any) => SetIsMultiValue(t0).runNow()), SetSingleValuePropType = js.Any.fromFunction1((t0: Any) => SetSingleValuePropType(t0).runNow()), csrInfo = csrInfo.asInstanceOf[js.Any], dateOnly = dateOnly.asInstanceOf[js.Any], hasDataValue = hasDataValue.asInstanceOf[js.Any], hasLocalizedValue = hasLocalizedValue.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], textDirection = textDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridField]
  }
  
  extension [Self <: GridField](x: Self) {
    
    inline def setCompareSingleDataEqual(value: (Any, Any) => Boolean): Self = StObject.set(x, "CompareSingleDataEqual", js.Any.fromFunction2(value))
    
    inline def setCsrInfo(value: Any): Self = StObject.set(x, "csrInfo", value.asInstanceOf[js.Any])
    
    inline def setDateOnly(value: Boolean): Self = StObject.set(x, "dateOnly", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultCellStyleId(value: CallbackTo[Any]): Self = StObject.set(x, "GetDefaultCellStyleId", value.toJsFn)
    
    inline def setGetEditMode(value: CallbackTo[EditMode]): Self = StObject.set(x, "GetEditMode", value.toJsFn)
    
    inline def setGetIsMultiValue(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetIsMultiValue", value.toJsFn)
    
    inline def setGetMultiValuePropType(value: CallbackTo[Any]): Self = StObject.set(x, "GetMultiValuePropType", value.toJsFn)
    
    inline def setGetPropType(value: CallbackTo[Any]): Self = StObject.set(x, "GetPropType", value.toJsFn)
    
    inline def setGetSingleValuePropType(value: CallbackTo[Any]): Self = StObject.set(x, "GetSingleValuePropType", value.toJsFn)
    
    inline def setHasDataValue(value: Boolean): Self = StObject.set(x, "hasDataValue", value.asInstanceOf[js.Any])
    
    inline def setHasLocalizedValue(value: Boolean): Self = StObject.set(x, "hasLocalizedValue", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSetEditMode(value: EditMode => Callback): Self = StObject.set(x, "SetEditMode", js.Any.fromFunction1((t0: EditMode) => value(t0).runNow()))
    
    inline def setSetIsMultiValue(value: Any => Callback): Self = StObject.set(x, "SetIsMultiValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetSingleValuePropType(value: Any => Callback): Self = StObject.set(x, "SetSingleValuePropType", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setTextDirection(value: TextDirection): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
  }
}
