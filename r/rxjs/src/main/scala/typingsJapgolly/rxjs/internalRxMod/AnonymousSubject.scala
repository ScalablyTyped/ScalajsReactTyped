package typingsJapgolly.rxjs.internalRxMod

import typingsJapgolly.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "AnonymousSubject")
@js.native
class AnonymousSubject[T] ()
  extends typingsJapgolly.rxjs.internalSubjectMod.AnonymousSubject[T] {
  def this(destination: Observer[T]) = this()
  def this(destination: Observer[T], source: typingsJapgolly.rxjs.internalObservableMod.Observable[T]) = this()
}

