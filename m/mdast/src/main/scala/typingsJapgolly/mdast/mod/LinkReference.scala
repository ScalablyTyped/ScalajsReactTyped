package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.linkReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkReference
  extends StObject
     with Parent
     with Reference {
  
  @JSName("children")
  var children_LinkReference: js.Array[StaticPhrasingContent]
  
  @JSName("type")
  var type_LinkReference: linkReference
}
object LinkReference {
  
  inline def apply(children: js.Array[StaticPhrasingContent], identifier: String, referenceType: ReferenceType): LinkReference = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("linkReference")
    __obj.asInstanceOf[LinkReference]
  }
  
  extension [Self <: LinkReference](x: Self) {
    
    inline def setChildren(value: js.Array[StaticPhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: StaticPhrasingContent*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: linkReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
