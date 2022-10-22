package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalSchedulerMod.Scheduler
import typingsJapgolly.rxjs.distTypesInternalTestingSubscriptionLogMod.SubscriptionLog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalTestingSubscriptionLoggableMod {
  
  @JSImport("rxjs/dist/types/internal/testing/SubscriptionLoggable", "SubscriptionLoggable")
  @js.native
  open class SubscriptionLoggable () extends StObject {
    
    def logSubscribedFrame(): Double = js.native
    
    def logUnsubscribedFrame(index: Double): Unit = js.native
    
    var scheduler: Scheduler = js.native
    
    var subscriptions: js.Array[SubscriptionLog] = js.native
  }
}
