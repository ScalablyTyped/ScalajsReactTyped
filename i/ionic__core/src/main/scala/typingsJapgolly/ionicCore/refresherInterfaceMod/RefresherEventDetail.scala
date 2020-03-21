package typingsJapgolly.ionicCore.refresherInterfaceMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefresherEventDetail extends js.Object {
  def complete(): Unit
}

object RefresherEventDetail {
  @scala.inline
  def apply(complete: Callback): RefresherEventDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[RefresherEventDetail]
  }
}

