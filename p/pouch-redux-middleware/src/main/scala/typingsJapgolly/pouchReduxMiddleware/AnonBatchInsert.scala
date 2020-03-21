package typingsJapgolly.pouchReduxMiddleware

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pouchReduxMiddleware.mod.Document
import typingsJapgolly.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBatchInsert[T] extends js.Object {
  def batchInsert(docs: js.Array[Document[T]]): Action[_]
  def insert(doc: Document[T]): Action[_]
  def remove(doc: Document[T]): Action[_]
  def update(doc: Document[T]): Action[_]
}

object AnonBatchInsert {
  @scala.inline
  def apply[T](
    batchInsert: js.Array[Document[T]] => CallbackTo[Action[js.Any]],
    insert: Document[T] => CallbackTo[Action[js.Any]],
    remove: Document[T] => CallbackTo[Action[js.Any]],
    update: Document[T] => CallbackTo[Action[js.Any]]
  ): AnonBatchInsert[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchInsert")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.pouchReduxMiddleware.mod.Document[T]]) => batchInsert(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.pouchReduxMiddleware.mod.Document[T]) => insert(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.pouchReduxMiddleware.mod.Document[T]) => remove(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.pouchReduxMiddleware.mod.Document[T]) => update(t0).runNow()))
    __obj.asInstanceOf[AnonBatchInsert[T]]
  }
}

