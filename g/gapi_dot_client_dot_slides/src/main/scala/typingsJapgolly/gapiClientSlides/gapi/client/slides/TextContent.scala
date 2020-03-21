package typingsJapgolly.gapiClientSlides.gapi.client.slides

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextContent extends js.Object {
  /** The bulleted lists contained in this text, keyed by list ID. */
  var lists: js.UndefOr[Record[String, List]] = js.undefined
  /**
    * The text contents broken down into its component parts, including styling
    * information. This property is read-only.
    */
  var textElements: js.UndefOr[js.Array[TextElement]] = js.undefined
}

object TextContent {
  @scala.inline
  def apply(lists: Record[String, List] = null, textElements: js.Array[TextElement] = null): TextContent = {
    val __obj = js.Dynamic.literal()
    if (lists != null) __obj.updateDynamic("lists")(lists.asInstanceOf[js.Any])
    if (textElements != null) __obj.updateDynamic("textElements")(textElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextContent]
  }
}

