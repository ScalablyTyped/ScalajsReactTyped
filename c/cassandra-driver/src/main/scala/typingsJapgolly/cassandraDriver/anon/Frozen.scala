package typingsJapgolly.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frozen extends StObject {
  
  var frozen: Boolean
  
  var reversed: Boolean
}
object Frozen {
  
  inline def apply(frozen: Boolean, reversed: Boolean): Frozen = {
    val __obj = js.Dynamic.literal(frozen = frozen.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frozen]
  }
  
  extension [Self <: Frozen](x: Self) {
    
    inline def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
  }
}
