package typingsJapgolly.fluentReact.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactLocalizationNotification extends js.Object {
  def relocalize(): Unit
}

object ReactLocalizationNotification {
  @scala.inline
  def apply(relocalize: Callback): ReactLocalizationNotification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("relocalize")(relocalize.toJsFn)
    __obj.asInstanceOf[ReactLocalizationNotification]
  }
}

