package typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectedItemProps[T] extends IPickerItemProps[T] {
  def onCopyItem(item: T): Unit
}

object ISelectedItemProps {
  @scala.inline
  def apply[T](IPickerItemProps: IPickerItemProps[T], onCopyItem: T => Callback): ISelectedItemProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
    __obj.updateDynamic("onCopyItem")(js.Any.fromFunction1((t0: T) => onCopyItem(t0).runNow()))
    __obj.asInstanceOf[ISelectedItemProps[T]]
  }
}

