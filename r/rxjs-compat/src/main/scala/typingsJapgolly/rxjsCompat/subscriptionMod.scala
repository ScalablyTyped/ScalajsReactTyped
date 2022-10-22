package typingsJapgolly.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionMod {
  
  @JSImport("rxjs-compat/Subscription", "Subscription")
  @js.native
  /**
    * @param initialTeardown A function executed first as part of the finalization
    * process that is kicked off when {@link #unsubscribe} is called.
    */
  open class Subscription ()
    extends typingsJapgolly.rxjs.mod.Subscription {
    def this(initialTeardown: js.Function0[Unit]) = this()
  }
  /* static members */
  object Subscription {
    
    @JSImport("rxjs-compat/Subscription", "Subscription")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("rxjs-compat/Subscription", "Subscription.EMPTY")
    @js.native
    def EMPTY: typingsJapgolly.rxjs.distTypesInternalSubscriptionMod.Subscription = js.native
    inline def EMPTY_=(x: typingsJapgolly.rxjs.distTypesInternalSubscriptionMod.Subscription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  }
}
