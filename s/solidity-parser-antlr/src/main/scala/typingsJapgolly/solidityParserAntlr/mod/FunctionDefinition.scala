package typingsJapgolly.solidityParserAntlr.mod

import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.constant
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.default
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.external
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.internal
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.payable
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.public
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.pure
import typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionDefinition
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var body: js.UndefOr[Block] = js.undefined
  
  var isConstructor: Boolean
  
  var modifiers: js.Array[ModifierInvocation]
  
  var name: js.UndefOr[String] = js.undefined
  
  var parameters: js.Array[VariableDeclaration]
  
  var returnParameters: js.UndefOr[js.Array[VariableDeclaration]] = js.undefined
  
  var stateMutability: js.UndefOr[pure | constant | payable | view] = js.undefined
  
  @JSName("type")
  var type_FunctionDefinition: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition
  
  var visibility: default | external | internal | public | `private`
}
object FunctionDefinition {
  
  inline def apply(
    isConstructor: Boolean,
    modifiers: js.Array[ModifierInvocation],
    parameters: js.Array[VariableDeclaration],
    visibility: default | external | internal | public | `private`
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(isConstructor = isConstructor.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDefinition")
    __obj.asInstanceOf[FunctionDefinition]
  }
  
  extension [Self <: FunctionDefinition](x: Self) {
    
    inline def setBody(value: Block): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIsConstructor(value: Boolean): Self = StObject.set(x, "isConstructor", value.asInstanceOf[js.Any])
    
    inline def setModifiers(value: js.Array[ModifierInvocation]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersVarargs(value: ModifierInvocation*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: js.Array[VariableDeclaration]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: VariableDeclaration*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setReturnParameters(value: js.Array[VariableDeclaration]): Self = StObject.set(x, "returnParameters", value.asInstanceOf[js.Any])
    
    inline def setReturnParametersUndefined: Self = StObject.set(x, "returnParameters", js.undefined)
    
    inline def setReturnParametersVarargs(value: VariableDeclaration*): Self = StObject.set(x, "returnParameters", js.Array(value*))
    
    inline def setStateMutability(value: pure | constant | payable | view): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
    
    inline def setStateMutabilityUndefined: Self = StObject.set(x, "stateMutability", js.undefined)
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: default | external | internal | public | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
