package typingsJapgolly.snapchatLensStudio

import typingsJapgolly.snapchatLensStudio.SnapchatLensStudio.ScriptApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CreateEvent[Api /* <: js.Object */] extends StObject {
    
    /** Generic object accessible by other instances of ScriptComponent. Use this object to store references to properties and methods that need to be accessible from other ScriptComponents. */
    var api: Api = js.native
    
    /** Adds a new SceneEvent, triggered by eventType events, to the ScriptComponent. */
    @JSName("createEvent")
    def createEvent_BrowsLoweredEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.BrowsLoweredEvent): BrowsLoweredEvent = js.native
    @JSName("createEvent")
    def createEvent_BrowsRaisedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.BrowsRaisedEvent): BrowsRaisedEvent = js.native
    @JSName("createEvent")
    def createEvent_BrowsReturnedToNormalEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.BrowsReturnedToNormalEvent): BrowsReturnedToNormalEvent = js.native
    @JSName("createEvent")
    def createEvent_CameraBackEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.CameraBackEvent): CameraBackEvent = js.native
    @JSName("createEvent")
    def createEvent_CameraFrontEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.CameraFrontEvent): CameraFrontEvent = js.native
    @JSName("createEvent")
    def createEvent_DelayedCallbackEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.DelayedCallbackEvent): DelayedCallbackEvent = js.native
    @JSName("createEvent")
    def createEvent_FaceFoundEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.FaceFoundEvent): FaceFoundEvent = js.native
    @JSName("createEvent")
    def createEvent_FaceLostEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.FaceLostEvent): FaceLostEvent = js.native
    @JSName("createEvent")
    def createEvent_FaceTrackingEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.FaceTrackingEvent): FaceTrackingEvent = js.native
    @JSName("createEvent")
    def createEvent_KissFinishedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.KissFinishedEvent): KissFinishedEvent = js.native
    @JSName("createEvent")
    def createEvent_KissStartedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.KissStartedEvent): KissStartedEvent = js.native
    @JSName("createEvent")
    def createEvent_LateUpdateEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.LateUpdateEvent): LateUpdateEvent = js.native
    @JSName("createEvent")
    def createEvent_ManipulateEndEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ManipulateEndEvent): ManipulateEndEvent = js.native
    @JSName("createEvent")
    def createEvent_ManipulateStartEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ManipulateStartEvent): ManipulateStartEvent = js.native
    @JSName("createEvent")
    def createEvent_MouthClosedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.MouthClosedEvent): MouthClosedEvent = js.native
    @JSName("createEvent")
    def createEvent_MouthOpenedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.MouthOpenedEvent): MouthOpenedEvent = js.native
    @JSName("createEvent")
    def createEvent_SceneEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SceneEvent): SceneEvent[Any] = js.native
    @JSName("createEvent")
    def createEvent_SceneObjectEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SceneObjectEvent): SceneObjectEvent = js.native
    @JSName("createEvent")
    def createEvent_SmileFinishedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SmileFinishedEvent): SmileFinishedEvent = js.native
    @JSName("createEvent")
    def createEvent_SmileStartedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SmileStartedEvent): SmileStartedEvent = js.native
    @JSName("createEvent")
    def createEvent_SurfaceTrackingResetEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SurfaceTrackingResetEvent): SurfaceTrackingResetEvent = js.native
    @JSName("createEvent")
    def createEvent_TapEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TapEvent): TapEvent = js.native
    @JSName("createEvent")
    def createEvent_TouchEndEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TouchEndEvent): TouchEndEvent = js.native
    @JSName("createEvent")
    def createEvent_TouchMoveEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TouchMoveEvent): TouchMoveEvent = js.native
    @JSName("createEvent")
    def createEvent_TouchStartEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TouchStartEvent): TouchStartEvent = js.native
    @JSName("createEvent")
    def createEvent_TurnOffEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TurnOffEvent): TurnOffEvent = js.native
    @JSName("createEvent")
    def createEvent_TurnOnEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TurnOnEvent): TurnOnEvent = js.native
    @JSName("createEvent")
    def createEvent_UpdateEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.UpdateEvent): UpdateEvent = js.native
    
    /** Removes a previously added SceneEvent from the ScriptComponent. */
    def removeEvent(event: SceneEvent[Any]): Unit = js.native
  }
  
  /* Inlined snapchat-lens-studio.Component.ScriptComponent<snapchat-lens-studio.SnapchatLensStudio.ScriptInputs, snapchat-lens-studio.SnapchatLensStudio.ScriptApi> */
  @js.native
  trait ScriptComponentScriptInpu extends StObject {
    
    /** Generic object accessible by other instances of ScriptComponent. Use this object to store references to properties and methods that need to be accessible from other ScriptComponents. */
    var api: ScriptApi = js.native
    
    /** Adds a new SceneEvent, triggered by eventType events, to the ScriptComponent. */
    @JSName("createEvent")
    def createEvent_BrowsLoweredEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.BrowsLoweredEvent): BrowsLoweredEvent = js.native
    @JSName("createEvent")
    def createEvent_BrowsRaisedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.BrowsRaisedEvent): BrowsRaisedEvent = js.native
    @JSName("createEvent")
    def createEvent_BrowsReturnedToNormalEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.BrowsReturnedToNormalEvent): BrowsReturnedToNormalEvent = js.native
    @JSName("createEvent")
    def createEvent_CameraBackEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.CameraBackEvent): CameraBackEvent = js.native
    @JSName("createEvent")
    def createEvent_CameraFrontEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.CameraFrontEvent): CameraFrontEvent = js.native
    @JSName("createEvent")
    def createEvent_DelayedCallbackEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.DelayedCallbackEvent): DelayedCallbackEvent = js.native
    @JSName("createEvent")
    def createEvent_FaceFoundEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.FaceFoundEvent): FaceFoundEvent = js.native
    @JSName("createEvent")
    def createEvent_FaceLostEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.FaceLostEvent): FaceLostEvent = js.native
    @JSName("createEvent")
    def createEvent_FaceTrackingEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.FaceTrackingEvent): FaceTrackingEvent = js.native
    @JSName("createEvent")
    def createEvent_KissFinishedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.KissFinishedEvent): KissFinishedEvent = js.native
    @JSName("createEvent")
    def createEvent_KissStartedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.KissStartedEvent): KissStartedEvent = js.native
    @JSName("createEvent")
    def createEvent_LateUpdateEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.LateUpdateEvent): LateUpdateEvent = js.native
    @JSName("createEvent")
    def createEvent_ManipulateEndEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ManipulateEndEvent): ManipulateEndEvent = js.native
    @JSName("createEvent")
    def createEvent_ManipulateStartEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ManipulateStartEvent): ManipulateStartEvent = js.native
    @JSName("createEvent")
    def createEvent_MouthClosedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.MouthClosedEvent): MouthClosedEvent = js.native
    @JSName("createEvent")
    def createEvent_MouthOpenedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.MouthOpenedEvent): MouthOpenedEvent = js.native
    @JSName("createEvent")
    def createEvent_SceneEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SceneEvent): SceneEvent[Any] = js.native
    @JSName("createEvent")
    def createEvent_SceneObjectEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SceneObjectEvent): SceneObjectEvent = js.native
    @JSName("createEvent")
    def createEvent_SmileFinishedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SmileFinishedEvent): SmileFinishedEvent = js.native
    @JSName("createEvent")
    def createEvent_SmileStartedEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SmileStartedEvent): SmileStartedEvent = js.native
    @JSName("createEvent")
    def createEvent_SurfaceTrackingResetEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.SurfaceTrackingResetEvent): SurfaceTrackingResetEvent = js.native
    @JSName("createEvent")
    def createEvent_TapEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TapEvent): TapEvent = js.native
    @JSName("createEvent")
    def createEvent_TouchEndEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TouchEndEvent): TouchEndEvent = js.native
    @JSName("createEvent")
    def createEvent_TouchMoveEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TouchMoveEvent): TouchMoveEvent = js.native
    @JSName("createEvent")
    def createEvent_TouchStartEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TouchStartEvent): TouchStartEvent = js.native
    @JSName("createEvent")
    def createEvent_TurnOffEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TurnOffEvent): TurnOffEvent = js.native
    @JSName("createEvent")
    def createEvent_TurnOnEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.TurnOnEvent): TurnOnEvent = js.native
    @JSName("createEvent")
    def createEvent_UpdateEvent(eventType: typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.UpdateEvent): UpdateEvent = js.native
    
    /** Destroys the component. */
    def destroy(): Unit = js.native
    
    /** If disabled, the Component will stop enacting its behavior. */
    var enabled: Boolean = js.native
    
    /** Returns the SceneObject the component is attached to. */
    def getSceneObject(): SceneObject = js.native
    
    /** Returns the Transform this component is attached to. */
    def getTransform(): Transform = js.native
    
    /** Returns the name of this object’s type. */
    def getTypeName(): String = js.native
    
    /** Returns true if the object matches or derives from the passed in type. */
    def isOfType(`type`: String): Boolean = js.native
    
    /** Returns true if this object is the same as other. Useful for checking if two references point to the same thing. */
    def isSame(other: SerializableWithUID): Boolean = js.native
    
    /** Removes a previously added SceneEvent from the ScriptComponent. */
    def removeEvent(event: SceneEvent[Any]): Unit = js.native
  }
}
