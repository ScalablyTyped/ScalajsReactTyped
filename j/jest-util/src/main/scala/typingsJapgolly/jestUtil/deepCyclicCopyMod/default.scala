package typingsJapgolly.jestUtil.deepCyclicCopyMod

import typingsJapgolly.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-util/build/deepCyclicCopy", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[T](value: T): T = js.native
  def apply[T](value: T, options: DeepCyclicCopyOptions): T = js.native
  def apply[T](value: T, options: DeepCyclicCopyOptions, cycles: WeakMap[_, _]): T = js.native
}

