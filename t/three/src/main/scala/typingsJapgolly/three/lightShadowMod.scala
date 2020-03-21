package typingsJapgolly.three

import typingsJapgolly.three.cameraMod.Camera
import typingsJapgolly.three.lightMod.Light
import typingsJapgolly.three.matrix4Mod.Matrix4
import typingsJapgolly.three.vector2Mod.Vector2
import typingsJapgolly.three.vector4Mod.Vector4
import typingsJapgolly.three.webGLRenderListsMod.RenderTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/LightShadow", JSImport.Namespace)
@js.native
object lightShadowMod extends js.Object {
  @js.native
  class LightShadow protected () extends js.Object {
    def this(camera: Camera) = this()
    var bias: Double = js.native
    var camera: Camera = js.native
    var map: RenderTarget = js.native
    var mapPass: RenderTarget = js.native
    var mapSize: Vector2 = js.native
    var matrix: Matrix4 = js.native
    var radius: Double = js.native
    def clone(recursive: Boolean): this.type = js.native
    def copy(source: LightShadow): this.type = js.native
    def getFrameExtents(): Vector2 = js.native
    def getFrustum(): Double = js.native
    def getViewport(viewportIndex: Double): Vector4 = js.native
    def toJSON(): js.Any = js.native
    def updateMatrices(light: Light, viewCamera: Camera, viewportIndex: Double): Unit = js.native
  }
  
}

