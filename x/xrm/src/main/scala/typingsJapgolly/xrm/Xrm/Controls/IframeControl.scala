package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an Iframe control.
  * @see {@link FramedControl}
  */
trait IframeControl
  extends FramedControl
     with UiCanSetVisibleElement {
  /**
    * Gets initial URL defined for the Iframe.
    * @returns The initial URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getInitialUrl(): String
}

object IframeControl {
  @scala.inline
  def apply(
    getControlType: CallbackTo[ControlType | String],
    getInitialUrl: CallbackTo[String],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getObject: CallbackTo[HTMLIFrameElement],
    getParent: CallbackTo[Section],
    getSrc: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    setLabel: String => Callback,
    setSrc: String => Callback,
    setVisible: Boolean => Callback
  ): IframeControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getControlType")(getControlType.toJsFn)
    __obj.updateDynamic("getInitialUrl")(getInitialUrl.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getObject")(getObject.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getSrc")(getSrc.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.updateDynamic("setSrc")(js.Any.fromFunction1((t0: java.lang.String) => setSrc(t0).runNow()))
    __obj.updateDynamic("setVisible")(js.Any.fromFunction1((t0: scala.Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[IframeControl]
  }
}

