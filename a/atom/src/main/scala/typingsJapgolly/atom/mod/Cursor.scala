package typingsJapgolly.atom.mod

import typingsJapgolly.atom.AnonAllowPrevious
import typingsJapgolly.atom.AnonAutoscroll
import typingsJapgolly.atom.AnonBackwards
import typingsJapgolly.atom.AnonIncludeNewline
import typingsJapgolly.atom.AnonIncludeNonWordCharacters
import typingsJapgolly.atom.AnonIncludeNonWordCharactersBoolean
import typingsJapgolly.atom.AnonMoveToEndOfSelection
import typingsJapgolly.atom.AnonWordRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor extends js.Object {
  // Utilities
  /** Prevents this cursor from causing scrolling. */
  def clearAutoscroll(): Unit = js.native
  /** Deselects the current selection. */
  def clearSelection(): Unit = js.native
  // Comparing to another cursor
  /**
    *  Compare this cursor's buffer position to another cursor's buffer position.
    *  See Point::compare for more details.
    */
  def compare(otherCursor: Cursor): Double = js.native
  /** Retrieves the buffer position of where the current word starts. */
  def getBeginningOfCurrentWordBufferPosition(): Point = js.native
  def getBeginningOfCurrentWordBufferPosition(options: AnonAllowPrevious): Point = js.native
  /** Retrieves the buffer position of where the next word starts. */
  def getBeginningOfNextWordBufferPosition(): Point = js.native
  def getBeginningOfNextWordBufferPosition(options: AnonWordRegex): Point = js.native
  /** Returns the cursor's current buffer column. */
  def getBufferColumn(): Double = js.native
  /** Returns the current buffer position as an Array. */
  def getBufferPosition(): Point = js.native
  /** Retrieves the cursor's current buffer row. */
  def getBufferRow(): Double = js.native
  /** Returns the cursor's current buffer row of text excluding its line ending. */
  def getCurrentBufferLine(): String = js.native
  /** Returns the buffer Range for the current line. */
  def getCurrentLineBufferRange(): Range = js.native
  def getCurrentLineBufferRange(options: AnonIncludeNewline): Range = js.native
  /**
    *  Retrieves the range for the current paragraph.
    *  A paragraph is defined as a block of text surrounded by empty lines or comments.
    */
  def getCurrentParagraphBufferRange(): Range = js.native
  /** Returns the buffer Range occupied by the word located under the cursor. */
  def getCurrentWordBufferRange(): Range = js.native
  def getCurrentWordBufferRange(options: AnonWordRegex): Range = js.native
  /** Returns the characters preceding the cursor in the current word. */
  def getCurrentWordPrefix(): String = js.native
  /** Retrieves the buffer position of where the current word ends. */
  def getEndOfCurrentWordBufferPosition(): Point = js.native
  def getEndOfCurrentWordBufferPosition(options: AnonIncludeNonWordCharacters): Point = js.native
  /** Returns the indentation level of the current line. */
  def getIndentLevel(): Double = js.native
  // Cursor Position Details
  /**
    *  Returns the underlying DisplayMarker for the cursor. Useful with overlay
    *  Decorations.
    */
  def getMarker(): DisplayMarker = js.native
  /**
    *  Returns buffer position of the next word boundary. It might be on the current
    *  word, or the previous word.
    */
  def getNextWordBoundaryBufferPosition(): Point = js.native
  def getNextWordBoundaryBufferPosition(options: AnonWordRegex): Point = js.native
  // Local Positions and Ranges
  /**
    *  Returns buffer position of previous word boundary. It might be on the current
    *  word, or the previous word.
    */
  def getPreviousWordBoundaryBufferPosition(): Point = js.native
  def getPreviousWordBoundaryBufferPosition(options: AnonWordRegex): Point = js.native
  /** Retrieves the scope descriptor for the cursor's current position. */
  def getScopeDescriptor(): ScopeDescriptor = js.native
  /** Returns the cursor's current screen column. */
  def getScreenColumn(): Double = js.native
  /** Returns the screen position of the cursor as a Point. */
  def getScreenPosition(): Point = js.native
  /** Returns the cursor's current screen row. */
  def getScreenRow(): Double = js.native
  /** Retrieves the syntax tree scope descriptor for the cursor's current position. */
  def getSyntaxTreeScopeDescriptor(): ScopeDescriptor = js.native
  /**
    *  Returns true if this cursor has no non-whitespace characters before its
    *  current position.
    */
  def hasPrecedingCharactersOnLine(): Boolean = js.native
  /** Returns whether the cursor is at the start of a line. */
  def isAtBeginningOfLine(): Boolean = js.native
  /** Returns whether the cursor is on the line return character. */
  def isAtEndOfLine(): Boolean = js.native
  /** This method returns false if the character before or after the cursor is whitespace. */
  def isBetweenWordAndNonWord(): Boolean = js.native
  /** Returns whether this cursor is between a word's start and end. */
  def isInsideWord(): Boolean = js.native
  def isInsideWord(options: AnonWordRegex): Boolean = js.native
  /**
    *  Identifies if this cursor is the last in the TextEditor.
    *  "Last" is defined as the most recently added cursor.
    */
  def isLastCursor(): Boolean = js.native
  /**
    *  Identifies if the cursor is surrounded by whitespace.
    *  "Surrounded" here means that the character directly before and after the cursor
    *  are both whitespace.
    */
  def isSurroundedByWhitespace(): Boolean = js.native
  /** Returns the visibility of the cursor. */
  def isVisible(): Boolean = js.native
  /** Moves the cursor down one screen row. */
  def moveDown(): Unit = js.native
  def moveDown(rowCount: Double): Unit = js.native
  def moveDown(rowCount: Double, options: AnonMoveToEndOfSelection): Unit = js.native
  /** Moves the cursor left one screen column. */
  def moveLeft(): Unit = js.native
  def moveLeft(columnCount: Double): Unit = js.native
  def moveLeft(columnCount: Double, options: AnonMoveToEndOfSelection): Unit = js.native
  /** Moves the cursor right one screen column. */
  def moveRight(): Unit = js.native
  def moveRight(columnCount: Double): Unit = js.native
  def moveRight(columnCount: Double, options: AnonMoveToEndOfSelection): Unit = js.native
  /** Moves the cursor to the beginning of the buffer line. */
  def moveToBeginningOfLine(): Unit = js.native
  /** Moves the cursor to the beginning of the next paragraph. */
  def moveToBeginningOfNextParagraph(): Unit = js.native
  /** Moves the cursor to the beginning of the next word. */
  def moveToBeginningOfNextWord(): Unit = js.native
  /** Moves the cursor to the beginning of the previous paragraph. */
  def moveToBeginningOfPreviousParagraph(): Unit = js.native
  /** Moves the cursor to the beginning of the line. */
  def moveToBeginningOfScreenLine(): Unit = js.native
  /** Moves the cursor to the beginning of the word. */
  def moveToBeginningOfWord(): Unit = js.native
  /** Moves the cursor to the bottom of the buffer. */
  def moveToBottom(): Unit = js.native
  /** Moves the cursor to the end of the buffer line. */
  def moveToEndOfLine(): Unit = js.native
  /** Moves the cursor to the end of the line. */
  def moveToEndOfScreenLine(): Unit = js.native
  /** Moves the cursor to the end of the word. */
  def moveToEndOfWord(): Unit = js.native
  /** Moves the cursor to the beginning of the first character in the line. */
  def moveToFirstCharacterOfLine(): Unit = js.native
  /** Moves the cursor to the next subword boundary. */
  def moveToNextSubwordBoundary(): Unit = js.native
  /** Moves the cursor to the next word boundary. */
  def moveToNextWordBoundary(): Unit = js.native
  /** Moves the cursor to the previous subword boundary. */
  def moveToPreviousSubwordBoundary(): Unit = js.native
  /** Moves the cursor to the previous word boundary. */
  def moveToPreviousWordBoundary(): Unit = js.native
  /** Moves the cursor to the top of the buffer. */
  def moveToTop(): Unit = js.native
  // Moving the Cursor
  /** Moves the cursor up one screen row. */
  def moveUp(): Unit = js.native
  def moveUp(rowCount: Double): Unit = js.native
  def moveUp(rowCount: Double, options: AnonMoveToEndOfSelection): Unit = js.native
  // Event Subscription
  /** Calls your callback when the cursor has been moved. */
  def onDidChangePosition(callback: js.Function1[/* event */ CursorPositionChangedEvent, Unit]): Disposable = js.native
  /** Calls your callback when the cursor's visibility has changed. */
  def onDidChangeVisibility(callback: js.Function1[/* visibility */ Boolean, Unit]): Disposable = js.native
  /** Calls your callback when the cursor is destroyed. */
  def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
  /** Moves a cursor to a given buffer position. */
  def setBufferPosition(bufferPosition: PointCompatible): Unit = js.native
  def setBufferPosition(bufferPosition: PointCompatible, options: AnonAutoscroll): Unit = js.native
  // Managing Cursor Position
  /** Moves a cursor to a given screen position. */
  def setScreenPosition(screenPosition: PointCompatible): Unit = js.native
  def setScreenPosition(screenPosition: PointCompatible, options: AnonAutoscroll): Unit = js.native
  // Visibility
  /** Sets whether the cursor is visible. */
  def setVisible(visible: Boolean): Unit = js.native
  /** Moves the cursor to the beginning of the buffer line, skipping all whitespace. */
  def skipLeadingWhitespace(): Unit = js.native
  /** Get the RegExp used by the cursor to determine what a "subword" is. */
  def subwordRegExp(): js.RegExp = js.native
  def subwordRegExp(options: AnonBackwards): js.RegExp = js.native
  /** Get the RegExp used by the cursor to determine what a "word" is. */
  def wordRegExp(): js.RegExp = js.native
  def wordRegExp(options: AnonIncludeNonWordCharactersBoolean): js.RegExp = js.native
}

