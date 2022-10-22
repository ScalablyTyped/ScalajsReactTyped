package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Created extends StObject {
  
  var created: scala.Double
  
  var pendingUpload: scala.Double
}
object Created {
  
  inline def apply(created: scala.Double, pendingUpload: scala.Double): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], pendingUpload = pendingUpload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  
  extension [Self <: Created](x: Self) {
    
    inline def setCreated(value: scala.Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setPendingUpload(value: scala.Double): Self = StObject.set(x, "pendingUpload", value.asInstanceOf[js.Any])
  }
}
