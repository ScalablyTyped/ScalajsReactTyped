package typingsJapgolly.fastCsv

import typingsJapgolly.fastCsv.csvFormatterStreamMod.default
import typingsJapgolly.fastCsv.formatterOptionsMod.FormatterOptionsArgs
import typingsJapgolly.fastCsv.parserMod.CsvParserStream
import typingsJapgolly.fastCsv.parserOptionsMod.ParserOptionsArgs
import typingsJapgolly.fastCsv.typesMod.Row
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def format(): default = js.native
  def format(options: FormatterOptionsArgs): default = js.native
  def fromPath(location: String): CsvParserStream = js.native
  def fromPath(location: String, options: ParserOptionsArgs): CsvParserStream = js.native
  def fromStream(stream: ReadableStream): CsvParserStream = js.native
  def fromStream(stream: ReadableStream, options: ParserOptionsArgs): CsvParserStream = js.native
  def fromString(string: String): CsvParserStream = js.native
  def fromString(string: String, options: ParserOptionsArgs): CsvParserStream = js.native
  def parse(): typingsJapgolly.fastCsv.csvParserStreamMod.default = js.native
  def parse(args: ParserOptionsArgs): typingsJapgolly.fastCsv.csvParserStreamMod.default = js.native
  def parseFile(location: String): typingsJapgolly.fastCsv.csvParserStreamMod.default = js.native
  def parseFile(location: String, options: ParserOptionsArgs): typingsJapgolly.fastCsv.csvParserStreamMod.default = js.native
  def parseStream(stream: ReadableStream): typingsJapgolly.fastCsv.csvParserStreamMod.default = js.native
  def parseStream(stream: ReadableStream, options: ParserOptionsArgs): typingsJapgolly.fastCsv.csvParserStreamMod.default = js.native
  def parseString(string: String): typingsJapgolly.fastCsv.csvParserStreamMod.default = js.native
  def parseString(string: String, options: ParserOptionsArgs): typingsJapgolly.fastCsv.csvParserStreamMod.default = js.native
  def write(rows: js.Array[Row]): default = js.native
  def write(rows: js.Array[Row], options: FormatterOptionsArgs): default = js.native
  def writeToBuffer(rows: js.Array[Row]): js.Promise[Buffer] = js.native
  def writeToBuffer(rows: js.Array[Row], opts: FormatterOptionsArgs): js.Promise[Buffer] = js.native
  def writeToPath(path: String, rows: js.Array[Row]): WriteStream = js.native
  def writeToPath(path: String, rows: js.Array[Row], options: FormatterOptionsArgs): WriteStream = js.native
  def writeToStream[T /* <: WritableStream */](ws: T, rows: js.Array[Row]): T = js.native
  def writeToStream[T /* <: WritableStream */](ws: T, rows: js.Array[Row], options: FormatterOptionsArgs): T = js.native
  def writeToString(rows: js.Array[Row]): js.Promise[String] = js.native
  def writeToString(rows: js.Array[Row], options: FormatterOptionsArgs): js.Promise[String] = js.native
}

