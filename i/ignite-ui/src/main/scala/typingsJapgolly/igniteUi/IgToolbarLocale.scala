package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgToolbarLocale
  extends /**
	 * Option for IgToolbarLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets collapse button title.
  	 *
  	 */
  var collapseButtonTitle: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets expand button title.
  	 *
  	 */
  var expandButtonTitle: js.UndefOr[js.Any] = js.undefined
}

object IgToolbarLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgToolbarLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    collapseButtonTitle: js.Any = null,
    expandButtonTitle: js.Any = null
  ): IgToolbarLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapseButtonTitle != null) __obj.updateDynamic("collapseButtonTitle")(collapseButtonTitle.asInstanceOf[js.Any])
    if (expandButtonTitle != null) __obj.updateDynamic("expandButtonTitle")(expandButtonTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgToolbarLocale]
  }
}

