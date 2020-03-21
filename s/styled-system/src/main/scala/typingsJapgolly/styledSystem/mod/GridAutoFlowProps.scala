package typingsJapgolly.styledSystem.mod

import typingsJapgolly.csstype.mod.GridAutoFlowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAutoFlowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The grid-auto-flow CSS property controls how the auto-placement algorithm works, specifying exactly
    * how auto-placed items get flowed into the grid.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow)
    */
  var gridAutoFlow: js.UndefOr[ResponsiveValue[GridAutoFlowProperty, ThemeType]] = js.undefined
}

object GridAutoFlowProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](gridAutoFlow: ResponsiveValue[GridAutoFlowProperty, ThemeType] = null): GridAutoFlowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (gridAutoFlow != null) __obj.updateDynamic("gridAutoFlow")(gridAutoFlow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAutoFlowProps[ThemeType]]
  }
}

