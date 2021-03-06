package typingsJapgolly.cesium.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ProjectionPicker")
@js.native
class ProjectionPicker protected () extends js.Object {
  def this(container: String, scene: Scene) = this()
  def this(container: Element, scene: Scene) = this()
  var container: Element = js.native
  var viewModel: ProjectionPickerViewModel = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

