package typingsJapgolly.officeUiFabricReact.shimmerElementsGroupTypesMod

import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerElementsGroupStyleProps extends js.Object {
  /**
    * Boolean flag to notify whether the root element needs to flex wrap.
    */
  var flexWrap: js.UndefOr[Boolean] = js.undefined
  /** Theme provided by High-Order Component. */
  var theme: ITheme
}

object IShimmerElementsGroupStyleProps {
  @scala.inline
  def apply(theme: ITheme, flexWrap: js.UndefOr[Boolean] = js.undefined): IShimmerElementsGroupStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(flexWrap)) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerElementsGroupStyleProps]
  }
}

