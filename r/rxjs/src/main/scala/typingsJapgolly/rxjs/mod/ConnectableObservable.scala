package typingsJapgolly.rxjs.mod

import typingsJapgolly.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "ConnectableObservable")
@js.native
class ConnectableObservable[T] protected ()
  extends typingsJapgolly.rxjs.connectableObservableMod.ConnectableObservable[T] {
  def this(source: Observable[T], subjectFactory: js.Function0[typingsJapgolly.rxjs.subjectMod.Subject[T]]) = this()
}

