package typingsJapgolly.pako.mod

import typingsJapgolly.pako.DeflateFunctionOptionstos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", "deflateRaw")
@js.native
object deflateRaw extends js.Object {
  def apply(data: Data): scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
    */
  def apply(data: Data, options: DeflateFunctionOptionstos): String = js.native
  def apply(data: Data, options: DeflateFunctionOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
}

