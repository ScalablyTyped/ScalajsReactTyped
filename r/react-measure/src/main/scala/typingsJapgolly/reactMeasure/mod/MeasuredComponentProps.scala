package typingsJapgolly.reactMeasure.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeasuredComponentProps extends js.Object {
  var contentRect: ContentRect = js.native
  def measure(): Unit = js.native
  def measureRef(): Unit = js.native
  def measureRef(ref: Element): Unit = js.native
}

