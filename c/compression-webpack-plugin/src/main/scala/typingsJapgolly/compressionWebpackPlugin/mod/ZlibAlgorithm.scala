package typingsJapgolly.compressionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: These are the async compression algorithms on the zlib object.
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.compressionWebpackPlugin.compressionWebpackPluginStrings.deflate
  - typingsJapgolly.compressionWebpackPlugin.compressionWebpackPluginStrings.deflateRaw
  - typingsJapgolly.compressionWebpackPlugin.compressionWebpackPluginStrings.gzip
  - typingsJapgolly.compressionWebpackPlugin.compressionWebpackPluginStrings.brotliCompress
*/
trait ZlibAlgorithm extends js.Object

object ZlibAlgorithm {
  @scala.inline
  def brotliCompress: typingsJapgolly.compressionWebpackPlugin.compressionWebpackPluginStrings.brotliCompress = this.cast("brotliCompress")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typingsJapgolly.compressionWebpackPlugin.compressionWebpackPluginStrings.deflate = this.cast("deflate")
  @scala.inline
  def deflateRaw: typingsJapgolly.compressionWebpackPlugin.compressionWebpackPluginStrings.deflateRaw = this.cast("deflateRaw")
  @scala.inline
  def gzip: typingsJapgolly.compressionWebpackPlugin.compressionWebpackPluginStrings.gzip = this.cast("gzip")
}

