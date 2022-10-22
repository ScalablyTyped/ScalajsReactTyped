package typingsJapgolly.googleGax.buildSrcFallbackMod

import typingsJapgolly.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typingsJapgolly.googleAuthLibrary.mod.GoogleAuth
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleGax.anon.GrpcClientOptionsfallback
import typingsJapgolly.googleGax.anon.TypeofMessage
import typingsJapgolly.googleGax.anon.authOAuth2Clientfallbackb
import typingsJapgolly.googleGax.buildSrcFallbackServiceStubMod.FallbackServiceStub
import typingsJapgolly.googleGax.buildSrcGaxMod.ClientConfig
import typingsJapgolly.googleGax.buildSrcGrpcMod.ClientStubOptions
import typingsJapgolly.googleGax.googleGaxStrings.proto
import typingsJapgolly.googleGax.googleGaxStrings.rest
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.protobufjs.mod.INamespace
import typingsJapgolly.protobufjs.mod.Root
import typingsJapgolly.protobufjs.mod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "GrpcClient")
@js.native
/**
  * gRPC-fallback version of GrpcClient
  * Implements GrpcClient API for a browser using grpc-fallback protocol (sends serialized protobuf to HTTP/1 $rpc endpoint).
  *
  * @param {Object=} options.auth - An instance of OAuth2Client to use in browser, or an instance of GoogleAuth from google-auth-library
  *  to use in Node.js. Required for browser, optional for Node.js.
  * @constructor
  */
open class GrpcClient () extends StObject {
  def this(options: GrpcClientOptionsfallback | authOAuth2Clientfallbackb) = this()
  
  var auth: js.UndefOr[OAuth2Client | GoogleAuth[JSONClient]] = js.native
  
  var authClient: js.UndefOr[AuthClient] = js.native
  
  /**
    * gRPC-fallback version of constructSettings
    * A wrapper of {@link constructSettings} function under the gRPC context.
    *
    * Most of parameters are common among constructSettings, please take a look.
    * @param {string} serviceName - The fullly-qualified name of the service.
    * @param {Object} clientConfig - A dictionary of the client config.
    * @param {Object} configOverrides - A dictionary of overriding configs.
    * @param {Object} headers - A dictionary of additional HTTP header name to
    *   its value.
    * @return {Object} A mapping of method names to CallSettings.
    */
  def constructSettings(
    serviceName: String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    headers: OutgoingHttpHeaders
  ): Any = js.native
  
  /**
    * gRPC-fallback version of createStub
    * Creates a gRPC-fallback stub with authentication headers built from supplied OAuth2Client instance
    *
    * @param {function} CreateStub - The constructor function of the stub.
    * @param {Object} service - A protobufjs Service object (as returned by lookupService)
    * @param {Object} opts - Connection options, as described below.
    * @param {string} opts.servicePath - The hostname of the API endpoint service.
    * @param {number} opts.port - The port of the service.
    * @return {Promise} A promise which resolves to a gRPC-fallback service stub, which is a protobuf.js service stub instance modified to match the gRPC stub API
    */
  def createStub(service: Service, opts: ClientStubOptions): js.Promise[FallbackServiceStub] = js.native
  def createStub(service: Service, opts: ClientStubOptions, customServicePath: Boolean): js.Promise[FallbackServiceStub] = js.native
  
  var fallback: Boolean | rest | proto = js.native
  
  var grpcVersion: String = js.native
  
  var httpRules: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.api.IHttpRule */ Any
    ]
  ] = js.native
  
  /**
    * gRPC-fallback version of loadProto
    * Loads the protobuf root object from a JSON object created from a proto file
    * @param {Object} jsonObject - A JSON version of a protofile created usin protobuf.js
    * @returns {Object} Root namespace of proto JSON
    */
  def loadProto(jsonObject: js.Object): Root = js.native
  
  def loadProtoJSON(json: INamespace): Root = js.native
  def loadProtoJSON(json: INamespace, ignoreCache: Boolean): Root = js.native
  
  var numericEnums: Boolean = js.native
}
/* static members */
object GrpcClient {
  
  @JSImport("google-gax/build/src/fallback", "GrpcClient")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * In rare cases users might need to deallocate all memory consumed by loaded protos.
    * This method will delete the proto cache content.
    */
  inline def clearProtoCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearProtoCache")().asInstanceOf[Unit]
  
  /**
    * Creates a 'bytelength' function for a given proto message class.
    *
    * See {@link BundleDescriptor} about the meaning of the return value.
    *
    * @param {function} message - a constructor function that is generated by
    *   protobuf.js. Assumes 'encoder' field in the message.
    * @return {function(Object):number} - a function to compute the byte length
    *   for an object.
    */
  inline def createByteLengthFunction(message: TypeofMessage): js.Function1[/* obj */ js.Object, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("createByteLengthFunction")(message.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Object, Double]]
  
  @JSImport("google-gax/build/src/fallback", "GrpcClient.getServiceMethods")
  @js.native
  def getServiceMethods: Any = js.native
  inline def getServiceMethods_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getServiceMethods")(x.asInstanceOf[js.Any])
  
  @JSImport("google-gax/build/src/fallback", "GrpcClient.protoCache")
  @js.native
  def protoCache: Any = js.native
  inline def protoCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protoCache")(x.asInstanceOf[js.Any])
}
