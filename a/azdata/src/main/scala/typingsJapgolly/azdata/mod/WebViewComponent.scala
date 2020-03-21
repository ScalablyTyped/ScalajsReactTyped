package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Event
import typingsJapgolly.vscode.mod.WebviewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebViewComponent extends Component {
  var html: String = js.native
  var message: js.Any = js.native
  @JSName("onMessage")
  var onMessage_Original: Event[_] = js.native
  val options: WebviewOptions = js.native
  def onMessage(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
}

