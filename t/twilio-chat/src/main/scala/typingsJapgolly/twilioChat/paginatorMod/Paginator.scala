package typingsJapgolly.twilioChat.paginatorMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paginator[T] extends js.Object {
  var hasNextPage: Boolean
  var hasPrevPage: Boolean
  var items: js.Array[T]
  /**
    * Request next page.
    * Does not modify existing object.
    * @return {Promise<Paginator<T>>}
    */
  def nextPage(): js.Promise[Paginator[T]]
  /**
    * Request previous page.
    * Does not modify existing object.
    * @return {Promise<Paginator<T>>}
    */
  def prevPage(): js.Promise[Paginator[T]]
}

object Paginator {
  @scala.inline
  def apply[T](
    hasNextPage: Boolean,
    hasPrevPage: Boolean,
    items: js.Array[T],
    nextPage: CallbackTo[js.Promise[Paginator[T]]],
    prevPage: CallbackTo[js.Promise[Paginator[T]]]
  ): Paginator[T] = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPrevPage = hasPrevPage.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("nextPage")(nextPage.toJsFn)
    __obj.updateDynamic("prevPage")(prevPage.toJsFn)
    __obj.asInstanceOf[Paginator[T]]
  }
}

