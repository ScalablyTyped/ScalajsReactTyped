package typingsJapgolly.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Database
trait DatabaseUser extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var extra: js.UndefOr[js.Object] = js.undefined
  
  var passwd: js.UndefOr[String] = js.undefined
  
  var username: String
}
object DatabaseUser {
  
  inline def apply(username: String): DatabaseUser = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseUser]
  }
  
  extension [Self <: DatabaseUser](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setExtra(value: js.Object): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setPasswd(value: String): Self = StObject.set(x, "passwd", value.asInstanceOf[js.Any])
    
    inline def setPasswdUndefined: Self = StObject.set(x, "passwd", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
