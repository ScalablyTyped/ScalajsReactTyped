package typingsJapgolly.baseui.layoutGridMod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps extends js.Object {
  var align: js.UndefOr[Responsive[ALIGNMENT]] = js.undefined
  var behavior: js.UndefOr[BEHAVIOR] = js.undefined
  var children: Element | js.Array[Element]
  var gridColumns: js.UndefOr[Responsive[Double]] = js.undefined
  var gridGaps: js.UndefOr[Responsive[Double]] = js.undefined
  var gridGutters: js.UndefOr[Responsive[Double]] = js.undefined
  var gridMargins: js.UndefOr[Responsive[Double]] = js.undefined
  var gridMaxWidth: js.UndefOr[Double] = js.undefined
  var gridUnit: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
  ] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    children: Element | js.Array[Element],
    align: Responsive[ALIGNMENT] = null,
    behavior: BEHAVIOR = null,
    gridColumns: Responsive[Double] = null,
    gridGaps: Responsive[Double] = null,
    gridGutters: Responsive[Double] = null,
    gridMargins: Responsive[Double] = null,
    gridMaxWidth: Int | Double = null,
    gridUnit: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any = null
  ): GridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (gridColumns != null) __obj.updateDynamic("gridColumns")(gridColumns.asInstanceOf[js.Any])
    if (gridGaps != null) __obj.updateDynamic("gridGaps")(gridGaps.asInstanceOf[js.Any])
    if (gridGutters != null) __obj.updateDynamic("gridGutters")(gridGutters.asInstanceOf[js.Any])
    if (gridMargins != null) __obj.updateDynamic("gridMargins")(gridMargins.asInstanceOf[js.Any])
    if (gridMaxWidth != null) __obj.updateDynamic("gridMaxWidth")(gridMaxWidth.asInstanceOf[js.Any])
    if (gridUnit != null) __obj.updateDynamic("gridUnit")(gridUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
}

