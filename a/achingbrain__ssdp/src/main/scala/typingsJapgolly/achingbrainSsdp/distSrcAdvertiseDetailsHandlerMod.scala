package typingsJapgolly.achingbrainSsdp

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAdvertiseDetailsHandlerMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/advertise/details-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detailsHandler(
    createDetails: js.Function0[js.Promise[Record[String, Any]]],
    request: IncomingMessage,
    response: ServerResponse[IncomingMessage]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detailsHandler")(createDetails.asInstanceOf[js.Any], request.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
