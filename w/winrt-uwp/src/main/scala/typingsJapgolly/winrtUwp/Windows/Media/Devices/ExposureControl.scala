package typingsJapgolly.winrtUwp.Windows.Media.Devices

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the exposure settings on a capture device. */
trait ExposureControl extends StObject {
  
  /** Gets a value that indicates if auto exposure is enabled. */
  var auto: Boolean
  
  /** Gets the maximum exposure time. */
  var max: Double
  
  /** Gets the minimum exposure time. */
  var min: Double
  
  /**
    * Asynchronously enables or disable auto exposure.
    * @param value Specifies whether or not to enable or disable auto exposure.
    * @return The object that is used to control the asynchronous operation.
    */
  def setAutoAsync(value: Boolean): IPromiseWithIAsyncAction
  
  /**
    * Asynchronously sets the exposure time.
    * @param shutterDuration The exposure time to set the Value property to. The minimum and maximum values are specified by Min and Max .
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(shutterDuration: Double): IPromiseWithIAsyncAction
  
  /** Gets the smallest exposure time increment supported by the capture device. */
  var step: Double
  
  /** Gets a value that specifies if the capture device supports the exposure control. */
  var supported: Boolean
  
  /** Gets the exposure time. */
  var value: Double
}
object ExposureControl {
  
  inline def apply(
    auto: Boolean,
    max: Double,
    min: Double,
    setAutoAsync: Boolean => IPromiseWithIAsyncAction,
    setValueAsync: Double => IPromiseWithIAsyncAction,
    step: Double,
    supported: Boolean,
    value: Double
  ): ExposureControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], setAutoAsync = js.Any.fromFunction1(setAutoAsync), setValueAsync = js.Any.fromFunction1(setValueAsync), step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposureControl]
  }
  
  extension [Self <: ExposureControl](x: Self) {
    
    inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setSetAutoAsync(value: Boolean => IPromiseWithIAsyncAction): Self = StObject.set(x, "setAutoAsync", js.Any.fromFunction1(value))
    
    inline def setSetValueAsync(value: Double => IPromiseWithIAsyncAction): Self = StObject.set(x, "setValueAsync", js.Any.fromFunction1(value))
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
