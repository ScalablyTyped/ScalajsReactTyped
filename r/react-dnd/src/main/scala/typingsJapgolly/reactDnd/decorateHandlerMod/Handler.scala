package typingsJapgolly.reactDnd.decorateHandlerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.RefHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handler[Props] extends js.Object {
  var ref: RefHandle[_]
  def receiveProps(props: Props): Unit
}

object Handler {
  @scala.inline
  def apply[Props](receiveProps: Props => Callback, ref: RefHandle[_]): Handler[Props] = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("receiveProps")(js.Any.fromFunction1((t0: Props) => receiveProps(t0).runNow()))
    __obj.asInstanceOf[Handler[Props]]
  }
}

