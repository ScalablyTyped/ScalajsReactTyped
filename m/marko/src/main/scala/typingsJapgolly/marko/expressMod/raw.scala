package typingsJapgolly.marko.expressMod

import typingsJapgolly.bodyParser.mod.Options
import typingsJapgolly.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
  * @since 4.17.0
  */
@JSImport("marko/express", "raw")
@js.native
object raw extends js.Object {
  def apply(): NextHandleFunction = js.native
  def apply(options: Options): NextHandleFunction = js.native
}

