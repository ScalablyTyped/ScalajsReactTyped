package typingsJapgolly.reactAlert.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertComponentPropsWithStyle extends AlertComponentProps {
  var style: CSSProperties
}

object AlertComponentPropsWithStyle {
  @scala.inline
  def apply(
    close: Callback,
    id: String,
    options: AlertCustomOptionsWithType,
    style: CSSProperties,
    message: VdomNode = null
  ): AlertComponentPropsWithStyle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertComponentPropsWithStyle]
  }
}

