package typingsJapgolly.protractor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.seleniumWebdriver.chromeMod.ServiceBuilder
import typingsJapgolly.seleniumWebdriver.remoteMod.DriverService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofchrome extends js.Object {
  var Driver: TypeofDriverInstantiable
  var Options: TypeofOptions
  var ServiceBuilder: Instantiable0[typingsJapgolly.seleniumWebdriver.chromeMod.ServiceBuilder]
  def getDefaultService(): DriverService
  def setDefaultService(service: DriverService): Unit
}

object Typeofchrome {
  @scala.inline
  def apply(
    Driver: TypeofDriverInstantiable,
    Options: TypeofOptions,
    ServiceBuilder: Instantiable0[ServiceBuilder],
    getDefaultService: CallbackTo[DriverService],
    setDefaultService: DriverService => Callback
  ): Typeofchrome = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], ServiceBuilder = ServiceBuilder.asInstanceOf[js.Any])
    __obj.updateDynamic("getDefaultService")(getDefaultService.toJsFn)
    __obj.updateDynamic("setDefaultService")(js.Any.fromFunction1((t0: typingsJapgolly.seleniumWebdriver.remoteMod.DriverService) => setDefaultService(t0).runNow()))
    __obj.asInstanceOf[Typeofchrome]
  }
}

