package typingsJapgolly.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyEnvironmentParameters extends js.Object {
  var env: js.UndefOr[String] = js.undefined
  var runner: js.UndefOr[String] = js.undefined
}

object IWallabyEnvironmentParameters {
  @scala.inline
  def apply(env: String = null, runner: String = null): IWallabyEnvironmentParameters = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (runner != null) __obj.updateDynamic("runner")(runner.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyEnvironmentParameters]
  }
}

