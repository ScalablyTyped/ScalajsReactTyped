package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.EnumDefaultedMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait EnumDefaultedMember_
  extends StObject
     with BaseNode
     with EnumMember
     with Flow {
  
  var id: Identifier_
  
  @JSName("type")
  var type_EnumDefaultedMember_ : EnumDefaultedMember
}
object EnumDefaultedMember_ {
  
  inline def apply(id: Identifier_): EnumDefaultedMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumDefaultedMember")
    __obj.asInstanceOf[EnumDefaultedMember_]
  }
  
  extension [Self <: EnumDefaultedMember_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: EnumDefaultedMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
