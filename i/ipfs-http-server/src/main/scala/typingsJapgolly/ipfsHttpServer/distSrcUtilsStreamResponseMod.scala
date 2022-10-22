package typingsJapgolly.ipfsHttpServer

import typingsJapgolly.hapiHapi.mod.Request
import typingsJapgolly.hapiHapi.mod.ResponseObject
import typingsJapgolly.hapiHapi.mod.ResponseToolkit
import typingsJapgolly.ipfsHttpServer.anon.OnEnd
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsStreamResponseMod {
  
  @JSImport("ipfs-http-server/dist/src/utils/stream-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def streamResponse(request: Request, h: ResponseToolkit, getSource: js.Function0[AsyncIterable[Any]]): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamResponse")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any], getSource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  inline def streamResponse(request: Request, h: ResponseToolkit, getSource: js.Function0[AsyncIterable[Any]], options: OnEnd): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamResponse")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any], getSource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
}
