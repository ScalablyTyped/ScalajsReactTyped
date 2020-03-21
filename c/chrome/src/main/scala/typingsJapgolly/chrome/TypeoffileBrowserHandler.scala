package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.fileBrowserHandler.FileBrowserHandlerExecuteEvent
import typingsJapgolly.chrome.chrome.fileBrowserHandler.SelectionParams
import typingsJapgolly.chrome.chrome.fileBrowserHandler.SelectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoffileBrowserHandler extends js.Object {
  var onExecute: FileBrowserHandlerExecuteEvent
  def selectFile(selectionParams: SelectionParams, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit
}

object TypeoffileBrowserHandler {
  @scala.inline
  def apply(
    onExecute: FileBrowserHandlerExecuteEvent,
    selectFile: (SelectionParams, js.Function1[/* result */ SelectionResult, Unit]) => Callback
  ): TypeoffileBrowserHandler = {
    val __obj = js.Dynamic.literal(onExecute = onExecute.asInstanceOf[js.Any])
    __obj.updateDynamic("selectFile")(js.Any.fromFunction2((t0: typingsJapgolly.chrome.chrome.fileBrowserHandler.SelectionParams, t1: js.Function1[
  /* result */ typingsJapgolly.chrome.chrome.fileBrowserHandler.SelectionResult, 
  scala.Unit]) => selectFile(t0, t1).runNow()))
    __obj.asInstanceOf[TypeoffileBrowserHandler]
  }
}

