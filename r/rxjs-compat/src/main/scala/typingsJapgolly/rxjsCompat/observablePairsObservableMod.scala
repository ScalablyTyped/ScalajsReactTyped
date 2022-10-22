package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalSubscriberMod.Subscriber
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerLike
import typingsJapgolly.rxjs.distTypesInternalTypesMod.TeardownLogic
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablePairsObservableMod {
  
  @JSImport("rxjs-compat/observable/PairsObservable", "PairsObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class PairsObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object PairsObservable {
    
    @JSImport("rxjs-compat/observable/PairsObservable", "PairsObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](obj: js.Object): Observable_[js.Array[String | T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(obj.asInstanceOf[js.Any]).asInstanceOf[Observable_[js.Array[String | T]]]
    inline def create[T](obj: js.Object, scheduler: SchedulerLike): Observable_[js.Array[String | T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(obj.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[String | T]]]
  }
}
