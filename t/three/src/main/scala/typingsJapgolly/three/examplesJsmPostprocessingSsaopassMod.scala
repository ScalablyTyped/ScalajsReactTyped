package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Color
import typingsJapgolly.three.srcThreeMod.DataTexture
import typingsJapgolly.three.srcThreeMod.Material
import typingsJapgolly.three.srcThreeMod.MeshNormalMaterial
import typingsJapgolly.three.srcThreeMod.Scene
import typingsJapgolly.three.srcThreeMod.ShaderMaterial
import typingsJapgolly.three.srcThreeMod.Vector3
import typingsJapgolly.three.srcThreeMod.WebGLRenderTarget
import typingsJapgolly.three.srcThreeMod.WebGLRenderer
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingSsaopassMod {
  
  @JSImport("three/examples/jsm/postprocessing/SSAOPass", "SSAOPass")
  @js.native
  open class SSAOPass protected () extends Pass {
    def this(scene: Scene, camera: Camera) = this()
    def this(scene: Scene, camera: Camera, width: Double) = this()
    def this(scene: Scene, camera: Camera, width: Double, height: Double) = this()
    def this(scene: Scene, camera: Camera, width: Unit, height: Double) = this()
    
    var beautyRenderTarget: WebGLRenderTarget = js.native
    
    var blurMaterial: ShaderMaterial = js.native
    
    var blurRenderTarget: WebGLRenderTarget = js.native
    
    var camera: Camera = js.native
    
    var copyMaterial: ShaderMaterial = js.native
    
    var depthRenderMaterial: ShaderMaterial = js.native
    
    def dipose(): Unit = js.native
    
    var fsQuad: js.Object = js.native
    
    def generateRandomKernelRotations(): Unit = js.native
    
    def generateSampleKernel(): js.Array[Vector3] = js.native
    
    var height: Boolean = js.native
    
    var kernel: js.Array[Vector3] = js.native
    
    var kernelRadius: Double = js.native
    
    var kernelSize: Double = js.native
    
    var maxDistance: Double = js.native
    
    var minDistance: Double = js.native
    
    var noiseTexture: DataTexture = js.native
    
    var normalMaterial: MeshNormalMaterial = js.native
    
    var normalRenderTarget: WebGLRenderTarget = js.native
    
    var originalClearColor: Color = js.native
    
    var output: SSAOPassOUTPUT = js.native
    
    def renderOverride(renderer: WebGLRenderer, overrideMaterial: Material, renderTarget: WebGLRenderTarget): Unit = js.native
    def renderOverride(
      renderer: WebGLRenderer,
      overrideMaterial: Material,
      renderTarget: WebGLRenderTarget,
      clearColor: Unit,
      clearAlpha: Double
    ): Unit = js.native
    def renderOverride(
      renderer: WebGLRenderer,
      overrideMaterial: Material,
      renderTarget: WebGLRenderTarget,
      clearColor: ColorRepresentation
    ): Unit = js.native
    def renderOverride(
      renderer: WebGLRenderer,
      overrideMaterial: Material,
      renderTarget: WebGLRenderTarget,
      clearColor: ColorRepresentation,
      clearAlpha: Double
    ): Unit = js.native
    
    def renderPass(renderer: WebGLRenderer, passMaterial: Material, renderTarget: WebGLRenderTarget): Unit = js.native
    def renderPass(
      renderer: WebGLRenderer,
      passMaterial: Material,
      renderTarget: WebGLRenderTarget,
      clearColor: Unit,
      clearAlpha: Double
    ): Unit = js.native
    def renderPass(
      renderer: WebGLRenderer,
      passMaterial: Material,
      renderTarget: WebGLRenderTarget,
      clearColor: ColorRepresentation
    ): Unit = js.native
    def renderPass(
      renderer: WebGLRenderer,
      passMaterial: Material,
      renderTarget: WebGLRenderTarget,
      clearColor: ColorRepresentation,
      clearAlpha: Double
    ): Unit = js.native
    
    var scene: Scene = js.native
    
    var ssaoMaterial: ShaderMaterial = js.native
    
    var ssaoRenderTarget: WebGLRenderTarget = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object SSAOPass {
    
    @JSImport("three/examples/jsm/postprocessing/SSAOPass", "SSAOPass")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/postprocessing/SSAOPass", "SSAOPass.OUTPUT")
    @js.native
    def OUTPUT: SSAOPassOUTPUT = js.native
    inline def OUTPUT_=(x: SSAOPassOUTPUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTPUT")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait SSAOPassOUTPUT extends StObject
  @JSImport("three/examples/jsm/postprocessing/SSAOPass", "SSAOPassOUTPUT")
  @js.native
  object SSAOPassOUTPUT extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SSAOPassOUTPUT & Double] = js.native
    
    @js.native
    sealed trait Beauty
      extends StObject
         with SSAOPassOUTPUT
    /* 3 */ val Beauty: typingsJapgolly.three.examplesJsmPostprocessingSsaopassMod.SSAOPassOUTPUT.Beauty & Double = js.native
    
    @js.native
    sealed trait Blur
      extends StObject
         with SSAOPassOUTPUT
    /* 2 */ val Blur: typingsJapgolly.three.examplesJsmPostprocessingSsaopassMod.SSAOPassOUTPUT.Blur & Double = js.native
    
    @js.native
    sealed trait Default
      extends StObject
         with SSAOPassOUTPUT
    /* 0 */ val Default: typingsJapgolly.three.examplesJsmPostprocessingSsaopassMod.SSAOPassOUTPUT.Default & Double = js.native
    
    @js.native
    sealed trait Depth
      extends StObject
         with SSAOPassOUTPUT
    /* 4 */ val Depth: typingsJapgolly.three.examplesJsmPostprocessingSsaopassMod.SSAOPassOUTPUT.Depth & Double = js.native
    
    @js.native
    sealed trait Normal
      extends StObject
         with SSAOPassOUTPUT
    /* 5 */ val Normal: typingsJapgolly.three.examplesJsmPostprocessingSsaopassMod.SSAOPassOUTPUT.Normal & Double = js.native
    
    @js.native
    sealed trait SSAO
      extends StObject
         with SSAOPassOUTPUT
    /* 1 */ val SSAO: typingsJapgolly.three.examplesJsmPostprocessingSsaopassMod.SSAOPassOUTPUT.SSAO & Double = js.native
  }
}
