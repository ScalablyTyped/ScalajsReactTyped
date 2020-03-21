package typingsJapgolly.knockoutRx

import typingsJapgolly.knockout.KnockoutObservable
import typingsJapgolly.knockout.KnockoutSubscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx")
@js.native
object Rx extends js.Object {
  @js.native
  trait Observable[T] extends js.Object {
    def toKoObservable(): KnockoutObservable[T] = js.native
    def toKoObservable(initialValue: T): KnockoutObservable[T] = js.native
    def toKoSubscribable(): KnockoutSubscribable[T] = js.native
  }
  
  @js.native
  trait Subject[T] extends js.Object {
    def toKoObservable(): KnockoutObservable[T] = js.native
    def toKoObservable(initialValue: T): KnockoutObservable[T] = js.native
  }
  
}

