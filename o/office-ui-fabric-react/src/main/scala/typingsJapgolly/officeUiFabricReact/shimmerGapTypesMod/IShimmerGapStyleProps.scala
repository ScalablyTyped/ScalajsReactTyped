package typingsJapgolly.officeUiFabricReact.shimmerGapTypesMod

import typingsJapgolly.uifabricMergeStyles.istyleMod.IRawStyle
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerGapStyleProps extends js.Object {
  /**
    * Styles to override borderStyles with custom ones.
    * @deprecated in favor of mergeStyles API.
    */
  var borderStyle: js.UndefOr[IRawStyle] = js.undefined
  /**
    * Needed to provide a height to the root of the control.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Theme values passed to the component.
    */
  var theme: ITheme
}

object IShimmerGapStyleProps {
  @scala.inline
  def apply(theme: ITheme, borderStyle: IRawStyle = null, height: Int | Double = null): IShimmerGapStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerGapStyleProps]
  }
}

