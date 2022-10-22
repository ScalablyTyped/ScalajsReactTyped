package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.three.anon.ValueAny
import typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass
import typingsJapgolly.three.srcThreeMod.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingShaderPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/ShaderPass", "ShaderPass")
  @js.native
  open class ShaderPass protected () extends Pass {
    def this(shader: js.Object) = this()
    def this(shader: js.Object, textureID: String) = this()
    
    var fsQuad: js.Object = js.native
    
    var material: ShaderMaterial = js.native
    
    var textureID: String = js.native
    
    var uniforms: StringDictionary[ValueAny] = js.native
  }
}
