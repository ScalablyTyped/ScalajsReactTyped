package typingsJapgolly.blueprintjsCore.utilsMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils", "throttleReactEventCallback")
@js.native
object throttleReactEventCallback extends js.Object {
  def apply(callback: js.Function2[/* event */ ReactEventFrom[Element], /* repeated */ js.Any, _]): js.Function1[/* event2 */ ReactEventFrom[Element], Unit] = js.native
  def apply(
    callback: js.Function2[/* event */ ReactEventFrom[Element], /* repeated */ js.Any, _],
    options: IThrottledReactEventOptions
  ): js.Function1[/* event2 */ ReactEventFrom[Element], Unit] = js.native
}

