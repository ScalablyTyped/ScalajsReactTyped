package typingsJapgolly.reactVirtualizedSelect.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactVirtualized.esListMod.ListProps
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualizedOptionRenderOptions[T] extends js.Object {
  var focusedOption: T
  var focusedOptionIndex: Double
  var key: String
  var labelKey: String
  var listProps: ListProps
  var option: T
  var options: js.Array[T]
  var style: Record[String, String]
  var valueArray: js.Array[T]
  def focusOption(option: T): Unit
  def selectValue(option: T): Unit
}

object VirtualizedOptionRenderOptions {
  @scala.inline
  def apply[T](
    focusOption: T => Callback,
    focusedOption: T,
    focusedOptionIndex: Double,
    key: String,
    labelKey: String,
    listProps: ListProps,
    option: T,
    options: js.Array[T],
    selectValue: T => Callback,
    style: Record[String, String],
    valueArray: js.Array[T]
  ): VirtualizedOptionRenderOptions[T] = {
    val __obj = js.Dynamic.literal(focusedOption = focusedOption.asInstanceOf[js.Any], focusedOptionIndex = focusedOptionIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], listProps = listProps.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], valueArray = valueArray.asInstanceOf[js.Any])
    __obj.updateDynamic("focusOption")(js.Any.fromFunction1((t0: T) => focusOption(t0).runNow()))
    __obj.updateDynamic("selectValue")(js.Any.fromFunction1((t0: T) => selectValue(t0).runNow()))
    __obj.asInstanceOf[VirtualizedOptionRenderOptions[T]]
  }
}

