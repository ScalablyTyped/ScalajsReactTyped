package typingsJapgolly.styledSystem.mod

import typingsJapgolly.csstype.mod.GridTemplateAreasProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTemplateAreasProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The grid-template-areas CSS property specifies named grid areas.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-areas)
    */
  var gridTemplateAreas: js.UndefOr[ResponsiveValue[GridTemplateAreasProperty, ThemeType]] = js.undefined
}

object GridTemplateAreasProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](gridTemplateAreas: ResponsiveValue[GridTemplateAreasProperty, ThemeType] = null): GridTemplateAreasProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (gridTemplateAreas != null) __obj.updateDynamic("gridTemplateAreas")(gridTemplateAreas.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTemplateAreasProps[ThemeType]]
  }
}

