package typingsJapgolly.rmcTrigger.triggerMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.rmcTrigger.propsTypeMod.ITriggerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trigger
  extends Component[ITriggerProps with IProptypes, js.Any, js.Any] {
  var _component: js.Any = js.native
  var _container: js.Any = js.native
  var popupRef: js.Any = js.native
  var touchOutsideHandler: js.Any = js.native
  def clearOutsideHandler(): Unit = js.native
  def close(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTrigger(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTrigger(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTrigger(): Unit = js.native
  def getComponent(visible: js.Any): Element = js.native
  def getContainer(): js.Any = js.native
  def getPopupAlign(): js.Any = js.native
  def getPopupClassNameFromAlign(align: js.Any): String = js.native
  def getPopupDomNode(): js.Any = js.native
  def getRootDomNode(): org.scalajs.dom.raw.Element = js.native
  def onAnimateLeave(): Unit = js.native
  def onDocumentClick(event: js.Any): Unit = js.native
  def removeContainer(): Unit = js.native
  def renderDialog(visible: js.Any): Unit = js.native
  def saveRef(el: js.Any, visible: js.Any): Unit = js.native
}

