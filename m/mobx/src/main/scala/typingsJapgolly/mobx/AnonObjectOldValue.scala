package typingsJapgolly.mobx

import typingsJapgolly.mobx.mobxStrings.delete
import typingsJapgolly.mobx.observablesetMod.ISetDidChange
import typingsJapgolly.mobx.observablesetMod.ObservableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObjectOldValue[T] extends ISetDidChange[T] {
  var `object`: ObservableSet[T]
  var oldValue: T
  var `type`: delete
}

object AnonObjectOldValue {
  @scala.inline
  def apply[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): AnonObjectOldValue[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObjectOldValue[T]]
  }
}

