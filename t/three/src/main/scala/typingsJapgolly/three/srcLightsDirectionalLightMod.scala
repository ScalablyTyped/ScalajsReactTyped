package typingsJapgolly.three

import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcLightsDirectionalLightShadowMod.DirectionalLightShadow
import typingsJapgolly.three.srcLightsLightMod.Light
import typingsJapgolly.three.srcMathColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/DirectionalLight", JSImport.Namespace)
@js.native
object srcLightsDirectionalLightMod extends js.Object {
  @js.native
  class DirectionalLight () extends Light {
    def this(color: String) = this()
    def this(color: Double) = this()
    def this(color: Color) = this()
    def this(color: String, intensity: Double) = this()
    def this(color: Double, intensity: Double) = this()
    def this(color: Color, intensity: Double) = this()
    @JSName("shadow")
    var shadow_DirectionalLight: DirectionalLightShadow = js.native
    /**
    	 * Target used for shadow camera orientation.
    	 */
    var target: Object3D = js.native
  }
  
}

