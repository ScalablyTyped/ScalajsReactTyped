package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "SelectionRange")
@js.native
open class SelectionRange protected () extends StObject {
  /**
    * Creates a new selection range.
    *
    * @param range The range of the selection range.
    * @param parent The parent of the selection range.
    */
  def this(range: Range) = this()
  def this(range: Range, parent: SelectionRange) = this()
  
  /**
    * The parent selection range containing this range.
    */
  var parent: js.UndefOr[SelectionRange] = js.native
  
  /**
    * The {@link Range} of this selection range.
    */
  var range: Range = js.native
}
