package typingsJapgolly.nextServer

import typingsJapgolly.nextServer.anon.GenerateEtags
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerSendHtmlMod {
  
  @JSImport("next-server/dist/server/send-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendHTML(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    html: String,
    hasGenerateEtagsPoweredByHeader: GenerateEtags
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendHTML")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], html.asInstanceOf[js.Any], hasGenerateEtagsPoweredByHeader.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
