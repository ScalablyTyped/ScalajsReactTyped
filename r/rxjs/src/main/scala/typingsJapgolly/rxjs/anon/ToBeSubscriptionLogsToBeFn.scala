package typingsJapgolly.rxjs.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.rxjs.distTypesInternalTestingTestSchedulerMod.subscriptionLogsToBeFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToBeSubscriptionLogsToBeFn extends StObject {
  
  def toBe(marbles: String): Unit
  def toBe(marbles: js.Array[String]): Unit
  @JSName("toBe")
  var toBe_Original: subscriptionLogsToBeFn
}
object ToBeSubscriptionLogsToBeFn {
  
  inline def apply(toBe: /* marbles */ String | js.Array[String] => Callback): ToBeSubscriptionLogsToBeFn = {
    val __obj = js.Dynamic.literal(toBe = js.Any.fromFunction1((t0: /* marbles */ String | js.Array[String]) => toBe(t0).runNow()))
    __obj.asInstanceOf[ToBeSubscriptionLogsToBeFn]
  }
  
  extension [Self <: ToBeSubscriptionLogsToBeFn](x: Self) {
    
    inline def setToBe(value: /* marbles */ String | js.Array[String] => Callback): Self = StObject.set(x, "toBe", js.Any.fromFunction1((t0: /* marbles */ String | js.Array[String]) => value(t0).runNow()))
  }
}
