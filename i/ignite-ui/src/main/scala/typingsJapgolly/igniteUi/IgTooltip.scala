package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTooltip
  extends /**
	 * Option for igTooltip
	 */
/* optionName */ StringDictionary[js.Any] {
  var arrowLocation: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object IgTooltip {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTooltip
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    arrowLocation: String = null,
    text: String = null
  ): IgTooltip = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (arrowLocation != null) __obj.updateDynamic("arrowLocation")(arrowLocation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTooltip]
  }
}

