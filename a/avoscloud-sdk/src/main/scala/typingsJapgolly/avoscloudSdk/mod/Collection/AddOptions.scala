package typingsJapgolly.avoscloudSdk.mod.Collection

import typingsJapgolly.avoscloudSdk.mod.SilentOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends SilentOption {
  /**
    * The index at which to add the models.
    */
  var at: js.UndefOr[Double] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(at: Int | Double = null, silent: js.UndefOr[Boolean] = js.undefined): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOptions]
  }
}

