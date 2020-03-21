package typingsJapgolly.wordpressElement.mod

import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.ReactPortal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// ReactDOM re-exports
//
@JSImport("@wordpress/element", "createPortal")
@js.native
object createPortal extends js.Object {
  def apply(children: Node, container: Element): ReactPortal = js.native
  def apply(children: Node, container: Element, key: String): ReactPortal = js.native
}

