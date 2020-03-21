package typingsJapgolly.neverbounce.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NeverBounce extends js.Object {
  var account: Account
  var errors: js.Error
  var jobs: Jobs
  var poe: Poe
  var single: Single
  def getConfig(): Config
  def getRequestOpts(opts: ConfigOptions): ConfigOptions
  def setApiKey(key: String): Unit
  def setHost(host: String): Unit
}

object NeverBounce {
  @scala.inline
  def apply(
    account: Account,
    errors: js.Error,
    getConfig: CallbackTo[Config],
    getRequestOpts: ConfigOptions => CallbackTo[ConfigOptions],
    jobs: Jobs,
    poe: Poe,
    setApiKey: String => Callback,
    setHost: String => Callback,
    single: Single
  ): NeverBounce = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], poe = poe.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any])
    __obj.updateDynamic("getConfig")(getConfig.toJsFn)
    __obj.updateDynamic("getRequestOpts")(js.Any.fromFunction1((t0: typingsJapgolly.neverbounce.mod.ConfigOptions) => getRequestOpts(t0).runNow()))
    __obj.updateDynamic("setApiKey")(js.Any.fromFunction1((t0: java.lang.String) => setApiKey(t0).runNow()))
    __obj.updateDynamic("setHost")(js.Any.fromFunction1((t0: java.lang.String) => setHost(t0).runNow()))
    __obj.asInstanceOf[NeverBounce]
  }
}

