package typingsJapgolly.pngjs

import typingsJapgolly.node.Buffer
import typingsJapgolly.pngjs.mod.PNG
import typingsJapgolly.pngjs.mod.PNGWithMetadata
import typingsJapgolly.pngjs.mod.PackerOptions
import typingsJapgolly.pngjs.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRead extends js.Object {
  def read(buffer: Buffer): PNGWithMetadata = js.native
  def read(buffer: Buffer, options: ParserOptions): PNGWithMetadata = js.native
  def write(png: PNG): Buffer = js.native
  def write(png: PNG, options: PackerOptions): Buffer = js.native
}

