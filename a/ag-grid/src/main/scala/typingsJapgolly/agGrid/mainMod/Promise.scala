package typingsJapgolly.agGrid.mainMod

import typingsJapgolly.agGrid.utilsMod.ExternalPromise
import typingsJapgolly.agGrid.utilsMod.ResolveAndRejectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "Promise")
@js.native
class Promise[T] protected ()
  extends typingsJapgolly.agGrid.utilsMod.Promise[T] {
  def this(callback: ResolveAndRejectCallback[T]) = this()
}

/* static members */
@JSImport("ag-grid/dist/lib/main", "Promise")
@js.native
object Promise extends js.Object {
  def all[T](toCombine: js.Array[typingsJapgolly.agGrid.utilsMod.Promise[T]]): typingsJapgolly.agGrid.utilsMod.Promise[js.Array[T]] = js.native
  def external[T](): ExternalPromise[T] = js.native
  def resolve[T](value: T): typingsJapgolly.agGrid.utilsMod.Promise[T] = js.native
}

