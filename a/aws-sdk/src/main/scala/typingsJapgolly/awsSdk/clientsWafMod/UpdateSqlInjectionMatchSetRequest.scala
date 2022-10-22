package typingsJapgolly.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSqlInjectionMatchSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsJapgolly.awsSdk.clientsWafMod.ChangeToken
  
  /**
    * The SqlInjectionMatchSetId of the SqlInjectionMatchSet that you want to update. SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
    */
  var SqlInjectionMatchSetId: ResourceId
  
  /**
    * An array of SqlInjectionMatchSetUpdate objects that you want to insert into or delete from a SqlInjectionMatchSet. For more information, see the applicable data types:    SqlInjectionMatchSetUpdate: Contains Action and SqlInjectionMatchTuple     SqlInjectionMatchTuple: Contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var Updates: SqlInjectionMatchSetUpdates
}
object UpdateSqlInjectionMatchSetRequest {
  
  inline def apply(ChangeToken: ChangeToken, SqlInjectionMatchSetId: ResourceId, Updates: SqlInjectionMatchSetUpdates): UpdateSqlInjectionMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], SqlInjectionMatchSetId = SqlInjectionMatchSetId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSqlInjectionMatchSetRequest]
  }
  
  extension [Self <: UpdateSqlInjectionMatchSetRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setSqlInjectionMatchSetId(value: ResourceId): Self = StObject.set(x, "SqlInjectionMatchSetId", value.asInstanceOf[js.Any])
    
    inline def setUpdates(value: SqlInjectionMatchSetUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesVarargs(value: SqlInjectionMatchSetUpdate*): Self = StObject.set(x, "Updates", js.Array(value*))
  }
}
