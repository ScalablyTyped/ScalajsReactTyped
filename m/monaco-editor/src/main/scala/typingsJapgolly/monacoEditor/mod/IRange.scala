package typingsJapgolly.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRange extends js.Object {
  /**
    * Column on which the range ends in line `endLineNumber`.
    */
  val endColumn: Double
  /**
    * Line number on which the range ends.
    */
  val endLineNumber: Double
  /**
    * Column on which the range starts in line `startLineNumber` (starts at 1).
    */
  val startColumn: Double
  /**
    * Line number on which the range starts (starts at 1).
    */
  val startLineNumber: Double
}

object IRange {
  @scala.inline
  def apply(endColumn: Double, endLineNumber: Double, startColumn: Double, startLineNumber: Double): IRange = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLineNumber = endLineNumber.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLineNumber = startLineNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRange]
  }
}

