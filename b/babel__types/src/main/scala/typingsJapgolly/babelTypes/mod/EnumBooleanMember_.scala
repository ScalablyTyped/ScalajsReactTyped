package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.EnumBooleanMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait EnumBooleanMember_
  extends StObject
     with BaseNode
     with EnumMember
     with Flow {
  
  var id: Identifier_
  
  var init: BooleanLiteral_
  
  @JSName("type")
  var type_EnumBooleanMember_ : EnumBooleanMember
}
object EnumBooleanMember_ {
  
  inline def apply(id: Identifier_, init: BooleanLiteral_): EnumBooleanMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumBooleanMember")
    __obj.asInstanceOf[EnumBooleanMember_]
  }
  
  extension [Self <: EnumBooleanMember_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: BooleanLiteral_): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setType(value: EnumBooleanMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
