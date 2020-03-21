package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSourceDeferral extends js.Object {
  def complete(): Unit
}

object IPlayToSourceDeferral {
  @scala.inline
  def apply(complete: Callback): IPlayToSourceDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[IPlayToSourceDeferral]
  }
}

