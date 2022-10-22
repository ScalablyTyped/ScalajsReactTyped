package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShaderCodeInliner")
@js.native
open class ShaderCodeInliner protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.ShaderCodeInliner {
  /**
    * Initializes the inliner
    * @param sourceCode shader code source to inline
    * @param numMaxIterations maximum number of iterations (used to detect recursive calls)
    */
  def this(sourceCode: String) = this()
  def this(sourceCode: String, numMaxIterations: Double) = this()
}
/* static members */
object ShaderCodeInliner {
  
  @JSGlobal("BABYLON.ShaderCodeInliner._RegexpFindFunctionNameAndType")
  @js.native
  val _RegexpFindFunctionNameAndType: Any = js.native
}
