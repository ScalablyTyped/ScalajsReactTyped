package typingsJapgolly.nodeHtmlParser

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.cssSelect.libTypesMod.Adapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatcherMod extends Shortcut {
  
  @JSImport("node-html-parser/dist/matcher", JSImport.Default)
  @js.native
  val default: Adapter[
    typingsJapgolly.nodeHtmlParser.distNodesNodeMod.default, 
    typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default
  ] = js.native
  
  type Predicate = js.Function1[
    /* node */ typingsJapgolly.nodeHtmlParser.distNodesNodeMod.default, 
    /* is node-html-parser.node-html-parser/dist/nodes/html.default */ Boolean
  ]
  
  type _To = Adapter[
    typingsJapgolly.nodeHtmlParser.distNodesNodeMod.default, 
    typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default
  ]
  
  /* This means you don't have to write `default`, but can instead just say `distMatcherMod.foo` */
  override def _to: Adapter[
    typingsJapgolly.nodeHtmlParser.distNodesNodeMod.default, 
    typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default
  ] = default
}
