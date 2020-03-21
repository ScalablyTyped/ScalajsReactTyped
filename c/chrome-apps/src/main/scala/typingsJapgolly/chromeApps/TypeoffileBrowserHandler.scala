package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.events.Event
import typingsJapgolly.chromeApps.chrome.fileBrowserHandler.FileBrowserHandleExecuteId
import typingsJapgolly.chromeApps.chrome.fileBrowserHandler.SelectFileParameters
import typingsJapgolly.chromeApps.chrome.fileBrowserHandler.SelectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoffileBrowserHandler extends js.Object {
  /**
    * Fired when file system action is executed from ChromeOS file browser.
    */
  val onExecute: Event[
    js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ AnonEntries, Unit]
  ]
  /**
    * Prompts user to select file path under which file should be saved.
    * When the file is selected, file access permission required to use
    * the file (read, write and create) are granted to the caller.
    * The file will not actually get created during the function call,
    * so function caller must ensure its existence before using it.
    * The function has to be invoked with a user gesture.
    * @param params Parameters that will be used while selecting the file.
    * @param callback Function called upon completion.
    */
  def selectFile(params: SelectFileParameters, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit
}

object TypeoffileBrowserHandler {
  @scala.inline
  def apply(
    onExecute: Event[
      js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ AnonEntries, Unit]
    ],
    selectFile: (SelectFileParameters, js.Function1[/* result */ SelectionResult, Unit]) => Callback
  ): TypeoffileBrowserHandler = {
    val __obj = js.Dynamic.literal(onExecute = onExecute.asInstanceOf[js.Any])
    __obj.updateDynamic("selectFile")(js.Any.fromFunction2((t0: typingsJapgolly.chromeApps.chrome.fileBrowserHandler.SelectFileParameters, t1: js.Function1[
  /* result */ typingsJapgolly.chromeApps.chrome.fileBrowserHandler.SelectionResult, 
  scala.Unit]) => selectFile(t0, t1).runNow()))
    __obj.asInstanceOf[TypeoffileBrowserHandler]
  }
}

