package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.DocumentFragment
import typingsJapgolly.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewEngineHooks_ extends js.Object {
  /**
    * Invoked after a template is compiled.
    * @param viewFactory The view factory that was produced from the compilation process.
    */
  var afterCompile: js.UndefOr[js.Function1[/* viewFactory */ ViewFactory, Unit]] = js.undefined
  /**
    * Invoked after a view is created.
    * @param view The view that was created by the factory.
    */
  var afterCreate: js.UndefOr[js.Function1[/* view */ View_, Unit]] = js.undefined
  /**
    * Invoked after the bindingContext and overrideContext are configured on the view but before the view is bound.
    * @param view The view that was created by the factory.
    */
  var beforeBind: js.UndefOr[js.Function1[/* view */ View_, Unit]] = js.undefined
  /**
    * Invoked before a template is compiled.
    * @param content The DocumentFragment to compile.
    * @param resources The resources to compile the view against.
    * @param instruction The compilation instruction associated with the compilation process.
    */
  var beforeCompile: js.UndefOr[
    js.Function3[
      /* content */ DocumentFragment, 
      /* resources */ ViewResources_, 
      /* instruction */ ViewCompileInstruction, 
      Unit
    ]
  ] = js.undefined
  /**
    * Invoked before a view is created.
    * @param viewFactory The view factory that will be used to create the view.
    * @param container The DI container used during view creation.
    * @param content The cloned document fragment representing the view.
    * @param instruction The view creation instruction associated with this creation process.
    */
  var beforeCreate: js.UndefOr[
    js.Function4[
      /* viewFactory */ ViewFactory, 
      /* container */ Container, 
      /* content */ DocumentFragment, 
      /* instruction */ ViewCreateInstruction, 
      Unit
    ]
  ] = js.undefined
  /**
    * Invoked before the view is unbind. The bindingContext and overrideContext are still available on the view.
    * @param view The view that was created by the factory.
    */
  var beforeUnbind: js.UndefOr[js.Function1[/* view */ View_, Unit]] = js.undefined
}

object ViewEngineHooks_ {
  @scala.inline
  def apply(
    afterCompile: /* viewFactory */ ViewFactory => Callback = null,
    afterCreate: /* view */ View_ => Callback = null,
    beforeBind: /* view */ View_ => Callback = null,
    beforeCompile: (/* content */ DocumentFragment, /* resources */ ViewResources_, /* instruction */ ViewCompileInstruction) => Callback = null,
    beforeCreate: (/* viewFactory */ ViewFactory, /* container */ Container, /* content */ DocumentFragment, /* instruction */ ViewCreateInstruction) => Callback = null,
    beforeUnbind: /* view */ View_ => Callback = null
  ): ViewEngineHooks_ = {
    val __obj = js.Dynamic.literal()
    if (afterCompile != null) __obj.updateDynamic("afterCompile")(js.Any.fromFunction1((t0: /* viewFactory */ typingsJapgolly.aureliaTemplating.mod.ViewFactory) => afterCompile(t0).runNow()))
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(js.Any.fromFunction1((t0: /* view */ typingsJapgolly.aureliaTemplating.mod.View_) => afterCreate(t0).runNow()))
    if (beforeBind != null) __obj.updateDynamic("beforeBind")(js.Any.fromFunction1((t0: /* view */ typingsJapgolly.aureliaTemplating.mod.View_) => beforeBind(t0).runNow()))
    if (beforeCompile != null) __obj.updateDynamic("beforeCompile")(js.Any.fromFunction3((t0: /* content */ org.scalajs.dom.raw.DocumentFragment, t1: /* resources */ typingsJapgolly.aureliaTemplating.mod.ViewResources_, t2: /* instruction */ typingsJapgolly.aureliaTemplating.mod.ViewCompileInstruction) => beforeCompile(t0, t1, t2).runNow()))
    if (beforeCreate != null) __obj.updateDynamic("beforeCreate")(js.Any.fromFunction4((t0: /* viewFactory */ typingsJapgolly.aureliaTemplating.mod.ViewFactory, t1: /* container */ typingsJapgolly.aureliaDependencyInjection.mod.Container, t2: /* content */ org.scalajs.dom.raw.DocumentFragment, t3: /* instruction */ typingsJapgolly.aureliaTemplating.mod.ViewCreateInstruction) => beforeCreate(t0, t1, t2, t3).runNow()))
    if (beforeUnbind != null) __obj.updateDynamic("beforeUnbind")(js.Any.fromFunction1((t0: /* view */ typingsJapgolly.aureliaTemplating.mod.View_) => beforeUnbind(t0).runNow()))
    __obj.asInstanceOf[ViewEngineHooks_]
  }
}

