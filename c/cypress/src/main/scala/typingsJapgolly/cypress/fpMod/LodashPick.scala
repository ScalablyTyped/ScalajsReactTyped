package typingsJapgolly.cypress.fpMod

import typingsJapgolly.cypress.lodashMod.PartialDeep
import typingsJapgolly.cypress.lodashMod.PropertyPath
import typingsJapgolly.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPick extends js.Object {
  def apply(props: PropertyPath): LodashPick2x1 = js.native
  def apply[T](props: PropertyPath, `object`: T): PartialDeep[T] = js.native
  def apply[T](props: __): LodashPick2x2[T] = js.native
  def apply[T](props: __, `object`: T): LodashPick2x2[T] = js.native
}

