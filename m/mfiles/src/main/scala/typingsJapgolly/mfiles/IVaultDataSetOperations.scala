package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultDataSetOperations extends js.Object {
  def GetDataSetExportingStatus(ID: Double): IDataSetExportingStatus
  def GetDataSets(): IDataSets
  def GetReportAccessCredentials(): IReportAccessCredentials
  def StartDataSetExport(ID: Double): Unit
}

object IVaultDataSetOperations {
  @scala.inline
  def apply(
    GetDataSetExportingStatus: Double => CallbackTo[IDataSetExportingStatus],
    GetDataSets: CallbackTo[IDataSets],
    GetReportAccessCredentials: CallbackTo[IReportAccessCredentials],
    StartDataSetExport: Double => Callback
  ): IVaultDataSetOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetDataSetExportingStatus")(js.Any.fromFunction1((t0: scala.Double) => GetDataSetExportingStatus(t0).runNow()))
    __obj.updateDynamic("GetDataSets")(GetDataSets.toJsFn)
    __obj.updateDynamic("GetReportAccessCredentials")(GetReportAccessCredentials.toJsFn)
    __obj.updateDynamic("StartDataSetExport")(js.Any.fromFunction1((t0: scala.Double) => StartDataSetExport(t0).runNow()))
    __obj.asInstanceOf[IVaultDataSetOperations]
  }
}

