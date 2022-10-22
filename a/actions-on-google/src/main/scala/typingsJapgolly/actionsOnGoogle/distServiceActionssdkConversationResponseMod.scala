package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.distCommonMod.JsonObject
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsOrdersV3OrderUpdate
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2OrdersOrderUpdate
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsHtmlResponse
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationConversationMod._Response
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationResponseMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "BasicCard")
  @js.native
  open class BasicCard protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseCardMod.BasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "BrowseCarousel")
  @js.native
  open class BrowseCarousel protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarousel {
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
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "BrowseCarouselItem")
  @js.native
  open class BrowseCarouselItem protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselItem {
    /**
      * @param options BrowseCarouselItem options
      * @public
      */
    def this(options: BrowseCarouselItemOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "Button")
  @js.native
  open class Button protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseCardMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "HtmlResponse")
  @js.native
  /**
    * @param options Canvas options
    * @public
    */
  open class HtmlResponse[TData /* <: JsonObject */] ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponse[TData] {
    def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
    def this(options: HtmlResponseOptions[TData]) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "Image")
  @js.native
  open class Image protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseImageMod.Image
       with _Response {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "LinkOutSuggestion")
  @js.native
  open class LinkOutSuggestion protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseLinkoutMod.LinkOutSuggestion {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "MediaObject")
  @js.native
  open class MediaObject protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObject
       with _Response {
    def this(options: String) = this()
    /**
      * @param options MediaObject options or just a string for the url
      * @public
      */
    def this(options: MediaObjectOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "MediaResponse")
  @js.native
  open class MediaResponse protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaResponse {
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
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "OpenUrlAction")
  @js.native
  open class OpenUrlAction protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseUrlMod.OpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "OrderUpdate")
  @js.native
  open class OrderUpdate protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseOrderMod.OrderUpdate {
    def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
    /**
      * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
      *     or {@link GoogleActionsOrdersV3OrderUpdate}
      *     if using ordersv3
      * @public
      */
    def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "RichResponse")
  @js.native
  open class RichResponse protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod.RichResponse
       with _Response {
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
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "SimpleResponse")
  @js.native
  open class SimpleResponse protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseSimpleMod.SimpleResponse {
    def this(options: String) = this()
    /**
      * @param options SimpleResponse options
      * @public
      */
    def this(options: SimpleResponseOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "Suggestions")
  @js.native
  open class Suggestions protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseSuggestionMod.Suggestions
       with _Response {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "Table")
  @js.native
  open class Table protected ()
    extends typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationResponseCardMod.Table {
    /** @public */
    def this(options: TableOptions) = this()
  }
}
