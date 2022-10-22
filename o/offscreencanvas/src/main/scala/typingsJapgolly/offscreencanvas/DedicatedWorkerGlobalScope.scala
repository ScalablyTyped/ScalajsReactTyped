package typingsJapgolly.offscreencanvas

import typingsJapgolly.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DedicatedWorkerGlobalScope extends StObject {
  
  def postMessage(message: Any): Unit = js.native
  def postMessage(message: Any, transfer: js.Array[Transferable | OffscreenCanvas]): Unit = js.native
}
