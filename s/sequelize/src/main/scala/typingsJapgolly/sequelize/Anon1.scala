package typingsJapgolly.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(logging: Boolean | js.Function = null): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

