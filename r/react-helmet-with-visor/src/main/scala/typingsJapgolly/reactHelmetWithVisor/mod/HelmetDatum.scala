package typingsJapgolly.reactHelmetWithVisor.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetDatum extends js.Object {
  def toComponent(): Component[js.Object, js.Object]
}

object HelmetDatum {
  @scala.inline
  def apply(toComponent: CallbackTo[Component[js.Object, js.Object]]): HelmetDatum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toComponent")(toComponent.toJsFn)
    __obj.asInstanceOf[HelmetDatum]
  }
}

