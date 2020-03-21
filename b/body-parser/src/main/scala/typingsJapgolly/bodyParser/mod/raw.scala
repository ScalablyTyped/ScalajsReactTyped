package typingsJapgolly.bodyParser.mod

import typingsJapgolly.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("body-parser", "raw")
@js.native
object raw extends js.Object {
  /**
    * Returns middleware that parses all bodies as a Buffer and only looks at requests
    * where the Content-Type header matches the type option.
    */
  def apply(): NextHandleFunction = js.native
  def apply(options: Options): NextHandleFunction = js.native
}

