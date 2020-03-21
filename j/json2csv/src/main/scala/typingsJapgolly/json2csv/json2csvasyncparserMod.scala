package typingsJapgolly.json2csv

import typingsJapgolly.json2csv.json2csvbaseMod.json2csv.Options
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv/JSON2CSVAsyncParser", JSImport.Namespace)
@js.native
object json2csvasyncparserMod extends js.Object {
  @js.native
  trait JSON2CSVAsyncParser[T]
    extends typingsJapgolly.json2csv.json2csvbaseMod.default[T] {
    var input: Transform = js.native
    var processor: Writable = js.native
    var transform: typingsJapgolly.json2csv.json2csvtransformMod.default[T] = js.native
    def fromInput(input: Readable): JSON2CSVAsyncParser[T] = js.native
    def promise(): js.Promise[String] = js.native
    def throughTransform(transform: Transform): JSON2CSVAsyncParser[T] = js.native
    def toOutput(output: Writable): JSON2CSVAsyncParser[T] = js.native
  }
  
  @js.native
  class default[T] () extends JSON2CSVAsyncParser[T] {
    def this(opts: Options[T]) = this()
    def this(opts: Options[T], transformOpts: TransformOptions) = this()
  }
  
}

