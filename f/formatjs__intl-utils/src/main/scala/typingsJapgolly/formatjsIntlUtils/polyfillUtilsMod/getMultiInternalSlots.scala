package typingsJapgolly.formatjsIntlUtils.polyfillUtilsMod

import typingsJapgolly.std.Pick
import typingsJapgolly.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/polyfill-utils", "getMultiInternalSlots")
@js.native
object getMultiInternalSlots extends js.Object {
  def apply[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, fields: Field*): Pick[Internal, Field] = js.native
}

