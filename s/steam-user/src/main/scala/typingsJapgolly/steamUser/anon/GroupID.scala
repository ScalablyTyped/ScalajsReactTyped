package typingsJapgolly.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupID extends StObject {
  
  var groupID: Double
}
object GroupID {
  
  inline def apply(groupID: Double): GroupID = {
    val __obj = js.Dynamic.literal(groupID = groupID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupID]
  }
  
  extension [Self <: GroupID](x: Self) {
    
    inline def setGroupID(value: Double): Self = StObject.set(x, "groupID", value.asInstanceOf[js.Any])
  }
}
