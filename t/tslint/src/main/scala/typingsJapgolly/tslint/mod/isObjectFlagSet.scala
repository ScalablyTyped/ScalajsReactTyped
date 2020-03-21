package typingsJapgolly.tslint.mod

import typingsJapgolly.typescript.mod.ObjectFlags
import typingsJapgolly.typescript.mod.ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "isObjectFlagSet")
@js.native
object isObjectFlagSet extends js.Object {
  def apply(objectType: ObjectType, flagToCheck: ObjectFlags): Boolean = js.native
}

