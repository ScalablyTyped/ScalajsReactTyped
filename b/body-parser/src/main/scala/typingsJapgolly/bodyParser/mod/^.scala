package typingsJapgolly.bodyParser.mod

import typingsJapgolly.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("body-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // for docs go to https://github.com/expressjs/body-parser/tree/1.19.0#body-parser
  /** @deprecated */
  def apply(): NextHandleFunction = js.native
  def apply(options: OptionsJson with OptionsText with OptionsUrlencoded): NextHandleFunction = js.native
}

