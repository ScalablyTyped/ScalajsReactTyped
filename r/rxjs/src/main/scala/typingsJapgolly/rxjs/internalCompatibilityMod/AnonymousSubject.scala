package typingsJapgolly.rxjs.internalCompatibilityMod

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "AnonymousSubject")
@js.native
class AnonymousSubject[T] ()
  extends typingsJapgolly.rxjs.subjectMod.AnonymousSubject[T] {
  def this(destination: Observer[T]) = this()
  def this(destination: Observer[T], source: Observable[T]) = this()
}

