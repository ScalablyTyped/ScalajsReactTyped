package typingsJapgolly.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitTimeoutOptions extends StObject {
  
  /**
    * Maximum wait time in milliseconds. Pass 0 to disable the timeout.
    *
    * The default value can be changed by using the
    * {@link Page.setDefaultTimeout} method.
    *
    * @defaultValue `30000`
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object WaitTimeoutOptions {
  
  inline def apply(): WaitTimeoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitTimeoutOptions]
  }
  
  extension [Self <: WaitTimeoutOptions](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
