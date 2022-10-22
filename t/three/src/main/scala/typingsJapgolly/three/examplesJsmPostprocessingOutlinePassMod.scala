package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Color
import typingsJapgolly.three.srcThreeMod.Matrix4
import typingsJapgolly.three.srcThreeMod.MeshBasicMaterial
import typingsJapgolly.three.srcThreeMod.MeshDepthMaterial
import typingsJapgolly.three.srcThreeMod.Object3D
import typingsJapgolly.three.srcThreeMod.Scene
import typingsJapgolly.three.srcThreeMod.ShaderMaterial
import typingsJapgolly.three.srcThreeMod.Texture
import typingsJapgolly.three.srcThreeMod.Vector2
import typingsJapgolly.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingOutlinePassMod {
  
  @JSImport("three/examples/jsm/postprocessing/OutlinePass", "OutlinePass")
  @js.native
  open class OutlinePass protected () extends Pass {
    def this(resolution: Vector2, scene: Scene, camera: Camera) = this()
    def this(resolution: Vector2, scene: Scene, camera: Camera, selectedObjects: js.Array[Object3D[Event]]) = this()
    
    def changeVisibilityOfNonSelectedObjects(bVisible: Boolean): Unit = js.native
    
    def changeVisibilityOfSelectedObjects(bVisible: Boolean): Unit = js.native
    
    var copyUniforms: js.Object = js.native
    
    var depthMaterial: MeshDepthMaterial = js.native
    
    def dispose(): Unit = js.native
    
    var downSampleRatio: Double = js.native
    
    var edgeDetectionMaterial: ShaderMaterial = js.native
    
    var edgeGlow: Double = js.native
    
    var edgeStrength: Double = js.native
    
    var edgeThickness: Double = js.native
    
    var fsQuad: js.Object = js.native
    
    def getEdgeDetectionMaterial(): ShaderMaterial = js.native
    
    def getOverlayMaterial(): ShaderMaterial = js.native
    
    def getPrepareMaskMaterial(): ShaderMaterial = js.native
    
    def getSeperableBlurMaterial(): ShaderMaterial = js.native
    
    var hiddenEdgeColor: Color = js.native
    
    var maskBufferMaterial: MeshBasicMaterial = js.native
    
    var materialCopy: ShaderMaterial = js.native
    
    var oldClearAlpha: Double = js.native
    
    var oldClearColor: Color = js.native
    
    var overlayMaterial: ShaderMaterial = js.native
    
    var patternTexture: Texture = js.native
    
    var prepareMaskMaterial: ShaderMaterial = js.native
    
    var pulsePeriod: Double = js.native
    
    var renderCamera: Camera = js.native
    
    var renderScene: Scene = js.native
    
    var renderTargetBlurBuffer1: WebGLRenderTarget = js.native
    
    var renderTargetBlurBuffer2: WebGLRenderTarget = js.native
    
    var renderTargetDepthBuffer: WebGLRenderTarget = js.native
    
    var renderTargetEdgeBuffer1: WebGLRenderTarget = js.native
    
    var renderTargetEdgeBuffer2: WebGLRenderTarget = js.native
    
    var renderTargetMaskBuffer: WebGLRenderTarget = js.native
    
    var renderTargetMaskDownSampleBuffer: WebGLRenderTarget = js.native
    
    var resolution: Vector2 = js.native
    
    var selectedObjects: js.Array[Object3D[Event]] = js.native
    
    var separableBlurMaterial1: ShaderMaterial = js.native
    
    var separableBlurMaterial2: ShaderMaterial = js.native
    
    var tempPulseColor1: Color = js.native
    
    var tempPulseColor2: Color = js.native
    
    var textureMatrix: Matrix4 = js.native
    
    def updateTextureMatrix(): Unit = js.native
    
    var usePatternTexture: Boolean = js.native
    
    var visibleEdgeColor: Color = js.native
  }
}
