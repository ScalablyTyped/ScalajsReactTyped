package typingsJapgolly.thenRequest

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.promise.mod.ThenPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResponsePromiseMod {
  
  @JSImport("then-request/lib/ResponsePromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(result: ThenPromise[typingsJapgolly.httpResponseObject.mod.^[Buffer | String]]): ResponsePromise = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(result.asInstanceOf[js.Any]).asInstanceOf[ResponsePromise]
  
  @JSImport("then-request/lib/ResponsePromise", "ResponsePromise")
  @js.native
  open class ResponsePromise ()
    extends StObject
       with ThenPromise[typingsJapgolly.httpResponseObject.mod.^[Buffer | String]] {
    
    def getBody(): ThenPromise[Buffer | String] = js.native
    def getBody(encoding: String): ThenPromise[String] = js.native
  }
}
