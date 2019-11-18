package typingsJapgolly.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayBalloonOptions extends js.Object {
  var content: String
  /**
    * -
    */
  var icon: js.UndefOr[NativeImage | String] = js.undefined
  var title: String
}

object DisplayBalloonOptions {
  @scala.inline
  def apply(content: String, title: String, icon: NativeImage | String = null): DisplayBalloonOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayBalloonOptions]
  }
}

