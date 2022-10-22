package typingsJapgolly.jqueryAjaxfile

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutSubscribable[T]
  extends StObject
     with KnockoutSubscribableFunctions[T] {
  
  def extend(requestedExtenders: StringDictionary[Any]): KnockoutSubscribable[T] = js.native
  
  def getSubscriptionsCount(): Double = js.native
  
  def subscribe(callback: js.Function1[/* newValue */ T, Unit]): KnockoutSubscription = js.native
  def subscribe(callback: js.Function1[/* newValue */ T, Unit], target: Any): KnockoutSubscription = js.native
  def subscribe(callback: js.Function1[/* newValue */ T, Unit], target: Any, event: String): KnockoutSubscription = js.native
  def subscribe(callback: js.Function1[/* newValue */ T, Unit], target: Unit, event: String): KnockoutSubscription = js.native
  @JSName("subscribe")
  def subscribe_TEvent[TEvent](callback: js.Function1[/* newValue */ TEvent, Unit], target: Any, event: String): KnockoutSubscription = js.native
}
