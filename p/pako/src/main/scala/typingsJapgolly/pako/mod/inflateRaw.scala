package typingsJapgolly.pako.mod

import typingsJapgolly.pako.InflateFunctionOptionstos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", "inflateRaw")
@js.native
object inflateRaw extends js.Object {
  def apply(data: Data): scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
    */
  def apply(data: Data, options: InflateFunctionOptionstos): String = js.native
  def apply(data: Data, options: InflateFunctionOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
}

