package typingsJapgolly.papaparse.mod

import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("papaparse", "parse")
@js.native
object parse extends js.Object {
  def apply(input: String): ParseResult = js.native
  def apply(input: String, config: ParseConfig): ParseResult = js.native
  def apply(input: ReadableStream): ParseResult = js.native
  def apply(input: ReadableStream, config: ParseConfig): ParseResult = js.native
  def apply(input: File): ParseResult = js.native
  def apply(input: File, config: ParseConfig): ParseResult = js.native
  def apply(stream: NODE_STREAM_INPUT_TYPE): ReadWriteStream = js.native
  def apply(stream: NODE_STREAM_INPUT_TYPE, config: ParseConfig): ReadWriteStream = js.native
}

