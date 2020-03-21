package typingsJapgolly.chromeApps.chrome.system.display

import typingsJapgolly.chromeApps.AnonBOTTOM
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.chromeApps.chromeAppsStrings.bottom
import typingsJapgolly.chromeApps.chromeAppsStrings.left
import typingsJapgolly.chromeApps.chromeAppsStrings.right
import typingsJapgolly.chromeApps.chromeAppsStrings.top
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 53
  */
trait DisplayLayout extends js.Object {
  /** The unique identifier of the display. */
  var id: String
  /** The offset of the display along the connected edge. 0 indicates that the topmost or leftmost corners are aligned. */
  var offset: integer
  /** The unique identifier of the parent display. Empty if this is the root. */
  var parentId: String
  /**
    * The layout position of this display relative to the parent.
    * This will be ignored for the root.
    * @see enum DisplayPosition
    */
  var position: ToStringLiteral[AnonBOTTOM, String, Exclude[String, top | right | bottom | left]]
}

object DisplayLayout {
  @scala.inline
  def apply(
    id: String,
    offset: integer,
    parentId: String,
    position: ToStringLiteral[AnonBOTTOM, String, Exclude[String, top | right | bottom | left]]
  ): DisplayLayout = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisplayLayout]
  }
}

