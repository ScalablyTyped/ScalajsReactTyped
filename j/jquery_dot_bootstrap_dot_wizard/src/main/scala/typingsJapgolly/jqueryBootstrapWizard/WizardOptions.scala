package typingsJapgolly.jqueryBootstrapWizard

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WizardOptions extends js.Object {
  var firstSelector: js.UndefOr[String] = js.undefined
  var lastSelector: js.UndefOr[String] = js.undefined
  var nextSelector: js.UndefOr[String] = js.undefined
  var onFirst: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* firstIndex */ Double, Boolean]
  ] = js.undefined
  var onInit: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double, Unit]
  ] = js.undefined
  var onLast: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* lastIndex */ Double, Boolean]
  ] = js.undefined
  var onNext: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double, Boolean]
  ] = js.undefined
  var onPrevious: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* previousIndex */ Double, Boolean]
  ] = js.undefined
  var onShow: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double, Unit]
  ] = js.undefined
  var onTabClick: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double, Boolean]
  ] = js.undefined
  var onTabShow: js.UndefOr[
    js.Function3[/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double, Boolean]
  ] = js.undefined
  var previousSelector: js.UndefOr[String] = js.undefined
  var tabClass: js.UndefOr[String] = js.undefined
}

object WizardOptions {
  @scala.inline
  def apply(
    firstSelector: String = null,
    lastSelector: String = null,
    nextSelector: String = null,
    onFirst: (/* activeTab */ js.Any, /* navigation */ js.Any, /* firstIndex */ Double) => CallbackTo[Boolean] = null,
    onInit: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double) => Callback = null,
    onLast: (/* activeTab */ js.Any, /* navigation */ js.Any, /* lastIndex */ Double) => CallbackTo[Boolean] = null,
    onNext: (/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double) => CallbackTo[Boolean] = null,
    onPrevious: (/* activeTab */ js.Any, /* navigation */ js.Any, /* previousIndex */ Double) => CallbackTo[Boolean] = null,
    onShow: (/* activeTab */ js.Any, /* navigation */ js.Any, /* nextIndex */ Double) => Callback = null,
    onTabClick: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double) => CallbackTo[Boolean] = null,
    onTabShow: (/* activeTab */ js.Any, /* navigation */ js.Any, /* currentIndex */ Double) => CallbackTo[Boolean] = null,
    previousSelector: String = null,
    tabClass: String = null
  ): WizardOptions = {
    val __obj = js.Dynamic.literal()
    if (firstSelector != null) __obj.updateDynamic("firstSelector")(firstSelector.asInstanceOf[js.Any])
    if (lastSelector != null) __obj.updateDynamic("lastSelector")(lastSelector.asInstanceOf[js.Any])
    if (nextSelector != null) __obj.updateDynamic("nextSelector")(nextSelector.asInstanceOf[js.Any])
    if (onFirst != null) __obj.updateDynamic("onFirst")(js.Any.fromFunction3((t0: /* activeTab */ js.Any, t1: /* navigation */ js.Any, t2: /* firstIndex */ scala.Double) => onFirst(t0, t1, t2).runNow()))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction3((t0: /* activeTab */ js.Any, t1: /* navigation */ js.Any, t2: /* currentIndex */ scala.Double) => onInit(t0, t1, t2).runNow()))
    if (onLast != null) __obj.updateDynamic("onLast")(js.Any.fromFunction3((t0: /* activeTab */ js.Any, t1: /* navigation */ js.Any, t2: /* lastIndex */ scala.Double) => onLast(t0, t1, t2).runNow()))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction3((t0: /* activeTab */ js.Any, t1: /* navigation */ js.Any, t2: /* nextIndex */ scala.Double) => onNext(t0, t1, t2).runNow()))
    if (onPrevious != null) __obj.updateDynamic("onPrevious")(js.Any.fromFunction3((t0: /* activeTab */ js.Any, t1: /* navigation */ js.Any, t2: /* previousIndex */ scala.Double) => onPrevious(t0, t1, t2).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction3((t0: /* activeTab */ js.Any, t1: /* navigation */ js.Any, t2: /* nextIndex */ scala.Double) => onShow(t0, t1, t2).runNow()))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction3((t0: /* activeTab */ js.Any, t1: /* navigation */ js.Any, t2: /* currentIndex */ scala.Double) => onTabClick(t0, t1, t2).runNow()))
    if (onTabShow != null) __obj.updateDynamic("onTabShow")(js.Any.fromFunction3((t0: /* activeTab */ js.Any, t1: /* navigation */ js.Any, t2: /* currentIndex */ scala.Double) => onTabShow(t0, t1, t2).runNow()))
    if (previousSelector != null) __obj.updateDynamic("previousSelector")(previousSelector.asInstanceOf[js.Any])
    if (tabClass != null) __obj.updateDynamic("tabClass")(tabClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizardOptions]
  }
}

