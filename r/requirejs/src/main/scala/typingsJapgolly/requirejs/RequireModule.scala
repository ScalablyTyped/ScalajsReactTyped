package typingsJapgolly.requirejs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// todo: not sure what to do with this guy
trait RequireModule extends js.Object {
  /**
  	*
  	**/
  def config(): js.Object
}

object RequireModule {
  @scala.inline
  def apply(config: CallbackTo[js.Object]): RequireModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config.toJsFn)
    __obj.asInstanceOf[RequireModule]
  }
}

