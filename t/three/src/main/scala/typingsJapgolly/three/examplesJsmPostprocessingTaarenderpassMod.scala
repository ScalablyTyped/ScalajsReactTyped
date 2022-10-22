package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmPostprocessingSsaarenderpassMod.SSAARenderPass
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Scene
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingTaarenderpassMod {
  
  @JSImport("three/examples/jsm/postprocessing/TAARenderPass", "TAARenderPass")
  @js.native
  open class TAARenderPass protected () extends SSAARenderPass {
    def this(scene: Scene, camera: Camera, clearColor: ColorRepresentation, clearAlpha: Double) = this()
    
    var accumulate: Boolean = js.native
  }
}
