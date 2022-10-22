package typingsJapgolly.qlikEngineapi.EngineAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikEngineapi.enigmaJS.IGeneratedAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class describes all the methods that apply at generic variable level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the generic variable.
  */
trait IGenericVariable
  extends StObject
     with IGeneratedAPI {
  
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
  
  inline def apply(
    applyPatches: js.Array[INxPatch] => js.Promise[Unit],
    getInfo: CallbackTo[js.Promise[INxInfo]],
    getLayout: CallbackTo[js.Promise[IGenericVariableLayout]],
    getProperties: CallbackTo[js.Promise[IGenericVariableProperties]],
    setDualValue: (String, Double) => js.Promise[Unit],
    setNumValue: Double => js.Promise[Unit],
    setProperties: IGenericVariableProperties => js.Promise[Unit],
    setStringValue: String => js.Promise[Unit]
  ): IGenericVariable = {
    val __obj = js.Dynamic.literal(applyPatches = js.Any.fromFunction1(applyPatches), getInfo = getInfo.toJsFn, getLayout = getLayout.toJsFn, getProperties = getProperties.toJsFn, setDualValue = js.Any.fromFunction2(setDualValue), setNumValue = js.Any.fromFunction1(setNumValue), setProperties = js.Any.fromFunction1(setProperties), setStringValue = js.Any.fromFunction1(setStringValue))
    __obj.asInstanceOf[IGenericVariable]
  }
  
  extension [Self <: IGenericVariable](x: Self) {
    
    inline def setApplyPatches(value: js.Array[INxPatch] => js.Promise[Unit]): Self = StObject.set(x, "applyPatches", js.Any.fromFunction1(value))
    
    inline def setGetInfo(value: CallbackTo[js.Promise[INxInfo]]): Self = StObject.set(x, "getInfo", value.toJsFn)
    
    inline def setGetLayout(value: CallbackTo[js.Promise[IGenericVariableLayout]]): Self = StObject.set(x, "getLayout", value.toJsFn)
    
    inline def setGetProperties(value: CallbackTo[js.Promise[IGenericVariableProperties]]): Self = StObject.set(x, "getProperties", value.toJsFn)
    
    inline def setSetDualValue(value: (String, Double) => js.Promise[Unit]): Self = StObject.set(x, "setDualValue", js.Any.fromFunction2(value))
    
    inline def setSetNumValue(value: Double => js.Promise[Unit]): Self = StObject.set(x, "setNumValue", js.Any.fromFunction1(value))
    
    inline def setSetProperties(value: IGenericVariableProperties => js.Promise[Unit]): Self = StObject.set(x, "setProperties", js.Any.fromFunction1(value))
    
    inline def setSetStringValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "setStringValue", js.Any.fromFunction1(value))
  }
}
