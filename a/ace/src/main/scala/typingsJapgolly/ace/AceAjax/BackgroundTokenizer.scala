package typingsJapgolly.ace.AceAjax

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundTokenizer extends js.Object {
  var states: js.Array[_]
  /**
    * Emits the `'update'` event. `firstRow` and `lastRow` are used to define the boundaries of the region to be updated.
    * @param firstRow The starting row region
    * @param lastRow The final row region
    **/
  def fireUpdateEvent(firstRow: Double, lastRow: Double): Unit
  /**
    * [Returns the state of tokenization at the end of a row.]{: #BackgroundTokenizer.getState}
    * @param row The row to get state at
    **/
  def getState(row: Double): String
  /**
    * Gives list of tokens of the row. (tokens are cached)
    * @param row The row to get tokens at
    **/
  def getTokens(row: Double): js.Array[TokenInfo]
  /**
    * Sets a new document to associate with this object.
    * @param doc The new document to associate with
    **/
  def setDocument(doc: Document): Unit
  /**
    * Sets a new tokenizer for this object.
    * @param tokenizer The new tokenizer to use
    **/
  def setTokenizer(tokenizer: Tokenizer): Unit
  /**
    * Starts tokenizing at the row indicated.
    * @param startRow The row to start at
    **/
  def start(startRow: Double): Unit
  /**
    * Stops tokenizing.
    **/
  def stop(): Unit
}

@JSGlobal("AceAjax.BackgroundTokenizer")
@js.native
object BackgroundTokenizer
  extends /**
  * Creates a new `BackgroundTokenizer` object.
  * @param tokenizer The tokenizer to use
  * @param editor The editor to associate with
  **/
Instantiable2[/* tokenizer */ Tokenizer, /* editor */ Editor, BackgroundTokenizer]

