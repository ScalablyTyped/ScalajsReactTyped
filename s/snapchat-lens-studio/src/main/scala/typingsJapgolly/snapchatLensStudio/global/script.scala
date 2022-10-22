package typingsJapgolly.snapchatLensStudio.global

import typingsJapgolly.snapchatLensStudio.SceneObject
import typingsJapgolly.snapchatLensStudio.SerializableWithUID
import typingsJapgolly.snapchatLensStudio.SnapchatLensStudio.ScriptApi
import typingsJapgolly.snapchatLensStudio.Transform
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.BrowsLoweredEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.BrowsRaisedEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.BrowsReturnedToNormalEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.CameraBackEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.CameraFrontEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.DelayedCallbackEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.FaceFoundEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.FaceLostEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.FaceTrackingEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.KissFinishedEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.KissStartedEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.LateUpdateEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ManipulateEndEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ManipulateStartEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.MouthClosedEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.MouthOpenedEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SceneEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SceneObjectEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SmileFinishedEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SmileStartedEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SurfaceTrackingResetEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TapEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TouchEndEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TouchMoveEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TouchStartEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TurnOffEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TurnOnEvent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.UpdateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Binds scripts to Events and executes them when triggered. Any script can access the ScriptComponent executing them through the variable script. See also: Scripting Overview, Script Events Guide.
  * ```
  * // Bind a function to the MouthOpened event
  * function onMouthOpen(eventData)
  * {
  *     print("mouth was opened");
  * }
  * var event = script.createEvent("MouthOpenedEvent");
  * event.bind(onMouthOpen);
  * ```
  */
/* Inlined snapchat-lens-studio.Component.ScriptComponent<snapchat-lens-studio.SnapchatLensStudio.ScriptInputs, snapchat-lens-studio.SnapchatLensStudio.ScriptApi> */
object script {
  
  @JSGlobal("script")
  @js.native
  val ^ : js.Any = js.native
  
  /** Generic object accessible by other instances of ScriptComponent. Use this object to store references to properties and methods that need to be accessible from other ScriptComponents. */
  @JSGlobal("script.api")
  @js.native
  def api: ScriptApi = js.native
  inline def api_=(x: ScriptApi): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("api")(x.asInstanceOf[js.Any])
  
  /** Adds a new SceneEvent, triggered by eventType events, to the ScriptComponent. */
  inline def createEvent_BrowsLoweredEvent(eventType: BrowsLoweredEvent): typingsJapgolly.snapchatLensStudio.BrowsLoweredEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.BrowsLoweredEvent]
  
  inline def createEvent_BrowsRaisedEvent(eventType: BrowsRaisedEvent): typingsJapgolly.snapchatLensStudio.BrowsRaisedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.BrowsRaisedEvent]
  
  inline def createEvent_BrowsReturnedToNormalEvent(eventType: BrowsReturnedToNormalEvent): typingsJapgolly.snapchatLensStudio.BrowsReturnedToNormalEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.BrowsReturnedToNormalEvent]
  
  inline def createEvent_CameraBackEvent(eventType: CameraBackEvent): typingsJapgolly.snapchatLensStudio.CameraBackEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.CameraBackEvent]
  
  inline def createEvent_CameraFrontEvent(eventType: CameraFrontEvent): typingsJapgolly.snapchatLensStudio.CameraFrontEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.CameraFrontEvent]
  
  inline def createEvent_DelayedCallbackEvent(eventType: DelayedCallbackEvent): typingsJapgolly.snapchatLensStudio.DelayedCallbackEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.DelayedCallbackEvent]
  
  inline def createEvent_FaceFoundEvent(eventType: FaceFoundEvent): typingsJapgolly.snapchatLensStudio.FaceFoundEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.FaceFoundEvent]
  
  inline def createEvent_FaceLostEvent(eventType: FaceLostEvent): typingsJapgolly.snapchatLensStudio.FaceLostEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.FaceLostEvent]
  
  inline def createEvent_FaceTrackingEvent(eventType: FaceTrackingEvent): typingsJapgolly.snapchatLensStudio.FaceTrackingEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.FaceTrackingEvent]
  
  inline def createEvent_KissFinishedEvent(eventType: KissFinishedEvent): typingsJapgolly.snapchatLensStudio.KissFinishedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.KissFinishedEvent]
  
  inline def createEvent_KissStartedEvent(eventType: KissStartedEvent): typingsJapgolly.snapchatLensStudio.KissStartedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.KissStartedEvent]
  
  inline def createEvent_LateUpdateEvent(eventType: LateUpdateEvent): typingsJapgolly.snapchatLensStudio.LateUpdateEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.LateUpdateEvent]
  
  inline def createEvent_ManipulateEndEvent(eventType: ManipulateEndEvent): typingsJapgolly.snapchatLensStudio.ManipulateEndEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.ManipulateEndEvent]
  
  inline def createEvent_ManipulateStartEvent(eventType: ManipulateStartEvent): typingsJapgolly.snapchatLensStudio.ManipulateStartEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.ManipulateStartEvent]
  
  inline def createEvent_MouthClosedEvent(eventType: MouthClosedEvent): typingsJapgolly.snapchatLensStudio.MouthClosedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.MouthClosedEvent]
  
  inline def createEvent_MouthOpenedEvent(eventType: MouthOpenedEvent): typingsJapgolly.snapchatLensStudio.MouthOpenedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.MouthOpenedEvent]
  
  inline def createEvent_SceneEvent(eventType: SceneEvent): typingsJapgolly.snapchatLensStudio.SceneEvent[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.SceneEvent[Any]]
  
  inline def createEvent_SceneObjectEvent(eventType: SceneObjectEvent): typingsJapgolly.snapchatLensStudio.SceneObjectEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.SceneObjectEvent]
  
  inline def createEvent_SmileFinishedEvent(eventType: SmileFinishedEvent): typingsJapgolly.snapchatLensStudio.SmileFinishedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.SmileFinishedEvent]
  
  inline def createEvent_SmileStartedEvent(eventType: SmileStartedEvent): typingsJapgolly.snapchatLensStudio.SmileStartedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.SmileStartedEvent]
  
  inline def createEvent_SurfaceTrackingResetEvent(eventType: SurfaceTrackingResetEvent): typingsJapgolly.snapchatLensStudio.SurfaceTrackingResetEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.SurfaceTrackingResetEvent]
  
  inline def createEvent_TapEvent(eventType: TapEvent): typingsJapgolly.snapchatLensStudio.TapEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.TapEvent]
  
  inline def createEvent_TouchEndEvent(eventType: TouchEndEvent): typingsJapgolly.snapchatLensStudio.TouchEndEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.TouchEndEvent]
  
  inline def createEvent_TouchMoveEvent(eventType: TouchMoveEvent): typingsJapgolly.snapchatLensStudio.TouchMoveEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.TouchMoveEvent]
  
  inline def createEvent_TouchStartEvent(eventType: TouchStartEvent): typingsJapgolly.snapchatLensStudio.TouchStartEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.TouchStartEvent]
  
  inline def createEvent_TurnOffEvent(eventType: TurnOffEvent): typingsJapgolly.snapchatLensStudio.TurnOffEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.TurnOffEvent]
  
  inline def createEvent_TurnOnEvent(eventType: TurnOnEvent): typingsJapgolly.snapchatLensStudio.TurnOnEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.TurnOnEvent]
  
  inline def createEvent_UpdateEvent(eventType: UpdateEvent): typingsJapgolly.snapchatLensStudio.UpdateEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.snapchatLensStudio.UpdateEvent]
  
  /** Destroys the component. */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** If disabled, the Component will stop enacting its behavior. */
  @JSGlobal("script.enabled")
  @js.native
  def enabled: Boolean = js.native
  inline def enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
  
  /** Returns the SceneObject the component is attached to. */
  inline def getSceneObject(): SceneObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getSceneObject")().asInstanceOf[SceneObject]
  
  /** Returns the Transform this component is attached to. */
  inline def getTransform(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransform")().asInstanceOf[Transform]
  
  /** Returns the name of this object’s type. */
  inline def getTypeName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeName")().asInstanceOf[String]
  
  /** Returns true if the object matches or derives from the passed in type. */
  inline def isOfType(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOfType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Returns true if this object is the same as other. Useful for checking if two references point to the same thing. */
  inline def isSame(other: SerializableWithUID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSame")(other.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Removes a previously added SceneEvent from the ScriptComponent. */
  inline def removeEvent(event: typingsJapgolly.snapchatLensStudio.SceneEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
