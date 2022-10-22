package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmPostprocessingShaderPassMod.ShaderPass
import typingsJapgolly.three.srcThreeMod.Clock
import typingsJapgolly.three.srcThreeMod.Material
import typingsJapgolly.three.srcThreeMod.WebGLRenderTarget
import typingsJapgolly.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingEffectComposerMod {
  
  @JSImport("three/examples/jsm/postprocessing/EffectComposer", "EffectComposer")
  @js.native
  open class EffectComposer protected () extends StObject {
    def this(renderer: WebGLRenderer) = this()
    def this(renderer: WebGLRenderer, renderTarget: WebGLRenderTarget) = this()
    
    def addPass(pass: typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass): Unit = js.native
    
    var clock: Clock = js.native
    
    var copyPass: ShaderPass = js.native
    
    def insertPass(pass: typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass, index: Double): Unit = js.native
    
    def isLastEnabledPass(passIndex: Double): Boolean = js.native
    
    var passes: js.Array[typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass] = js.native
    
    var readBuffer: WebGLRenderTarget = js.native
    
    def removePass(pass: typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass): Unit = js.native
    
    def render(): Unit = js.native
    def render(deltaTime: Double): Unit = js.native
    
    var renderTarget1: WebGLRenderTarget = js.native
    
    var renderTarget2: WebGLRenderTarget = js.native
    
    var renderToScreen: Boolean = js.native
    
    var renderer: WebGLRenderer = js.native
    
    def reset(): Unit = js.native
    def reset(renderTarget: WebGLRenderTarget): Unit = js.native
    
    def setPixelRatio(pixelRatio: Double): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
    
    def swapBuffers(): Unit = js.native
    
    var writeBuffer: WebGLRenderTarget = js.native
  }
  
  @JSImport("three/examples/jsm/postprocessing/EffectComposer", "FullScreenQuad")
  @js.native
  open class FullScreenQuad ()
    extends typingsJapgolly.three.examplesJsmPostprocessingPassMod.FullScreenQuad {
    def this(material: Material) = this()
  }
  
  @JSImport("three/examples/jsm/postprocessing/EffectComposer", "Pass")
  @js.native
  open class Pass ()
    extends typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass
}
