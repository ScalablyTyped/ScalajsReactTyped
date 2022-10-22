package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.solidityParserAntlr.mod.Identifier
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyBlock
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyExpression
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyLocalDefinition
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyAssignment
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyStackAssignment
  - typingsJapgolly.solidityParserAntlr.mod.LabelDefinition
  - typingsJapgolly.solidityParserAntlr.mod.AssemblySwitch
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionDefinition
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyFor
  - typingsJapgolly.solidityParserAntlr.mod.AssemblyIf
  - typingsJapgolly.solidityParserAntlr.mod.Break
  - typingsJapgolly.solidityParserAntlr.mod.Continue
  - typingsJapgolly.solidityParserAntlr.mod.SubAssembly
  - typingsJapgolly.solidityParserAntlr.mod.NumberLiteral
  - typingsJapgolly.solidityParserAntlr.mod.StringLiteral
  - typingsJapgolly.solidityParserAntlr.mod.HexNumber
  - typingsJapgolly.solidityParserAntlr.mod.HexLiteral
  - typingsJapgolly.solidityParserAntlr.mod.DecimalNumber
*/
trait AssemblyItem
  extends StObject
     with ASTNode
object AssemblyItem {
  
  inline def AssemblyAssignment(expression: AssemblyExpression, names: js.Array[Identifier]): typingsJapgolly.solidityParserAntlr.mod.AssemblyAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyAssignment")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyAssignment]
  }
  
  inline def AssemblyBlock(operations: js.Array[AssemblyItem]): typingsJapgolly.solidityParserAntlr.mod.AssemblyBlock = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyBlock")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyBlock]
  }
  
  inline def AssemblyCall(arguments: js.Array[AssemblyExpression], functionName: String): typingsJapgolly.solidityParserAntlr.mod.AssemblyCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssemblyCall")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyCall]
  }
  
  inline def AssemblyFor(): typingsJapgolly.solidityParserAntlr.mod.AssemblyFor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyFor")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyFor]
  }
  
  inline def AssemblyFunctionDefinition(): typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyFunctionDefinition")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyFunctionDefinition]
  }
  
  inline def AssemblyIf(): typingsJapgolly.solidityParserAntlr.mod.AssemblyIf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyIf")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyIf]
  }
  
  inline def AssemblyLiteral(): typingsJapgolly.solidityParserAntlr.mod.AssemblyLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyLiteral]
  }
  
  inline def AssemblyLocalDefinition(): typingsJapgolly.solidityParserAntlr.mod.AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyLocalDefinition")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyLocalDefinition]
  }
  
  inline def AssemblyStackAssignment(): typingsJapgolly.solidityParserAntlr.mod.AssemblyStackAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblyStackAssignment")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblyStackAssignment]
  }
  
  inline def AssemblySwitch(): typingsJapgolly.solidityParserAntlr.mod.AssemblySwitch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AssemblySwitch")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.AssemblySwitch]
  }
  
  inline def Break(): typingsJapgolly.solidityParserAntlr.mod.Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Break")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Break]
  }
  
  inline def Continue(): typingsJapgolly.solidityParserAntlr.mod.Continue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Continue")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Continue]
  }
  
  inline def DecimalNumber(value: String): typingsJapgolly.solidityParserAntlr.mod.DecimalNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DecimalNumber")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.DecimalNumber]
  }
  
  inline def HexLiteral(value: String): typingsJapgolly.solidityParserAntlr.mod.HexLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("HexLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.HexLiteral]
  }
  
  inline def HexNumber(value: String): typingsJapgolly.solidityParserAntlr.mod.HexNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("HexNumber")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.HexNumber]
  }
  
  inline def Identifier(name: String): typingsJapgolly.solidityParserAntlr.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.Identifier]
  }
  
  inline def LabelDefinition(): typingsJapgolly.solidityParserAntlr.mod.LabelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("LabelDefinition")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.LabelDefinition]
  }
  
  inline def NumberLiteral(number: String): typingsJapgolly.solidityParserAntlr.mod.NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], subdenomination = null)
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.NumberLiteral]
  }
  
  inline def StringLiteral(value: String): typingsJapgolly.solidityParserAntlr.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.StringLiteral]
  }
  
  inline def SubAssembly(): typingsJapgolly.solidityParserAntlr.mod.SubAssembly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SubAssembly")
    __obj.asInstanceOf[typingsJapgolly.solidityParserAntlr.mod.SubAssembly]
  }
}
