package typingsJapgolly.hapiHawk

import typingsJapgolly.hapiBoom.mod.Boom
import typingsJapgolly.hapiBoom.mod.unauthorized.Attributes
import typingsJapgolly.hapiBoom.mod.unauthorized.MissingAuth
import typingsJapgolly.hapiHapi.mod.Server_
import typingsJapgolly.hapiHawk.libClientMod.AuthenticateOptions
import typingsJapgolly.hapiHawk.libClientMod.Authentication
import typingsJapgolly.hapiHawk.libClientMod.BewitOptions
import typingsJapgolly.hapiHawk.libClientMod.Credentials
import typingsJapgolly.hapiHawk.libClientMod.HeaderOptions
import typingsJapgolly.hapiHawk.libClientMod.Header_
import typingsJapgolly.hapiHawk.libClientMod.MessageOptions
import typingsJapgolly.hapiHawk.libClientMod.Message_
import typingsJapgolly.hapiHawk.libCryptoMod.Artifacts
import typingsJapgolly.hapiHawk.libCryptoMod.TimestampMessage_
import typingsJapgolly.hapiHawk.libServerMod.AuthenticateBewitOptions
import typingsJapgolly.hapiHawk.libServerMod.AuthenticateMessageOptions
import typingsJapgolly.hapiHawk.libServerMod.AuthenticatedBewit
import typingsJapgolly.hapiHawk.libServerMod.AuthenticatedMessage
import typingsJapgolly.hapiHawk.libServerMod.CredentialsFunc
import typingsJapgolly.hapiHawk.libUtilsMod.CustomRequest
import typingsJapgolly.hapiHawk.libUtilsMod.Host
import typingsJapgolly.hapiHawk.libUtilsMod.ParseRequestOptions
import typingsJapgolly.hapiSntp.mod.Options
import typingsJapgolly.hapiSntp.mod.TimeOptions
import typingsJapgolly.node.cryptoMod.Hash
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.request.mod.Response
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object client {
    
    @JSImport("@hapi/hawk", "client")
    @js.native
    val ^ : js.Any = js.native
    
    inline def authenticate(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts): Authentication = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(res.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[Authentication]
    inline def authenticate(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(res.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Authentication]
    inline def authenticate(res: Response, credentials: Credentials, artifacts: Artifacts): Authentication = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(res.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[Authentication]
    inline def authenticate(res: Response, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(res.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Authentication]
    
    inline def getBewit(uri: String, options: BewitOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBewit")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def header(uri: String, method: String): Header_ = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(uri.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Header_]
    inline def header(uri: String, method: String, options: HeaderOptions): Header_ = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(uri.asInstanceOf[js.Any], method.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Header_]
    
    inline def message(host: String, port: Double, message: String): Message_ = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Message_]
    inline def message(host: String, port: Double, message: String, options: MessageOptions): Message_ = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Message_]
  }
  
  object crypto {
    
    @JSImport("@hapi/hawk", "crypto")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@hapi/hawk", "crypto.algorithms")
    @js.native
    val algorithms: js.Array[String] = js.native
    
    inline def calculateMac(`type`: String, credentials: Credentials, options: Artifacts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateMac")(`type`.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def calculatePayloadHash(payload: String, algorithm: String, contentType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePayloadHash")(payload.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def calculateTsMac(ts: String, credentials: Credentials): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateTsMac")(ts.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def finalizePayloadHash(hash: Hash): String = ^.asInstanceOf[js.Dynamic].applyDynamic("finalizePayloadHash")(hash.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def generateNormalizedString(`type`: String, options: Artifacts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateNormalizedString")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@hapi/hawk", "crypto.headerVersion")
    @js.native
    val headerVersion: String = js.native
    
    inline def initializePayloadHash(algorithm: String, contentType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("initializePayloadHash")(algorithm.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def timestampMessage(credentials: Credentials, localtimeOffsetMsec: Double): TimestampMessage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timestampMessage")(credentials.asInstanceOf[js.Any], localtimeOffsetMsec.asInstanceOf[js.Any])).asInstanceOf[TimestampMessage_]
  }
  
  object plugin {
    
    object plugin {
      
      @JSImport("@hapi/hawk", "plugin.plugin")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@hapi/hawk", "plugin.plugin.pkg")
      @js.native
      val pkg: Record[String, Any] = js.native
      
      inline def register(server: Server_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(server.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @JSImport("@hapi/hawk", "plugin.plugin.requirements")
      @js.native
      val requirements: Record[String, String] = js.native
    }
  }
  
  object server {
    
    @JSImport("@hapi/hawk", "server")
    @js.native
    val ^ : js.Any = js.native
    
    inline def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc): js.Promise[typingsJapgolly.hapiHawk.libServerMod.Authentication] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.hapiHawk.libServerMod.Authentication]]
    inline def authenticate(
      req: IncomingMessage,
      credentialsFunc: CredentialsFunc,
      options: typingsJapgolly.hapiHawk.libServerMod.AuthenticateOptions
    ): js.Promise[typingsJapgolly.hapiHawk.libServerMod.Authentication] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.hapiHawk.libServerMod.Authentication]]
    
    inline def authenticateBewit(req: IncomingMessage, credentialsFunc: CredentialsFunc): AuthenticatedBewit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateBewit")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any])).asInstanceOf[AuthenticatedBewit]
    inline def authenticateBewit(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateBewitOptions): AuthenticatedBewit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateBewit")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AuthenticatedBewit]
    
    inline def authenticateMessage(
      host: String,
      port: Double,
      message: String,
      authorization: Message_,
      credentialsFunc: CredentialsFunc,
      options: AuthenticateMessageOptions
    ): js.Promise[AuthenticatedMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateMessage")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], message.asInstanceOf[js.Any], authorization.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthenticatedMessage]]
    
    inline def authenticatePayload(
      payload: String,
      credentials: typingsJapgolly.hapiHawk.libServerMod.Credentials,
      artifacts: Artifacts,
      contentType: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatePayload")(payload.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def authenticatePayloadHash(calculatedHash: String, artifacts: Artifacts): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatePayloadHash")(calculatedHash.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def header(credentials: typingsJapgolly.hapiHawk.libServerMod.Credentials, artifacts: Artifacts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def header(
      credentials: typingsJapgolly.hapiHawk.libServerMod.Credentials,
      artifacts: Artifacts,
      options: typingsJapgolly.hapiHawk.libServerMod.HeaderOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("header")(credentials.asInstanceOf[js.Any], artifacts.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object sntp {
    
    @JSImport("@hapi/hawk", "sntp")
    @js.native
    val ^ : js.Any = js.native
    
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
    
    inline def offset(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[js.Promise[Double]]
    
    inline def start(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Promise[Unit]]
    inline def start(options: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
    
    inline def time(): js.Promise[TimeOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[js.Promise[TimeOptions]]
    inline def time(options: Options): js.Promise[TimeOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TimeOptions]]
  }
  
  object uri {
    
    @JSImport("@hapi/hawk", "uri")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof server.authenticateBewit` */
    inline def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc): AuthenticatedBewit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any])).asInstanceOf[AuthenticatedBewit]
    inline def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateBewitOptions): AuthenticatedBewit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any], credentialsFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AuthenticatedBewit]
    
    /* was `typeof client.getBewit` */
    inline def getBewit(uri: String, options: BewitOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBewit")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object utils {
    
    @JSImport("@hapi/hawk", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    object limits {
      
      @JSImport("@hapi/hawk", "utils.limits")
      @js.native
      val ^ : js.Any = js.native
      
      /** Limit the length of uris and headers to avoid a DoS attack on string matching */
      @JSImport("@hapi/hawk", "utils.limits.maxMatchLength")
      @js.native
      def maxMatchLength: Double = js.native
      inline def maxMatchLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxMatchLength")(x.asInstanceOf[js.Any])
    }
    
    inline def now(localtimeOffsetMsec: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(localtimeOffsetMsec.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def nowSecs(localtimeOffsetMsec: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nowSecs")(localtimeOffsetMsec.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def parseAuthorizationHeader(header: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAuthorizationHeader")(header.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
    inline def parseAuthorizationHeader(header: String, keys: js.Array[String]): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAuthorizationHeader")(header.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
    
    inline def parseContentType(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseContentType")().asInstanceOf[String]
    inline def parseContentType(header: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseContentType")(header.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parseHost(req: RequestOptions): Host | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(req.asInstanceOf[js.Any]).asInstanceOf[Host | Null]
    inline def parseHost(req: RequestOptions, hostHeaderName: String): Host | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(req.asInstanceOf[js.Any], hostHeaderName.asInstanceOf[js.Any])).asInstanceOf[Host | Null]
    inline def parseHost(req: typingsJapgolly.node.httpsMod.RequestOptions): Host | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(req.asInstanceOf[js.Any]).asInstanceOf[Host | Null]
    inline def parseHost(req: typingsJapgolly.node.httpsMod.RequestOptions, hostHeaderName: String): Host | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(req.asInstanceOf[js.Any], hostHeaderName.asInstanceOf[js.Any])).asInstanceOf[Host | Null]
    
    inline def parseRequest(req: RequestOptions): CustomRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any]).asInstanceOf[CustomRequest]
    inline def parseRequest(req: RequestOptions, options: ParseRequestOptions): CustomRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CustomRequest]
    inline def parseRequest(req: typingsJapgolly.node.httpsMod.RequestOptions): CustomRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any]).asInstanceOf[CustomRequest]
    inline def parseRequest(req: typingsJapgolly.node.httpsMod.RequestOptions, options: ParseRequestOptions): CustomRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CustomRequest]
    
    inline def unauthorized(): Boom[Any] & MissingAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")().asInstanceOf[Boom[Any] & MissingAuth]
    inline def unauthorized(message: String): Boom[Any] & MissingAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Any] & MissingAuth]
    inline def unauthorized(message: String, attributes: String): Boom[Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Any] & MissingAuth]
    inline def unauthorized(message: String, attributes: Attributes): Boom[Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Any] & MissingAuth]
    inline def unauthorized(message: Unit, attributes: String): Boom[Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Any] & MissingAuth]
    inline def unauthorized(message: Unit, attributes: Attributes): Boom[Any] & MissingAuth = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Any] & MissingAuth]
    
    @JSImport("@hapi/hawk", "utils.version")
    @js.native
    val version: String = js.native
  }
}
