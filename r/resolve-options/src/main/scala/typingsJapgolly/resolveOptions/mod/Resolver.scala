package typingsJapgolly.resolveOptions.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  def resolve(key: String): js.UndefOr[Double | String | Boolean | js.Date | Null]
}

object Resolver {
  @scala.inline
  def apply(resolve: String => CallbackTo[js.UndefOr[Double | String | Boolean | js.Date | Null]]): Resolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: java.lang.String) => resolve(t0).runNow()))
    __obj.asInstanceOf[Resolver]
  }
}

