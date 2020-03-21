package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  /**
  	 * Bootstrap css style class for the button, e.g. 'btn-warning'
  	 */
  var btnContextual: js.UndefOr[String] = js.undefined
  /**
  	 * Glyphicon glyph string for the button, e.g. 'glyphicon-edit'
  	 */
  var btnGlyphicon: js.UndefOr[String] = js.undefined
  /**
  	 * Label for the button
  	 */
  var btnText: js.UndefOr[String] = js.undefined
  /**
  	 * Custom class for the button
  	 */
  var className: js.UndefOr[String] = js.undefined
  /**
  	 * Function to be called to activate the normal onClick functionality for this button.
  	 */
  var onClick: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Unit]] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    btnContextual: String = null,
    btnGlyphicon: String = null,
    btnText: String = null,
    className: String = null,
    onClick: /* e */ ReactMouseEventFrom[Element] => Callback = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (btnContextual != null) __obj.updateDynamic("btnContextual")(btnContextual.asInstanceOf[js.Any])
    if (btnGlyphicon != null) __obj.updateDynamic("btnGlyphicon")(btnGlyphicon.asInstanceOf[js.Any])
    if (btnText != null) __obj.updateDynamic("btnText")(btnText.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    __obj.asInstanceOf[ButtonProps]
  }
}

