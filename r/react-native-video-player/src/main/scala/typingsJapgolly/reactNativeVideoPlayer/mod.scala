package typingsJapgolly.reactNativeVideoPlayer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.PointerEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeVideo.anon.BufferForPlaybackAfterRebufferMs
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
import typingsJapgolly.reactNativeVideoPlayer.anon.ControlButton
import typingsJapgolly.reactNativeVideoPlayer.anon.MainVer
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.`box-none`
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.`box-only`
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.all
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.assertive
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.auto
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.contain
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.cover
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.duck
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.ignore
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.inherit
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.landscape
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.mix
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.no
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.none
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.obey
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.polite
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.portrait
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.stretch
import typingsJapgolly.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-video-player", JSImport.Default)
  @js.native
  open class default protected () extends VideoPlayer {
    def this(props: js.Object) = this()
  }
  
  @js.native
  trait VideoPlayer extends Component[VideoPlayerProps, VideoPlayerState, Any] {
    
    /* private */ def getSizeStyles(): Any = js.native
    
    /* private */ def hideControls(): Any = js.native
    
    /* private */ def onEnd(event: Any): Any = js.native
    
    /* private */ def onLayout(event: Any): Any = js.native
    
    /* private */ def onLoad(event: Any): Any = js.native
    
    /* private */ def onMutePress(): Any = js.native
    
    /* private */ def onPlayPress(): Any = js.native
    
    /* private */ def onProgress(event: Any): Any = js.native
    
    /* private */ def onSeek(event: Any): Any = js.native
    
    /* private */ def onSeekBarLayout(event: Any): Any = js.native
    
    /* private */ def onSeekGrant(event: Any): Any = js.native
    
    /* private */ def onSeekRelease(): Any = js.native
    
    /* private */ def onStartPress(): Any = js.native
    
    /* private */ def onToggleFullScreen(): Any = js.native
    
    def pause(): Any = js.native
    
    def resume(): Any = js.native
    
    def seek(t: Double): Any = js.native
    
    /* private */ var seekBarWidth: Double = js.native
    
    /* private */ var seekProgressStart: Double = js.native
    
    /* private */ var seekTouchStart: Double = js.native
    
    /* private */ def showControls(): Any = js.native
    
    def stop(): Any = js.native
    
    /* private */ var wasPlayingBeforeSeek: Boolean = js.native
  }
  
  /* Inlined parent std.Omit<react-native-video.react-native-video.VideoProperties, 'source'> */
  trait VideoPlayerProps extends StObject {
    
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityHint: js.UndefOr[String] = js.undefined
    
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var accessibilityLanguage: js.UndefOr[String] = js.undefined
    
    var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
    
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    var allowsExternalPlayback: js.UndefOr[Boolean] = js.undefined
    
    var audioOnly: js.UndefOr[Boolean] = js.undefined
    
    var automaticallyWaitsToMinimizeStalling: js.UndefOr[Boolean] = js.undefined
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var bufferConfig: js.UndefOr[BufferForPlaybackAfterRebufferMs] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var collapsable: js.UndefOr[Boolean] = js.undefined
    
    var controls: js.UndefOr[Boolean] = js.undefined
    
    var controlsTimeout: js.UndefOr[Double] = js.undefined
    
    var currentTime: js.UndefOr[Double] = js.undefined
    
    var customStyles: js.UndefOr[ControlButton] = js.undefined
    
    var defaultMuted: js.UndefOr[Boolean] = js.undefined
    
    var disableControlsAutoHide: js.UndefOr[Boolean] = js.undefined
    
    var disableFocus: js.UndefOr[Boolean] = js.undefined
    
    var disableFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var disableSeek: js.UndefOr[Boolean] = js.undefined
    
    var drm: js.UndefOr[DRMSettings] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var endThumbnail: js.UndefOr[ImageSourcePropType] = js.undefined
    
    var endWithThumbnail: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[FilterType] = js.undefined
    
    var filterEnabled: js.UndefOr[Boolean] = js.undefined
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var fullScreenOnLongPress: js.UndefOr[Boolean] = js.undefined
    
    var fullscreen: js.UndefOr[Boolean] = js.undefined
    
    var fullscreenAutorotate: js.UndefOr[Boolean] = js.undefined
    
    var fullscreenOrientation: js.UndefOr[all | landscape | portrait] = js.undefined
    
    var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
    
    var hideControlsOnStart: js.UndefOr[Boolean] = js.undefined
    
    var hideShutterView: js.UndefOr[Boolean] = js.undefined
    
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    var ignoreSilentSwitch: js.UndefOr[ignore | obey] = js.undefined
    
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    var isTVSelectable: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var maxBitRate: js.UndefOr[Double] = js.undefined
    
    var minLoadRetryCount: js.UndefOr[Double] = js.undefined
    
    var mixWithOthers: js.UndefOr[inherit | mix | duck] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var nativeID: js.UndefOr[String] = js.undefined
    
    var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
    
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAudioBecomingNoisy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAudioFocusChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onBandwidthUpdate: js.UndefOr[js.Function1[/* data */ OnBandwidthUpdateData, Unit]] = js.undefined
    
    var onBuffer: js.UndefOr[js.Function1[/* data */ OnBufferData, Unit]] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ LoadError, Unit]] = js.undefined
    
    var onExternalPlaybackChange: js.UndefOr[js.Function1[/* data */ OnExternalPlaybackChangeData, Unit]] = js.undefined
    
    var onFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFullscreenPlayerDidPresent: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFullscreenPlayerWillPresent: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHideControls: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* data */ OnLoadData, Unit]] = js.undefined
    
    var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onMutePress: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onPictureInPictureStatusChanged: js.UndefOr[js.Function1[/* data */ OnPictureInPictureStatusData, Unit]] = js.undefined
    
    var onPlayPress: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onPlaybackRateChange: js.UndefOr[js.Function1[/* data */ OnPlaybackRateData, Unit]] = js.undefined
    
    var onPlaybackResume: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPlaybackStalled: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onProgress: js.UndefOr[js.Function1[/* data */ OnProgressData, Unit]] = js.undefined
    
    var onReadyForDisplay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onRestoreUserInterfaceForPictureInPictureStop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSeek: js.UndefOr[js.Function1[/* data */ OnSeekData, Unit]] = js.undefined
    
    var onShowControls: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onStart: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onTimedMetadata: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onVideoBuffer: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVideoEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVideoError: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVideoFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVideoFullscreenPlayerDidPresent: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVideoFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVideoFullscreenPlayerWillPresent: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVideoLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVideoLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVideoProgress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVideoSeek: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var pauseOnPress: js.UndefOr[Boolean] = js.undefined
    
    var paused: js.UndefOr[Boolean] = js.undefined
    
    var pictureInPicture: js.UndefOr[Boolean] = js.undefined
    
    var playInBackground: js.UndefOr[Boolean] = js.undefined
    
    var playWhenInactive: js.UndefOr[Boolean] = js.undefined
    
    var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
    
    var poster: js.UndefOr[String] = js.undefined
    
    var posterResizeMode: js.UndefOr[stretch | contain | cover | none] = js.undefined
    
    var preferredForwardBufferDuration: js.UndefOr[Double] = js.undefined
    
    var preventsDisplaySleepDuringVideoPlayback: js.UndefOr[Boolean] = js.undefined
    
    var progressUpdateInterval: js.UndefOr[Double] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
    
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
    
    var repeat: js.UndefOr[Boolean] = js.undefined
    
    var reportBandwidth: js.UndefOr[Boolean] = js.undefined
    
    var resizeMode: js.UndefOr[stretch | contain | cover | none] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var scaleX: js.UndefOr[Double] = js.undefined
    
    var scaleY: js.UndefOr[Double] = js.undefined
    
    var seek: js.UndefOr[Double] = js.undefined
    
    var selectedAudioTrack: js.UndefOr[Type] = js.undefined
    
    var selectedTextTrack: js.UndefOr[Type] = js.undefined
    
    var selectedVideoTrack: js.UndefOr[Value] = js.undefined
    
    var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
    
    var showDuration: js.UndefOr[Boolean] = js.undefined
    
    var src: js.UndefOr[Any] = js.undefined
    
    var stereoPan: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var textTracks: js.UndefOr[js.Array[Language]] = js.undefined
    
    var thumbnail: js.UndefOr[ImageSourcePropType] = js.undefined
    
    var translateX: js.UndefOr[Double] = js.undefined
    
    var translateY: js.UndefOr[Double] = js.undefined
    
    var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
    
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
    
    var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
    
    var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
    
    var useTextureView: js.UndefOr[Boolean] = js.undefined
    
    var video: js.UndefOr[MainVer | Double] = js.undefined
    
    var videoHeight: js.UndefOr[Double] = js.undefined
    
    var videoWidth: js.UndefOr[Double] = js.undefined
    
    var volume: js.UndefOr[Double] = js.undefined
  }
  object VideoPlayerProps {
    
    inline def apply(): VideoPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoPlayerProps]
    }
    
    extension [Self <: VideoPlayerProps](x: Self) {
      
      inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
      
      inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
      
      inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
      
      inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
      
      inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setAllowsExternalPlayback(value: Boolean): Self = StObject.set(x, "allowsExternalPlayback", value.asInstanceOf[js.Any])
      
      inline def setAllowsExternalPlaybackUndefined: Self = StObject.set(x, "allowsExternalPlayback", js.undefined)
      
      inline def setAudioOnly(value: Boolean): Self = StObject.set(x, "audioOnly", value.asInstanceOf[js.Any])
      
      inline def setAudioOnlyUndefined: Self = StObject.set(x, "audioOnly", js.undefined)
      
      inline def setAutomaticallyWaitsToMinimizeStalling(value: Boolean): Self = StObject.set(x, "automaticallyWaitsToMinimizeStalling", value.asInstanceOf[js.Any])
      
      inline def setAutomaticallyWaitsToMinimizeStallingUndefined: Self = StObject.set(x, "automaticallyWaitsToMinimizeStalling", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBufferConfig(value: BufferForPlaybackAfterRebufferMs): Self = StObject.set(x, "bufferConfig", value.asInstanceOf[js.Any])
      
      inline def setBufferConfigUndefined: Self = StObject.set(x, "bufferConfig", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsTimeout(value: Double): Self = StObject.set(x, "controlsTimeout", value.asInstanceOf[js.Any])
      
      inline def setControlsTimeoutUndefined: Self = StObject.set(x, "controlsTimeout", js.undefined)
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
      
      inline def setCustomStyles(value: ControlButton): Self = StObject.set(x, "customStyles", value.asInstanceOf[js.Any])
      
      inline def setCustomStylesUndefined: Self = StObject.set(x, "customStyles", js.undefined)
      
      inline def setDefaultMuted(value: Boolean): Self = StObject.set(x, "defaultMuted", value.asInstanceOf[js.Any])
      
      inline def setDefaultMutedUndefined: Self = StObject.set(x, "defaultMuted", js.undefined)
      
      inline def setDisableControlsAutoHide(value: Boolean): Self = StObject.set(x, "disableControlsAutoHide", value.asInstanceOf[js.Any])
      
      inline def setDisableControlsAutoHideUndefined: Self = StObject.set(x, "disableControlsAutoHide", js.undefined)
      
      inline def setDisableFocus(value: Boolean): Self = StObject.set(x, "disableFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableFocusUndefined: Self = StObject.set(x, "disableFocus", js.undefined)
      
      inline def setDisableFullscreen(value: Boolean): Self = StObject.set(x, "disableFullscreen", value.asInstanceOf[js.Any])
      
      inline def setDisableFullscreenUndefined: Self = StObject.set(x, "disableFullscreen", js.undefined)
      
      inline def setDisableSeek(value: Boolean): Self = StObject.set(x, "disableSeek", value.asInstanceOf[js.Any])
      
      inline def setDisableSeekUndefined: Self = StObject.set(x, "disableSeek", js.undefined)
      
      inline def setDrm(value: DRMSettings): Self = StObject.set(x, "drm", value.asInstanceOf[js.Any])
      
      inline def setDrmUndefined: Self = StObject.set(x, "drm", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEndThumbnail(value: ImageSourcePropType): Self = StObject.set(x, "endThumbnail", value.asInstanceOf[js.Any])
      
      inline def setEndThumbnailUndefined: Self = StObject.set(x, "endThumbnail", js.undefined)
      
      inline def setEndThumbnailVarargs(value: ImageURISource*): Self = StObject.set(x, "endThumbnail", js.Array(value*))
      
      inline def setEndWithThumbnail(value: Boolean): Self = StObject.set(x, "endWithThumbnail", value.asInstanceOf[js.Any])
      
      inline def setEndWithThumbnailUndefined: Self = StObject.set(x, "endWithThumbnail", js.undefined)
      
      inline def setFilter(value: FilterType): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterEnabled(value: Boolean): Self = StObject.set(x, "filterEnabled", value.asInstanceOf[js.Any])
      
      inline def setFilterEnabledUndefined: Self = StObject.set(x, "filterEnabled", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setFullScreenOnLongPress(value: Boolean): Self = StObject.set(x, "fullScreenOnLongPress", value.asInstanceOf[js.Any])
      
      inline def setFullScreenOnLongPressUndefined: Self = StObject.set(x, "fullScreenOnLongPress", js.undefined)
      
      inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenAutorotate(value: Boolean): Self = StObject.set(x, "fullscreenAutorotate", value.asInstanceOf[js.Any])
      
      inline def setFullscreenAutorotateUndefined: Self = StObject.set(x, "fullscreenAutorotate", js.undefined)
      
      inline def setFullscreenOrientation(value: all | landscape | portrait): Self = StObject.set(x, "fullscreenOrientation", value.asInstanceOf[js.Any])
      
      inline def setFullscreenOrientationUndefined: Self = StObject.set(x, "fullscreenOrientation", js.undefined)
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      inline def setHideControlsOnStart(value: Boolean): Self = StObject.set(x, "hideControlsOnStart", value.asInstanceOf[js.Any])
      
      inline def setHideControlsOnStartUndefined: Self = StObject.set(x, "hideControlsOnStart", js.undefined)
      
      inline def setHideShutterView(value: Boolean): Self = StObject.set(x, "hideShutterView", value.asInstanceOf[js.Any])
      
      inline def setHideShutterViewUndefined: Self = StObject.set(x, "hideShutterView", js.undefined)
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setIgnoreSilentSwitch(value: ignore | obey): Self = StObject.set(x, "ignoreSilentSwitch", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSilentSwitchUndefined: Self = StObject.set(x, "ignoreSilentSwitch", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMaxBitRate(value: Double): Self = StObject.set(x, "maxBitRate", value.asInstanceOf[js.Any])
      
      inline def setMaxBitRateUndefined: Self = StObject.set(x, "maxBitRate", js.undefined)
      
      inline def setMinLoadRetryCount(value: Double): Self = StObject.set(x, "minLoadRetryCount", value.asInstanceOf[js.Any])
      
      inline def setMinLoadRetryCountUndefined: Self = StObject.set(x, "minLoadRetryCount", js.undefined)
      
      inline def setMixWithOthers(value: inherit | mix | duck): Self = StObject.set(x, "mixWithOthers", value.asInstanceOf[js.Any])
      
      inline def setMixWithOthersUndefined: Self = StObject.set(x, "mixWithOthers", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      inline def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(value: Callback): Self = StObject.set(x, "onAccessibilityEscape", value.toJsFn)
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(value: Callback): Self = StObject.set(x, "onAccessibilityTap", value.toJsFn)
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnAudioBecomingNoisy(value: Callback): Self = StObject.set(x, "onAudioBecomingNoisy", value.toJsFn)
      
      inline def setOnAudioBecomingNoisyUndefined: Self = StObject.set(x, "onAudioBecomingNoisy", js.undefined)
      
      inline def setOnAudioFocusChanged(value: Callback): Self = StObject.set(x, "onAudioFocusChanged", value.toJsFn)
      
      inline def setOnAudioFocusChangedUndefined: Self = StObject.set(x, "onAudioFocusChanged", js.undefined)
      
      inline def setOnBandwidthUpdate(value: /* data */ OnBandwidthUpdateData => Callback): Self = StObject.set(x, "onBandwidthUpdate", js.Any.fromFunction1((t0: /* data */ OnBandwidthUpdateData) => value(t0).runNow()))
      
      inline def setOnBandwidthUpdateUndefined: Self = StObject.set(x, "onBandwidthUpdate", js.undefined)
      
      inline def setOnBuffer(value: /* data */ OnBufferData => Callback): Self = StObject.set(x, "onBuffer", js.Any.fromFunction1((t0: /* data */ OnBufferData) => value(t0).runNow()))
      
      inline def setOnBufferUndefined: Self = StObject.set(x, "onBuffer", js.undefined)
      
      inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnError(value: /* error */ LoadError => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ LoadError) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnExternalPlaybackChange(value: /* data */ OnExternalPlaybackChangeData => Callback): Self = StObject.set(x, "onExternalPlaybackChange", js.Any.fromFunction1((t0: /* data */ OnExternalPlaybackChangeData) => value(t0).runNow()))
      
      inline def setOnExternalPlaybackChangeUndefined: Self = StObject.set(x, "onExternalPlaybackChange", js.undefined)
      
      inline def setOnFullscreenPlayerDidDismiss(value: Callback): Self = StObject.set(x, "onFullscreenPlayerDidDismiss", value.toJsFn)
      
      inline def setOnFullscreenPlayerDidDismissUndefined: Self = StObject.set(x, "onFullscreenPlayerDidDismiss", js.undefined)
      
      inline def setOnFullscreenPlayerDidPresent(value: Callback): Self = StObject.set(x, "onFullscreenPlayerDidPresent", value.toJsFn)
      
      inline def setOnFullscreenPlayerDidPresentUndefined: Self = StObject.set(x, "onFullscreenPlayerDidPresent", js.undefined)
      
      inline def setOnFullscreenPlayerWillDismiss(value: Callback): Self = StObject.set(x, "onFullscreenPlayerWillDismiss", value.toJsFn)
      
      inline def setOnFullscreenPlayerWillDismissUndefined: Self = StObject.set(x, "onFullscreenPlayerWillDismiss", js.undefined)
      
      inline def setOnFullscreenPlayerWillPresent(value: Callback): Self = StObject.set(x, "onFullscreenPlayerWillPresent", value.toJsFn)
      
      inline def setOnFullscreenPlayerWillPresentUndefined: Self = StObject.set(x, "onFullscreenPlayerWillPresent", js.undefined)
      
      inline def setOnHideControls(value: CallbackTo[Any]): Self = StObject.set(x, "onHideControls", value.toJsFn)
      
      inline def setOnHideControlsUndefined: Self = StObject.set(x, "onHideControls", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Callback): Self = StObject.set(x, "onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnLoad(value: /* data */ OnLoadData => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: /* data */ OnLoadData) => value(t0).runNow()))
      
      inline def setOnLoadStart(value: Callback): Self = StObject.set(x, "onLoadStart", value.toJsFn)
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnMagicTap(value: Callback): Self = StObject.set(x, "onMagicTap", value.toJsFn)
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      inline def setOnMutePress(value: CallbackTo[Any]): Self = StObject.set(x, "onMutePress", value.toJsFn)
      
      inline def setOnMutePressUndefined: Self = StObject.set(x, "onMutePress", js.undefined)
      
      inline def setOnPictureInPictureStatusChanged(value: /* data */ OnPictureInPictureStatusData => Callback): Self = StObject.set(x, "onPictureInPictureStatusChanged", js.Any.fromFunction1((t0: /* data */ OnPictureInPictureStatusData) => value(t0).runNow()))
      
      inline def setOnPictureInPictureStatusChangedUndefined: Self = StObject.set(x, "onPictureInPictureStatusChanged", js.undefined)
      
      inline def setOnPlayPress(value: CallbackTo[Any]): Self = StObject.set(x, "onPlayPress", value.toJsFn)
      
      inline def setOnPlayPressUndefined: Self = StObject.set(x, "onPlayPress", js.undefined)
      
      inline def setOnPlaybackRateChange(value: /* data */ OnPlaybackRateData => Callback): Self = StObject.set(x, "onPlaybackRateChange", js.Any.fromFunction1((t0: /* data */ OnPlaybackRateData) => value(t0).runNow()))
      
      inline def setOnPlaybackRateChangeUndefined: Self = StObject.set(x, "onPlaybackRateChange", js.undefined)
      
      inline def setOnPlaybackResume(value: Callback): Self = StObject.set(x, "onPlaybackResume", value.toJsFn)
      
      inline def setOnPlaybackResumeUndefined: Self = StObject.set(x, "onPlaybackResume", js.undefined)
      
      inline def setOnPlaybackStalled(value: Callback): Self = StObject.set(x, "onPlaybackStalled", value.toJsFn)
      
      inline def setOnPlaybackStalledUndefined: Self = StObject.set(x, "onPlaybackStalled", js.undefined)
      
      inline def setOnPointerCancel(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerCancelCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerDownCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerEnterCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerLeaveCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerMoveCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerUp(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerUpCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
      
      inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnProgress(value: /* data */ OnProgressData => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: /* data */ OnProgressData) => value(t0).runNow()))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnReadyForDisplay(value: Callback): Self = StObject.set(x, "onReadyForDisplay", value.toJsFn)
      
      inline def setOnReadyForDisplayUndefined: Self = StObject.set(x, "onReadyForDisplay", js.undefined)
      
      inline def setOnResponderEnd(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      inline def setOnResponderGrant(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      inline def setOnResponderMove(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      inline def setOnResponderReject(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      inline def setOnResponderRelease(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      inline def setOnResponderStart(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      inline def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      inline def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      inline def setOnRestoreUserInterfaceForPictureInPictureStop(value: Callback): Self = StObject.set(x, "onRestoreUserInterfaceForPictureInPictureStop", value.toJsFn)
      
      inline def setOnRestoreUserInterfaceForPictureInPictureStopUndefined: Self = StObject.set(x, "onRestoreUserInterfaceForPictureInPictureStop", js.undefined)
      
      inline def setOnSeek(value: /* data */ OnSeekData => Callback): Self = StObject.set(x, "onSeek", js.Any.fromFunction1((t0: /* data */ OnSeekData) => value(t0).runNow()))
      
      inline def setOnSeekUndefined: Self = StObject.set(x, "onSeek", js.undefined)
      
      inline def setOnShowControls(value: CallbackTo[Any]): Self = StObject.set(x, "onShowControls", value.toJsFn)
      
      inline def setOnShowControlsUndefined: Self = StObject.set(x, "onShowControls", js.undefined)
      
      inline def setOnStart(value: CallbackTo[Any]): Self = StObject.set(x, "onStart", value.toJsFn)
      
      inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnTimedMetadata(value: Callback): Self = StObject.set(x, "onTimedMetadata", value.toJsFn)
      
      inline def setOnTimedMetadataUndefined: Self = StObject.set(x, "onTimedMetadata", js.undefined)
      
      inline def setOnTouchCancel(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnVideoBuffer(value: Callback): Self = StObject.set(x, "onVideoBuffer", value.toJsFn)
      
      inline def setOnVideoBufferUndefined: Self = StObject.set(x, "onVideoBuffer", js.undefined)
      
      inline def setOnVideoEnd(value: Callback): Self = StObject.set(x, "onVideoEnd", value.toJsFn)
      
      inline def setOnVideoEndUndefined: Self = StObject.set(x, "onVideoEnd", js.undefined)
      
      inline def setOnVideoError(value: Callback): Self = StObject.set(x, "onVideoError", value.toJsFn)
      
      inline def setOnVideoErrorUndefined: Self = StObject.set(x, "onVideoError", js.undefined)
      
      inline def setOnVideoFullscreenPlayerDidDismiss(value: Callback): Self = StObject.set(x, "onVideoFullscreenPlayerDidDismiss", value.toJsFn)
      
      inline def setOnVideoFullscreenPlayerDidDismissUndefined: Self = StObject.set(x, "onVideoFullscreenPlayerDidDismiss", js.undefined)
      
      inline def setOnVideoFullscreenPlayerDidPresent(value: Callback): Self = StObject.set(x, "onVideoFullscreenPlayerDidPresent", value.toJsFn)
      
      inline def setOnVideoFullscreenPlayerDidPresentUndefined: Self = StObject.set(x, "onVideoFullscreenPlayerDidPresent", js.undefined)
      
      inline def setOnVideoFullscreenPlayerWillDismiss(value: Callback): Self = StObject.set(x, "onVideoFullscreenPlayerWillDismiss", value.toJsFn)
      
      inline def setOnVideoFullscreenPlayerWillDismissUndefined: Self = StObject.set(x, "onVideoFullscreenPlayerWillDismiss", js.undefined)
      
      inline def setOnVideoFullscreenPlayerWillPresent(value: Callback): Self = StObject.set(x, "onVideoFullscreenPlayerWillPresent", value.toJsFn)
      
      inline def setOnVideoFullscreenPlayerWillPresentUndefined: Self = StObject.set(x, "onVideoFullscreenPlayerWillPresent", js.undefined)
      
      inline def setOnVideoLoad(value: Callback): Self = StObject.set(x, "onVideoLoad", value.toJsFn)
      
      inline def setOnVideoLoadStart(value: Callback): Self = StObject.set(x, "onVideoLoadStart", value.toJsFn)
      
      inline def setOnVideoLoadStartUndefined: Self = StObject.set(x, "onVideoLoadStart", js.undefined)
      
      inline def setOnVideoLoadUndefined: Self = StObject.set(x, "onVideoLoad", js.undefined)
      
      inline def setOnVideoProgress(value: Callback): Self = StObject.set(x, "onVideoProgress", value.toJsFn)
      
      inline def setOnVideoProgressUndefined: Self = StObject.set(x, "onVideoProgress", js.undefined)
      
      inline def setOnVideoSeek(value: Callback): Self = StObject.set(x, "onVideoSeek", value.toJsFn)
      
      inline def setOnVideoSeekUndefined: Self = StObject.set(x, "onVideoSeek", js.undefined)
      
      inline def setPauseOnPress(value: Boolean): Self = StObject.set(x, "pauseOnPress", value.asInstanceOf[js.Any])
      
      inline def setPauseOnPressUndefined: Self = StObject.set(x, "pauseOnPress", js.undefined)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      inline def setPictureInPicture(value: Boolean): Self = StObject.set(x, "pictureInPicture", value.asInstanceOf[js.Any])
      
      inline def setPictureInPictureUndefined: Self = StObject.set(x, "pictureInPicture", js.undefined)
      
      inline def setPlayInBackground(value: Boolean): Self = StObject.set(x, "playInBackground", value.asInstanceOf[js.Any])
      
      inline def setPlayInBackgroundUndefined: Self = StObject.set(x, "playInBackground", js.undefined)
      
      inline def setPlayWhenInactive(value: Boolean): Self = StObject.set(x, "playWhenInactive", value.asInstanceOf[js.Any])
      
      inline def setPlayWhenInactiveUndefined: Self = StObject.set(x, "playWhenInactive", js.undefined)
      
      inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setPosterResizeMode(value: stretch | contain | cover | none): Self = StObject.set(x, "posterResizeMode", value.asInstanceOf[js.Any])
      
      inline def setPosterResizeModeUndefined: Self = StObject.set(x, "posterResizeMode", js.undefined)
      
      inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      inline def setPreferredForwardBufferDuration(value: Double): Self = StObject.set(x, "preferredForwardBufferDuration", value.asInstanceOf[js.Any])
      
      inline def setPreferredForwardBufferDurationUndefined: Self = StObject.set(x, "preferredForwardBufferDuration", js.undefined)
      
      inline def setPreventsDisplaySleepDuringVideoPlayback(value: Boolean): Self = StObject.set(x, "preventsDisplaySleepDuringVideoPlayback", value.asInstanceOf[js.Any])
      
      inline def setPreventsDisplaySleepDuringVideoPlaybackUndefined: Self = StObject.set(x, "preventsDisplaySleepDuringVideoPlayback", js.undefined)
      
      inline def setProgressUpdateInterval(value: Double): Self = StObject.set(x, "progressUpdateInterval", value.asInstanceOf[js.Any])
      
      inline def setProgressUpdateIntervalUndefined: Self = StObject.set(x, "progressUpdateInterval", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setReportBandwidth(value: Boolean): Self = StObject.set(x, "reportBandwidth", value.asInstanceOf[js.Any])
      
      inline def setReportBandwidthUndefined: Self = StObject.set(x, "reportBandwidth", js.undefined)
      
      inline def setResizeMode(value: stretch | contain | cover | none): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      inline def setSeek(value: Double): Self = StObject.set(x, "seek", value.asInstanceOf[js.Any])
      
      inline def setSeekUndefined: Self = StObject.set(x, "seek", js.undefined)
      
      inline def setSelectedAudioTrack(value: Type): Self = StObject.set(x, "selectedAudioTrack", value.asInstanceOf[js.Any])
      
      inline def setSelectedAudioTrackUndefined: Self = StObject.set(x, "selectedAudioTrack", js.undefined)
      
      inline def setSelectedTextTrack(value: Type): Self = StObject.set(x, "selectedTextTrack", value.asInstanceOf[js.Any])
      
      inline def setSelectedTextTrackUndefined: Self = StObject.set(x, "selectedTextTrack", js.undefined)
      
      inline def setSelectedVideoTrack(value: Value): Self = StObject.set(x, "selectedVideoTrack", value.asInstanceOf[js.Any])
      
      inline def setSelectedVideoTrackUndefined: Self = StObject.set(x, "selectedVideoTrack", js.undefined)
      
      inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      inline def setShowDuration(value: Boolean): Self = StObject.set(x, "showDuration", value.asInstanceOf[js.Any])
      
      inline def setShowDurationUndefined: Self = StObject.set(x, "showDuration", js.undefined)
      
      inline def setSrc(value: Any): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStereoPan(value: Double): Self = StObject.set(x, "stereoPan", value.asInstanceOf[js.Any])
      
      inline def setStereoPanUndefined: Self = StObject.set(x, "stereoPan", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTextTracks(value: js.Array[Language]): Self = StObject.set(x, "textTracks", value.asInstanceOf[js.Any])
      
      inline def setTextTracksUndefined: Self = StObject.set(x, "textTracks", js.undefined)
      
      inline def setTextTracksVarargs(value: Language*): Self = StObject.set(x, "textTracks", js.Array(value*))
      
      inline def setThumbnail(value: ImageSourcePropType): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      inline def setThumbnailVarargs(value: ImageURISource*): Self = StObject.set(x, "thumbnail", js.Array(value*))
      
      inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
      
      inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
      
      inline def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
      
      inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      inline def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
      
      inline def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
      
      inline def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
      
      inline def setUseTextureView(value: Boolean): Self = StObject.set(x, "useTextureView", value.asInstanceOf[js.Any])
      
      inline def setUseTextureViewUndefined: Self = StObject.set(x, "useTextureView", js.undefined)
      
      inline def setVideo(value: MainVer | Double): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoHeight(value: Double): Self = StObject.set(x, "videoHeight", value.asInstanceOf[js.Any])
      
      inline def setVideoHeightUndefined: Self = StObject.set(x, "videoHeight", js.undefined)
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      inline def setVideoWidth(value: Double): Self = StObject.set(x, "videoWidth", value.asInstanceOf[js.Any])
      
      inline def setVideoWidthUndefined: Self = StObject.set(x, "videoWidth", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  trait VideoPlayerState extends StObject {
    
    var duration: Double
    
    var hasEnded: Boolean
    
    var isControlsVisible: Boolean
    
    var isMuted: Boolean
    
    var isPlaying: Boolean
    
    var isSeeking: Boolean
    
    var isStarted: Boolean
    
    var progress: Double
    
    var width: Double
  }
  object VideoPlayerState {
    
    inline def apply(
      duration: Double,
      hasEnded: Boolean,
      isControlsVisible: Boolean,
      isMuted: Boolean,
      isPlaying: Boolean,
      isSeeking: Boolean,
      isStarted: Boolean,
      progress: Double,
      width: Double
    ): VideoPlayerState = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], hasEnded = hasEnded.asInstanceOf[js.Any], isControlsVisible = isControlsVisible.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPlaying = isPlaying.asInstanceOf[js.Any], isSeeking = isSeeking.asInstanceOf[js.Any], isStarted = isStarted.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoPlayerState]
    }
    
    extension [Self <: VideoPlayerState](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setHasEnded(value: Boolean): Self = StObject.set(x, "hasEnded", value.asInstanceOf[js.Any])
      
      inline def setIsControlsVisible(value: Boolean): Self = StObject.set(x, "isControlsVisible", value.asInstanceOf[js.Any])
      
      inline def setIsMuted(value: Boolean): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
      
      inline def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
      
      inline def setIsSeeking(value: Boolean): Self = StObject.set(x, "isSeeking", value.asInstanceOf[js.Any])
      
      inline def setIsStarted(value: Boolean): Self = StObject.set(x, "isStarted", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
