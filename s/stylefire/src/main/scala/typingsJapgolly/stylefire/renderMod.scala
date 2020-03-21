package typingsJapgolly.stylefire

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Set
import typingsJapgolly.stylefire.stylefireBooleans.`true`
import typingsJapgolly.stylefire.typesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylefire/lib/css/render", JSImport.Namespace)
@js.native
object renderMod extends js.Object {
  val aliasMap: AliasMap_ = js.native
  def default(
    state: State,
    changedValues: js.Array[String],
    enableHardwareAcceleration: Boolean,
    blacklist: Set[String]
  ): String = js.native
  @JSName("default")
  def default_true(state: State, changedValues: `true`, enableHardwareAcceleration: Boolean, blacklist: Set[String]): String = js.native
  type AliasMap_ = StringDictionary[String]
}

