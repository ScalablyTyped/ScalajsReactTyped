package typingsJapgolly.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseObjectGroupParameterType extends StObject {
  
  /**
    * Symbolic object group name.
    */
  var objectGroup: String
}
object ReleaseObjectGroupParameterType {
  
  inline def apply(objectGroup: String): ReleaseObjectGroupParameterType = {
    val __obj = js.Dynamic.literal(objectGroup = objectGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseObjectGroupParameterType]
  }
  
  extension [Self <: ReleaseObjectGroupParameterType](x: Self) {
    
    inline def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
  }
}
