package typingsJapgolly.awsSdkMiddlewareRetry

import typingsJapgolly.awsSdkMiddlewareRetry.distTypesAdaptiveRetryStrategyMod.AdaptiveRetryStrategyOptions
import typingsJapgolly.awsSdkMiddlewareRetry.distTypesConfigurationsMod.PreviouslyResolved
import typingsJapgolly.awsSdkMiddlewareRetry.distTypesConfigurationsMod.RetryInputConfig
import typingsJapgolly.awsSdkMiddlewareRetry.distTypesConfigurationsMod.RetryResolvedConfig
import typingsJapgolly.awsSdkMiddlewareRetry.distTypesDefaultRateLimiterMod.DefaultRateLimiterOptions
import typingsJapgolly.awsSdkMiddlewareRetry.distTypesStandardRetryStrategyMod.StandardRetryStrategyOptions
import typingsJapgolly.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LoadedConfigSelectors
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.AbsoluteLocation
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeRequestHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.RelativeMiddlewareOptions
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesShapesMod.SdkError
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "AdaptiveRetryStrategy")
  @js.native
  open class AdaptiveRetryStrategy protected ()
    extends typingsJapgolly.awsSdkMiddlewareRetry.distTypesAdaptiveRetryStrategyMod.AdaptiveRetryStrategy {
    def this(maxAttemptsProvider: Provider[Double]) = this()
    def this(maxAttemptsProvider: Provider[Double], options: AdaptiveRetryStrategyOptions) = this()
  }
  
  @JSImport("@aws-sdk/middleware-retry", "CONFIG_MAX_ATTEMPTS")
  @js.native
  val CONFIG_MAX_ATTEMPTS: /* "max_attempts" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "CONFIG_RETRY_MODE")
  @js.native
  val CONFIG_RETRY_MODE: /* "retry_mode" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "DEFAULT_MAX_ATTEMPTS")
  @js.native
  val DEFAULT_MAX_ATTEMPTS: /* 3 */ Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "DEFAULT_RETRY_MODE")
  @js.native
  val DEFAULT_RETRY_MODE: String | Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "DefaultRateLimiter")
  @js.native
  open class DefaultRateLimiter ()
    extends typingsJapgolly.awsSdkMiddlewareRetry.distTypesDefaultRateLimiterMod.DefaultRateLimiter {
    def this(options: DefaultRateLimiterOptions) = this()
  }
  
  @JSImport("@aws-sdk/middleware-retry", "ENV_MAX_ATTEMPTS")
  @js.native
  val ENV_MAX_ATTEMPTS: /* "AWS_MAX_ATTEMPTS" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "ENV_RETRY_MODE")
  @js.native
  val ENV_RETRY_MODE: /* "AWS_RETRY_MODE" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "NODE_MAX_ATTEMPT_CONFIG_OPTIONS")
  @js.native
  val NODE_MAX_ATTEMPT_CONFIG_OPTIONS: LoadedConfigSelectors[Double] = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "NODE_RETRY_MODE_CONFIG_OPTIONS")
  @js.native
  val NODE_RETRY_MODE_CONFIG_OPTIONS: LoadedConfigSelectors[String] = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "RETRY_MODES")
  @js.native
  object RETRY_MODES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.awsSdkMiddlewareRetry.distTypesConfigMod.RETRY_MODES & String] = js.native
    
    /* "adaptive" */ val ADAPTIVE: typingsJapgolly.awsSdkMiddlewareRetry.distTypesConfigMod.RETRY_MODES.ADAPTIVE & String = js.native
    
    /* "standard" */ val STANDARD: typingsJapgolly.awsSdkMiddlewareRetry.distTypesConfigMod.RETRY_MODES.STANDARD & String = js.native
  }
  
  @JSImport("@aws-sdk/middleware-retry", "StandardRetryStrategy")
  @js.native
  open class StandardRetryStrategy protected ()
    extends typingsJapgolly.awsSdkMiddlewareRetry.distTypesStandardRetryStrategyMod.StandardRetryStrategy {
    def this(maxAttemptsProvider: Provider[Double]) = this()
    def this(maxAttemptsProvider: Provider[Double], options: StandardRetryStrategyOptions) = this()
  }
  
  inline def defaultDelayDecider(delayBase: Double, attempts: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDelayDecider")(delayBase.asInstanceOf[js.Any], attempts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def defaultRetryDecider(error: SdkError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryDecider")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getOmitRetryHeadersPlugin(options: Any): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOmitRetryHeadersPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def getRetryPlugin(options: RetryResolvedConfig): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRetryPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def omitRetryHeadersMiddleware(): js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("omitRetryHeadersMiddleware")().asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  
  @JSImport("@aws-sdk/middleware-retry", "omitRetryHeadersMiddlewareOptions")
  @js.native
  val omitRetryHeadersMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  inline def resolveRetryConfig[T](input: T & PreviouslyResolved & RetryInputConfig): T & RetryResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRetryConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & RetryResolvedConfig]
  
  inline def retryMiddleware(options: RetryResolvedConfig): js.Function2[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    FinalizeHandler[Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  
  @JSImport("@aws-sdk/middleware-retry", "retryMiddlewareOptions")
  @js.native
  val retryMiddlewareOptions: FinalizeRequestHandlerOptions & AbsoluteLocation = js.native
}
