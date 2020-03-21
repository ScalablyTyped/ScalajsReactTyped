package typingsJapgolly.reactIntl.messageMod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattedMessage[V /* <: Record[String, _] */]
  extends Component[Props[V], js.Object, js.Any] {
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MFormattedMessage(nextProps: Props[V]): Boolean = js.native
}

