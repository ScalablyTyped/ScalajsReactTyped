package typingsJapgolly.opentelemetryInstrumentationGrpc

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable7
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Console
import typingsJapgolly.grpc.mod.Deadline
import typingsJapgolly.grpc.mod.Filename
import typingsJapgolly.grpc.mod.GenericClientOptions
import typingsJapgolly.grpc.mod.GoogleOAuth2Client
import typingsJapgolly.grpc.mod.LoadObjectOptions
import typingsJapgolly.grpc.mod.LoadOptions
import typingsJapgolly.grpc.mod.ServiceDefinition
import typingsJapgolly.grpc.mod.logVerbosity
import typingsJapgolly.grpc.mod.metadataGenerator
import typingsJapgolly.grpcGrpcJs.anon.PartialChannelControlHelp
import typingsJapgolly.grpcGrpcJs.anon.PartialConsole
import typingsJapgolly.grpcGrpcJs.anon.PartialFailurePercentageE
import typingsJapgolly.grpcGrpcJs.anon.PartialSuccessRateEjectio
import typingsJapgolly.grpcGrpcJs.buildSrcAdminMod.GetHandlers
import typingsJapgolly.grpcGrpcJs.buildSrcAdminMod.GetServiceDefinition
import typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallMetadataGenerator
import typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.OAuth2Client
import typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.VerifyOptions
import typingsJapgolly.grpcGrpcJs.buildSrcChannelMod.Channel
import typingsJapgolly.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typingsJapgolly.grpcGrpcJs.buildSrcClientInterceptorsMod.InterceptingCallInterface
import typingsJapgolly.grpcGrpcJs.buildSrcClientMod.Client
import typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity
import typingsJapgolly.grpcGrpcJs.buildSrcDurationMod.Duration
import typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.Filter
import typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.FilterFactory
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.ChannelControlHelper
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancer
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancerConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfig
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfigConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcMakeClientMod.GrpcObject
import typingsJapgolly.grpcGrpcJs.buildSrcMakeClientMod.PackageDefinition
import typingsJapgolly.grpcGrpcJs.buildSrcMakeClientMod.ServiceClientConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcResolverMod.ResolverConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.KeyCertPair
import typingsJapgolly.grpcGrpcJs.buildSrcServerMod.Server
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelInterfaceMod.SubchannelInterface
import typingsJapgolly.grpcGrpcJs.buildSrcUriParserMod.GrpcUri
import typingsJapgolly.grpcGrpcJs.mod.CallCredentials
import typingsJapgolly.grpcGrpcJs.mod.ChannelCredentials
import typingsJapgolly.grpcGrpcJs.mod.ServerCredentials
import typingsJapgolly.grpcGrpcJs.mod.experimental.OutlierDetectionLoadBalancingConfig
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.http2Mod.IncomingHttpHeaders
import typingsJapgolly.node.tlsMod.SecureContext
import typingsJapgolly.opentelemetryInstrumentationGrpc.buildSrcGrpcTypesMod.GrpcStatus
import typingsJapgolly.opentelemetryInstrumentationGrpc.opentelemetryInstrumentationGrpcBooleans.`true`
import typingsJapgolly.opentelemetryInstrumentationGrpc.opentelemetryInstrumentationGrpcStrings.json
import typingsJapgolly.opentelemetryInstrumentationGrpc.opentelemetryInstrumentationGrpcStrings.proto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Metadata extends StObject {
    
    var metadata: typingsJapgolly.grpcGrpcJs.mod.Metadata
  }
  object Metadata {
    
    inline def apply(metadata: typingsJapgolly.grpcGrpcJs.mod.Metadata): Metadata = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setMetadata(value: typingsJapgolly.grpcGrpcJs.mod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait Method extends StObject {
    
    var method: String
    
    var service: String
  }
  object Method {
    
    inline def apply(method: String, service: String): Method = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait OriginalName extends StObject {
    
    var originalName: js.UndefOr[String] = js.undefined
  }
  object OriginalName {
    
    inline def apply(): OriginalName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginalName]
    }
    
    extension [Self <: OriginalName](x: Self) {
      
      inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
      
      inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    var path: String
    
    var requestStream: Boolean
    
    var responseStream: Boolean
  }
  object Path {
    
    inline def apply(path: String, requestStream: Boolean, responseStream: Boolean): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestStream = requestStream.asInstanceOf[js.Any], responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRequestStream(value: Boolean): Self = StObject.set(x, "requestStream", value.asInstanceOf[js.Any])
      
      inline def setResponseStream(value: Boolean): Self = StObject.set(x, "responseStream", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    var metadata: typingsJapgolly.grpc.mod.Metadata
    
    var request: js.UndefOr[Any] = js.undefined
    
    var status: GrpcStatus
  }
  object Request {
    
    inline def apply(metadata: typingsJapgolly.grpc.mod.Metadata, status: GrpcStatus): Request = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setMetadata(value: typingsJapgolly.grpc.mod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setStatus(value: GrpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofCallCredentials
    extends StObject
       with Instantiable0[CallCredentials] {
    
    def createEmpty(): typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = js.native
    
    /**
      * Create a gRPC credential from a Google credential object.
      * @param googleCredentials The authentication client to use.
      * @return The resulting CallCredentials object.
      */
    def createFromGoogleCredential(googleCredentials: OAuth2Client): typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = js.native
    
    /**
      * Creates a new CallCredentials object from a given function that generates
      * Metadata objects.
      * @param metadataGenerator A function that accepts a set of options, and
      * generates a Metadata object based on these options, which is passed back
      * to the caller via a supplied (err, metadata) callback.
      */
    def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = js.native
  }
  
  @js.native
  trait TypeofChannelCredentials
    extends StObject
       with Instantiable0[ChannelCredentials] {
    
    /**
      * Return a new ChannelCredentials instance with credentials created using
      * the provided secureContext. The resulting instances can be used to
      * construct a Channel that communicates over TLS. gRPC will not override
      * anything in the provided secureContext, so the environment variables
      * GRPC_SSL_CIPHER_SUITES and GRPC_DEFAULT_SSL_ROOTS_FILE_PATH will
      * not be applied.
      * @param secureContext The return value of tls.createSecureContext()
      * @param verifyOptions Additional options to modify certificate verification
      */
    def createFromSecureContext(secureContext: SecureContext): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = js.native
    def createFromSecureContext(secureContext: SecureContext, verifyOptions: VerifyOptions): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = js.native
    
    /**
      * Return a new ChannelCredentials instance with no credentials.
      */
    def createInsecure(): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = js.native
    
    /**
      * Return a new ChannelCredentials instance with a given set of credentials.
      * The resulting instance can be used to construct a Channel that communicates
      * over TLS.
      * @param rootCerts The root certificate data.
      * @param privateKey The client certificate private key, if available.
      * @param certChain The client certificate key chain, if available.
      * @param verifyOptions Additional options to modify certificate verification
      */
    def createSsl(
      rootCerts: js.UndefOr[Buffer | Null],
      privateKey: js.UndefOr[Buffer | Null],
      certChain: js.UndefOr[Buffer | Null],
      verifyOptions: js.UndefOr[VerifyOptions]
    ): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = js.native
  }
  
  @js.native
  trait TypeofMetadata
    extends StObject
       with Instantiable0[typingsJapgolly.grpcGrpcJs.mod.Metadata] {
    
    /**
      * Returns a new Metadata object based fields in a given IncomingHttpHeaders
      * object.
      * @param headers An IncomingHttpHeaders object.
      */
    def fromHttp2Headers(headers: IncomingHttpHeaders): typingsJapgolly.grpcGrpcJs.buildSrcMetadataMod.Metadata = js.native
  }
  
  @js.native
  trait TypeofOutlierDetectionLoa
    extends StObject
       with Instantiable7[
          /* intervalMs */ Double | Null, 
          /* baseEjectionTimeMs */ Double | Null, 
          /* maxEjectionTimeMs */ Double | Null, 
          /* maxEjectionPercent */ Double | Null, 
          /* successRateEjection */ PartialSuccessRateEjectio | Null, 
          /* failurePercentageEjection */ PartialFailurePercentageE | Null, 
          /* childPolicy */ js.Array[LoadBalancingConfig], 
          OutlierDetectionLoadBalancingConfig
        ] {
    
    def createFromJson(obj: Any): typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerOutlierDetectionMod.OutlierDetectionLoadBalancingConfig = js.native
  }
  
  @js.native
  trait TypeofServerCredentials
    extends StObject
       with Instantiable0[ServerCredentials] {
    
    def createInsecure(): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
    
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
  }
  
  @js.native
  trait TypeofServerCredentialsInstantiable
    extends StObject
       with Instantiable0[typingsJapgolly.grpc.mod.ServerCredentials] {
    
    /**
      * Create insecure server credentials
      * @return The ServerCredentials
      */
    def createInsecure(): typingsJapgolly.grpc.mod.ServerCredentials = js.native
    
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[typingsJapgolly.grpc.mod.KeyCertPair]): typingsJapgolly.grpc.mod.ServerCredentials = js.native
    def createSsl(
      rootCerts: Null,
      keyCertPairs: js.Array[typingsJapgolly.grpc.mod.KeyCertPair],
      checkClientCertificate: Boolean
    ): typingsJapgolly.grpc.mod.ServerCredentials = js.native
    /**
      * Create SSL server credentials
      * @param rootCerts Root CA certificates for validating client certificates
      * @param keyCertPairs A list of private key and certificate chain pairs to
      * be used for authenticating the server
      * @param checkClientCertificate Indicates that the server should request
      * and verify the client's certificates.
      * Defaults to `false`.
      * @return The ServerCredentials
      */
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[typingsJapgolly.grpc.mod.KeyCertPair]): typingsJapgolly.grpc.mod.ServerCredentials = js.native
    def createSsl(
      rootCerts: Buffer,
      keyCertPairs: js.Array[typingsJapgolly.grpc.mod.KeyCertPair],
      checkClientCertificate: Boolean
    ): typingsJapgolly.grpc.mod.ServerCredentials = js.native
  }
  
  trait Typeofcredentials extends StObject {
    
    /**
      * Combine any number of CallCredentials into a single CallCredentials
      * object.
      * @param first The first CallCredentials object.
      * @param additional Any number of additional CallCredentials objects.
      * @return The resulting CallCredentials object.
      */
    def combineCallCredentials(
      first: typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials,
      additional: typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials*
    ): typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials
    
    /**
      * Combine a ChannelCredentials with any number of CallCredentials into a
      * single ChannelCredentials object.
      * @param channelCredentials The ChannelCredentials object.
      * @param callCredentials Any number of CallCredentials objects.
      * @return The resulting ChannelCredentials object.
      */
    def combineChannelCredentials(
      channelCredentials: typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials,
      callCredentials: typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials*
    ): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
    
    var createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any
    
    var createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any
    
    var createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any
    
    var createFromSecureContext: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any
    
    var createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any
    
    var createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any
  }
  object Typeofcredentials {
    
    inline def apply(
      combineCallCredentials: (typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials, /* repeated */ typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials) => typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials,
      combineChannelCredentials: (typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials, /* repeated */ typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials) => typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials,
      createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any,
      createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any,
      createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any,
      createFromSecureContext: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any,
      createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any,
      createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any
    ): Typeofcredentials = {
      val __obj = js.Dynamic.literal(combineCallCredentials = js.Any.fromFunction2(combineCallCredentials), combineChannelCredentials = js.Any.fromFunction2(combineChannelCredentials), createEmpty = createEmpty.asInstanceOf[js.Any], createFromGoogleCredential = createFromGoogleCredential.asInstanceOf[js.Any], createFromMetadataGenerator = createFromMetadataGenerator.asInstanceOf[js.Any], createFromSecureContext = createFromSecureContext.asInstanceOf[js.Any], createInsecure = createInsecure.asInstanceOf[js.Any], createSsl = createSsl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofcredentials]
    }
    
    extension [Self <: Typeofcredentials](x: Self) {
      
      inline def setCombineCallCredentials(
        value: (typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials, /* repeated */ typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials) => typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials
      ): Self = StObject.set(x, "combineCallCredentials", js.Any.fromFunction2(value))
      
      inline def setCombineChannelCredentials(
        value: (typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials, /* repeated */ typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials) => typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
      ): Self = StObject.set(x, "combineChannelCredentials", js.Any.fromFunction2(value))
      
      inline def setCreateEmpty(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any
      ): Self = StObject.set(x, "createEmpty", value.asInstanceOf[js.Any])
      
      inline def setCreateFromGoogleCredential(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any
      ): Self = StObject.set(x, "createFromGoogleCredential", value.asInstanceOf[js.Any])
      
      inline def setCreateFromMetadataGenerator(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any
      ): Self = StObject.set(x, "createFromMetadataGenerator", value.asInstanceOf[js.Any])
      
      inline def setCreateFromSecureContext(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any
      ): Self = StObject.set(x, "createFromSecureContext", value.asInstanceOf[js.Any])
      
      inline def setCreateInsecure(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any
      ): Self = StObject.set(x, "createInsecure", value.asInstanceOf[js.Any])
      
      inline def setCreateSsl(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any
      ): Self = StObject.set(x, "createSsl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofcredentialsCombineCallCredentials extends StObject {
    
    /**
      * Combine any number of CallCredentials into a single CallCredentials object
      * @param credentials The CallCredentials to compose
      * @return A credentials object that combines all of the input credentials
      */
    def combineCallCredentials(credentials: typingsJapgolly.grpc.mod.CallCredentials*): typingsJapgolly.grpc.mod.CallCredentials = js.native
    
    /**
      * Combine a ChannelCredentials with any number of CallCredentials into a single
      * ChannelCredentials object.
      * @param channelCredential The ChannelCredentials to start with
      * @param credentials The CallCredentials to compose
      * @return A credentials object that combines all of the input credentials
      */
    def combineChannelCredentials(
      channelCredential: typingsJapgolly.grpc.mod.ChannelCredentials,
      credentials: typingsJapgolly.grpc.mod.CallCredentials*
    ): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    
    /**
      * Create a gRPC credential from a Google credential object.
      * @param googleCredential The Google credential object to use
      * @return The resulting credentials object
      */
    def createFromGoogleCredential(googleCredential: GoogleOAuth2Client): typingsJapgolly.grpc.mod.CallCredentials = js.native
    
    /**
      * Create a gRPC credentials object from a metadata generation function. This
      * function gets the service URL and a callback as parameters. The error
      * passed to the callback can optionally have a 'code' value attached to it,
      * which corresponds to a status code that this library uses.
      * @param metadataGenerator The function that generates metadata
      * @return The credentials object
      */
    def createFromMetadataGenerator(metadataGenerator: metadataGenerator): typingsJapgolly.grpc.mod.CallCredentials = js.native
    
    /**
      * Create an insecure credentials object. This is used to create a channel that
      * does not use SSL. This cannot be composed with anything.
      * @return The insecure credentials object
      */
    def createInsecure(): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    
    /**
      * Create an SSL Credentials object. If using a client-side certificate, both
      * the second and third arguments must be passed.
      * @param rootCerts The root certificate data
      * @param privateKey The client certificate private key, if applicable
      * @param certChain The client certificate cert chain, if applicable
      * @param verifyOptions Additional peer verification options, if desired
      * @return The SSL Credentials object
      */
    def createSsl(): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Unit,
      privateKey: Unit,
      certChain: Unit,
      verifyOptions: typingsJapgolly.grpc.mod.VerifyOptions
    ): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Unit, privateKey: Unit, certChain: Buffer): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Unit,
      privateKey: Unit,
      certChain: Buffer,
      verifyOptions: typingsJapgolly.grpc.mod.VerifyOptions
    ): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Unit, privateKey: Buffer): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Unit,
      privateKey: Buffer,
      certChain: Unit,
      verifyOptions: typingsJapgolly.grpc.mod.VerifyOptions
    ): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Unit, privateKey: Buffer, certChain: Buffer): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Unit,
      privateKey: Buffer,
      certChain: Buffer,
      verifyOptions: typingsJapgolly.grpc.mod.VerifyOptions
    ): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Buffer): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Buffer,
      privateKey: Unit,
      certChain: Unit,
      verifyOptions: typingsJapgolly.grpc.mod.VerifyOptions
    ): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Buffer, privateKey: Unit, certChain: Buffer): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Buffer,
      privateKey: Unit,
      certChain: Buffer,
      verifyOptions: typingsJapgolly.grpc.mod.VerifyOptions
    ): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Buffer, privateKey: Buffer): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Buffer,
      privateKey: Buffer,
      certChain: Unit,
      verifyOptions: typingsJapgolly.grpc.mod.VerifyOptions
    ): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Buffer,
      privateKey: Buffer,
      certChain: Buffer,
      verifyOptions: typingsJapgolly.grpc.mod.VerifyOptions
    ): typingsJapgolly.grpc.mod.ChannelCredentials = js.native
  }
  
  @js.native
  trait Typeofexperimental extends StObject {
    
    var BackoffTimeout: Instantiable1[
        /* callback */ js.Function0[Unit], 
        typingsJapgolly.grpcGrpcJs.mod.experimental.BackoffTimeout
      ] = js.native
    
    var BaseFilter: Instantiable0[typingsJapgolly.grpcGrpcJs.mod.experimental.BaseFilter] = js.native
    
    var BaseSubchannelWrapper: Instantiable1[
        /* child */ SubchannelInterface, 
        typingsJapgolly.grpcGrpcJs.mod.experimental.BaseSubchannelWrapper
      ] = js.native
    
    var ChildLoadBalancerHandler: Instantiable1[
        /* channelControlHelper */ ChannelControlHelper, 
        typingsJapgolly.grpcGrpcJs.mod.experimental.ChildLoadBalancerHandler
      ] = js.native
    
    var FilterStackFactory: Instantiable1[
        /* factories */ js.Array[FilterFactory[Filter]], 
        typingsJapgolly.grpcGrpcJs.mod.experimental.FilterStackFactory
      ] = js.native
    
    var OutlierDetectionLoadBalancingConfig: TypeofOutlierDetectionLoa = js.native
    
    var QueuePicker: Instantiable1[
        /* loadBalancer */ LoadBalancer, 
        typingsJapgolly.grpcGrpcJs.mod.experimental.QueuePicker
      ] = js.native
    
    var UnavailablePicker: Instantiable0[typingsJapgolly.grpcGrpcJs.mod.experimental.UnavailablePicker] = js.native
    
    def createChildChannelControlHelper(parent: ChannelControlHelper, overrides: PartialChannelControlHelp): ChannelControlHelper = js.native
    
    def durationToMs(duration: Duration): Double = js.native
    
    def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig = js.native
    @JSName("getFirstUsableConfig")
    def getFirstUsableConfig_true(configs: js.Array[LoadBalancingConfig], fallbackTodefault: `true`): LoadBalancingConfig = js.native
    
    def log(severity: LogVerbosity, args: Any*): Unit = js.native
    
    def registerAdminService(getServiceDefinition: GetServiceDefinition, getHandlers: GetHandlers): Unit = js.native
    
    def registerLoadBalancerType(
      typeName: String,
      loadBalancerType: LoadBalancerConstructor,
      loadBalancingConfigType: LoadBalancingConfigConstructor
    ): Unit = js.native
    
    def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = js.native
    
    def subchannelAddressToString(address: SubchannelAddress): String = js.native
    
    def trace(severity: LogVerbosity, tracer: String, text: String): Unit = js.native
    
    def uriToString(uri: GrpcUri): String = js.native
    
    def validateLoadBalancingConfig(obj: Any): LoadBalancingConfig = js.native
  }
  
  @js.native
  trait TypeofgrpcJs extends StObject {
    
    var CallCredentials: TypeofCallCredentials = js.native
    
    var Channel: Instantiable3[
        /* target */ String, 
        /* credentials */ typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials, 
        /* options */ ChannelOptions, 
        typingsJapgolly.grpcGrpcJs.mod.Channel
      ] = js.native
    
    var ChannelCredentials: TypeofChannelCredentials = js.native
    
    var Client: Instantiable2[
        /* address */ String, 
        /* credentials */ typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials, 
        typingsJapgolly.grpcGrpcJs.mod.Client
      ] = js.native
    
    var InterceptingCall: Instantiable1[
        /* nextCall */ InterceptingCallInterface, 
        typingsJapgolly.grpcGrpcJs.mod.InterceptingCall
      ] = js.native
    
    var InterceptorConfigurationError: Instantiable1[/* message */ String, typingsJapgolly.grpcGrpcJs.mod.InterceptorConfigurationError] = js.native
    
    var ListenerBuilder: Instantiable0[typingsJapgolly.grpcGrpcJs.mod.ListenerBuilder] = js.native
    
    var Metadata: TypeofMetadata = js.native
    
    var RequesterBuilder: Instantiable0[typingsJapgolly.grpcGrpcJs.mod.RequesterBuilder] = js.native
    
    var Server: Instantiable0[typingsJapgolly.grpcGrpcJs.mod.Server] = js.native
    
    var ServerCredentials: TypeofServerCredentials = js.native
    
    var StatusBuilder: Instantiable0[typingsJapgolly.grpcGrpcJs.mod.StatusBuilder] = js.native
    
    def addAdminServicesToServer(server: Server): Unit = js.native
    
    def closeClient(client: Client): Unit = js.native
    
    val credentials: Typeofcredentials = js.native
    
    val experimental: Typeofexperimental = js.native
    
    def getChannelzHandlers(): Any = js.native
    
    def getChannelzServiceDefinition(): Any = js.native
    
    def getClientChannel(client: Client): Channel = js.native
    
    def load(filename: Any, format: Any, options: Any): scala.Nothing = js.native
    
    def loadObject(value: Any, options: Any): scala.Nothing = js.native
    
    def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
    
    def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
    
    def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
    
    def setLogVerbosity(verbosity: LogVerbosity): Unit = js.native
    
    def setLogger(logger: PartialConsole): Unit = js.native
    
    def waitForClientReady(client: Client, deadline: js.Date, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def waitForClientReady(client: Client, deadline: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
  
  @js.native
  trait TypeofgrpcTypes extends StObject {
    
    var Channel: Instantiable3[
        /* target */ String, 
        /* credentials */ typingsJapgolly.grpc.mod.ChannelCredentials, 
        /* options */ StringDictionary[String | Double], 
        typingsJapgolly.grpc.mod.Channel
      ] = js.native
    
    var Client: Instantiable2[
        /* address */ String, 
        /* credentials */ typingsJapgolly.grpc.mod.ChannelCredentials, 
        typingsJapgolly.grpc.mod.Client
      ] = js.native
    
    var ClientDuplexStream: Instantiable0[typingsJapgolly.grpc.mod.ClientDuplexStream[js.Object, js.Object]] = js.native
    
    var ClientReadableStream: Instantiable0[typingsJapgolly.grpc.mod.ClientReadableStream[js.Object]] = js.native
    
    var ClientUnaryCall: Instantiable0[typingsJapgolly.grpc.mod.ClientUnaryCall] = js.native
    
    var ClientWritableStream: Instantiable0[typingsJapgolly.grpc.mod.ClientWritableStream[js.Object]] = js.native
    
    var InterceptingCall: Instantiable0[typingsJapgolly.grpc.mod.InterceptingCall] = js.native
    
    var ListenerBuilder: Instantiable0[typingsJapgolly.grpc.mod.ListenerBuilder] = js.native
    
    var Metadata: Instantiable0[typingsJapgolly.grpc.mod.Metadata] = js.native
    
    var RequesterBuilder: Instantiable0[typingsJapgolly.grpc.mod.RequesterBuilder] = js.native
    
    var Server: Instantiable0[typingsJapgolly.grpc.mod.Server] = js.native
    
    var ServerCredentials: TypeofServerCredentialsInstantiable = js.native
    
    var ServerDuplexStream: Instantiable0[typingsJapgolly.grpc.mod.ServerDuplexStream[js.Object, js.Object]] = js.native
    
    var ServerReadableStream: Instantiable0[typingsJapgolly.grpc.mod.ServerReadableStream[js.Object]] = js.native
    
    var ServerUnaryCall: Instantiable0[typingsJapgolly.grpc.mod.ServerUnaryCall[js.Object]] = js.native
    
    var ServerWritableStream: Instantiable0[typingsJapgolly.grpc.mod.ServerWritableStream[js.Object, js.Object]] = js.native
    
    var StatusBuilder: Instantiable0[typingsJapgolly.grpc.mod.StatusBuilder] = js.native
    
    def closeClient(clientObj: typingsJapgolly.grpc.mod.Client): Unit = js.native
    
    val credentials: TypeofcredentialsCombineCallCredentials = js.native
    
    def getClientChannel(client: typingsJapgolly.grpc.mod.Client): typingsJapgolly.grpc.mod.Channel = js.native
    
    def load[T](filename: Filename): T = js.native
    def load[T](filename: Filename, format: proto | json): T = js.native
    def load[T](filename: Filename, format: proto | json, options: LoadOptions): T = js.native
    def load[T](filename: Filename, format: Unit, options: LoadOptions): T = js.native
    
    def loadObject[T](value: js.Object): T = js.native
    def loadObject[T](value: js.Object, options: LoadObjectOptions): T = js.native
    
    def loadPackageDefinition(packageDefinition: typingsJapgolly.grpc.mod.PackageDefinition): typingsJapgolly.grpc.mod.GrpcObject = js.native
    
    def makeGenericClientConstructor(methods: ServiceDefinition[Any], serviceName: String, classOptions: GenericClientOptions): Instantiable3[
        /* address */ String, 
        /* credentials */ typingsJapgolly.grpc.mod.ChannelCredentials, 
        /* options */ js.UndefOr[js.Object], 
        typingsJapgolly.grpc.mod.Client
      ] = js.native
    
    def setLogVerbosity(verbosity: logVerbosity): Unit = js.native
    
    def setLogger(logger: Console): Unit = js.native
    
    def waitForClientReady(
      client: typingsJapgolly.grpc.mod.Client,
      deadline: Deadline,
      callback: js.Function1[/* error */ js.Error | Null, Unit]
    ): Unit = js.native
  }
}
