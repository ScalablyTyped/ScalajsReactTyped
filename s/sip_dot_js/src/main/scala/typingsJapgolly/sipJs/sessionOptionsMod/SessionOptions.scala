package typingsJapgolly.sipJs.sessionOptionsMod

import typingsJapgolly.sipJs.sessionDelegateMod.SessionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var delegate: js.UndefOr[SessionDelegate] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(delegate: SessionDelegate = null): SessionOptions = {
    val __obj = js.Dynamic.literal()
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
}

