package typingsJapgolly.rcPicker

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.rcPicker.dateBodyMod.DateRender
import typingsJapgolly.rcPicker.interfaceMod.PanelSharedProps
import typingsJapgolly.rcPicker.uiUtilMod.KeyboardConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/panels/DatePanel", JSImport.Namespace)
@js.native
object datePanelMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.rcPicker.dateBodyMod.DateBodyPassProps because var conflicts: disabledDate. Inlined dateRender, prefixColumn, rowClassName */ @js.native
  trait DatePanelProps[DateType] extends PanelSharedProps[DateType] {
    var active: js.UndefOr[Boolean] = js.native
    var dateRender: js.UndefOr[DateRender[DateType]] = js.native
    var keyboardConfig: js.UndefOr[KeyboardConfig] = js.native
    var panelName: js.UndefOr[String] = js.native
    var prefixColumn: js.UndefOr[js.Function1[DateType, Node]] = js.native
    var rowClassName: js.UndefOr[js.Function1[DateType, String]] = js.native
  }
  
  def default[DateType](props: DatePanelProps[DateType]): Element = js.native
}

