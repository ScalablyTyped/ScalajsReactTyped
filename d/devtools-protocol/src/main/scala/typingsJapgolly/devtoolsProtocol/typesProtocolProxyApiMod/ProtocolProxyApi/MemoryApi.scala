package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Memory.GetAllTimeSamplingProfileResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Memory.GetBrowserSamplingProfileResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Memory.GetDOMCountersResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Memory.GetSamplingProfileResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Memory.SetPressureNotificationsSuppressedRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Memory.SimulatePressureNotificationRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Memory.StartSamplingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryApi extends StObject {
  
  /**
    * Simulate OomIntervention by purging V8 memory.
    */
  def forciblyPurgeJavaScriptMemory(): js.Promise[Unit]
  
  /**
    * Retrieve native memory allocations profile
    * collected since renderer process startup.
    */
  def getAllTimeSamplingProfile(): js.Promise[GetAllTimeSamplingProfileResponse]
  
  /**
    * Retrieve native memory allocations profile
    * collected since browser process startup.
    */
  def getBrowserSamplingProfile(): js.Promise[GetBrowserSamplingProfileResponse]
  
  def getDOMCounters(): js.Promise[GetDOMCountersResponse]
  
  /**
    * Retrieve native memory allocations profile collected since last
    * `startSampling` call.
    */
  def getSamplingProfile(): js.Promise[GetSamplingProfileResponse]
  
  def prepareForLeakDetection(): js.Promise[Unit]
  
  /**
    * Enable/disable suppressing memory pressure notifications in all processes.
    */
  def setPressureNotificationsSuppressed(params: SetPressureNotificationsSuppressedRequest): js.Promise[Unit]
  
  /**
    * Simulate a memory pressure notification in all processes.
    */
  def simulatePressureNotification(params: SimulatePressureNotificationRequest): js.Promise[Unit]
  
  /**
    * Start collecting native memory profile.
    */
  def startSampling(params: StartSamplingRequest): js.Promise[Unit]
  
  /**
    * Stop collecting native memory profile.
    */
  def stopSampling(): js.Promise[Unit]
}
object MemoryApi {
  
  inline def apply(
    forciblyPurgeJavaScriptMemory: CallbackTo[js.Promise[Unit]],
    getAllTimeSamplingProfile: CallbackTo[js.Promise[GetAllTimeSamplingProfileResponse]],
    getBrowserSamplingProfile: CallbackTo[js.Promise[GetBrowserSamplingProfileResponse]],
    getDOMCounters: CallbackTo[js.Promise[GetDOMCountersResponse]],
    getSamplingProfile: CallbackTo[js.Promise[GetSamplingProfileResponse]],
    prepareForLeakDetection: CallbackTo[js.Promise[Unit]],
    setPressureNotificationsSuppressed: SetPressureNotificationsSuppressedRequest => js.Promise[Unit],
    simulatePressureNotification: SimulatePressureNotificationRequest => js.Promise[Unit],
    startSampling: StartSamplingRequest => js.Promise[Unit],
    stopSampling: CallbackTo[js.Promise[Unit]]
  ): MemoryApi = {
    val __obj = js.Dynamic.literal(forciblyPurgeJavaScriptMemory = forciblyPurgeJavaScriptMemory.toJsFn, getAllTimeSamplingProfile = getAllTimeSamplingProfile.toJsFn, getBrowserSamplingProfile = getBrowserSamplingProfile.toJsFn, getDOMCounters = getDOMCounters.toJsFn, getSamplingProfile = getSamplingProfile.toJsFn, prepareForLeakDetection = prepareForLeakDetection.toJsFn, setPressureNotificationsSuppressed = js.Any.fromFunction1(setPressureNotificationsSuppressed), simulatePressureNotification = js.Any.fromFunction1(simulatePressureNotification), startSampling = js.Any.fromFunction1(startSampling), stopSampling = stopSampling.toJsFn)
    __obj.asInstanceOf[MemoryApi]
  }
  
  extension [Self <: MemoryApi](x: Self) {
    
    inline def setForciblyPurgeJavaScriptMemory(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "forciblyPurgeJavaScriptMemory", value.toJsFn)
    
    inline def setGetAllTimeSamplingProfile(value: CallbackTo[js.Promise[GetAllTimeSamplingProfileResponse]]): Self = StObject.set(x, "getAllTimeSamplingProfile", value.toJsFn)
    
    inline def setGetBrowserSamplingProfile(value: CallbackTo[js.Promise[GetBrowserSamplingProfileResponse]]): Self = StObject.set(x, "getBrowserSamplingProfile", value.toJsFn)
    
    inline def setGetDOMCounters(value: CallbackTo[js.Promise[GetDOMCountersResponse]]): Self = StObject.set(x, "getDOMCounters", value.toJsFn)
    
    inline def setGetSamplingProfile(value: CallbackTo[js.Promise[GetSamplingProfileResponse]]): Self = StObject.set(x, "getSamplingProfile", value.toJsFn)
    
    inline def setPrepareForLeakDetection(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "prepareForLeakDetection", value.toJsFn)
    
    inline def setSetPressureNotificationsSuppressed(value: SetPressureNotificationsSuppressedRequest => js.Promise[Unit]): Self = StObject.set(x, "setPressureNotificationsSuppressed", js.Any.fromFunction1(value))
    
    inline def setSimulatePressureNotification(value: SimulatePressureNotificationRequest => js.Promise[Unit]): Self = StObject.set(x, "simulatePressureNotification", js.Any.fromFunction1(value))
    
    inline def setStartSampling(value: StartSamplingRequest => js.Promise[Unit]): Self = StObject.set(x, "startSampling", js.Any.fromFunction1(value))
    
    inline def setStopSampling(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "stopSampling", value.toJsFn)
  }
}
