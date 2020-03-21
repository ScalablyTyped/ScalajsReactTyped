package typingsJapgolly.reactNativeVideo.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityStates
import typingsJapgolly.reactNative.mod.AccessibilityTrait
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`box-none`
import typingsJapgolly.reactNative.reactNativeStrings.`box-only`
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.button
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.radiobutton_checked
import typingsJapgolly.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.reactNativeVideo.AnonBufferForPlaybackAfterRebufferMs
import typingsJapgolly.reactNativeVideo.AnonLanguage
import typingsJapgolly.reactNativeVideo.AnonType
import typingsJapgolly.reactNativeVideo.AnonUri
import typingsJapgolly.reactNativeVideo.AnonValue
import typingsJapgolly.reactNativeVideo.mod.FilterType
import typingsJapgolly.reactNativeVideo.mod.LoadError
import typingsJapgolly.reactNativeVideo.mod.OnBandwidthUpdateData
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
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.ignore
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.landscape
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.obey
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.portrait
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeVideo {
  def apply(
    source: AnonUri | Double,
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    allowsExternalPlayback: js.UndefOr[Boolean] = js.undefined,
    audioOnly: js.UndefOr[Boolean] = js.undefined,
    automaticallyWaitsToMinimizeStalling: js.UndefOr[Boolean] = js.undefined,
    bufferConfig: AnonBufferForPlaybackAfterRebufferMs = null,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    controls: js.UndefOr[Boolean] = js.undefined,
    currentTime: Int | Double = null,
    disableFocus: js.UndefOr[Boolean] = js.undefined,
    filter: FilterType = null,
    filterEnable: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    fullscreenAutorotate: js.UndefOr[Boolean] = js.undefined,
    fullscreenOrientation: all | landscape | portrait = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hideShutterView: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    ignoreSilentSwitch: ignore | obey = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    maxBitRate: Int | Double = null,
    minLoadRetryCount: Int | Double = null,
    muted: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onAccessibilityEscape: js.UndefOr[Callback] = js.undefined,
    onAccessibilityTap: js.UndefOr[Callback] = js.undefined,
    onAudioBecomingNoisy: js.UndefOr[Callback] = js.undefined,
    onAudioFocusChanged: js.UndefOr[Callback] = js.undefined,
    onBandwidthUpdate: /* data */ OnBandwidthUpdateData => Callback = null,
    onBuffer: js.UndefOr[Callback] = js.undefined,
    onEnd: js.UndefOr[Callback] = js.undefined,
    onError: /* error */ LoadError => Callback = null,
    onExternalPlaybackChange: /* data */ OnExternalPlaybackChangeData => Callback = null,
    onFullscreenPlayerDidDismiss: js.UndefOr[Callback] = js.undefined,
    onFullscreenPlayerDidPresent: js.UndefOr[Callback] = js.undefined,
    onFullscreenPlayerWillDismiss: js.UndefOr[Callback] = js.undefined,
    onFullscreenPlayerWillPresent: js.UndefOr[Callback] = js.undefined,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    onLoad: /* data */ OnLoadData => Callback = null,
    onLoadStart: js.UndefOr[Callback] = js.undefined,
    onMagicTap: js.UndefOr[Callback] = js.undefined,
    onMoveShouldSetResponder: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onMoveShouldSetResponderCapture: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onPictureInPictureStatusChanged: /* data */ OnPictureInPictureStatusData => Callback = null,
    onPlaybackRateChange: /* data */ OnPlaybackRateData => Callback = null,
    onPlaybackResume: js.UndefOr[Callback] = js.undefined,
    onPlaybackStalled: js.UndefOr[Callback] = js.undefined,
    onProgress: /* data */ OnProgressData => Callback = null,
    onReadyForDisplay: js.UndefOr[Callback] = js.undefined,
    onResponderEnd: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderGrant: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderMove: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderReject: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderRelease: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderStart: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderTerminate: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderTerminationRequest: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onRestoreUserInterfaceForPictureInPictureStop: js.UndefOr[Callback] = js.undefined,
    onSeek: /* data */ OnSeekData => Callback = null,
    onStartShouldSetResponder: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onStartShouldSetResponderCapture: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onTimedMetadata: js.UndefOr[Callback] = js.undefined,
    onTouchCancel: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchEnd: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchEndCapture: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchMove: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchStart: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onVideoBuffer: js.UndefOr[Callback] = js.undefined,
    onVideoEnd: js.UndefOr[Callback] = js.undefined,
    onVideoError: js.UndefOr[Callback] = js.undefined,
    onVideoFullscreenPlayerDidDismiss: js.UndefOr[Callback] = js.undefined,
    onVideoFullscreenPlayerDidPresent: js.UndefOr[Callback] = js.undefined,
    onVideoFullscreenPlayerWillDismiss: js.UndefOr[Callback] = js.undefined,
    onVideoFullscreenPlayerWillPresent: js.UndefOr[Callback] = js.undefined,
    onVideoLoad: js.UndefOr[Callback] = js.undefined,
    onVideoLoadStart: js.UndefOr[Callback] = js.undefined,
    onVideoProgress: js.UndefOr[Callback] = js.undefined,
    onVideoSeek: js.UndefOr[Callback] = js.undefined,
    paused: js.UndefOr[Boolean] = js.undefined,
    pictureInPicture: js.UndefOr[Boolean] = js.undefined,
    playInBackground: js.UndefOr[Boolean] = js.undefined,
    playWhenInactive: js.UndefOr[Boolean] = js.undefined,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    poster: String = null,
    posterResizeMode: stretch | contain | cover | typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.none = null,
    progressUpdateInterval: Int | Double = null,
    rate: Int | Double = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    repeat: js.UndefOr[Boolean] = js.undefined,
    reportBandwidth: js.UndefOr[Boolean] = js.undefined,
    resizeMode: stretch | contain | cover | typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.none = null,
    rotation: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    seek: Int | Double = null,
    selectedAudioTrack: AnonType = null,
    selectedTextTrack: AnonType = null,
    selectedVideoTrack: AnonValue = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    src: js.Any = null,
    stereoPan: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    testID: String = null,
    textTracks: js.Array[AnonLanguage] = null,
    translateX: Int | Double = null,
    translateY: Int | Double = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    useTextureView: js.UndefOr[Boolean] = js.undefined,
    volume: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[VideoProperties, default, Unit, VideoProperties] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
  
      if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (!js.isUndefined(allowsExternalPlayback)) __obj.updateDynamic("allowsExternalPlayback")(allowsExternalPlayback.asInstanceOf[js.Any])
    if (!js.isUndefined(audioOnly)) __obj.updateDynamic("audioOnly")(audioOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticallyWaitsToMinimizeStalling)) __obj.updateDynamic("automaticallyWaitsToMinimizeStalling")(automaticallyWaitsToMinimizeStalling.asInstanceOf[js.Any])
    if (bufferConfig != null) __obj.updateDynamic("bufferConfig")(bufferConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocus)) __obj.updateDynamic("disableFocus")(disableFocus.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(filterEnable)) __obj.updateDynamic("filterEnable")(filterEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreenAutorotate)) __obj.updateDynamic("fullscreenAutorotate")(fullscreenAutorotate.asInstanceOf[js.Any])
    if (fullscreenOrientation != null) __obj.updateDynamic("fullscreenOrientation")(fullscreenOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(hideShutterView)) __obj.updateDynamic("hideShutterView")(hideShutterView.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (ignoreSilentSwitch != null) __obj.updateDynamic("ignoreSilentSwitch")(ignoreSilentSwitch.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (maxBitRate != null) __obj.updateDynamic("maxBitRate")(maxBitRate.asInstanceOf[js.Any])
    if (minLoadRetryCount != null) __obj.updateDynamic("minLoadRetryCount")(minLoadRetryCount.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onAccessibilityAction(t0).runNow()))
    onAccessibilityEscape.foreach(p => __obj.updateDynamic("onAccessibilityEscape")(p.toJsFn))
    onAccessibilityTap.foreach(p => __obj.updateDynamic("onAccessibilityTap")(p.toJsFn))
    onAudioBecomingNoisy.foreach(p => __obj.updateDynamic("onAudioBecomingNoisy")(p.toJsFn))
    onAudioFocusChanged.foreach(p => __obj.updateDynamic("onAudioFocusChanged")(p.toJsFn))
    if (onBandwidthUpdate != null) __obj.updateDynamic("onBandwidthUpdate")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactNativeVideo.mod.OnBandwidthUpdateData) => onBandwidthUpdate(t0).runNow()))
    onBuffer.foreach(p => __obj.updateDynamic("onBuffer")(p.toJsFn))
    onEnd.foreach(p => __obj.updateDynamic("onEnd")(p.toJsFn))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.reactNativeVideo.mod.LoadError) => onError(t0).runNow()))
    if (onExternalPlaybackChange != null) __obj.updateDynamic("onExternalPlaybackChange")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactNativeVideo.mod.OnExternalPlaybackChangeData) => onExternalPlaybackChange(t0).runNow()))
    onFullscreenPlayerDidDismiss.foreach(p => __obj.updateDynamic("onFullscreenPlayerDidDismiss")(p.toJsFn))
    onFullscreenPlayerDidPresent.foreach(p => __obj.updateDynamic("onFullscreenPlayerDidPresent")(p.toJsFn))
    onFullscreenPlayerWillDismiss.foreach(p => __obj.updateDynamic("onFullscreenPlayerWillDismiss")(p.toJsFn))
    onFullscreenPlayerWillPresent.foreach(p => __obj.updateDynamic("onFullscreenPlayerWillPresent")(p.toJsFn))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNative.mod.LayoutChangeEvent) => onLayout(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactNativeVideo.mod.OnLoadData) => onLoad(t0).runNow()))
    onLoadStart.foreach(p => __obj.updateDynamic("onLoadStart")(p.toJsFn))
    onMagicTap.foreach(p => __obj.updateDynamic("onMagicTap")(p.toJsFn))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMoveShouldSetResponder(t0).runNow()))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMoveShouldSetResponderCapture(t0).runNow()))
    if (onPictureInPictureStatusChanged != null) __obj.updateDynamic("onPictureInPictureStatusChanged")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactNativeVideo.mod.OnPictureInPictureStatusData) => onPictureInPictureStatusChanged(t0).runNow()))
    if (onPlaybackRateChange != null) __obj.updateDynamic("onPlaybackRateChange")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactNativeVideo.mod.OnPlaybackRateData) => onPlaybackRateChange(t0).runNow()))
    onPlaybackResume.foreach(p => __obj.updateDynamic("onPlaybackResume")(p.toJsFn))
    onPlaybackStalled.foreach(p => __obj.updateDynamic("onPlaybackStalled")(p.toJsFn))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactNativeVideo.mod.OnProgressData) => onProgress(t0).runNow()))
    onReadyForDisplay.foreach(p => __obj.updateDynamic("onReadyForDisplay")(p.toJsFn))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderEnd(t0).runNow()))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderGrant(t0).runNow()))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderMove(t0).runNow()))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderReject(t0).runNow()))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderRelease(t0).runNow()))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderStart(t0).runNow()))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderTerminate(t0).runNow()))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderTerminationRequest(t0).runNow()))
    onRestoreUserInterfaceForPictureInPictureStop.foreach(p => __obj.updateDynamic("onRestoreUserInterfaceForPictureInPictureStop")(p.toJsFn))
    if (onSeek != null) __obj.updateDynamic("onSeek")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactNativeVideo.mod.OnSeekData) => onSeek(t0).runNow()))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onStartShouldSetResponder(t0).runNow()))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onStartShouldSetResponderCapture(t0).runNow()))
    onTimedMetadata.foreach(p => __obj.updateDynamic("onTimedMetadata")(p.toJsFn))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchEndCapture(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    onVideoBuffer.foreach(p => __obj.updateDynamic("onVideoBuffer")(p.toJsFn))
    onVideoEnd.foreach(p => __obj.updateDynamic("onVideoEnd")(p.toJsFn))
    onVideoError.foreach(p => __obj.updateDynamic("onVideoError")(p.toJsFn))
    onVideoFullscreenPlayerDidDismiss.foreach(p => __obj.updateDynamic("onVideoFullscreenPlayerDidDismiss")(p.toJsFn))
    onVideoFullscreenPlayerDidPresent.foreach(p => __obj.updateDynamic("onVideoFullscreenPlayerDidPresent")(p.toJsFn))
    onVideoFullscreenPlayerWillDismiss.foreach(p => __obj.updateDynamic("onVideoFullscreenPlayerWillDismiss")(p.toJsFn))
    onVideoFullscreenPlayerWillPresent.foreach(p => __obj.updateDynamic("onVideoFullscreenPlayerWillPresent")(p.toJsFn))
    onVideoLoad.foreach(p => __obj.updateDynamic("onVideoLoad")(p.toJsFn))
    onVideoLoadStart.foreach(p => __obj.updateDynamic("onVideoLoadStart")(p.toJsFn))
    onVideoProgress.foreach(p => __obj.updateDynamic("onVideoProgress")(p.toJsFn))
    onVideoSeek.foreach(p => __obj.updateDynamic("onVideoSeek")(p.toJsFn))
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (!js.isUndefined(pictureInPicture)) __obj.updateDynamic("pictureInPicture")(pictureInPicture.asInstanceOf[js.Any])
    if (!js.isUndefined(playInBackground)) __obj.updateDynamic("playInBackground")(playInBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(playWhenInactive)) __obj.updateDynamic("playWhenInactive")(playWhenInactive.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (posterResizeMode != null) __obj.updateDynamic("posterResizeMode")(posterResizeMode.asInstanceOf[js.Any])
    if (progressUpdateInterval != null) __obj.updateDynamic("progressUpdateInterval")(progressUpdateInterval.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (!js.isUndefined(reportBandwidth)) __obj.updateDynamic("reportBandwidth")(reportBandwidth.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (seek != null) __obj.updateDynamic("seek")(seek.asInstanceOf[js.Any])
    if (selectedAudioTrack != null) __obj.updateDynamic("selectedAudioTrack")(selectedAudioTrack.asInstanceOf[js.Any])
    if (selectedTextTrack != null) __obj.updateDynamic("selectedTextTrack")(selectedTextTrack.asInstanceOf[js.Any])
    if (selectedVideoTrack != null) __obj.updateDynamic("selectedVideoTrack")(selectedVideoTrack.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (stereoPan != null) __obj.updateDynamic("stereoPan")(stereoPan.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textTracks != null) __obj.updateDynamic("textTracks")(textTracks.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(useTextureView)) __obj.updateDynamic("useTextureView")(useTextureView.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeVideo.mod.VideoProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeVideo.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeVideo.mod.VideoProperties])(children: _*)
  }
  @JSImport("react-native-video", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

