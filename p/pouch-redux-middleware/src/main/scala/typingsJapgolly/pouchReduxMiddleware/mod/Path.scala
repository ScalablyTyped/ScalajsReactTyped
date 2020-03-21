package typingsJapgolly.pouchReduxMiddleware.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pouchReduxMiddleware.AnonBatchInsert
import typingsJapgolly.pouchdbCore.PouchDB.Database
import typingsJapgolly.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path[T] extends js.Object {
  var actions: AnonBatchInsert[T]
  var db: Database[T]
  var docs: js.UndefOr[js.Any] = js.undefined
  var handleResponse: js.UndefOr[
    js.Function3[
      /* err */ js.Error, 
      /* data */ js.Any, 
      /* errorCallback */ js.Function1[/* err */ js.Error, Unit], 
      Unit
    ]
  ] = js.undefined
  var initialBatchDispatched: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]] = js.undefined
  var path: String
  var propagateBatchInsert: js.UndefOr[js.Function2[/* doc */ js.Array[Document[T]], /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var propagateDelete: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var propagateInsert: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var propagateUpdate: js.UndefOr[js.Function2[/* doc */ Document[T], /* dispatch */ Dispatch[_], Unit]] = js.undefined
  var queue: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var scheduleInset: js.UndefOr[js.Function1[/* doc */ Document[T], Unit]] = js.undefined
  var scheduleRemove: js.UndefOr[js.Function1[/* doc */ Document[T], Unit]] = js.undefined
}

object Path {
  @scala.inline
  def apply[T](
    actions: AnonBatchInsert[T],
    db: Database[T],
    path: String,
    docs: js.Any = null,
    handleResponse: (/* err */ js.Error, /* data */ js.Any, /* errorCallback */ js.Function1[/* err */ js.Error, Unit]) => Callback = null,
    initialBatchDispatched: /* err */ js.UndefOr[js.Error] => Callback = null,
    propagateBatchInsert: (/* doc */ js.Array[Document[T]], /* dispatch */ Dispatch[js.Any]) => Callback = null,
    propagateDelete: (/* doc */ Document[T], /* dispatch */ Dispatch[js.Any]) => Callback = null,
    propagateInsert: (/* doc */ Document[T], /* dispatch */ Dispatch[js.Any]) => Callback = null,
    propagateUpdate: (/* doc */ Document[T], /* dispatch */ Dispatch[js.Any]) => Callback = null,
    queue: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    scheduleInset: /* doc */ Document[T] => Callback = null,
    scheduleRemove: /* doc */ Document[T] => Callback = null
  ): Path[T] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (docs != null) __obj.updateDynamic("docs")(docs.asInstanceOf[js.Any])
    if (handleResponse != null) __obj.updateDynamic("handleResponse")(js.Any.fromFunction3((t0: /* err */ js.Error, t1: /* data */ js.Any, t2: /* errorCallback */ js.Function1[/* err */ js.Error, scala.Unit]) => handleResponse(t0, t1, t2).runNow()))
    if (initialBatchDispatched != null) __obj.updateDynamic("initialBatchDispatched")(js.Any.fromFunction1((t0: /* err */ js.UndefOr[js.Error]) => initialBatchDispatched(t0).runNow()))
    if (propagateBatchInsert != null) __obj.updateDynamic("propagateBatchInsert")(js.Any.fromFunction2((t0: /* doc */ js.Array[typingsJapgolly.pouchReduxMiddleware.mod.Document[T]], t1: /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any]) => propagateBatchInsert(t0, t1).runNow()))
    if (propagateDelete != null) __obj.updateDynamic("propagateDelete")(js.Any.fromFunction2((t0: /* doc */ typingsJapgolly.pouchReduxMiddleware.mod.Document[T], t1: /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any]) => propagateDelete(t0, t1).runNow()))
    if (propagateInsert != null) __obj.updateDynamic("propagateInsert")(js.Any.fromFunction2((t0: /* doc */ typingsJapgolly.pouchReduxMiddleware.mod.Document[T], t1: /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any]) => propagateInsert(t0, t1).runNow()))
    if (propagateUpdate != null) __obj.updateDynamic("propagateUpdate")(js.Any.fromFunction2((t0: /* doc */ typingsJapgolly.pouchReduxMiddleware.mod.Document[T], t1: /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any]) => propagateUpdate(t0, t1).runNow()))
    if (queue != null) __obj.updateDynamic("queue")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => queue(t0).runNow()))
    if (scheduleInset != null) __obj.updateDynamic("scheduleInset")(js.Any.fromFunction1((t0: /* doc */ typingsJapgolly.pouchReduxMiddleware.mod.Document[T]) => scheduleInset(t0).runNow()))
    if (scheduleRemove != null) __obj.updateDynamic("scheduleRemove")(js.Any.fromFunction1((t0: /* doc */ typingsJapgolly.pouchReduxMiddleware.mod.Document[T]) => scheduleRemove(t0).runNow()))
    __obj.asInstanceOf[Path[T]]
  }
}

