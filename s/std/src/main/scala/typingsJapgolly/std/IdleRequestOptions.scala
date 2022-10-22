package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleRequestOptions extends StObject {
  
  /* standard dom */
  var timeout: js.UndefOr[Double] = js.undefined
}
object IdleRequestOptions {
  
  inline def apply(): IdleRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdleRequestOptions]
  }
  
  extension [Self <: IdleRequestOptions](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
