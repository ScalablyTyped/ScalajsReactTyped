package typingsJapgolly.gapiDrive.gapi.client.drive

import typingsJapgolly.gapiDrive.gapiDriveStrings.driveNumbersignparentReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentResource extends StObject {
  
  var id: String
  
  var isRoot: Boolean
  
  var kind: driveNumbersignparentReference
  
  var parentLink: String
  
  var selfLink: String
}
object ParentResource {
  
  inline def apply(id: String, isRoot: Boolean, parentLink: String, selfLink: String): ParentResource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], kind = "drive#parentReference", parentLink = parentLink.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentResource]
  }
  
  extension [Self <: ParentResource](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    inline def setKind(value: driveNumbersignparentReference): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setParentLink(value: String): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
  }
}
