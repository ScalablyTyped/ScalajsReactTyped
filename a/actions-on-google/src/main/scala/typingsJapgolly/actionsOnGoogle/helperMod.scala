package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.carouselMod.CarouselOptions
import typingsJapgolly.actionsOnGoogle.conversationConversationMod.Intent
import typingsJapgolly.actionsOnGoogle.datetimeMod.DateTimeOptions
import typingsJapgolly.actionsOnGoogle.deeplinkMod.DeepLinkOptions
import typingsJapgolly.actionsOnGoogle.helperHelperMod.HelperOptions
import typingsJapgolly.actionsOnGoogle.listMod.ListOptions
import typingsJapgolly.actionsOnGoogle.newsurfaceMod.NewSurfaceOptions
import typingsJapgolly.actionsOnGoogle.optionOptionMod.ApiOptionItem
import typingsJapgolly.actionsOnGoogle.optionOptionMod.OptionItem
import typingsJapgolly.actionsOnGoogle.optionOptionMod.OptionItems
import typingsJapgolly.actionsOnGoogle.permissionPermissionMod.PermissionOptions
import typingsJapgolly.actionsOnGoogle.placeMod.PlaceOptions
import typingsJapgolly.actionsOnGoogle.registerupdateMod.RegisterUpdateOptions
import typingsJapgolly.actionsOnGoogle.updateMod.UpdatePermissionOptions
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2DeliveryAddressValueSpec
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValueSpec
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", JSImport.Namespace)
@js.native
object helperMod extends js.Object {
  @js.native
  class Carousel protected ()
    extends typingsJapgolly.actionsOnGoogle.optionMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3CompletePurchaseValueSpec}
    * @public
    */
  class CompletePurchase ()
    extends typingsJapgolly.actionsOnGoogle.transactionMod.CompletePurchase {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  @js.native
  class Confirmation protected ()
    extends typingsJapgolly.actionsOnGoogle.confirmationMod.Confirmation {
    /**
      * @param text The confirmation prompt presented to the user to
      *     query for an affirmative or negative response.
      * @public
      */
    def this(text: String) = this()
  }
  
  @js.native
  class DateTime protected ()
    extends typingsJapgolly.actionsOnGoogle.datetimeMod.DateTime {
    /**
      * @param options DateTime options
      * @public
      */
    def this(options: DateTimeOptions) = this()
  }
  
  @js.native
  class DeepLink protected ()
    extends typingsJapgolly.actionsOnGoogle.deeplinkMod.DeepLink {
    /**
      * @param options DeepLink options
      * @deprecated
      * @public
      */
    def this(options: DeepLinkOptions) = this()
  }
  
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  class DeliveryAddress ()
    extends typingsJapgolly.actionsOnGoogle.transactionMod.DeliveryAddress {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  class DigitalPurchaseCheck ()
    extends typingsJapgolly.actionsOnGoogle.transactionMod.DigitalPurchaseCheck {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  @js.native
  class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typingsJapgolly.actionsOnGoogle.helperHelperMod.Helper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @js.native
  class List protected ()
    extends typingsJapgolly.actionsOnGoogle.optionMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  @js.native
  class NewSurface protected ()
    extends typingsJapgolly.actionsOnGoogle.newsurfaceMod.NewSurface {
    /**
      * @param options NewSurface options
      * @public
      */
    def this(options: NewSurfaceOptions) = this()
  }
  
  @js.native
  class Permission protected ()
    extends typingsJapgolly.actionsOnGoogle.permissionMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @js.native
  class Place protected ()
    extends typingsJapgolly.actionsOnGoogle.placeMod.Place {
    /**
      * @param options Place options
      * @public
      */
    def this(options: PlaceOptions) = this()
  }
  
  @js.native
  class RegisterUpdate protected ()
    extends typingsJapgolly.actionsOnGoogle.registerupdateMod.RegisterUpdate {
    /**
      * @param options RegisterUpdate options
      * @public
      */
    def this(options: RegisterUpdateOptions) = this()
  }
  
  @js.native
  /**
    * @param context The optional context why the app needs to ask the user to sign in, as a
    *     prefix of a prompt for user consent, e.g. "To track your exercise", or
    *     "To check your account balance".
    * @public
    */
  class SignIn ()
    extends typingsJapgolly.actionsOnGoogle.signinMod.SignIn {
    def this(context: String) = this()
  }
  
  @js.native
  class SoloHelper[TIntent /* <: Intent */, TValueSpec] ()
    extends typingsJapgolly.actionsOnGoogle.helperHelperMod.Helper[TIntent, TValueSpec]
  
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
    *     if using ordersv3
    * @public
    */
  class TransactionDecision ()
    extends typingsJapgolly.actionsOnGoogle.transactionMod.TransactionDecision {
    def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
    def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
  }
  
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
    *     if using ordersv3
    * @public
    */
  class TransactionRequirements ()
    extends typingsJapgolly.actionsOnGoogle.transactionMod.TransactionRequirements {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
  
  @js.native
  class UpdatePermission protected ()
    extends typingsJapgolly.actionsOnGoogle.permissionMod.UpdatePermission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
  
  def convert(items: OptionItems[String | OptionItem]): js.Array[ApiOptionItem] = js.native
}

