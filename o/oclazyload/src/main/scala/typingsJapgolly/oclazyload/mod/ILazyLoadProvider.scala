package typingsJapgolly.oclazyload.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILazyLoadProvider extends js.Object {
  /**
    * Configures the main service provider.
    * @param config The configuration settings to use
    */
  def config(config: IProviderConfig): Unit
}

object ILazyLoadProvider {
  @scala.inline
  def apply(config: IProviderConfig => Callback): ILazyLoadProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(js.Any.fromFunction1((t0: typingsJapgolly.oclazyload.mod.IProviderConfig) => config(t0).runNow()))
    __obj.asInstanceOf[ILazyLoadProvider]
  }
}

