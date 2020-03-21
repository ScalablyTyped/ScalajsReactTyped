package typingsJapgolly.webicon.iconMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  /**
    * Parses the input to an icon-id.
    *
    * @param id
    * The id of the icon to get.
    *
    * @param params
    * Additional parameters for getting the icon.
    *
    * @return
    * The id of the icon to get.
    */
  var iconIdParser: js.UndefOr[js.Function2[/* id */ String, /* params */ js.Array[String], String]] = js.undefined
}

object Icon {
  @scala.inline
  def apply(iconIdParser: (/* id */ String, /* params */ js.Array[String]) => CallbackTo[String] = null): Icon = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* params */ js.Array[java.lang.String]) => iconIdParser(t0, t1).runNow()))
    __obj.asInstanceOf[Icon]
  }
}

