package typingsJapgolly.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryOptions extends StObject {
  
  /** in milliseconds */
  var delay: Double
  
  var maxRetries: Double
}
object RetryOptions {
  
  inline def apply(delay: Double, maxRetries: Double): RetryOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
  
  extension [Self <: RetryOptions](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
  }
}
