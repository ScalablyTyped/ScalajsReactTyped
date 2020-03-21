package typingsJapgolly.winrtUwp.Windows.Devices.Adc.Provider

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents methods common to all ADC providers. */
trait IAdcProvider extends js.Object {
  /**
    * Gets the ADC controllers available on the system.
    * @return When this method completes it returns a list of all the available controllers on the system.
    */
  def getControllers(): IVectorView[IAdcControllerProvider]
}

object IAdcProvider {
  @scala.inline
  def apply(getControllers: CallbackTo[IVectorView[IAdcControllerProvider]]): IAdcProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getControllers")(getControllers.toJsFn)
    __obj.asInstanceOf[IAdcProvider]
  }
}

