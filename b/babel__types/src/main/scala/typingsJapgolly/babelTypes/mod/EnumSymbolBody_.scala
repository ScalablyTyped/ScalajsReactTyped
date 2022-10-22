package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.EnumSymbolBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait EnumSymbolBody_
  extends StObject
     with BaseNode
     with EnumBody
     with Flow {
  
  var hasUnknownMembers: Boolean
  
  var members: js.Array[EnumDefaultedMember_]
  
  @JSName("type")
  var type_EnumSymbolBody_ : EnumSymbolBody
}
object EnumSymbolBody_ {
  
  inline def apply(hasUnknownMembers: Boolean, members: js.Array[EnumDefaultedMember_]): EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumSymbolBody")
    __obj.asInstanceOf[EnumSymbolBody_]
  }
  
  extension [Self <: EnumSymbolBody_](x: Self) {
    
    inline def setHasUnknownMembers(value: Boolean): Self = StObject.set(x, "hasUnknownMembers", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[EnumDefaultedMember_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: EnumDefaultedMember_ *): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: EnumSymbolBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
