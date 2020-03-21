package typingsJapgolly.autoprefixer.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.autoprefixer.AnonBrowsers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportedAPI extends js.Object {
  /** Autoprefixer data */
  var data: AnonBrowsers
  /** Autoprefixer default browsers */
  var defaults: js.Any
  /** Inspect with default Autoprefixer */
  def info(): Unit
}

object ExportedAPI {
  @scala.inline
  def apply(data: AnonBrowsers, defaults: js.Any, info: Callback): ExportedAPI = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
    __obj.updateDynamic("info")(info.toJsFn)
    __obj.asInstanceOf[ExportedAPI]
  }
}

