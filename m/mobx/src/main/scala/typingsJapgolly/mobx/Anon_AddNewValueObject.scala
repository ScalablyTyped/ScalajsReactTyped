package typingsJapgolly.mobx

import typingsJapgolly.mobx.libTypesObservablesetMod.ISetWillChange
import typingsJapgolly.mobx.libTypesObservablesetMod.ObservableSet
import typingsJapgolly.mobx.mobxStrings.add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddNewValueObject[T] extends ISetWillChange[T] {
  var newValue: T
  var `object`: ObservableSet[T]
  var `type`: add
}

object Anon_AddNewValueObject {
  @scala.inline
  def apply[T](newValue: T, `object`: ObservableSet[T], `type`: add): Anon_AddNewValueObject[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddNewValueObject[T]]
  }
}

