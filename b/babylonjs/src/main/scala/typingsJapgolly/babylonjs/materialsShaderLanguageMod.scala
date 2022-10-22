package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsShaderLanguageMod {
  
  @js.native
  sealed trait ShaderLanguage extends StObject
  @JSImport("babylonjs/Materials/shaderLanguage", "ShaderLanguage")
  @js.native
  object ShaderLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ShaderLanguage & Double] = js.native
    
    /** language is GLSL (used by WebGL) */
    @js.native
    sealed trait GLSL
      extends StObject
         with ShaderLanguage
    /* 0 */ val GLSL: typingsJapgolly.babylonjs.materialsShaderLanguageMod.ShaderLanguage.GLSL & Double = js.native
    
    /** language is WGSL (used by WebGPU) */
    @js.native
    sealed trait WGSL
      extends StObject
         with ShaderLanguage
    /* 1 */ val WGSL: typingsJapgolly.babylonjs.materialsShaderLanguageMod.ShaderLanguage.WGSL & Double = js.native
  }
}
