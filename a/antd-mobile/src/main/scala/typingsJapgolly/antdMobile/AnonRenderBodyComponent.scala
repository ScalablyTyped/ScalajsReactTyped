package typingsJapgolly.antdMobile

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRenderBodyComponent extends js.Object {
  var renderFooter: js.Any
  var renderHeader: js.Any
  var renderSectionHeader: js.Any
  def renderBodyComponent(): Element
}

object AnonRenderBodyComponent {
  @scala.inline
  def apply(
    renderBodyComponent: CallbackTo[Element],
    renderFooter: js.Any,
    renderHeader: js.Any,
    renderSectionHeader: js.Any
  ): AnonRenderBodyComponent = {
    val __obj = js.Dynamic.literal(renderFooter = renderFooter.asInstanceOf[js.Any], renderHeader = renderHeader.asInstanceOf[js.Any], renderSectionHeader = renderSectionHeader.asInstanceOf[js.Any])
    __obj.updateDynamic("renderBodyComponent")(renderBodyComponent.toJsFn)
    __obj.asInstanceOf[AnonRenderBodyComponent]
  }
}

