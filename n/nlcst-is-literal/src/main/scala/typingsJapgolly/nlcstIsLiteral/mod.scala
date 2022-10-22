package typingsJapgolly.nlcstIsLiteral

import typingsJapgolly.nlcstIsLiteral.nlcstIsLiteralStrings.children
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nlcst-is-literal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLiteral(parent: Parent, index: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLiteral")(parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Content = typingsJapgolly.nlcst.mod.Content
  
  type Node = Root | Content
  
  /* Inlined std.Extract<nlcst-is-literal.nlcst-is-literal.Node, nlcst-is-literal.nlcst-is-literal.UnistParent> */
  type Parent = children
  
  type Root = typingsJapgolly.nlcst.mod.Root
  
  type UnistParent = typingsJapgolly.unist.mod.Parent[
    typingsJapgolly.unist.mod.Node[Data], 
    NodeData[typingsJapgolly.unist.mod.Node[Data]]
  ]
}
