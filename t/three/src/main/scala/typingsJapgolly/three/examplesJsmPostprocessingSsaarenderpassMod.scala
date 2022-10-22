package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Scene
import typingsJapgolly.three.srcThreeMod.ShaderMaterial
import typingsJapgolly.three.srcThreeMod.WebGLRenderTarget
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingSsaarenderpassMod {
  
  @JSImport("three/examples/jsm/postprocessing/SSAARenderPass", "SSAARenderPass")
  @js.native
  open class SSAARenderPass protected () extends Pass {
    def this(scene: Scene, camera: Camera) = this()
    def this(scene: Scene, camera: Camera, clearColor: ColorRepresentation) = this()
    def this(scene: Scene, camera: Camera, clearColor: Unit, clearAlpha: Double) = this()
    def this(scene: Scene, camera: Camera, clearColor: ColorRepresentation, clearAlpha: Double) = this()
    
    var camera: Camera = js.native
    
    var clearAlpha: Double = js.native
    
    var clearColor: ColorRepresentation = js.native
    
    var copyMaterial: ShaderMaterial = js.native
    
    var copyUniforms: js.Object = js.native
    
    var fsQuad: js.Object = js.native
    
    var sampleLevel: Double = js.native
    
    var sampleRenderTarget: js.UndefOr[WebGLRenderTarget] = js.native
    
    var scene: Scene = js.native
    
    var unbiased: Boolean = js.native
  }
}
