package typingsJapgolly.googleGax

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable7
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleAuthLibrary.buildSrcAuthCredentialsMod.CredentialBody
import typingsJapgolly.googleAuthLibrary.buildSrcAuthExternalclientMod.ExternalAccountClientOptions
import typingsJapgolly.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typingsJapgolly.googleAuthLibrary.buildSrcAuthImpersonatedMod.ImpersonatedOptions
import typingsJapgolly.googleAuthLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typingsJapgolly.googleAuthLibrary.buildSrcAuthOauth2clientMod.OAuth2ClientOptions
import typingsJapgolly.googleAuthLibrary.buildSrcAuthRefreshclientMod.UserRefreshClientOptions
import typingsJapgolly.googleAuthLibrary.mod.GoogleAuth
import typingsJapgolly.googleGax.buildSrcGaxMod.BackoffSettings
import typingsJapgolly.googleGax.buildSrcGrpcMod.GrpcModule
import typingsJapgolly.googleGax.googleGaxBooleans.`true`
import typingsJapgolly.googleGax.googleGaxStrings.proto
import typingsJapgolly.googleGax.googleGaxStrings.rest
import typingsJapgolly.grpcGrpcJs.anon.PartialChannelControlHelp
import typingsJapgolly.grpcGrpcJs.anon.PartialFailurePercentageE
import typingsJapgolly.grpcGrpcJs.anon.PartialSuccessRateEjectio
import typingsJapgolly.grpcGrpcJs.buildSrcAdminMod.GetHandlers
import typingsJapgolly.grpcGrpcJs.buildSrcAdminMod.GetServiceDefinition
import typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.CallMetadataGenerator
import typingsJapgolly.grpcGrpcJs.buildSrcCallCredentialsMod.OAuth2Client
import typingsJapgolly.grpcGrpcJs.buildSrcChannelCredentialsMod.VerifyOptions
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
import typingsJapgolly.node.timersMod.global.NodeJS.Timeout
import typingsJapgolly.node.tlsMod.SecureContext
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Message
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Root
import typingsJapgolly.protobufjs.mod.Type
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancel extends StObject {
    
    def cancel(): Unit
  }
  object Cancel {
    
    inline def apply(cancel: Callback): Cancel = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn)
      __obj.asInstanceOf[Cancel]
    }
    
    extension [Self <: Cancel](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    }
  }
  
  trait Deadline extends StObject {
    
    var deadline: js.UndefOr[js.Date] = js.undefined
  }
  object Deadline {
    
    inline def apply(): Deadline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Deadline]
    }
    
    extension [Self <: Deadline](x: Self) {
      
      inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      inline def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
    }
  }
  
  /* Inlined google-gax.google-gax/build/src/grpc.GrpcClientOptions & {  fallback :boolean | 'rest' | 'proto' | undefined} */
  trait GrpcClientOptionsfallback extends StObject {
    
    var auth: js.UndefOr[GoogleAuth[JSONClient]] = js.undefined
    
    /**
      * An `AuthClient` to use
      */
    var authClient: js.UndefOr[JSONClient] = js.undefined
    
    /**
      * Options object passed to the constructor of the client
      */
    var clientOptions: js.UndefOr[
        JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions | ImpersonatedOptions
      ] = js.undefined
    
    /**
      * Object containing client_email and private_key properties, or the
      * external account client options.
      */
    var credentials: js.UndefOr[CredentialBody | ExternalAccountClientOptions] = js.undefined
    
    var fallback: js.UndefOr[Boolean | rest | proto] = js.undefined
    
    var grpc: js.UndefOr[GrpcModule] = js.undefined
    
    var httpRules: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.api.IHttpRule */ Any
        ]
      ] = js.undefined
    
    /**
      * Path to a .json, .pem, or .p12 key file
      */
    var keyFile: js.UndefOr[java.lang.String] = js.undefined
    
    /**
      * Path to a .json, .pem, or .p12 key file
      */
    var keyFilename: js.UndefOr[java.lang.String] = js.undefined
    
    var numericEnums: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Your project ID.
      */
    var projectId: js.UndefOr[java.lang.String] = js.undefined
    
    var protoJson: js.UndefOr[Root] = js.undefined
    
    /**
      * Required scopes for the desired API request
      */
    var scopes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  }
  object GrpcClientOptionsfallback {
    
    inline def apply(): GrpcClientOptionsfallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrpcClientOptionsfallback]
    }
    
    extension [Self <: GrpcClientOptionsfallback](x: Self) {
      
      inline def setAuth(value: GoogleAuth[JSONClient]): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthClient(value: JSONClient): Self = StObject.set(x, "authClient", value.asInstanceOf[js.Any])
      
      inline def setAuthClientUndefined: Self = StObject.set(x, "authClient", js.undefined)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setClientOptions(value: JWTOptions | OAuth2ClientOptions | UserRefreshClientOptions | ImpersonatedOptions): Self = StObject.set(x, "clientOptions", value.asInstanceOf[js.Any])
      
      inline def setClientOptionsUndefined: Self = StObject.set(x, "clientOptions", js.undefined)
      
      inline def setCredentials(value: CredentialBody | ExternalAccountClientOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setFallback(value: Boolean | rest | proto): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setGrpc(value: GrpcModule): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
      
      inline def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
      
      inline def setHttpRules(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.api.IHttpRule */ Any
            ]
      ): Self = StObject.set(x, "httpRules", value.asInstanceOf[js.Any])
      
      inline def setHttpRulesUndefined: Self = StObject.set(x, "httpRules", js.undefined)
      
      inline def setHttpRulesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.api.IHttpRule */ Any)*
      ): Self = StObject.set(x, "httpRules", js.Array(value*))
      
      inline def setKeyFile(value: java.lang.String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      inline def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      inline def setKeyFilename(value: java.lang.String): Self = StObject.set(x, "keyFilename", value.asInstanceOf[js.Any])
      
      inline def setKeyFilenameUndefined: Self = StObject.set(x, "keyFilename", js.undefined)
      
      inline def setNumericEnums(value: Boolean): Self = StObject.set(x, "numericEnums", value.asInstanceOf[js.Any])
      
      inline def setNumericEnumsUndefined: Self = StObject.set(x, "numericEnums", js.undefined)
      
      inline def setProjectId(value: java.lang.String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setProtoJson(value: Root): Self = StObject.set(x, "protoJson", value.asInstanceOf[js.Any])
      
      inline def setProtoJsonUndefined: Self = StObject.set(x, "protoJson", js.undefined)
      
      inline def setScopes(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: java.lang.String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<google-gax.google-gax/build/src/gax.RetryOptions> */
  trait PartialRetryOptions extends StObject {
    
    var backoffSettings: js.UndefOr[BackoffSettings] = js.undefined
    
    var constructor: js.UndefOr[
        js.Function2[/* retryCodes */ js.Array[Double], /* backoffSettings */ BackoffSettings, Any]
      ] = js.undefined
    
    var retryCodes: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object PartialRetryOptions {
    
    inline def apply(): PartialRetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRetryOptions]
    }
    
    extension [Self <: PartialRetryOptions](x: Self) {
      
      inline def setBackoffSettings(value: BackoffSettings): Self = StObject.set(x, "backoffSettings", value.asInstanceOf[js.Any])
      
      inline def setBackoffSettingsUndefined: Self = StObject.set(x, "backoffSettings", js.undefined)
      
      inline def setConstructor(value: (/* retryCodes */ js.Array[Double], /* backoffSettings */ BackoffSettings) => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction2(value))
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setRetryCodes(value: js.Array[Double]): Self = StObject.set(x, "retryCodes", value.asInstanceOf[js.Any])
      
      inline def setRetryCodesUndefined: Self = StObject.set(x, "retryCodes", js.undefined)
      
      inline def setRetryCodesVarargs(value: Double*): Self = StObject.set(x, "retryCodes", js.Array(value*))
    }
  }
  
  trait String extends StObject {
    
    var string: java.lang.String
  }
  object String {
    
    inline def apply(string: java.lang.String): String = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[String]
    }
    
    extension [Self <: String](x: Self) {
      
      inline def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
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
  trait TypeofMessage
    extends StObject
       with Instantiable0[Message[js.Object]] {
    
    /** Reference to the reflected type. */
    @JSName("$type")
    val $type: Type = js.native
    
    /**
      * Creates a new message of this type using the specified properties.
      * @param [properties] Properties to set
      * @returns Message instance
      */
    def create[T /* <: Message[T] */](): Message[T] = js.native
    def create[T /* <: Message[T] */](properties: StringDictionary[Any]): Message[T] = js.native
    
    def decode[T /* <: Message[T] */](reader: js.typedarray.Uint8Array): T = js.native
    /**
      * Decodes a message of this type.
      * @param reader Reader or buffer to decode
      * @returns Decoded message
      */
    def decode[T /* <: Message[T] */](reader: Reader): T = js.native
    
    def decodeDelimited[T /* <: Message[T] */](reader: js.typedarray.Uint8Array): T = js.native
    /**
      * Decodes a message of this type preceeded by its length as a varint.
      * @param reader Reader or buffer to decode
      * @returns Decoded message
      */
    def decodeDelimited[T /* <: Message[T] */](reader: Reader): T = js.native
    
    /**
      * Encodes a message of this type.
      * @param message Message to encode
      * @param [writer] Writer to use
      * @returns Writer
      */
    def encode[T /* <: Message[T] */](message: T): Writer = js.native
    def encode[T /* <: Message[T] */](message: T, writer: Writer): Writer = js.native
    def encode[T /* <: Message[T] */](message: StringDictionary[Any]): Writer = js.native
    def encode[T /* <: Message[T] */](message: StringDictionary[Any], writer: Writer): Writer = js.native
    
    /**
      * Encodes a message of this type preceeded by its length as a varint.
      * @param message Message to encode
      * @param [writer] Writer to use
      * @returns Writer
      */
    def encodeDelimited[T /* <: Message[T] */](message: T): Writer = js.native
    def encodeDelimited[T /* <: Message[T] */](message: T, writer: Writer): Writer = js.native
    def encodeDelimited[T /* <: Message[T] */](message: StringDictionary[Any]): Writer = js.native
    def encodeDelimited[T /* <: Message[T] */](message: StringDictionary[Any], writer: Writer): Writer = js.native
    
    /**
      * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Message instance
      */
    def fromObject[T /* <: Message[T] */](`object`: StringDictionary[Any]): T = js.native
    
    /**
      * Creates a plain object from a message of this type. Also converts values to other types if specified.
      * @param message Message instance
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject[T /* <: Message[T] */](message: T): StringDictionary[Any] = js.native
    def toObject[T /* <: Message[T] */](message: T, options: IConversionOptions): StringDictionary[Any] = js.native
    
    /**
      * Verifies a message of this type.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[Any]): java.lang.String | Null = js.native
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
      typeName: java.lang.String,
      loadBalancerType: LoadBalancerConstructor,
      loadBalancingConfigType: LoadBalancingConfigConstructor
    ): Unit = js.native
    
    def registerResolver(scheme: java.lang.String, resolverClass: ResolverConstructor): Unit = js.native
    
    def subchannelAddressToString(address: SubchannelAddress): java.lang.String = js.native
    
    def trace(severity: LogVerbosity, tracer: java.lang.String, text: java.lang.String): Unit = js.native
    
    def uriToString(uri: GrpcUri): java.lang.String = js.native
    
    def validateLoadBalancingConfig(obj: Any): LoadBalancingConfig = js.native
  }
  
  @js.native
  trait TypeofsetTimeout extends StObject {
    
    // util.promisify no rest args compability
    // tslint:disable-next-line void-return
    def apply(callback: js.Function1[/* args */ Unit, Unit]): Timeout = js.native
    def apply(callback: js.Function1[/* args */ Unit, Unit], ms: Double): Timeout = js.native
    def apply[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = js.native
    def apply[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = js.native
  }
  
  /* Inlined {  auth :google-auth-library.google-auth-library.OAuth2Client} & {  fallback :boolean | 'rest' | 'proto' | undefined} */
  trait authOAuth2Clientfallbackb extends StObject {
    
    var auth: typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
    
    var fallback: js.UndefOr[Boolean | rest | proto] = js.undefined
  }
  object authOAuth2Clientfallbackb {
    
    inline def apply(auth: typingsJapgolly.googleAuthLibrary.mod.OAuth2Client): authOAuth2Clientfallbackb = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[authOAuth2Clientfallbackb]
    }
    
    extension [Self <: authOAuth2Clientfallbackb](x: Self) {
      
      inline def setAuth(value: typingsJapgolly.googleAuthLibrary.mod.OAuth2Client): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setFallback(value: Boolean | rest | proto): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
  
  /* Inlined {[httpOptionName] : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.api.IHttpRule * / any | undefined} & {[ option in google-gax.google-gax/build/src/transcoding.allowedOptions ]:? {} | string | number} */
  @js.native
  trait httpOptionNameanyundefine extends StObject {
    
    @JSName("(google.api.method_signature)")
    var LeftparenthesisgoogleDotapiDotmethod_signatureRightparenthesis: js.UndefOr[js.Object | java.lang.String | Double] = js.native
  }
}
