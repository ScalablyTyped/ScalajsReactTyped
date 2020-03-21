package typingsJapgolly.rcDialog.dialogMod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.rcDialog.idialogproptypesMod.IDialogPropTypes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog
  extends Component[IDialogChildProps, js.Any, js.Any] {
  var dialog: js.Any = js.native
  var dialogMouseDown: js.Any = js.native
  var inTransition: js.Any = js.native
  var lastOutSideFocusNode: js.Any = js.native
  var onMaskMouseUp: MouseEventHandler[HTMLDivElement] = js.native
  var openTime: js.Any = js.native
  var sentinelEnd: js.Any = js.native
  var sentinelStart: js.Any = js.native
  var switchScrollingEffect: js.Any = js.native
  var timeoutId: js.Any = js.native
  var titleId: js.Any = js.native
  var wrap: js.Any = js.native
  def close(e: js.Any): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDialog(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDialog(prevProps: IDialogPropTypes): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDialog(): Unit = js.native
  def getDialogElement(): Element = js.native
  def getMaskElement(): js.UndefOr[Element] = js.native
  def getMaskStyle(): js.Any = js.native
  def getMaskTransitionName(): js.UndefOr[String] = js.native
  def getTransitionName(): js.UndefOr[String] = js.native
  def getWrapStyle(): js.Any = js.native
  def getZIndexStyle(): js.Any = js.native
  def onAnimateLeave(): Unit = js.native
  def onDialogMouseDown(): Unit = js.native
  def onKeyDown(e: ReactKeyboardEventFrom[HTMLDivElement]): Unit = js.native
  def onMaskClick(e: ReactMouseEventFrom[HTMLDivElement]): Unit = js.native
  def saveRef(name: String): js.Function1[/* node */ js.Any, Unit] = js.native
  def tryFocus(): Unit = js.native
}

