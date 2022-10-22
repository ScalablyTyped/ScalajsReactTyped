package typingsJapgolly.awsSdkMiddlewareSigning

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4CryptoInit
import typingsJapgolly.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4Init
import typingsJapgolly.awsSdkTypes.anon.ForceRefresh
import typingsJapgolly.awsSdkTypes.distTypesAuthMod.AuthScheme
import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.distTypesLoggerMod.Logger
import typingsJapgolly.awsSdkTypes.distTypesSignatureMod.RequestSigner
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.MemoizedProvider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RegionInfo
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RegionInfoProvider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RegionInfoProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConfigurationsMod {
  
  @JSImport("@aws-sdk/middleware-signing/dist-types/configurations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveAwsAuthConfig[T](input: T & AwsAuthInputConfig & PreviouslyResolved): T & AwsAuthResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAwsAuthConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & AwsAuthResolvedConfig]
  
  inline def resolveSigV4AuthConfig[T](input: T & SigV4AuthInputConfig & SigV4PreviouslyResolved): T & SigV4AuthResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSigV4AuthConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & SigV4AuthResolvedConfig]
  
  trait AwsAuthInputConfig extends StObject {
    
    /**
      * The credentials used to sign requests.
      */
    var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.undefined
    
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
      * An offset value in milliseconds to apply to all signing times.
      */
    var systemClockOffset: js.UndefOr[Double] = js.undefined
  }
  object AwsAuthInputConfig {
    
    inline def apply(): AwsAuthInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AwsAuthInputConfig]
    }
    
    extension [Self <: AwsAuthInputConfig](x: Self) {
      
      inline def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsCallbackTo(value: CallbackTo[js.Promise[Credentials]]): Self = StObject.set(x, "credentials", value.toJsFn)
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
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
      
      inline def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
      
      inline def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
    }
  }
  
  @js.native
  trait AwsAuthResolvedConfig extends StObject {
    
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
      * Resolved value for input config {@link AwsAuthInputConfig.signer}
      */
    def signer(): js.Promise[RequestSigner] = js.native
    def signer(authScheme: AuthScheme): js.Promise[RequestSigner] = js.native
    
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.signingEscapePath}
      */
    var signingEscapePath: Boolean = js.native
    
    /**
      * Resolved value for input config {@link AwsAuthInputConfig.systemClockOffset}
      */
    var systemClockOffset: Double = js.native
  }
  
  trait PreviouslyResolved extends StObject {
    
    def credentialDefaultProvider(input: Any): MemoizedProvider[Credentials]
    
    var region: String | Provider[String]
    
    var regionInfoProvider: js.UndefOr[RegionInfoProvider] = js.undefined
    
    var serviceId: String
    
    var sha256: HashConstructor
    
    var signingName: js.UndefOr[String] = js.undefined
    
    def useDualstackEndpoint(): js.Promise[Boolean]
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_Original: Provider[Boolean]
    
    def useFipsEndpoint(): js.Promise[Boolean]
    @JSName("useFipsEndpoint")
    var useFipsEndpoint_Original: Provider[Boolean]
  }
  object PreviouslyResolved {
    
    inline def apply(
      credentialDefaultProvider: Any => MemoizedProvider[Credentials],
      region: String | Provider[String],
      serviceId: String,
      sha256: HashConstructor,
      useDualstackEndpoint: CallbackTo[js.Promise[Boolean]],
      useFipsEndpoint: CallbackTo[js.Promise[Boolean]]
    ): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(credentialDefaultProvider = js.Any.fromFunction1(credentialDefaultProvider), region = region.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], useDualstackEndpoint = useDualstackEndpoint.toJsFn, useFipsEndpoint = useFipsEndpoint.toJsFn)
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setCredentialDefaultProvider(value: Any => MemoizedProvider[Credentials]): Self = StObject.set(x, "credentialDefaultProvider", js.Any.fromFunction1(value))
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setRegionInfoProviderUndefined: Self = StObject.set(x, "regionInfoProvider", js.undefined)
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      inline def setSigningNameUndefined: Self = StObject.set(x, "signingName", js.undefined)
      
      inline def setUseDualstackEndpoint(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useDualstackEndpoint", value.toJsFn)
      
      inline def setUseFipsEndpoint(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "useFipsEndpoint", value.toJsFn)
    }
  }
  
  trait SigV4AuthInputConfig extends StObject {
    
    /**
      * The credentials used to sign requests.
      */
    var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.undefined
    
    /**
      * The signer to use when signing requests.
      */
    var signer: js.UndefOr[
        RequestSigner | (js.Function1[/* authScheme */ js.UndefOr[AuthScheme], js.Promise[RequestSigner]])
      ] = js.undefined
    
    /**
      * Whether to escape request path when signing the request.
      */
    var signingEscapePath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An offset value in milliseconds to apply to all signing times.
      */
    var systemClockOffset: js.UndefOr[Double] = js.undefined
  }
  object SigV4AuthInputConfig {
    
    inline def apply(): SigV4AuthInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SigV4AuthInputConfig]
    }
    
    extension [Self <: SigV4AuthInputConfig](x: Self) {
      
      inline def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsCallbackTo(value: CallbackTo[js.Promise[Credentials]]): Self = StObject.set(x, "credentials", value.toJsFn)
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setSigner(
        value: RequestSigner | (js.Function1[/* authScheme */ js.UndefOr[AuthScheme], js.Promise[RequestSigner]])
      ): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
      
      inline def setSignerFunction1(value: /* authScheme */ js.UndefOr[AuthScheme] => js.Promise[RequestSigner]): Self = StObject.set(x, "signer", js.Any.fromFunction1(value))
      
      inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
      
      inline def setSigningEscapePath(value: Boolean): Self = StObject.set(x, "signingEscapePath", value.asInstanceOf[js.Any])
      
      inline def setSigningEscapePathUndefined: Self = StObject.set(x, "signingEscapePath", js.undefined)
      
      inline def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
      
      inline def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
    }
  }
  
  type SigV4AuthResolvedConfig = AwsAuthResolvedConfig
  
  trait SigV4PreviouslyResolved extends StObject {
    
    def credentialDefaultProvider(input: Any): MemoizedProvider[Credentials]
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var region: String | Provider[String]
    
    var sha256: HashConstructor
    
    var signingName: String
  }
  object SigV4PreviouslyResolved {
    
    inline def apply(
      credentialDefaultProvider: Any => MemoizedProvider[Credentials],
      region: String | Provider[String],
      sha256: HashConstructor,
      signingName: String
    ): SigV4PreviouslyResolved = {
      val __obj = js.Dynamic.literal(credentialDefaultProvider = js.Any.fromFunction1(credentialDefaultProvider), region = region.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SigV4PreviouslyResolved]
    }
    
    extension [Self <: SigV4PreviouslyResolved](x: Self) {
      
      inline def setCredentialDefaultProvider(value: Any => MemoizedProvider[Credentials]): Self = StObject.set(x, "credentialDefaultProvider", js.Any.fromFunction1(value))
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
    }
  }
}
