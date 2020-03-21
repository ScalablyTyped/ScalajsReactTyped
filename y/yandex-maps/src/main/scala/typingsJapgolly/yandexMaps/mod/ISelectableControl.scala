package typingsJapgolly.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectableControl extends IChild[IControlParent] {
  def deselect(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def isEnabled(): Boolean = js.native
  def isSelected(): Boolean = js.native
  def select(): Unit = js.native
}

