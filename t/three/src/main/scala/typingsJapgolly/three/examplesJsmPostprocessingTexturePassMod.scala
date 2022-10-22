package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass
import typingsJapgolly.three.srcThreeMod.ShaderMaterial
import typingsJapgolly.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingTexturePassMod {
  
  @JSImport("three/examples/jsm/postprocessing/TexturePass", "TexturePass")
  @js.native
  open class TexturePass protected () extends Pass {
    def this(map: Texture) = this()
    def this(map: Texture, opacity: Double) = this()
    
    var fsQuad: js.Object = js.native
    
    var map: Texture = js.native
    
    var material: ShaderMaterial = js.native
    
    var opacity: Double = js.native
    
    var uniforms: js.Object = js.native
  }
}
