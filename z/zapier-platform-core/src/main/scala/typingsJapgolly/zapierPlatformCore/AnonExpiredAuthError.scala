package typingsJapgolly.zapierPlatformCore

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpiredAuthError extends js.Object {
  var ExpiredAuthError: Instantiable0[js.Error]
  var HaltedError: Instantiable0[js.Error]
  var RefreshAuthError: Instantiable0[js.Error]
}

object AnonExpiredAuthError {
  @scala.inline
  def apply(
    ExpiredAuthError: Instantiable0[js.Error],
    HaltedError: Instantiable0[js.Error],
    RefreshAuthError: Instantiable0[js.Error]
  ): AnonExpiredAuthError = {
    val __obj = js.Dynamic.literal(ExpiredAuthError = ExpiredAuthError.asInstanceOf[js.Any], HaltedError = HaltedError.asInstanceOf[js.Any], RefreshAuthError = RefreshAuthError.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpiredAuthError]
  }
}

