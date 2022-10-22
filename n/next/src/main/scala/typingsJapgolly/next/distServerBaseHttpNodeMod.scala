package typingsJapgolly.next

import typingsJapgolly.next.anon.SYMBOLCLEAREDCOOKIES
import typingsJapgolly.next.distServerApiUtilsMod.NextApiRequestCookies
import typingsJapgolly.next.distServerBaseHttpMod.BaseNextRequest
import typingsJapgolly.next.distServerBaseHttpMod.BaseNextResponse
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerBaseHttpNodeMod {
  
  @JSImport("next/dist/server/base-http/node", "NodeNextRequest")
  @js.native
  open class NodeNextRequest protected () extends BaseNextRequest[Readable] {
    def this(_req: Req) = this()
    
    /* private */ var _req: Any = js.native
    
    def originalRequest: Req = js.native
    def originalRequest_=(value: Req): Unit = js.native
  }
  
  @JSImport("next/dist/server/base-http/node", "NodeNextResponse")
  @js.native
  open class NodeNextResponse protected () extends BaseNextResponse[Writable] {
    def this(_res: ServerResponse[IncomingMessage] & SYMBOLCLEAREDCOOKIES) = this()
    
    /* private */ var _res: Any = js.native
    
    def originalResponse: ServerResponse[IncomingMessage] & SYMBOLCLEAREDCOOKIES = js.native
    
    @JSName("statusCode")
    def statusCode_MNodeNextResponse: Double = js.native
    
    @JSName("statusMessage")
    def statusMessage_MNodeNextResponse: String = js.native
    
    /* private */ var textBody: Any = js.native
  }
  
  @js.native
  trait Req extends IncomingMessage {
    
    var cookies: js.UndefOr[NextApiRequestCookies] = js.native
  }
}
