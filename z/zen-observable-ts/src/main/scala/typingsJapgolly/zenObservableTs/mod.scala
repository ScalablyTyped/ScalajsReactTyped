package typingsJapgolly.zenObservableTs

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.zenObservable.mod.^
import typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zen-observable-ts", "Observable")
  @js.native
  open class Observable[T] protected () extends ^[T] {
    def this(subscriber: typingsJapgolly.zenObservable.mod.global.ZenObservable.Subscriber[T]) = this()
  }
  object Observable {
    
    @JSImport("zen-observable-ts", "Observable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from[R](observable: ArrayLike[R]): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
    /* static member */
    inline def from[R](observable: typingsJapgolly.zenObservable.mod.Observable[R]): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
    inline def from[R](observable: ObservableLike[R]): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
    
    /* static member */
    inline def of[R](items: R*): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
  }
  
  type Observer[T] = typingsJapgolly.zenObservable.mod.global.ZenObservable.Observer[T]
  
  type Subscriber[T] = typingsJapgolly.zenObservable.mod.global.ZenObservable.Subscriber[T]
  
  type Subscription = typingsJapgolly.zenObservable.mod.global.ZenObservable.Subscription
}
