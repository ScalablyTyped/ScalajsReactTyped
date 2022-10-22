package typingsJapgolly.reactNativeVideo.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`box-none`
import typingsJapgolly.reactNative.reactNativeStrings.`box-only`
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.reactNativeVideo.anon.BufferForPlaybackAfterRebufferMs
import typingsJapgolly.reactNativeVideo.anon.Headers
import typingsJapgolly.reactNativeVideo.anon.Language
import typingsJapgolly.reactNativeVideo.anon.Type
import typingsJapgolly.reactNativeVideo.anon.Value
import typingsJapgolly.reactNativeVideo.mod.DRMSettings
import typingsJapgolly.reactNativeVideo.mod.FilterType
import typingsJapgolly.reactNativeVideo.mod.LoadError
import typingsJapgolly.reactNativeVideo.mod.OnBandwidthUpdateData
import typingsJapgolly.reactNativeVideo.mod.OnBufferData
import typingsJapgolly.reactNativeVideo.mod.OnExternalPlaybackChangeData
import typingsJapgolly.reactNativeVideo.mod.OnLoadData
import typingsJapgolly.reactNativeVideo.mod.OnPictureInPictureStatusData
import typingsJapgolly.reactNativeVideo.mod.OnPlaybackRateData
import typingsJapgolly.reactNativeVideo.mod.OnProgressData
import typingsJapgolly.reactNativeVideo.mod.OnSeekData
import typingsJapgolly.reactNativeVideo.mod.VideoProperties
import typingsJapgolly.reactNativeVideo.mod.default
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.all
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.contain
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.cover
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.duck
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.ignore
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.inherit
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.landscape
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.mix
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.obey
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.portrait
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeVideo {
  
  inline def apply(source: Headers | Double): Builder = {
    val __props = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VideoProperties]))
  }
  
  @JSImport("react-native-video", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value*))
    
    inline def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledBy(value: String | js.Array[String]): this.type = set("accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledByVarargs(value: String*): this.type = set("accessibilityLabelledBy", js.Array(value*))
    
    inline def accessibilityLanguage(value: String): this.type = set("accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    inline def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def allowsExternalPlayback(value: Boolean): this.type = set("allowsExternalPlayback", value.asInstanceOf[js.Any])
    
    inline def audioOnly(value: Boolean): this.type = set("audioOnly", value.asInstanceOf[js.Any])
    
    inline def automaticallyWaitsToMinimizeStalling(value: Boolean): this.type = set("automaticallyWaitsToMinimizeStalling", value.asInstanceOf[js.Any])
    
    inline def bufferConfig(value: BufferForPlaybackAfterRebufferMs): this.type = set("bufferConfig", value.asInstanceOf[js.Any])
    
    inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
    
    inline def currentTime(value: Double): this.type = set("currentTime", value.asInstanceOf[js.Any])
    
    inline def disableFocus(value: Boolean): this.type = set("disableFocus", value.asInstanceOf[js.Any])
    
    inline def drm(value: DRMSettings): this.type = set("drm", value.asInstanceOf[js.Any])
    
    inline def filter(value: FilterType): this.type = set("filter", value.asInstanceOf[js.Any])
    
    inline def filterEnabled(value: Boolean): this.type = set("filterEnabled", value.asInstanceOf[js.Any])
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def fullscreen(value: Boolean): this.type = set("fullscreen", value.asInstanceOf[js.Any])
    
    inline def fullscreenAutorotate(value: Boolean): this.type = set("fullscreenAutorotate", value.asInstanceOf[js.Any])
    
    inline def fullscreenOrientation(value: all | landscape | portrait): this.type = set("fullscreenOrientation", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def hideShutterView(value: Boolean): this.type = set("hideShutterView", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def ignoreSilentSwitch(value: ignore | obey): this.type = set("ignoreSilentSwitch", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def maxBitRate(value: Double): this.type = set("maxBitRate", value.asInstanceOf[js.Any])
    
    inline def minLoadRetryCount(value: Double): this.type = set("minLoadRetryCount", value.asInstanceOf[js.Any])
    
    inline def mixWithOthers(value: inherit | mix | duck): this.type = set("mixWithOthers", value.asInstanceOf[js.Any])
    
    inline def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onAudioBecomingNoisy(value: Callback): this.type = set("onAudioBecomingNoisy", value.toJsFn)
    
    inline def onAudioFocusChanged(value: Callback): this.type = set("onAudioFocusChanged", value.toJsFn)
    
    inline def onBandwidthUpdate(value: /* data */ OnBandwidthUpdateData => Callback): this.type = set("onBandwidthUpdate", js.Any.fromFunction1((t0: /* data */ OnBandwidthUpdateData) => value(t0).runNow()))
    
    inline def onBuffer(value: /* data */ OnBufferData => Callback): this.type = set("onBuffer", js.Any.fromFunction1((t0: /* data */ OnBufferData) => value(t0).runNow()))
    
    inline def onEnd(value: Callback): this.type = set("onEnd", value.toJsFn)
    
    inline def onError(value: /* error */ LoadError => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* error */ LoadError) => value(t0).runNow()))
    
    inline def onExternalPlaybackChange(value: /* data */ OnExternalPlaybackChangeData => Callback): this.type = set("onExternalPlaybackChange", js.Any.fromFunction1((t0: /* data */ OnExternalPlaybackChangeData) => value(t0).runNow()))
    
    inline def onFullscreenPlayerDidDismiss(value: Callback): this.type = set("onFullscreenPlayerDidDismiss", value.toJsFn)
    
    inline def onFullscreenPlayerDidPresent(value: Callback): this.type = set("onFullscreenPlayerDidPresent", value.toJsFn)
    
    inline def onFullscreenPlayerWillDismiss(value: Callback): this.type = set("onFullscreenPlayerWillDismiss", value.toJsFn)
    
    inline def onFullscreenPlayerWillPresent(value: Callback): this.type = set("onFullscreenPlayerWillPresent", value.toJsFn)
    
    inline def onLayout(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onLoad(value: /* data */ OnLoadData => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: /* data */ OnLoadData) => value(t0).runNow()))
    
    inline def onLoadStart(value: Callback): this.type = set("onLoadStart", value.toJsFn)
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMoveShouldSetResponder(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onPictureInPictureStatusChanged(value: /* data */ OnPictureInPictureStatusData => Callback): this.type = set("onPictureInPictureStatusChanged", js.Any.fromFunction1((t0: /* data */ OnPictureInPictureStatusData) => value(t0).runNow()))
    
    inline def onPlaybackRateChange(value: /* data */ OnPlaybackRateData => Callback): this.type = set("onPlaybackRateChange", js.Any.fromFunction1((t0: /* data */ OnPlaybackRateData) => value(t0).runNow()))
    
    inline def onPlaybackResume(value: Callback): this.type = set("onPlaybackResume", value.toJsFn)
    
    inline def onPlaybackStalled(value: Callback): this.type = set("onPlaybackStalled", value.toJsFn)
    
    inline def onPointerCancel(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerCancelCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerCancelCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerDown(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerDownCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerDownCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerEnter(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerEnterCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerEnterCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerLeave(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerLeaveCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerLeaveCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerMove(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerMoveCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerMoveCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerUp(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onPointerUpCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerUpCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onProgress(value: /* data */ OnProgressData => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: /* data */ OnProgressData) => value(t0).runNow()))
    
    inline def onReadyForDisplay(value: Callback): this.type = set("onReadyForDisplay", value.toJsFn)
    
    inline def onResponderEnd(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderGrant(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderGrant", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderMove(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderReject(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderReject", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderRelease(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderRelease", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderStart(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderTerminate(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderTerminate", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onResponderTerminationRequest(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def onRestoreUserInterfaceForPictureInPictureStop(value: Callback): this.type = set("onRestoreUserInterfaceForPictureInPictureStop", value.toJsFn)
    
    inline def onSeek(value: /* data */ OnSeekData => Callback): this.type = set("onSeek", js.Any.fromFunction1((t0: /* data */ OnSeekData) => value(t0).runNow()))
    
    inline def onStartShouldSetResponder(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onTimedMetadata(value: Callback): this.type = set("onTimedMetadata", value.toJsFn)
    
    inline def onTouchCancel(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchEndCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onVideoBuffer(value: Callback): this.type = set("onVideoBuffer", value.toJsFn)
    
    inline def onVideoEnd(value: Callback): this.type = set("onVideoEnd", value.toJsFn)
    
    inline def onVideoError(value: Callback): this.type = set("onVideoError", value.toJsFn)
    
    inline def onVideoFullscreenPlayerDidDismiss(value: Callback): this.type = set("onVideoFullscreenPlayerDidDismiss", value.toJsFn)
    
    inline def onVideoFullscreenPlayerDidPresent(value: Callback): this.type = set("onVideoFullscreenPlayerDidPresent", value.toJsFn)
    
    inline def onVideoFullscreenPlayerWillDismiss(value: Callback): this.type = set("onVideoFullscreenPlayerWillDismiss", value.toJsFn)
    
    inline def onVideoFullscreenPlayerWillPresent(value: Callback): this.type = set("onVideoFullscreenPlayerWillPresent", value.toJsFn)
    
    inline def onVideoLoad(value: Callback): this.type = set("onVideoLoad", value.toJsFn)
    
    inline def onVideoLoadStart(value: Callback): this.type = set("onVideoLoadStart", value.toJsFn)
    
    inline def onVideoProgress(value: Callback): this.type = set("onVideoProgress", value.toJsFn)
    
    inline def onVideoSeek(value: Callback): this.type = set("onVideoSeek", value.toJsFn)
    
    inline def paused(value: Boolean): this.type = set("paused", value.asInstanceOf[js.Any])
    
    inline def pictureInPicture(value: Boolean): this.type = set("pictureInPicture", value.asInstanceOf[js.Any])
    
    inline def playInBackground(value: Boolean): this.type = set("playInBackground", value.asInstanceOf[js.Any])
    
    inline def playWhenInactive(value: Boolean): this.type = set("playWhenInactive", value.asInstanceOf[js.Any])
    
    inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def poster(value: String): this.type = set("poster", value.asInstanceOf[js.Any])
    
    inline def posterResizeMode(value: stretch | contain | cover | typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.none): this.type = set("posterResizeMode", value.asInstanceOf[js.Any])
    
    inline def preferredForwardBufferDuration(value: Double): this.type = set("preferredForwardBufferDuration", value.asInstanceOf[js.Any])
    
    inline def preventsDisplaySleepDuringVideoPlayback(value: Boolean): this.type = set("preventsDisplaySleepDuringVideoPlayback", value.asInstanceOf[js.Any])
    
    inline def progressUpdateInterval(value: Double): this.type = set("progressUpdateInterval", value.asInstanceOf[js.Any])
    
    inline def rate(value: Double): this.type = set("rate", value.asInstanceOf[js.Any])
    
    inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def repeat(value: Boolean): this.type = set("repeat", value.asInstanceOf[js.Any])
    
    inline def reportBandwidth(value: Boolean): this.type = set("reportBandwidth", value.asInstanceOf[js.Any])
    
    inline def resizeMode(value: stretch | contain | cover | typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.none): this.type = set("resizeMode", value.asInstanceOf[js.Any])
    
    inline def rotation(value: Double): this.type = set("rotation", value.asInstanceOf[js.Any])
    
    inline def scaleX(value: Double): this.type = set("scaleX", value.asInstanceOf[js.Any])
    
    inline def scaleY(value: Double): this.type = set("scaleY", value.asInstanceOf[js.Any])
    
    inline def seek(value: Double): this.type = set("seek", value.asInstanceOf[js.Any])
    
    inline def selectedAudioTrack(value: Type): this.type = set("selectedAudioTrack", value.asInstanceOf[js.Any])
    
    inline def selectedTextTrack(value: Type): this.type = set("selectedTextTrack", value.asInstanceOf[js.Any])
    
    inline def selectedVideoTrack(value: Value): this.type = set("selectedVideoTrack", value.asInstanceOf[js.Any])
    
    inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def src(value: Any): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def stereoPan(value: Double): this.type = set("stereoPan", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def textTracks(value: js.Array[Language]): this.type = set("textTracks", value.asInstanceOf[js.Any])
    
    inline def textTracksVarargs(value: Language*): this.type = set("textTracks", js.Array(value*))
    
    inline def translateX(value: Double): this.type = set("translateX", value.asInstanceOf[js.Any])
    
    inline def translateY(value: Double): this.type = set("translateY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def useTextureView(value: Boolean): this.type = set("useTextureView", value.asInstanceOf[js.Any])
    
    inline def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VideoProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
