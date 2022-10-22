package typingsJapgolly.grpcGcp

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable7
import typingsJapgolly.grpcGcp.buildSrcGcpChannelFactoryMod.GcpChannelFactoryConstructor
import typingsJapgolly.grpcGcp.buildSrcGcpChannelFactoryMod.GcpChannelFactoryInterface
import typingsJapgolly.grpcGcp.buildSrcGeneratedGrpcGcpMod.grpc.gcp.ApiConfig
import typingsJapgolly.grpcGcp.grpcGcpBooleans.`true`
import typingsJapgolly.grpcGrpcJs.anon.PartialChannelControlHelp
import typingsJapgolly.grpcGrpcJs.anon.PartialFailurePercentageE
import typingsJapgolly.grpcGrpcJs.anon.PartialSuccessRateEjectio
import typingsJapgolly.grpcGrpcJs.buildSrcAdminMod.GetHandlers
import typingsJapgolly.grpcGrpcJs.buildSrcAdminMod.GetServiceDefinition
import typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallMetadataGenerator
import typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.OAuth2Client
import typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.VerifyOptions
import typingsJapgolly.grpcGrpcJs.buildSrcClientMod.CallProperties
import typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity
import typingsJapgolly.grpcGrpcJs.buildSrcDurationMod.Duration
import typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.Filter
import typingsJapgolly.grpcGrpcJs.buildSrcFilterMod.FilterFactory
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.ChannelControlHelper
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancer
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancerConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfig
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfigConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcResolverMod.ResolverConstructor
import typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.KeyCertPair
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelInterfaceMod.SubchannelInterface
import typingsJapgolly.grpcGrpcJs.buildSrcUriParserMod.GrpcUri
import typingsJapgolly.grpcGrpcJs.mod.CallCredentials
import typingsJapgolly.grpcGrpcJs.mod.ChannelCredentials
import typingsJapgolly.grpcGrpcJs.mod.Metadata
import typingsJapgolly.grpcGrpcJs.mod.ServerCredentials
import typingsJapgolly.grpcGrpcJs.mod.experimental.OutlierDetectionLoadBalancingConfig
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.http2Mod.IncomingHttpHeaders
import typingsJapgolly.node.tlsMod.SecureContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CreateGcpApiConfig extends StObject {
    
    var GcpChannelFactory: GcpChannelFactoryConstructor
    
    def createGcpApiConfig(apiDefinition: js.Object): ApiConfig
    
    def gcpCallInvocationTransformer[RequestType, ResponseType](callProperties: CallProperties[RequestType, ResponseType]): CallProperties[RequestType, ResponseType]
    
    def gcpChannelFactoryOverride(address: String, credentials: ChannelCredentials, options: js.Object): GcpChannelFactoryInterface
  }
  object CreateGcpApiConfig {
    
    inline def apply(
      GcpChannelFactory: GcpChannelFactoryConstructor,
      createGcpApiConfig: js.Object => ApiConfig,
      gcpCallInvocationTransformer: CallProperties[Any, Any] => CallProperties[Any, Any],
      gcpChannelFactoryOverride: (String, ChannelCredentials, js.Object) => GcpChannelFactoryInterface
    ): CreateGcpApiConfig = {
      val __obj = js.Dynamic.literal(GcpChannelFactory = GcpChannelFactory.asInstanceOf[js.Any], createGcpApiConfig = js.Any.fromFunction1(createGcpApiConfig), gcpCallInvocationTransformer = js.Any.fromFunction1(gcpCallInvocationTransformer), gcpChannelFactoryOverride = js.Any.fromFunction3(gcpChannelFactoryOverride))
      __obj.asInstanceOf[CreateGcpApiConfig]
    }
    
    extension [Self <: CreateGcpApiConfig](x: Self) {
      
      inline def setCreateGcpApiConfig(value: js.Object => ApiConfig): Self = StObject.set(x, "createGcpApiConfig", js.Any.fromFunction1(value))
      
      inline def setGcpCallInvocationTransformer(value: CallProperties[Any, Any] => CallProperties[Any, Any]): Self = StObject.set(x, "gcpCallInvocationTransformer", js.Any.fromFunction1(value))
      
      inline def setGcpChannelFactory(value: GcpChannelFactoryConstructor): Self = StObject.set(x, "GcpChannelFactory", value.asInstanceOf[js.Any])
      
      inline def setGcpChannelFactoryOverride(value: (String, ChannelCredentials, js.Object) => GcpChannelFactoryInterface): Self = StObject.set(x, "gcpChannelFactoryOverride", js.Any.fromFunction3(value))
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
       with Instantiable0[Metadata] {
    
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
}
