package typingsJapgolly.stormReactDiagrams.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locked extends StObject {
  
  var locked: Boolean
}
object Locked {
  
  inline def apply(locked: Boolean): Locked = {
    val __obj = js.Dynamic.literal(locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locked]
  }
  
  extension [Self <: Locked](x: Self) {
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
  }
}
