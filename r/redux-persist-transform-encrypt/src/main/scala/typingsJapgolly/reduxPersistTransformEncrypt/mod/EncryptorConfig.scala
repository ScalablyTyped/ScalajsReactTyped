package typingsJapgolly.reduxPersistTransformEncrypt.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptorConfig extends js.Object {
  var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  var secretKey: String
}

object EncryptorConfig {
  @scala.inline
  def apply(secretKey: String, onError: /* err */ js.Error => Callback = null): EncryptorConfig = {
    val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ js.Error) => onError(t0).runNow()))
    __obj.asInstanceOf[EncryptorConfig]
  }
}

