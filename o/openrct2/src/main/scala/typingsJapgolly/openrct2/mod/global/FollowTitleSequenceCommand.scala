package typingsJapgolly.openrct2.mod.global

import typingsJapgolly.openrct2.openrct2Strings.follow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FollowTitleSequenceCommand
  extends StObject
     with TitleSequenceCommand {
  
  var id: Double | Null
  
  var `type`: follow
}
object FollowTitleSequenceCommand {
  
  inline def apply(): FollowTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(id = null)
    __obj.updateDynamic("type")("follow")
    __obj.asInstanceOf[FollowTitleSequenceCommand]
  }
  
  extension [Self <: FollowTitleSequenceCommand](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setType(value: follow): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
