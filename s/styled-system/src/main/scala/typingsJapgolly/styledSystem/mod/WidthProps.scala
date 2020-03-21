package typingsJapgolly.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidthProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    *   The width utility parses a component's `width` prop and converts it into a CSS width declaration.
    *
    *   - Numbers from 0-1 are converted to percentage widths.
    *   - Numbers greater than 1 are converted to pixel values.
    *   - String values are passed as raw CSS values.
    *   - And arrays are converted to responsive width styles.
    */
  var width: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object WidthProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](width: ResponsiveValue[TVal, ThemeType] = null): WidthProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidthProps[ThemeType, TVal]]
  }
}

