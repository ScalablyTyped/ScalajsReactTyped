package typingsJapgolly.thenRequest

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.formData.mod.Options
import typingsJapgolly.formData.mod.^
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.thenRequest.libRequestFnMod.RequestFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("then-request", JSImport.Default)
  @js.native
  val default: RequestFn = js.native
  
  @JSImport("then-request", "FormData")
  @js.native
  open class FormData () extends ^ {
    def this(options: Options) = this()
  }
  
  @JSImport("then-request", "ResponsePromise")
  @js.native
  open class ResponsePromise ()
    extends typingsJapgolly.thenRequest.libResponsePromiseMod.ResponsePromise
  
  type Response = typingsJapgolly.httpResponseObject.mod.^[Buffer | String]
  
  type _To = RequestFn
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: RequestFn = default
}
