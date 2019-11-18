package typingsJapgolly.expo.expoMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expo.buildARMod.ARFrame
import typingsJapgolly.expo.buildARMod.ARFrameRequest
import typingsJapgolly.expo.buildARMod.ARMatrices
import typingsJapgolly.expo.buildARMod.ARStartResult
import typingsJapgolly.expo.buildARMod.AnchorsDidUpdateEvent
import typingsJapgolly.expo.buildARMod.CameraDidChangeTrackingStateEvent
import typingsJapgolly.expo.buildARMod.DetectionImage
import typingsJapgolly.expo.buildARMod.DidFailWithErrorEvent
import typingsJapgolly.expo.buildARMod.EventType
import typingsJapgolly.expo.buildARMod.FrameDidUpdateEvent
import typingsJapgolly.expo.buildARMod.HitTestResultTypes
import typingsJapgolly.expo.buildARMod.HitTestResults
import typingsJapgolly.expo.buildARMod.Matrix
import typingsJapgolly.expo.buildARMod.PlaneDetection
import typingsJapgolly.expo.buildARMod.ReactNativeNodeHandle
import typingsJapgolly.expo.buildARMod.SessionInterruptionEndedEvent
import typingsJapgolly.expo.buildARMod.SessionWasInterruptedEvent
import typingsJapgolly.expo.buildARMod.TrackingConfiguration
import typingsJapgolly.expo.buildARMod.Vector2
import typingsJapgolly.expo.buildARMod.VideoFormat
import typingsJapgolly.expo.buildARMod.WorldAlignment
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.reactDashNative.reactDashNativeMod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "AR")
@js.native
object AR extends js.Object {
  val AnchorEventTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AnchorEventType */ js.Any = js.native
  val AnchorTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AnchorType */ js.Any = js.native
  val EventTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventType */ js.Any = js.native
  val FrameAttributes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FrameAttribute */ js.Any = js.native
  val PlaneDetectionTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaneDetection */ js.Any = js.native
  val TrackingConfigurations: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TrackingConfiguration */ js.Any = js.native
  val TrackingStateReasons: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TrackingStateReason */ js.Any = js.native
  val TrackingStates: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TrackingState */ js.Any = js.native
  val WorldAlignmentTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WorldAlignment */ js.Any = js.native
  def getARMatrices(near: Double, far: Double): ARMatrices = js.native
  def getAutoFocusEnabled(): Boolean = js.native
  def getCameraTexture(): Double = js.native
  def getCurrentFrame(): ARFrame = js.native
  def getCurrentFrame(attributes: ARFrameRequest): ARFrame = js.native
  def getLightEstimationEnabled(): Boolean = js.native
  def getPlaneDetection(): PlaneDetection = js.native
  def getProvidesAudioData(): Boolean = js.native
  def getSupportedVideoFormats(configuration: TrackingConfiguration): js.Array[VideoFormat] = js.native
  def getUnavailabilityReason(): String = js.native
  def getVersion(): String = js.native
  def getWorldAlignment(): WorldAlignment = js.native
  def isAvailable(): Boolean = js.native
  def isConfigurationAvailable(configuration: TrackingConfiguration): Boolean = js.native
  def isFrontCameraAvailable(): Boolean = js.native
  def isRearCameraAvailable(): Boolean = js.native
  def onAnchorsDidUpdate(listener: js.Function1[/* event */ AnchorsDidUpdateEvent, Unit]): EmitterSubscription = js.native
  def onCameraDidChangeTrackingState(listener: js.Function1[/* event */ CameraDidChangeTrackingStateEvent, Unit]): EmitterSubscription = js.native
  def onDidFailWithError(listener: js.Function1[/* event */ DidFailWithErrorEvent, Unit]): EmitterSubscription = js.native
  def onFrameDidUpdate(listener: js.Function1[/* event */ FrameDidUpdateEvent, Unit]): EmitterSubscription = js.native
  def onSessionInterruptionEnded(listener: js.Function1[/* event */ SessionInterruptionEndedEvent, Unit]): EmitterSubscription = js.native
  def onSessionWasInterrupted(listener: js.Function1[/* event */ SessionWasInterruptedEvent, Unit]): EmitterSubscription = js.native
  def pause(): Unit = js.native
  def performHitTest(point: Vector2, types: HitTestResultTypes): HitTestResults = js.native
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(eventType: EventType): Unit = js.native
  def reset(): Unit = js.native
  def resume(): Unit = js.native
  def setAutoFocusEnabled(isAutoFocusEnabled: Boolean): Unit = js.native
  def setConfigurationAsync(configuration: TrackingConfiguration): js.Promise[Unit] = js.native
  def setDetectionImagesAsync(images: StringDictionary[DetectionImage]): js.Promise[Unit] = js.native
  def setLightEstimationEnabled(isLightEstimationEnabled: Boolean): Unit = js.native
  def setPlaneDetection(planeDetection: PlaneDetection): Unit = js.native
  def setProvidesAudioData(providesAudioData: Boolean): Unit = js.native
  def setWorldAlignment(worldAlignment: WorldAlignment): Unit = js.native
  def setWorldOriginAsync(matrix_float4x4: Matrix): js.Promise[Unit] = js.native
  def startAsync(node: ReactNativeNodeHandle, configuration: TrackingConfiguration): js.Promise[ARStartResult] = js.native
  def startAsync(node: Component[js.Object, js.Object, _], configuration: TrackingConfiguration): js.Promise[ARStartResult] = js.native
  def stopAsync(): js.Promise[Unit] = js.native
  @js.native
  object AnchorEventType extends js.Object {
    /* "add" */ val Add: typingsJapgolly.expo.buildARMod.AnchorEventType.Add with String = js.native
    /* "remove" */ val Remove: typingsJapgolly.expo.buildARMod.AnchorEventType.Remove with String = js.native
    /* "update" */ val Update: typingsJapgolly.expo.buildARMod.AnchorEventType.Update with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.AnchorEventType with String] = js.native
  }
  
  @js.native
  object AnchorType extends js.Object {
    /* "ARAnchor" */ val Anchor: typingsJapgolly.expo.buildARMod.AnchorType.Anchor with String = js.native
    /* "ARFaceAnchor" */ val Face: typingsJapgolly.expo.buildARMod.AnchorType.Face with String = js.native
    /* "ARImageAnchor" */ val Image: typingsJapgolly.expo.buildARMod.AnchorType.Image with String = js.native
    /* "ARPlaneAnchor" */ val Plane: typingsJapgolly.expo.buildARMod.AnchorType.Plane with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.AnchorType with String] = js.native
  }
  
  @js.native
  object BlendShape extends js.Object {
    /* "browDown_L" */ val BrowDownL: typingsJapgolly.expo.buildARMod.BlendShape.BrowDownL with String = js.native
    /* "browDown_R" */ val BrowDownR: typingsJapgolly.expo.buildARMod.BlendShape.BrowDownR with String = js.native
    /* "browInnerUp" */ val BrowInnerUp: typingsJapgolly.expo.buildARMod.BlendShape.BrowInnerUp with String = js.native
    /* "browOuterUp_L" */ val BrowOuterUpL: typingsJapgolly.expo.buildARMod.BlendShape.BrowOuterUpL with String = js.native
    /* "browOuterUp_R" */ val BrowOuterUpR: typingsJapgolly.expo.buildARMod.BlendShape.BrowOuterUpR with String = js.native
    /* "cheekPuff" */ val CheekPuff: typingsJapgolly.expo.buildARMod.BlendShape.CheekPuff with String = js.native
    /* "cheekSquint_L" */ val CheekSquintL: typingsJapgolly.expo.buildARMod.BlendShape.CheekSquintL with String = js.native
    /* "cheekSquint_R" */ val CheekSquintR: typingsJapgolly.expo.buildARMod.BlendShape.CheekSquintR with String = js.native
    /* "eyeBlink_L" */ val EyeBlinkL: typingsJapgolly.expo.buildARMod.BlendShape.EyeBlinkL with String = js.native
    /* "eyeBlink_R" */ val EyeBlinkR: typingsJapgolly.expo.buildARMod.BlendShape.EyeBlinkR with String = js.native
    /* "eyeLookDown_L" */ val EyeLookDownL: typingsJapgolly.expo.buildARMod.BlendShape.EyeLookDownL with String = js.native
    /* "eyeLookDown_R" */ val EyeLookDownR: typingsJapgolly.expo.buildARMod.BlendShape.EyeLookDownR with String = js.native
    /* "eyeLookIn_L" */ val EyeLookInL: typingsJapgolly.expo.buildARMod.BlendShape.EyeLookInL with String = js.native
    /* "eyeLookIn_R" */ val EyeLookInR: typingsJapgolly.expo.buildARMod.BlendShape.EyeLookInR with String = js.native
    /* "eyeLookOut_L" */ val EyeLookOutL: typingsJapgolly.expo.buildARMod.BlendShape.EyeLookOutL with String = js.native
    /* "eyeLookOut_R" */ val EyeLookOutR: typingsJapgolly.expo.buildARMod.BlendShape.EyeLookOutR with String = js.native
    /* "eyeLookUp_L" */ val EyeLookUpL: typingsJapgolly.expo.buildARMod.BlendShape.EyeLookUpL with String = js.native
    /* "eyeLookUp_R" */ val EyeLookUpR: typingsJapgolly.expo.buildARMod.BlendShape.EyeLookUpR with String = js.native
    /* "eyeSquint_L" */ val EyeSquintL: typingsJapgolly.expo.buildARMod.BlendShape.EyeSquintL with String = js.native
    /* "eyeSquint_R" */ val EyeSquintR: typingsJapgolly.expo.buildARMod.BlendShape.EyeSquintR with String = js.native
    /* "eyeWide_L" */ val EyeWideL: typingsJapgolly.expo.buildARMod.BlendShape.EyeWideL with String = js.native
    /* "eyeWide_R" */ val EyeWideR: typingsJapgolly.expo.buildARMod.BlendShape.EyeWideR with String = js.native
    /* "jawForward" */ val JawForward: typingsJapgolly.expo.buildARMod.BlendShape.JawForward with String = js.native
    /* "jawLeft" */ val JawLeft: typingsJapgolly.expo.buildARMod.BlendShape.JawLeft with String = js.native
    /* "jawOpen" */ val JawOpen: typingsJapgolly.expo.buildARMod.BlendShape.JawOpen with String = js.native
    /* "jawRight" */ val JawRight: typingsJapgolly.expo.buildARMod.BlendShape.JawRight with String = js.native
    /* "mouthClose" */ val MouthClose: typingsJapgolly.expo.buildARMod.BlendShape.MouthClose with String = js.native
    /* "mouthDimple_L" */ val MouthDimpleL: typingsJapgolly.expo.buildARMod.BlendShape.MouthDimpleL with String = js.native
    /* "mouthDimple_R" */ val MouthDimpleR: typingsJapgolly.expo.buildARMod.BlendShape.MouthDimpleR with String = js.native
    /* "mouthFrown_L" */ val MouthFrownL: typingsJapgolly.expo.buildARMod.BlendShape.MouthFrownL with String = js.native
    /* "mouthFrown_R" */ val MouthFrownR: typingsJapgolly.expo.buildARMod.BlendShape.MouthFrownR with String = js.native
    /* "mouthFunnel" */ val MouthFunnel: typingsJapgolly.expo.buildARMod.BlendShape.MouthFunnel with String = js.native
    /* "mouthLeft" */ val MouthLeft: typingsJapgolly.expo.buildARMod.BlendShape.MouthLeft with String = js.native
    /* "mouthLowerDown_L" */ val MouthLowerDownL: typingsJapgolly.expo.buildARMod.BlendShape.MouthLowerDownL with String = js.native
    /* "mouthLowerDown_R" */ val MouthLowerDownR: typingsJapgolly.expo.buildARMod.BlendShape.MouthLowerDownR with String = js.native
    /* "mouthPress_L" */ val MouthPressL: typingsJapgolly.expo.buildARMod.BlendShape.MouthPressL with String = js.native
    /* "mouthPress_R" */ val MouthPressR: typingsJapgolly.expo.buildARMod.BlendShape.MouthPressR with String = js.native
    /* "mouthPucker" */ val MouthPucker: typingsJapgolly.expo.buildARMod.BlendShape.MouthPucker with String = js.native
    /* "mouthRight" */ val MouthRight: typingsJapgolly.expo.buildARMod.BlendShape.MouthRight with String = js.native
    /* "mouthRollLower" */ val MouthRollLower: typingsJapgolly.expo.buildARMod.BlendShape.MouthRollLower with String = js.native
    /* "mouthRollUpper" */ val MouthRollUpper: typingsJapgolly.expo.buildARMod.BlendShape.MouthRollUpper with String = js.native
    /* "mouthShrugLower" */ val MouthShrugLower: typingsJapgolly.expo.buildARMod.BlendShape.MouthShrugLower with String = js.native
    /* "mouthShrugUpper" */ val MouthShrugUpper: typingsJapgolly.expo.buildARMod.BlendShape.MouthShrugUpper with String = js.native
    /* "mouthSmile_L" */ val MouthSmileL: typingsJapgolly.expo.buildARMod.BlendShape.MouthSmileL with String = js.native
    /* "mouthSmile_R" */ val MouthSmileR: typingsJapgolly.expo.buildARMod.BlendShape.MouthSmileR with String = js.native
    /* "mouthStretch_L" */ val MouthStretchL: typingsJapgolly.expo.buildARMod.BlendShape.MouthStretchL with String = js.native
    /* "mouthStretch_R" */ val MouthStretchR: typingsJapgolly.expo.buildARMod.BlendShape.MouthStretchR with String = js.native
    /* "mouthUpperUp_L" */ val MouthUpperUpL: typingsJapgolly.expo.buildARMod.BlendShape.MouthUpperUpL with String = js.native
    /* "mouthUpperUp_R" */ val MouthUpperUpR: typingsJapgolly.expo.buildARMod.BlendShape.MouthUpperUpR with String = js.native
    /* "noseSneer_L" */ val NoseSneerL: typingsJapgolly.expo.buildARMod.BlendShape.NoseSneerL with String = js.native
    /* "noseSneer_R" */ val NoseSneerR: typingsJapgolly.expo.buildARMod.BlendShape.NoseSneerR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.BlendShape with String] = js.native
  }
  
  @js.native
  object DepthDataAccuracy extends js.Object {
    /* "AVDepthDataAccuracyAbsolute" */ val Absolute: typingsJapgolly.expo.buildARMod.DepthDataAccuracy.Absolute with String = js.native
    /* "AVDepthDataAccuracyRelative" */ val Relative: typingsJapgolly.expo.buildARMod.DepthDataAccuracy.Relative with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.DepthDataAccuracy with String] = js.native
  }
  
  @js.native
  object DepthDataQuality extends js.Object {
    /* "AVDepthDataQualityHigh" */ val High: typingsJapgolly.expo.buildARMod.DepthDataQuality.High with String = js.native
    /* "AVDepthDataQualityLow" */ val Low: typingsJapgolly.expo.buildARMod.DepthDataQuality.Low with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.DepthDataQuality with String] = js.native
  }
  
  @js.native
  object EventType extends js.Object {
    /* 2 */ val AnchorsDidUpdate: typingsJapgolly.expo.buildARMod.EventType.AnchorsDidUpdate with Double = js.native
    /* 3 */ val CameraDidChangeTrackingState: typingsJapgolly.expo.buildARMod.EventType.CameraDidChangeTrackingState with Double = js.native
    /* 1 */ val DidFailWithError: typingsJapgolly.expo.buildARMod.EventType.DidFailWithError with Double = js.native
    /* 0 */ val FrameDidUpdate: typingsJapgolly.expo.buildARMod.EventType.FrameDidUpdate with Double = js.native
    /* 5 */ val SessionInterruptionEnded: typingsJapgolly.expo.buildARMod.EventType.SessionInterruptionEnded with Double = js.native
    /* 4 */ val SessionWasInterrupted: typingsJapgolly.expo.buildARMod.EventType.SessionWasInterrupted with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.expo.buildARMod.EventType with Double] = js.native
  }
  
  @js.native
  object FaceAnchorProp extends js.Object {
    /* "blendShapes" */ val BlendShapes: typingsJapgolly.expo.buildARMod.FaceAnchorProp.BlendShapes with String = js.native
    /* "geometry" */ val Geometry: typingsJapgolly.expo.buildARMod.FaceAnchorProp.Geometry with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.FaceAnchorProp with String] = js.native
  }
  
  @js.native
  object FrameAttribute extends js.Object {
    /* "anchors" */ val Anchors: typingsJapgolly.expo.buildARMod.FrameAttribute.Anchors with String = js.native
    /* "capturedDepthData" */ val CapturedDepthData: typingsJapgolly.expo.buildARMod.FrameAttribute.CapturedDepthData with String = js.native
    /* "lightEstimation" */ val LightEstimation: typingsJapgolly.expo.buildARMod.FrameAttribute.LightEstimation with String = js.native
    /* "rawFeaturePoints" */ val RawFeaturePoints: typingsJapgolly.expo.buildARMod.FrameAttribute.RawFeaturePoints with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.FrameAttribute with String] = js.native
  }
  
  @js.native
  object HitTestResultTypes extends js.Object {
    /* "existingPlane" */ val ExistingPlane: typingsJapgolly.expo.buildARMod.HitTestResultTypes.ExistingPlane with String = js.native
    /* "existingPlaneUsingExtent" */ val ExistingPlaneUsingExtent: typingsJapgolly.expo.buildARMod.HitTestResultTypes.ExistingPlaneUsingExtent with String = js.native
    /* "existingPlaneUsingGeometry" */ val ExistingPlaneUsingGeometry: typingsJapgolly.expo.buildARMod.HitTestResultTypes.ExistingPlaneUsingGeometry with String = js.native
    /* "featurePoint" */ val FeaturePoint: typingsJapgolly.expo.buildARMod.HitTestResultTypes.FeaturePoint with String = js.native
    /* "horizontalPlane" */ val HorizontalPlane: typingsJapgolly.expo.buildARMod.HitTestResultTypes.HorizontalPlane with String = js.native
    /* "verticalPlane" */ val VerticalPlane: typingsJapgolly.expo.buildARMod.HitTestResultTypes.VerticalPlane with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.HitTestResultTypes with String] = js.native
  }
  
  @js.native
  object PlaneDetection extends js.Object {
    /* "horizontal" */ val Horizontal: typingsJapgolly.expo.buildARMod.PlaneDetection.Horizontal with String = js.native
    /* "none" */ val None: typingsJapgolly.expo.buildARMod.PlaneDetection.None with String = js.native
    /* "vertical" */ val Vertical: typingsJapgolly.expo.buildARMod.PlaneDetection.Vertical with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.PlaneDetection with String] = js.native
  }
  
  @js.native
  object TrackingConfiguration extends js.Object {
    /* "ARFaceTrackingConfiguration" */ val Face: typingsJapgolly.expo.buildARMod.TrackingConfiguration.Face with String = js.native
    /* "AROrientationTrackingConfiguration" */ val Orientation: typingsJapgolly.expo.buildARMod.TrackingConfiguration.Orientation with String = js.native
    /* "ARWorldTrackingConfiguration" */ val World: typingsJapgolly.expo.buildARMod.TrackingConfiguration.World with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.TrackingConfiguration with String] = js.native
  }
  
  @js.native
  object TrackingState extends js.Object {
    /* "ARTrackingStateLimited" */ val Limited: typingsJapgolly.expo.buildARMod.TrackingState.Limited with String = js.native
    /* "ARTrackingStateNormal" */ val Normal: typingsJapgolly.expo.buildARMod.TrackingState.Normal with String = js.native
    /* "ARTrackingStateNotAvailable" */ val NotAvailable: typingsJapgolly.expo.buildARMod.TrackingState.NotAvailable with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.TrackingState with String] = js.native
  }
  
  @js.native
  object TrackingStateReason extends js.Object {
    /* "ARTrackingStateReasonExcessiveMotion" */ val ExcessiveMotion: typingsJapgolly.expo.buildARMod.TrackingStateReason.ExcessiveMotion with String = js.native
    /* "ARTrackingStateReasonInitializing" */ val Initializing: typingsJapgolly.expo.buildARMod.TrackingStateReason.Initializing with String = js.native
    /* "ARTrackingStateReasonInsufficientFeatures" */ val InsufficientFeatures: typingsJapgolly.expo.buildARMod.TrackingStateReason.InsufficientFeatures with String = js.native
    /* "ARTrackingStateReasonNone" */ val None: typingsJapgolly.expo.buildARMod.TrackingStateReason.None with String = js.native
    /* "ARTrackingStateReasonRelocalizing" */ val Relocalizing: typingsJapgolly.expo.buildARMod.TrackingStateReason.Relocalizing with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.TrackingStateReason with String] = js.native
  }
  
  @js.native
  object WorldAlignment extends js.Object {
    /* "alignmentCamera" */ val AlignmentCamera: typingsJapgolly.expo.buildARMod.WorldAlignment.AlignmentCamera with String = js.native
    /* "gravity" */ val Gravity: typingsJapgolly.expo.buildARMod.WorldAlignment.Gravity with String = js.native
    /* "gravityAndHeading" */ val GravityAndHeading: typingsJapgolly.expo.buildARMod.WorldAlignment.GravityAndHeading with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.buildARMod.WorldAlignment with String] = js.native
  }
  
}

