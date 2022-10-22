package typingsJapgolly.domHelpers

import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsInsertAfterMod {
  
  @JSImport("dom-helpers/cjs/insertAfter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Node | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Node | Null]
  inline def default(node: Node): Node | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Node | Null]
  inline def default(node: Node, refNode: Node): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], refNode.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def default(node: Null, refNode: Node): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], refNode.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
}
