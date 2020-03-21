package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultEventLogOperations extends js.Object {
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
  @scala.inline
  def apply(
    Clear: Callback,
    ClearRange: (Double, Double) => Callback,
    ClearRange_32bit: (String, String) => Callback,
    ExportAll: CallbackTo[String],
    ExportRange: (Double, Double, Boolean) => CallbackTo[String],
    ExportRange_32bit: (String, String, Boolean) => CallbackTo[String],
    GetIDRange: CallbackTo[IIDRange],
    IsLoggingEnabled: CallbackTo[Boolean],
    SetLoggingEnabled: Boolean => Callback
  ): IVaultEventLogOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clear")(Clear.toJsFn)
    __obj.updateDynamic("ClearRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => ClearRange(t0, t1).runNow()))
    __obj.updateDynamic("ClearRange_32bit")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => ClearRange_32bit(t0, t1).runNow()))
    __obj.updateDynamic("ExportAll")(ExportAll.toJsFn)
    __obj.updateDynamic("ExportRange")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Boolean) => ExportRange(t0, t1, t2).runNow()))
    __obj.updateDynamic("ExportRange_32bit")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Boolean) => ExportRange_32bit(t0, t1, t2).runNow()))
    __obj.updateDynamic("GetIDRange")(GetIDRange.toJsFn)
    __obj.updateDynamic("IsLoggingEnabled")(IsLoggingEnabled.toJsFn)
    __obj.updateDynamic("SetLoggingEnabled")(js.Any.fromFunction1((t0: scala.Boolean) => SetLoggingEnabled(t0).runNow()))
    __obj.asInstanceOf[IVaultEventLogOperations]
  }
}

