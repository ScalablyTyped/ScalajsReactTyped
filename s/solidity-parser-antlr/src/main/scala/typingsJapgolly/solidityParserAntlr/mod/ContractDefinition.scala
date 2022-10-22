package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractDefinition
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var baseContracts: js.Array[InheritanceSpecifier]
  
  var kind: String
  
  var name: String
  
  var subNodes: js.Array[ASTNode]
  
  @JSName("type")
  var type_ContractDefinition: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition
}
object ContractDefinition {
  
  inline def apply(
    baseContracts: js.Array[InheritanceSpecifier],
    kind: String,
    name: String,
    subNodes: js.Array[ASTNode]
  ): ContractDefinition = {
    val __obj = js.Dynamic.literal(baseContracts = baseContracts.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subNodes = subNodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ContractDefinition")
    __obj.asInstanceOf[ContractDefinition]
  }
  
  extension [Self <: ContractDefinition](x: Self) {
    
    inline def setBaseContracts(value: js.Array[InheritanceSpecifier]): Self = StObject.set(x, "baseContracts", value.asInstanceOf[js.Any])
    
    inline def setBaseContractsVarargs(value: InheritanceSpecifier*): Self = StObject.set(x, "baseContracts", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubNodes(value: js.Array[ASTNode]): Self = StObject.set(x, "subNodes", value.asInstanceOf[js.Any])
    
    inline def setSubNodesVarargs(value: ASTNode*): Self = StObject.set(x, "subNodes", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.ContractDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
