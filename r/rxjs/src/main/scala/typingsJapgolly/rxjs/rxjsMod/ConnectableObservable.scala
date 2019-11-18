package typingsJapgolly.rxjs.rxjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "ConnectableObservable")
@js.native
class ConnectableObservable[T] protected ()
  extends typingsJapgolly.rxjs.internalObservableConnectableObservableMod.ConnectableObservable[T] {
  def this(
    source: typingsJapgolly.rxjs.internalObservableMod.Observable[T],
    subjectFactory: js.Function0[typingsJapgolly.rxjs.internalSubjectMod.Subject[T]]
  ) = this()
}

