package typingsJapgolly.jsreportClient

import typingsJapgolly.jsreportClient.anon.PartialRequest
import typingsJapgolly.jsreportClient.mod.jsreportCoreAugmentingMod.Client
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): Client = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def apply(url: String, username: String): Client = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], username.asInstanceOf[js.Any])).asInstanceOf[Client]
  inline def apply(url: String, username: String, password: String): Client = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Client]
  inline def apply(url: String, username: Unit, password: String): Client = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Client]
  
  @JSImport("jsreport-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    @js.native
    trait Client extends StObject {
      
      def render(req: PartialRequest): js.Promise[ClientRenderResponse] = js.native
      def render(req: PartialRequest, options: js.Object): js.Promise[ClientRenderResponse] = js.native
    }
    
    @js.native
    trait ClientRenderResponse extends ServerResponse[IncomingMessage] {
      
      def body(): js.Promise[Buffer] = js.native
    }
  }
}
