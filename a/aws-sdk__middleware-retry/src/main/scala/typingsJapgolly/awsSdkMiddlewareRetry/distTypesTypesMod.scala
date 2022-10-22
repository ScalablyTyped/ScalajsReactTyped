package typingsJapgolly.awsSdkMiddlewareRetry

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkTypes.distTypesShapesMod.SdkError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  type DelayDecider = js.Function2[/* delayBase */ Double, /* attempts */ Double, Double]
  
  trait RateLimiter extends StObject {
    
    /**
      * If there is sufficient capacity (tokens) available, it immediately returns.
      * If there is not sufficient capacity, it will either sleep a certain amount
      * of time until the rate limiter can retrieve a token from its token bucket
      * or raise an exception indicating there is insufficient capacity.
      */
    def getSendToken(): js.Promise[Unit]
    
    /**
      * Updates the client sending rate based on response.
      * If the response was successful, the capacity and fill rate are increased.
      * If the response was a throttling response, the capacity and fill rate are
      * decreased. Transient errors do not affect the rate limiter.
      */
    def updateClientSendingRate(response: Any): Unit
  }
  object RateLimiter {
    
    inline def apply(getSendToken: CallbackTo[js.Promise[Unit]], updateClientSendingRate: Any => Callback): RateLimiter = {
      val __obj = js.Dynamic.literal(getSendToken = getSendToken.toJsFn, updateClientSendingRate = js.Any.fromFunction1((t0: Any) => updateClientSendingRate(t0).runNow()))
      __obj.asInstanceOf[RateLimiter]
    }
    
    extension [Self <: RateLimiter](x: Self) {
      
      inline def setGetSendToken(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "getSendToken", value.toJsFn)
      
      inline def setUpdateClientSendingRate(value: Any => Callback): Self = StObject.set(x, "updateClientSendingRate", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  type RetryDecider = js.Function1[/* error */ SdkError, Boolean]
  
  @js.native
  trait RetryQuota extends StObject {
    
    /**
      * returns true if retry tokens are available from the retry quota bucket.
      */
    def hasRetryTokens(error: SdkError): Boolean = js.native
    
    /**
      * releases tokens back to the retry quota.
      */
    def releaseRetryTokens(): Unit = js.native
    def releaseRetryTokens(releaseCapacityAmount: Double): Unit = js.native
    
    /**
      * returns token amount from the retry quota bucket.
      * throws error is retry tokens are not available.
      */
    def retrieveRetryTokens(error: SdkError): Double = js.native
  }
}
