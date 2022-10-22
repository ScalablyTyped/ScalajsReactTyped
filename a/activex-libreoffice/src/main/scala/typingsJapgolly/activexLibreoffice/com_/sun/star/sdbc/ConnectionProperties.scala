package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents the properties for a connection (session) with a specific database. These properties can be used when calling the method {@link
  * com.sun.star.sdbc.XDriver.connect()} or {@link com.sun.star.sdbc.XDriverManager.getConnectionWithInfo()} .
  *
  * The properties for a connection contain additional information about how to connect to a database and how to control the behavior of the resulting
  * connection should be.
  * @see com.sun.star.sdbc.XDriver
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.JDBCConnectionProperties
  * @see com.sun.star.sdbc.ODBCConnectionProperties
  * @see com.sun.star.sdbc.FILEConnectionProperties
  * @see com.sun.star.sdbc.DBASEConnectionProperties
  * @see com.sun.star.sdbc.FLATConnectionProperties
  */
trait ConnectionProperties extends StObject {
  
  /** the password */
  var password: String
  
  /** the username */
  var user: String
}
object ConnectionProperties {
  
  inline def apply(password: String, user: String): ConnectionProperties = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionProperties]
  }
  
  extension [Self <: ConnectionProperties](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
