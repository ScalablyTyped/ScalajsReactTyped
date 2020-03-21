package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactBootstrapTable.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizePerPageDropDownProps extends js.Object {
  /**
  	 * Bootstrap css style class for the button, e.g. 'btn-warning'
  	 */
  var btnContextual: js.UndefOr[String] = js.undefined
  /**
  	 * Custom class name to use for the component.
  	 */
  var className: js.UndefOr[String] = js.undefined
  /**
  	 * Current size per page
  	 */
  var currSizePerPage: js.UndefOr[String] = js.undefined
  /**
  	 * Flag to indicate that the dropdown is currently hidden
  	 */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Callback function that should be triggered when the user clicks on the dropdown button.
  	 */
  var onClick: js.UndefOr[js.Function1[/* toggleDropDown */ js.Function0[Unit], Unit]] = js.undefined
  /**
  	 * Flag to indicate that the dropdown is open
  	 */
  var open: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Size Per Page options list
  	 */
  var options: js.UndefOr[js.Array[AnonText | Double]] = js.undefined
  /**
  	 * Whether the button menu should 'dropup' or 'dropdown'.
  	 */
  var variation: js.UndefOr[DropDirection] = js.undefined
}

object SizePerPageDropDownProps {
  @scala.inline
  def apply(
    btnContextual: String = null,
    className: String = null,
    currSizePerPage: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    onClick: /* toggleDropDown */ js.Function0[Unit] => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    options: js.Array[AnonText | Double] = null,
    variation: DropDirection = null
  ): SizePerPageDropDownProps = {
    val __obj = js.Dynamic.literal()
    if (btnContextual != null) __obj.updateDynamic("btnContextual")(btnContextual.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (currSizePerPage != null) __obj.updateDynamic("currSizePerPage")(currSizePerPage.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* toggleDropDown */ js.Function0[scala.Unit]) => onClick(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (variation != null) __obj.updateDynamic("variation")(variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizePerPageDropDownProps]
  }
}

