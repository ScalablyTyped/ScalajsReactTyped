package typingsJapgolly.ionicCore.alertInterfaceMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertButton extends js.Object {
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var handler: js.UndefOr[js.Function1[/* value */ js.Any, Boolean | Unit | StringDictionary[_]]] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var text: String
}

object AlertButton {
  @scala.inline
  def apply(
    text: String,
    cssClass: String | js.Array[String] = null,
    handler: /* value */ js.Any => CallbackTo[Boolean | Unit | StringDictionary[js.Any]] = null,
    role: String = null
  ): AlertButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1((t0: /* value */ js.Any) => handler(t0).runNow()))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertButton]
  }
}

