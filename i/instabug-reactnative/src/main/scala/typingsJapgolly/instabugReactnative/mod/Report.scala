package typingsJapgolly.instabugReactnative.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  def addFileAttachmentWithData(data: String, filename: String): Unit
  def addFileAttachmentWithUrl(url: String, filename: String): Unit
  def appendConsoleLog(consoleLog: String): Unit
  def appendTag(tag: String): Unit
  def logDebug(log: String): Unit
  def logError(log: String): Unit
  def logInfo(log: String): Unit
  def logVerbose(log: String): Unit
  def logWarn(log: String): Unit
  def setUserAttribute(key: String, value: String): Unit
}

object Report {
  @scala.inline
  def apply(
    addFileAttachmentWithData: (String, String) => Callback,
    addFileAttachmentWithUrl: (String, String) => Callback,
    appendConsoleLog: String => Callback,
    appendTag: String => Callback,
    logDebug: String => Callback,
    logError: String => Callback,
    logInfo: String => Callback,
    logVerbose: String => Callback,
    logWarn: String => Callback,
    setUserAttribute: (String, String) => Callback
  ): Report = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addFileAttachmentWithData")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addFileAttachmentWithData(t0, t1).runNow()))
    __obj.updateDynamic("addFileAttachmentWithUrl")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addFileAttachmentWithUrl(t0, t1).runNow()))
    __obj.updateDynamic("appendConsoleLog")(js.Any.fromFunction1((t0: java.lang.String) => appendConsoleLog(t0).runNow()))
    __obj.updateDynamic("appendTag")(js.Any.fromFunction1((t0: java.lang.String) => appendTag(t0).runNow()))
    __obj.updateDynamic("logDebug")(js.Any.fromFunction1((t0: java.lang.String) => logDebug(t0).runNow()))
    __obj.updateDynamic("logError")(js.Any.fromFunction1((t0: java.lang.String) => logError(t0).runNow()))
    __obj.updateDynamic("logInfo")(js.Any.fromFunction1((t0: java.lang.String) => logInfo(t0).runNow()))
    __obj.updateDynamic("logVerbose")(js.Any.fromFunction1((t0: java.lang.String) => logVerbose(t0).runNow()))
    __obj.updateDynamic("logWarn")(js.Any.fromFunction1((t0: java.lang.String) => logWarn(t0).runNow()))
    __obj.updateDynamic("setUserAttribute")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setUserAttribute(t0, t1).runNow()))
    __obj.asInstanceOf[Report]
  }
}

