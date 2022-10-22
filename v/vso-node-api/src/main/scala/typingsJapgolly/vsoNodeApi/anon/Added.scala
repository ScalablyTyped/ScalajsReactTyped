package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Added extends StObject {
  
  var added: scala.Double
  
  var deleted: scala.Double
  
  var modified: scala.Double
}
object Added {
  
  inline def apply(added: scala.Double, deleted: scala.Double, modified: scala.Double): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  
  extension [Self <: Added](x: Self) {
    
    inline def setAdded(value: scala.Double): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: scala.Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setModified(value: scala.Double): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
  }
}
