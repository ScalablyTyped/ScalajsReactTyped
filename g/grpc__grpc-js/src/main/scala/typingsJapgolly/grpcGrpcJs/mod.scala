package typingsJapgolly.grpcGrpcJs

import typingsJapgolly.grpcGrpcJs.anon.PartialChannelControlHelp
import typingsJapgolly.grpcGrpcJs.anon.PartialConsole
import typingsJapgolly.grpcGrpcJs.anon.PartialFailurePercentageE
import typingsJapgolly.grpcGrpcJs.anon.PartialSuccessRateEjectio
import typingsJapgolly.grpcGrpcJs.buildSrcAdminMod.GetHandlers
import typingsJapgolly.grpcGrpcJs.buildSrcAdminMod.GetServiceDefinition
import typingsJapgolly.grpcGrpcJs.buildSrcBackoffTimeoutMod.BackoffOptions
import typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallMetadataGenerator
import typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.OAuth2Client
import typingsJapgolly.grpcGrpcJs.buildSrcCallMod.ClientDuplexStream
import typingsJapgolly.grpcGrpcJs.buildSrcCallMod.ClientReadableStream
import typingsJapgolly.grpcGrpcJs.buildSrcCallMod.ClientUnaryCall
import typingsJapgolly.grpcGrpcJs.buildSrcCallMod.ClientWritableStream
import typingsJapgolly.grpcGrpcJs.buildSrcCallStreamMod.StatusObject
import typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.VerifyOptions
import typingsJapgolly.grpcGrpcJs.buildSrcChannelMod.ChannelImplementation
import typingsJapgolly.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typingsJapgolly.grpcGrpcJs.buildSrcClientInterceptorsMod.InterceptingCallInterface
import typingsJapgolly.grpcGrpcJs.buildSrcClientInterceptorsMod.Requester
import typingsJapgolly.grpcGrpcJs.buildSrcClientMod.ClientOptions
import typingsJapgolly.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms
import typingsJapgolly.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState
import typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity
import typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Propagate
import typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status
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
import typingsJapgolly.grpcGrpcJs.buildSrcMetadataMod.MetadataOptions
import typingsJapgolly.grpcGrpcJs.buildSrcResolverMod.ResolverConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.KeyCertPair
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelInterfaceMod.SubchannelInterface
import typingsJapgolly.grpcGrpcJs.buildSrcUriParserMod.GrpcUri
import typingsJapgolly.grpcGrpcJs.grpcGrpcJsBooleans.`true`
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.http2Mod.IncomingHttpHeaders
import typingsJapgolly.node.tlsMod.SecureContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@grpc/grpc-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@grpc/grpc-js", "CallCredentials")
  @js.native
  open class CallCredentials ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials
  /* static members */
  object CallCredentials {
    
    @JSImport("@grpc/grpc-js", "CallCredentials")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createEmpty(): typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")().asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials]
    
    /**
      * Create a gRPC credential from a Google credential object.
      * @param googleCredentials The authentication client to use.
      * @return The resulting CallCredentials object.
      */
    inline def createFromGoogleCredential(googleCredentials: OAuth2Client): typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromGoogleCredential")(googleCredentials.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials]
    
    /**
      * Creates a new CallCredentials object from a given function that generates
      * Metadata objects.
      * @param metadataGenerator A function that accepts a set of options, and
      * generates a Metadata object based on these options, which is passed back
      * to the caller via a supplied (err, metadata) callback.
      */
    inline def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromMetadataGenerator")(metadataGenerator.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials]
  }
  
  @JSImport("@grpc/grpc-js", "Channel")
  @js.native
  open class Channel protected () extends ChannelImplementation {
    def this(
      target: String,
      credentials: typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials,
      options: ChannelOptions
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("@grpc/grpc-js", "ChannelCredentials")
  @js.native
  /* protected */ open class ChannelCredentials ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials {
    /* protected */ def this(callCredentials: typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials) = this()
  }
  /* static members */
  object ChannelCredentials {
    
    @JSImport("@grpc/grpc-js", "ChannelCredentials")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def createFromSecureContext(secureContext: SecureContext): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromSecureContext")(secureContext.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
    inline def createFromSecureContext(secureContext: SecureContext, verifyOptions: VerifyOptions): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromSecureContext")(secureContext.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
    
    /**
      * Return a new ChannelCredentials instance with no credentials.
      */
    inline def createInsecure(): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecure")().asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
    
    /**
      * Return a new ChannelCredentials instance with a given set of credentials.
      * The resulting instance can be used to construct a Channel that communicates
      * over TLS.
      * @param rootCerts The root certificate data.
      * @param privateKey The client certificate private key, if available.
      * @param certChain The client certificate key chain, if available.
      * @param verifyOptions Additional options to modify certificate verification
      */
    inline def createSsl(
      rootCerts: js.UndefOr[Buffer | Null],
      privateKey: js.UndefOr[Buffer | Null],
      certChain: js.UndefOr[Buffer | Null],
      verifyOptions: js.UndefOr[VerifyOptions]
    ): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], certChain.asInstanceOf[js.Any], verifyOptions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
  }
  
  @JSImport("@grpc/grpc-js", "Client")
  @js.native
  open class Client protected ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcClientMod.Client {
    def this(
      address: String,
      credentials: typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
    ) = this()
    def this(
      address: String,
      credentials: typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials,
      options: ClientOptions
    ) = this()
  }
  
  @JSImport("@grpc/grpc-js", "InterceptingCall")
  @js.native
  open class InterceptingCall protected ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcClientInterceptorsMod.InterceptingCall {
    def this(nextCall: InterceptingCallInterface) = this()
    def this(nextCall: InterceptingCallInterface, requester: Requester) = this()
  }
  
  @JSImport("@grpc/grpc-js", "InterceptorConfigurationError")
  @js.native
  open class InterceptorConfigurationError protected ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcClientInterceptorsMod.InterceptorConfigurationError {
    def this(message: String) = this()
  }
  
  @JSImport("@grpc/grpc-js", "ListenerBuilder")
  @js.native
  open class ListenerBuilder ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcClientInterceptorsMod.ListenerBuilder
  
  @JSImport("@grpc/grpc-js", "Metadata")
  @js.native
  open class Metadata ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcMetadataMod.Metadata {
    def this(options: MetadataOptions) = this()
  }
  /* static members */
  object Metadata {
    
    @JSImport("@grpc/grpc-js", "Metadata")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Metadata object based fields in a given IncomingHttpHeaders
      * object.
      * @param headers An IncomingHttpHeaders object.
      */
    inline def fromHttp2Headers(headers: IncomingHttpHeaders): typingsJapgolly.grpcGrpcJs.buildSrcMetadataMod.Metadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHttp2Headers")(headers.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcMetadataMod.Metadata]
  }
  
  @JSImport("@grpc/grpc-js", "RequesterBuilder")
  @js.native
  open class RequesterBuilder ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcClientInterceptorsMod.RequesterBuilder
  
  @JSImport("@grpc/grpc-js", "Server")
  @js.native
  open class Server ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcServerMod.Server {
    def this(options: ChannelOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@grpc/grpc-js", "ServerCredentials")
  @js.native
  open class ServerCredentials ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials
  /* static members */
  object ServerCredentials {
    
    @JSImport("@grpc/grpc-js", "ServerCredentials")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInsecure(): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsecure")().asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials]
    
    inline def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials]
    inline def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any], checkClientCertificate.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials]
    inline def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials]
    inline def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = (^.asInstanceOf[js.Dynamic].applyDynamic("createSsl")(rootCerts.asInstanceOf[js.Any], keyCertPairs.asInstanceOf[js.Any], checkClientCertificate.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials]
  }
  
  @JSImport("@grpc/grpc-js", "StatusBuilder")
  @js.native
  open class StatusBuilder ()
    extends typingsJapgolly.grpcGrpcJs.buildSrcStatusBuilderMod.StatusBuilder
  
  inline def addAdminServicesToServer(server: typingsJapgolly.grpcGrpcJs.buildSrcServerMod.Server): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAdminServicesToServer")(server.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def closeClient(client: typingsJapgolly.grpcGrpcJs.buildSrcClientMod.Client): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeClient")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@grpc/grpc-js", "compressionAlgorithms")
  @js.native
  object compressionAlgorithms extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CompressionAlgorithms & Double] = js.native
    
    /* 1 */ val deflate: typingsJapgolly.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms.deflate & Double = js.native
    
    /* 2 */ val gzip: typingsJapgolly.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms.gzip & Double = js.native
    
    /* 0 */ val identity: typingsJapgolly.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms.identity & Double = js.native
  }
  
  @JSImport("@grpc/grpc-js", "connectivityState")
  @js.native
  object connectivityState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ConnectivityState & Double] = js.native
    
    /* 1 */ val CONNECTING: typingsJapgolly.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.CONNECTING & Double = js.native
    
    /* 0 */ val IDLE: typingsJapgolly.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.IDLE & Double = js.native
    
    /* 2 */ val READY: typingsJapgolly.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.READY & Double = js.native
    
    /* 4 */ val SHUTDOWN: typingsJapgolly.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.SHUTDOWN & Double = js.native
    
    /* 3 */ val TRANSIENT_FAILURE: typingsJapgolly.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.TRANSIENT_FAILURE & Double = js.native
  }
  
  object credentials {
    
    @JSImport("@grpc/grpc-js", "credentials")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combine any number of CallCredentials into a single CallCredentials
      * object.
      * @param first The first CallCredentials object.
      * @param additional Any number of additional CallCredentials objects.
      * @return The resulting CallCredentials object.
      */
    inline def combineCallCredentials(
      first: typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials,
      additional: typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials*
    ): typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("combineCallCredentials")(scala.List(first.asInstanceOf[js.Any]).`++`(additional.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials]
    
    /**
      * Combine a ChannelCredentials with any number of CallCredentials into a
      * single ChannelCredentials object.
      * @param channelCredentials The ChannelCredentials object.
      * @param callCredentials Any number of CallCredentials objects.
      * @return The resulting ChannelCredentials object.
      */
    inline def combineChannelCredentials(
      channelCredentials: typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials,
      callCredentials: typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials*
    ): typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("combineChannelCredentials")(scala.List(channelCredentials.asInstanceOf[js.Any]).`++`(callCredentials.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials]
    
    @JSImport("@grpc/grpc-js", "credentials.createEmpty")
    @js.native
    def createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any = js.native
    inline def createEmpty_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createEmpty")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createFromGoogleCredential")
    @js.native
    def createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any = js.native
    inline def createFromGoogleCredential_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFromGoogleCredential")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createFromMetadataGenerator")
    @js.native
    def createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any = js.native
    inline def createFromMetadataGenerator_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFromMetadataGenerator")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createFromSecureContext")
    @js.native
    def createFromSecureContext: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any = js.native
    inline def createFromSecureContext_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createFromSecureContext")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createInsecure")
    @js.native
    def createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any = js.native
    inline def createInsecure_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createInsecure")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js", "credentials.createSsl")
    @js.native
    def createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any = js.native
    inline def createSsl_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createSsl")(x.asInstanceOf[js.Any])
  }
  
  object experimental {
    
    @JSImport("@grpc/grpc-js", "experimental")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@grpc/grpc-js", "experimental.BackoffTimeout")
    @js.native
    open class BackoffTimeout protected ()
      extends typingsJapgolly.grpcGrpcJs.buildSrcExperimentalMod.BackoffTimeout {
      def this(callback: js.Function0[Unit]) = this()
      def this(callback: js.Function0[Unit], options: BackoffOptions) = this()
    }
    
    /* note: abstract class */ @JSImport("@grpc/grpc-js", "experimental.BaseFilter")
    @js.native
    open class BaseFilter ()
      extends typingsJapgolly.grpcGrpcJs.buildSrcExperimentalMod.BaseFilter
    
    /* note: abstract class */ @JSImport("@grpc/grpc-js", "experimental.BaseSubchannelWrapper")
    @js.native
    open class BaseSubchannelWrapper protected ()
      extends typingsJapgolly.grpcGrpcJs.buildSrcExperimentalMod.BaseSubchannelWrapper {
      def this(child: SubchannelInterface) = this()
    }
    
    @JSImport("@grpc/grpc-js", "experimental.ChildLoadBalancerHandler")
    @js.native
    open class ChildLoadBalancerHandler protected ()
      extends typingsJapgolly.grpcGrpcJs.buildSrcExperimentalMod.ChildLoadBalancerHandler {
      def this(channelControlHelper: ChannelControlHelper) = this()
    }
    
    @JSImport("@grpc/grpc-js", "experimental.FilterStackFactory")
    @js.native
    open class FilterStackFactory protected ()
      extends typingsJapgolly.grpcGrpcJs.buildSrcExperimentalMod.FilterStackFactory {
      def this(factories: js.Array[FilterFactory[Filter]]) = this()
    }
    
    @JSImport("@grpc/grpc-js", "experimental.OutlierDetectionLoadBalancingConfig")
    @js.native
    open class OutlierDetectionLoadBalancingConfig protected ()
      extends typingsJapgolly.grpcGrpcJs.buildSrcExperimentalMod.OutlierDetectionLoadBalancingConfig {
      def this(
        intervalMs: Double | Null,
        baseEjectionTimeMs: Double | Null,
        maxEjectionTimeMs: Double | Null,
        maxEjectionPercent: Double | Null,
        successRateEjection: PartialSuccessRateEjectio | Null,
        failurePercentageEjection: PartialFailurePercentageE | Null,
        childPolicy: js.Array[LoadBalancingConfig]
      ) = this()
    }
    /* static members */
    object OutlierDetectionLoadBalancingConfig {
      
      @JSImport("@grpc/grpc-js", "experimental.OutlierDetectionLoadBalancingConfig")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createFromJson(obj: Any): typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerOutlierDetectionMod.OutlierDetectionLoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromJson")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerOutlierDetectionMod.OutlierDetectionLoadBalancingConfig]
    }
    
    @JSImport("@grpc/grpc-js", "experimental.PickResultType")
    @js.native
    object PickResultType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.PickResultType & Double] = js.native
      
      /* 0 */ val COMPLETE: typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.PickResultType.COMPLETE & Double = js.native
      
      /* 3 */ val DROP: typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.PickResultType.DROP & Double = js.native
      
      /* 1 */ val QUEUE: typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.PickResultType.QUEUE & Double = js.native
      
      /* 2 */ val TRANSIENT_FAILURE: typingsJapgolly.grpcGrpcJs.buildSrcPickerMod.PickResultType.TRANSIENT_FAILURE & Double = js.native
    }
    
    @JSImport("@grpc/grpc-js", "experimental.QueuePicker")
    @js.native
    open class QueuePicker protected ()
      extends typingsJapgolly.grpcGrpcJs.buildSrcExperimentalMod.QueuePicker {
      def this(loadBalancer: LoadBalancer) = this()
    }
    
    @JSImport("@grpc/grpc-js", "experimental.UnavailablePicker")
    @js.native
    open class UnavailablePicker ()
      extends typingsJapgolly.grpcGrpcJs.buildSrcExperimentalMod.UnavailablePicker {
      def this(status: StatusObject) = this()
    }
    
    inline def createChildChannelControlHelper(parent: ChannelControlHelper, overrides: PartialChannelControlHelp): ChannelControlHelper = (^.asInstanceOf[js.Dynamic].applyDynamic("createChildChannelControlHelper")(parent.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[ChannelControlHelper]
    
    inline def durationToMs(duration: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToMs")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstUsableConfig")(configs.asInstanceOf[js.Any]).asInstanceOf[LoadBalancingConfig]
    
    inline def getFirstUsableConfig_true(configs: js.Array[LoadBalancingConfig], fallbackTodefault: `true`): LoadBalancingConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstUsableConfig")(configs.asInstanceOf[js.Any], fallbackTodefault.asInstanceOf[js.Any])).asInstanceOf[LoadBalancingConfig]
    
    inline def log(severity: LogVerbosity, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(scala.List(severity.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def registerAdminService(getServiceDefinition: GetServiceDefinition, getHandlers: GetHandlers): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAdminService")(getServiceDefinition.asInstanceOf[js.Any], getHandlers.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerLoadBalancerType(
      typeName: String,
      loadBalancerType: LoadBalancerConstructor,
      loadBalancingConfigType: LoadBalancingConfigConstructor
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLoadBalancerType")(typeName.asInstanceOf[js.Any], loadBalancerType.asInstanceOf[js.Any], loadBalancingConfigType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResolver")(scheme.asInstanceOf[js.Any], resolverClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def subchannelAddressToString(address: SubchannelAddress): String = ^.asInstanceOf[js.Dynamic].applyDynamic("subchannelAddressToString")(address.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def trace(severity: LogVerbosity, tracer: String, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(severity.asInstanceOf[js.Any], tracer.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uriToString(uri: GrpcUri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uriToString")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def validateLoadBalancingConfig(obj: Any): LoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateLoadBalancingConfig")(obj.asInstanceOf[js.Any]).asInstanceOf[LoadBalancingConfig]
  }
  
  inline def getChannelzHandlers(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getChannelzHandlers")().asInstanceOf[Any]
  
  inline def getChannelzServiceDefinition(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getChannelzServiceDefinition")().asInstanceOf[Any]
  
  inline def getClientChannel(client: typingsJapgolly.grpcGrpcJs.buildSrcClientMod.Client): typingsJapgolly.grpcGrpcJs.buildSrcChannelMod.Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientChannel")(client.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grpcGrpcJs.buildSrcChannelMod.Channel]
  
  inline def load(filename: Any, format: Any, options: Any): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  inline def loadObject(value: Any, options: Any): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("loadObject")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  inline def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPackageDefinition")(packageDef.asInstanceOf[js.Any]).asInstanceOf[GrpcObject]
  
  @JSImport("@grpc/grpc-js", "logVerbosity")
  @js.native
  object logVerbosity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogVerbosity & Double] = js.native
    
    /* 0 */ val DEBUG: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity.DEBUG & Double = js.native
    
    /* 2 */ val ERROR: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity.ERROR & Double = js.native
    
    /* 1 */ val INFO: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity.INFO & Double = js.native
    
    /* 3 */ val NONE: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity.NONE & Double = js.native
  }
  
  inline def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  inline def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], classOptions.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  
  inline def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeGenericClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  inline def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("makeGenericClientConstructor")(methods.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any], classOptions.asInstanceOf[js.Any])).asInstanceOf[ServiceClientConstructor]
  
  @JSImport("@grpc/grpc-js", "propagate")
  @js.native
  object propagate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Propagate & Double] = js.native
    
    /* 8 */ val CANCELLATION: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Propagate.CANCELLATION & Double = js.native
    
    /* 2 */ val CENSUS_STATS_CONTEXT: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Propagate.CENSUS_STATS_CONTEXT & Double = js.native
    
    /* 4 */ val CENSUS_TRACING_CONTEXT: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Propagate.CENSUS_TRACING_CONTEXT & Double = js.native
    
    /* 1 */ val DEADLINE: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Propagate.DEADLINE & Double = js.native
    
    /* 65535 */ val DEFAULTS: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Propagate.DEFAULTS & Double = js.native
  }
  
  inline def setLogVerbosity(verbosity: LogVerbosity): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogVerbosity")(verbosity.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLogger(logger: PartialConsole): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@grpc/grpc-js", "status")
  @js.native
  object status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    /* 10 */ val ABORTED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.ABORTED & Double = js.native
    
    /* 6 */ val ALREADY_EXISTS: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.ALREADY_EXISTS & Double = js.native
    
    /* 1 */ val CANCELLED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.CANCELLED & Double = js.native
    
    /* 15 */ val DATA_LOSS: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.DATA_LOSS & Double = js.native
    
    /* 4 */ val DEADLINE_EXCEEDED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.DEADLINE_EXCEEDED & Double = js.native
    
    /* 9 */ val FAILED_PRECONDITION: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.FAILED_PRECONDITION & Double = js.native
    
    /* 13 */ val INTERNAL: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.INTERNAL & Double = js.native
    
    /* 3 */ val INVALID_ARGUMENT: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.INVALID_ARGUMENT & Double = js.native
    
    /* 5 */ val NOT_FOUND: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.NOT_FOUND & Double = js.native
    
    /* 0 */ val OK: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.OK & Double = js.native
    
    /* 11 */ val OUT_OF_RANGE: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.OUT_OF_RANGE & Double = js.native
    
    /* 7 */ val PERMISSION_DENIED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.PERMISSION_DENIED & Double = js.native
    
    /* 8 */ val RESOURCE_EXHAUSTED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.RESOURCE_EXHAUSTED & Double = js.native
    
    /* 16 */ val UNAUTHENTICATED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.UNAUTHENTICATED & Double = js.native
    
    /* 14 */ val UNAVAILABLE: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.UNAVAILABLE & Double = js.native
    
    /* 12 */ val UNIMPLEMENTED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.UNIMPLEMENTED & Double = js.native
    
    /* 2 */ val UNKNOWN: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.UNKNOWN & Double = js.native
  }
  
  inline def waitForClientReady(
    client: typingsJapgolly.grpcGrpcJs.buildSrcClientMod.Client,
    deadline: js.Date,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForClientReady")(client.asInstanceOf[js.Any], deadline.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def waitForClientReady(
    client: typingsJapgolly.grpcGrpcJs.buildSrcClientMod.Client,
    deadline: Double,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForClientReady")(client.asInstanceOf[js.Any], deadline.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Call = ClientUnaryCall | ClientReadableStream[Any] | ClientWritableStream[Any] | (ClientDuplexStream[Any, Any])
}
