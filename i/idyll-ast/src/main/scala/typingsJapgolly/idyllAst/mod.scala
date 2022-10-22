package typingsJapgolly.idyllAst

import typingsJapgolly.idyllCompiler.mod.AST
import typingsJapgolly.idyllCompiler.mod.Node
import typingsJapgolly.idyllCompiler.mod.PropType
import typingsJapgolly.idyllCompiler.mod.PropValue
import typingsJapgolly.idyllCompiler.mod.Property
import typingsJapgolly.idyllCompiler.mod.TreeNode
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("idyll-ast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendNode(ast: AST, node: Node): AST = (^.asInstanceOf[js.Dynamic].applyDynamic("appendNode")(ast.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[AST]
  
  inline def appendNodes(ast: AST, nodes: AST): AST = (^.asInstanceOf[js.Dynamic].applyDynamic("appendNodes")(ast.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[AST]
  
  inline def createNode_1(
    name: String,
    props: Record[
      String, 
      PropValue | (/* import warning: importer.ImportType#apply Failed type conversion: idyll-compiler.idyll-compiler.PropValue[1] */ js.Any)
    ],
    children: js.Array[Node]
  ): TreeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[TreeNode]
  
  inline def filterChildren(node: Node, filter: js.Function1[/* child */ Node, Boolean]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("filterChildren")(node.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def filterNodes(ast: AST, filter: js.Function1[/* node */ Node, Boolean]): AST = (^.asInstanceOf[js.Dynamic].applyDynamic("filterNodes")(ast.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[AST]
  
  inline def findNodes(ast: AST, filter: js.Function1[/* n */ Node, Boolean]): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodes")(ast.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  inline def getChildren(node: Node): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  
  inline def getNodesByName(ast: AST, name: String): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodesByName")(ast.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  inline def getProperties(node: Node): js.Array[Property] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperties")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Property]]
  
  inline def getPropertiesByType(node: Node, `type`: PropType): js.Array[Property] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesByType")(node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Property]]
  
  inline def getProperty(node: Node, key: String): PropValue | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[PropValue | Null]
  
  inline def modifyChildren(node: Node, modifier: js.Function1[/* n */ Node, Unit]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyChildren")(node.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def modifyNodesByName(ast: AST, name: String, modifier: js.Function1[/* node */ Node, Unit]): AST = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyNodesByName")(ast.asInstanceOf[js.Any], name.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[AST]
  
  inline def prependNode(ast: AST, node: Node): AST = (^.asInstanceOf[js.Dynamic].applyDynamic("prependNode")(ast.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[AST]
  
  inline def prependNodes(ast: AST, nodes: js.Array[Node]): AST = (^.asInstanceOf[js.Dynamic].applyDynamic("prependNodes")(ast.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[AST]
  
  inline def removeNodesByName(ast: AST, name: String): AST = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNodesByName")(ast.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AST]
  
  inline def removeProperty(node: Node, key: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("removeProperty")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def setProperties_1(
    node: Node,
    properties: Record[
      String, 
      PropValue | (/* import warning: importer.ImportType#apply Failed type conversion: idyll-compiler.idyll-compiler.PropValue[1] */ js.Any)
    ]
  ): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setProperties")(node.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def setProperty(node: Node, key: String, value: PropValue): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setProperty")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def setProperty_1(
    node: Node,
    key: String,
    value: /* import warning: importer.ImportType#apply Failed type conversion: idyll-compiler.idyll-compiler.PropValue[1] */ js.Any
  ): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("setProperty")(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def walkNodes(ast: Null, func: js.Function1[/* n */ Node, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkNodes")(ast.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walkNodes(ast: AST, func: js.Function1[/* n */ Node, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkNodes")(ast.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
