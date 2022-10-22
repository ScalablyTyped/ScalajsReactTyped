package typingsJapgolly.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditableModel
  extends StObject
     with TemporalModel {
  
  val updated_at: String | Null
}
object AuditableModel {
  
  inline def apply(created_at: String, id: ZendeskID): AuditableModel = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = null)
    __obj.asInstanceOf[AuditableModel]
  }
  
  extension [Self <: AuditableModel](x: Self) {
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
  }
}
