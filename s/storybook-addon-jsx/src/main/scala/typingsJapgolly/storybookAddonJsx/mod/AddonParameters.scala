package typingsJapgolly.storybookAddonJsx.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddonParameters extends js.Object {
  var displayName: js.UndefOr[String | displayNameFunc] = js.undefined
  var enableBeautify: js.UndefOr[Boolean] = js.undefined
  var onBeforeRender: js.UndefOr[js.Function1[/* domString */ String, String]] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
}

object AddonParameters {
  @scala.inline
  def apply(
    displayName: String | displayNameFunc = null,
    enableBeautify: js.UndefOr[Boolean] = js.undefined,
    onBeforeRender: /* domString */ String => CallbackTo[String] = null,
    skip: Int | Double = null
  ): AddonParameters = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBeautify)) __obj.updateDynamic("enableBeautify")(enableBeautify.asInstanceOf[js.Any])
    if (onBeforeRender != null) __obj.updateDynamic("onBeforeRender")(js.Any.fromFunction1((t0: /* domString */ java.lang.String) => onBeforeRender(t0).runNow()))
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonParameters]
  }
}

