package typingsJapgolly.rcPicker

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.rcPicker.interfaceMod.PanelMode
import typingsJapgolly.rcPicker.interfaceMod.PanelSharedProps
import typingsJapgolly.rcPicker.rcPickerNumbers.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-picker/lib/panels/YearPanel", JSImport.Namespace)
@js.native
object yearPanelMod extends js.Object {
  @js.native
  trait YearPanelProps[DateType] extends PanelSharedProps[DateType] {
    var sourceMode: PanelMode = js.native
  }
  
  val YEAR_DECADE_COUNT: `10` = js.native
  def default[DateType](props: YearPanelProps[DateType]): Element = js.native
}

