package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.fromEventMod.NodeEventHandler
import typingsJapgolly.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/fromEventPattern", JSImport.Namespace)
@js.native
object fromEventPatternMod extends js.Object {
  def fromEventPattern[T](addHandler: js.Function1[/* handler */ NodeEventHandler, _]): Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, js.UndefOr[js.Any], Unit]
  ): Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[js.Any], Unit],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
}

