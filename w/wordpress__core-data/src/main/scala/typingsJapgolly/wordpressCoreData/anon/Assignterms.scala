package typingsJapgolly.wordpressCoreData.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assignterms extends StObject {
  
  var assign_terms: String
  
  var delete_terms: String
  
  var edit_terms: String
  
  var manage_terms: String
}
object Assignterms {
  
  inline def apply(assign_terms: String, delete_terms: String, edit_terms: String, manage_terms: String): Assignterms = {
    val __obj = js.Dynamic.literal(assign_terms = assign_terms.asInstanceOf[js.Any], delete_terms = delete_terms.asInstanceOf[js.Any], edit_terms = edit_terms.asInstanceOf[js.Any], manage_terms = manage_terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignterms]
  }
  
  extension [Self <: Assignterms](x: Self) {
    
    inline def setAssign_terms(value: String): Self = StObject.set(x, "assign_terms", value.asInstanceOf[js.Any])
    
    inline def setDelete_terms(value: String): Self = StObject.set(x, "delete_terms", value.asInstanceOf[js.Any])
    
    inline def setEdit_terms(value: String): Self = StObject.set(x, "edit_terms", value.asInstanceOf[js.Any])
    
    inline def setManage_terms(value: String): Self = StObject.set(x, "manage_terms", value.asInstanceOf[js.Any])
  }
}
