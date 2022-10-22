package typingsJapgolly.phenomnomnominalTsquery

import typingsJapgolly.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQuerySelectorNode
import typingsJapgolly.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMatchersAttributeMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/matchers/attribute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attribute(node: Node, selector: TSQuerySelectorNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("attribute")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
