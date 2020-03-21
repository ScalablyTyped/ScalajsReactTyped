package typingsJapgolly.knockoutPunches

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutPunchesStatic extends js.Object {
  def enableAll(): Unit
}

object KnockoutPunchesStatic {
  @scala.inline
  def apply(enableAll: Callback): KnockoutPunchesStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enableAll")(enableAll.toJsFn)
    __obj.asInstanceOf[KnockoutPunchesStatic]
  }
}

