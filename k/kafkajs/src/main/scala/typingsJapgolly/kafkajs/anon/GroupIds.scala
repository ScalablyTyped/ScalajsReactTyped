package typingsJapgolly.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupIds extends StObject {
  
  var groupIds: js.Array[String]
}
object GroupIds {
  
  inline def apply(groupIds: js.Array[String]): GroupIds = {
    val __obj = js.Dynamic.literal(groupIds = groupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupIds]
  }
  
  extension [Self <: GroupIds](x: Self) {
    
    inline def setGroupIds(value: js.Array[String]): Self = StObject.set(x, "groupIds", value.asInstanceOf[js.Any])
    
    inline def setGroupIdsVarargs(value: String*): Self = StObject.set(x, "groupIds", js.Array(value*))
  }
}
