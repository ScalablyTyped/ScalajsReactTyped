package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBoxComponent
  extends Component
     with ListBoxProperties {
  @JSName("onRowSelected")
  var onRowSelected_Original: Event[_] = js.native
  def onRowSelected(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onRowSelected(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onRowSelected(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
}

