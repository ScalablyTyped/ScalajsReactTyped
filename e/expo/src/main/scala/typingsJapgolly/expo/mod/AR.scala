package typingsJapgolly.expo.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expo.aRMod.ARFrame
import typingsJapgolly.expo.aRMod.ARFrameRequest
import typingsJapgolly.expo.aRMod.ARMatrices
import typingsJapgolly.expo.aRMod.ARStartResult
import typingsJapgolly.expo.aRMod.AnchorsDidUpdateEvent
import typingsJapgolly.expo.aRMod.CameraDidChangeTrackingStateEvent
import typingsJapgolly.expo.aRMod.DetectionImage
import typingsJapgolly.expo.aRMod.DidFailWithErrorEvent
import typingsJapgolly.expo.aRMod.EventType
import typingsJapgolly.expo.aRMod.FrameDidUpdateEvent
import typingsJapgolly.expo.aRMod.HitTestResultTypes
import typingsJapgolly.expo.aRMod.HitTestResults
import typingsJapgolly.expo.aRMod.Matrix
import typingsJapgolly.expo.aRMod.PlaneDetection
import typingsJapgolly.expo.aRMod.ReactNativeNodeHandle
import typingsJapgolly.expo.aRMod.SessionInterruptionEndedEvent
import typingsJapgolly.expo.aRMod.SessionWasInterruptedEvent
import typingsJapgolly.expo.aRMod.TrackingConfiguration
import typingsJapgolly.expo.aRMod.Vector2
import typingsJapgolly.expo.aRMod.VideoFormat
import typingsJapgolly.expo.aRMod.WorldAlignment
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.EmitterSubscription
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
    /* "add" */ val Add: typingsJapgolly.expo.aRMod.AnchorEventType.Add with String = js.native
    /* "remove" */ val Remove: typingsJapgolly.expo.aRMod.AnchorEventType.Remove with String = js.native
    /* "update" */ val Update: typingsJapgolly.expo.aRMod.AnchorEventType.Update with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.AnchorEventType with String] = js.native
  }
  
  @js.native
  object AnchorType extends js.Object {
    /* "ARAnchor" */ val Anchor: typingsJapgolly.expo.aRMod.AnchorType.Anchor with String = js.native
    /* "ARFaceAnchor" */ val Face: typingsJapgolly.expo.aRMod.AnchorType.Face with String = js.native
    /* "ARImageAnchor" */ val Image: typingsJapgolly.expo.aRMod.AnchorType.Image with String = js.native
    /* "ARPlaneAnchor" */ val Plane: typingsJapgolly.expo.aRMod.AnchorType.Plane with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.AnchorType with String] = js.native
  }
  
  @js.native
  object BlendShape extends js.Object {
    /* "browDown_L" */ val BrowDownL: typingsJapgolly.expo.aRMod.BlendShape.BrowDownL with String = js.native
    /* "browDown_R" */ val BrowDownR: typingsJapgolly.expo.aRMod.BlendShape.BrowDownR with String = js.native
    /* "browInnerUp" */ val BrowInnerUp: typingsJapgolly.expo.aRMod.BlendShape.BrowInnerUp with String = js.native
    /* "browOuterUp_L" */ val BrowOuterUpL: typingsJapgolly.expo.aRMod.BlendShape.BrowOuterUpL with String = js.native
    /* "browOuterUp_R" */ val BrowOuterUpR: typingsJapgolly.expo.aRMod.BlendShape.BrowOuterUpR with String = js.native
    /* "cheekPuff" */ val CheekPuff: typingsJapgolly.expo.aRMod.BlendShape.CheekPuff with String = js.native
    /* "cheekSquint_L" */ val CheekSquintL: typingsJapgolly.expo.aRMod.BlendShape.CheekSquintL with String = js.native
    /* "cheekSquint_R" */ val CheekSquintR: typingsJapgolly.expo.aRMod.BlendShape.CheekSquintR with String = js.native
    /* "eyeBlink_L" */ val EyeBlinkL: typingsJapgolly.expo.aRMod.BlendShape.EyeBlinkL with String = js.native
    /* "eyeBlink_R" */ val EyeBlinkR: typingsJapgolly.expo.aRMod.BlendShape.EyeBlinkR with String = js.native
    /* "eyeLookDown_L" */ val EyeLookDownL: typingsJapgolly.expo.aRMod.BlendShape.EyeLookDownL with String = js.native
    /* "eyeLookDown_R" */ val EyeLookDownR: typingsJapgolly.expo.aRMod.BlendShape.EyeLookDownR with String = js.native
    /* "eyeLookIn_L" */ val EyeLookInL: typingsJapgolly.expo.aRMod.BlendShape.EyeLookInL with String = js.native
    /* "eyeLookIn_R" */ val EyeLookInR: typingsJapgolly.expo.aRMod.BlendShape.EyeLookInR with String = js.native
    /* "eyeLookOut_L" */ val EyeLookOutL: typingsJapgolly.expo.aRMod.BlendShape.EyeLookOutL with String = js.native
    /* "eyeLookOut_R" */ val EyeLookOutR: typingsJapgolly.expo.aRMod.BlendShape.EyeLookOutR with String = js.native
    /* "eyeLookUp_L" */ val EyeLookUpL: typingsJapgolly.expo.aRMod.BlendShape.EyeLookUpL with String = js.native
    /* "eyeLookUp_R" */ val EyeLookUpR: typingsJapgolly.expo.aRMod.BlendShape.EyeLookUpR with String = js.native
    /* "eyeSquint_L" */ val EyeSquintL: typingsJapgolly.expo.aRMod.BlendShape.EyeSquintL with String = js.native
    /* "eyeSquint_R" */ val EyeSquintR: typingsJapgolly.expo.aRMod.BlendShape.EyeSquintR with String = js.native
    /* "eyeWide_L" */ val EyeWideL: typingsJapgolly.expo.aRMod.BlendShape.EyeWideL with String = js.native
    /* "eyeWide_R" */ val EyeWideR: typingsJapgolly.expo.aRMod.BlendShape.EyeWideR with String = js.native
    /* "jawForward" */ val JawForward: typingsJapgolly.expo.aRMod.BlendShape.JawForward with String = js.native
    /* "jawLeft" */ val JawLeft: typingsJapgolly.expo.aRMod.BlendShape.JawLeft with String = js.native
    /* "jawOpen" */ val JawOpen: typingsJapgolly.expo.aRMod.BlendShape.JawOpen with String = js.native
    /* "jawRight" */ val JawRight: typingsJapgolly.expo.aRMod.BlendShape.JawRight with String = js.native
    /* "mouthClose" */ val MouthClose: typingsJapgolly.expo.aRMod.BlendShape.MouthClose with String = js.native
    /* "mouthDimple_L" */ val MouthDimpleL: typingsJapgolly.expo.aRMod.BlendShape.MouthDimpleL with String = js.native
    /* "mouthDimple_R" */ val MouthDimpleR: typingsJapgolly.expo.aRMod.BlendShape.MouthDimpleR with String = js.native
    /* "mouthFrown_L" */ val MouthFrownL: typingsJapgolly.expo.aRMod.BlendShape.MouthFrownL with String = js.native
    /* "mouthFrown_R" */ val MouthFrownR: typingsJapgolly.expo.aRMod.BlendShape.MouthFrownR with String = js.native
    /* "mouthFunnel" */ val MouthFunnel: typingsJapgolly.expo.aRMod.BlendShape.MouthFunnel with String = js.native
    /* "mouthLeft" */ val MouthLeft: typingsJapgolly.expo.aRMod.BlendShape.MouthLeft with String = js.native
    /* "mouthLowerDown_L" */ val MouthLowerDownL: typingsJapgolly.expo.aRMod.BlendShape.MouthLowerDownL with String = js.native
    /* "mouthLowerDown_R" */ val MouthLowerDownR: typingsJapgolly.expo.aRMod.BlendShape.MouthLowerDownR with String = js.native
    /* "mouthPress_L" */ val MouthPressL: typingsJapgolly.expo.aRMod.BlendShape.MouthPressL with String = js.native
    /* "mouthPress_R" */ val MouthPressR: typingsJapgolly.expo.aRMod.BlendShape.MouthPressR with String = js.native
    /* "mouthPucker" */ val MouthPucker: typingsJapgolly.expo.aRMod.BlendShape.MouthPucker with String = js.native
    /* "mouthRight" */ val MouthRight: typingsJapgolly.expo.aRMod.BlendShape.MouthRight with String = js.native
    /* "mouthRollLower" */ val MouthRollLower: typingsJapgolly.expo.aRMod.BlendShape.MouthRollLower with String = js.native
    /* "mouthRollUpper" */ val MouthRollUpper: typingsJapgolly.expo.aRMod.BlendShape.MouthRollUpper with String = js.native
    /* "mouthShrugLower" */ val MouthShrugLower: typingsJapgolly.expo.aRMod.BlendShape.MouthShrugLower with String = js.native
    /* "mouthShrugUpper" */ val MouthShrugUpper: typingsJapgolly.expo.aRMod.BlendShape.MouthShrugUpper with String = js.native
    /* "mouthSmile_L" */ val MouthSmileL: typingsJapgolly.expo.aRMod.BlendShape.MouthSmileL with String = js.native
    /* "mouthSmile_R" */ val MouthSmileR: typingsJapgolly.expo.aRMod.BlendShape.MouthSmileR with String = js.native
    /* "mouthStretch_L" */ val MouthStretchL: typingsJapgolly.expo.aRMod.BlendShape.MouthStretchL with String = js.native
    /* "mouthStretch_R" */ val MouthStretchR: typingsJapgolly.expo.aRMod.BlendShape.MouthStretchR with String = js.native
    /* "mouthUpperUp_L" */ val MouthUpperUpL: typingsJapgolly.expo.aRMod.BlendShape.MouthUpperUpL with String = js.native
    /* "mouthUpperUp_R" */ val MouthUpperUpR: typingsJapgolly.expo.aRMod.BlendShape.MouthUpperUpR with String = js.native
    /* "noseSneer_L" */ val NoseSneerL: typingsJapgolly.expo.aRMod.BlendShape.NoseSneerL with String = js.native
    /* "noseSneer_R" */ val NoseSneerR: typingsJapgolly.expo.aRMod.BlendShape.NoseSneerR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.BlendShape with String] = js.native
  }
  
  @js.native
  object DepthDataAccuracy extends js.Object {
    /* "AVDepthDataAccuracyAbsolute" */ val Absolute: typingsJapgolly.expo.aRMod.DepthDataAccuracy.Absolute with String = js.native
    /* "AVDepthDataAccuracyRelative" */ val Relative: typingsJapgolly.expo.aRMod.DepthDataAccuracy.Relative with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.DepthDataAccuracy with String] = js.native
  }
  
  @js.native
  object DepthDataQuality extends js.Object {
    /* "AVDepthDataQualityHigh" */ val High: typingsJapgolly.expo.aRMod.DepthDataQuality.High with String = js.native
    /* "AVDepthDataQualityLow" */ val Low: typingsJapgolly.expo.aRMod.DepthDataQuality.Low with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.DepthDataQuality with String] = js.native
  }
  
  @js.native
  object EventType extends js.Object {
    /* 2 */ val AnchorsDidUpdate: typingsJapgolly.expo.aRMod.EventType.AnchorsDidUpdate with Double = js.native
    /* 3 */ val CameraDidChangeTrackingState: typingsJapgolly.expo.aRMod.EventType.CameraDidChangeTrackingState with Double = js.native
    /* 1 */ val DidFailWithError: typingsJapgolly.expo.aRMod.EventType.DidFailWithError with Double = js.native
    /* 0 */ val FrameDidUpdate: typingsJapgolly.expo.aRMod.EventType.FrameDidUpdate with Double = js.native
    /* 5 */ val SessionInterruptionEnded: typingsJapgolly.expo.aRMod.EventType.SessionInterruptionEnded with Double = js.native
    /* 4 */ val SessionWasInterrupted: typingsJapgolly.expo.aRMod.EventType.SessionWasInterrupted with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.expo.aRMod.EventType with Double] = js.native
  }
  
  @js.native
  object FaceAnchorProp extends js.Object {
    /* "blendShapes" */ val BlendShapes: typingsJapgolly.expo.aRMod.FaceAnchorProp.BlendShapes with String = js.native
    /* "geometry" */ val Geometry: typingsJapgolly.expo.aRMod.FaceAnchorProp.Geometry with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.FaceAnchorProp with String] = js.native
  }
  
  @js.native
  object FrameAttribute extends js.Object {
    /* "anchors" */ val Anchors: typingsJapgolly.expo.aRMod.FrameAttribute.Anchors with String = js.native
    /* "capturedDepthData" */ val CapturedDepthData: typingsJapgolly.expo.aRMod.FrameAttribute.CapturedDepthData with String = js.native
    /* "lightEstimation" */ val LightEstimation: typingsJapgolly.expo.aRMod.FrameAttribute.LightEstimation with String = js.native
    /* "rawFeaturePoints" */ val RawFeaturePoints: typingsJapgolly.expo.aRMod.FrameAttribute.RawFeaturePoints with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.FrameAttribute with String] = js.native
  }
  
  @js.native
  object HitTestResultTypes extends js.Object {
    /* "existingPlane" */ val ExistingPlane: typingsJapgolly.expo.aRMod.HitTestResultTypes.ExistingPlane with String = js.native
    /* "existingPlaneUsingExtent" */ val ExistingPlaneUsingExtent: typingsJapgolly.expo.aRMod.HitTestResultTypes.ExistingPlaneUsingExtent with String = js.native
    /* "existingPlaneUsingGeometry" */ val ExistingPlaneUsingGeometry: typingsJapgolly.expo.aRMod.HitTestResultTypes.ExistingPlaneUsingGeometry with String = js.native
    /* "featurePoint" */ val FeaturePoint: typingsJapgolly.expo.aRMod.HitTestResultTypes.FeaturePoint with String = js.native
    /* "horizontalPlane" */ val HorizontalPlane: typingsJapgolly.expo.aRMod.HitTestResultTypes.HorizontalPlane with String = js.native
    /* "verticalPlane" */ val VerticalPlane: typingsJapgolly.expo.aRMod.HitTestResultTypes.VerticalPlane with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.HitTestResultTypes with String] = js.native
  }
  
  @js.native
  object PlaneDetection extends js.Object {
    /* "horizontal" */ val Horizontal: typingsJapgolly.expo.aRMod.PlaneDetection.Horizontal with String = js.native
    /* "none" */ val None: typingsJapgolly.expo.aRMod.PlaneDetection.None with String = js.native
    /* "vertical" */ val Vertical: typingsJapgolly.expo.aRMod.PlaneDetection.Vertical with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.PlaneDetection with String] = js.native
  }
  
  @js.native
  object TrackingConfiguration extends js.Object {
    /* "ARFaceTrackingConfiguration" */ val Face: typingsJapgolly.expo.aRMod.TrackingConfiguration.Face with String = js.native
    /* "AROrientationTrackingConfiguration" */ val Orientation: typingsJapgolly.expo.aRMod.TrackingConfiguration.Orientation with String = js.native
    /* "ARWorldTrackingConfiguration" */ val World: typingsJapgolly.expo.aRMod.TrackingConfiguration.World with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.TrackingConfiguration with String] = js.native
  }
  
  @js.native
  object TrackingState extends js.Object {
    /* "ARTrackingStateLimited" */ val Limited: typingsJapgolly.expo.aRMod.TrackingState.Limited with String = js.native
    /* "ARTrackingStateNormal" */ val Normal: typingsJapgolly.expo.aRMod.TrackingState.Normal with String = js.native
    /* "ARTrackingStateNotAvailable" */ val NotAvailable: typingsJapgolly.expo.aRMod.TrackingState.NotAvailable with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.TrackingState with String] = js.native
  }
  
  @js.native
  object TrackingStateReason extends js.Object {
    /* "ARTrackingStateReasonExcessiveMotion" */ val ExcessiveMotion: typingsJapgolly.expo.aRMod.TrackingStateReason.ExcessiveMotion with String = js.native
    /* "ARTrackingStateReasonInitializing" */ val Initializing: typingsJapgolly.expo.aRMod.TrackingStateReason.Initializing with String = js.native
    /* "ARTrackingStateReasonInsufficientFeatures" */ val InsufficientFeatures: typingsJapgolly.expo.aRMod.TrackingStateReason.InsufficientFeatures with String = js.native
    /* "ARTrackingStateReasonNone" */ val None: typingsJapgolly.expo.aRMod.TrackingStateReason.None with String = js.native
    /* "ARTrackingStateReasonRelocalizing" */ val Relocalizing: typingsJapgolly.expo.aRMod.TrackingStateReason.Relocalizing with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.TrackingStateReason with String] = js.native
  }
  
  @js.native
  object WorldAlignment extends js.Object {
    /* "alignmentCamera" */ val AlignmentCamera: typingsJapgolly.expo.aRMod.WorldAlignment.AlignmentCamera with String = js.native
    /* "gravity" */ val Gravity: typingsJapgolly.expo.aRMod.WorldAlignment.Gravity with String = js.native
    /* "gravityAndHeading" */ val GravityAndHeading: typingsJapgolly.expo.aRMod.WorldAlignment.GravityAndHeading with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expo.aRMod.WorldAlignment with String] = js.native
  }
  
}

