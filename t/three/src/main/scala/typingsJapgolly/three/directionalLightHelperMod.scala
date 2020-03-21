package typingsJapgolly.three

import typingsJapgolly.three.colorMod.Color
import typingsJapgolly.three.directionalLightMod.DirectionalLight
import typingsJapgolly.three.lineMod.Line
import typingsJapgolly.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/DirectionalLightHelper", JSImport.Namespace)
@js.native
object directionalLightHelperMod extends js.Object {
  @js.native
  class DirectionalLightHelper protected () extends Object3D {
    def this(light: DirectionalLight) = this()
    def this(light: DirectionalLight, size: Double) = this()
    def this(light: DirectionalLight, size: Double, color: String) = this()
    def this(light: DirectionalLight, size: Double, color: Double) = this()
    def this(light: DirectionalLight, size: Double, color: Color) = this()
    var color: js.UndefOr[Color | String | Double] = js.native
    var light: DirectionalLight = js.native
    var lightPlane: Line = js.native
    var targetPlane: Line = js.native
    def dispose(): Unit = js.native
    def update(): Unit = js.native
  }
  
}

