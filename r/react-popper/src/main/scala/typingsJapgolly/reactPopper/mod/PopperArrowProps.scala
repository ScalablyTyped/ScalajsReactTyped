package typingsJapgolly.reactPopper.mod

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperArrowProps extends js.Object {
  var ref: Ref
  var style: CSSProperties
}

object PopperArrowProps {
  @scala.inline
  def apply(style: CSSProperties, ref: Ref = null): PopperArrowProps = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperArrowProps]
  }
}

