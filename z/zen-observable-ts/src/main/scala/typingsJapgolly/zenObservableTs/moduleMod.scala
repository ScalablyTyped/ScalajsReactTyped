package typingsJapgolly.zenObservableTs

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.zenObservable.mod.global.ZenObservable.ObservableLike
import typingsJapgolly.zenObservable.mod.global.ZenObservable.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleMod {
  
  @JSImport("zen-observable-ts/module", "Observable")
  @js.native
  open class Observable[T] protected ()
    extends typingsJapgolly.zenObservableTs.mod.Observable[T] {
    def this(subscriber: Subscriber[T]) = this()
  }
  object Observable {
    
    @JSImport("zen-observable-ts/module", "Observable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from[R](observable: ArrayLike[R]): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
    /* static member */
    inline def from[R](observable: typingsJapgolly.zenObservable.mod.Observable[R]): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
    inline def from[R](observable: ObservableLike[R]): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
    
    /* static member */
    inline def of[R](items: R*): typingsJapgolly.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.zenObservable.mod.Observable[R]]
  }
}
