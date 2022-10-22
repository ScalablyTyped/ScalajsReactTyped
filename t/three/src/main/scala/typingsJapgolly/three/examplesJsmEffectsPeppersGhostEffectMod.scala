package typingsJapgolly.three

import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Scene
import typingsJapgolly.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmEffectsPeppersGhostEffectMod {
  
  @JSImport("three/examples/jsm/effects/PeppersGhostEffect", "PeppersGhostEffect")
  @js.native
  open class PeppersGhostEffect protected () extends StObject {
    def this(renderer: WebGLRenderer) = this()
    
    var cameraDistance: Double = js.native
    
    var reflectFromAbove: Boolean = js.native
    
    def render(scene: Scene, camera: Camera): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
  }
}
