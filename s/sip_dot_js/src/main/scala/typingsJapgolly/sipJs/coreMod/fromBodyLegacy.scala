package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.AnonBody
import typingsJapgolly.sipJs.bodyMod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "fromBodyLegacy")
@js.native
object fromBodyLegacy extends js.Object {
  def apply(bodyLegacy: String): Body = js.native
  def apply(bodyLegacy: AnonBody): Body = js.native
}

