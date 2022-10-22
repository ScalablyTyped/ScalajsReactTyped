package typingsJapgolly.awsSdkMiddlewareRetry

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LoadedConfigSelectors
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RetryStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConfigurationsMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/configurations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/configurations", "CONFIG_MAX_ATTEMPTS")
  @js.native
  val CONFIG_MAX_ATTEMPTS: /* "max_attempts" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/configurations", "CONFIG_RETRY_MODE")
  @js.native
  val CONFIG_RETRY_MODE: /* "retry_mode" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/configurations", "ENV_MAX_ATTEMPTS")
  @js.native
  val ENV_MAX_ATTEMPTS: /* "AWS_MAX_ATTEMPTS" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/configurations", "ENV_RETRY_MODE")
  @js.native
  val ENV_RETRY_MODE: /* "AWS_RETRY_MODE" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/configurations", "NODE_MAX_ATTEMPT_CONFIG_OPTIONS")
  @js.native
  val NODE_MAX_ATTEMPT_CONFIG_OPTIONS: LoadedConfigSelectors[Double] = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/configurations", "NODE_RETRY_MODE_CONFIG_OPTIONS")
  @js.native
  val NODE_RETRY_MODE_CONFIG_OPTIONS: LoadedConfigSelectors[String] = js.native
  
  inline def resolveRetryConfig[T](input: T & PreviouslyResolved & RetryInputConfig): T & RetryResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRetryConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & RetryResolvedConfig]
  
  trait PreviouslyResolved extends StObject {
    
    /**
      * Specifies provider for retry algorithm to use.
      * @internal
      */
    var retryMode: String | Provider[String]
  }
  object PreviouslyResolved {
    
    inline def apply(retryMode: String | Provider[String]): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(retryMode = retryMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setRetryMode(value: String | Provider[String]): Self = StObject.set(x, "retryMode", value.asInstanceOf[js.Any])
      
      inline def setRetryModeCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "retryMode", value.toJsFn)
    }
  }
  
  trait RetryInputConfig extends StObject {
    
    /**
      * The maximum number of times requests that encounter retryable failures should be attempted.
      */
    var maxAttempts: js.UndefOr[Double | Provider[Double]] = js.undefined
    
    /**
      * The strategy to retry the request. Using built-in exponential backoff strategy by default.
      */
    var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
  }
  object RetryInputConfig {
    
    inline def apply(): RetryInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryInputConfig]
    }
    
    extension [Self <: RetryInputConfig](x: Self) {
      
      inline def setMaxAttempts(value: Double | Provider[Double]): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsCallbackTo(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "maxAttempts", value.toJsFn)
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
      
      inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
    }
  }
  
  trait RetryResolvedConfig extends StObject {
    
    /**
      * Resolved value for input config {@link RetryInputConfig.maxAttempts}
      */
    def maxAttempts(): js.Promise[Double]
    /**
      * Resolved value for input config {@link RetryInputConfig.maxAttempts}
      */
    @JSName("maxAttempts")
    var maxAttempts_Original: Provider[Double]
    
    /**
      * Resolved value for input config {@link RetryInputConfig.retryStrategy}
      */
    def retryStrategy(): js.Promise[RetryStrategy]
    /**
      * Resolved value for input config {@link RetryInputConfig.retryStrategy}
      */
    @JSName("retryStrategy")
    var retryStrategy_Original: Provider[RetryStrategy]
  }
  object RetryResolvedConfig {
    
    inline def apply(maxAttempts: CallbackTo[js.Promise[Double]], retryStrategy: CallbackTo[js.Promise[RetryStrategy]]): RetryResolvedConfig = {
      val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.toJsFn, retryStrategy = retryStrategy.toJsFn)
      __obj.asInstanceOf[RetryResolvedConfig]
    }
    
    extension [Self <: RetryResolvedConfig](x: Self) {
      
      inline def setMaxAttempts(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "maxAttempts", value.toJsFn)
      
      inline def setRetryStrategy(value: CallbackTo[js.Promise[RetryStrategy]]): Self = StObject.set(x, "retryStrategy", value.toJsFn)
    }
  }
}
