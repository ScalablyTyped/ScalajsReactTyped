package typingsJapgolly.knockout.KnockoutComponentTypes

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ViewModel extends js.Object

object _ViewModel {
  @scala.inline
  def ViewModelSharedInstance(instance: js.Any): _ViewModel = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_ViewModel]
  }
  @scala.inline
  def ViewModelFactoryFunction(createViewModel: (js.Any, ComponentInfo) => CallbackTo[js.Any]): _ViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createViewModel")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.knockout.KnockoutComponentTypes.ComponentInfo) => createViewModel(t0, t1).runNow()))
    __obj.asInstanceOf[_ViewModel]
  }
  @scala.inline
  def AMDModule(require: String): _ViewModel = {
    val __obj = js.Dynamic.literal(require = require.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_ViewModel]
  }
}

