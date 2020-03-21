package typingsJapgolly.followRedirects.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("follow-redirects", "http")
@js.native
object http extends js.Object {
  @js.native
  class Agent ()
    extends typingsJapgolly.node.httpMod.Agent
  
  @js.native
  class ClientRequest protected ()
    extends typingsJapgolly.node.httpMod.ClientRequest {
    def this(url: String) = this()
  }
  
  @js.native
  class IncomingMessage protected ()
    extends typingsJapgolly.node.httpMod.IncomingMessage {
    def this(socket: Socket) = this()
  }
  
  @js.native
  class OutgoingMessage ()
    extends typingsJapgolly.node.httpMod.OutgoingMessage
  
  @js.native
  class Server ()
    extends typingsJapgolly.node.httpMod.Server
  
  @js.native
  class ServerResponse protected ()
    extends typingsJapgolly.node.httpMod.ServerResponse {
    def this(req: typingsJapgolly.node.httpMod.IncomingMessage) = this()
  }
  
  var METHODS: js.Array[String] = js.native
  var STATUS_CODES: StringDictionary[js.UndefOr[String]] with NumberDictionary[js.UndefOr[String]] = js.native
  @JSName("createServer")
  var createServer_Original: js.Function0[typingsJapgolly.node.httpMod.Server] = js.native
  var globalAgent: typingsJapgolly.node.httpMod.Agent = js.native
  var maxHeaderSize: Double = js.native
  def createServer(): typingsJapgolly.node.httpMod.Server = js.native
  def get(options: RequestOptions with FollowOptions[RequestOptions]): RedirectableRequest[
    typingsJapgolly.node.httpMod.ClientRequest, 
    typingsJapgolly.node.httpMod.IncomingMessage
  ] = js.native
  def get(
    options: RequestOptions with FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[
    typingsJapgolly.node.httpMod.ClientRequest, 
    typingsJapgolly.node.httpMod.IncomingMessage
  ] = js.native
  def get(options: String): RedirectableRequest[
    typingsJapgolly.node.httpMod.ClientRequest, 
    typingsJapgolly.node.httpMod.IncomingMessage
  ] = js.native
  def get(
    options: String,
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[
    typingsJapgolly.node.httpMod.ClientRequest, 
    typingsJapgolly.node.httpMod.IncomingMessage
  ] = js.native
  def request(options: RequestOptions with FollowOptions[RequestOptions]): RedirectableRequest[
    typingsJapgolly.node.httpMod.ClientRequest, 
    typingsJapgolly.node.httpMod.IncomingMessage
  ] = js.native
  def request(
    options: RequestOptions with FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[
    typingsJapgolly.node.httpMod.ClientRequest, 
    typingsJapgolly.node.httpMod.IncomingMessage
  ] = js.native
  def request(options: String): RedirectableRequest[
    typingsJapgolly.node.httpMod.ClientRequest, 
    typingsJapgolly.node.httpMod.IncomingMessage
  ] = js.native
  def request(
    options: String,
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[
    typingsJapgolly.node.httpMod.ClientRequest, 
    typingsJapgolly.node.httpMod.IncomingMessage
  ] = js.native
  @js.native
  object Agent
    extends TopLevel[Instantiable0[typingsJapgolly.node.httpMod.Agent]]
  
  @js.native
  object ClientRequest
    extends TopLevel[Instantiable1[/* url */ String, typingsJapgolly.node.httpMod.ClientRequest]]
  
  @js.native
  object IncomingMessage
    extends TopLevel[Instantiable1[/* socket */ Socket, typingsJapgolly.node.httpMod.IncomingMessage]]
  
  @js.native
  object OutgoingMessage
    extends TopLevel[Instantiable0[typingsJapgolly.node.httpMod.OutgoingMessage]]
  
  @js.native
  object Server
    extends TopLevel[Instantiable0[typingsJapgolly.node.httpMod.Server]]
  
  @js.native
  object ServerResponse
    extends TopLevel[
          Instantiable1[
            /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
            typingsJapgolly.node.httpMod.ServerResponse
          ]
        ]
  
}

