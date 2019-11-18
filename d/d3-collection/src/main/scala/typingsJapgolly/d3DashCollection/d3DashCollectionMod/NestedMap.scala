package typingsJapgolly.d3DashCollection.d3DashCollectionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.d3DashCollection.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedMap[Datum, RollupType]
  extends Map[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]

object NestedMap {
  @scala.inline
  def apply[Datum, RollupType](
    clear: Callback,
    each: js.Function3[
      (NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType, 
      /* key */ String, 
      /* map */ Map[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType], 
      Unit
    ] => Callback,
    empty: CallbackTo[Boolean],
    entries: CallbackTo[
      js.Array[Anon_Key[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]]
    ],
    get: String => CallbackTo[js.UndefOr[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]],
    has: String => CallbackTo[Boolean],
    keys: CallbackTo[js.Array[String]],
    remove: String => CallbackTo[Boolean],
    set: (String, (NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType) => CallbackTo[NestedMap[Datum, RollupType]],
    size: CallbackTo[Double],
    values: CallbackTo[js.Array[(NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType]]
  ): NestedMap[Datum, RollupType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function3[
  (typingsJapgolly.d3DashCollection.d3DashCollectionMod.NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType, 
  /* key */ java.lang.String, 
  /* map */ typingsJapgolly.d3DashCollection.d3DashCollectionMod.Map[
    (typingsJapgolly.d3DashCollection.d3DashCollectionMod.NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType
  ], 
  scala.Unit]) => each(t0).runNow()))
    __obj.updateDynamic("empty")(empty.toJsFn)
    __obj.updateDynamic("entries")(entries.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: (typingsJapgolly.d3DashCollection.d3DashCollectionMod.NestedMap[Datum, RollupType]) | js.Array[Datum] | RollupType) => set(t0, t1).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[NestedMap[Datum, RollupType]]
  }
}

