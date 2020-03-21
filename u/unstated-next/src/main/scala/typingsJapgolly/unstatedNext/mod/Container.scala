package typingsJapgolly.unstatedNext.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container[Value, State] extends js.Object {
  var Provider: ComponentType[ContainerProviderProps[State]]
  def useContainer(): Value
}

object Container {
  @scala.inline
  def apply[Value, State](Provider: ComponentType[ContainerProviderProps[State]], useContainer: CallbackTo[Value]): Container[Value, State] = {
    val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any])
    __obj.updateDynamic("useContainer")(useContainer.toJsFn)
    __obj.asInstanceOf[Container[Value, State]]
  }
}

