package typingsJapgolly.ember.mod.Ember

import typingsJapgolly.emberObject.typesMod.UnwrapComputedPropertySetters
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.setProperties")
@js.native
object setProperties extends js.Object {
  def apply[T, K /* <: java.lang.String */](obj: T, hash: Pick[T | UnwrapComputedPropertySetters[T], K]): Pick[T, K] = js.native
}

