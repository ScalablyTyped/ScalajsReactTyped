package typingsJapgolly.remotedevSerialize

import typingsJapgolly.remotedevSerialize.mod.DefaultReplacer
import typingsJapgolly.remotedevSerialize.mod.DefaultReviver
import typingsJapgolly.remotedevSerialize.mod.Options
import typingsJapgolly.remotedevSerialize.mod.Replacer
import typingsJapgolly.remotedevSerialize.mod.Reviver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOptions extends js.Object {
  var options: Options = js.native
  @JSName("replacer")
  var replacer_Original: Replacer = js.native
  @JSName("reviver")
  var reviver_Original: Reviver = js.native
  def replacer(key: String, value: js.Any, replacer: DefaultReplacer): js.Any = js.native
  def reviver(key: String, value: js.Any, reviver: DefaultReviver): js.Any = js.native
}

