package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import typingsJapgolly.angular.JQueryEventObject
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenuService extends js.Object {
  def close(): Unit = js.native
  def hide(): IPromise[_] = js.native
  def hide(response: js.Any): IPromise[_] = js.native
  def hide(response: js.Any, options: js.Any): IPromise[_] = js.native
  def open(): Unit = js.native
  def open(event: JQueryEventObject): Unit = js.native
  def open(event: MouseEvent): Unit = js.native
}

