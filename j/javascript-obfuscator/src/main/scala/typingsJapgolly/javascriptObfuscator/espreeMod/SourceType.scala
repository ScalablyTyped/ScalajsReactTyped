package typingsJapgolly.javascriptObfuscator.espreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.javascriptObfuscator.javascriptObfuscatorStrings.script
  - typingsJapgolly.javascriptObfuscator.javascriptObfuscatorStrings.module
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def module: typingsJapgolly.javascriptObfuscator.javascriptObfuscatorStrings.module = this.cast("module")
  @scala.inline
  def script: typingsJapgolly.javascriptObfuscator.javascriptObfuscatorStrings.script = this.cast("script")
}

