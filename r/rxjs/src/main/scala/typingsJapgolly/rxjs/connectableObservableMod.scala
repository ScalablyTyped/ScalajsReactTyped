package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.subjectMod.Subject
import typingsJapgolly.rxjs.subscriptionMod.Subscription
import typingsJapgolly.std.PropertyDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/ConnectableObservable", JSImport.Namespace)
@js.native
object connectableObservableMod extends js.Object {
  @js.native
  class ConnectableObservable[T] protected () extends Observable[T] {
    def this(source: Observable[T], subjectFactory: js.Function0[Subject[T]]) = this()
    var _connection: Subscription = js.native
    /** @internal */
    var _isComplete: Boolean = js.native
    var _refCount: Double = js.native
    var _subject: Subject[T] = js.native
    @JSName("source")
    var source_ConnectableObservable: Observable[T] = js.native
    def connect(): Subscription = js.native
    /* protected */ def getSubject(): Subject[T] = js.native
    def refCount(): Observable[T] = js.native
    /* protected */ def subjectFactory(): Subject[T] = js.native
  }
  
  val connectableObservableDescriptor: PropertyDescriptorMap = js.native
}

