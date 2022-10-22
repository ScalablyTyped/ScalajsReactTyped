package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.virtualTimeBudgetExpired
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.CanEmulateResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetAutoDarkModeOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetAutomationOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetCPUThrottlingRateRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetDefaultBackgroundColorOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetDeviceMetricsOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetDisabledImageTypesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetDocumentCookieDisabledRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetEmitTouchEventsForMouseRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetEmulatedMediaRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetEmulatedVisionDeficiencyRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetFocusEmulationEnabledRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetGeolocationOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetHardwareConcurrencyOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetIdleOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetLocaleOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetNavigatorOverridesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetPageScaleFactorRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetScriptExecutionDisabledRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetScrollbarsHiddenRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetTimezoneOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetTouchEmulationEnabledRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetUserAgentOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetVirtualTimePolicyRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetVirtualTimePolicyResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetVisibleSizeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmulationApi extends StObject {
  
  /**
    * Tells whether emulation is supported.
    */
  def canEmulate(): js.Promise[CanEmulateResponse]
  
  /**
    * Clears the overridden device metrics.
    */
  def clearDeviceMetricsOverride(): js.Promise[Unit]
  
  /**
    * Clears the overridden Geolocation Position and Error.
    */
  def clearGeolocationOverride(): js.Promise[Unit]
  
  /**
    * Clears Idle state overrides.
    */
  def clearIdleOverride(): js.Promise[Unit]
  
  /**
    * Notification sent after the virtual time budget for the current VirtualTimePolicy has run out.
    */
  @JSName("on")
  def on_virtualTimeBudgetExpired(event: virtualTimeBudgetExpired, listener: js.Function0[Unit]): Unit
  
  /**
    * Requests that page scale factor is reset to initial values.
    */
  def resetPageScaleFactor(): js.Promise[Unit]
  
  /**
    * Automatically render all web contents using a dark theme.
    */
  def setAutoDarkModeOverride(params: SetAutoDarkModeOverrideRequest): js.Promise[Unit]
  
  /**
    * Allows overriding the automation flag.
    */
  def setAutomationOverride(params: SetAutomationOverrideRequest): js.Promise[Unit]
  
  /**
    * Enables CPU throttling to emulate slow CPUs.
    */
  def setCPUThrottlingRate(params: SetCPUThrottlingRateRequest): js.Promise[Unit]
  
  /**
    * Sets or clears an override of the default background color of the frame. This override is used
    * if the content does not specify one.
    */
  def setDefaultBackgroundColorOverride(params: SetDefaultBackgroundColorOverrideRequest): js.Promise[Unit]
  
  /**
    * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
    * window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
    * query results).
    */
  def setDeviceMetricsOverride(params: SetDeviceMetricsOverrideRequest): js.Promise[Unit]
  
  def setDisabledImageTypes(params: SetDisabledImageTypesRequest): js.Promise[Unit]
  
  def setDocumentCookieDisabled(params: SetDocumentCookieDisabledRequest): js.Promise[Unit]
  
  def setEmitTouchEventsForMouse(params: SetEmitTouchEventsForMouseRequest): js.Promise[Unit]
  
  /**
    * Emulates the given media type or media feature for CSS media queries.
    */
  def setEmulatedMedia(params: SetEmulatedMediaRequest): js.Promise[Unit]
  
  /**
    * Emulates the given vision deficiency.
    */
  def setEmulatedVisionDeficiency(params: SetEmulatedVisionDeficiencyRequest): js.Promise[Unit]
  
  /**
    * Enables or disables simulating a focused and active page.
    */
  def setFocusEmulationEnabled(params: SetFocusEmulationEnabledRequest): js.Promise[Unit]
  
  /**
    * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
    * unavailable.
    */
  def setGeolocationOverride(params: SetGeolocationOverrideRequest): js.Promise[Unit]
  
  def setHardwareConcurrencyOverride(params: SetHardwareConcurrencyOverrideRequest): js.Promise[Unit]
  
  /**
    * Overrides the Idle state.
    */
  def setIdleOverride(params: SetIdleOverrideRequest): js.Promise[Unit]
  
  /**
    * Overrides default host system locale with the specified one.
    */
  def setLocaleOverride(params: SetLocaleOverrideRequest): js.Promise[Unit]
  
  /**
    * Overrides value returned by the javascript navigator object.
    */
  def setNavigatorOverrides(params: SetNavigatorOverridesRequest): js.Promise[Unit]
  
  /**
    * Sets a specified page scale factor.
    */
  def setPageScaleFactor(params: SetPageScaleFactorRequest): js.Promise[Unit]
  
  /**
    * Switches script execution in the page.
    */
  def setScriptExecutionDisabled(params: SetScriptExecutionDisabledRequest): js.Promise[Unit]
  
  def setScrollbarsHidden(params: SetScrollbarsHiddenRequest): js.Promise[Unit]
  
  /**
    * Overrides default host system timezone with the specified one.
    */
  def setTimezoneOverride(params: SetTimezoneOverrideRequest): js.Promise[Unit]
  
  /**
    * Enables touch on platforms which do not support them.
    */
  def setTouchEmulationEnabled(params: SetTouchEmulationEnabledRequest): js.Promise[Unit]
  
  /**
    * Allows overriding user agent with the given string.
    */
  def setUserAgentOverride(params: SetUserAgentOverrideRequest): js.Promise[Unit]
  
  /**
    * Turns on virtual time for all frames (replacing real-time with a synthetic time source) and sets
    * the current virtual time policy.  Note this supersedes any previous time budget.
    */
  def setVirtualTimePolicy(params: SetVirtualTimePolicyRequest): js.Promise[SetVirtualTimePolicyResponse]
  
  /**
    * Resizes the frame/viewport of the page. Note that this does not affect the frame's container
    * (e.g. browser window). Can be used to produce screenshots of the specified size. Not supported
    * on Android.
    */
  def setVisibleSize(params: SetVisibleSizeRequest): js.Promise[Unit]
}
object EmulationApi {
  
  inline def apply(
    canEmulate: CallbackTo[js.Promise[CanEmulateResponse]],
    clearDeviceMetricsOverride: CallbackTo[js.Promise[Unit]],
    clearGeolocationOverride: CallbackTo[js.Promise[Unit]],
    clearIdleOverride: CallbackTo[js.Promise[Unit]],
    on: (virtualTimeBudgetExpired, js.Function0[Unit]) => Callback,
    resetPageScaleFactor: CallbackTo[js.Promise[Unit]],
    setAutoDarkModeOverride: SetAutoDarkModeOverrideRequest => js.Promise[Unit],
    setAutomationOverride: SetAutomationOverrideRequest => js.Promise[Unit],
    setCPUThrottlingRate: SetCPUThrottlingRateRequest => js.Promise[Unit],
    setDefaultBackgroundColorOverride: SetDefaultBackgroundColorOverrideRequest => js.Promise[Unit],
    setDeviceMetricsOverride: SetDeviceMetricsOverrideRequest => js.Promise[Unit],
    setDisabledImageTypes: SetDisabledImageTypesRequest => js.Promise[Unit],
    setDocumentCookieDisabled: SetDocumentCookieDisabledRequest => js.Promise[Unit],
    setEmitTouchEventsForMouse: SetEmitTouchEventsForMouseRequest => js.Promise[Unit],
    setEmulatedMedia: SetEmulatedMediaRequest => js.Promise[Unit],
    setEmulatedVisionDeficiency: SetEmulatedVisionDeficiencyRequest => js.Promise[Unit],
    setFocusEmulationEnabled: SetFocusEmulationEnabledRequest => js.Promise[Unit],
    setGeolocationOverride: SetGeolocationOverrideRequest => js.Promise[Unit],
    setHardwareConcurrencyOverride: SetHardwareConcurrencyOverrideRequest => js.Promise[Unit],
    setIdleOverride: SetIdleOverrideRequest => js.Promise[Unit],
    setLocaleOverride: SetLocaleOverrideRequest => js.Promise[Unit],
    setNavigatorOverrides: SetNavigatorOverridesRequest => js.Promise[Unit],
    setPageScaleFactor: SetPageScaleFactorRequest => js.Promise[Unit],
    setScriptExecutionDisabled: SetScriptExecutionDisabledRequest => js.Promise[Unit],
    setScrollbarsHidden: SetScrollbarsHiddenRequest => js.Promise[Unit],
    setTimezoneOverride: SetTimezoneOverrideRequest => js.Promise[Unit],
    setTouchEmulationEnabled: SetTouchEmulationEnabledRequest => js.Promise[Unit],
    setUserAgentOverride: SetUserAgentOverrideRequest => js.Promise[Unit],
    setVirtualTimePolicy: SetVirtualTimePolicyRequest => js.Promise[SetVirtualTimePolicyResponse],
    setVisibleSize: SetVisibleSizeRequest => js.Promise[Unit]
  ): EmulationApi = {
    val __obj = js.Dynamic.literal(canEmulate = canEmulate.toJsFn, clearDeviceMetricsOverride = clearDeviceMetricsOverride.toJsFn, clearGeolocationOverride = clearGeolocationOverride.toJsFn, clearIdleOverride = clearIdleOverride.toJsFn, on = js.Any.fromFunction2((t0: virtualTimeBudgetExpired, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), resetPageScaleFactor = resetPageScaleFactor.toJsFn, setAutoDarkModeOverride = js.Any.fromFunction1(setAutoDarkModeOverride), setAutomationOverride = js.Any.fromFunction1(setAutomationOverride), setCPUThrottlingRate = js.Any.fromFunction1(setCPUThrottlingRate), setDefaultBackgroundColorOverride = js.Any.fromFunction1(setDefaultBackgroundColorOverride), setDeviceMetricsOverride = js.Any.fromFunction1(setDeviceMetricsOverride), setDisabledImageTypes = js.Any.fromFunction1(setDisabledImageTypes), setDocumentCookieDisabled = js.Any.fromFunction1(setDocumentCookieDisabled), setEmitTouchEventsForMouse = js.Any.fromFunction1(setEmitTouchEventsForMouse), setEmulatedMedia = js.Any.fromFunction1(setEmulatedMedia), setEmulatedVisionDeficiency = js.Any.fromFunction1(setEmulatedVisionDeficiency), setFocusEmulationEnabled = js.Any.fromFunction1(setFocusEmulationEnabled), setGeolocationOverride = js.Any.fromFunction1(setGeolocationOverride), setHardwareConcurrencyOverride = js.Any.fromFunction1(setHardwareConcurrencyOverride), setIdleOverride = js.Any.fromFunction1(setIdleOverride), setLocaleOverride = js.Any.fromFunction1(setLocaleOverride), setNavigatorOverrides = js.Any.fromFunction1(setNavigatorOverrides), setPageScaleFactor = js.Any.fromFunction1(setPageScaleFactor), setScriptExecutionDisabled = js.Any.fromFunction1(setScriptExecutionDisabled), setScrollbarsHidden = js.Any.fromFunction1(setScrollbarsHidden), setTimezoneOverride = js.Any.fromFunction1(setTimezoneOverride), setTouchEmulationEnabled = js.Any.fromFunction1(setTouchEmulationEnabled), setUserAgentOverride = js.Any.fromFunction1(setUserAgentOverride), setVirtualTimePolicy = js.Any.fromFunction1(setVirtualTimePolicy), setVisibleSize = js.Any.fromFunction1(setVisibleSize))
    __obj.asInstanceOf[EmulationApi]
  }
  
  extension [Self <: EmulationApi](x: Self) {
    
    inline def setCanEmulate(value: CallbackTo[js.Promise[CanEmulateResponse]]): Self = StObject.set(x, "canEmulate", value.toJsFn)
    
    inline def setClearDeviceMetricsOverride(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clearDeviceMetricsOverride", value.toJsFn)
    
    inline def setClearGeolocationOverride(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clearGeolocationOverride", value.toJsFn)
    
    inline def setClearIdleOverride(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clearIdleOverride", value.toJsFn)
    
    inline def setOn(value: (virtualTimeBudgetExpired, js.Function0[Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: virtualTimeBudgetExpired, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setResetPageScaleFactor(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "resetPageScaleFactor", value.toJsFn)
    
    inline def setSetAutoDarkModeOverride(value: SetAutoDarkModeOverrideRequest => js.Promise[Unit]): Self = StObject.set(x, "setAutoDarkModeOverride", js.Any.fromFunction1(value))
    
    inline def setSetAutomationOverride(value: SetAutomationOverrideRequest => js.Promise[Unit]): Self = StObject.set(x, "setAutomationOverride", js.Any.fromFunction1(value))
    
    inline def setSetCPUThrottlingRate(value: SetCPUThrottlingRateRequest => js.Promise[Unit]): Self = StObject.set(x, "setCPUThrottlingRate", js.Any.fromFunction1(value))
    
    inline def setSetDefaultBackgroundColorOverride(value: SetDefaultBackgroundColorOverrideRequest => js.Promise[Unit]): Self = StObject.set(x, "setDefaultBackgroundColorOverride", js.Any.fromFunction1(value))
    
    inline def setSetDeviceMetricsOverride(value: SetDeviceMetricsOverrideRequest => js.Promise[Unit]): Self = StObject.set(x, "setDeviceMetricsOverride", js.Any.fromFunction1(value))
    
    inline def setSetDisabledImageTypes(value: SetDisabledImageTypesRequest => js.Promise[Unit]): Self = StObject.set(x, "setDisabledImageTypes", js.Any.fromFunction1(value))
    
    inline def setSetDocumentCookieDisabled(value: SetDocumentCookieDisabledRequest => js.Promise[Unit]): Self = StObject.set(x, "setDocumentCookieDisabled", js.Any.fromFunction1(value))
    
    inline def setSetEmitTouchEventsForMouse(value: SetEmitTouchEventsForMouseRequest => js.Promise[Unit]): Self = StObject.set(x, "setEmitTouchEventsForMouse", js.Any.fromFunction1(value))
    
    inline def setSetEmulatedMedia(value: SetEmulatedMediaRequest => js.Promise[Unit]): Self = StObject.set(x, "setEmulatedMedia", js.Any.fromFunction1(value))
    
    inline def setSetEmulatedVisionDeficiency(value: SetEmulatedVisionDeficiencyRequest => js.Promise[Unit]): Self = StObject.set(x, "setEmulatedVisionDeficiency", js.Any.fromFunction1(value))
    
    inline def setSetFocusEmulationEnabled(value: SetFocusEmulationEnabledRequest => js.Promise[Unit]): Self = StObject.set(x, "setFocusEmulationEnabled", js.Any.fromFunction1(value))
    
    inline def setSetGeolocationOverride(value: SetGeolocationOverrideRequest => js.Promise[Unit]): Self = StObject.set(x, "setGeolocationOverride", js.Any.fromFunction1(value))
    
    inline def setSetHardwareConcurrencyOverride(value: SetHardwareConcurrencyOverrideRequest => js.Promise[Unit]): Self = StObject.set(x, "setHardwareConcurrencyOverride", js.Any.fromFunction1(value))
    
    inline def setSetIdleOverride(value: SetIdleOverrideRequest => js.Promise[Unit]): Self = StObject.set(x, "setIdleOverride", js.Any.fromFunction1(value))
    
    inline def setSetLocaleOverride(value: SetLocaleOverrideRequest => js.Promise[Unit]): Self = StObject.set(x, "setLocaleOverride", js.Any.fromFunction1(value))
    
    inline def setSetNavigatorOverrides(value: SetNavigatorOverridesRequest => js.Promise[Unit]): Self = StObject.set(x, "setNavigatorOverrides", js.Any.fromFunction1(value))
    
    inline def setSetPageScaleFactor(value: SetPageScaleFactorRequest => js.Promise[Unit]): Self = StObject.set(x, "setPageScaleFactor", js.Any.fromFunction1(value))
    
    inline def setSetScriptExecutionDisabled(value: SetScriptExecutionDisabledRequest => js.Promise[Unit]): Self = StObject.set(x, "setScriptExecutionDisabled", js.Any.fromFunction1(value))
    
    inline def setSetScrollbarsHidden(value: SetScrollbarsHiddenRequest => js.Promise[Unit]): Self = StObject.set(x, "setScrollbarsHidden", js.Any.fromFunction1(value))
    
    inline def setSetTimezoneOverride(value: SetTimezoneOverrideRequest => js.Promise[Unit]): Self = StObject.set(x, "setTimezoneOverride", js.Any.fromFunction1(value))
    
    inline def setSetTouchEmulationEnabled(value: SetTouchEmulationEnabledRequest => js.Promise[Unit]): Self = StObject.set(x, "setTouchEmulationEnabled", js.Any.fromFunction1(value))
    
    inline def setSetUserAgentOverride(value: SetUserAgentOverrideRequest => js.Promise[Unit]): Self = StObject.set(x, "setUserAgentOverride", js.Any.fromFunction1(value))
    
    inline def setSetVirtualTimePolicy(value: SetVirtualTimePolicyRequest => js.Promise[SetVirtualTimePolicyResponse]): Self = StObject.set(x, "setVirtualTimePolicy", js.Any.fromFunction1(value))
    
    inline def setSetVisibleSize(value: SetVisibleSizeRequest => js.Promise[Unit]): Self = StObject.set(x, "setVisibleSize", js.Any.fromFunction1(value))
  }
}
