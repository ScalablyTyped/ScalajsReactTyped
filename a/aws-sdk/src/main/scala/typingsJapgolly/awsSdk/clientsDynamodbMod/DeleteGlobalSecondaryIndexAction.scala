package typingsJapgolly.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGlobalSecondaryIndexAction extends StObject {
  
  /**
    * The name of the global secondary index to be deleted.
    */
  var IndexName: typingsJapgolly.awsSdk.clientsDynamodbMod.IndexName
}
object DeleteGlobalSecondaryIndexAction {
  
  inline def apply(IndexName: IndexName): DeleteGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalSecondaryIndexAction]
  }
  
  extension [Self <: DeleteGlobalSecondaryIndexAction](x: Self) {
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
  }
}
