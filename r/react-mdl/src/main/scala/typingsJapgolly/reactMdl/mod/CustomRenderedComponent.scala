package typingsJapgolly.reactMdl.mod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomRenderedComponent extends js.Object {
  var component: js.UndefOr[String | Element | js.Function] = js.undefined
}

object CustomRenderedComponent {
  @scala.inline
  def apply(component: String | Element | js.Function = null): CustomRenderedComponent = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRenderedComponent]
  }
}

