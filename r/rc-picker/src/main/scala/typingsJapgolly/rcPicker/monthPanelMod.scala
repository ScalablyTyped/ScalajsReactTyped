package typingsJapgolly.rcPicker

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.rcPicker.interfaceMod.PanelSharedProps
import typingsJapgolly.rcPicker.monthBodyMod.MonthCellRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/panels/MonthPanel", JSImport.Namespace)
@js.native
object monthPanelMod extends js.Object {
  @js.native
  trait MonthPanelProps[DateType] extends PanelSharedProps[DateType] {
    var monthCellContentRender: js.UndefOr[MonthCellRender[DateType]] = js.native
  }
  
  def default[DateType](props: MonthPanelProps[DateType]): Element = js.native
}

