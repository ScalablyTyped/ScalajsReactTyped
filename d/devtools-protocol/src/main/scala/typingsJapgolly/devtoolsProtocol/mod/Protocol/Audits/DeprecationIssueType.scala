package typingsJapgolly.devtoolsProtocol.mod.Protocol.Audits

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoEnterFullscreen_
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoExitFullscreen_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.AuthorizationCoveredByWildcard
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CanRequestURLHTTPContainingNewline
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ChromeLoadTimesConnectionInfo
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ChromeLoadTimesFirstPaintAfterLoadTime
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ChromeLoadTimesWasAlternateProtocolAvailable
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CookieWithTruncatingChar
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CrossOriginAccessBasedOnDocumentDomain
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CrossOriginWindowAlert
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CrossOriginWindowConfirm
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CSSSelectorInternalMediaControlsOverlayCastButton
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.DeprecationExample
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.DocumentDomainSettingWithoutOriginAgentClusterHeader
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.EventPath
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ExpectCTHeader
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.GeolocationInsecureOrigin
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.GeolocationInsecureOriginDeprecatedNotRemoved
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.GetUserMediaInsecureOrigin
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.HostCandidateAttributeGetter
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.IdentityInCanMakePaymentEvent
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.InsecurePrivateNetworkSubresourceRequest
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.LocalCSSFileExtensionRejected
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.MediaSourceAbortRemove
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.MediaSourceDurationTruncatingBuffered
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.NoSysexWebMIDIWithoutPermission
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.NotificationInsecureOrigin
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.NotificationPermissionRequestedIframe
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ObsoleteWebRtcCipherSuite
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.OpenWebDatabaseInsecureContext
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.OverflowVisibleOnReplacedElement
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PaymentInstruments
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PaymentRequestCSPViolation
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PersistentQuotaType
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PictureSourceSrc
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedCancelAnimationFrame
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedRequestAnimationFrame
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedStorageInfo
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoDisplayingFullscreen
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoEnterFullscreen_
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoEnterFullScreen
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoExitFullscreen_
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoExitFullScreen
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoSupportsFullscreen
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RangeExpand
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RequestedSubresourceWithEmbeddedCredentials
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RTCConstraintEnableDtlsSrtpFalse
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RTCConstraintEnableDtlsSrtpTrue
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RTCPeerConnectionComplexPlanBSdpUsingDefaultSdpSemantics
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RTCPeerConnectionSdpSemanticsPlanB
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RtcpMuxPolicyNegotiate
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.SharedArrayBufferConstructedWithoutIsolation
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.TextToSpeech_DisallowedByAutoplay
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.V8SharedArrayBufferConstructedInExtensionWithoutIsolation
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.XHRJSONEncodingDetection
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.XMLHttpRequestSynchronousInNonWorkerOutsideBeforeUnload
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.XRSupportsSession
*/
trait DeprecationIssueType extends StObject
object DeprecationIssueType {
  
  inline def AuthorizationCoveredByWildcard: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.AuthorizationCoveredByWildcard = "AuthorizationCoveredByWildcard".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.AuthorizationCoveredByWildcard]
  
  inline def CSSSelectorInternalMediaControlsOverlayCastButton: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CSSSelectorInternalMediaControlsOverlayCastButton = "CSSSelectorInternalMediaControlsOverlayCastButton".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CSSSelectorInternalMediaControlsOverlayCastButton]
  
  inline def CanRequestURLHTTPContainingNewline: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CanRequestURLHTTPContainingNewline = "CanRequestURLHTTPContainingNewline".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CanRequestURLHTTPContainingNewline]
  
  inline def ChromeLoadTimesConnectionInfo: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ChromeLoadTimesConnectionInfo = "ChromeLoadTimesConnectionInfo".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ChromeLoadTimesConnectionInfo]
  
  inline def ChromeLoadTimesFirstPaintAfterLoadTime: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ChromeLoadTimesFirstPaintAfterLoadTime = "ChromeLoadTimesFirstPaintAfterLoadTime".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ChromeLoadTimesFirstPaintAfterLoadTime]
  
  inline def ChromeLoadTimesWasAlternateProtocolAvailable: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ChromeLoadTimesWasAlternateProtocolAvailable = "ChromeLoadTimesWasAlternateProtocolAvailable".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ChromeLoadTimesWasAlternateProtocolAvailable]
  
  inline def CookieWithTruncatingChar: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CookieWithTruncatingChar = "CookieWithTruncatingChar".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CookieWithTruncatingChar]
  
  inline def CrossOriginAccessBasedOnDocumentDomain: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CrossOriginAccessBasedOnDocumentDomain = "CrossOriginAccessBasedOnDocumentDomain".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CrossOriginAccessBasedOnDocumentDomain]
  
  inline def CrossOriginWindowAlert: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CrossOriginWindowAlert = "CrossOriginWindowAlert".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CrossOriginWindowAlert]
  
  inline def CrossOriginWindowConfirm: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CrossOriginWindowConfirm = "CrossOriginWindowConfirm".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CrossOriginWindowConfirm]
  
  inline def DeprecationExample: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.DeprecationExample = "DeprecationExample".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.DeprecationExample]
  
  inline def DocumentDomainSettingWithoutOriginAgentClusterHeader: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.DocumentDomainSettingWithoutOriginAgentClusterHeader = "DocumentDomainSettingWithoutOriginAgentClusterHeader".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.DocumentDomainSettingWithoutOriginAgentClusterHeader]
  
  inline def EventPath: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.EventPath = "EventPath".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.EventPath]
  
  inline def ExpectCTHeader: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ExpectCTHeader = "ExpectCTHeader".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ExpectCTHeader]
  
  inline def GeolocationInsecureOrigin: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.GeolocationInsecureOrigin = "GeolocationInsecureOrigin".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.GeolocationInsecureOrigin]
  
  inline def GeolocationInsecureOriginDeprecatedNotRemoved: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.GeolocationInsecureOriginDeprecatedNotRemoved = "GeolocationInsecureOriginDeprecatedNotRemoved".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.GeolocationInsecureOriginDeprecatedNotRemoved]
  
  inline def GetUserMediaInsecureOrigin: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.GetUserMediaInsecureOrigin = "GetUserMediaInsecureOrigin".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.GetUserMediaInsecureOrigin]
  
  inline def HostCandidateAttributeGetter: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.HostCandidateAttributeGetter = "HostCandidateAttributeGetter".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.HostCandidateAttributeGetter]
  
  inline def IdentityInCanMakePaymentEvent: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.IdentityInCanMakePaymentEvent = "IdentityInCanMakePaymentEvent".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.IdentityInCanMakePaymentEvent]
  
  inline def InsecurePrivateNetworkSubresourceRequest: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.InsecurePrivateNetworkSubresourceRequest = "InsecurePrivateNetworkSubresourceRequest".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.InsecurePrivateNetworkSubresourceRequest]
  
  inline def LocalCSSFileExtensionRejected: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.LocalCSSFileExtensionRejected = "LocalCSSFileExtensionRejected".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.LocalCSSFileExtensionRejected]
  
  inline def MediaSourceAbortRemove: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.MediaSourceAbortRemove = "MediaSourceAbortRemove".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.MediaSourceAbortRemove]
  
  inline def MediaSourceDurationTruncatingBuffered: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.MediaSourceDurationTruncatingBuffered = "MediaSourceDurationTruncatingBuffered".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.MediaSourceDurationTruncatingBuffered]
  
  inline def NoSysexWebMIDIWithoutPermission: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.NoSysexWebMIDIWithoutPermission = "NoSysexWebMIDIWithoutPermission".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.NoSysexWebMIDIWithoutPermission]
  
  inline def NotificationInsecureOrigin: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.NotificationInsecureOrigin = "NotificationInsecureOrigin".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.NotificationInsecureOrigin]
  
  inline def NotificationPermissionRequestedIframe: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.NotificationPermissionRequestedIframe = "NotificationPermissionRequestedIframe".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.NotificationPermissionRequestedIframe]
  
  inline def ObsoleteWebRtcCipherSuite: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ObsoleteWebRtcCipherSuite = "ObsoleteWebRtcCipherSuite".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ObsoleteWebRtcCipherSuite]
  
  inline def OpenWebDatabaseInsecureContext: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.OpenWebDatabaseInsecureContext = "OpenWebDatabaseInsecureContext".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.OpenWebDatabaseInsecureContext]
  
  inline def OverflowVisibleOnReplacedElement: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.OverflowVisibleOnReplacedElement = "OverflowVisibleOnReplacedElement".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.OverflowVisibleOnReplacedElement]
  
  inline def PaymentInstruments: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PaymentInstruments = "PaymentInstruments".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PaymentInstruments]
  
  inline def PaymentRequestCSPViolation: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PaymentRequestCSPViolation = "PaymentRequestCSPViolation".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PaymentRequestCSPViolation]
  
  inline def PersistentQuotaType: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PersistentQuotaType = "PersistentQuotaType".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PersistentQuotaType]
  
  inline def PictureSourceSrc: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PictureSourceSrc = "PictureSourceSrc".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PictureSourceSrc]
  
  inline def PrefixedCancelAnimationFrame: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedCancelAnimationFrame = "PrefixedCancelAnimationFrame".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedCancelAnimationFrame]
  
  inline def PrefixedRequestAnimationFrame: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedRequestAnimationFrame = "PrefixedRequestAnimationFrame".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedRequestAnimationFrame]
  
  inline def PrefixedStorageInfo: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedStorageInfo = "PrefixedStorageInfo".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedStorageInfo]
  
  inline def PrefixedVideoDisplayingFullscreen: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoDisplayingFullscreen = "PrefixedVideoDisplayingFullscreen".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoDisplayingFullscreen]
  
  inline def PrefixedVideoEnterFullScreen: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoEnterFullScreen = "PrefixedVideoEnterFullScreen".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoEnterFullScreen]
  
  inline def PrefixedVideoEnterFullscreen: PrefixedVideoEnterFullscreen_ = "PrefixedVideoEnterFullscreen".asInstanceOf[PrefixedVideoEnterFullscreen_]
  
  inline def PrefixedVideoExitFullScreen: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoExitFullScreen = "PrefixedVideoExitFullScreen".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoExitFullScreen]
  
  inline def PrefixedVideoExitFullscreen: PrefixedVideoExitFullscreen_ = "PrefixedVideoExitFullscreen".asInstanceOf[PrefixedVideoExitFullscreen_]
  
  inline def PrefixedVideoSupportsFullscreen: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoSupportsFullscreen = "PrefixedVideoSupportsFullscreen".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.PrefixedVideoSupportsFullscreen]
  
  inline def RTCConstraintEnableDtlsSrtpFalse: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RTCConstraintEnableDtlsSrtpFalse = "RTCConstraintEnableDtlsSrtpFalse".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RTCConstraintEnableDtlsSrtpFalse]
  
  inline def RTCConstraintEnableDtlsSrtpTrue: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RTCConstraintEnableDtlsSrtpTrue = "RTCConstraintEnableDtlsSrtpTrue".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RTCConstraintEnableDtlsSrtpTrue]
  
  inline def RTCPeerConnectionComplexPlanBSdpUsingDefaultSdpSemantics: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RTCPeerConnectionComplexPlanBSdpUsingDefaultSdpSemantics = "RTCPeerConnectionComplexPlanBSdpUsingDefaultSdpSemantics".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RTCPeerConnectionComplexPlanBSdpUsingDefaultSdpSemantics]
  
  inline def RTCPeerConnectionSdpSemanticsPlanB: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RTCPeerConnectionSdpSemanticsPlanB = "RTCPeerConnectionSdpSemanticsPlanB".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RTCPeerConnectionSdpSemanticsPlanB]
  
  inline def RangeExpand: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RangeExpand = "RangeExpand".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RangeExpand]
  
  inline def RequestedSubresourceWithEmbeddedCredentials: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RequestedSubresourceWithEmbeddedCredentials = "RequestedSubresourceWithEmbeddedCredentials".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RequestedSubresourceWithEmbeddedCredentials]
  
  inline def RtcpMuxPolicyNegotiate: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RtcpMuxPolicyNegotiate = "RtcpMuxPolicyNegotiate".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.RtcpMuxPolicyNegotiate]
  
  inline def SharedArrayBufferConstructedWithoutIsolation: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.SharedArrayBufferConstructedWithoutIsolation = "SharedArrayBufferConstructedWithoutIsolation".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.SharedArrayBufferConstructedWithoutIsolation]
  
  inline def TextToSpeech_DisallowedByAutoplay: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.TextToSpeech_DisallowedByAutoplay = "TextToSpeech_DisallowedByAutoplay".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.TextToSpeech_DisallowedByAutoplay]
  
  inline def V8SharedArrayBufferConstructedInExtensionWithoutIsolation: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.V8SharedArrayBufferConstructedInExtensionWithoutIsolation = "V8SharedArrayBufferConstructedInExtensionWithoutIsolation".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.V8SharedArrayBufferConstructedInExtensionWithoutIsolation]
  
  inline def XHRJSONEncodingDetection: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.XHRJSONEncodingDetection = "XHRJSONEncodingDetection".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.XHRJSONEncodingDetection]
  
  inline def XMLHttpRequestSynchronousInNonWorkerOutsideBeforeUnload: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.XMLHttpRequestSynchronousInNonWorkerOutsideBeforeUnload = "XMLHttpRequestSynchronousInNonWorkerOutsideBeforeUnload".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.XMLHttpRequestSynchronousInNonWorkerOutsideBeforeUnload]
  
  inline def XRSupportsSession: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.XRSupportsSession = "XRSupportsSession".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.XRSupportsSession]
}
