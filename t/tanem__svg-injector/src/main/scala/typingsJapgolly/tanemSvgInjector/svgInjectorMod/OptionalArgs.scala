package typingsJapgolly.tanemSvgInjector.svgInjectorMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.tanemSvgInjector.typesMod.AfterAll
import typingsJapgolly.tanemSvgInjector.typesMod.BeforeEach
import typingsJapgolly.tanemSvgInjector.typesMod.Errback
import typingsJapgolly.tanemSvgInjector.typesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalArgs extends js.Object {
  var afterAll: js.UndefOr[AfterAll] = js.undefined
  var afterEach: js.UndefOr[Errback] = js.undefined
  var beforeEach: js.UndefOr[BeforeEach] = js.undefined
  var evalScripts: js.UndefOr[EvalScripts] = js.undefined
  var renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
}

object OptionalArgs {
  @scala.inline
  def apply(
    afterAll: /* elementsLoaded */ Double => Callback = null,
    afterEach: (/* error */ js.Error | Null, /* svg */ js.UndefOr[Element]) => Callback = null,
    beforeEach: /* svg */ Element => Callback = null,
    evalScripts: EvalScripts = null,
    renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
  ): OptionalArgs = {
    val __obj = js.Dynamic.literal()
    if (afterAll != null) __obj.updateDynamic("afterAll")(js.Any.fromFunction1((t0: /* elementsLoaded */ scala.Double) => afterAll(t0).runNow()))
    if (afterEach != null) __obj.updateDynamic("afterEach")(js.Any.fromFunction2((t0: /* error */ js.Error | scala.Null, t1: /* svg */ js.UndefOr[org.scalajs.dom.raw.Element]) => afterEach(t0, t1).runNow()))
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(js.Any.fromFunction1((t0: /* svg */ org.scalajs.dom.raw.Element) => beforeEach(t0).runNow()))
    if (evalScripts != null) __obj.updateDynamic("evalScripts")(evalScripts.asInstanceOf[js.Any])
    if (!js.isUndefined(renumerateIRIElements)) __obj.updateDynamic("renumerateIRIElements")(renumerateIRIElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalArgs]
  }
}

