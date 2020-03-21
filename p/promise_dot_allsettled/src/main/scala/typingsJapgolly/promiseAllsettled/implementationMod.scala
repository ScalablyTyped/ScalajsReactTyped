package typingsJapgolly.promiseAllsettled

import typingsJapgolly.promiseAllsettled.typesMod.PromiseResult
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise.allsettled/implementation", JSImport.Namespace)
@js.native
object implementationMod extends js.Object {
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: Array[js.Any] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
  def apply[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, _]]] = js.native
  type PromiseResultTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    */ typingsJapgolly.promiseAllsettled.promiseAllsettledStrings.PromiseResultTuple with T
  type PromiseTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Promise<T[P]> | T[P]}
    */ typingsJapgolly.promiseAllsettled.promiseAllsettledStrings.PromiseTuple with js.Any
}

