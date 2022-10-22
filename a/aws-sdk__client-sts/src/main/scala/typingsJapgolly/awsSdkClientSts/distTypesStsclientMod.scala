package typingsJapgolly.awsSdkClientSts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.URL
import typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsDecodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetAccessKeyInfoCommandMod.GetAccessKeyInfoCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetCallerIdentityCommandMod.GetCallerIdentityCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetFederationTokenCommandMod.GetFederationTokenCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetSessionTokenCommandMod.GetSessionTokenCommandInput
import typingsJapgolly.awsSdkProtocolHttp.distTypesHttpHandlerMod.HttpHandler
import typingsJapgolly.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4CryptoInit
import typingsJapgolly.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4Init
import typingsJapgolly.awsSdkSmithyClient.distTypesDefaultsModeMod.DefaultsMode
import typingsJapgolly.awsSdkSmithyClient.mod.Client
import typingsJapgolly.awsSdkTypes.anon.ForceRefresh
import typingsJapgolly.awsSdkTypes.distTypesAuthMod.AuthScheme
import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.Endpoint
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesLoggerMod.Logger
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.StreamCollector
import typingsJapgolly.awsSdkTypes.distTypesSignatureMod.RequestSigner
import typingsJapgolly.awsSdkTypes.distTypesTransferMod.RequestHandler
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.BodyLengthCalculator
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Decoder
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Encoder
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.MemoizedProvider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RegionInfo
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RegionInfoProvider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RegionInfoProviderOptions
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RetryStrategy
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.UrlParser
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.UserAgent
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.UserAgentPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStsclientMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/STSClient", "STSClient")
  @js.native
  open class STSClient protected () extends Client[HttpHandlerOptions, ServiceInputTypes, ServiceOutputTypes, STSClientResolvedConfig] {
    def this(configuration: STSClientConfig) = this()
  }
  
  /* Inlined parent std.Partial<@aws-sdk/smithy-client.@aws-sdk/smithy-client.SmithyResolvedConfiguration<@aws-sdk/types.@aws-sdk/types.HttpHandlerOptions>> */
  trait ClientDefaults extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The function that will be used to convert a base64-encoded string to a byte array.
      * @internal
      */
    var base64Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a base64-encoded string.
      * @internal
      */
    var base64Encoder: js.UndefOr[Encoder] = js.undefined
    
    /**
      * A function that can calculate the length of a request body.
      * @internal
      */
    var bodyLengthChecker: js.UndefOr[BodyLengthCalculator] = js.undefined
    
    /**
      * Default credentials provider; Not available in browser runtime.
      * @internal
      */
    var credentialDefaultProvider: js.UndefOr[js.Function1[/* input */ Any, Provider[Credentials]]] = js.undefined
    
    /**
      * The provider populating default tracking information to be sent with `user-agent`, `x-amz-user-agent` header
      * @internal
      */
    var defaultUserAgentProvider: js.UndefOr[Provider[UserAgent]] = js.undefined
    
    /**
      * The {@link DefaultsMode} that will be used to determine how certain default configuration options are resolved in the SDK.
      */
    var defaultsMode: js.UndefOr[DefaultsMode | Provider[DefaultsMode]] = js.undefined
    
    /**
      * Disable dyanamically changing the endpoint of the client based on the hostPrefix
      * trait of an operation.
      */
    var disableHostPrefix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional logger for logging debug/info/warn/error.
      */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /**
      * Value for how many times a request will be made at most in case of retry.
      */
    var maxAttempts: js.UndefOr[Double | Provider[Double]] = js.undefined
    
    /**
      * The AWS region to which this client will send requests
      */
    var region: js.UndefOr[String | Provider[String]] = js.undefined
    
    /**
      * Fetch related hostname, signing name or signing region with given region.
      * @internal
      */
    var regionInfoProvider: js.UndefOr[RegionInfoProvider] = js.undefined
    
    /**
      * The HTTP handler to use. Fetch in browser and Https in Nodejs.
      */
    var requestHandler: js.UndefOr[HttpHandler] = js.undefined
    
    /**
      * Specifies which retry algorithm to use.
      */
    var retryMode: js.UndefOr[String | Provider[String]] = js.undefined
    
    /**
      * The runtime environment.
      * @internal
      */
    var runtime: js.UndefOr[String] = js.undefined
    
    /**
      * Unique service identifier.
      * @internal
      */
    var serviceId: js.UndefOr[String] = js.undefined
    
    /**
      * A constructor for a class implementing the {@link __Hash} interface
      * that computes the SHA-256 HMAC or checksum of a string or binary buffer.
      * @internal
      */
    var sha256: js.UndefOr[HashConstructor] = js.undefined
    
    /**
      * A function that converts a stream into an array of bytes.
      * @internal
      */
    var streamCollector: js.UndefOr[StreamCollector] = js.undefined
    
    /**
      * The function that will be used to convert strings into HTTP endpoints.
      * @internal
      */
    var urlParser: js.UndefOr[UrlParser] = js.undefined
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint.
      */
    var useDualstackEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
    
    /**
      * Enables FIPS compatible endpoints.
      */
    var useFipsEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
    
    /**
      * The function that will be used to convert a UTF8-encoded string to a byte array.
      * @internal
      */
    var utf8Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a UTF-8 encoded string.
      * @internal
      */
    var utf8Encoder: js.UndefOr[Encoder] = js.undefined
  }
  object ClientDefaults {
    
    inline def apply(): ClientDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientDefaults]
    }
    
    extension [Self <: ClientDefaults](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setBase64Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      inline def setBase64DecoderUndefined: Self = StObject.set(x, "base64Decoder", js.undefined)
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setBase64EncoderUndefined: Self = StObject.set(x, "base64Encoder", js.undefined)
      
      inline def setBodyLengthChecker(value: /* body */ Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      inline def setBodyLengthCheckerUndefined: Self = StObject.set(x, "bodyLengthChecker", js.undefined)
      
      inline def setCredentialDefaultProvider(value: /* input */ Any => Provider[Credentials]): Self = StObject.set(x, "credentialDefaultProvider", js.Any.fromFunction1(value))
      
      inline def setCredentialDefaultProviderUndefined: Self = StObject.set(x, "credentialDefaultProvider", js.undefined)
      
      inline def setDefaultUserAgentProvider(value: CallbackTo[js.Promise[UserAgent]]): Self = StObject.set(x, "defaultUserAgentProvider", value.toJsFn)
      
      inline def setDefaultUserAgentProviderUndefined: Self = StObject.set(x, "defaultUserAgentProvider", js.undefined)
      
      inline def setDefaultsMode(value: DefaultsMode | Provider[DefaultsMode]): Self = StObject.set(x, "defaultsMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultsModeCallbackTo(value: CallbackTo[js.Promise[DefaultsMode]]): Self = StObject.set(x, "defaultsMode", value.toJsFn)
      
      inline def setDefaultsModeUndefined: Self = StObject.set(x, "defaultsMode", js.undefined)
      
      inline def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      inline def setDisableHostPrefixUndefined: Self = StObject.set(x, "disableHostPrefix", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxAttempts(value: Double | Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsCallbackTo(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "maxAttempts", value.toJsFn)
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setRegionInfoProviderUndefined: Self = StObject.set(x, "regionInfoProvider", js.undefined)
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRequestHandler(value: HttpHandler): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      inline def setRequestHandlerUndefined: Self = StObject.set(x, "requestHandler", js.undefined)
      
      inline def setRetryMode(value: String | Provider[String]): Self = StObject.set(x, "retryMode", value.asInstanceOf[js.Any])
      
      inline def setRetryModeCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "retryMode", value.toJsFn)
      
      inline def setRetryModeUndefined: Self = StObject.set(x, "retryMode", js.undefined)
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      inline def setStreamCollector(value: /* stream */ Any => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      inline def setStreamCollectorUndefined: Self = StObject.set(x, "streamCollector", js.undefined)
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUrlParserUndefined: Self = StObject.set(x, "urlParser", js.undefined)
      
      inline def setUseDualstackEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useDualstackEndpoint", value.toJsFn)
      
      inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
      
      inline def setUseFipsEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useFipsEndpoint", value.toJsFn)
      
      inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      inline def setUtf8DecoderUndefined: Self = StObject.set(x, "utf8Decoder", js.undefined)
      
      inline def setUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
      
      inline def setUtf8EncoderUndefined: Self = StObject.set(x, "utf8Encoder", js.undefined)
    }
  }
  
  type STSClientConfig = STSClientConfigType
  
  /* Inlined std.Partial<@aws-sdk/smithy-client.@aws-sdk/smithy-client.SmithyConfiguration<@aws-sdk/types.@aws-sdk/types.HttpHandlerOptions>> & @aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/STSClient.ClientDefaults & @aws-sdk/config-resolver.@aws-sdk/config-resolver.RegionInputConfig & @aws-sdk/config-resolver.@aws-sdk/config-resolver.EndpointsInputConfig & @aws-sdk/middleware-retry.@aws-sdk/middleware-retry.RetryInputConfig & @aws-sdk/middleware-host-header.@aws-sdk/middleware-host-header.HostHeaderInputConfig & @aws-sdk/middleware-sdk-sts.@aws-sdk/middleware-sdk-sts.StsAuthInputConfig & @aws-sdk/middleware-user-agent.@aws-sdk/middleware-user-agent.UserAgentInputConfig */
  trait STSClientConfigType extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The function that will be used to convert a base64-encoded string to a byte array.
      * @internal
      */
    var base64Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a base64-encoded string.
      * @internal
      */
    var base64Encoder: js.UndefOr[Encoder] = js.undefined
    
    /**
      * A function that can calculate the length of a request body.
      * @internal
      */
    var bodyLengthChecker: js.UndefOr[BodyLengthCalculator] = js.undefined
    
    /**
      * Default credentials provider; Not available in browser runtime.
      * @internal
      */
    var credentialDefaultProvider: js.UndefOr[js.Function1[/* input */ Any, Provider[Credentials]]] = js.undefined
    
    /**
      * The credentials used to sign requests.
      */
    var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.undefined
    
    /**
      * The custom user agent header that would be appended to default one
      */
    var customUserAgent: js.UndefOr[String | UserAgent] = js.undefined
    
    /**
      * The provider populating default tracking information to be sent with `user-agent`, `x-amz-user-agent` header
      * @internal
      */
    var defaultUserAgentProvider: js.UndefOr[Provider[UserAgent]] = js.undefined
    
    /**
      * The {@link DefaultsMode} that will be used to determine how certain default configuration options are resolved in the SDK.
      */
    var defaultsMode: js.UndefOr[DefaultsMode | Provider[DefaultsMode]] = js.undefined
    
    /**
      * Disable dyanamically changing the endpoint of the client based on the hostPrefix
      * trait of an operation.
      */
    var disableHostPrefix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The fully qualified endpoint of the webservice. This is only required when using
      * a custom endpoint (for example, when using a local version of S3).
      */
    var endpoint: js.UndefOr[String | Endpoint | Provider[Endpoint]] = js.undefined
    
    /**
      * Optional logger for logging debug/info/warn/error.
      */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /**
      * Value for how many times a request will be made at most in case of retry.
      */
    /**
      * The maximum number of times requests that encounter retryable failures should be attempted.
      */
    var maxAttempts: js.UndefOr[Double | Provider[Double]] = js.undefined
    
    /**
      * The AWS region to which this client will send requests
      */
    var region: js.UndefOr[String | Provider[String]] = js.undefined
    
    /**
      * Fetch related hostname, signing name or signing region with given region.
      * @internal
      */
    var regionInfoProvider: js.UndefOr[RegionInfoProvider] = js.undefined
    
    /**
      * The HTTP handler to use. Fetch in browser and Https in Nodejs.
      */
    var requestHandler: (js.UndefOr[RequestHandler[Any, Any, HttpHandlerOptions]]) & js.UndefOr[HttpHandler]
    
    /**
      * Specifies which retry algorithm to use.
      */
    var retryMode: js.UndefOr[String | Provider[String]] = js.undefined
    
    /**
      * The strategy to retry the request. Using built-in exponential backoff strategy by default.
      */
    var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
    
    /**
      * The runtime environment.
      * @internal
      */
    var runtime: js.UndefOr[String] = js.undefined
    
    /**
      * Unique service identifier.
      * @internal
      */
    var serviceId: js.UndefOr[String] = js.undefined
    
    /**
      * A constructor for a class implementing the {@link __Hash} interface
      * that computes the SHA-256 HMAC or checksum of a string or binary buffer.
      * @internal
      */
    var sha256: js.UndefOr[HashConstructor] = js.undefined
    
    /**
      * The signer to use when signing requests.
      */
    var signer: js.UndefOr[
        RequestSigner | (js.Function1[/* authScheme */ js.UndefOr[AuthScheme], js.Promise[RequestSigner]])
      ] = js.undefined
    
    /**
      * The injectable SigV4-compatible signer class constructor. If not supplied,
      * regular SignatureV4 constructor will be used.
      * @private
      */
    var signerConstructor: js.UndefOr[
        Instantiable1[/* options */ SignatureV4Init & SignatureV4CryptoInit, RequestSigner]
      ] = js.undefined
    
    /**
      * Whether to escape request path when signing the request.
      */
    var signingEscapePath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The region where you want to sign your request against. This
      * can be different to the region in the endpoint.
      */
    var signingRegion: js.UndefOr[String] = js.undefined
    
    /**
      * A function that converts a stream into an array of bytes.
      * @internal
      */
    var streamCollector: js.UndefOr[StreamCollector] = js.undefined
    
    /**
      * An offset value in milliseconds to apply to all signing times.
      */
    var systemClockOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether TLS is enabled for requests.
      */
    var tls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The function that will be used to convert strings into HTTP endpoints.
      * @internal
      */
    var urlParser: js.UndefOr[UrlParser] = js.undefined
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint.
      */
    var useDualstackEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
    
    /**
      * Enables FIPS compatible endpoints.
      */
    var useFipsEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
    
    /**
      * The function that will be used to convert a UTF8-encoded string to a byte array.
      * @internal
      */
    var utf8Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a UTF-8 encoded string.
      * @internal
      */
    var utf8Encoder: js.UndefOr[Encoder] = js.undefined
  }
  object STSClientConfigType {
    
    inline def apply(
      requestHandler: (js.UndefOr[RequestHandler[Any, Any, HttpHandlerOptions]]) & js.UndefOr[HttpHandler]
    ): STSClientConfigType = {
      val __obj = js.Dynamic.literal(requestHandler = requestHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[STSClientConfigType]
    }
    
    extension [Self <: STSClientConfigType](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setBase64Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      inline def setBase64DecoderUndefined: Self = StObject.set(x, "base64Decoder", js.undefined)
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setBase64EncoderUndefined: Self = StObject.set(x, "base64Encoder", js.undefined)
      
      inline def setBodyLengthChecker(value: /* body */ Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      inline def setBodyLengthCheckerUndefined: Self = StObject.set(x, "bodyLengthChecker", js.undefined)
      
      inline def setCredentialDefaultProvider(value: /* input */ Any => Provider[Credentials]): Self = StObject.set(x, "credentialDefaultProvider", js.Any.fromFunction1(value))
      
      inline def setCredentialDefaultProviderUndefined: Self = StObject.set(x, "credentialDefaultProvider", js.undefined)
      
      inline def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsCallbackTo(value: CallbackTo[js.Promise[Credentials]]): Self = StObject.set(x, "credentials", value.toJsFn)
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setCustomUserAgent(value: String | UserAgent): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
      
      inline def setCustomUserAgentVarargs(value: UserAgentPair*): Self = StObject.set(x, "customUserAgent", js.Array(value*))
      
      inline def setDefaultUserAgentProvider(value: CallbackTo[js.Promise[UserAgent]]): Self = StObject.set(x, "defaultUserAgentProvider", value.toJsFn)
      
      inline def setDefaultUserAgentProviderUndefined: Self = StObject.set(x, "defaultUserAgentProvider", js.undefined)
      
      inline def setDefaultsMode(value: DefaultsMode | Provider[DefaultsMode]): Self = StObject.set(x, "defaultsMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultsModeCallbackTo(value: CallbackTo[js.Promise[DefaultsMode]]): Self = StObject.set(x, "defaultsMode", value.toJsFn)
      
      inline def setDefaultsModeUndefined: Self = StObject.set(x, "defaultsMode", js.undefined)
      
      inline def setDisableHostPrefix(value: Boolean): Self = StObject.set(x, "disableHostPrefix", value.asInstanceOf[js.Any])
      
      inline def setDisableHostPrefixUndefined: Self = StObject.set(x, "disableHostPrefix", js.undefined)
      
      inline def setEndpoint(value: String | Endpoint | Provider[Endpoint]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointCallbackTo(value: CallbackTo[js.Promise[Endpoint]]): Self = StObject.set(x, "endpoint", value.toJsFn)
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxAttempts(value: Double | Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsCallbackTo(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "maxAttempts", value.toJsFn)
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setRegionInfoProviderUndefined: Self = StObject.set(x, "regionInfoProvider", js.undefined)
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRequestHandler(value: (js.UndefOr[RequestHandler[Any, Any, HttpHandlerOptions]]) & js.UndefOr[HttpHandler]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      inline def setRetryMode(value: String | Provider[String]): Self = StObject.set(x, "retryMode", value.asInstanceOf[js.Any])
      
      inline def setRetryModeCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "retryMode", value.toJsFn)
      
      inline def setRetryModeUndefined: Self = StObject.set(x, "retryMode", js.undefined)
      
      inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
      
      inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      inline def setSigner(
        value: RequestSigner | (js.Function1[/* authScheme */ js.UndefOr[AuthScheme], js.Promise[RequestSigner]])
      ): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
      
      inline def setSignerConstructor(value: Instantiable1[/* options */ SignatureV4Init & SignatureV4CryptoInit, RequestSigner]): Self = StObject.set(x, "signerConstructor", value.asInstanceOf[js.Any])
      
      inline def setSignerConstructorUndefined: Self = StObject.set(x, "signerConstructor", js.undefined)
      
      inline def setSignerFunction1(value: /* authScheme */ js.UndefOr[AuthScheme] => js.Promise[RequestSigner]): Self = StObject.set(x, "signer", js.Any.fromFunction1(value))
      
      inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
      
      inline def setSigningEscapePath(value: Boolean): Self = StObject.set(x, "signingEscapePath", value.asInstanceOf[js.Any])
      
      inline def setSigningEscapePathUndefined: Self = StObject.set(x, "signingEscapePath", js.undefined)
      
      inline def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      inline def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
      
      inline def setStreamCollector(value: /* stream */ Any => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      inline def setStreamCollectorUndefined: Self = StObject.set(x, "streamCollector", js.undefined)
      
      inline def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
      
      inline def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
      
      inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUrlParserUndefined: Self = StObject.set(x, "urlParser", js.undefined)
      
      inline def setUseDualstackEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useDualstackEndpoint", value.toJsFn)
      
      inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
      
      inline def setUseFipsEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpointCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useFipsEndpoint", value.toJsFn)
      
      inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      inline def setUtf8DecoderUndefined: Self = StObject.set(x, "utf8Decoder", js.undefined)
      
      inline def setUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
      
      inline def setUtf8EncoderUndefined: Self = StObject.set(x, "utf8Encoder", js.undefined)
    }
  }
  
  type STSClientResolvedConfig = STSClientResolvedConfigType
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.SmithyResolvedConfiguration<@aws-sdk/types.@aws-sdk/types.HttpHandlerOptions> & std.Required<@aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/STSClient.ClientDefaults> & @aws-sdk/config-resolver.@aws-sdk/config-resolver.RegionResolvedConfig & @aws-sdk/config-resolver.@aws-sdk/config-resolver.EndpointsResolvedConfig & @aws-sdk/middleware-retry.@aws-sdk/middleware-retry.RetryResolvedConfig & @aws-sdk/middleware-host-header.@aws-sdk/middleware-host-header.HostHeaderResolvedConfig & @aws-sdk/middleware-sdk-sts.@aws-sdk/middleware-sdk-sts.StsAuthResolvedConfig & @aws-sdk/middleware-user-agent.@aws-sdk/middleware-user-agent.UserAgentResolvedConfig */
  @js.native
  trait STSClientResolvedConfigType extends StObject {
    
    /**
      * The API version set internally by the SDK, and is
      * not planned to be used by customer code.
      * @internal
      */
    val apiVersion: String = js.native
    
    def base64Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder = js.native
    
    def base64Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder = js.native
    
    def bodyLengthChecker(body: Any): js.UndefOr[Double] = js.native
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: BodyLengthCalculator = js.native
    
    def credentialDefaultProvider(input: Any): Provider[Credentials] = js.native
    @JSName("credentialDefaultProvider")
    var credentialDefaultProvider_Original: js.Function1[/* input */ Any, Provider[Credentials]] = js.native
    
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.credentials}
      * This provider MAY memoize the loaded credentials for certain period.
      * See {@link MemoizedProvider} for more information.
      */
    def credentials(): js.Promise[Credentials] = js.native
    def credentials(options: ForceRefresh): js.Promise[Credentials] = js.native
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.credentials}
      * This provider MAY memoize the loaded credentials for certain period.
      * See {@link MemoizedProvider} for more information.
      */
    @JSName("credentials")
    var credentials_Original: MemoizedProvider[Credentials] = js.native
    
    /**
      * The custom user agent header that would be appended to default one
      */
    var customUserAgent: js.UndefOr[UserAgent] = js.native
    
    def defaultUserAgentProvider(): js.Promise[UserAgent] = js.native
    /**
      * The provider populating default tracking information to be sent with `user-agent`, `x-amz-user-agent` header.
      * @internal
      */
    @JSName("defaultUserAgentProvider")
    var defaultUserAgentProvider_Original: Provider[UserAgent] = js.native
    
    var defaultsMode: DefaultsMode | Provider[DefaultsMode] = js.native
    
    var disableHostPrefix: Boolean = js.native
    
    /**
      * Resolved value for input {@link EndpointsInputConfig.endpoint}
      */
    def endpoint(): js.Promise[Endpoint] = js.native
    /**
      * Resolved value for input {@link EndpointsInputConfig.endpoint}
      */
    @JSName("endpoint")
    var endpoint_Original: Provider[Endpoint] = js.native
    
    /**
      * Whether the endpoint is specified by caller.
      * @internal
      */
    var isCustomEndpoint: Boolean = js.native
    
    var logger: Logger = js.native
    
    /**
      * Resolved value for input config {@link RetryInputConfig.maxAttempts}
      */
    def maxAttempts(): js.Promise[Double] = js.native
    /**
      * Resolved value for input config {@link RetryInputConfig.maxAttempts}
      */
    @JSName("maxAttempts")
    var maxAttempts_Original: (Double | Provider[Double]) & Provider[Double] = js.native
    
    /**
      * Resolved value for input config {@link RegionInputConfig.region}
      */
    def region(): js.Promise[String] = js.native
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = js.native
    def regionInfoProvider(region: String, options: RegionInfoProviderOptions): js.Promise[js.UndefOr[RegionInfo]] = js.native
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider = js.native
    
    /**
      * Resolved value for input config {@link RegionInputConfig.region}
      */
    @JSName("region")
    var region_Original: (String | Provider[String]) & Provider[String] = js.native
    
    /**
      * The HTTP handler to use. Fetch in browser and Https in Nodejs.
      */
    var requestHandler: (RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler & (RequestHandler[Any, Any, js.Object]) = js.native
    
    var retryMode: String | Provider[String] = js.native
    
    /**
      * Resolved value for input config {@link RetryInputConfig.retryStrategy}
      */
    def retryStrategy(): js.Promise[RetryStrategy] = js.native
    /**
      * Resolved value for input config {@link RetryInputConfig.retryStrategy}
      */
    @JSName("retryStrategy")
    var retryStrategy_Original: Provider[RetryStrategy] = js.native
    
    /**
      * The runtime environment
      */
    var runtime: String = js.native
    
    var serviceId: String = js.native
    
    var sha256: HashConstructor = js.native
    
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.signer}
      */
    def signer(): js.Promise[RequestSigner] = js.native
    def signer(authScheme: AuthScheme): js.Promise[RequestSigner] = js.native
    
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.signingEscapePath}
      */
    var signingEscapePath: Boolean = js.native
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array] = js.native
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector = js.native
    
    /**
      * Reference to STSClient class constructor.
      * @internal
      */
    var stsClientCtor: Instantiable1[
        /* clientConfig */ Any, 
        typingsJapgolly.awsSdkTypes.distTypesClientMod.Client[Any, Any, Any]
      ] = js.native
    
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.systemClockOffset}
      */
    var systemClockOffset: Double = js.native
    
    var tls: Boolean = js.native
    
    def urlParser(url: String): Endpoint = js.native
    def urlParser(url: URL): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
    
    /**
      * Resolved value for input {@link EndpointsInputConfig.useDualstackEndpoint}
      */
    def useDualstackEndpoint(): js.Promise[Boolean] = js.native
    /**
      * Resolved value for input {@link EndpointsInputConfig.useDualstackEndpoint}
      */
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_Original: (Boolean | Provider[Boolean]) & Provider[Boolean] = js.native
    
    /**
      * Resolved value for input {@link RegionInputConfig.useFipsEndpoint}
      */
    def useFipsEndpoint(): js.Promise[Boolean] = js.native
    /**
      * Resolved value for input {@link RegionInputConfig.useFipsEndpoint}
      */
    @JSName("useFipsEndpoint")
    var useFipsEndpoint_Original: (Boolean | Provider[Boolean]) & Provider[Boolean] = js.native
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder = js.native
  }
  
  type ServiceInputTypes = AssumeRoleCommandInput | AssumeRoleWithSAMLCommandInput | AssumeRoleWithWebIdentityCommandInput | DecodeAuthorizationMessageCommandInput | GetAccessKeyInfoCommandInput | GetCallerIdentityCommandInput | GetFederationTokenCommandInput | GetSessionTokenCommandInput
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandOutput
    - typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandOutput
    - typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandOutput
    - typingsJapgolly.awsSdkClientSts.distTypesCommandsDecodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandOutput
    - typingsJapgolly.awsSdkClientSts.distTypesCommandsGetAccessKeyInfoCommandMod.GetAccessKeyInfoCommandOutput
    - typingsJapgolly.awsSdkClientSts.distTypesCommandsGetCallerIdentityCommandMod.GetCallerIdentityCommandOutput
    - typingsJapgolly.awsSdkClientSts.distTypesCommandsGetFederationTokenCommandMod.GetFederationTokenCommandOutput
    - typingsJapgolly.awsSdkClientSts.distTypesCommandsGetSessionTokenCommandMod.GetSessionTokenCommandOutput
  */
  trait ServiceOutputTypes extends StObject
  object ServiceOutputTypes {
    
    inline def AssumeRoleCommandOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandOutput]
    }
    
    inline def AssumeRoleWithSAMLCommandOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandOutput]
    }
    
    inline def AssumeRoleWithWebIdentityCommandOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandOutput]
    }
    
    inline def DecodeAuthorizationMessageCommandOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSts.distTypesCommandsDecodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSts.distTypesCommandsDecodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandOutput]
    }
    
    inline def GetAccessKeyInfoCommandOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSts.distTypesCommandsGetAccessKeyInfoCommandMod.GetAccessKeyInfoCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSts.distTypesCommandsGetAccessKeyInfoCommandMod.GetAccessKeyInfoCommandOutput]
    }
    
    inline def GetCallerIdentityCommandOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSts.distTypesCommandsGetCallerIdentityCommandMod.GetCallerIdentityCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSts.distTypesCommandsGetCallerIdentityCommandMod.GetCallerIdentityCommandOutput]
    }
    
    inline def GetFederationTokenCommandOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSts.distTypesCommandsGetFederationTokenCommandMod.GetFederationTokenCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSts.distTypesCommandsGetFederationTokenCommandMod.GetFederationTokenCommandOutput]
    }
    
    inline def GetSessionTokenCommandOutput($metadata: ResponseMetadata): typingsJapgolly.awsSdkClientSts.distTypesCommandsGetSessionTokenCommandMod.GetSessionTokenCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSts.distTypesCommandsGetSessionTokenCommandMod.GetSessionTokenCommandOutput]
    }
  }
}
