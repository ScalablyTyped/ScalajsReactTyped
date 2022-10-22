package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.anon.Android
import typingsJapgolly.ionic.ionicStrings.development
import typingsJapgolly.ionic.ionicStrings.production
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityProfile extends StObject {
  
  var created: String
  
  var credentials: Android
  
  var name: String
  
  var tag: String
  
  var `type`: development | production
}
object SecurityProfile {
  
  inline def apply(created: String, credentials: Android, name: String, tag: String, `type`: development | production): SecurityProfile = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfile]
  }
  
  extension [Self <: SecurityProfile](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCredentials(value: Android): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: development | production): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
