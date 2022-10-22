package typingsJapgolly.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
An editor selection holds one or more selection ranges.
*/
@js.native
trait EditorSelection extends StObject {
  
  /**
    Extend this selection with an extra range.
    */
  def addRange(range: SelectionRange): EditorSelection = js.native
  def addRange(range: SelectionRange, main: Boolean): EditorSelection = js.native
  
  /**
    Make sure the selection only has one range. Returns a selection
    holding only the main range from this selection.
    */
  def asSingle(): EditorSelection = js.native
  
  /**
    Compare this selection to another selection.
    */
  def eq(other: EditorSelection): Boolean = js.native
  
  /**
    Get the primary selection range. Usually, you should make sure
    your code applies to _all_ ranges, by using methods like
    [`changeByRange`](https://codemirror.net/6/docs/ref/#state.EditorState.changeByRange).
    */
  def main: SelectionRange = js.native
  
  /**
    The index of the _main_ range in the selection (which is
    usually the range that was added last).
    */
  val mainIndex: Double = js.native
  
  /**
    Map a selection through a change. Used to adjust the selection
    position for changes.
    */
  def map(change: ChangeDesc): EditorSelection = js.native
  def map(change: ChangeDesc, assoc: Double): EditorSelection = js.native
  
  /**
    The ranges in the selection, sorted by position. Ranges cannot
    overlap (but they may touch, if they aren't empty).
    */
  val ranges: js.Array[SelectionRange] = js.native
  
  /**
    Replace a given range with another range, and then normalize the
    selection to merge and sort ranges if necessary.
    */
  def replaceRange(range: SelectionRange): EditorSelection = js.native
  def replaceRange(range: SelectionRange, which: Double): EditorSelection = js.native
  
  /**
    Convert this selection to an object that can be serialized to
    JSON.
    */
  def toJSON(): Any = js.native
}
