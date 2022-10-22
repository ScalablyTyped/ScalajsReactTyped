package typingsJapgolly.awsSdkRetryMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildDelayDeciderMod {
  
  @JSImport("@aws-sdk/retry-middleware/build/delayDecider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultDelayDecider(delayBase: Double, attempts: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDelayDecider")(delayBase.asInstanceOf[js.Any], attempts.asInstanceOf[js.Any])).asInstanceOf[Double]
}
