package typingsJapgolly.winrtUwp.Windows.UI.Text.Core

import typingsJapgolly.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about a SelectionRequested event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextSelectionRequest")
@js.native
abstract class CoreTextSelectionRequest () extends js.Object {
  /** Gets a value that indicates whether the selection request operation is canceled. */
  var isCanceled: Boolean = js.native
  /** Gets or sets the selection range that the text input server is requesting. The application should set the current range of selection before returning from the event handler. */
  var selection: CoreTextRange = js.native
  /**
    * Requests that the selection request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral = js.native
}

