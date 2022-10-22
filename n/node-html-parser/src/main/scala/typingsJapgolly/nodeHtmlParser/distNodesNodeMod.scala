package typingsJapgolly.nodeHtmlParser

import typingsJapgolly.nodeHtmlParser.distNodesTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesNodeMod {
  
  /* note: abstract class */ @JSImport("node-html-parser/dist/nodes/node", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Node {
    def this(parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default) = this()
    def this(parentNode: Unit, range: js.Tuple2[Double, Double]) = this()
    def this(
      parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default,
      range: js.Tuple2[Double, Double]
    ) = this()
  }
  
  @js.native
  trait Node extends StObject {
    
    var childNodes: js.Array[Node] = js.native
    
    def innerText: String = js.native
    
    var nodeType: NodeType = js.native
    
    var parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default = js.native
    
    var range: js.Tuple2[Double, Double] = js.native
    
    var rawText: String = js.native
    
    /**
      * Remove current node
      */
    def remove(): this.type = js.native
    
    var text: String = js.native
    
    def textContent: String = js.native
    def textContent_=(`val`: String): Unit = js.native
  }
}
