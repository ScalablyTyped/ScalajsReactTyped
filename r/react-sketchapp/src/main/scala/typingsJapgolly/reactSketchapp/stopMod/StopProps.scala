package typingsJapgolly.reactSketchapp.stopMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactSketchapp.propsMod.NumberProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopProps extends js.Object {
  var children: js.UndefOr[js.Array[Node] | Node] = js.undefined
  var stopColor: js.UndefOr[String] = js.undefined
  var stopOpacity: js.UndefOr[NumberProp] = js.undefined
}

object StopProps {
  @scala.inline
  def apply(children: js.Array[Node] | Node = null, stopColor: String = null, stopOpacity: NumberProp = null): StopProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopProps]
  }
}

