package typingsJapgolly.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftDatabaseCredentials extends StObject {
  
  var Password: RedshiftDatabasePassword
  
  var Username: RedshiftDatabaseUsername
}
object RedshiftDatabaseCredentials {
  
  inline def apply(Password: RedshiftDatabasePassword, Username: RedshiftDatabaseUsername): RedshiftDatabaseCredentials = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDatabaseCredentials]
  }
  
  extension [Self <: RedshiftDatabaseCredentials](x: Self) {
    
    inline def setPassword(value: RedshiftDatabasePassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: RedshiftDatabaseUsername): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
