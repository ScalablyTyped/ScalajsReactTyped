package typingsJapgolly.reactSketchapp.symbolMod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolProps extends js.Object {
  var children: js.Array[Node] | Node
  var id: String
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
}

object SymbolProps {
  @scala.inline
  def apply(
    id: String,
    children: js.Array[Node] | Node = null,
    preserveAspectRatio: String = null,
    viewBox: String = null
  ): SymbolProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolProps]
  }
}

