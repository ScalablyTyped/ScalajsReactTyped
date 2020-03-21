package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Event
import typingsJapgolly.vscode.mod.TreeViewSelectionChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeComponentView[T] extends Disposable {
  @JSName("onDidChangeSelection")
  var onDidChangeSelection_Original: Event[TreeViewSelectionChangeEvent[T]] = js.native
  @JSName("onNodeCheckedChanged")
  var onNodeCheckedChanged_Original: Event[NodeCheckedEventParameters[T]] = js.native
  def onDidChangeSelection(listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[T], _]): Disposable = js.native
  def onDidChangeSelection(listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[T], _], thisArgs: js.Any): Disposable = js.native
  def onDidChangeSelection(
    listener: js.Function1[/* e */ TreeViewSelectionChangeEvent[T], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onNodeCheckedChanged(listener: js.Function1[/* e */ NodeCheckedEventParameters[T], _]): Disposable = js.native
  def onNodeCheckedChanged(listener: js.Function1[/* e */ NodeCheckedEventParameters[T], _], thisArgs: js.Any): Disposable = js.native
  def onNodeCheckedChanged(
    listener: js.Function1[/* e */ NodeCheckedEventParameters[T], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
}

