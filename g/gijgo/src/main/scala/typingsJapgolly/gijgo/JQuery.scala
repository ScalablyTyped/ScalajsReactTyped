package typingsJapgolly.gijgo

import typingsJapgolly.gijgo.Types.Checkbox
import typingsJapgolly.gijgo.Types.CheckboxSettings
import typingsJapgolly.gijgo.Types.DatePicker
import typingsJapgolly.gijgo.Types.DatePickerSettings
import typingsJapgolly.gijgo.Types.DateTimePicker
import typingsJapgolly.gijgo.Types.DateTimePickerSettings
import typingsJapgolly.gijgo.Types.Dialog
import typingsJapgolly.gijgo.Types.DialogSettings
import typingsJapgolly.gijgo.Types.DropDown
import typingsJapgolly.gijgo.Types.DropDownSettings
import typingsJapgolly.gijgo.Types.Editor
import typingsJapgolly.gijgo.Types.EditorSettings
import typingsJapgolly.gijgo.Types.Grid
import typingsJapgolly.gijgo.Types.GridSettings
import typingsJapgolly.gijgo.Types.Slider
import typingsJapgolly.gijgo.Types.SliderSettings
import typingsJapgolly.gijgo.Types.TimePicker
import typingsJapgolly.gijgo.Types.TimePickerSettings
import typingsJapgolly.gijgo.Types.Tree
import typingsJapgolly.gijgo.Types.TreeSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def checkbox(settings: CheckboxSettings): Checkbox = js.native
  def datepicker(settings: DatePickerSettings): DatePicker = js.native
  def datetimepicker(settings: DateTimePickerSettings): DateTimePicker = js.native
  def dialog(settings: DialogSettings): Dialog = js.native
  def dropdown(settings: DropDownSettings): DropDown = js.native
  def editor(settings: EditorSettings): Editor = js.native
  def grid(settings: GridSettings[_]): Grid[_, _] = js.native
  @JSName("grid")
  def grid_Entity[Entity](settings: GridSettings[Entity]): Grid[Entity, _] = js.native
  @JSName("grid")
  def grid_EntityParams[Entity, Params](settings: GridSettings[Entity]): Grid[Entity, Params] = js.native
  def slider(settings: SliderSettings): Slider = js.native
  def timepicker(settings: TimePickerSettings): TimePicker = js.native
  def tree(settings: TreeSettings): Tree = js.native
}

