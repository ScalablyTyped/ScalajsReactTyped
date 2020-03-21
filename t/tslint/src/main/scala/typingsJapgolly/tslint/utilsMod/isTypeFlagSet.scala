package typingsJapgolly.tslint.utilsMod

import typingsJapgolly.typescript.mod.Type
import typingsJapgolly.typescript.mod.TypeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "isTypeFlagSet")
@js.native
object isTypeFlagSet extends js.Object {
  def apply(`type`: Type, flagToCheck: TypeFlags): Boolean = js.native
}

