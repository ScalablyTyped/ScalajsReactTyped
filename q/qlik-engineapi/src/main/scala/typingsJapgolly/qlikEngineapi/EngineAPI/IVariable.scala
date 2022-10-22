package typingsJapgolly.qlikEngineapi.EngineAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikEngineapi.enigmaJS.IGeneratedAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class describes all the methods that apply at variable level.
  *
  * Note: Methods in this class are deprecated. Use methods in the GenericVariable class instead.
  *
  * The handle member in the JSON request for all methods listed in this section is the handle of the variable.
  */
trait IVariable
  extends StObject
     with IGeneratedAPI {
  
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
  
  inline def apply(
    forceContent: (String, Double) => js.Promise[Unit],
    getContent: CallbackTo[js.Promise[IAlfaNumString]],
    getNxProperties: CallbackTo[js.Promise[INxVariableProperties]],
    getRawContent: CallbackTo[js.Promise[String]],
    setContent: (String, Boolean) => js.Promise[Boolean],
    setNxProperties: INxVariableProperties => js.Promise[Unit]
  ): IVariable = {
    val __obj = js.Dynamic.literal(forceContent = js.Any.fromFunction2(forceContent), getContent = getContent.toJsFn, getNxProperties = getNxProperties.toJsFn, getRawContent = getRawContent.toJsFn, setContent = js.Any.fromFunction2(setContent), setNxProperties = js.Any.fromFunction1(setNxProperties))
    __obj.asInstanceOf[IVariable]
  }
  
  extension [Self <: IVariable](x: Self) {
    
    inline def setForceContent(value: (String, Double) => js.Promise[Unit]): Self = StObject.set(x, "forceContent", js.Any.fromFunction2(value))
    
    inline def setGetContent(value: CallbackTo[js.Promise[IAlfaNumString]]): Self = StObject.set(x, "getContent", value.toJsFn)
    
    inline def setGetNxProperties(value: CallbackTo[js.Promise[INxVariableProperties]]): Self = StObject.set(x, "getNxProperties", value.toJsFn)
    
    inline def setGetRawContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getRawContent", value.toJsFn)
    
    inline def setSetContent(value: (String, Boolean) => js.Promise[Boolean]): Self = StObject.set(x, "setContent", js.Any.fromFunction2(value))
    
    inline def setSetNxProperties(value: INxVariableProperties => js.Promise[Unit]): Self = StObject.set(x, "setNxProperties", js.Any.fromFunction1(value))
  }
}
