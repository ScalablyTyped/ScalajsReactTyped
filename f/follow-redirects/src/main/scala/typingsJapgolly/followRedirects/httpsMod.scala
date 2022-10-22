package typingsJapgolly.followRedirects

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.followRedirects.mod.FollowOptions
import typingsJapgolly.followRedirects.mod.FollowResponse
import typingsJapgolly.followRedirects.mod.RedirectableRequest
import typingsJapgolly.node.httpMod.ClientRequest
import typingsJapgolly.node.httpsMod.RequestOptions
import typingsJapgolly.node.nodeColonhttpMod.IncomingMessage
import typingsJapgolly.node.nodeColonhttpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined follow-redirects.follow-redirects.Override<{readonly request (options : node.https.RequestOptions): node.node:http.ClientRequest, readonly request (options : string): node.node:http.ClientRequest, readonly request (options : node.node:url.URL): node.node:http.ClientRequest, readonly request (options : node.https.RequestOptions, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly request (options : string, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly request (options : node.node:url.URL, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly request (url : string, options : node.https.RequestOptions): node.node:http.ClientRequest, readonly request (url : node.node:url.URL, options : node.https.RequestOptions): node.node:http.ClientRequest, readonly request (url : string, options : node.https.RequestOptions, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly request (url : node.node:url.URL, options : node.https.RequestOptions, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly get (options : node.https.RequestOptions): node.node:http.ClientRequest, readonly get (options : string): node.node:http.ClientRequest, readonly get (options : node.node:url.URL): node.node:http.ClientRequest, readonly get (options : node.https.RequestOptions, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly get (options : string, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly get (options : node.node:url.URL, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly get (url : string, options : node.https.RequestOptions): node.node:http.ClientRequest, readonly get (url : node.node:url.URL, options : node.https.RequestOptions): node.node:http.ClientRequest, readonly get (url : string, options : node.https.RequestOptions, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly get (url : node.node:url.URL, options : node.https.RequestOptions, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly createServer <Request extends new (socket : node.node:net.Socket): node.node:http.IncomingMessage = new (socket : node.node:net.Socket): node.node:http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>>(): node.https.Server<Request, Response>, readonly createServer <Request extends new (socket : node.node:net.Socket): node.node:http.IncomingMessage = new (socket : node.node:net.Socket): node.node:http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>>(requestListener : node.http.RequestListener<Request, Response>): node.https.Server<Request, Response>, readonly createServer <Request extends new (socket : node.node:net.Socket): node.node:http.IncomingMessage = new (socket : node.node:net.Socket): node.node:http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>>(options : node.https.ServerOptions<Request, Response>): node.https.Server<Request, Response>, readonly createServer <Request extends new (socket : node.node:net.Socket): node.node:http.IncomingMessage = new (socket : node.node:net.Socket): node.node:http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>>(options : node.https.ServerOptions<Request, Response>, requestListener : node.http.RequestListener<Request, Response>): node.https.Server<Request, Response>,   Agent :new (): node.https.Agent,   Server :new <Request extends new (socket : node.node:net.Socket): node.node:http.IncomingMessage = new (socket : node.node:net.Socket): node.node:http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>>(): node.https.Server<Request, Response>,   globalAgent :node.https.Agent}, follow-redirects.follow-redirects.RedirectScheme<node.https.RequestOptions, node.http.ClientRequest, node.http.IncomingMessage>> */
object httpsMod {
  
  @JSImport("follow-redirects/https", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/https", "Agent")
  @js.native
  open class Agent ()
    extends typingsJapgolly.node.httpsMod.Agent
  @JSImport("follow-redirects/https", "Agent")
  @js.native
  def Agent: Instantiable0[typingsJapgolly.node.httpsMod.Agent] = js.native
  inline def Agent_=(x: Instantiable0[typingsJapgolly.node.httpsMod.Agent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Agent")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/https", "Server")
  @js.native
  open class Server[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
  ] */] ()
    extends typingsJapgolly.node.httpsMod.Server[Request, Response]
  @JSImport("follow-redirects/https", "Server")
  @js.native
  def Server: Instantiable0[
    typingsJapgolly.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
      ]
    ]
  ] = js.native
  inline def Server_=(
    x: Instantiable0[
      typingsJapgolly.node.httpsMod.Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
        ]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
  
  inline def createServer[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
  ] */](): typingsJapgolly.node.httpsMod.Server[Request, Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typingsJapgolly.node.httpsMod.Server[Request, Response]]
  @JSImport("follow-redirects/https", "createServer")
  @js.native
  def createServer_FhttpsMod: js.Function0[
    typingsJapgolly.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
      ]
    ]
  ] = js.native
  
  inline def createServer_FhttpsMod_=(
    x: js.Function0[
      typingsJapgolly.node.httpsMod.Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
        ]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createServer")(x.asInstanceOf[js.Any])
  
  inline def get(url: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: RequestOptions & FollowOptions[RequestOptions]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: Unit,
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  /**
    * This function has two overloads:
    * ```typescript
    * get(options: string | URL | Options, callback)
    * get(url: string | URL, options: Options, callback)
    * ```
    */
  inline def get(url: String): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(url: String, options: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: String,
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: String,
    options: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: String,
    options: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: String,
    options: Unit,
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(url: URL_): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(url: URL_, options: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: URL_,
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: URL_,
    options: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: URL_,
    options: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def get(
    url: URL_,
    options: Unit,
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  
  @JSImport("follow-redirects/https", "globalAgent")
  @js.native
  def globalAgent: typingsJapgolly.node.httpsMod.Agent = js.native
  inline def globalAgent_=(x: typingsJapgolly.node.httpsMod.Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  inline def request(url: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: RequestOptions & FollowOptions[RequestOptions]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: Unit,
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  /**
    * This function has two overloads:
    * ```typescript
    * request(options: string | URL | Options, callback)
    * request(url: string | URL, options: Options, callback)
    * ```
    */
  inline def request(url: String): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(url: String, options: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: String,
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: String,
    options: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: String,
    options: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: String,
    options: Unit,
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(url: URL_): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(url: URL_, options: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: URL_,
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: URL_,
    options: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: URL_,
    options: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit],
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
  inline def request(
    url: URL_,
    options: Unit,
    callback: js.Function1[/* res */ typingsJapgolly.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typingsJapgolly.node.httpMod.IncomingMessage]]
}
