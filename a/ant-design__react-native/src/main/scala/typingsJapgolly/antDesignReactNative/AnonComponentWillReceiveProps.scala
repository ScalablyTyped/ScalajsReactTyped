package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponentWillReceiveProps extends js.Object {
  var context: js.Any = js.native
  var picker: js.Any = js.native
  val props: ReadonlychildrenReactNodeActionTextActiveOpacity = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var state: js.Any = js.native
  def componentWillReceiveProps(nextProps: AnonVisible): Unit = js.native
  def fireVisibleChange(visible: Boolean): Unit = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[Unit]): Unit = js.native
  def getContent(): js.UndefOr[String | Element] = js.native
  def getRender(): Element = js.native
  def hide(): Unit = js.native
  def onDismiss(): Unit = js.native
  def onOk(): Unit = js.native
  def onPickerChange(pickerValue: js.Any): Unit = js.native
  def onTriggerClick(e: js.Any): Unit = js.native
  def render(): Element = js.native
  def saveRef(picker: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[Unit]): Unit = js.native
  def setVisibleState(visible: js.Any): Unit = js.native
}

