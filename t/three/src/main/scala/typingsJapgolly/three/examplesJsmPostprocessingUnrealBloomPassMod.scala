package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass
import typingsJapgolly.three.srcThreeMod.Color
import typingsJapgolly.three.srcThreeMod.MeshBasicMaterial
import typingsJapgolly.three.srcThreeMod.ShaderMaterial
import typingsJapgolly.three.srcThreeMod.Vector2
import typingsJapgolly.three.srcThreeMod.Vector3
import typingsJapgolly.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingUnrealBloomPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/UnrealBloomPass", "UnrealBloomPass")
  @js.native
  open class UnrealBloomPass protected () extends Pass {
    def this(resolution: Vector2, strength: Double, radius: Double, threshold: Double) = this()
    
    var basic: MeshBasicMaterial = js.native
    
    var bloomTintColors: js.Array[Vector3] = js.native
    
    var clearColor: Color = js.native
    
    var compositeMaterial: ShaderMaterial = js.native
    
    var copyUniforms: js.Object = js.native
    
    def dispose(): Unit = js.native
    
    var fsQuad: js.Object = js.native
    
    def getCompositeMaterial(): ShaderMaterial = js.native
    
    def getSeperableBlurMaterial(): ShaderMaterial = js.native
    
    var highPassUniforms: js.Object = js.native
    
    var materialCopy: ShaderMaterial = js.native
    
    var materialHighPassFilter: ShaderMaterial = js.native
    
    var nMips: Double = js.native
    
    var oldClearAlpha: Double = js.native
    
    var oldClearColor: Color = js.native
    
    var radius: Double = js.native
    
    var renderTargetBright: WebGLRenderTarget = js.native
    
    var renderTargetsHorizontal: js.Array[WebGLRenderTarget] = js.native
    
    var renderTargetsVertical: js.Array[WebGLRenderTarget] = js.native
    
    var resolution: Vector2 = js.native
    
    var separableBlurMaterials: js.Array[ShaderMaterial] = js.native
    
    var strength: Double = js.native
    
    var threshold: Double = js.native
  }
}
