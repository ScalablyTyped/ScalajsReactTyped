package typingsJapgolly.reactSelect.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsWithStyles extends js.Object {
  /*
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  def getStyles(name: String, props: js.Any): js.Object
}

object PropsWithStyles {
  @scala.inline
  def apply(getStyles: (String, js.Any) => CallbackTo[js.Object]): PropsWithStyles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStyles")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => getStyles(t0, t1).runNow()))
    __obj.asInstanceOf[PropsWithStyles]
  }
}

