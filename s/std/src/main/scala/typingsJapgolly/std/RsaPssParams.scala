package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaPssParams
  extends StObject
     with Algorithm {
  
  /* standard dom */
  var saltLength: Double
}
object RsaPssParams {
  
  inline def apply(name: java.lang.String, saltLength: Double): RsaPssParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPssParams]
  }
  
  extension [Self <: RsaPssParams](x: Self) {
    
    inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
  }
}
