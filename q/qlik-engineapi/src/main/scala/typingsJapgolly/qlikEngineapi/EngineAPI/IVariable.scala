package typingsJapgolly.qlikEngineapi.EngineAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikEngineapi.enigmaJS.IGeneratedAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at variable level.
  *
  * Note: Methods in this class are deprecated. Use methods in the GenericVariable class instead.
  *
  * The handle member in the JSON request for all methods listed in this section is the handle of the variable.
  */
trait IVariable extends IGeneratedAPI {
  /**
    * Sets the value of a dual variable overriding any input constraints.
    *
    * Note: This method is deprecated (not recommended to use). Use SetProperties method instead.
    * Note: The ForceContent method does not evaluate any expression.
    * @param qs - String representation of a dual value.
    * Set this parameter to "", if the string representation is to be Null.
    * >> This parameter is mandatory.
    * @param qd - Numeric representation of a dual value.
    * >> This parameter is mandatory.
    */
  def forceContent(qs: String, qd: Double): js.Promise[Unit]
  /**
    * Returns the calculated value of a variable.
    *
    * Note: This method is deprecated (not recommended to use). Use GetProperties method instead.
    */
  def getContent(): js.Promise[IAlfaNumString]
  /**
    * Gets the properties of a variable.
    *
    * Note: This method is deprecated (not recommended to use). Use GetProperties method instead.
    */
  def getNxProperties(): js.Promise[INxVariableProperties]
  /**
    * Returns the raw value of a variable.
    *
    * Note: This method is deprecated (not recommended to use). Use GetProperties method instead.
    */
  def getRawContent(): js.Promise[String]
  /**
    * Sets a value to a variable.
    *
    * Note: This method is deprecated (not recommended to use). Use SetProperties method instead.
    * @param qContent - Value of the variable.
    * >> This parameter is mandatory.
    * @param qUpdateMRU - If set to true, the value is added to the Most Recently Used (MRU) list.
    * >> This parameter is mandatory.
    */
  def setContent(qContent: String, qUpdateMRU: Boolean): js.Promise[Boolean]
  /**
    * Sets some properties to a variable.
    *
    * Note: This method is deprecated (not recommended to use). Use SetProperties method instead.
    *
    * In addition to the properties described below, dynamic properties can be added.
    * @param qProperties - Information about the properties of the variable
    */
  def setNxProperties(qProperties: INxVariableProperties): js.Promise[Unit]
}

object IVariable {
  @scala.inline
  def apply(
    forceContent: (String, Double) => CallbackTo[js.Promise[Unit]],
    getContent: CallbackTo[js.Promise[IAlfaNumString]],
    getNxProperties: CallbackTo[js.Promise[INxVariableProperties]],
    getRawContent: CallbackTo[js.Promise[String]],
    setContent: (String, Boolean) => CallbackTo[js.Promise[Boolean]],
    setNxProperties: INxVariableProperties => CallbackTo[js.Promise[Unit]]
  ): IVariable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forceContent")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => forceContent(t0, t1).runNow()))
    __obj.updateDynamic("getContent")(getContent.toJsFn)
    __obj.updateDynamic("getNxProperties")(getNxProperties.toJsFn)
    __obj.updateDynamic("getRawContent")(getRawContent.toJsFn)
    __obj.updateDynamic("setContent")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => setContent(t0, t1).runNow()))
    __obj.updateDynamic("setNxProperties")(js.Any.fromFunction1((t0: typingsJapgolly.qlikEngineapi.EngineAPI.INxVariableProperties) => setNxProperties(t0).runNow()))
    __obj.asInstanceOf[IVariable]
  }
}

