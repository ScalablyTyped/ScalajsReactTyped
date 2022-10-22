package typingsJapgolly.winrtUwp.Windows.Networking.XboxLive

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
trait XboxLiveQualityOfServiceMeasurement extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var deviceAddresses: IVector[XboxLiveDeviceAddress]
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param metric This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getMetricResult(deviceAddress: XboxLiveDeviceAddress, metric: XboxLiveQualityOfServiceMetric): XboxLiveQualityOfServiceMetricResult
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getMetricResultsForDevice(deviceAddress: XboxLiveDeviceAddress): IVectorView[XboxLiveQualityOfServiceMetricResult]
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param metric This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getMetricResultsForMetric(metric: XboxLiveQualityOfServiceMetric): IVectorView[XboxLiveQualityOfServiceMetricResult]
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getPrivatePayloadResult(deviceAddress: XboxLiveDeviceAddress): XboxLiveQualityOfServicePrivatePayloadResult
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def measureAsync(): IPromiseWithIAsyncAction
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var metricResults: IVectorView[XboxLiveQualityOfServiceMetricResult]
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var metrics: IVector[XboxLiveQualityOfServiceMetric]
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var numberOfProbesToAttempt: Double
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var numberOfResultsPending: Double
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var privatePayloadResults: IVectorView[XboxLiveQualityOfServicePrivatePayloadResult]
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var shouldRequestPrivatePayloads: Boolean
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var timeoutInMilliseconds: Double
}
object XboxLiveQualityOfServiceMeasurement {
  
  inline def apply(
    deviceAddresses: IVector[XboxLiveDeviceAddress],
    getMetricResult: (XboxLiveDeviceAddress, XboxLiveQualityOfServiceMetric) => XboxLiveQualityOfServiceMetricResult,
    getMetricResultsForDevice: XboxLiveDeviceAddress => IVectorView[XboxLiveQualityOfServiceMetricResult],
    getMetricResultsForMetric: XboxLiveQualityOfServiceMetric => IVectorView[XboxLiveQualityOfServiceMetricResult],
    getPrivatePayloadResult: XboxLiveDeviceAddress => XboxLiveQualityOfServicePrivatePayloadResult,
    measureAsync: CallbackTo[IPromiseWithIAsyncAction],
    metricResults: IVectorView[XboxLiveQualityOfServiceMetricResult],
    metrics: IVector[XboxLiveQualityOfServiceMetric],
    numberOfProbesToAttempt: Double,
    numberOfResultsPending: Double,
    privatePayloadResults: IVectorView[XboxLiveQualityOfServicePrivatePayloadResult],
    shouldRequestPrivatePayloads: Boolean,
    timeoutInMilliseconds: Double
  ): XboxLiveQualityOfServiceMeasurement = {
    val __obj = js.Dynamic.literal(deviceAddresses = deviceAddresses.asInstanceOf[js.Any], getMetricResult = js.Any.fromFunction2(getMetricResult), getMetricResultsForDevice = js.Any.fromFunction1(getMetricResultsForDevice), getMetricResultsForMetric = js.Any.fromFunction1(getMetricResultsForMetric), getPrivatePayloadResult = js.Any.fromFunction1(getPrivatePayloadResult), measureAsync = measureAsync.toJsFn, metricResults = metricResults.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], numberOfProbesToAttempt = numberOfProbesToAttempt.asInstanceOf[js.Any], numberOfResultsPending = numberOfResultsPending.asInstanceOf[js.Any], privatePayloadResults = privatePayloadResults.asInstanceOf[js.Any], shouldRequestPrivatePayloads = shouldRequestPrivatePayloads.asInstanceOf[js.Any], timeoutInMilliseconds = timeoutInMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveQualityOfServiceMeasurement]
  }
  
  extension [Self <: XboxLiveQualityOfServiceMeasurement](x: Self) {
    
    inline def setDeviceAddresses(value: IVector[XboxLiveDeviceAddress]): Self = StObject.set(x, "deviceAddresses", value.asInstanceOf[js.Any])
    
    inline def setGetMetricResult(
      value: (XboxLiveDeviceAddress, XboxLiveQualityOfServiceMetric) => XboxLiveQualityOfServiceMetricResult
    ): Self = StObject.set(x, "getMetricResult", js.Any.fromFunction2(value))
    
    inline def setGetMetricResultsForDevice(value: XboxLiveDeviceAddress => IVectorView[XboxLiveQualityOfServiceMetricResult]): Self = StObject.set(x, "getMetricResultsForDevice", js.Any.fromFunction1(value))
    
    inline def setGetMetricResultsForMetric(value: XboxLiveQualityOfServiceMetric => IVectorView[XboxLiveQualityOfServiceMetricResult]): Self = StObject.set(x, "getMetricResultsForMetric", js.Any.fromFunction1(value))
    
    inline def setGetPrivatePayloadResult(value: XboxLiveDeviceAddress => XboxLiveQualityOfServicePrivatePayloadResult): Self = StObject.set(x, "getPrivatePayloadResult", js.Any.fromFunction1(value))
    
    inline def setMeasureAsync(value: CallbackTo[IPromiseWithIAsyncAction]): Self = StObject.set(x, "measureAsync", value.toJsFn)
    
    inline def setMetricResults(value: IVectorView[XboxLiveQualityOfServiceMetricResult]): Self = StObject.set(x, "metricResults", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: IVector[XboxLiveQualityOfServiceMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setNumberOfProbesToAttempt(value: Double): Self = StObject.set(x, "numberOfProbesToAttempt", value.asInstanceOf[js.Any])
    
    inline def setNumberOfResultsPending(value: Double): Self = StObject.set(x, "numberOfResultsPending", value.asInstanceOf[js.Any])
    
    inline def setPrivatePayloadResults(value: IVectorView[XboxLiveQualityOfServicePrivatePayloadResult]): Self = StObject.set(x, "privatePayloadResults", value.asInstanceOf[js.Any])
    
    inline def setShouldRequestPrivatePayloads(value: Boolean): Self = StObject.set(x, "shouldRequestPrivatePayloads", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMilliseconds(value: Double): Self = StObject.set(x, "timeoutInMilliseconds", value.asInstanceOf[js.Any])
  }
}
