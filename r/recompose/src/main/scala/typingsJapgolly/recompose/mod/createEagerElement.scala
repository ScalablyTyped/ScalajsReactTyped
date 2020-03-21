package typingsJapgolly.recompose.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "createEagerElement")
@js.native
object createEagerElement extends js.Object {
  def apply(`type`: String): Element = js.native
  def apply(`type`: String, props: js.Object): Element = js.native
  def apply(`type`: String, props: js.Object, children: Node): Element = js.native
  def apply(`type`: ComponentType[_]): Element = js.native
  def apply(`type`: ComponentType[_], props: js.Object): Element = js.native
  def apply(`type`: ComponentType[_], props: js.Object, children: Node): Element = js.native
}

