package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_DECISION
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValueSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.SoloHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperTransactionDecisionMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/decision", "TransactionDecision")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
    *     if using ordersv3
    * @public
    */
  open class TransactionDecision () extends SoloHelper[
          actionsDotintentDotTRANSACTION_DECISION, 
          GoogleActionsV2TransactionDecisionValueSpec | GoogleActionsTransactionsV3TransactionDecisionValueSpec
        ] {
    def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
    def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValue
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValue
  */
  trait TransactionDecisionArgument extends StObject
  object TransactionDecisionArgument {
    
    inline def GoogleActionsTransactionsV3TransactionDecisionValue(): typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValue]
    }
    
    inline def GoogleActionsV2TransactionDecisionValue(): typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValue]
    }
  }
}
