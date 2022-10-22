package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.enginesProcessorsIShaderProcessorMod.IShaderProcessor
import typingsJapgolly.babylonjs.enginesProcessorsShaderProcessingOptionsMod.ShaderProcessingContext
import typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine
import typingsJapgolly.babylonjs.materialsShaderLanguageMod.ShaderLanguage
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGLWebGLShaderProcessorsMod {
  
  @JSImport("babylonjs/Engines/WebGL/webGLShaderProcessors", "WebGLShaderProcessor")
  @js.native
  open class WebGLShaderProcessor ()
    extends StObject
       with IShaderProcessor {
    
    @JSName("postProcessor")
    def postProcessor_MWebGLShaderProcessor(
      code: String,
      defines: js.Array[String],
      isFragment: Boolean,
      processingContext: Nullable[ShaderProcessingContext],
      engine: ThinEngine
    ): String = js.native
    
    /* CompleteClass */
    var shaderLanguage: ShaderLanguage = js.native
  }
}
