package typingsJapgolly.mobxDashReactDashLite.distObserverComponentMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObserverProps extends js.Object {
  var children: js.UndefOr[js.Function0[Element]] = js.undefined
  var render: js.UndefOr[js.Function0[Element]] = js.undefined
}

object IObserverProps {
  @scala.inline
  def apply(
    children: js.UndefOr[CallbackTo[Element]] = js.undefined,
    render: js.UndefOr[CallbackTo[Element]] = js.undefined
  ): IObserverProps = {
    val __obj = js.Dynamic.literal()
    children.foreach(p => __obj.updateDynamic("children")(p.toJsFn))
    render.foreach(p => __obj.updateDynamic("render")(p.toJsFn))
    __obj.asInstanceOf[IObserverProps]
  }
}

