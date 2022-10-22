package typingsJapgolly.protractor.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.seleniumWebdriver.chromeMod.ServiceBuilder
import typingsJapgolly.seleniumWebdriver.remoteMod.DriverService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofchrome extends StObject {
  
  var Driver: TypeofDriverInstantiable
  
  var Options: TypeofOptions
  
  var ServiceBuilder: Instantiable0[typingsJapgolly.seleniumWebdriver.chromeMod.ServiceBuilder]
  
  def getDefaultService(): DriverService
  
  def locateSynchronously(): String | Null
  
  def setDefaultService(service: DriverService): Unit
}
object Typeofchrome {
  
  inline def apply(
    Driver: TypeofDriverInstantiable,
    Options: TypeofOptions,
    ServiceBuilder: Instantiable0[ServiceBuilder],
    getDefaultService: CallbackTo[DriverService],
    locateSynchronously: CallbackTo[String | Null],
    setDefaultService: DriverService => Callback
  ): Typeofchrome = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], ServiceBuilder = ServiceBuilder.asInstanceOf[js.Any], getDefaultService = getDefaultService.toJsFn, locateSynchronously = locateSynchronously.toJsFn, setDefaultService = js.Any.fromFunction1((t0: DriverService) => setDefaultService(t0).runNow()))
    __obj.asInstanceOf[Typeofchrome]
  }
  
  extension [Self <: Typeofchrome](x: Self) {
    
    inline def setDriver(value: TypeofDriverInstantiable): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultService(value: CallbackTo[DriverService]): Self = StObject.set(x, "getDefaultService", value.toJsFn)
    
    inline def setLocateSynchronously(value: CallbackTo[String | Null]): Self = StObject.set(x, "locateSynchronously", value.toJsFn)
    
    inline def setOptions(value: TypeofOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setServiceBuilder(value: Instantiable0[ServiceBuilder]): Self = StObject.set(x, "ServiceBuilder", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultService(value: DriverService => Callback): Self = StObject.set(x, "setDefaultService", js.Any.fromFunction1((t0: DriverService) => value(t0).runNow()))
  }
}
