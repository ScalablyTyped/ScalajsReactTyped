package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInvitationidOwnerRepo extends StObject {
  
  var path: InvitationidOwnerRepo
}
object PathInvitationidOwnerRepo {
  
  inline def apply(path: InvitationidOwnerRepo): PathInvitationidOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInvitationidOwnerRepo]
  }
  
  extension [Self <: PathInvitationidOwnerRepo](x: Self) {
    
    inline def setPath(value: InvitationidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
