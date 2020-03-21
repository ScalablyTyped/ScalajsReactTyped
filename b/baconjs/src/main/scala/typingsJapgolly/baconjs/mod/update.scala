package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.updateMod.UpdatePattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "update")
@js.native
object update extends js.Object {
  def apply[Out](initial: Out, patterns: UpdatePattern[Out]*): typingsJapgolly.baconjs.observableMod.Property[Out] = js.native
}

