package typingsJapgolly.reactCalendarTimeline

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: String
  var ref: Ref
  var style: CSSProperties
}

object AnonClassName {
  @scala.inline
  def apply(className: String, style: CSSProperties, ref: Ref = null): AnonClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
}

