package typingsJapgolly.actionsOnGoogle.conversationMod

import typingsJapgolly.actionsOnGoogle.commonMod.JsonObject
import typingsJapgolly.actionsOnGoogle.htmlMod.HtmlResponseOptions
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsHtmlResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation", "HtmlResponse")
@js.native
/**
  * @param options Canvas options
  * @public
  */
class HtmlResponse[TData /* <: JsonObject */] ()
  extends typingsJapgolly.actionsOnGoogle.responseMod.HtmlResponse[TData] {
  def this(options: HtmlResponseOptions[TData]) = this()
  def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
}

