package typingsJapgolly.lusca.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait csrfOptionsBase extends js.Object {
  var impl: js.UndefOr[js.Function0[_]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
}

object csrfOptionsBase {
  @scala.inline
  def apply(impl: js.UndefOr[CallbackTo[js.Any]] = js.undefined, key: String = null, secret: String = null): csrfOptionsBase = {
    val __obj = js.Dynamic.literal()
    impl.foreach(p => __obj.updateDynamic("impl")(p.toJsFn))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[csrfOptionsBase]
  }
}

