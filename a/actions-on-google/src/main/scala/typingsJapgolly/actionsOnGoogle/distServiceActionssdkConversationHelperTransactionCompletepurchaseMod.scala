package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCOMPLETE_PURCHASE
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3CompletePurchaseValue
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.SoloHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperTransactionCompletepurchaseMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/completepurchase", "CompletePurchase")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3CompletePurchaseValueSpec}
    * @public
    */
  open class CompletePurchase () extends SoloHelper[
          actionsDotintentDotCOMPLETE_PURCHASE, 
          GoogleActionsTransactionsV3CompletePurchaseValueSpec
        ] {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  type CompletePurchaseArgument = GoogleActionsTransactionsV3CompletePurchaseValue
}
