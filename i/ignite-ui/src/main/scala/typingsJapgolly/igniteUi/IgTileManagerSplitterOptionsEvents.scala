package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTileManagerSplitterOptionsEvents
  extends /**
	 * Option for IgTileManagerSplitterOptionsEvents
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event fired after collapsing is performed. Not cancellable.
  	 *
  	 *                     Function takes arguments evt and ui.
  	 *                     Use ui.owner to get a reference to the splitter instance.
  	 *                     Use ui.index to get an index of collased panel.
  	 */
  var collapsed: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Event fired after expanding is performed. Not cancellable.
  	 *
  	 *                     Function takes arguments evt and ui.
  	 *                     Use ui.owner to get a reference to the splitter instance.
  	 *                     Use ui.index to get an index of expanded panel.
  	 */
  var expanded: js.UndefOr[js.Any] = js.undefined
}

object IgTileManagerSplitterOptionsEvents {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTileManagerSplitterOptionsEvents
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    collapsed: js.Any = null,
    expanded: js.Any = null
  ): IgTileManagerSplitterOptionsEvents = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapsed != null) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTileManagerSplitterOptionsEvents]
  }
}

