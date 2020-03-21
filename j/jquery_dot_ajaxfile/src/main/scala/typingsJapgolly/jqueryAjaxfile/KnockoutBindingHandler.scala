package typingsJapgolly.jqueryAjaxfile

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutBindingHandler extends js.Object {
  var init: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      Unit | AnonControlsDescendantBindings
    ]
  ] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var preprocess: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* name */ String, 
      /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]], 
      String
    ]
  ] = js.undefined
  var update: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[js.Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      Unit
    ]
  ] = js.undefined
}

object KnockoutBindingHandler {
  @scala.inline
  def apply(
    init: (/* element */ js.Any, /* valueAccessor */ js.Function0[js.Any], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[js.Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => CallbackTo[Unit | AnonControlsDescendantBindings] = null,
    options: js.Any = null,
    preprocess: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => CallbackTo[String] = null,
    update: (/* element */ js.Any, /* valueAccessor */ js.Function0[js.Any], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[js.Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Callback = null
  ): KnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction5((t0: /* element */ js.Any, t1: /* valueAccessor */ js.Function0[js.Any], t2: /* allBindingsAccessor */ js.UndefOr[typingsJapgolly.jqueryAjaxfile.KnockoutAllBindingsAccessor], t3: /* viewModel */ js.UndefOr[js.Any], t4: /* bindingContext */ js.UndefOr[typingsJapgolly.jqueryAjaxfile.KnockoutBindingContext]) => init(t0, t1, t2, t3, t4).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* name */ java.lang.String, t2: /* addBindingCallback */ js.UndefOr[
  js.Function2[/* name */ java.lang.String, /* value */ java.lang.String, scala.Unit]]) => preprocess(t0, t1, t2).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction5((t0: /* element */ js.Any, t1: /* valueAccessor */ js.Function0[js.Any], t2: /* allBindingsAccessor */ js.UndefOr[typingsJapgolly.jqueryAjaxfile.KnockoutAllBindingsAccessor], t3: /* viewModel */ js.UndefOr[js.Any], t4: /* bindingContext */ js.UndefOr[typingsJapgolly.jqueryAjaxfile.KnockoutBindingContext]) => update(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[KnockoutBindingHandler]
  }
}

