package typingsJapgolly.duplexify.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.node.streamMod.DuplexOptions
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("duplexify", JSImport.Namespace)
@js.native
class ^ () extends Duplexify {
  def this(writable: Writable) = this()
  def this(writable: Writable, readable: Readable) = this()
  def this(writable: Writable, readable: Readable, streamOptions: DuplexOptions) = this()
}

@JSImport("duplexify", JSImport.Namespace)
@js.native
object ^ extends TopLevel[DuplexifyConstructor]

