package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass
import typingsJapgolly.three.srcThreeMod.ShaderMaterial
import typingsJapgolly.three.srcThreeMod.Texture
import typingsJapgolly.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingSmaapassMod {
  
  @JSImport("three/examples/jsm/postprocessing/SMAAPass", "SMAAPass")
  @js.native
  open class SMAAPass protected () extends Pass {
    def this(width: Double, height: Double) = this()
    
    var areaTexture: Texture = js.native
    
    var edgesRT: WebGLRenderTarget = js.native
    
    var fsQuad: js.Object = js.native
    
    def getAreaTexture(): String = js.native
    
    def getSearchTexture(): String = js.native
    
    var materialBlend: ShaderMaterial = js.native
    
    var materialEdges: ShaderMaterial = js.native
    
    var materialWeights: ShaderMaterial = js.native
    
    var searchTexture: Texture = js.native
    
    var uniformsBlend: js.Object = js.native
    
    var uniformsEdges: js.Object = js.native
    
    var uniformsWeights: js.Object = js.native
    
    var weightsRT: WebGLRenderTarget = js.native
  }
}
