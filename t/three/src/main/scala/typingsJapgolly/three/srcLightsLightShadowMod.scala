package typingsJapgolly.three

import typingsJapgolly.three.srcCamerasCameraMod.Camera
import typingsJapgolly.three.srcLightsLightMod.Light
import typingsJapgolly.three.srcLightsLightShadowMod.LightShadow
import typingsJapgolly.three.srcMathMatrix4Mod.Matrix4
import typingsJapgolly.three.srcMathVector2Mod.Vector2
import typingsJapgolly.three.srcMathVector4Mod.Vector4
import typingsJapgolly.three.srcRenderersWebglWebGLRenderListsMod.RenderTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/LightShadow", JSImport.Namespace)
@js.native
object srcLightsLightShadowMod extends js.Object {
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

