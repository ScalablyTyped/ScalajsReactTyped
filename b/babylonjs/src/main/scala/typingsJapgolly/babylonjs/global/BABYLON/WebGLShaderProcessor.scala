package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.BABYLON.ShaderProcessingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGLShaderProcessor")
@js.native
open class WebGLShaderProcessor ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebGLShaderProcessor {
  
  /* CompleteClass */
  @JSName("postProcessor")
  override def postProcessor_MWebGLShaderProcessor(
    code: String,
    defines: js.Array[String],
    isFragment: Boolean,
    processingContext: Nullable[ShaderProcessingContext],
    engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine
  ): String = js.native
  
  /* CompleteClass */
  var shaderLanguage: typingsJapgolly.babylonjs.BABYLON.ShaderLanguage = js.native
}
