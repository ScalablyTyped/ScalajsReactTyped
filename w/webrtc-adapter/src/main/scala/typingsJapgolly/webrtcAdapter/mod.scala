package typingsJapgolly.webrtcAdapter

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.MediaStreamConstraints
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("webrtc-adapter", JSImport.Default)
  @js.native
  val default: IAdapter = js.native
  
  trait IAdapter extends StObject {
    
    var browserDetails: IBrowserDetails
    
    var browserShim: js.UndefOr[IChromeShim | IFirefoxShim | ISafariShim] = js.undefined
    
    var commonShim: ICommonShim
    
    def disableLog(disable: Boolean): Unit
    
    def disableWarnings(disable: Boolean): Unit
    
    def extractVersion(uastring: String, expr: String, pos: Double): Double
  }
  object IAdapter {
    
    inline def apply(
      browserDetails: IBrowserDetails,
      commonShim: ICommonShim,
      disableLog: Boolean => Callback,
      disableWarnings: Boolean => Callback,
      extractVersion: (String, String, Double) => Double
    ): IAdapter = {
      val __obj = js.Dynamic.literal(browserDetails = browserDetails.asInstanceOf[js.Any], commonShim = commonShim.asInstanceOf[js.Any], disableLog = js.Any.fromFunction1((t0: Boolean) => disableLog(t0).runNow()), disableWarnings = js.Any.fromFunction1((t0: Boolean) => disableWarnings(t0).runNow()), extractVersion = js.Any.fromFunction3(extractVersion))
      __obj.asInstanceOf[IAdapter]
    }
    
    extension [Self <: IAdapter](x: Self) {
      
      inline def setBrowserDetails(value: IBrowserDetails): Self = StObject.set(x, "browserDetails", value.asInstanceOf[js.Any])
      
      inline def setBrowserShim(value: IChromeShim | IFirefoxShim | ISafariShim): Self = StObject.set(x, "browserShim", value.asInstanceOf[js.Any])
      
      inline def setBrowserShimUndefined: Self = StObject.set(x, "browserShim", js.undefined)
      
      inline def setCommonShim(value: ICommonShim): Self = StObject.set(x, "commonShim", value.asInstanceOf[js.Any])
      
      inline def setDisableLog(value: Boolean => Callback): Self = StObject.set(x, "disableLog", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setDisableWarnings(value: Boolean => Callback): Self = StObject.set(x, "disableWarnings", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setExtractVersion(value: (String, String, Double) => Double): Self = StObject.set(x, "extractVersion", js.Any.fromFunction3(value))
    }
  }
  
  trait IBrowserDetails extends StObject {
    
    var browser: String
    
    var supportsUnifiedPlan: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object IBrowserDetails {
    
    inline def apply(browser: String): IBrowserDetails = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBrowserDetails]
    }
    
    extension [Self <: IBrowserDetails](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setSupportsUnifiedPlan(value: Boolean): Self = StObject.set(x, "supportsUnifiedPlan", value.asInstanceOf[js.Any])
      
      inline def setSupportsUnifiedPlanUndefined: Self = StObject.set(x, "supportsUnifiedPlan", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait IChromeShim extends StObject {
    
    def fixNegotiationNeeded(window: Window): Unit
    
    def shimAddTrackRemoveTrack(window: Window): Unit
    
    def shimAddTrackRemoveTrackWithNative(window: Window): Unit
    
    def shimGetSendersWithDtmf(window: Window): Unit
    
    def shimGetStats(window: Window): Unit
    
    def shimMediaStream(window: Window): Unit
    
    def shimOnTrack(window: Window): Unit
    
    def shimPeerConnection(window: Window): Unit
    
    def shimSenderReceiverGetStats(window: Window): Unit
  }
  object IChromeShim {
    
    inline def apply(
      fixNegotiationNeeded: Window => Callback,
      shimAddTrackRemoveTrack: Window => Callback,
      shimAddTrackRemoveTrackWithNative: Window => Callback,
      shimGetSendersWithDtmf: Window => Callback,
      shimGetStats: Window => Callback,
      shimMediaStream: Window => Callback,
      shimOnTrack: Window => Callback,
      shimPeerConnection: Window => Callback,
      shimSenderReceiverGetStats: Window => Callback
    ): IChromeShim = {
      val __obj = js.Dynamic.literal(fixNegotiationNeeded = js.Any.fromFunction1((t0: Window) => fixNegotiationNeeded(t0).runNow()), shimAddTrackRemoveTrack = js.Any.fromFunction1((t0: Window) => shimAddTrackRemoveTrack(t0).runNow()), shimAddTrackRemoveTrackWithNative = js.Any.fromFunction1((t0: Window) => shimAddTrackRemoveTrackWithNative(t0).runNow()), shimGetSendersWithDtmf = js.Any.fromFunction1((t0: Window) => shimGetSendersWithDtmf(t0).runNow()), shimGetStats = js.Any.fromFunction1((t0: Window) => shimGetStats(t0).runNow()), shimMediaStream = js.Any.fromFunction1((t0: Window) => shimMediaStream(t0).runNow()), shimOnTrack = js.Any.fromFunction1((t0: Window) => shimOnTrack(t0).runNow()), shimPeerConnection = js.Any.fromFunction1((t0: Window) => shimPeerConnection(t0).runNow()), shimSenderReceiverGetStats = js.Any.fromFunction1((t0: Window) => shimSenderReceiverGetStats(t0).runNow()))
      __obj.asInstanceOf[IChromeShim]
    }
    
    extension [Self <: IChromeShim](x: Self) {
      
      inline def setFixNegotiationNeeded(value: Window => Callback): Self = StObject.set(x, "fixNegotiationNeeded", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimAddTrackRemoveTrack(value: Window => Callback): Self = StObject.set(x, "shimAddTrackRemoveTrack", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimAddTrackRemoveTrackWithNative(value: Window => Callback): Self = StObject.set(x, "shimAddTrackRemoveTrackWithNative", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimGetSendersWithDtmf(value: Window => Callback): Self = StObject.set(x, "shimGetSendersWithDtmf", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimGetStats(value: Window => Callback): Self = StObject.set(x, "shimGetStats", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimMediaStream(value: Window => Callback): Self = StObject.set(x, "shimMediaStream", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimOnTrack(value: Window => Callback): Self = StObject.set(x, "shimOnTrack", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimPeerConnection(value: Window => Callback): Self = StObject.set(x, "shimPeerConnection", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimSenderReceiverGetStats(value: Window => Callback): Self = StObject.set(x, "shimSenderReceiverGetStats", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
    }
  }
  
  trait ICommonShim extends StObject {
    
    def removeAllowExtmapMixed(window: Window): Unit
    
    def shimConnectionState(window: Window): Unit
    
    def shimMaxMessageSize(window: Window): Unit
    
    def shimRTCIceCandidate(window: Window): Unit
    
    def shimSendThrowTypeError(window: Window): Unit
  }
  object ICommonShim {
    
    inline def apply(
      removeAllowExtmapMixed: Window => Callback,
      shimConnectionState: Window => Callback,
      shimMaxMessageSize: Window => Callback,
      shimRTCIceCandidate: Window => Callback,
      shimSendThrowTypeError: Window => Callback
    ): ICommonShim = {
      val __obj = js.Dynamic.literal(removeAllowExtmapMixed = js.Any.fromFunction1((t0: Window) => removeAllowExtmapMixed(t0).runNow()), shimConnectionState = js.Any.fromFunction1((t0: Window) => shimConnectionState(t0).runNow()), shimMaxMessageSize = js.Any.fromFunction1((t0: Window) => shimMaxMessageSize(t0).runNow()), shimRTCIceCandidate = js.Any.fromFunction1((t0: Window) => shimRTCIceCandidate(t0).runNow()), shimSendThrowTypeError = js.Any.fromFunction1((t0: Window) => shimSendThrowTypeError(t0).runNow()))
      __obj.asInstanceOf[ICommonShim]
    }
    
    extension [Self <: ICommonShim](x: Self) {
      
      inline def setRemoveAllowExtmapMixed(value: Window => Callback): Self = StObject.set(x, "removeAllowExtmapMixed", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimConnectionState(value: Window => Callback): Self = StObject.set(x, "shimConnectionState", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimMaxMessageSize(value: Window => Callback): Self = StObject.set(x, "shimMaxMessageSize", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimRTCIceCandidate(value: Window => Callback): Self = StObject.set(x, "shimRTCIceCandidate", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimSendThrowTypeError(value: Window => Callback): Self = StObject.set(x, "shimSendThrowTypeError", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
    }
  }
  
  trait IFirefoxShim extends StObject {
    
    def shimOnTrack(window: Window): Unit
    
    def shimPeerConnection(window: Window): Unit
    
    def shimRTCDataChannel(window: Window): Unit
    
    def shimReceiverGetStats(window: Window): Unit
    
    def shimRemoveStream(window: Window): Unit
    
    def shimSenderGetStats(window: Window): Unit
  }
  object IFirefoxShim {
    
    inline def apply(
      shimOnTrack: Window => Callback,
      shimPeerConnection: Window => Callback,
      shimRTCDataChannel: Window => Callback,
      shimReceiverGetStats: Window => Callback,
      shimRemoveStream: Window => Callback,
      shimSenderGetStats: Window => Callback
    ): IFirefoxShim = {
      val __obj = js.Dynamic.literal(shimOnTrack = js.Any.fromFunction1((t0: Window) => shimOnTrack(t0).runNow()), shimPeerConnection = js.Any.fromFunction1((t0: Window) => shimPeerConnection(t0).runNow()), shimRTCDataChannel = js.Any.fromFunction1((t0: Window) => shimRTCDataChannel(t0).runNow()), shimReceiverGetStats = js.Any.fromFunction1((t0: Window) => shimReceiverGetStats(t0).runNow()), shimRemoveStream = js.Any.fromFunction1((t0: Window) => shimRemoveStream(t0).runNow()), shimSenderGetStats = js.Any.fromFunction1((t0: Window) => shimSenderGetStats(t0).runNow()))
      __obj.asInstanceOf[IFirefoxShim]
    }
    
    extension [Self <: IFirefoxShim](x: Self) {
      
      inline def setShimOnTrack(value: Window => Callback): Self = StObject.set(x, "shimOnTrack", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimPeerConnection(value: Window => Callback): Self = StObject.set(x, "shimPeerConnection", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimRTCDataChannel(value: Window => Callback): Self = StObject.set(x, "shimRTCDataChannel", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimReceiverGetStats(value: Window => Callback): Self = StObject.set(x, "shimReceiverGetStats", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimRemoveStream(value: Window => Callback): Self = StObject.set(x, "shimRemoveStream", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimSenderGetStats(value: Window => Callback): Self = StObject.set(x, "shimSenderGetStats", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
    }
  }
  
  trait ISafariShim extends StObject {
    
    def shimCallbacksAPI(window: Window): Unit
    
    def shimConstraints(constraints: MediaStreamConstraints): Unit
    
    def shimCreateOfferLegacy(window: Window): Unit
    
    def shimGetUserMedia(window: Window): Unit
    
    def shimLocalStreamsAPI(window: Window): Unit
    
    def shimRTCIceServerUrls(window: Window): Unit
    
    def shimRemoteStreamsAPI(window: Window): Unit
    
    def shimTrackEventTransceiver(window: Window): Unit
  }
  object ISafariShim {
    
    inline def apply(
      shimCallbacksAPI: Window => Callback,
      shimConstraints: MediaStreamConstraints => Callback,
      shimCreateOfferLegacy: Window => Callback,
      shimGetUserMedia: Window => Callback,
      shimLocalStreamsAPI: Window => Callback,
      shimRTCIceServerUrls: Window => Callback,
      shimRemoteStreamsAPI: Window => Callback,
      shimTrackEventTransceiver: Window => Callback
    ): ISafariShim = {
      val __obj = js.Dynamic.literal(shimCallbacksAPI = js.Any.fromFunction1((t0: Window) => shimCallbacksAPI(t0).runNow()), shimConstraints = js.Any.fromFunction1((t0: MediaStreamConstraints) => shimConstraints(t0).runNow()), shimCreateOfferLegacy = js.Any.fromFunction1((t0: Window) => shimCreateOfferLegacy(t0).runNow()), shimGetUserMedia = js.Any.fromFunction1((t0: Window) => shimGetUserMedia(t0).runNow()), shimLocalStreamsAPI = js.Any.fromFunction1((t0: Window) => shimLocalStreamsAPI(t0).runNow()), shimRTCIceServerUrls = js.Any.fromFunction1((t0: Window) => shimRTCIceServerUrls(t0).runNow()), shimRemoteStreamsAPI = js.Any.fromFunction1((t0: Window) => shimRemoteStreamsAPI(t0).runNow()), shimTrackEventTransceiver = js.Any.fromFunction1((t0: Window) => shimTrackEventTransceiver(t0).runNow()))
      __obj.asInstanceOf[ISafariShim]
    }
    
    extension [Self <: ISafariShim](x: Self) {
      
      inline def setShimCallbacksAPI(value: Window => Callback): Self = StObject.set(x, "shimCallbacksAPI", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimConstraints(value: MediaStreamConstraints => Callback): Self = StObject.set(x, "shimConstraints", js.Any.fromFunction1((t0: MediaStreamConstraints) => value(t0).runNow()))
      
      inline def setShimCreateOfferLegacy(value: Window => Callback): Self = StObject.set(x, "shimCreateOfferLegacy", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimGetUserMedia(value: Window => Callback): Self = StObject.set(x, "shimGetUserMedia", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimLocalStreamsAPI(value: Window => Callback): Self = StObject.set(x, "shimLocalStreamsAPI", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimRTCIceServerUrls(value: Window => Callback): Self = StObject.set(x, "shimRTCIceServerUrls", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimRemoteStreamsAPI(value: Window => Callback): Self = StObject.set(x, "shimRemoteStreamsAPI", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
      
      inline def setShimTrackEventTransceiver(value: Window => Callback): Self = StObject.set(x, "shimTrackEventTransceiver", js.Any.fromFunction1((t0: Window) => value(t0).runNow()))
    }
  }
  
  type _To = IAdapter
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: IAdapter = default
}
