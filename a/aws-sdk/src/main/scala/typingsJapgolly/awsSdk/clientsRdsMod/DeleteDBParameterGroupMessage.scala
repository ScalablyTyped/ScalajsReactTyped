package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBParameterGroupMessage extends StObject {
  
  /**
    * The name of the DB parameter group. Constraints:   Must be the name of an existing DB parameter group   You can't delete a default DB parameter group   Can't be associated with any DB instances  
    */
  var DBParameterGroupName: String
}
object DeleteDBParameterGroupMessage {
  
  inline def apply(DBParameterGroupName: String): DeleteDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupName = DBParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBParameterGroupMessage]
  }
  
  extension [Self <: DeleteDBParameterGroupMessage](x: Self) {
    
    inline def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
  }
}
