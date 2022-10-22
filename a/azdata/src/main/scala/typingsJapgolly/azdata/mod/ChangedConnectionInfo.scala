package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangedConnectionInfo extends StObject {
  
  /**
    * Summary of details containing any connection changes.
    */
  var connection: ConnectionSummary
  
  /**
    * Owner URI of the connection that changed.
    */
  var connectionUri: String
}
object ChangedConnectionInfo {
  
  inline def apply(connection: ConnectionSummary, connectionUri: String): ChangedConnectionInfo = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], connectionUri = connectionUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedConnectionInfo]
  }
  
  extension [Self <: ChangedConnectionInfo](x: Self) {
    
    inline def setConnection(value: ConnectionSummary): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUri(value: String): Self = StObject.set(x, "connectionUri", value.asInstanceOf[js.Any])
  }
}
