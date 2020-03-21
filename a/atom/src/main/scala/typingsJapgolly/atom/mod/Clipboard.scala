package typingsJapgolly.atom.mod

import typingsJapgolly.atom.AnonMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clipboard extends js.Object {
  /** Read the text from the clipboard. */
  def read(): String = js.native
  /**
    *  Read the text from the clipboard and return both the text and the associated
    *  metadata.
    */
  def readWithMetadata(): AnonMetadata = js.native
  /** Write the given text to the clipboard. */
  def write(text: String): Unit = js.native
  def write(text: String, metadata: js.Object): Unit = js.native
}

