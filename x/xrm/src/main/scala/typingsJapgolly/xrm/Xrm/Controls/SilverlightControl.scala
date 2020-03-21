package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLObjectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Silverlight control.
  * @see {@link Control}
  * @deprecated The Silverlight WebResource is deprecated on the web client, and is not supported on the new Unified Interface in v9.
  * Instead of silverlight, use custom controls created using the HTML web resources with HTML5 to create UI components to visualize and interact with data.
  */
trait SilverlightControl extends Control {
  /**
    * Gets the query string value passed to Silverlight.
    * @returns The data.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getData(): String
  /**
    * Gets the DOM element containing the control.
    * @returns The container object.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getObject(): HTMLObjectElement
  /**
    * Sets the query string value passed to Silverlight.
    * @param data The data.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def setData(data: String): Unit
}

object SilverlightControl {
  @scala.inline
  def apply(
    getControlType: CallbackTo[ControlType | String],
    getData: CallbackTo[String],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getObject: CallbackTo[HTMLObjectElement],
    getParent: CallbackTo[Section],
    getVisible: CallbackTo[Boolean],
    setData: String => Callback,
    setLabel: String => Callback
  ): SilverlightControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getControlType")(getControlType.toJsFn)
    __obj.updateDynamic("getData")(getData.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getObject")(getObject.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: java.lang.String) => setData(t0).runNow()))
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.asInstanceOf[SilverlightControl]
  }
}

