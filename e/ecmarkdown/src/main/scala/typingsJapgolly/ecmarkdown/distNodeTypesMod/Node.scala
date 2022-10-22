package typingsJapgolly.ecmarkdown.distNodeTypesMod

import typingsJapgolly.ecmarkdown.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.OpaqueTagNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.TagNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.CommentNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.AlgorithmNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.TextNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.StarNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.UnderscoreNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.TickNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.TildeNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.PipeNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListItemNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListItemNode
*/
trait Node extends StObject
object Node {
  
  inline def AlgorithmNode(contents: OrderedListNode, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.AlgorithmNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "algorithm")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.AlgorithmNode]
  }
  
  inline def CommentNode(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.CommentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "comment")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.CommentNode]
  }
  
  inline def OpaqueTagNode(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.OpaqueTagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "opaqueTag")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.OpaqueTagNode]
  }
  
  inline def OrderedListItemNode(attrs: js.Array[Key], contents: js.Array[FragmentNode], location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListItemNode = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ordered-list-item", sublist = null)
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListItemNode]
  }
  
  inline def OrderedListNode(contents: js.Array[OrderedListItemNode], indent: Double, location: LocationRange, start: Double): typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ol", start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListNode]
  }
  
  inline def PipeNode(contents: Null, location: LocationRange, nonTerminal: String, optional: Boolean, params: String): typingsJapgolly.ecmarkdown.distNodeTypesMod.PipeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "pipe", nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.PipeNode]
  }
  
  inline def StarNode(contents: js.Array[FragmentNode], location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.StarNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "star")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.StarNode]
  }
  
  inline def TagNode(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.TagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tag")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.TagNode]
  }
  
  inline def TextNode(contents: String, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.TextNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "text")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.TextNode]
  }
  
  inline def TickNode(contents: js.Array[FragmentNode], location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.TickNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tick")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.TickNode]
  }
  
  inline def TildeNode(contents: js.Array[FragmentNode], location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.TildeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tilde")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.TildeNode]
  }
  
  inline def UnderscoreNode(contents: js.Array[FragmentNode], location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.UnderscoreNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "underscore")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.UnderscoreNode]
  }
  
  inline def UnorderedListItemNode(attrs: js.Array[Key], contents: js.Array[FragmentNode], location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListItemNode = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "unordered-list-item", sublist = null)
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListItemNode]
  }
  
  inline def UnorderedListNode(contents: js.Array[UnorderedListItemNode], indent: Double, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ul")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListNode]
  }
}
