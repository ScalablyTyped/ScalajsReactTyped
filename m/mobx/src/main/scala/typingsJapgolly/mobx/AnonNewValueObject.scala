package typingsJapgolly.mobx

import typingsJapgolly.mobx.mobxStrings.add
import typingsJapgolly.mobx.observablesetMod.ISetDidChange
import typingsJapgolly.mobx.observablesetMod.ObservableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValueObject[T] extends ISetDidChange[T] {
  var newValue: T
  var `object`: ObservableSet[T]
  var `type`: add
}

object AnonNewValueObject {
  @scala.inline
  def apply[T](newValue: T, `object`: ObservableSet[T], `type`: add): AnonNewValueObject[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewValueObject[T]]
  }
}

