package typingsJapgolly.nodeHtmlParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesCommentMod {
  
  @JSImport("node-html-parser/dist/nodes/comment", JSImport.Default)
  @js.native
  open class default protected () extends CommentNode {
    def this(rawText: String, parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default) = this()
    def this(
      rawText: String,
      parentNode: typingsJapgolly.nodeHtmlParser.distNodesHtmlMod.default,
      range: js.Tuple2[Double, Double]
    ) = this()
  }
  
  @js.native
  trait CommentNode
    extends typingsJapgolly.nodeHtmlParser.distNodesNodeMod.default {
    
    /**
      * Get unescaped text value of current node and its children.
      * @return {string} text content
      */
    @JSName("text")
    def text_MCommentNode: String = js.native
  }
}
