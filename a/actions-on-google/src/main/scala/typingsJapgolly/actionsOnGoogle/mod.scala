package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.distCommonMod.JsonObject
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkActionssdkMod.ActionsSdk_
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsOrdersV3OrderUpdate
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DeliveryAddressValueSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2OrdersOrderUpdate
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValueSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsHtmlResponse
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConvMod.ActionsSdkConversationOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationConversationMod.ConversationOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationConversationMod.Intent
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperDatetimeMod.DateTimeOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.HelperOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperNewsurfaceMod.NewSurfaceOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperOptionCarouselMod.CarouselOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperOptionListMod.ListOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionPermissionMod.PermissionOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionUpdateMod.UpdatePermissionOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperPlaceMod.PlaceOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperRegisterupdateMod.RegisterUpdateOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselItemOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCardOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseCardButtonMod.ButtonOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseCardTableMod.TableOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponseOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseImageMod.ImageOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseLinkoutMod.LinkOutSuggestionOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObjectOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObjectString
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaResponseOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod.RichResponseItem
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod.RichResponseOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseSimpleMod.SimpleResponseOptions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseUrlMod.OpenUrlActionOptions
import typingsJapgolly.actionsOnGoogle.distServiceDialogflowContextMod.Contexts
import typingsJapgolly.actionsOnGoogle.distServiceDialogflowConvMod.DialogflowConversationOptions
import typingsJapgolly.actionsOnGoogle.distServiceDialogflowDialogflowMod.Dialogflow_
import typingsJapgolly.actionsOnGoogle.distServiceSmarthomeSmarthomeMod.SmartHome_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("actions-on-google", "ActionsSdkConversation")
  @js.native
  /** @public */
  open class ActionsSdkConversation[TConvData, TUserStorage] ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.ActionsSdkConversation[TConvData, TUserStorage] {
    def this(options: ActionsSdkConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google", "BasicCard")
  @js.native
  open class BasicCard protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.BasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @JSImport("actions-on-google", "BrowseCarousel")
  @js.native
  open class BrowseCarousel protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.BrowseCarousel {
    /**
      * @param items BrowseCarousel items
      * @public
      */
    def this(items: GoogleActionsV2UiElementsCarouselBrowseItem*) = this()
    /**
      * @param items BrowseCarousel items
      * @public
      */
    def this(items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]) = this()
    /**
      * @param options BrowseCarousel options
      * @public
      */
    def this(options: BrowseCarouselOptions) = this()
  }
  
  @JSImport("actions-on-google", "BrowseCarouselItem")
  @js.native
  open class BrowseCarouselItem protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.BrowseCarouselItem {
    /**
      * @param options BrowseCarouselItem options
      * @public
      */
    def this(options: BrowseCarouselItemOptions) = this()
  }
  
  @JSImport("actions-on-google", "Button")
  @js.native
  open class Button protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @JSImport("actions-on-google", "Carousel")
  @js.native
  open class Carousel protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @JSImport("actions-on-google", "CompletePurchase")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3CompletePurchaseValueSpec}
    * @public
    */
  open class CompletePurchase ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.CompletePurchase {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  @JSImport("actions-on-google", "Confirmation")
  @js.native
  open class Confirmation protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Confirmation {
    /**
      * @param text The confirmation prompt presented to the user to
      *     query for an affirmative or negative response.
      * @public
      */
    def this(text: String) = this()
  }
  
  @JSImport("actions-on-google", "Conversation")
  @js.native
  /** @hidden */
  open class Conversation[TUserStorage] ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Conversation[TUserStorage] {
    def this(options: ConversationOptions[TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google", "DateTime")
  @js.native
  open class DateTime protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.DateTime {
    /**
      * @param options DateTime options
      * @public
      */
    def this(options: DateTimeOptions) = this()
  }
  
  @JSImport("actions-on-google", "DeliveryAddress")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  open class DeliveryAddress ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.DeliveryAddress {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  @JSImport("actions-on-google", "DialogflowConversation")
  @js.native
  /** @public */
  open class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
    extends typingsJapgolly.actionsOnGoogle.distServiceDialogflowMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google", "DigitalPurchaseCheck")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  open class DigitalPurchaseCheck ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.DigitalPurchaseCheck {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  @JSImport("actions-on-google", "Helper")
  @js.native
  open class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Helper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google", "HtmlResponse")
  @js.native
  /**
    * @param options Canvas options
    * @public
    */
  open class HtmlResponse[TData /* <: JsonObject */] ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.HtmlResponse[TData] {
    def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
    def this(options: HtmlResponseOptions[TData]) = this()
  }
  
  @JSImport("actions-on-google", "Image")
  @js.native
  open class Image protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Image {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  @JSImport("actions-on-google", "LinkOutSuggestion")
  @js.native
  open class LinkOutSuggestion protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.LinkOutSuggestion {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  @JSImport("actions-on-google", "List")
  @js.native
  open class List protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  @JSImport("actions-on-google", "MediaObject")
  @js.native
  open class MediaObject protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.MediaObject {
    def this(options: String) = this()
    /**
      * @param options MediaObject options or just a string for the url
      * @public
      */
    def this(options: MediaObjectOptions) = this()
  }
  
  @JSImport("actions-on-google", "MediaResponse")
  @js.native
  open class MediaResponse protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.MediaResponse {
    /**
      * @param objects MediaObjects
      * @public
      */
    def this(objects: MediaObjectString*) = this()
    /**
      * @param objects MediaObjects
      * @public
      */
    def this(objects: js.Array[MediaObjectString]) = this()
    /**
      * @param options MediaResponse options
      * @public
      */
    def this(options: MediaResponseOptions) = this()
  }
  
  @JSImport("actions-on-google", "NewSurface")
  @js.native
  open class NewSurface protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.NewSurface {
    /**
      * @param options NewSurface options
      * @public
      */
    def this(options: NewSurfaceOptions) = this()
  }
  
  @JSImport("actions-on-google", "OpenUrlAction")
  @js.native
  open class OpenUrlAction protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.OpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  @JSImport("actions-on-google", "OrderUpdate")
  @js.native
  open class OrderUpdate protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.OrderUpdate {
    def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
    /**
      * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
      *     or {@link GoogleActionsOrdersV3OrderUpdate}
      *     if using ordersv3
      * @public
      */
    def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
  }
  
  @JSImport("actions-on-google", "Permission")
  @js.native
  open class Permission protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @JSImport("actions-on-google", "Place")
  @js.native
  open class Place protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Place {
    /**
      * @param options Place options
      * @public
      */
    def this(options: PlaceOptions) = this()
  }
  
  @JSImport("actions-on-google", "RegisterUpdate")
  @js.native
  open class RegisterUpdate protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.RegisterUpdate {
    /**
      * @param options RegisterUpdate options
      * @public
      */
    def this(options: RegisterUpdateOptions) = this()
  }
  
  @JSImport("actions-on-google", "RichResponse")
  @js.native
  open class RichResponse protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.RichResponse {
    /**
      * @param items RichResponse items
      * @public
      */
    def this(items: RichResponseItem*) = this()
    /**
      * @param items RichResponse items
      * @public
      */
    def this(items: js.Array[RichResponseItem]) = this()
    /**
      * @param options RichResponse options
      * @public
      */
    def this(options: RichResponseOptions) = this()
  }
  
  @JSImport("actions-on-google", "SignIn")
  @js.native
  /**
    * @param context The optional context why the app needs to ask the user to sign in, as a
    *     prefix of a prompt for user consent, e.g. "To track your exercise", or
    *     "To check your account balance".
    * @public
    */
  open class SignIn ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.SignIn {
    def this(context: String) = this()
  }
  
  @JSImport("actions-on-google", "SimpleResponse")
  @js.native
  open class SimpleResponse protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.SimpleResponse {
    def this(options: String) = this()
    /**
      * @param options SimpleResponse options
      * @public
      */
    def this(options: SimpleResponseOptions) = this()
  }
  
  @JSImport("actions-on-google", "SoloHelper")
  @js.native
  open class SoloHelper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.SoloHelper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google", "Suggestions")
  @js.native
  open class Suggestions protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Suggestions {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
  }
  
  @JSImport("actions-on-google", "Table")
  @js.native
  open class Table protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.Table {
    /** @public */
    def this(options: TableOptions) = this()
  }
  
  @JSImport("actions-on-google", "TransactionDecision")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
    *     if using ordersv3
    * @public
    */
  open class TransactionDecision ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.TransactionDecision {
    def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
    def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
  }
  
  @JSImport("actions-on-google", "TransactionRequirements")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
    *     if using ordersv3
    * @public
    */
  open class TransactionRequirements ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.TransactionRequirements {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
  
  @JSImport("actions-on-google", "UnauthorizedError")
  @js.native
  open class UnauthorizedError ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.UnauthorizedError
  
  @JSImport("actions-on-google", "UpdatePermission")
  @js.native
  open class UpdatePermission protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkMod.UpdatePermission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
  
  @JSImport("actions-on-google", "actionssdk")
  @js.native
  val actionssdk: ActionsSdk_ = js.native
  
  @JSImport("actions-on-google", "dialogflow")
  @js.native
  val dialogflow: Dialogflow_ = js.native
  
  @JSImport("actions-on-google", "smarthome")
  @js.native
  val smarthome: SmartHome_ = js.native
}
