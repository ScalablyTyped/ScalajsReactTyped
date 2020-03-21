package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.basicMod.BasicCardOptions
import typingsJapgolly.actionsOnGoogle.browseMod.BrowseCarouselItemOptions
import typingsJapgolly.actionsOnGoogle.browseMod.BrowseCarouselOptions
import typingsJapgolly.actionsOnGoogle.buttonMod.ButtonOptions
import typingsJapgolly.actionsOnGoogle.commonMod.JsonObject
import typingsJapgolly.actionsOnGoogle.conversationConversationMod._Response
import typingsJapgolly.actionsOnGoogle.htmlMod.HtmlResponseOptions
import typingsJapgolly.actionsOnGoogle.imageMod.ImageOptions
import typingsJapgolly.actionsOnGoogle.linkoutMod.LinkOutSuggestionOptions
import typingsJapgolly.actionsOnGoogle.responseMediaMod.MediaObjectOptions
import typingsJapgolly.actionsOnGoogle.responseMediaMod.MediaObjectString
import typingsJapgolly.actionsOnGoogle.responseMediaMod.MediaResponseOptions
import typingsJapgolly.actionsOnGoogle.richMod.RichResponseItem
import typingsJapgolly.actionsOnGoogle.richMod.RichResponseOptions
import typingsJapgolly.actionsOnGoogle.simpleMod.SimpleResponseOptions
import typingsJapgolly.actionsOnGoogle.tableMod.TableOptions
import typingsJapgolly.actionsOnGoogle.urlMod.OpenUrlActionOptions
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsOrdersV3OrderUpdate
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2OrdersOrderUpdate
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsHtmlResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response", JSImport.Namespace)
@js.native
object responseMod extends js.Object {
  @js.native
  class BasicCard protected ()
    extends typingsJapgolly.actionsOnGoogle.cardMod.BasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @js.native
  class BrowseCarousel protected ()
    extends typingsJapgolly.actionsOnGoogle.browseMod.BrowseCarousel {
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
  
  @js.native
  class BrowseCarouselItem protected ()
    extends typingsJapgolly.actionsOnGoogle.browseMod.BrowseCarouselItem {
    /**
      * @param options BrowseCarouselItem options
      * @public
      */
    def this(options: BrowseCarouselItemOptions) = this()
  }
  
  @js.native
  class Button protected ()
    extends typingsJapgolly.actionsOnGoogle.cardMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @js.native
  /**
    * @param options Canvas options
    * @public
    */
  class HtmlResponse[TData /* <: JsonObject */] ()
    extends typingsJapgolly.actionsOnGoogle.htmlMod.HtmlResponse[TData] {
    def this(options: HtmlResponseOptions[TData]) = this()
    def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
  }
  
  @js.native
  class Image protected ()
    extends typingsJapgolly.actionsOnGoogle.imageMod.Image
       with _Response {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  @js.native
  class LinkOutSuggestion protected ()
    extends typingsJapgolly.actionsOnGoogle.linkoutMod.LinkOutSuggestion {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  @js.native
  class MediaObject protected ()
    extends typingsJapgolly.actionsOnGoogle.responseMediaMod.MediaObject
       with _Response {
    def this(options: String) = this()
    /**
      * @param options MediaObject options or just a string for the url
      * @public
      */
    def this(options: MediaObjectOptions) = this()
  }
  
  @js.native
  class MediaResponse protected ()
    extends typingsJapgolly.actionsOnGoogle.responseMediaMod.MediaResponse {
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
  
  @js.native
  class OpenUrlAction protected ()
    extends typingsJapgolly.actionsOnGoogle.urlMod.OpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  @js.native
  class OrderUpdate protected ()
    extends typingsJapgolly.actionsOnGoogle.orderMod.OrderUpdate {
    def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
    /**
      * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
      *     or {@link GoogleActionsOrdersV3OrderUpdate}
      *     if using ordersv3
      * @public
      */
    def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
  }
  
  @js.native
  class RichResponse protected ()
    extends typingsJapgolly.actionsOnGoogle.richMod.RichResponse
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
  
  @js.native
  class SimpleResponse protected ()
    extends typingsJapgolly.actionsOnGoogle.simpleMod.SimpleResponse {
    def this(options: String) = this()
    /**
      * @param options SimpleResponse options
      * @public
      */
    def this(options: SimpleResponseOptions) = this()
  }
  
  @js.native
  class Suggestions protected ()
    extends typingsJapgolly.actionsOnGoogle.suggestionMod.Suggestions
       with _Response {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
  }
  
  @js.native
  class Table protected ()
    extends typingsJapgolly.actionsOnGoogle.cardMod.Table {
    /** @public */
    def this(options: TableOptions) = this()
  }
  
}

