package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultDataSetOperations extends StObject {
  
  def GetDataSetExportingStatus(ID: Double): IDataSetExportingStatus
  
  def GetDataSets(): IDataSets
  
  def GetReportAccessCredentials(): IReportAccessCredentials
  
  def StartDataSetExport(ID: Double): Unit
}
object IVaultDataSetOperations {
  
  inline def apply(
    GetDataSetExportingStatus: Double => IDataSetExportingStatus,
    GetDataSets: CallbackTo[IDataSets],
    GetReportAccessCredentials: CallbackTo[IReportAccessCredentials],
    StartDataSetExport: Double => Callback
  ): IVaultDataSetOperations = {
    val __obj = js.Dynamic.literal(GetDataSetExportingStatus = js.Any.fromFunction1(GetDataSetExportingStatus), GetDataSets = GetDataSets.toJsFn, GetReportAccessCredentials = GetReportAccessCredentials.toJsFn, StartDataSetExport = js.Any.fromFunction1((t0: Double) => StartDataSetExport(t0).runNow()))
    __obj.asInstanceOf[IVaultDataSetOperations]
  }
  
  extension [Self <: IVaultDataSetOperations](x: Self) {
    
    inline def setGetDataSetExportingStatus(value: Double => IDataSetExportingStatus): Self = StObject.set(x, "GetDataSetExportingStatus", js.Any.fromFunction1(value))
    
    inline def setGetDataSets(value: CallbackTo[IDataSets]): Self = StObject.set(x, "GetDataSets", value.toJsFn)
    
    inline def setGetReportAccessCredentials(value: CallbackTo[IReportAccessCredentials]): Self = StObject.set(x, "GetReportAccessCredentials", value.toJsFn)
    
    inline def setStartDataSetExport(value: Double => Callback): Self = StObject.set(x, "StartDataSetExport", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
