package typingsJapgolly.xpath

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.XPathResult
import typingsJapgolly.std.XPathNSResolver
import typingsJapgolly.xpath.xpathBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xpath", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait XPathSelect extends js.Object {
    def apply(expression: String): js.Array[SelectedValue] = js.native
    def apply(expression: String, node: Node): js.Array[SelectedValue] = js.native
    def apply(expression: String, node: Node, single: `true`): SelectedValue = js.native
  }
  
  var select: XPathSelect = js.native
  def evaluate(
    expression: String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: Double,
    result: XPathResult
  ): XPathResult = js.native
  def select1(expression: String): SelectedValue = js.native
  def select1(expression: String, node: Node): SelectedValue = js.native
  def useNamespaces(namespaceMap: StringDictionary[String]): XPathSelect = js.native
  type SelectedValue = Node | Attr | String | Double | Boolean
}

