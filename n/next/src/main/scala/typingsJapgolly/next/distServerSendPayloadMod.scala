package typingsJapgolly.next

import typingsJapgolly.next.anon.Options
import typingsJapgolly.next.distServerBaseHttpMod.BaseNextResponse
import typingsJapgolly.next.nextBooleans.`false`
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerSendPayloadMod {
  
  @JSImport("next/dist/server/send-payload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendEtagResponse(req: IncomingMessage, res: ServerResponse[IncomingMessage]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEtagResponse")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def sendEtagResponse(req: IncomingMessage, res: ServerResponse[IncomingMessage], etag: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEtagResponse")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], etag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sendRenderResult(hasReqResResultTypeGenerateEtagsPoweredByHeaderOptions: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendRenderResult")(hasReqResResultTypeGenerateEtagsPoweredByHeaderOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setRevalidateHeaders(res: BaseNextResponse[Any], options: PayloadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRevalidateHeaders")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRevalidateHeaders(res: ServerResponse[IncomingMessage], options: PayloadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRevalidateHeaders")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.anon.Private
    - typingsJapgolly.next.anon.Stateful
    - typingsJapgolly.next.anon.Revalidate
  */
  trait PayloadOptions extends StObject
  object PayloadOptions {
    
    inline def Private(): typingsJapgolly.next.anon.Private = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("private")(true)
      __obj.asInstanceOf[typingsJapgolly.next.anon.Private]
    }
    
    inline def Revalidate(`private`: Boolean, revalidate: Double | `false`): typingsJapgolly.next.anon.Revalidate = {
      val __obj = js.Dynamic.literal(revalidate = revalidate.asInstanceOf[js.Any], stateful = false)
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.anon.Revalidate]
    }
    
    inline def Stateful(`private`: Boolean): typingsJapgolly.next.anon.Stateful = {
      val __obj = js.Dynamic.literal(stateful = true)
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.anon.Stateful]
    }
  }
}
