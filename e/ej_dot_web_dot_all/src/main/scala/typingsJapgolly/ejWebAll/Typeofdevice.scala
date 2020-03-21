package typingsJapgolly.ejWebAll

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdevice extends js.Object {
  def isAndroid(): Boolean
  def isFlat(): Boolean
  def isIOS(): Boolean
  def isIOS7(): Boolean
  def isWindows(): Boolean
}

object Typeofdevice {
  @scala.inline
  def apply(
    isAndroid: CallbackTo[Boolean],
    isFlat: CallbackTo[Boolean],
    isIOS: CallbackTo[Boolean],
    isIOS7: CallbackTo[Boolean],
    isWindows: CallbackTo[Boolean]
  ): Typeofdevice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isAndroid")(isAndroid.toJsFn)
    __obj.updateDynamic("isFlat")(isFlat.toJsFn)
    __obj.updateDynamic("isIOS")(isIOS.toJsFn)
    __obj.updateDynamic("isIOS7")(isIOS7.toJsFn)
    __obj.updateDynamic("isWindows")(isWindows.toJsFn)
    __obj.asInstanceOf[Typeofdevice]
  }
}

