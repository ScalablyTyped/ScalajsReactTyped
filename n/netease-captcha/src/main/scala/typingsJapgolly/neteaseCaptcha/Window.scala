package typingsJapgolly.neteaseCaptcha

import japgolly.scalajs.react.Callback
import typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.Config
import typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.InitFunction
import typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.onError
import typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.onLoad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var initNECaptcha: js.UndefOr[InitFunction] = js.undefined
}

object Window {
  @scala.inline
  def apply(
    initNECaptcha: (/* config */ Config, /* onLoad */ js.UndefOr[onLoad], /* onError */ js.UndefOr[onError]) => Callback = null
  ): Window = {
    val __obj = js.Dynamic.literal()
    if (initNECaptcha != null) __obj.updateDynamic("initNECaptcha")(js.Any.fromFunction3((t0: /* config */ typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.Config, t1: /* onLoad */ js.UndefOr[typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.onLoad], t2: /* onError */ js.UndefOr[typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.onError]) => initNECaptcha(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Window]
  }
}

