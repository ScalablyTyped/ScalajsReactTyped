package typingsJapgolly.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sofort extends StObject {
  
  var sofort: js.UndefOr[`1`] = js.undefined
}
object Sofort {
  
  inline def apply(): Sofort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sofort]
  }
  
  extension [Self <: Sofort](x: Self) {
    
    inline def setSofort(value: `1`): Self = StObject.set(x, "sofort", value.asInstanceOf[js.Any])
    
    inline def setSofortUndefined: Self = StObject.set(x, "sofort", js.undefined)
  }
}
