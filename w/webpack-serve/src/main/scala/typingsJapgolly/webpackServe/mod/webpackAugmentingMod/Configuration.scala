package typingsJapgolly.webpackServe.mod.webpackAugmentingMod

import typingsJapgolly.webpackServe.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var serve: js.UndefOr[Options] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(serve: Options = null): Configuration = {
    val __obj = js.Dynamic.literal()
    if (serve != null) __obj.updateDynamic("serve")(serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

