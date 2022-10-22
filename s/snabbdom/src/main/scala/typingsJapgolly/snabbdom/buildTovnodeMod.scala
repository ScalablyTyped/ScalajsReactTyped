package typingsJapgolly.snabbdom

import org.scalajs.dom.Node
import typingsJapgolly.snabbdom.buildHtmldomapiMod.DOMAPI
import typingsJapgolly.snabbdom.buildVnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTovnodeMod {
  
  @JSImport("snabbdom/build/tovnode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toVNode(node: Node): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("toVNode")(node.asInstanceOf[js.Any]).asInstanceOf[VNode_]
  inline def toVNode(node: Node, domApi: DOMAPI): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("toVNode")(node.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any])).asInstanceOf[VNode_]
}
