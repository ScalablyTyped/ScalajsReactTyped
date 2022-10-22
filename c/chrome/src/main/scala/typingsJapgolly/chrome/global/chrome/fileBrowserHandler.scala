package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.chrome.fileBrowserHandler.FileBrowserHandlerExecuteEvent
import typingsJapgolly.chrome.chrome.fileBrowserHandler.SelectionParams
import typingsJapgolly.chrome.chrome.fileBrowserHandler.SelectionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// File Browser Handler
////////////////////
/**
  * Use the chrome.fileBrowserHandler API to extend the Chrome OS file browser. For example, you can use this API to enable users to upload files to your website.
  * Availability: Since Chrome 12.
  * Permissions:  "fileBrowserHandler"
  * Important: This API works only on Chrome OS.
  */
object fileBrowserHandler {
  
  @JSGlobal("chrome.fileBrowserHandler")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.fileBrowserHandler.onExecute")
  @js.native
  def onExecute: FileBrowserHandlerExecuteEvent = js.native
  inline def onExecute_=(x: FileBrowserHandlerExecuteEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExecute")(x.asInstanceOf[js.Any])
  
  inline def selectFile(selectionParams: SelectionParams, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectFile")(selectionParams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
