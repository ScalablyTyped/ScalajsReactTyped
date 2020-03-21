package typingsJapgolly.ecol.ieventdispatcherMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ecol.collectionEventMod.CollectionEvent
import typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Listener
import typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Type
import typingsJapgolly.tstl.mod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventDispatcher[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: js.Iterator[T] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */] extends js.Object {
  def addEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit
  def dispatchEvent(event: CollectionEvent[T, SourceT, IteratorT, ReverseT]): Unit
  def hasEventListener(`type`: Type): Boolean
  def removeEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit
}

object IEventDispatcher {
  @scala.inline
  def apply[T, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: js.Iterator[T] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
    addEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Callback,
    dispatchEvent: CollectionEvent[T, SourceT, IteratorT, ReverseT] => Callback,
    hasEventListener: Type => CallbackTo[Boolean],
    removeEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Callback
  ): IEventDispatcher[T, SourceT, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Type, t1: typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Listener[T, SourceT, IteratorT, ReverseT]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("dispatchEvent")(js.Any.fromFunction1((t0: typingsJapgolly.ecol.collectionEventMod.CollectionEvent[T, SourceT, IteratorT, ReverseT]) => dispatchEvent(t0).runNow()))
    __obj.updateDynamic("hasEventListener")(js.Any.fromFunction1((t0: typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Type) => hasEventListener(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Type, t1: typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Listener[T, SourceT, IteratorT, ReverseT]) => removeEventListener(t0, t1).runNow()))
    __obj.asInstanceOf[IEventDispatcher[T, SourceT, IteratorT, ReverseT]]
  }
}

