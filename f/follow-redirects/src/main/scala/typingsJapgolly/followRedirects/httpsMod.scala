package typingsJapgolly.followRedirects

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.followRedirects.mod.FollowOptions
import typingsJapgolly.followRedirects.mod.FollowResponse
import typingsJapgolly.followRedirects.mod.RedirectableRequest
import typingsJapgolly.node.httpMod.ClientRequest
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpsMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("follow-redirects/https", JSImport.Namespace)
@js.native
object httpsMod extends js.Object {
  @js.native
  class Agent ()
    extends typingsJapgolly.node.httpsMod.Agent
  
  @js.native
  class Server ()
    extends typingsJapgolly.node.httpsMod.Server
  
  @JSName("createServer")
  var createServer_Original: js.Function0[typingsJapgolly.node.httpsMod.Server] = js.native
  var globalAgent: typingsJapgolly.node.httpsMod.Agent = js.native
  def createServer(): typingsJapgolly.node.httpsMod.Server = js.native
  def get(options: RequestOptions with FollowOptions[RequestOptions]): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def get(
    options: RequestOptions with FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def get(options: String): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def get(options: String, callback: js.Function1[/* res */ IncomingMessage with FollowResponse, Unit]): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def request(options: RequestOptions with FollowOptions[RequestOptions]): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def request(
    options: RequestOptions with FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def request(options: String): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def request(options: String, callback: js.Function1[/* res */ IncomingMessage with FollowResponse, Unit]): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  @js.native
  object Agent
    extends TopLevel[Instantiable0[typingsJapgolly.node.httpsMod.Agent]]
  
  @js.native
  object Server
    extends TopLevel[Instantiable0[typingsJapgolly.node.httpsMod.Server]]
  
}

