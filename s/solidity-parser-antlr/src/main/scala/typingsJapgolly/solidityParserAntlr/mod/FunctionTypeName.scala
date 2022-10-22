package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionTypeName
  extends StObject
     with BaseASTNode
     with ASTNode
     with TypeName {
  
  var parameterTypes: js.Array[TypeName]
  
  var returnTypes: js.Array[TypeName]
  
  var stateMutability: String
  
  @JSName("type")
  var type_FunctionTypeName: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName
  
  var visibility: String
}
object FunctionTypeName {
  
  inline def apply(
    parameterTypes: js.Array[TypeName],
    returnTypes: js.Array[TypeName],
    stateMutability: String,
    visibility: String
  ): FunctionTypeName = {
    val __obj = js.Dynamic.literal(parameterTypes = parameterTypes.asInstanceOf[js.Any], returnTypes = returnTypes.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeName")
    __obj.asInstanceOf[FunctionTypeName]
  }
  
  extension [Self <: FunctionTypeName](x: Self) {
    
    inline def setParameterTypes(value: js.Array[TypeName]): Self = StObject.set(x, "parameterTypes", value.asInstanceOf[js.Any])
    
    inline def setParameterTypesVarargs(value: TypeName*): Self = StObject.set(x, "parameterTypes", js.Array(value*))
    
    inline def setReturnTypes(value: js.Array[TypeName]): Self = StObject.set(x, "returnTypes", value.asInstanceOf[js.Any])
    
    inline def setReturnTypesVarargs(value: TypeName*): Self = StObject.set(x, "returnTypes", js.Array(value*))
    
    inline def setStateMutability(value: String): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
