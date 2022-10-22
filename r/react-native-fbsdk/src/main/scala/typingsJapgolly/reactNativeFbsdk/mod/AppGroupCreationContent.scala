package typingsJapgolly.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppGroupCreationContent extends StObject {
  
  /**
    * The description of the group.
    */
  var description: String
  
  /**
    * The name of the group.
    */
  var name: String
  
  /**
    * The privacy for the group.
    */
  var privacy: AppGroupPrivacy
}
object AppGroupCreationContent {
  
  inline def apply(description: String, name: String, privacy: AppGroupPrivacy): AppGroupCreationContent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppGroupCreationContent]
  }
  
  extension [Self <: AppGroupCreationContent](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrivacy(value: AppGroupPrivacy): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
  }
}
