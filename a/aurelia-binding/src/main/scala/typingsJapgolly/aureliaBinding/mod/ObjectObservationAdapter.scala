package typingsJapgolly.aureliaBinding.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectObservationAdapter extends js.Object {
  def getObserver(`object`: js.Any, propertyName: String, descriptor: js.PropertyDescriptor): js.UndefOr[InternalPropertyObserver | Null]
}

object ObjectObservationAdapter {
  @scala.inline
  def apply(
    getObserver: (js.Any, String, js.PropertyDescriptor) => CallbackTo[js.UndefOr[InternalPropertyObserver | Null]]
  ): ObjectObservationAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getObserver")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: js.PropertyDescriptor) => getObserver(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ObjectObservationAdapter]
  }
}

