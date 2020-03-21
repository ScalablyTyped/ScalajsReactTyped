package typingsJapgolly.satnav

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISatnav extends js.Object {
  def change(onChange: js.Function3[/* hash */ String, /* params */ js.Any, /* old */ js.Any, _]): ISatnav
  def go(): ISatnav
  def navigate(navigationOptions: INavigationOptions): ISatnav
  def otherwise(route: String): ISatnav
}

object ISatnav {
  @scala.inline
  def apply(
    change: js.Function3[/* hash */ String, /* params */ js.Any, /* old */ js.Any, js.Any] => CallbackTo[ISatnav],
    go: CallbackTo[ISatnav],
    navigate: INavigationOptions => CallbackTo[ISatnav],
    otherwise: String => CallbackTo[ISatnav]
  ): ISatnav = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("change")(js.Any.fromFunction1((t0: js.Function3[/* hash */ java.lang.String, /* params */ js.Any, /* old */ js.Any, js.Any]) => change(t0).runNow()))
    __obj.updateDynamic("go")(go.toJsFn)
    __obj.updateDynamic("navigate")(js.Any.fromFunction1((t0: typingsJapgolly.satnav.INavigationOptions) => navigate(t0).runNow()))
    __obj.updateDynamic("otherwise")(js.Any.fromFunction1((t0: java.lang.String) => otherwise(t0).runNow()))
    __obj.asInstanceOf[ISatnav]
  }
}

