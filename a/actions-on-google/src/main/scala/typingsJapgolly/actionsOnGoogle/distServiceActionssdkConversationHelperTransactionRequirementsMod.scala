package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.SoloHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperTransactionRequirementsMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/requirements", "TransactionRequirements")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
    *     if using ordersv3
    * @public
    */
  open class TransactionRequirements () extends SoloHelper[
          actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK, 
          GoogleActionsV2TransactionRequirementsCheckSpec | GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
        ] {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionRequirementsCheckResult
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckResult
  */
  trait TransactionRequirementsArgument extends StObject
  object TransactionRequirementsArgument {
    
    inline def GoogleActionsTransactionsV3TransactionRequirementsCheckResult(): typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckResult]
    }
    
    inline def GoogleActionsV2TransactionRequirementsCheckResult(): typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionRequirementsCheckResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionRequirementsCheckResult]
    }
  }
}
