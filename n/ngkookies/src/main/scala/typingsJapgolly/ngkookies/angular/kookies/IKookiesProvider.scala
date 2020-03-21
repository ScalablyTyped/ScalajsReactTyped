package typingsJapgolly.ngkookies.angular.kookies

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKookiesProvider extends js.Object {
  var config: Config
  var defaults: Options
  def setConfig(config: Config): Unit
  def setDefaults(options: Options): Unit
}

object IKookiesProvider {
  @scala.inline
  def apply(config: Config, defaults: Options, setConfig: Config => Callback, setDefaults: Options => Callback): IKookiesProvider = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
    __obj.updateDynamic("setConfig")(js.Any.fromFunction1((t0: typingsJapgolly.ngkookies.angular.kookies.Config) => setConfig(t0).runNow()))
    __obj.updateDynamic("setDefaults")(js.Any.fromFunction1((t0: typingsJapgolly.ngkookies.angular.kookies.Options) => setDefaults(t0).runNow()))
    __obj.asInstanceOf[IKookiesProvider]
  }
}

