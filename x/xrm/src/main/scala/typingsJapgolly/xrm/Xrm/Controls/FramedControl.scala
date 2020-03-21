package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a framed control, which is either a Web Resource or an Iframe.
  * @see {@link Control}
  * @remarks     An Iframe control provides additional methods, so use {@link IframeControl} where
  *              appropriate.  Silverlight controls should use {@link SilverlightControl}.
  */
trait FramedControl extends Control {
  /**
    * Gets the DOM element containing the control.
    * @returns The container object.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getObject(): HTMLIFrameElement
  /**
    * Gets the URL value of the control.
    * @returns The source URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getSrc(): String
  /**
    * Sets the URL value of the control.
    * @param src The source URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def setSrc(src: String): Unit
}

object FramedControl {
  @scala.inline
  def apply(
    getControlType: CallbackTo[ControlType | String],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getObject: CallbackTo[HTMLIFrameElement],
    getParent: CallbackTo[Section],
    getSrc: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    setLabel: String => Callback,
    setSrc: String => Callback
  ): FramedControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getControlType")(getControlType.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getObject")(getObject.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getSrc")(getSrc.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.updateDynamic("setSrc")(js.Any.fromFunction1((t0: java.lang.String) => setSrc(t0).runNow()))
    __obj.asInstanceOf[FramedControl]
  }
}

