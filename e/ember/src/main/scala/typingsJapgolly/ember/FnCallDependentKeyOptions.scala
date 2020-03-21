package typingsJapgolly.ember

import typingsJapgolly.emberObject.AnonId
import typingsJapgolly.emberObject.AnonUntil
import typingsJapgolly.emberObject.computedMod.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallDependentKeyOptions extends js.Object {
  def apply(dependentKey: String): ComputedProperty[_, _] = js.native
  def apply(dependentKey: String, options: AnonId): ComputedProperty[_, _] = js.native
  def apply(dependentKey: String, options: AnonUntil): ComputedProperty[_, _] = js.native
}

