package typingsJapgolly.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexBasisProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  // TODO: The FlexBasisValue currently really only exists for documentation
  //       purposes, because flex-basis also accepts `Nem` and `Npx` strings.
  //       Not sure there’s a way to still have the union values show up as
  //       auto-completion results.
  var flexBasis: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object FlexBasisProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](flexBasis: ResponsiveValue[TVal, ThemeType] = null): FlexBasisProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexBasisProps[ThemeType, TVal]]
  }
}

