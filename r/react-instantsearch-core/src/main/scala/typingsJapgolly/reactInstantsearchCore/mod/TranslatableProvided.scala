package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslatableProvided extends js.Object {
  def translate(key: String, params: js.Any*): String
}

object TranslatableProvided {
  @scala.inline
  def apply(translate: (String, /* repeated */ js.Any) => CallbackTo[String]): TranslatableProvided = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("translate")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => translate(t0, t1).runNow()))
    __obj.asInstanceOf[TranslatableProvided]
  }
}

