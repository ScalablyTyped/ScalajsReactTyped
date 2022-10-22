package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmPostprocessingPassMod.Pass
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Color
import typingsJapgolly.three.srcThreeMod.Material
import typingsJapgolly.three.srcThreeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingRenderPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/RenderPass", "RenderPass")
  @js.native
  open class RenderPass protected () extends Pass {
    def this(scene: Scene, camera: Camera) = this()
    def this(scene: Scene, camera: Camera, overrideMaterial: Material) = this()
    def this(scene: Scene, camera: Camera, overrideMaterial: Unit, clearColor: Color) = this()
    def this(scene: Scene, camera: Camera, overrideMaterial: Material, clearColor: Color) = this()
    def this(scene: Scene, camera: Camera, overrideMaterial: Unit, clearColor: Unit, clearAlpha: Double) = this()
    def this(scene: Scene, camera: Camera, overrideMaterial: Unit, clearColor: Color, clearAlpha: Double) = this()
    def this(scene: Scene, camera: Camera, overrideMaterial: Material, clearColor: Unit, clearAlpha: Double) = this()
    def this(scene: Scene, camera: Camera, overrideMaterial: Material, clearColor: Color, clearAlpha: Double) = this()
    
    var camera: Camera = js.native
    
    var clearAlpha: Double = js.native
    
    var clearColor: Color = js.native
    
    var clearDepth: Boolean = js.native
    
    var overrideMaterial: Material = js.native
    
    var scene: Scene = js.native
  }
}
