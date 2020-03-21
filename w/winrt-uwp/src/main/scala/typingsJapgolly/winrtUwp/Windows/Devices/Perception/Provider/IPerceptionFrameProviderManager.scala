package typingsJapgolly.winrtUwp.Windows.Devices.Perception.Provider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The IPerceptionFrameProviderManager is expected to provide any IPerceptionFrameProvider that has been registered via PerceptionFrameProviderManagerService::RegisterFrameProviderInfo(). */
trait IPerceptionFrameProviderManager extends IClosable {
  /**
    * The method to request an IPerceptionFrameProvider associated with a registered PerceptionFrameProviderInfo.
    * @param frameProviderInfo The info specifying the desired IPerceptionFrameProvider.
    * @return The associated IPerceptionFrameProvider, or nullptr if there is no such registerd provider.
    */
  def getFrameProvider(frameProviderInfo: PerceptionFrameProviderInfo): IPerceptionFrameProvider
}

object IPerceptionFrameProviderManager {
  @scala.inline
  def apply(
    close: Callback,
    getFrameProvider: PerceptionFrameProviderInfo => CallbackTo[IPerceptionFrameProvider]
  ): IPerceptionFrameProviderManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("getFrameProvider")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrameProviderInfo) => getFrameProvider(t0).runNow()))
    __obj.asInstanceOf[IPerceptionFrameProviderManager]
  }
}

