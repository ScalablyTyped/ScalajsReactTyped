package typingsJapgolly.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Supported extends StObject {
  
  var supported: js.UndefOr[Boolean] = js.undefined
}
object Supported {
  
  inline def apply(): Supported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Supported]
  }
  
  extension [Self <: Supported](x: Self) {
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
  }
}
