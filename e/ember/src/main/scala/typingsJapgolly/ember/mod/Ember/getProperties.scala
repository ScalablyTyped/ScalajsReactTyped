package typingsJapgolly.ember.mod.Ember

import typingsJapgolly.emberObject.typesMod.UnwrapComputedPropertyGetters
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.getProperties")
@js.native
object getProperties extends js.Object {
  def apply[T, K /* <: java.lang.String */](obj: T, list: K*): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
  def apply[T, K /* <: java.lang.String */](obj: T, list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
}

