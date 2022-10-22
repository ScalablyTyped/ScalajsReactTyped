package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.OpaqueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait OpaqueType_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var id: Identifier_
  
  var impltype: FlowType
  
  var supertype: FlowType | Null
  
  var typeParameters: TypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_OpaqueType_ : OpaqueType
}
object OpaqueType_ {
  
  inline def apply(id: Identifier_, impltype: FlowType): OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, supertype = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[OpaqueType_]
  }
  
  extension [Self <: OpaqueType_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImpltype(value: FlowType): Self = StObject.set(x, "impltype", value.asInstanceOf[js.Any])
    
    inline def setSupertype(value: FlowType): Self = StObject.set(x, "supertype", value.asInstanceOf[js.Any])
    
    inline def setSupertypeNull: Self = StObject.set(x, "supertype", null)
    
    inline def setType(value: OpaqueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
