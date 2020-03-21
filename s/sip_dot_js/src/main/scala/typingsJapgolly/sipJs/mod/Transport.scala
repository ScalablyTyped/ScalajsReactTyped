package typingsJapgolly.sipJs.mod

import typingsJapgolly.sipJs.coreMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Transport")
@js.native
abstract class Transport protected ()
  extends typingsJapgolly.sipJs.libTransportMod.Transport {
  /**
    * Constructor
    * @param logger - Logger.
    * @param options - Options bucket. Deprecated.
    */
  def this(logger: Logger) = this()
  def this(logger: Logger, options: js.Any) = this()
}

