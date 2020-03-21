package typingsJapgolly.csvParse

import typingsJapgolly.csvParse.es5Mod.Options
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csv-parse/lib/es5/sync", JSImport.Namespace)
@js.native
object syncMod extends js.Object {
  def apply(input: String): js.Any = js.native
  def apply(input: String, options: Options): js.Any = js.native
  def apply(input: Buffer): js.Any = js.native
  def apply(input: Buffer, options: Options): js.Any = js.native
}

