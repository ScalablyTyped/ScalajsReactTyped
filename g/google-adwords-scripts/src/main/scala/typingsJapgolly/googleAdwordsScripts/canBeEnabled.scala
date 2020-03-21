package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extendables
trait canBeEnabled extends js.Object {
  def enable(): Unit
  def isEnabled(): Boolean
  def isPaused(): Boolean
  def pause(): Unit
}

object canBeEnabled {
  @scala.inline
  def apply(enable: Callback, isEnabled: CallbackTo[Boolean], isPaused: CallbackTo[Boolean], pause: Callback): canBeEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("isEnabled")(isEnabled.toJsFn)
    __obj.updateDynamic("isPaused")(isPaused.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.asInstanceOf[canBeEnabled]
  }
}

