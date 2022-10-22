package typingsJapgolly.meteor.Meteor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** utils **/
/** Pub/Sub **/
trait SubscriptionHandle extends StObject {
  
  /** True if the server has marked the subscription as ready. A reactive data source. */
  def ready(): Boolean
  
  /** Cancel the subscription. This will typically result in the server directing the client to remove the subscription’s data from the client’s cache. */
  def stop(): Unit
}
object SubscriptionHandle {
  
  inline def apply(ready: CallbackTo[Boolean], stop: Callback): SubscriptionHandle = {
    val __obj = js.Dynamic.literal(ready = ready.toJsFn, stop = stop.toJsFn)
    __obj.asInstanceOf[SubscriptionHandle]
  }
  
  extension [Self <: SubscriptionHandle](x: Self) {
    
    inline def setReady(value: CallbackTo[Boolean]): Self = StObject.set(x, "ready", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
