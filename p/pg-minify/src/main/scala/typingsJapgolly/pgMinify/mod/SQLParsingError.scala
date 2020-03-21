package typingsJapgolly.pgMinify.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-minify", "SQLParsingError")
@js.native
class SQLParsingError () extends Error {
  var code: parsingErrorCode = js.native
  var error: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var position: IErrorPosition = js.native
  @JSName("stack")
  var stack_SQLParsingError: String = js.native
}

