package typingsJapgolly.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.TouchBarButton")
@js.native
class TouchBarButton protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-button
  def this(options: TouchBarButtonConstructorOptions) = this()
  var backgroundColor: String = js.native
  var icon: NativeImage_ = js.native
  var label: String = js.native
}

