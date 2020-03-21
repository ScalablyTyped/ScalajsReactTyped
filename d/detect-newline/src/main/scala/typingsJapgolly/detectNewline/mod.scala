package typingsJapgolly.detectNewline

import typingsJapgolly.detectNewline.detectNewlineStrings.CarriagereturnLinefeed
import typingsJapgolly.detectNewline.detectNewlineStrings.Linefeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-newline", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
  	Detect the dominant newline character of a string.
  	@returns The detected newline or `undefined` when no newline character is found.
  	@example
  	```
  	import detectNewline = require('detect-newline');
  	detectNewline('foo\nbar\nbaz\r\n');
  	//=> '\n'
  	```
  	*/
  def apply(string: String): js.UndefOr[CarriagereturnLinefeed | Linefeed] = js.native
  def graceful(): Linefeed = js.native
  /**
  	Detect the dominant newline character of a string.
  	@returns The detected newline or `\n` when no newline character is found or the input is not a string.
  	*/
  def graceful(string: String): CarriagereturnLinefeed | Linefeed = js.native
  def graceful(string: js.Any): Linefeed = js.native
}

