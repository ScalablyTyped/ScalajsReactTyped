package typingsJapgolly.wordpressElement.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsJapgolly.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/element", "findDOMNode")
@js.native
object findDOMNode extends js.Object {
  def apply(): Element | Null | Text = js.native
  def apply(instance: ReactInstance): Element | Null | Text = js.native
}

