package typingsJapgolly.maxmind.mod

import typingsJapgolly.maxmind.responseMod.Response
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind", "Reader")
@js.native
class Reader[T /* <: Response */] protected ()
  extends typingsJapgolly.maxmind.readerMod.default[T] {
  def this(db: Buffer) = this()
  def this(db: Buffer, opts: OpenOpts) = this()
}

