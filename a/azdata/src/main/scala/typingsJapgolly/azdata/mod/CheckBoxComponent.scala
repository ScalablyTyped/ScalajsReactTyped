package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.azdata.mod.ComponentProperties because Already inherited
- typingsJapgolly.azdata.mod.CheckBoxProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined checked, label */ @js.native
trait CheckBoxComponent extends Component {
  var checked: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  @JSName("onChanged")
  var onChanged_Original: Event[_] = js.native
  def onChanged(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onChanged(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onChanged(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
}

