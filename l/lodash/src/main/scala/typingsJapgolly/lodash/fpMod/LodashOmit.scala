package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.AnyKindOfDictionary
import typingsJapgolly.lodash.mod.Many
import typingsJapgolly.lodash.mod.PropertyName
import typingsJapgolly.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOmit extends js.Object {
  def apply(paths: Many[PropertyName]): LodashOmit1x1 = js.native
  def apply[T /* <: AnyKindOfDictionary */](paths: Many[PropertyName], `object`: T): T = js.native
  def apply[T /* <: js.Object */](paths: __): LodashOmit2x2[T] = js.native
  def apply[T /* <: js.Object */](paths: __, `object`: T): LodashOmit2x2[T] = js.native
}

