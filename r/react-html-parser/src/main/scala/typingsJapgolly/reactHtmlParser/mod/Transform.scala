package typingsJapgolly.reactHtmlParser.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.domhandler.mod.DomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends js.Object {
  def apply(node: DomElement, index: Double): Element | Unit | Null = js.native
  def apply(node: DomElement, index: Double, transform: Transform): Element | Unit | Null = js.native
}

