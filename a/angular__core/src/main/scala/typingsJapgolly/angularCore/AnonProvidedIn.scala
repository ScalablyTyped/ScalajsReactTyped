package typingsJapgolly.angularCore

import typingsJapgolly.angularCore.angularCoreStrings.root
import typingsJapgolly.angularCore.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProvidedIn extends js.Object {
  var providedIn: Type[_] | root | Null
}

object AnonProvidedIn {
  @scala.inline
  def apply(providedIn: Type[_] | root = null): AnonProvidedIn = {
    val __obj = js.Dynamic.literal()
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProvidedIn]
  }
}

