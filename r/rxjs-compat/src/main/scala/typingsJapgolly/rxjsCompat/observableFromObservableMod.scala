package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalSubscriberMod.Subscriber
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerLike
import typingsJapgolly.rxjs.distTypesInternalTypesMod.TeardownLogic
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableFromObservableMod {
  
  @JSImport("rxjs-compat/observable/FromObservable", "FromObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class FromObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object FromObservable {
    
    @JSImport("rxjs-compat/observable/FromObservable", "FromObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](ish: ObservableInput[T]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(ish.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
    inline def create[T](ish: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(ish.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
    inline def create[T, R](ish: ArrayLike[T]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(ish.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
    inline def create[T, R](ish: ArrayLike[T], scheduler: SchedulerLike): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(ish.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  }
}
