package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetActivationFactory extends js.Object {
  def getActivationFactory(activatableClassId: String): js.Any
}

object IGetActivationFactory {
  @scala.inline
  def apply(getActivationFactory: String => CallbackTo[js.Any]): IGetActivationFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getActivationFactory")(js.Any.fromFunction1((t0: java.lang.String) => getActivationFactory(t0).runNow()))
    __obj.asInstanceOf[IGetActivationFactory]
  }
}

