package typingsJapgolly.phonon.Phonon_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononOnCloseObject extends js.Object {
  def close(): Unit
}

object PhononOnCloseObject {
  @scala.inline
  def apply(close: Callback): PhononOnCloseObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[PhononOnCloseObject]
  }
}

