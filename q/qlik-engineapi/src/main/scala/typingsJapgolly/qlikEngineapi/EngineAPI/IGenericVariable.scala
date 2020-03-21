package typingsJapgolly.qlikEngineapi.EngineAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikEngineapi.enigmaJS.IGeneratedAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at generic variable level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the generic variable.
  */
trait IGenericVariable extends IGeneratedAPI {
  /**
    * Applies a patch to the properties of a variable. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of NxPatch
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[Unit]
  /**
    * Returns the type and identifier of the object.
    */
  def getInfo(): js.Promise[INxInfo]
  /**
    * Evaluates an object and displays its properties including the dynamic properties.
    * If the member delta is set to true in the request object, only the delta is evaluated.
    * @returns GenericVariableLayout Information on the object
    */
  def getLayout(): js.Promise[IGenericVariableLayout]
  /**
    * Shows the properties of an object.
    *
    * Note: If the member delta is set to true in the request, only the delta is retrieved.
    * @returns GenericVariableProperties Information about the generic object
    */
  def getProperties(): js.Promise[IGenericVariableProperties]
  /**
    * Sets the value of a dual variable.
    *
    * Note: These changes are not persistent. They only last the duration of the engine session.
    * @param qText - String representation of a dual value. Set this parameter to "",
    * if the string representation is to be Null.
    * >> This parameter is mandatory.
    * @param qNum - Numeric representation of a dual value.
    * >> This parameter is mandatory.
    */
  def setDualValue(qText: String, qNum: Double): js.Promise[Unit]
  /**
    * Sets a numerical value to a variable.
    *
    * Note: These changes are not persistent. They only last the duration of the engine session.
    * @param qVal - Value of the variable.
    */
  def setNumValue(qVal: Double): js.Promise[Unit]
  /**
    * Sets some properties for a variable.
    *
    * Note: The identifier of a variable cannot be modified.
    * You cannot update the properties of a script-defined variable using the SetProperties method.
    * @param - Information about the variable.
    * >> This parameter is mandatory.
    */
  def setProperties(qProp: IGenericVariableProperties): js.Promise[Unit]
  /**
    * Sets a string value to a variable.
    * Note: These changes are not persistent. They only last the duration of the engine session.
    * @param qVal - Value of the variable. The string can contain an expression.
    */
  def setStringValue(qVal: String): js.Promise[Unit]
}

object IGenericVariable {
  @scala.inline
  def apply(
    applyPatches: js.Array[INxPatch] => CallbackTo[js.Promise[Unit]],
    getInfo: CallbackTo[js.Promise[INxInfo]],
    getLayout: CallbackTo[js.Promise[IGenericVariableLayout]],
    getProperties: CallbackTo[js.Promise[IGenericVariableProperties]],
    setDualValue: (String, Double) => CallbackTo[js.Promise[Unit]],
    setNumValue: Double => CallbackTo[js.Promise[Unit]],
    setProperties: IGenericVariableProperties => CallbackTo[js.Promise[Unit]],
    setStringValue: String => CallbackTo[js.Promise[Unit]]
  ): IGenericVariable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyPatches")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.qlikEngineapi.EngineAPI.INxPatch]) => applyPatches(t0).runNow()))
    __obj.updateDynamic("getInfo")(getInfo.toJsFn)
    __obj.updateDynamic("getLayout")(getLayout.toJsFn)
    __obj.updateDynamic("getProperties")(getProperties.toJsFn)
    __obj.updateDynamic("setDualValue")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => setDualValue(t0, t1).runNow()))
    __obj.updateDynamic("setNumValue")(js.Any.fromFunction1((t0: scala.Double) => setNumValue(t0).runNow()))
    __obj.updateDynamic("setProperties")(js.Any.fromFunction1((t0: typingsJapgolly.qlikEngineapi.EngineAPI.IGenericVariableProperties) => setProperties(t0).runNow()))
    __obj.updateDynamic("setStringValue")(js.Any.fromFunction1((t0: java.lang.String) => setStringValue(t0).runNow()))
    __obj.asInstanceOf[IGenericVariable]
  }
}

