package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Color
import typingsJapgolly.three.srcThreeMod.Material
import typingsJapgolly.three.srcThreeMod.MeshDepthMaterial
import typingsJapgolly.three.srcThreeMod.MeshNormalMaterial
import typingsJapgolly.three.srcThreeMod.Scene
import typingsJapgolly.three.srcThreeMod.ShaderMaterial
import typingsJapgolly.three.srcThreeMod.Vector2
import typingsJapgolly.three.srcThreeMod.WebGLRenderTarget
import typingsJapgolly.three.srcThreeMod.WebGLRenderer
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingSaopassMod {
  
  @js.native
  sealed trait OUTPUT extends StObject
  @JSImport("three/examples/jsm/postprocessing/SAOPass", "OUTPUT")
  @js.native
  object OUTPUT extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OUTPUT & Double] = js.native
    
    @js.native
    sealed trait Beauty
      extends StObject
         with OUTPUT
    /* 0 */ val Beauty: typingsJapgolly.three.examplesJsmPostprocessingSaopassMod.OUTPUT.Beauty & Double = js.native
    
    @js.native
    sealed trait Default
      extends StObject
         with OUTPUT
    /* 1 */ val Default: typingsJapgolly.three.examplesJsmPostprocessingSaopassMod.OUTPUT.Default & Double = js.native
    
    @js.native
    sealed trait Depth
      extends StObject
         with OUTPUT
    /* 3 */ val Depth: typingsJapgolly.three.examplesJsmPostprocessingSaopassMod.OUTPUT.Depth & Double = js.native
    
    @js.native
    sealed trait Normal
      extends StObject
         with OUTPUT
    /* 4 */ val Normal: typingsJapgolly.three.examplesJsmPostprocessingSaopassMod.OUTPUT.Normal & Double = js.native
    
    @js.native
    sealed trait SAO
      extends StObject
         with OUTPUT
    /* 2 */ val SAO: typingsJapgolly.three.examplesJsmPostprocessingSaopassMod.OUTPUT.SAO & Double = js.native
  }
  
  @JSImport("three/examples/jsm/postprocessing/SAOPass", "SAOPass")
  @js.native
  open class SAOPass protected () extends Pass {
    def this(scene: Scene, camera: Camera) = this()
    def this(scene: Scene, camera: Camera, depthTexture: Boolean) = this()
    def this(scene: Scene, camera: Camera, depthTexture: Boolean, useNormals: Boolean) = this()
    def this(scene: Scene, camera: Camera, depthTexture: Unit, useNormals: Boolean) = this()
    def this(scene: Scene, camera: Camera, depthTexture: Boolean, useNormals: Boolean, resolution: Vector2) = this()
    def this(scene: Scene, camera: Camera, depthTexture: Boolean, useNormals: Unit, resolution: Vector2) = this()
    def this(scene: Scene, camera: Camera, depthTexture: Unit, useNormals: Boolean, resolution: Vector2) = this()
    def this(scene: Scene, camera: Camera, depthTexture: Unit, useNormals: Unit, resolution: Vector2) = this()
    
    var beautyRenderTarget: WebGLRenderTarget = js.native
    
    var blurIntermediateRenderTarget: WebGLRenderTarget = js.native
    
    var camera: Camera = js.native
    
    var depthCopy: ShaderMaterial = js.native
    
    var depthMaterial: MeshDepthMaterial = js.native
    
    var depthRenderTarget: WebGLRenderTarget = js.native
    
    var fsQuad: js.Object = js.native
    
    var hBlurMaterial: ShaderMaterial = js.native
    
    var materialCopy: ShaderMaterial = js.native
    
    var normalMaterial: MeshNormalMaterial = js.native
    
    var normalRenderTarget: WebGLRenderTarget = js.native
    
    var oldClearAlpha: Double = js.native
    
    var oldClearColor: Color = js.native
    
    var originalClearColor: Color = js.native
    
    var params: SAOPassParams = js.native
    
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
    
    var resolution: Vector2 = js.native
    
    var saoMaterial: ShaderMaterial = js.native
    
    var saoRenderTarget: WebGLRenderTarget = js.native
    
    var scene: Scene = js.native
    
    var supportsDepthTextureExtension: Boolean = js.native
    
    var supportsNormalTexture: Boolean = js.native
    
    var vBlurMaterial: ShaderMaterial = js.native
  }
  /* static members */
  object SAOPass {
    
    @JSImport("three/examples/jsm/postprocessing/SAOPass", "SAOPass")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/postprocessing/SAOPass", "SAOPass.OUTPUT")
    @js.native
    def OUTPUT: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OUTPUT */ Any = js.native
    inline def OUTPUT_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OUTPUT */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTPUT")(x.asInstanceOf[js.Any])
  }
  
  trait SAOPassParams extends StObject {
    
    var output: OUTPUT
    
    var saoBias: Double
    
    var saoBlur: Boolean
    
    var saoBlurDepthCutoff: Double
    
    var saoBlurRadius: Double
    
    var saoBlurStdDev: Double
    
    var saoIntensity: Double
    
    var saoKernelRadius: Double
    
    var saoMinResolution: Double
    
    var saoScale: Double
  }
  object SAOPassParams {
    
    inline def apply(
      output: OUTPUT,
      saoBias: Double,
      saoBlur: Boolean,
      saoBlurDepthCutoff: Double,
      saoBlurRadius: Double,
      saoBlurStdDev: Double,
      saoIntensity: Double,
      saoKernelRadius: Double,
      saoMinResolution: Double,
      saoScale: Double
    ): SAOPassParams = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], saoBias = saoBias.asInstanceOf[js.Any], saoBlur = saoBlur.asInstanceOf[js.Any], saoBlurDepthCutoff = saoBlurDepthCutoff.asInstanceOf[js.Any], saoBlurRadius = saoBlurRadius.asInstanceOf[js.Any], saoBlurStdDev = saoBlurStdDev.asInstanceOf[js.Any], saoIntensity = saoIntensity.asInstanceOf[js.Any], saoKernelRadius = saoKernelRadius.asInstanceOf[js.Any], saoMinResolution = saoMinResolution.asInstanceOf[js.Any], saoScale = saoScale.asInstanceOf[js.Any])
      __obj.asInstanceOf[SAOPassParams]
    }
    
    extension [Self <: SAOPassParams](x: Self) {
      
      inline def setOutput(value: OUTPUT): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setSaoBias(value: Double): Self = StObject.set(x, "saoBias", value.asInstanceOf[js.Any])
      
      inline def setSaoBlur(value: Boolean): Self = StObject.set(x, "saoBlur", value.asInstanceOf[js.Any])
      
      inline def setSaoBlurDepthCutoff(value: Double): Self = StObject.set(x, "saoBlurDepthCutoff", value.asInstanceOf[js.Any])
      
      inline def setSaoBlurRadius(value: Double): Self = StObject.set(x, "saoBlurRadius", value.asInstanceOf[js.Any])
      
      inline def setSaoBlurStdDev(value: Double): Self = StObject.set(x, "saoBlurStdDev", value.asInstanceOf[js.Any])
      
      inline def setSaoIntensity(value: Double): Self = StObject.set(x, "saoIntensity", value.asInstanceOf[js.Any])
      
      inline def setSaoKernelRadius(value: Double): Self = StObject.set(x, "saoKernelRadius", value.asInstanceOf[js.Any])
      
      inline def setSaoMinResolution(value: Double): Self = StObject.set(x, "saoMinResolution", value.asInstanceOf[js.Any])
      
      inline def setSaoScale(value: Double): Self = StObject.set(x, "saoScale", value.asInstanceOf[js.Any])
    }
  }
}
