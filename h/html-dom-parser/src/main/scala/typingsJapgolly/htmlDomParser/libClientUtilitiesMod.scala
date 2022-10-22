package typingsJapgolly.htmlDomParser

import org.scalajs.dom.NamedNodeMap
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.domhandler.mod.Comment
import typingsJapgolly.domhandler.mod.Element
import typingsJapgolly.domhandler.mod.ProcessingInstruction
import typingsJapgolly.domhandler.mod.Text
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientUtilitiesMod {
  
  @JSImport("html-dom-parser/lib/client/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatAttributes(attributes: NamedNodeMap): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def formatDOM(nodes: NodeList[Node]): js.Array[Comment | Element | ProcessingInstruction | Text] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDOM")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
  inline def formatDOM(nodes: NodeList[Node], parent: Null, directive: String): js.Array[Comment | Element | ProcessingInstruction | Text] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDOM")(nodes.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], directive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
  inline def formatDOM(nodes: NodeList[Node], parent: Unit, directive: String): js.Array[Comment | Element | ProcessingInstruction | Text] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDOM")(nodes.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], directive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
  inline def formatDOM(nodes: NodeList[Node], parent: Element): js.Array[Comment | Element | ProcessingInstruction | Text] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDOM")(nodes.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
  inline def formatDOM(nodes: NodeList[Node], parent: Element, directive: String): js.Array[Comment | Element | ProcessingInstruction | Text] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDOM")(nodes.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], directive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
}
