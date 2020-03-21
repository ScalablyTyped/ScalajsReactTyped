package typingsJapgolly.nock

import japgolly.scalajs.react.Callback
import typingsJapgolly.nock.mod.BackContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: BackContext
  def nockDone(): Unit
}

object AnonContext {
  @scala.inline
  def apply(context: BackContext, nockDone: Callback): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.updateDynamic("nockDone")(nockDone.toJsFn)
    __obj.asInstanceOf[AnonContext]
  }
}

