package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass
import typingsJapgolly.three.srcThreeMod.DataTexture
import typingsJapgolly.three.srcThreeMod.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingGlitchPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/GlitchPass", "GlitchPass")
  @js.native
  open class GlitchPass () extends Pass {
    def this(dt_size: Double) = this()
    
    var curF: Double = js.native
    
    var fsQuad: js.Object = js.native
    
    def generateHeightmap(dt_size: Double): DataTexture = js.native
    
    def generateTrigger(): Unit = js.native
    
    var goWild: Boolean = js.native
    
    var material: ShaderMaterial = js.native
    
    var randX: Double = js.native
    
    var uniforms: js.Object = js.native
  }
}
