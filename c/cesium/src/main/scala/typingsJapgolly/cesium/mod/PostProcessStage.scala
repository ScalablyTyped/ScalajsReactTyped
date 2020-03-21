package typingsJapgolly.cesium.mod

import typingsJapgolly.cesium.AnonClearColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PostProcessStage")
@js.native
class PostProcessStage () extends js.Object {
  def this(options: AnonClearColor) = this()
  val clearColor: Color = js.native
  var enabled: Boolean = js.native
  val forcePowerOfTwo: Boolean = js.native
  val fragmentShader: String = js.native
  val name: String = js.native
  val pixelFormat: PixelFormat = js.native
  val ready: Boolean = js.native
  val scissorRectangle: BoundingRectangle = js.native
  var selected: js.Array[_] = js.native
  val textureScale: Double = js.native
  val uniforms: js.Any = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

