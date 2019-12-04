package typingsJapgolly.atAngularCore.srcR3UnderscoreSymbolsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an Angular [view](guide/glossary#view),
  * specifically the [host view](guide/glossary#view-tree) that is defined by a component.
  * Also serves as the base class
  * that adds destroy methods for [embedded views](guide/glossary#view-tree).
  *
  * @see `EmbeddedViewRef`
  *
  * @publicApi
  */
trait ViewRef extends ChangeDetectorRef {
  /**
    * Reports whether this view has been destroyed.
    * @returns True after the `destroy()` method has been called, false otherwise.
    */
  val destroyed: Boolean
  /**
    * Destroys this view and all of the data structures associated with it.
    */
  def destroy(): Unit
  /**
    * A lifecycle hook that provides additional developer-defined cleanup
    * functionality for views.
    * @param callback A handler function that cleans up developer-defined data
    * associated with a view. Called when the `destroy()` method is invoked.
    */
  def onDestroy(callback: js.Function): js.Any
}

object ViewRef {
  @scala.inline
  def apply(
    checkNoChanges: Callback,
    destroy: Callback,
    destroyed: Boolean,
    detach: Callback,
    detectChanges: Callback,
    markForCheck: Callback,
    onDestroy: js.Function => CallbackTo[js.Any],
    reattach: Callback
  ): ViewRef = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("checkNoChanges")(checkNoChanges.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("detach")(detach.toJsFn)
    __obj.updateDynamic("detectChanges")(detectChanges.toJsFn)
    __obj.updateDynamic("markForCheck")(markForCheck.toJsFn)
    __obj.updateDynamic("onDestroy")(js.Any.fromFunction1((t0: js.Function) => onDestroy(t0).runNow()))
    __obj.updateDynamic("reattach")(reattach.toJsFn)
    __obj.asInstanceOf[ViewRef]
  }
}

