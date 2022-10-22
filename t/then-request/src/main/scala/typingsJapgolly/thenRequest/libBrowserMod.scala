package typingsJapgolly.thenRequest

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.httpResponseObject.mod.^
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.thenRequest.libRequestFnMod.RequestFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBrowserMod extends Shortcut {
  
  @JSImport("then-request/lib/browser", JSImport.Default)
  @js.native
  val default: RequestFn = js.native
  
  @JSImport("then-request/lib/browser", "FormData")
  @js.native
  val FormData: Any = js.native
  
  @JSImport("then-request/lib/browser", "ResponsePromise")
  @js.native
  open class ResponsePromise ()
    extends typingsJapgolly.thenRequest.libResponsePromiseMod.ResponsePromise
  
  type Response = ^[Buffer | String]
  
  type _To = RequestFn
  
  /* This means you don't have to write `default`, but can instead just say `libBrowserMod.foo` */
  override def _to: RequestFn = default
}
