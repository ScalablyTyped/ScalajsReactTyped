package typingsJapgolly.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mismatch extends StObject {
  
  var mismatch: String
}
object Mismatch {
  
  inline def apply(mismatch: String): Mismatch = {
    val __obj = js.Dynamic.literal(mismatch = mismatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mismatch]
  }
  
  extension [Self <: Mismatch](x: Self) {
    
    inline def setMismatch(value: String): Self = StObject.set(x, "mismatch", value.asInstanceOf[js.Any])
  }
}
