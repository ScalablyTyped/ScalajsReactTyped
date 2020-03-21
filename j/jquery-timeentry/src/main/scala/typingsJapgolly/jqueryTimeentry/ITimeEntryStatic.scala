package typingsJapgolly.jqueryTimeentry

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeEntryStatic extends js.Object {
  var regionalOptions: ITimeEntryLocales
  def setDefaults(settings: ITimeEntryOptions): Unit
}

object ITimeEntryStatic {
  @scala.inline
  def apply(regionalOptions: ITimeEntryLocales, setDefaults: ITimeEntryOptions => Callback): ITimeEntryStatic = {
    val __obj = js.Dynamic.literal(regionalOptions = regionalOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("setDefaults")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryTimeentry.ITimeEntryOptions) => setDefaults(t0).runNow()))
    __obj.asInstanceOf[ITimeEntryStatic]
  }
}

