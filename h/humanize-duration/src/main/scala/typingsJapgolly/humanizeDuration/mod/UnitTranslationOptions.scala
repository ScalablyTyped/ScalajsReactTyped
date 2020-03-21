package typingsJapgolly.humanizeDuration.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitTranslationOptions extends js.Object {
  var d: js.UndefOr[js.Function0[String]] = js.undefined
  var h: js.UndefOr[js.Function0[String]] = js.undefined
  var m: js.UndefOr[js.Function0[String]] = js.undefined
  var mo: js.UndefOr[js.Function0[String]] = js.undefined
  var ms: js.UndefOr[js.Function0[String]] = js.undefined
  var s: js.UndefOr[js.Function0[String]] = js.undefined
  var w: js.UndefOr[js.Function0[String]] = js.undefined
  var y: js.UndefOr[js.Function0[String]] = js.undefined
}

object UnitTranslationOptions {
  @scala.inline
  def apply(
    d: js.UndefOr[CallbackTo[String]] = js.undefined,
    h: js.UndefOr[CallbackTo[String]] = js.undefined,
    m: js.UndefOr[CallbackTo[String]] = js.undefined,
    mo: js.UndefOr[CallbackTo[String]] = js.undefined,
    ms: js.UndefOr[CallbackTo[String]] = js.undefined,
    s: js.UndefOr[CallbackTo[String]] = js.undefined,
    w: js.UndefOr[CallbackTo[String]] = js.undefined,
    y: js.UndefOr[CallbackTo[String]] = js.undefined
  ): UnitTranslationOptions = {
    val __obj = js.Dynamic.literal()
    d.foreach(p => __obj.updateDynamic("d")(p.toJsFn))
    h.foreach(p => __obj.updateDynamic("h")(p.toJsFn))
    m.foreach(p => __obj.updateDynamic("m")(p.toJsFn))
    mo.foreach(p => __obj.updateDynamic("mo")(p.toJsFn))
    ms.foreach(p => __obj.updateDynamic("ms")(p.toJsFn))
    s.foreach(p => __obj.updateDynamic("s")(p.toJsFn))
    w.foreach(p => __obj.updateDynamic("w")(p.toJsFn))
    y.foreach(p => __obj.updateDynamic("y")(p.toJsFn))
    __obj.asInstanceOf[UnitTranslationOptions]
  }
}

