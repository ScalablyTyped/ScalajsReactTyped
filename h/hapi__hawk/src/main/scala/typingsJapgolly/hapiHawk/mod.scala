package typingsJapgolly.hapiHawk

import typingsJapgolly.hapiBoom.mod.Boom
import typingsJapgolly.hapiBoom.mod.unauthorized.Attributes
import typingsJapgolly.hapiBoom.mod.unauthorized.MissingAuth
import typingsJapgolly.hapiHapi.mod.Server
import typingsJapgolly.hapiHawk.clientMod.AuthenticateOptions
import typingsJapgolly.hapiHawk.clientMod.Authentication
import typingsJapgolly.hapiHawk.clientMod.BewitOptions
import typingsJapgolly.hapiHawk.clientMod.Credentials
import typingsJapgolly.hapiHawk.clientMod.HeaderOptions
import typingsJapgolly.hapiHawk.clientMod.Header_
import typingsJapgolly.hapiHawk.clientMod.MessageOptions
import typingsJapgolly.hapiHawk.clientMod.Message_
import typingsJapgolly.hapiHawk.cryptoMod.Artifacts
import typingsJapgolly.hapiHawk.cryptoMod.TimestampMessage_
import typingsJapgolly.hapiHawk.serverMod.AuthenticateBewitOptions
import typingsJapgolly.hapiHawk.serverMod.AuthenticateMessageOptions
import typingsJapgolly.hapiHawk.serverMod.AuthenticatedBewit
import typingsJapgolly.hapiHawk.serverMod.AuthenticatedMessage
import typingsJapgolly.hapiHawk.serverMod.CredentialsFunc
import typingsJapgolly.hapiHawk.utilsMod.CustomRequest
import typingsJapgolly.hapiHawk.utilsMod.Host
import typingsJapgolly.hapiHawk.utilsMod.ParseRequestOptions
import typingsJapgolly.hapiSntp.mod.Options
import typingsJapgolly.hapiSntp.mod.TimeOptions
import typingsJapgolly.node.cryptoMod.Hash
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.request.mod.Response
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object client extends js.Object {
    def authenticate(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts): Authentication = js.native
    def authenticate(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = js.native
    def authenticate(res: Response, credentials: Credentials, artifacts: Artifacts): Authentication = js.native
    def authenticate(res: Response, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = js.native
    def getBewit(uri: String, options: BewitOptions): String = js.native
    def header(uri: String, method: String): Header_ = js.native
    def header(uri: String, method: String, options: HeaderOptions): Header_ = js.native
    def message(host: String, port: Double, message: String): Message_ = js.native
    def message(host: String, port: Double, message: String, options: MessageOptions): Message_ = js.native
  }
  
  @js.native
  object crypto extends js.Object {
    val algorithms: js.Array[String] = js.native
    val headerVersion: String = js.native
    def calculateMac(`type`: String, credentials: Credentials, options: Artifacts): String = js.native
    def calculatePayloadHash(payload: String, algorithm: String, contentType: String): String = js.native
    def calculateTsMac(ts: String, credentials: Credentials): String = js.native
    def finalizePayloadHash(hash: Hash): String = js.native
    def generateNormalizedString(`type`: String, options: Artifacts): String = js.native
    def initializePayloadHash(algorithm: String, contentType: String): String = js.native
    def timestampMessage(credentials: Credentials, localtimeOffsetMsec: Double): TimestampMessage_ = js.native
  }
  
  @js.native
  object plugin extends js.Object {
    @js.native
    object plugin extends js.Object {
      val pkg: Record[String, js.Any] = js.native
      val requirements: Record[String, String] = js.native
      def register(server: Server): Unit = js.native
    }
    
  }
  
  @js.native
  object server extends js.Object {
    def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc): js.Promise[typingsJapgolly.hapiHawk.serverMod.Authentication] = js.native
    def authenticate(
      req: IncomingMessage,
      credentialsFunc: CredentialsFunc,
      options: typingsJapgolly.hapiHawk.serverMod.AuthenticateOptions
    ): js.Promise[typingsJapgolly.hapiHawk.serverMod.Authentication] = js.native
    def authenticateBewit(req: IncomingMessage, credentialsFunc: CredentialsFunc): AuthenticatedBewit = js.native
    def authenticateBewit(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateBewitOptions): AuthenticatedBewit = js.native
    def authenticateMessage(
      host: String,
      port: Double,
      message: String,
      authorization: Message_,
      credentialsFunc: CredentialsFunc,
      options: AuthenticateMessageOptions
    ): js.Promise[AuthenticatedMessage] = js.native
    def authenticatePayload(
      payload: String,
      credentials: typingsJapgolly.hapiHawk.serverMod.Credentials,
      artifacts: Artifacts,
      contentType: String
    ): Unit = js.native
    def authenticatePayloadHash(calculatedHash: String, artifacts: Artifacts): Unit = js.native
    def header(credentials: typingsJapgolly.hapiHawk.serverMod.Credentials, artifacts: Artifacts): String = js.native
    def header(
      credentials: typingsJapgolly.hapiHawk.serverMod.Credentials,
      artifacts: Artifacts,
      options: typingsJapgolly.hapiHawk.serverMod.HeaderOptions
    ): String = js.native
  }
  
  @js.native
  object sntp extends js.Object {
    def now(): Double = js.native
    def offset(): js.Promise[Double] = js.native
    def start(): js.Promise[Unit] = js.native
    def start(options: Options): js.Promise[Unit] = js.native
    def stop(): Unit = js.native
    def time(): js.Promise[TimeOptions] = js.native
    def time(options: Options): js.Promise[TimeOptions] = js.native
  }
  
  @js.native
  object uri extends js.Object {
    val authenticate: js.Function3[
        /* req */ IncomingMessage, 
        /* credentialsFunc */ CredentialsFunc, 
        /* options */ js.UndefOr[AuthenticateBewitOptions], 
        AuthenticatedBewit
      ] = js.native
    val getBewit: js.Function2[/* uri */ String, /* options */ BewitOptions, String] = js.native
  }
  
  @js.native
  object utils extends js.Object {
    val version: String = js.native
    def now(localtimeOffsetMsec: Double): Double = js.native
    def nowSecs(localtimeOffsetMsec: Double): Double = js.native
    def parseAuthorizationHeader(header: String): Record[String, String] = js.native
    def parseAuthorizationHeader(header: String, keys: js.Array[String]): Record[String, String] = js.native
    def parseContentType(): String = js.native
    def parseContentType(header: String): String = js.native
    def parseHost(req: RequestOptions): Host | Null = js.native
    def parseHost(req: RequestOptions, hostHeaderName: String): Host | Null = js.native
    def parseHost(req: typingsJapgolly.node.httpsMod.RequestOptions): Host | Null = js.native
    def parseHost(req: typingsJapgolly.node.httpsMod.RequestOptions, hostHeaderName: String): Host | Null = js.native
    def parseRequest(req: RequestOptions): CustomRequest = js.native
    def parseRequest(req: RequestOptions, options: ParseRequestOptions): CustomRequest = js.native
    def parseRequest(req: typingsJapgolly.node.httpsMod.RequestOptions): CustomRequest = js.native
    def parseRequest(req: typingsJapgolly.node.httpsMod.RequestOptions, options: ParseRequestOptions): CustomRequest = js.native
    def unauthorized(): Boom[_] with MissingAuth = js.native
    def unauthorized(message: String): Boom[_] with MissingAuth = js.native
    def unauthorized(message: String, attributes: String): Boom[_] with MissingAuth = js.native
    def unauthorized(message: String, attributes: Attributes): Boom[_] with MissingAuth = js.native
    @js.native
    object limits extends js.Object {
      /** Limit the length of uris and headers to avoid a DoS attack on string matching */
      var maxMatchLength: Double = js.native
    }
    
  }
  
}

