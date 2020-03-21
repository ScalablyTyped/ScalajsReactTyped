package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModel extends js.Object {
  def getTitle(): String
}

object ViewModel {
  @scala.inline
  def apply(getTitle: CallbackTo[String]): ViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.asInstanceOf[ViewModel]
  }
}

