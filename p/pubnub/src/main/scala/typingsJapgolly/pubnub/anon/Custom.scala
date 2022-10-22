package typingsJapgolly.pubnub.anon

import typingsJapgolly.pubnub.mod.ObjectCustom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Custom[MembershipCustom /* <: ObjectCustom */] extends StObject {
  
  var channel: Id
  
  var custom: MembershipCustom | Null
  
  var eTag: String
  
  var updated: String
  
  var uuid: Id
}
object Custom {
  
  inline def apply[MembershipCustom /* <: ObjectCustom */](channel: Id, eTag: String, updated: String, uuid: Id): Custom[MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], custom = null)
    __obj.asInstanceOf[Custom[MembershipCustom]]
  }
  
  extension [Self <: Custom[?], MembershipCustom /* <: ObjectCustom */](x: Self & Custom[MembershipCustom]) {
    
    inline def setChannel(value: Id): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: MembershipCustom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomNull: Self = StObject.set(x, "custom", null)
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: Id): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
