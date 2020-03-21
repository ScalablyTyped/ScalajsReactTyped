package typingsJapgolly.knockstrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.knockout.KnockoutAllBindingsAccessor
import typingsJapgolly.knockout.KnockoutBindingContext
import typingsJapgolly.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalKnockoutBindingHandler
  extends KnockoutBindingHandler[js.Any, js.Any, js.Any] {
  var defaults: KnockstrapModalDefaults
  @JSName("init")
  var init_ModalKnockoutBindingHandler: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* allBindingsAccessor */ KnockoutAllBindingsAccessor, 
      /* viewModel */ js.Any, 
      /* bindingContext */ KnockoutBindingContext, 
      KnockoutControlsDescendantBindings
    ]
  ] = js.undefined
}

object ModalKnockoutBindingHandler {
  @scala.inline
  def apply(
    defaults: KnockstrapModalDefaults,
    after: js.Array[String] = null,
    init: (/* element */ js.Any, /* valueAccessor */ js.Function0[js.Any], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, /* viewModel */ js.Any, /* bindingContext */ KnockoutBindingContext) => CallbackTo[KnockoutControlsDescendantBindings] = null,
    options: js.Any = null,
    preprocess: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => CallbackTo[String] = null,
    update: (js.Any, /* valueAccessor */ js.Function0[js.Any], /* allBindingsAccessor */ KnockoutAllBindingsAccessor, js.Any, /* bindingContext */ KnockoutBindingContext) => Callback = null
  ): ModalKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction5((t0: /* element */ js.Any, t1: /* valueAccessor */ js.Function0[js.Any], t2: /* allBindingsAccessor */ typingsJapgolly.knockout.KnockoutAllBindingsAccessor, t3: /* viewModel */ js.Any, t4: /* bindingContext */ typingsJapgolly.knockout.KnockoutBindingContext) => init(t0, t1, t2, t3, t4).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* name */ java.lang.String, t2: /* addBindingCallback */ js.UndefOr[
  js.Function2[/* name */ java.lang.String, /* value */ java.lang.String, scala.Unit]]) => preprocess(t0, t1, t2).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction5((t0: js.Any, t1: /* valueAccessor */ js.Function0[js.Any], t2: /* allBindingsAccessor */ typingsJapgolly.knockout.KnockoutAllBindingsAccessor, t3: js.Any, t4: /* bindingContext */ typingsJapgolly.knockout.KnockoutBindingContext) => update(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[ModalKnockoutBindingHandler]
  }
}

