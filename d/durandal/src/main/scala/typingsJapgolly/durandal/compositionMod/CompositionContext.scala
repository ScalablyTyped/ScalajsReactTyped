package typingsJapgolly.durandal.compositionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.durandal.DurandalPromise
import typingsJapgolly.knockout.KnockoutBindingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositionContext extends js.Object {
  var activate: js.UndefOr[Boolean] = js.undefined
  var activeView: HTMLElement
  var area: js.UndefOr[String] = js.undefined
  var attached: js.UndefOr[
    js.Function3[
      /* child */ HTMLElement, 
      /* parent */ HTMLElement, 
      /* context */ CompositionContext, 
      Unit
    ]
  ] = js.undefined
  var binding: js.UndefOr[
    js.Function3[
      /* child */ HTMLElement, 
      /* parent */ HTMLElement, 
      /* context */ CompositionContext, 
      Unit
    ]
  ] = js.undefined
  var bindingContext: js.UndefOr[KnockoutBindingContext] = js.undefined
  var cacheViews: js.UndefOr[Boolean] = js.undefined
  var child: HTMLElement
  var composingNewView: Boolean
  var compositionComplete: js.UndefOr[
    js.Function3[
      /* child */ HTMLElement, 
      /* parent */ HTMLElement, 
      /* context */ CompositionContext, 
      Unit
    ]
  ] = js.undefined
  var mode: String
  var model: js.UndefOr[js.Any] = js.undefined
  var parent: HTMLElement
  var preserveContext: js.UndefOr[Boolean] = js.undefined
  var strategy: js.UndefOr[js.Function1[/* context */ CompositionContext, DurandalPromise[HTMLElement]]] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[js.Any] = js.undefined
  var viewElements: js.UndefOr[js.Array[HTMLElement]] = js.undefined
  def triggerAttach(): Unit
}

object CompositionContext {
  @scala.inline
  def apply(
    activeView: HTMLElement,
    child: HTMLElement,
    composingNewView: Boolean,
    mode: String,
    parent: HTMLElement,
    triggerAttach: Callback,
    activate: js.UndefOr[Boolean] = js.undefined,
    area: String = null,
    attached: (/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ CompositionContext) => Callback = null,
    binding: (/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ CompositionContext) => Callback = null,
    bindingContext: KnockoutBindingContext = null,
    cacheViews: js.UndefOr[Boolean] = js.undefined,
    compositionComplete: (/* child */ HTMLElement, /* parent */ HTMLElement, /* context */ CompositionContext) => Callback = null,
    model: js.Any = null,
    preserveContext: js.UndefOr[Boolean] = js.undefined,
    strategy: /* context */ CompositionContext => CallbackTo[DurandalPromise[HTMLElement]] = null,
    transition: String = null,
    view: js.Any = null,
    viewElements: js.Array[HTMLElement] = null
  ): CompositionContext = {
    val __obj = js.Dynamic.literal(activeView = activeView.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], composingNewView = composingNewView.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("triggerAttach")(triggerAttach.toJsFn)
    if (!js.isUndefined(activate)) __obj.updateDynamic("activate")(activate.asInstanceOf[js.Any])
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(js.Any.fromFunction3((t0: /* child */ org.scalajs.dom.raw.HTMLElement, t1: /* parent */ org.scalajs.dom.raw.HTMLElement, t2: /* context */ typingsJapgolly.durandal.compositionMod.CompositionContext) => attached(t0, t1, t2).runNow()))
    if (binding != null) __obj.updateDynamic("binding")(js.Any.fromFunction3((t0: /* child */ org.scalajs.dom.raw.HTMLElement, t1: /* parent */ org.scalajs.dom.raw.HTMLElement, t2: /* context */ typingsJapgolly.durandal.compositionMod.CompositionContext) => binding(t0, t1, t2).runNow()))
    if (bindingContext != null) __obj.updateDynamic("bindingContext")(bindingContext.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheViews)) __obj.updateDynamic("cacheViews")(cacheViews.asInstanceOf[js.Any])
    if (compositionComplete != null) __obj.updateDynamic("compositionComplete")(js.Any.fromFunction3((t0: /* child */ org.scalajs.dom.raw.HTMLElement, t1: /* parent */ org.scalajs.dom.raw.HTMLElement, t2: /* context */ typingsJapgolly.durandal.compositionMod.CompositionContext) => compositionComplete(t0, t1, t2).runNow()))
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveContext)) __obj.updateDynamic("preserveContext")(preserveContext.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.durandal.compositionMod.CompositionContext) => strategy(t0).runNow()))
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewElements != null) __obj.updateDynamic("viewElements")(viewElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionContext]
  }
}

