package typingsJapgolly.antDesignPro.fieldMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldProps extends js.Object {
  var label: Node
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: Node
}

object IFieldProps {
  @scala.inline
  def apply(label: VdomNode = null, style: CSSProperties = null, value: VdomNode = null): IFieldProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldProps]
  }
}

