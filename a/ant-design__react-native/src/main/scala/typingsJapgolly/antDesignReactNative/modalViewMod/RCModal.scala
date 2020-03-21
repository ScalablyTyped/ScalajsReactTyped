package typingsJapgolly.antDesignReactNative.modalViewMod

import typingsJapgolly.antDesignReactNative.antDesignReactNativeNumbers.`0`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeNumbers.`1.05`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeNumbers.`1`
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RCModal
  extends Component[IModalPropTypes, js.Any, js.Any] {
  var animDialog: js.Any = js.native
  var animMask: js.Any = js.native
  def animateDialog(visible: Boolean): Unit = js.native
  def animateMask(visible: Boolean): Unit = js.native
  def close(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRCModal(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MRCModal(prevProps: IModalPropTypes): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MRCModal(nextProps: IModalPropTypes): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MRCModal(): Unit = js.native
  def getOpacity(visible: Boolean): `1` | `0` = js.native
  def getPosition(visible: Boolean): Double = js.native
  def getScale(visible: Boolean): `1` | `1.05` = js.native
  def onMaskClose(): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MRCModal(nextProps: IModalPropTypes, nextState: js.Any): Boolean = js.native
  def stopDialogAnim(): Unit = js.native
  def stopMaskAnim(): Unit = js.native
}

