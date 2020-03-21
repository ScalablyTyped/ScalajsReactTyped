package typingsJapgolly.feathersjsFeathers.mod

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOverloads[T] extends js.Object {
  def create(data: js.Array[Partial[T]]): js.Promise[js.Array[T]] = js.native
  def create(data: js.Array[Partial[T]], params: Params): js.Promise[js.Array[T]] = js.native
  def create(data: Partial[T]): js.Promise[T] = js.native
  def create(data: Partial[T], params: Params): js.Promise[T] = js.native
  def patch(id: NullableId, data: Pick[T, String]): js.Promise[T] = js.native
  def patch(id: NullableId, data: Pick[T, String], params: Params): js.Promise[T] = js.native
}

