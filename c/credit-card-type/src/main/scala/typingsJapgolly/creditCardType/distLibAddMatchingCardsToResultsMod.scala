package typingsJapgolly.creditCardType

import typingsJapgolly.creditCardType.distTypesMod.CreditCardType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAddMatchingCardsToResultsMod {
  
  @JSImport("credit-card-type/dist/lib/add-matching-cards-to-results", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMatchingCardsToResults(cardNumber: String, cardConfiguration: CreditCardType, results: js.Array[CreditCardType]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMatchingCardsToResults")(cardNumber.asInstanceOf[js.Any], cardConfiguration.asInstanceOf[js.Any], results.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
