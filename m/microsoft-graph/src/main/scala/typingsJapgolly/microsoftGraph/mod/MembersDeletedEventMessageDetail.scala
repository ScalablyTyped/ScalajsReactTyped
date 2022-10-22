package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembersDeletedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // List of members deleted.
  var members: js.UndefOr[NullableOption[js.Array[TeamworkUserIdentity]]] = js.undefined
}
object MembersDeletedEventMessageDetail {
  
  inline def apply(): MembersDeletedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembersDeletedEventMessageDetail]
  }
  
  extension [Self <: MembersDeletedEventMessageDetail](x: Self) {
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setMembers(value: NullableOption[js.Array[TeamworkUserIdentity]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: TeamworkUserIdentity*): Self = StObject.set(x, "members", js.Array(value*))
  }
}
