package typingsJapgolly.prettyFormat

import typingsJapgolly.prettyFormat.typesMod.Config
import typingsJapgolly.prettyFormat.typesMod.NewPlugin
import typingsJapgolly.prettyFormat.typesMod.Printer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/ConvertAnsi", JSImport.Namespace)
@js.native
object convertAnsiMod extends js.Object {
  val default: NewPlugin = js.native
  def serialize(
    `val`: String,
    config: Config,
    indentation: String,
    depth: Double,
    refs: js.Array[_],
    printer: Printer
  ): String = js.native
  def test(`val`: js.Any): Boolean = js.native
}

