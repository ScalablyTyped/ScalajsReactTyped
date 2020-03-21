package typingsJapgolly.reactSketchapp.mod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentProps extends js.Object {
  var children: js.UndefOr[js.Array[Element] | Element] = js.undefined
}

object DocumentProps {
  @scala.inline
  def apply(children: js.Array[Element] | Element = null): DocumentProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentProps]
  }
}

