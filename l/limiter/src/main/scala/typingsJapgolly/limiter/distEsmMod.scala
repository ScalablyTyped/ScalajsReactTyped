package typingsJapgolly.limiter

import typingsJapgolly.limiter.distEsmRateLimiterMod.RateLimiterOpts
import typingsJapgolly.limiter.distEsmTokenBucketMod.TokenBucketOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmMod {
  
  @JSImport("limiter/dist/esm", "RateLimiter")
  @js.native
  open class RateLimiter protected ()
    extends typingsJapgolly.limiter.distEsmRateLimiterMod.RateLimiter {
    def this(hasTokensPerIntervalIntervalFireImmediately: RateLimiterOpts) = this()
  }
  
  @JSImport("limiter/dist/esm", "TokenBucket")
  @js.native
  open class TokenBucket protected ()
    extends typingsJapgolly.limiter.distEsmTokenBucketMod.TokenBucket {
    def this(hasBucketSizeTokensPerIntervalIntervalParentBucket: TokenBucketOpts) = this()
  }
}
