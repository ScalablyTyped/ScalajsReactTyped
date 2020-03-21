package typingsJapgolly.nodeSass.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context
  extends /* data */ StringDictionary[js.Any] {
  var callback: js.UndefOr[SassRenderCallback] = js.undefined
  var options: Options
}

object Context {
  @scala.inline
  def apply(
    options: Options,
    StringDictionary: /* data */ StringDictionary[js.Any] = null,
    callback: (/* err */ SassError, /* result */ Result) => CallbackTo[js.Any] = null
  ): Context = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* err */ typingsJapgolly.nodeSass.mod.SassError, t1: /* result */ typingsJapgolly.nodeSass.mod.Result) => callback(t0, t1).runNow()))
    __obj.asInstanceOf[Context]
  }
}

