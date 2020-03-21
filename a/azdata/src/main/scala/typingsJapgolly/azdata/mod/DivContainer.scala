package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.azdata.mod.ComponentProperties because Already inherited
- typingsJapgolly.azdata.mod.DivContainerProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined overflowY, yOffsetChange, clickable */ @js.native
trait DivContainer extends Container[DivLayout, DivItemLayout] {
  /**
  		 * Indicates whether the element is clickable
  		 */
  var clickable: js.UndefOr[Boolean] = js.native
  /**
  		 * An event called when the div is clicked
  		 */
  @JSName("onDidClick")
  var onDidClick_Original: Event[_] = js.native
  /**
  		 * Matches the overflow-y CSS property and its available values.
  		 */
  var overflowY: js.UndefOr[String] = js.native
  /**
  		 * Setting the scroll based on the y offset
  		 * This is used when its child component is webview
  		 */
  var yOffsetChange: js.UndefOr[Double] = js.native
  /**
  		 * An event called when the div is clicked
  		 */
  def onDidClick(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onDidClick(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
}

