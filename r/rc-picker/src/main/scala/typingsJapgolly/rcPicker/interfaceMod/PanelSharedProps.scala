package typingsJapgolly.rcPicker.interfaceMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelSharedProps[DateType] extends js.Object {
  /** [Legacy] Set default display picker view date */
  var defaultPickerValue: js.UndefOr[DateType] = js.native
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  var locale: Locale = js.native
  var nextIcon: js.UndefOr[Node] = js.native
  var onSelect: OnSelect[DateType] = js.native
  /**
    * Typescript can not handle generic type so we can not use `forwardRef` here.
    * Thus, move ref into operationRef.
    * This is little hack which should refactor after typescript support.
    */
  var operationRef: MutableRefObject[PanelRefProps] = js.native
  var prefixCls: String = js.native
  var prevIcon: js.UndefOr[Node] = js.native
  var superNextIcon: js.UndefOr[Node] = js.native
  var superPrevIcon: js.UndefOr[Node] = js.native
  var value: js.UndefOr[NullableDateType[DateType]] = js.native
  var viewDate: DateType = js.native
  def onPanelChange(mode: Null, viewValue: DateType): Unit = js.native
  def onPanelChange(mode: PanelMode, viewValue: DateType): Unit = js.native
  def onViewDateChange(value: DateType): Unit = js.native
}

