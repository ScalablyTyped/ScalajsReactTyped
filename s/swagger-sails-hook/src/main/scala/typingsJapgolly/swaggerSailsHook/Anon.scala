package typingsJapgolly.swaggerSailsHook

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  /**
  				 * This route will match any routes that aren't bound in the app via a custom route configuration
  				 * or a blueprint.
  				 */
  @JSName("/*")
  def SlashAsterisk(req: js.Any, res: js.Any, next: js.Function0[_]): js.Any
}

object Anon {
  @scala.inline
  def apply(SlashAsterisk: (js.Any, js.Any, js.Function0[js.Any]) => CallbackTo[js.Any]): Anon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SlashAsterisk")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Function0[js.Any]) => SlashAsterisk(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Anon]
  }
}

