package typingsJapgolly.storybookAddonA11y

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.storybookAddonA11y.highlightToggleMod.HighlightedElementData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: HighlightedElementData
  var element: HTMLElement
}

object AnonData {
  @scala.inline
  def apply(data: HighlightedElementData, element: HTMLElement): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

