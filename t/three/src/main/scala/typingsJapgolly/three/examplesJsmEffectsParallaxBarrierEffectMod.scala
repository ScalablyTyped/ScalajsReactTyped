package typingsJapgolly.three

import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Scene
import typingsJapgolly.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmEffectsParallaxBarrierEffectMod {
  
  @JSImport("three/examples/jsm/effects/ParallaxBarrierEffect", "ParallaxBarrierEffect")
  @js.native
  open class ParallaxBarrierEffect protected () extends StObject {
    def this(renderer: WebGLRenderer) = this()
    
    def render(scene: Scene, camera: Camera): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
  }
}
