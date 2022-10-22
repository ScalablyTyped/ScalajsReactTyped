package typingsJapgolly.electron

import typingsJapgolly.electron.Electron.Renderer.ContextBridge
import typingsJapgolly.electron.Electron.Renderer.IpcRenderer
import typingsJapgolly.electron.Electron.Renderer.WebFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("electron/renderer", "contextBridge")
  @js.native
  val contextBridge: ContextBridge = js.native
  
  @JSImport("electron/renderer", "ipcRenderer")
  @js.native
  val ipcRenderer: IpcRenderer = js.native
  
  @JSImport("electron/renderer", "webFrame")
  @js.native
  val webFrame: WebFrame = js.native
}
