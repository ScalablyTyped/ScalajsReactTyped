package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxServer Class */
@JSGlobal("FAXCOMEXLib.FaxServer")
@js.native
class FaxServer protected () extends IFaxServer {
  /** Fax server configuration */
  val Configuration: FaxConfiguration = js.native
  /** FaxAccount for the current connection */
  val CurrentAccount: FaxAccount = js.native
  @JSName("FAXCOMEXLib.FaxServer_typekey")
  var FAXCOMEXLibDotFaxServer_typekey: FaxServer = js.native
  /** The FaxAccountSet configuration object */
  val FaxAccountSet: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxAccountSet = js.native
  /** The security configuration object */
  val Security2: FaxSecurity2 = js.native
}

