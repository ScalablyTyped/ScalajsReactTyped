package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultEventLogOperations extends StObject {
  
  def Clear(): Unit
  
  def ClearRange(FirstEventID: Double, LastEventID: Double): Unit
  
  def ClearRange_32bit(FirstEventID: String, LastEventID: String): Unit
  
  def ExportAll(): String
  
  def ExportRange(FirstEventID: Double, LastEventID: Double, DeleteEventsAfterExporting: Boolean): String
  
  def ExportRange_32bit(FirstEventID: String, LastEventID: String, DeleteEventsAfterExporting: Boolean): String
  
  def GetIDRange(): IIDRange
  
  def IsLoggingEnabled(): Boolean
  
  def SetLoggingEnabled(Enabled: Boolean): Unit
}
object IVaultEventLogOperations {
  
  inline def apply(
    Clear: Callback,
    ClearRange: (Double, Double) => Callback,
    ClearRange_32bit: (String, String) => Callback,
    ExportAll: CallbackTo[String],
    ExportRange: (Double, Double, Boolean) => String,
    ExportRange_32bit: (String, String, Boolean) => String,
    GetIDRange: CallbackTo[IIDRange],
    IsLoggingEnabled: CallbackTo[Boolean],
    SetLoggingEnabled: Boolean => Callback
  ): IVaultEventLogOperations = {
    val __obj = js.Dynamic.literal(Clear = Clear.toJsFn, ClearRange = js.Any.fromFunction2((t0: Double, t1: Double) => (ClearRange(t0, t1)).runNow()), ClearRange_32bit = js.Any.fromFunction2((t0: String, t1: String) => (ClearRange_32bit(t0, t1)).runNow()), ExportAll = ExportAll.toJsFn, ExportRange = js.Any.fromFunction3(ExportRange), ExportRange_32bit = js.Any.fromFunction3(ExportRange_32bit), GetIDRange = GetIDRange.toJsFn, IsLoggingEnabled = IsLoggingEnabled.toJsFn, SetLoggingEnabled = js.Any.fromFunction1((t0: Boolean) => SetLoggingEnabled(t0).runNow()))
    __obj.asInstanceOf[IVaultEventLogOperations]
  }
  
  extension [Self <: IVaultEventLogOperations](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setClearRange(value: (Double, Double) => Callback): Self = StObject.set(x, "ClearRange", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setClearRange_32bit(value: (String, String) => Callback): Self = StObject.set(x, "ClearRange_32bit", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setExportAll(value: CallbackTo[String]): Self = StObject.set(x, "ExportAll", value.toJsFn)
    
    inline def setExportRange(value: (Double, Double, Boolean) => String): Self = StObject.set(x, "ExportRange", js.Any.fromFunction3(value))
    
    inline def setExportRange_32bit(value: (String, String, Boolean) => String): Self = StObject.set(x, "ExportRange_32bit", js.Any.fromFunction3(value))
    
    inline def setGetIDRange(value: CallbackTo[IIDRange]): Self = StObject.set(x, "GetIDRange", value.toJsFn)
    
    inline def setIsLoggingEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsLoggingEnabled", value.toJsFn)
    
    inline def setSetLoggingEnabled(value: Boolean => Callback): Self = StObject.set(x, "SetLoggingEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
