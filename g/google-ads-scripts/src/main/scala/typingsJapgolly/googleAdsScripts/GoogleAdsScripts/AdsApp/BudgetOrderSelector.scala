package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches budget orders.
  *
  * Typical usage:
  *
  *      var budgetOrderIterator = AdsApp.budgetOrders()
  *        .withCondition("Status = ACTIVE")
  *        .get();
  */
trait BudgetOrderSelector
  extends StObject
     with Selector[BudgetOrderIterator]
     with SelectorWithCondition
object BudgetOrderSelector {
  
  inline def apply(get: CallbackTo[BudgetOrderIterator], withCondition: String => BudgetOrderSelector): BudgetOrderSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, withCondition = js.Any.fromFunction1(withCondition))
    __obj.asInstanceOf[BudgetOrderSelector]
  }
}
