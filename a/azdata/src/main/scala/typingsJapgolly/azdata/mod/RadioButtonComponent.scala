package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioButtonComponent
  extends Component
     with RadioButtonProperties {
  /**
  		 * An event called when the radio button is clicked
  		 */
  @JSName("onDidClick")
  var onDidClick_Original: Event[_] = js.native
  /**
  		 * An event called when the radio button is clicked
  		 */
  def onDidClick(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
}

