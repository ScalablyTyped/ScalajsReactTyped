package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInvitationid extends StObject {
  
  var path: Invitationid
}
object PathInvitationid {
  
  inline def apply(path: Invitationid): PathInvitationid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInvitationid]
  }
  
  extension [Self <: PathInvitationid](x: Self) {
    
    inline def setPath(value: Invitationid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
