package typingsJapgolly.prosemirrorState.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateField[T, S /* <: Schema[_, _] */] extends js.Object {
  /**
    * Deserialize the JSON representation of this field. Note that the
    * `state` argument is again a half-initialized state.
    */
  var fromJSON: js.UndefOr[
    (js.Function3[
      /* config */ StringDictionary[js.Any], 
      /* value */ js.Any, 
      /* state */ EditorState[S], 
      T
    ]) | Null
  ] = js.undefined
  /**
    * Convert this field to JSON. Optional, can be left off to disable
    * JSON serialization for the field.
    */
  var toJSON: js.UndefOr[(js.Function1[/* value */ T, _]) | Null] = js.undefined
  /**
    * Apply the given transaction to this state field, producing a new
    * field value. Note that the `newState` argument is again a partially
    * constructed state does not yet contain the state from plugins
    * coming after this one.
    */
  @JSName("apply")
  def apply(tr: Transaction[S], value: T, oldState: EditorState[S], newState: EditorState[S]): T
  /**
    * Initialize the value of the field. `config` will be the object
    * passed to [`EditorState.create`](#state.EditorState^create). Note
    * that `instance` is a half-initialized state instance, and will
    * not have values for plugin fields initialized after this one.
    */
  def init(config: StringDictionary[js.Any], instance: EditorState[S]): T
}

object StateField {
  @scala.inline
  def apply[T, S /* <: Schema[_, _] */](
    apply: (Transaction[S], T, EditorState[S], EditorState[S]) => CallbackTo[T],
    init: (StringDictionary[js.Any], EditorState[S]) => CallbackTo[T],
    fromJSON: (/* config */ StringDictionary[js.Any], /* value */ js.Any, /* state */ EditorState[S]) => CallbackTo[T] = null,
    toJSON: /* value */ T => CallbackTo[js.Any] = null
  ): StateField[T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(js.Any.fromFunction4((t0: typingsJapgolly.prosemirrorState.mod.Transaction[S], t1: T, t2: typingsJapgolly.prosemirrorState.mod.EditorState[S], t3: typingsJapgolly.prosemirrorState.mod.EditorState[S]) => apply(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("init")(js.Any.fromFunction2((t0: org.scalablytyped.runtime.StringDictionary[js.Any], t1: typingsJapgolly.prosemirrorState.mod.EditorState[S]) => init(t0, t1).runNow()))
    if (fromJSON != null) __obj.updateDynamic("fromJSON")(js.Any.fromFunction3((t0: /* config */ org.scalablytyped.runtime.StringDictionary[js.Any], t1: /* value */ js.Any, t2: /* state */ typingsJapgolly.prosemirrorState.mod.EditorState[S]) => fromJSON(t0, t1, t2).runNow()))
    if (toJSON != null) __obj.updateDynamic("toJSON")(js.Any.fromFunction1((t0: /* value */ T) => toJSON(t0).runNow()))
    __obj.asInstanceOf[StateField[T, S]]
  }
}

