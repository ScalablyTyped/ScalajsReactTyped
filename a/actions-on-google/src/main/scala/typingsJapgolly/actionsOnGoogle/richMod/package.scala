package typingsJapgolly.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object richMod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.actionsOnGoogle.simpleMod.SimpleResponse
    - typingsJapgolly.actionsOnGoogle.cardMod.BasicCard
    - typingsJapgolly.actionsOnGoogle.cardMod.Table
    - typingsJapgolly.actionsOnGoogle.browseMod.BrowseCarousel
    - typingsJapgolly.actionsOnGoogle.responseMediaMod.MediaResponse
    - typingsJapgolly.actionsOnGoogle.orderMod.OrderUpdate
    - typingsJapgolly.actionsOnGoogle.linkoutMod.LinkOutSuggestion
    - typingsJapgolly.actionsOnGoogle.htmlMod.HtmlResponse[typingsJapgolly.actionsOnGoogle.commonMod.JsonObject]
    - typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponseItem
  */
  type RichResponseItem = typingsJapgolly.actionsOnGoogle.richMod._RichResponseItem | typingsJapgolly.actionsOnGoogle.htmlMod.HtmlResponse[typingsJapgolly.actionsOnGoogle.commonMod.JsonObject] | java.lang.String
}
