package typingsJapgolly.slateHtmlSerializer.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.slate.mod.BlockProperties
import typingsJapgolly.slate.mod.Leaf
import typingsJapgolly.slate.mod.Mark
import typingsJapgolly.slate.mod.Node
import typingsJapgolly.slate.mod.Value
import typingsJapgolly.slate.mod.ValueJSON
import typingsJapgolly.slateHtmlSerializer.Anon0
import typingsJapgolly.slateHtmlSerializer.Anon1
import typingsJapgolly.slateHtmlSerializer.AnonRender
import typingsJapgolly.slateHtmlSerializer.AnonToJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html extends js.Object {
  var defaultBlock: BlockProperties = js.native
  var rules: js.Array[Rule] = js.native
  def deserialize(html: String): Value = js.native
  def deserialize(html: String, options: Anon0): Value = js.native
  def deserialize(html: String, options: AnonToJSON): ValueJSON = js.native
  /* protected */ def deserializeElement(element: HTMLElement): js.Any = js.native
  /* protected */ def deserializeElements(elements: js.Array[HTMLElement]): js.Array[Node] = js.native
  /* protected */ def deserializeMark(mark: Mark): js.Array[Node] = js.native
  /* protected */ def parseHtml(html: String): HTMLElement = js.native
  def serialize(value: Value): String = js.native
  def serialize(value: Value, options: Anon1): js.Array[Element] = js.native
  def serialize(value: Value, options: AnonRender): String = js.native
  /* protected */ def serializeLeaf(leaf: Leaf): String = js.native
  /* protected */ def serializeNode(node: Node): String = js.native
  /* protected */ def serializeString(string: String): String = js.native
}

