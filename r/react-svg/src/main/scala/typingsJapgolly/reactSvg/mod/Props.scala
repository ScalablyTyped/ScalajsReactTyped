package typingsJapgolly.reactSvg.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactSvg.reactSvgStrings.div
import typingsJapgolly.reactSvg.reactSvgStrings.span
import typingsJapgolly.tanemSvgInjector.typesMod.BeforeEach
import typingsJapgolly.tanemSvgInjector.typesMod.Errback
import typingsJapgolly.tanemSvgInjector.typesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var afterInjection: js.UndefOr[Errback] = js.undefined
  var beforeInjection: js.UndefOr[BeforeEach] = js.undefined
  var evalScripts: js.UndefOr[EvalScripts] = js.undefined
  var fallback: js.UndefOr[ReactType[_]] = js.undefined
  var loading: js.UndefOr[ReactType[_]] = js.undefined
  var renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
  var src: String
  var wrapper: js.UndefOr[div | span] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    src: String,
    afterInjection: (/* error */ js.Error | Null, /* svg */ js.UndefOr[Element]) => Callback = null,
    beforeInjection: /* svg */ Element => Callback = null,
    evalScripts: EvalScripts = null,
    fallback: ReactType[_] = null,
    loading: ReactType[_] = null,
    renumerateIRIElements: js.UndefOr[Boolean] = js.undefined,
    wrapper: div | span = null
  ): Props = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (afterInjection != null) __obj.updateDynamic("afterInjection")(js.Any.fromFunction2((t0: /* error */ js.Error | scala.Null, t1: /* svg */ js.UndefOr[org.scalajs.dom.raw.Element]) => afterInjection(t0, t1).runNow()))
    if (beforeInjection != null) __obj.updateDynamic("beforeInjection")(js.Any.fromFunction1((t0: /* svg */ org.scalajs.dom.raw.Element) => beforeInjection(t0).runNow()))
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(renumerateIRIElements)) __obj.updateDynamic("renumerateIRIElements")(renumerateIRIElements.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

