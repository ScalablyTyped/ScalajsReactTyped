package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.PartialDeep
import typingsJapgolly.lodash.mod.PropertyPath
import typingsJapgolly.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPick extends js.Object {
  def apply(props: PropertyPath): LodashPick2x1 = js.native
  def apply[T](props: PropertyPath, `object`: T): PartialDeep[T] = js.native
  def apply[T](props: __): LodashPick2x2[T] = js.native
  def apply[T /* <: js.Object */](props: __, `object`: T): LodashPick1x2[T] = js.native
}

