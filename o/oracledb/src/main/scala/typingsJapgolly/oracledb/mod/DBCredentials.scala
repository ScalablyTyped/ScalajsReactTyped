package typingsJapgolly.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.oracledb.anon.ConnectionString
  - typingsJapgolly.oracledb.anon.ConnectString
*/
trait DBCredentials extends StObject
object DBCredentials {
  
  inline def ConnectString(connectString: String, password: String, user: String): typingsJapgolly.oracledb.anon.ConnectString = {
    val __obj = js.Dynamic.literal(connectString = connectString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.oracledb.anon.ConnectString]
  }
  
  inline def ConnectionString(connectionString: String, password: String, user: String): typingsJapgolly.oracledb.anon.ConnectionString = {
    val __obj = js.Dynamic.literal(connectionString = connectionString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.oracledb.anon.ConnectionString]
  }
}
