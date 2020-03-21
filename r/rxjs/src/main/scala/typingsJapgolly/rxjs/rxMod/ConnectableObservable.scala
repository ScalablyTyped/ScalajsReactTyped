package typingsJapgolly.rxjs.rxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "ConnectableObservable")
@js.native
class ConnectableObservable[T] protected ()
  extends typingsJapgolly.rxjs.connectableObservableMod.ConnectableObservable[T] {
  def this(
    source: typingsJapgolly.rxjs.internalObservableMod.Observable[T],
    subjectFactory: js.Function0[typingsJapgolly.rxjs.subjectMod.Subject[T]]
  ) = this()
}

