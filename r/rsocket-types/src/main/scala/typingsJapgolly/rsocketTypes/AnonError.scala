package typingsJapgolly.rsocketTypes

import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typingsJapgolly.rsocketTypes.rsocketTypesStrings.ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends ConnectionStatus {
  var error: js.Error
  var kind: ERROR
}

object AnonError {
  @scala.inline
  def apply(error: js.Error, kind: ERROR): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonError]
  }
}

