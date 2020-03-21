package typingsJapgolly.minappEnv.WXNS

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestTask extends js.Object {
  def abort(): Unit
}

object IRequestTask {
  @scala.inline
  def apply(abort: Callback): IRequestTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.asInstanceOf[IRequestTask]
  }
}

