package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.azdata.mod.ComponentProperties because Already inherited
- typingsJapgolly.azdata.mod.FileBrowserTreeProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined ownerUri */ @js.native
trait FileBrowserTreeComponent extends Component {
  @JSName("onDidChange")
  var onDidChange_Original: Event[_] = js.native
  var ownerUri: String = js.native
  def onDidChange(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onDidChange(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onDidChange(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
}

