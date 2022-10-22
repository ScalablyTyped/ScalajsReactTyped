package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyAlgorithm extends StObject {
  
  /* standard dom */
  var name: java.lang.String
}
object KeyAlgorithm {
  
  inline def apply(name: java.lang.String): KeyAlgorithm = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyAlgorithm]
  }
  
  extension [Self <: KeyAlgorithm](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
