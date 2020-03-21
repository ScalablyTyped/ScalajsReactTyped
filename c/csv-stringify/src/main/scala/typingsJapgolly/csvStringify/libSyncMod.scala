package typingsJapgolly.csvStringify

import typingsJapgolly.csvStringify.mod.Input
import typingsJapgolly.csvStringify.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csv-stringify/lib/sync", JSImport.Namespace)
@js.native
object libSyncMod extends js.Object {
  def apply(input: Input): String = js.native
  def apply(input: Input, options: Options): String = js.native
}

