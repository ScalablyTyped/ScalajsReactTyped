package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for controls.
  *
  * @see {@link UiElement}
  */
trait Control
  extends UiLabelElement
     with UiCanGetVisibleElement {
  /**
    * Gets the controls type.
    * @returns The control type.<BR><BR>
    * **Values returned are**:
    * * standard
    * * iframe
    * * lookup
    * * optionset
    * * subgrid
    * * webresource
    * * notes
    * * timercontrol
    * * kbsearch (CRM Online Only, use parature.d.ts)
    * * quickform (see ui.QuickForm)
    * * customcontrol: <namespace>.<name> (A custom control for mobile phone and tablet clients).
    * * customsubgrid: <namespace>.<name> (A custom dataset control for mobile phone and tablet clients).
    */
  def getControlType(): ControlType | String
  /**
    * Gets the name of the control on the form.
    * @returns The name of the control.
    * @remarks     The name assigned to a control is not determined until the form loads. Changes to
    *              the form may change the name assigned to a given control.
    *              When you use the control getName method the name of the first control will be the
    *              same as the name of the attribute. The second instance of a control for that
    *              attribute will be "<attributeName>1". The pattern <attributeName>+N
    *              will continue for each additional control added to the form for a specific
    *              attribute. When a form displays a business process flow control in the header,
    *              additional controls will be added for each attribute that is displayed in the
    *              business process flow. These controls have a unique name like the following:
    *              header_process_<attribute name>.
    */
  def getName(): String
  /**
    * Gets a reference to the Section parent of the control.
    * @returns The parent Section.
    */
  def getParent(): Section
}

object Control {
  @scala.inline
  def apply(
    getControlType: CallbackTo[ControlType | String],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getParent: CallbackTo[Section],
    getVisible: CallbackTo[Boolean],
    setLabel: String => Callback
  ): Control = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getControlType")(getControlType.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.asInstanceOf[Control]
  }
}

