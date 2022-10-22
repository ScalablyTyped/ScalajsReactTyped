package typingsJapgolly.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredicateChoice extends StObject {
  
  var cred_def_id: CredentialDefinitionID
  
  var predicate: String
  
  var schema_id: CredentialSchemaID
}
object PredicateChoice {
  
  inline def apply(cred_def_id: CredentialDefinitionID, predicate: String, schema_id: CredentialSchemaID): PredicateChoice = {
    val __obj = js.Dynamic.literal(cred_def_id = cred_def_id.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], schema_id = schema_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredicateChoice]
  }
  
  extension [Self <: PredicateChoice](x: Self) {
    
    inline def setCred_def_id(value: CredentialDefinitionID): Self = StObject.set(x, "cred_def_id", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: String): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setSchema_id(value: CredentialSchemaID): Self = StObject.set(x, "schema_id", value.asInstanceOf[js.Any])
  }
}
