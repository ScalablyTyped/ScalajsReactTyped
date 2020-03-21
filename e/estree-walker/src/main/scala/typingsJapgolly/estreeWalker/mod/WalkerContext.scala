package typingsJapgolly.estreeWalker.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkerContext extends js.Object {
  def skip(): Unit
}

object WalkerContext {
  @scala.inline
  def apply(skip: Callback): WalkerContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("skip")(skip.toJsFn)
    __obj.asInstanceOf[WalkerContext]
  }
}

