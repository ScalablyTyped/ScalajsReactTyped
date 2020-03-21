package typingsJapgolly.musicmetadata

import typingsJapgolly.musicmetadata.MM.Metadata
import typingsJapgolly.musicmetadata.MM.Options
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("musicmetadata", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(readStream: Readable, callback: js.Function2[/* err */ Error, /* metadata */ Metadata, Unit]): EventEmitter = js.native
  def apply(
    readStream: Readable,
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* metadata */ Metadata, Unit]
  ): EventEmitter = js.native
}

