package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DeliveryAddressValueSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValueSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationConversationMod.Intent
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperDatetimeMod.DateTimeOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.HelperOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperNewsurfaceMod.NewSurfaceOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperOptionCarouselMod.CarouselOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperOptionListMod.ListOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.ApiOptionItem
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItem
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItems
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionPermissionMod.PermissionOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionUpdateMod.UpdatePermissionOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperPlaceMod.PlaceOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperRegisterupdateMod.RegisterUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Carousel")
  @js.native
  open class Carousel protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperOptionMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "CompletePurchase")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3CompletePurchaseValueSpec}
    * @public
    */
  open class CompletePurchase ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionMod.CompletePurchase {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Confirmation")
  @js.native
  open class Confirmation protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperConfirmationMod.Confirmation {
    /**
      * @param text The confirmation prompt presented to the user to
      *     query for an affirmative or negative response.
      * @public
      */
    def this(text: String) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "DateTime")
  @js.native
  open class DateTime protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperDatetimeMod.DateTime {
    /**
      * @param options DateTime options
      * @public
      */
    def this(options: DateTimeOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "DeliveryAddress")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  open class DeliveryAddress ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionMod.DeliveryAddress {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "DigitalPurchaseCheck")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  open class DigitalPurchaseCheck ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionMod.DigitalPurchaseCheck {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Helper")
  @js.native
  open class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.Helper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "List")
  @js.native
  open class List protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperOptionMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "NewSurface")
  @js.native
  open class NewSurface protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperNewsurfaceMod.NewSurface {
    /**
      * @param options NewSurface options
      * @public
      */
    def this(options: NewSurfaceOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Permission")
  @js.native
  open class Permission protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Place")
  @js.native
  open class Place protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperPlaceMod.Place {
    /**
      * @param options Place options
      * @public
      */
    def this(options: PlaceOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "RegisterUpdate")
  @js.native
  open class RegisterUpdate protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperRegisterupdateMod.RegisterUpdate {
    /**
      * @param options RegisterUpdate options
      * @public
      */
    def this(options: RegisterUpdateOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "SignIn")
  @js.native
  /**
    * @param context The optional context why the app needs to ask the user to sign in, as a
    *     prefix of a prompt for user consent, e.g. "To track your exercise", or
    *     "To check your account balance".
    * @public
    */
  open class SignIn ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperSigninMod.SignIn {
    def this(context: String) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "SoloHelper")
  @js.native
  open class SoloHelper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.SoloHelper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "TransactionDecision")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
    *     if using ordersv3
    * @public
    */
  open class TransactionDecision ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionMod.TransactionDecision {
    def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
    def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "TransactionRequirements")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
    *     if using ordersv3
    * @public
    */
  open class TransactionRequirements ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionMod.TransactionRequirements {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "UpdatePermission")
  @js.native
  open class UpdatePermission protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionMod.UpdatePermission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
  
  inline def convert(items: OptionItems[OptionItem | String]): js.Array[ApiOptionItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[ApiOptionItem]]
}
