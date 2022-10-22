package typingsJapgolly.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalSubscriptionMod {
  
  @JSImport("rxjs/internal/Subscription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/Subscription", "EMPTY_SUBSCRIPTION")
  @js.native
  val EMPTY_SUBSCRIPTION: typingsJapgolly.rxjs.distTypesInternalSubscriptionMod.Subscription = js.native
  
  @JSImport("rxjs/internal/Subscription", "Subscription")
  @js.native
  /**
    * @param initialTeardown A function executed first as part of the finalization
    * process that is kicked off when {@link #unsubscribe} is called.
    */
  open class Subscription ()
    extends typingsJapgolly.rxjs.distTypesInternalSubscriptionMod.Subscription {
    def this(initialTeardown: js.Function0[Unit]) = this()
  }
  /* static members */
  object Subscription {
    
    @JSImport("rxjs/internal/Subscription", "Subscription")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("rxjs/internal/Subscription", "Subscription.EMPTY")
    @js.native
    def EMPTY: typingsJapgolly.rxjs.distTypesInternalSubscriptionMod.Subscription = js.native
    inline def EMPTY_=(x: typingsJapgolly.rxjs.distTypesInternalSubscriptionMod.Subscription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  }
  
  inline def isSubscription(value: Any): /* is rxjs.rxjs/dist/types/internal/Subscription.Subscription */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubscription")(value.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs/dist/types/internal/Subscription.Subscription */ Boolean]
}
