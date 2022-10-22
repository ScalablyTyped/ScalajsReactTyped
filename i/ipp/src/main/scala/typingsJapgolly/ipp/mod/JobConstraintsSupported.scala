package typingsJapgolly.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConstraintsSupported extends StObject {
  
  var `resolver-name`: js.UndefOr[String] = js.undefined
}
object JobConstraintsSupported {
  
  inline def apply(): JobConstraintsSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConstraintsSupported]
  }
  
  extension [Self <: JobConstraintsSupported](x: Self) {
    
    inline def `setResolver-name`(value: String): Self = StObject.set(x, "resolver-name", value.asInstanceOf[js.Any])
    
    inline def `setResolver-nameUndefined`: Self = StObject.set(x, "resolver-name", js.undefined)
  }
}
