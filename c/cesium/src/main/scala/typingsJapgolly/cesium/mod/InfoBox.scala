package typingsJapgolly.cesium.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "InfoBox")
@js.native
class InfoBox protected () extends js.Object {
  def this(container: String) = this()
  def this(container: Element) = this()
  var container: Element = js.native
  var frame: HTMLIFrameElement = js.native
  var viewModel: InfoBoxViewModel = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

