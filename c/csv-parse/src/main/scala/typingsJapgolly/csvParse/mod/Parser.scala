package typingsJapgolly.csvParse.mod

import typingsJapgolly.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csv-parse", "Parser")
@js.native
class Parser protected () extends Transform {
  def this(options: Options) = this()
  val info: Info = js.native
  val options: Options = js.native
  def __push(line: js.Any): js.Any = js.native
  def __write(chars: js.Any, end: js.Any, callback: js.Any): js.Any = js.native
}

