package typingsJapgolly.dndCore.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetIdPayload extends StObject {
  
  var targetId: Identifier
}
object TargetIdPayload {
  
  inline def apply(targetId: Identifier): TargetIdPayload = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetIdPayload]
  }
  
  extension [Self <: TargetIdPayload](x: Self) {
    
    inline def setTargetId(value: Identifier): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
