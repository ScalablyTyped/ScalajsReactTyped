package typingsJapgolly.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Added extends StObject {
  
  var added: Double
  
  var deleted: Double
}
object Added {
  
  inline def apply(added: Double, deleted: Double): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  
  extension [Self <: Added](x: Self) {
    
    inline def setAdded(value: Double): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
  }
}
