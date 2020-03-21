package typingsJapgolly.baseui.toastMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.baseui.AnonPlacement
import typingsJapgolly.baseui.ReadonlyToastPropskeyKey
import typingsJapgolly.baseui.ReadonlyToasterProps
import typingsJapgolly.baseui.ToastPropskeyKey
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/toast", "ToasterContainer")
@js.native
class ToasterContainer ()
  extends Component[ReadonlyToasterProps, ToasterContainerState, js.Any] {
  def clear(key: Key): Unit = js.native
  def clearAll(): Unit = js.native
  def dismiss(key: Key): Unit = js.native
  def getOnCloseHandler(key: Key): js.Function0[_] = js.native
  def getOnCloseHandler(key: Key, onClose: js.Function0[_]): js.Function0[_] = js.native
  def getSharedProps(): AnonPlacement = js.native
  def getToastProps(props: ToastProps): ReadonlyToastPropskeyKey = js.native
  def internalOnClose(key: Key): Unit = js.native
  def renderToast(toastProps: ToastPropskeyKey): Node = js.native
  def show(props: ToastProps): Key = js.native
  def update(key: Key, props: ToastProps): Unit = js.native
}

