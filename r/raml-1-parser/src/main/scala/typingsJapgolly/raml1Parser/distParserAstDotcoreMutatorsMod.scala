package typingsJapgolly.raml1Parser

import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult
import typingsJapgolly.raml1Parser.distParserHighLevelImplMod.ASTNodeImpl
import typingsJapgolly.raml1Parser.distParserHighLevelImplMod.ASTPropImpl
import typingsJapgolly.raml1Parser.distParserHighLevelImplMod.StructuredValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserAstDotcoreMutatorsMod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/mutators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addStringValue(attr: ASTPropImpl, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStringValue")(attr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addStructuredValue(attr: ASTPropImpl, sv: StructuredValue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStructuredValue")(attr.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addToNode(target: ASTNodeImpl, node: IParseResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToNode")(target.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createAttr(node: ASTNodeImpl, n: String, v: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAttr")(node.asInstanceOf[js.Any], n.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def initEmptyRAMLFile(node: IHighLevelNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initEmptyRAMLFile")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeAttr(attr: ASTPropImpl): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAttr")(attr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeNodeFrom(source: ASTNodeImpl, node: IParseResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNodeFrom")(source.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setKey(node: ASTPropImpl, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setKey")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setValue(node: ASTPropImpl, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setValue(node: ASTPropImpl, value: StructuredValue): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setValues(attr: ASTPropImpl, values: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setValues")(attr.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
