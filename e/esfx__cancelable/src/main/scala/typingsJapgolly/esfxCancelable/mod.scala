package typingsJapgolly.esfxCancelable

import typingsJapgolly.esfxCancelable.distMod.CancelSubscription
import typingsJapgolly.esfxCancelable.distMod.CancelableCancelSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/cancelable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CancelError ()
    extends typingsJapgolly.esfxCancelable.distMod.CancelError {
    def this(message: String) = this()
  }
  
  @js.native
  object CancelSubscription extends js.Object {
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    def create(unsubscribe: js.Function0[Unit]): typingsJapgolly.esfxCancelable.distMod.CancelSubscription = js.native
  }
  
  @js.native
  object Cancelable extends js.Object {
    /**
      * A well-known symbol used to define a method to retrieve the `CancelSignal` for an object.
      */
    val cancelSignal: js.Symbol = js.native
    /**
      * A `Cancelable` that is already signaled.
      */
    val canceled: CancelableCancelSignal = js.native
    val name: typingsJapgolly.esfxCancelable.esfxCancelableStrings.Cancelable = js.native
    /**
      * A `Cancelable` that can never be signaled.
      */
    val none: CancelableCancelSignal = js.native
    /**
      * Determines whether a value is a `Cancelable` object.
      */
    def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = js.native
    /**
      * Determines whether a value is a `Cancelable` object.
      * @deprecated Use `Cancelable.hasInstance` instead.
      */
    def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = js.native
    def isSignaled(): Boolean = js.native
    /**
      * Determines whether `cancelable` is in the signaled state.
      */
    def isSignaled(cancelable: typingsJapgolly.esfxCancelable.distMod.Cancelable): Boolean = js.native
    def subscribe(cancelable: js.UndefOr[scala.Nothing], onSignaled: js.Function0[Unit]): CancelSubscription = js.native
    /**
      * Subscribes to be notified when a `cancelable` becomes signaled.
      */
    def subscribe(cancelable: typingsJapgolly.esfxCancelable.distMod.Cancelable, onSignaled: js.Function0[Unit]): CancelSubscription = js.native
    def throwIfSignaled(): Unit = js.native
    /**
      * Throws a `CancelError` exception if the provided `cancelable` is in the signaled state.
      */
    def throwIfSignaled(cancelable: typingsJapgolly.esfxCancelable.distMod.Cancelable): Unit = js.native
  }
  
  @js.native
  object CancelableSource extends js.Object {
    val cancel: js.Symbol = js.native
    /**
      * A well-known symbol used to define a method to retrieve the `CancelSignal` for an object.
      */
    val cancelSignal: js.Symbol = js.native
    val name: typingsJapgolly.esfxCancelable.esfxCancelableStrings.CancelableSource = js.native
    /**
      * Determines whether a value is a `CancelableSource` object.
      */
    def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean = js.native
    /**
      * Determines whether a value is a `Cancelable` object.
      * @deprecated Use `Cancelable.hasInstance` instead.
      */
    def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = js.native
    /**
      * Determines whether a value is a `CancelableSource` object.
      * @deprecated Use `CancelableSource.hasInstance` instead.
      */
    def isCancelableSource(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean = js.native
  }
  
}

