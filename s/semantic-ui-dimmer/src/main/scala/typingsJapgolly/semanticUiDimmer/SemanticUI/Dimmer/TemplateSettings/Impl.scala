package typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.semanticUiDimmer.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  def dimmer(): JQuery
}

object Impl {
  @scala.inline
  def apply(dimmer: CallbackTo[JQuery]): Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dimmer")(dimmer.toJsFn)
    __obj.asInstanceOf[Impl]
  }
}

