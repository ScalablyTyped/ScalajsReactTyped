package typingsJapgolly.snapchatLensStudio

import typingsJapgolly.snapchatLensStudio.Component.Animation
import typingsJapgolly.snapchatLensStudio.Component.AnimationMixer
import typingsJapgolly.snapchatLensStudio.Component.AudioComponent
import typingsJapgolly.snapchatLensStudio.Component.BaseMeshVisual
import typingsJapgolly.snapchatLensStudio.Component.BlendShapes
import typingsJapgolly.snapchatLensStudio.Component.DeviceLocationTrackingComponent
import typingsJapgolly.snapchatLensStudio.Component.DeviceTracking
import typingsJapgolly.snapchatLensStudio.Component.EyeColorVisual
import typingsJapgolly.snapchatLensStudio.Component.FaceInsetVisual
import typingsJapgolly.snapchatLensStudio.Component.FaceMaskVisual
import typingsJapgolly.snapchatLensStudio.Component.FaceStretchVisual
import typingsJapgolly.snapchatLensStudio.Component.Head
import typingsJapgolly.snapchatLensStudio.Component.HintsComponent
import typingsJapgolly.snapchatLensStudio.Component.Image
import typingsJapgolly.snapchatLensStudio.Component.LightSource
import typingsJapgolly.snapchatLensStudio.Component.LiquifyVisual
import typingsJapgolly.snapchatLensStudio.Component.MLComponent
import typingsJapgolly.snapchatLensStudio.Component.ManipulateComponent
import typingsJapgolly.snapchatLensStudio.Component.MarkerTrackingComponent
import typingsJapgolly.snapchatLensStudio.Component.MaterialMeshVisual
import typingsJapgolly.snapchatLensStudio.Component.ObjectTracking
import typingsJapgolly.snapchatLensStudio.Component.RectangleSetter
import typingsJapgolly.snapchatLensStudio.Component.RenderMeshVisual
import typingsJapgolly.snapchatLensStudio.Component.RetouchVisual
import typingsJapgolly.snapchatLensStudio.Component.ScreenRegionComponent
import typingsJapgolly.snapchatLensStudio.Component.ScreenTransform
import typingsJapgolly.snapchatLensStudio.Component.SpriteAligner
import typingsJapgolly.snapchatLensStudio.Component.SpriteVisual
import typingsJapgolly.snapchatLensStudio.Component.Text
import typingsJapgolly.snapchatLensStudio.Component.TouchComponent
import typingsJapgolly.snapchatLensStudio.Component.VertexCache
import typingsJapgolly.snapchatLensStudio.Component.Visual
import typingsJapgolly.snapchatLensStudio.anon.ScriptComponentScriptInpu
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotAnimation
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotAnimationMixer
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotAudioComponent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotBaseMeshVisual
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotBlendShapes
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotCamera
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotDeviceLocationTrackingComponent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotDeviceTracking
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotEyeColorVisual
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotFaceInsetVisual
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotFaceMaskVisual
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotFaceStretchVisual
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotHead
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotHintsComponent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotImage
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotLightSource
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotLiquifyVisual
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotLookAtComponent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotMLComponent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotManipulateComponent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotMarkerTrackingComponent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotMaterialMeshVisual
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotObjectTracking
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotPinToMeshComponent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotRectangleSetter
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotRenderMeshVisual
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotRetouchVisual
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotScreenRegionComponent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotScreenTransform
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotScriptComponent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotSpriteAligner
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotSpriteVisual
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotText
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotTouchComponent
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotVertexCache
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.ComponentDotVisual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object in the scene hierarchy, containing a Transform and possibly Components. A script can access the SceneObject holding it through the method script.getSceneObject(). */
@js.native
trait SceneObject
  extends StObject
     with SerializableWithUID {
  
  /** Copies component and adds it to the SceneObject, then returns it. */
  def copyComponent(component: Component): Component = js.native
  
  /** Creates a shallow copy of the passed in sceneObject (not including its hierarchy), and parents it to this SceneObject. */
  def copySceneObject(sceneObject: SceneObject): SceneObject = js.native
  
  /** Creates a deep copy of the passed in sceneObject (including its hierarchy), and parents it to this SceneObject. */
  def copyWholeHierarchy(sceneObject: SceneObject): SceneObject = js.native
  
  /** Adds a new component of type typeName to the SceneObject. */
  def createComponent(typeName: String): Component = js.native
  
  /** Destroys the SceneObject. */
  def destroy(): Unit = js.native
  
  /** Whether the SceneObject, including its components and children, is enabled or disabled. */
  var enabled: Boolean = js.native
  
  /** Returns this SceneObject’s child at index index. */
  def getChild(index: Double): SceneObject = js.native
  
  /** Returns the number of children the SceneObject has. */
  def getChildrenCount(): Double = js.native
  
  /** Returns the first attached Component with type matching or deriving from componentType. */
  def getComponent(componentType: String): Component = js.native
  @JSName("getComponent")
  def getComponent_ComponentAnimation(componentType: ComponentDotAnimation): Animation = js.native
  @JSName("getComponent")
  def getComponent_ComponentAnimationMixer(componentType: ComponentDotAnimationMixer): AnimationMixer = js.native
  @JSName("getComponent")
  def getComponent_ComponentAudioComponent(componentType: ComponentDotAudioComponent): AudioComponent = js.native
  @JSName("getComponent")
  def getComponent_ComponentBaseMeshVisual(componentType: ComponentDotBaseMeshVisual): BaseMeshVisual = js.native
  @JSName("getComponent")
  def getComponent_ComponentBlendShapes(componentType: ComponentDotBlendShapes): BlendShapes = js.native
  @JSName("getComponent")
  def getComponent_ComponentCamera(componentType: ComponentDotCamera): typingsJapgolly.snapchatLensStudio.Component.Camera = js.native
  @JSName("getComponent")
  def getComponent_ComponentDeviceLocationTrackingComponent(componentType: ComponentDotDeviceLocationTrackingComponent): DeviceLocationTrackingComponent = js.native
  @JSName("getComponent")
  def getComponent_ComponentDeviceTracking(componentType: ComponentDotDeviceTracking): DeviceTracking = js.native
  @JSName("getComponent")
  def getComponent_ComponentEyeColorVisual(componentType: ComponentDotEyeColorVisual): EyeColorVisual = js.native
  @JSName("getComponent")
  def getComponent_ComponentFaceInsetVisual(componentType: ComponentDotFaceInsetVisual): FaceInsetVisual = js.native
  @JSName("getComponent")
  def getComponent_ComponentFaceMaskVisual(componentType: ComponentDotFaceMaskVisual): FaceMaskVisual = js.native
  @JSName("getComponent")
  def getComponent_ComponentFaceStretchVisual(componentType: ComponentDotFaceStretchVisual): FaceStretchVisual = js.native
  @JSName("getComponent")
  def getComponent_ComponentHead(componentType: ComponentDotHead): Head = js.native
  @JSName("getComponent")
  def getComponent_ComponentHintsComponent(componentType: ComponentDotHintsComponent): HintsComponent = js.native
  @JSName("getComponent")
  def getComponent_ComponentImage(componentType: ComponentDotImage): Image = js.native
  @JSName("getComponent")
  def getComponent_ComponentLightSource(componentType: ComponentDotLightSource): LightSource = js.native
  @JSName("getComponent")
  def getComponent_ComponentLiquifyVisual(componentType: ComponentDotLiquifyVisual): LiquifyVisual = js.native
  @JSName("getComponent")
  def getComponent_ComponentLookAtComponent(componentType: ComponentDotLookAtComponent): typingsJapgolly.snapchatLensStudio.Component.LookAtComponent = js.native
  @JSName("getComponent")
  def getComponent_ComponentMLComponent(componentType: ComponentDotMLComponent): MLComponent = js.native
  @JSName("getComponent")
  def getComponent_ComponentManipulateComponent(componentType: ComponentDotManipulateComponent): ManipulateComponent = js.native
  @JSName("getComponent")
  def getComponent_ComponentMarkerTrackingComponent(componentType: ComponentDotMarkerTrackingComponent): MarkerTrackingComponent = js.native
  @JSName("getComponent")
  def getComponent_ComponentMaterialMeshVisual(componentType: ComponentDotMaterialMeshVisual): MaterialMeshVisual = js.native
  @JSName("getComponent")
  def getComponent_ComponentObjectTracking(componentType: ComponentDotObjectTracking): ObjectTracking = js.native
  @JSName("getComponent")
  def getComponent_ComponentPinToMeshComponent(componentType: ComponentDotPinToMeshComponent): typingsJapgolly.snapchatLensStudio.Component.PinToMeshComponent = js.native
  @JSName("getComponent")
  def getComponent_ComponentRectangleSetter(componentType: ComponentDotRectangleSetter): RectangleSetter = js.native
  @JSName("getComponent")
  def getComponent_ComponentRenderMeshVisual(componentType: ComponentDotRenderMeshVisual): RenderMeshVisual = js.native
  @JSName("getComponent")
  def getComponent_ComponentRetouchVisual(componentType: ComponentDotRetouchVisual): RetouchVisual = js.native
  @JSName("getComponent")
  def getComponent_ComponentScreenRegionComponent(componentType: ComponentDotScreenRegionComponent): ScreenRegionComponent = js.native
  @JSName("getComponent")
  def getComponent_ComponentScreenTransform(componentType: ComponentDotScreenTransform): ScreenTransform = js.native
  /** Returns the first attached Component with type matching or deriving from componentType. */
  @JSName("getComponent")
  def getComponent_ComponentScriptComponent(componentType: ComponentDotScriptComponent): ScriptComponentScriptInpu = js.native
  @JSName("getComponent")
  def getComponent_ComponentSpriteAligner(componentType: ComponentDotSpriteAligner): SpriteAligner = js.native
  @JSName("getComponent")
  def getComponent_ComponentSpriteVisual(componentType: ComponentDotSpriteVisual): SpriteVisual = js.native
  @JSName("getComponent")
  def getComponent_ComponentText(componentType: ComponentDotText): Text = js.native
  @JSName("getComponent")
  def getComponent_ComponentTouchComponent(componentType: ComponentDotTouchComponent): TouchComponent = js.native
  @JSName("getComponent")
  def getComponent_ComponentVertexCache(componentType: ComponentDotVertexCache): VertexCache = js.native
  @JSName("getComponent")
  def getComponent_ComponentVisual(componentType: ComponentDotVisual): Visual = js.native
  
  /** Returns a list of attached components with types matching or deriving from componentType. */
  def getComponents(componentType: String): js.Array[Component] = js.native
  @JSName("getComponents")
  def getComponents_ComponentAnimation(componentType: ComponentDotAnimation): js.Array[Animation] = js.native
  @JSName("getComponents")
  def getComponents_ComponentAnimationMixer(componentType: ComponentDotAnimationMixer): js.Array[AnimationMixer] = js.native
  @JSName("getComponents")
  def getComponents_ComponentAudioComponent(componentType: ComponentDotAudioComponent): js.Array[AudioComponent] = js.native
  @JSName("getComponents")
  def getComponents_ComponentBaseMeshVisual(componentType: ComponentDotBaseMeshVisual): js.Array[BaseMeshVisual] = js.native
  @JSName("getComponents")
  def getComponents_ComponentBlendShapes(componentType: ComponentDotBlendShapes): js.Array[BlendShapes] = js.native
  @JSName("getComponents")
  def getComponents_ComponentCamera(componentType: ComponentDotCamera): js.Array[typingsJapgolly.snapchatLensStudio.Component.Camera] = js.native
  @JSName("getComponents")
  def getComponents_ComponentDeviceLocationTrackingComponent(componentType: ComponentDotDeviceLocationTrackingComponent): js.Array[DeviceLocationTrackingComponent] = js.native
  @JSName("getComponents")
  def getComponents_ComponentDeviceTracking(componentType: ComponentDotDeviceTracking): js.Array[DeviceTracking] = js.native
  @JSName("getComponents")
  def getComponents_ComponentEyeColorVisual(componentType: ComponentDotEyeColorVisual): js.Array[EyeColorVisual] = js.native
  @JSName("getComponents")
  def getComponents_ComponentFaceInsetVisual(componentType: ComponentDotFaceInsetVisual): js.Array[FaceInsetVisual] = js.native
  @JSName("getComponents")
  def getComponents_ComponentFaceMaskVisual(componentType: ComponentDotFaceMaskVisual): js.Array[FaceMaskVisual] = js.native
  @JSName("getComponents")
  def getComponents_ComponentFaceStretchVisual(componentType: ComponentDotFaceStretchVisual): js.Array[FaceStretchVisual] = js.native
  @JSName("getComponents")
  def getComponents_ComponentHead(componentType: ComponentDotHead): js.Array[Head] = js.native
  @JSName("getComponents")
  def getComponents_ComponentHintsComponent(componentType: ComponentDotHintsComponent): js.Array[HintsComponent] = js.native
  @JSName("getComponents")
  def getComponents_ComponentImage(componentType: ComponentDotImage): js.Array[Image] = js.native
  @JSName("getComponents")
  def getComponents_ComponentLightSource(componentType: ComponentDotLightSource): js.Array[LightSource] = js.native
  @JSName("getComponents")
  def getComponents_ComponentLiquifyVisual(componentType: ComponentDotLiquifyVisual): js.Array[LiquifyVisual] = js.native
  @JSName("getComponents")
  def getComponents_ComponentLookAtComponent(componentType: ComponentDotLookAtComponent): js.Array[typingsJapgolly.snapchatLensStudio.Component.LookAtComponent] = js.native
  @JSName("getComponents")
  def getComponents_ComponentMLComponent(componentType: ComponentDotMLComponent): js.Array[MLComponent] = js.native
  @JSName("getComponents")
  def getComponents_ComponentManipulateComponent(componentType: ComponentDotManipulateComponent): js.Array[ManipulateComponent] = js.native
  @JSName("getComponents")
  def getComponents_ComponentMarkerTrackingComponent(componentType: ComponentDotMarkerTrackingComponent): js.Array[MarkerTrackingComponent] = js.native
  @JSName("getComponents")
  def getComponents_ComponentMaterialMeshVisual(componentType: ComponentDotMaterialMeshVisual): js.Array[MaterialMeshVisual] = js.native
  @JSName("getComponents")
  def getComponents_ComponentObjectTracking(componentType: ComponentDotObjectTracking): js.Array[ObjectTracking] = js.native
  @JSName("getComponents")
  def getComponents_ComponentPinToMeshComponent(componentType: ComponentDotPinToMeshComponent): js.Array[typingsJapgolly.snapchatLensStudio.Component.PinToMeshComponent] = js.native
  @JSName("getComponents")
  def getComponents_ComponentRectangleSetter(componentType: ComponentDotRectangleSetter): js.Array[RectangleSetter] = js.native
  @JSName("getComponents")
  def getComponents_ComponentRenderMeshVisual(componentType: ComponentDotRenderMeshVisual): js.Array[RenderMeshVisual] = js.native
  @JSName("getComponents")
  def getComponents_ComponentRetouchVisual(componentType: ComponentDotRetouchVisual): js.Array[RetouchVisual] = js.native
  @JSName("getComponents")
  def getComponents_ComponentScreenRegionComponent(componentType: ComponentDotScreenRegionComponent): js.Array[ScreenRegionComponent] = js.native
  @JSName("getComponents")
  def getComponents_ComponentScreenTransform(componentType: ComponentDotScreenTransform): js.Array[ScreenTransform] = js.native
  /** Returns a list of attached components with types matching or deriving from componentType. */
  @JSName("getComponents")
  def getComponents_ComponentScriptComponent(componentType: ComponentDotScriptComponent): js.Array[ScriptComponentScriptInpu] = js.native
  @JSName("getComponents")
  def getComponents_ComponentSpriteAligner(componentType: ComponentDotSpriteAligner): js.Array[SpriteAligner] = js.native
  @JSName("getComponents")
  def getComponents_ComponentSpriteVisual(componentType: ComponentDotSpriteVisual): js.Array[SpriteVisual] = js.native
  @JSName("getComponents")
  def getComponents_ComponentText(componentType: ComponentDotText): js.Array[Text] = js.native
  @JSName("getComponents")
  def getComponents_ComponentTouchComponent(componentType: ComponentDotTouchComponent): js.Array[TouchComponent] = js.native
  @JSName("getComponents")
  def getComponents_ComponentVertexCache(componentType: ComponentDotVertexCache): js.Array[VertexCache] = js.native
  @JSName("getComponents")
  def getComponents_ComponentVisual(componentType: ComponentDotVisual): js.Array[Visual] = js.native
  
  /** Returns the SceneObject’s parent in the hierarchy, or null if there isn’t one. */
  def getParent(): SceneObject = js.native
  
  /** Returns the Transform attached to the SceneObject. */
  def getTransform(): Transform = js.native
  
  /** Returns whether the SceneObject has a parent in the scene hierarchy. */
  def hasParent(): Boolean = js.native
  
  /** Gets or sets the LayerSet of layers this SceneObject belongs to. This is used to determine which Cameras will render the SceneObject. */
  var layer: LayerSet = js.native
  
  /** The name of the SceneObject. */
  var name: String = js.native
  
  /** Unparents the SceneObject in the hierarchy, making it an orphan. */
  def removeParent(): Unit = js.native
  
  /** Sets the SceneObject’s parent to newParent in the scene hierarchy. */
  def setParent(newParent: SceneObject): Unit = js.native
  
  /** Changes the parent of the SceneObject without altering its world position, rotation, or scale. */
  def setParentPreserveWorldTransform(newParent: SceneObject): Unit = js.native
}
