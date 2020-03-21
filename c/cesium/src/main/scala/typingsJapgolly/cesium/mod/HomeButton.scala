package typingsJapgolly.cesium.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HomeButton")
@js.native
class HomeButton protected () extends js.Object {
  def this(container: String, scene: Scene) = this()
  def this(container: Element, scene: Scene) = this()
  def this(container: String, scene: Scene, duration: Double) = this()
  def this(container: Element, scene: Scene, duration: Double) = this()
  var container: Element = js.native
  var viewModel: HomeButtonViewModel = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

