package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.EnumBooleanBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait EnumBooleanBody_
  extends StObject
     with BaseNode
     with EnumBody
     with Flow {
  
  var explicitType: Boolean
  
  var hasUnknownMembers: Boolean
  
  var members: js.Array[EnumBooleanMember_]
  
  @JSName("type")
  var type_EnumBooleanBody_ : EnumBooleanBody
}
object EnumBooleanBody_ {
  
  inline def apply(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumBooleanMember_]): EnumBooleanBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumBooleanBody")
    __obj.asInstanceOf[EnumBooleanBody_]
  }
  
  extension [Self <: EnumBooleanBody_](x: Self) {
    
    inline def setExplicitType(value: Boolean): Self = StObject.set(x, "explicitType", value.asInstanceOf[js.Any])
    
    inline def setHasUnknownMembers(value: Boolean): Self = StObject.set(x, "hasUnknownMembers", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[EnumBooleanMember_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: EnumBooleanMember_ *): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: EnumBooleanBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
