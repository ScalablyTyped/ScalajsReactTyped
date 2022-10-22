package typingsJapgolly.awsSdkMiddlewareRetry

import typingsJapgolly.awsSdkMiddlewareRetry.anon.AfterRequest
import typingsJapgolly.awsSdkMiddlewareRetry.anon.Output
import typingsJapgolly.awsSdkMiddlewareRetry.distTypesTypesMod.DelayDecider
import typingsJapgolly.awsSdkMiddlewareRetry.distTypesTypesMod.RetryDecider
import typingsJapgolly.awsSdkMiddlewareRetry.distTypesTypesMod.RetryQuota
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandlerArguments
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandlerOutput
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesShapesMod.SdkError
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.RetryStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStandardRetryStrategyMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/StandardRetryStrategy", "StandardRetryStrategy")
  @js.native
  open class StandardRetryStrategy protected ()
    extends StObject
       with RetryStrategy {
    def this(maxAttemptsProvider: Provider[Double]) = this()
    def this(maxAttemptsProvider: Provider[Double], options: StandardRetryStrategyOptions) = this()
    
    /* private */ var delayDecider: Any = js.native
    
    /* private */ var getMaxAttempts: Any = js.native
    
    /* private */ val maxAttemptsProvider: Any = js.native
    
    @JSName("mode")
    var mode_StandardRetryStrategy: String = js.native
    
    /**
      * the retry behavior the will invoke the next handler and handle the retry accordingly.
      * This function should also update the $metadata from the response accordingly.
      * @see {@link ResponseMetadata}
      */
    /* CompleteClass */
    override def retry[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: FinalizeHandler[Input, Output], args: FinalizeHandlerArguments[Input]): js.Promise[FinalizeHandlerOutput[Output]] = js.native
    def retry[Input /* <: js.Object */, Ouput /* <: MetadataBearer */](next: FinalizeHandler[Input, Ouput], args: FinalizeHandlerArguments[Input], options: AfterRequest): js.Promise[Output[Ouput]] = js.native
    
    /* private */ var retryDecider: Any = js.native
    
    /* private */ var retryQuota: Any = js.native
    
    /* private */ var shouldRetry: Any = js.native
  }
  
  trait StandardRetryStrategyOptions extends StObject {
    
    var delayDecider: js.UndefOr[DelayDecider] = js.undefined
    
    var retryDecider: js.UndefOr[RetryDecider] = js.undefined
    
    var retryQuota: js.UndefOr[RetryQuota] = js.undefined
  }
  object StandardRetryStrategyOptions {
    
    inline def apply(): StandardRetryStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardRetryStrategyOptions]
    }
    
    extension [Self <: StandardRetryStrategyOptions](x: Self) {
      
      inline def setDelayDecider(value: (/* delayBase */ Double, /* attempts */ Double) => Double): Self = StObject.set(x, "delayDecider", js.Any.fromFunction2(value))
      
      inline def setDelayDeciderUndefined: Self = StObject.set(x, "delayDecider", js.undefined)
      
      inline def setRetryDecider(value: /* error */ SdkError => Boolean): Self = StObject.set(x, "retryDecider", js.Any.fromFunction1(value))
      
      inline def setRetryDeciderUndefined: Self = StObject.set(x, "retryDecider", js.undefined)
      
      inline def setRetryQuota(value: RetryQuota): Self = StObject.set(x, "retryQuota", value.asInstanceOf[js.Any])
      
      inline def setRetryQuotaUndefined: Self = StObject.set(x, "retryQuota", js.undefined)
    }
  }
}
