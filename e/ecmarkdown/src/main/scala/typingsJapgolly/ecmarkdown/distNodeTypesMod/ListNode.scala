package typingsJapgolly.ecmarkdown.distNodeTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListNode
  - typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListNode
*/
trait ListNode extends StObject
object ListNode {
  
  inline def OrderedListNode(contents: js.Array[OrderedListItemNode], indent: Double, location: LocationRange, start: Double): typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ol", start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.OrderedListNode]
  }
  
  inline def UnorderedListNode(contents: js.Array[UnorderedListItemNode], indent: Double, location: LocationRange): typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ul")
    __obj.asInstanceOf[typingsJapgolly.ecmarkdown.distNodeTypesMod.UnorderedListNode]
  }
}
