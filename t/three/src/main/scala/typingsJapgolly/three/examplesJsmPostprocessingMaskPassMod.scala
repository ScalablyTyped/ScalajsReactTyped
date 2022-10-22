package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingMaskPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/MaskPass", "ClearMaskPass")
  @js.native
  open class ClearMaskPass () extends Pass
  
  @JSImport("three/examples/jsm/postprocessing/MaskPass", "MaskPass")
  @js.native
  open class MaskPass protected () extends Pass {
    def this(scene: Scene, camera: Camera) = this()
    
    var camera: Camera = js.native
    
    var inverse: Boolean = js.native
    
    var scene: Scene = js.native
  }
}
