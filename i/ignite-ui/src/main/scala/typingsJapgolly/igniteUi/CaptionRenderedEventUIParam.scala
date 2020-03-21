package typingsJapgolly.igniteUi

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionRenderedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the caption container.
  	 */
  var captionContainer: js.UndefOr[Element] = js.undefined
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object CaptionRenderedEventUIParam {
  @scala.inline
  def apply(captionContainer: Element = null, owner: js.Any = null): CaptionRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (captionContainer != null) __obj.updateDynamic("captionContainer")(captionContainer.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionRenderedEventUIParam]
  }
}

