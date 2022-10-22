package typingsJapgolly.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Observable")
@js.native
/**
  * Creates a new observable
  * @param onObserverAdded defines a callback to call when a new observer is added
  */
open class Observable[T] ()
  extends typingsJapgolly.babylonjs.miscIndexMod.Observable[T] {
  def this(onObserverAdded: js.Function1[/* observer */ typingsJapgolly.babylonjs.miscObservableMod.Observer[T], Unit]) = this()
}
/* static members */
object Observable {
  
  @JSImport("babylonjs/index", "Observable")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create an observable from a Promise.
    * @param promise a promise to observe for fulfillment.
    * @param onErrorObservable an observable to notify if a promise was rejected.
    * @returns the new Observable
    */
  inline def FromPromise[T, E](promise: js.Promise[T]): typingsJapgolly.babylonjs.miscObservableMod.Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("FromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.miscObservableMod.Observable[T]]
  inline def FromPromise[T, E](
    promise: js.Promise[T],
    onErrorObservable: typingsJapgolly.babylonjs.miscObservableMod.Observable[E]
  ): typingsJapgolly.babylonjs.miscObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("FromPromise")(promise.asInstanceOf[js.Any], onErrorObservable.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.miscObservableMod.Observable[T]]
}
