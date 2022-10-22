package typingsJapgolly.plugapi.mod.Event

import typingsJapgolly.plugapi.mod.FollowJoinData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FollowJoin extends StObject {
  
  var data: FollowJoinData
  
  var `type`: String
}
object FollowJoin {
  
  inline def apply(data: FollowJoinData, `type`: String): FollowJoin = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowJoin]
  }
  
  extension [Self <: FollowJoin](x: Self) {
    
    inline def setData(value: FollowJoinData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
