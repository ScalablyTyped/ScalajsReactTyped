package typingsJapgolly.mongoosePaginate.mod

import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "model")
@js.native
object model extends js.Object {
  def apply[T /* <: Document_ */](name: String): PaginateModel[T] = js.native
  def apply[T /* <: Document_ */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any
  ): PaginateModel[T] = js.native
  def apply[T /* <: Document_ */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: String
  ): PaginateModel[T] = js.native
  def apply[T /* <: Document_ */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: String,
    skipInit: Boolean
  ): PaginateModel[T] = js.native
}

