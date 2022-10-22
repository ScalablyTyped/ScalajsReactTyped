package typingsJapgolly.micromarkUtilTypes.mod

import typingsJapgolly.micromarkUtilTypes.anon.CloseFlow
import typingsJapgolly.micromarkUtilTypes.anon.PickTokenstartend
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenizeContext extends StObject {
  
  /**
    * Internal boolean shared with `micromark-extension-gfm-table` whose body
    * rows are not affected by normal interruption rules.
    * “Normal” rules are, for example, that an empty list item can’t interrupt:
    *
    * ````markdown
    * a
    * *
    * ````
    *
    * The above is one paragraph.
    * These rules don’t apply to table body rows:
    *
    * ````markdown
    * | a |
    * | - |
    * *
    * ````
    *
    * The above list interrupts the table.
    */
  var _gfmTableDynamicInterruptHack: js.UndefOr[Boolean] = js.native
  
  /**
    * Internal boolean shared with `micromark-extension-gfm-task-list-item` to
    * signal whether the tokenizer is tokenizing the first content of a list item
    * construct.
    */
  var _gfmTasklistFirstContentOfListItem: js.UndefOr[Boolean] = js.native
  
  /**
    *   Current code.
    */
  var code: Code = js.native
  
  /**
    * Info set when parsing containers.
    * Containers are parsed in separate phases: their first line (`tokenize`),
    * continued lines (`continuation.tokenize`), and finally `exit`.
    * This record can be used to store some information between these hooks.
    */
  var containerState: js.UndefOr[(Record[String, Any]) & CloseFlow] = js.native
  
  /**
    * The current construct.
    * Constructs that are not `partial` are set here.
    */
  var currentConstruct: js.UndefOr[Construct] = js.native
  
  /**
    *   Define a skip: as containers (block quotes, lists), “nibble” a prefix from
    *   the margins, where a line starts after that prefix is defined here.
    *   When the tokenizers moves after consuming a line ending corresponding to
    *   the line number in the given point, the tokenizer shifts past the prefix
    *   based on the column in the shifted point.
    */
  def defineSkip(value: Point): Unit = js.native
  
  /**
    *   Current list of events.
    */
  var events: js.Array[Event] = js.native
  
  /**
    * Whether we’re currently interrupting.
    * Take for example:
    *
    * ```markdown
    * a
    * # b
    * ```
    *
    * At 2:1, we’re “interrupting”.
    */
  var interrupt: js.UndefOr[Boolean] = js.native
  
  /**
    *   Get the current place.
    */
  def now(): Point = js.native
  
  /**
    *   The relevant parsing context.
    */
  var parser: ParseContext = js.native
  
  /**
    *   The previous code.
    */
  var previous: Code = js.native
  
  /**
    *   Get the source text that spans a token (or location).
    */
  def sliceSerialize(token: PickTokenstartend): String = js.native
  def sliceSerialize(token: PickTokenstartend, expandTabs: Boolean): String = js.native
  
  /**
    *   Get the chunks that span a token (or location).
    */
  def sliceStream(token: PickTokenstartend): js.Array[Chunk] = js.native
  
  /**
    *   Write a slice of chunks.
    *   The eof code (`null`) can be used to signal the end of the stream.
    */
  def write(slice: js.Array[Chunk]): js.Array[Event] = js.native
}
