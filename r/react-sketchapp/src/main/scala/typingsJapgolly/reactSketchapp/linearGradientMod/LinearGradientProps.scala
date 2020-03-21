package typingsJapgolly.reactSketchapp.linearGradientMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactSketchapp.propsMod.NumberProp
import typingsJapgolly.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typingsJapgolly.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientProps extends js.Object {
  var children: js.UndefOr[js.Array[Node] | Node] = js.undefined
  var gradientUnits: js.UndefOr[objectBoundingBox | userSpaceOnUse] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var x1: NumberProp
  var x2: NumberProp
  var y1: NumberProp
  var y2: NumberProp
}

object LinearGradientProps {
  @scala.inline
  def apply(
    x1: NumberProp,
    x2: NumberProp,
    y1: NumberProp,
    y2: NumberProp,
    children: js.Array[Node] | Node = null,
    gradientUnits: objectBoundingBox | userSpaceOnUse = null,
    id: String = null
  ): LinearGradientProps = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradientProps]
  }
}

