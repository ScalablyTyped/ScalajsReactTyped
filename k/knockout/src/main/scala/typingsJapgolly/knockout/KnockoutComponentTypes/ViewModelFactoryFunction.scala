package typingsJapgolly.knockout.KnockoutComponentTypes

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModelFactoryFunction extends _ViewModel {
  def createViewModel(params: js.Any, componentInfo: ComponentInfo): js.Any
}

object ViewModelFactoryFunction {
  @scala.inline
  def apply(createViewModel: (js.Any, ComponentInfo) => CallbackTo[js.Any]): ViewModelFactoryFunction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createViewModel")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.knockout.KnockoutComponentTypes.ComponentInfo) => createViewModel(t0, t1).runNow()))
    __obj.asInstanceOf[ViewModelFactoryFunction]
  }
}

