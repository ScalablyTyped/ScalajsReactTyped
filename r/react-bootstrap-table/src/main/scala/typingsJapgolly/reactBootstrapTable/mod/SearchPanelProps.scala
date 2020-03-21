package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchPanelProps extends js.Object {
  /**
  	 * Default clear search field button component.
  	 */
  var clearBtn: Element
  /**
  	 * The default search text.
  	 */
  var defaultValue: String
  /**
  	 * The placeholder text for the search field.
  	 */
  var placeholder: String
  /**
  	 * Default search field component.
  	 */
  var searchField: Element
  /**
  	 * A callback to trigger the clear search field event.
  	 */
  def clearBtnClick(): Unit
  /**
  	 * A callback to trigger a search, takes the search text as an input.
  	 */
  def search(searchText: String): Unit
}

object SearchPanelProps {
  @scala.inline
  def apply(
    clearBtn: VdomElement,
    clearBtnClick: Callback,
    defaultValue: String,
    placeholder: String,
    search: String => Callback,
    searchField: VdomElement
  ): SearchPanelProps = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    if (clearBtn != null) __obj.updateDynamic("clearBtn")(clearBtn.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("clearBtnClick")(clearBtnClick.toJsFn)
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: java.lang.String) => search(t0).runNow()))
    if (searchField != null) __obj.updateDynamic("searchField")(searchField.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPanelProps]
  }
}

