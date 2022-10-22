package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.fileBrowserHandler.FileBrowserHandlerExecuteEvent
import typingsJapgolly.chrome.chrome.fileBrowserHandler.SelectionParams
import typingsJapgolly.chrome.chrome.fileBrowserHandler.SelectionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoffileBrowserHandler extends StObject {
  
  var onExecute: FileBrowserHandlerExecuteEvent
  
  def selectFile(selectionParams: SelectionParams, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit
}
object TypeoffileBrowserHandler {
  
  inline def apply(
    onExecute: FileBrowserHandlerExecuteEvent,
    selectFile: (SelectionParams, js.Function1[/* result */ SelectionResult, Unit]) => Callback
  ): TypeoffileBrowserHandler = {
    val __obj = js.Dynamic.literal(onExecute = onExecute.asInstanceOf[js.Any], selectFile = js.Any.fromFunction2((t0: SelectionParams, t1: js.Function1[/* result */ SelectionResult, Unit]) => (selectFile(t0, t1)).runNow()))
    __obj.asInstanceOf[TypeoffileBrowserHandler]
  }
  
  extension [Self <: TypeoffileBrowserHandler](x: Self) {
    
    inline def setOnExecute(value: FileBrowserHandlerExecuteEvent): Self = StObject.set(x, "onExecute", value.asInstanceOf[js.Any])
    
    inline def setSelectFile(value: (SelectionParams, js.Function1[/* result */ SelectionResult, Unit]) => Callback): Self = StObject.set(x, "selectFile", js.Any.fromFunction2((t0: SelectionParams, t1: js.Function1[/* result */ SelectionResult, Unit]) => (value(t0, t1)).runNow()))
  }
}
