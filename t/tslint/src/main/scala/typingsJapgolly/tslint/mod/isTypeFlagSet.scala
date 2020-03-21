package typingsJapgolly.tslint.mod

import typingsJapgolly.typescript.mod.Type
import typingsJapgolly.typescript.mod.TypeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "isTypeFlagSet")
@js.native
object isTypeFlagSet extends js.Object {
  def apply(`type`: Type, flagToCheck: TypeFlags): Boolean = js.native
}

