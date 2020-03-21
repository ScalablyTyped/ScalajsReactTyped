package typingsJapgolly.flatpickr.globalsMod._Global_

import typingsJapgolly.flatpickr.instanceMod.FlatpickrFn
import typingsJapgolly.flatpickr.instanceMod.Instance
import typingsJapgolly.flatpickr.optionsMod.Options
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  @JSName("flatpickr")
  var flatpickr_Original: FlatpickrFn = js.native
  def flatpickr(selector: String): Instance | js.Array[Instance] = js.native
  def flatpickr(selector: String, config: Options): Instance | js.Array[Instance] = js.native
  def flatpickr(selector: ArrayLike[Node]): js.Array[Instance] = js.native
  def flatpickr(selector: ArrayLike[Node], config: Options): js.Array[Instance] = js.native
  def flatpickr(selector: Node): Instance = js.native
  def flatpickr(selector: Node, config: Options): Instance = js.native
}

