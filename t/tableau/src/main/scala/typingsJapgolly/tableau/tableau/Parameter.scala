package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Parameter Classes
trait Parameter extends StObject {
  
  /**
    * If the parameter is restricted to a list of allowable values, this property contains the array of those values.
    * Note that this is not a standard collection, but a JavaScript array.
    */
  def getAllowableValues(): js.Array[DataValue]
  
  /** The type of allowable values that the parameter can accept. It can be one of the following enumeration items: ALL, LIST, RANGE. */
  def getAllowableValuesType(): ParameterAllowableValuesType
  
  /** The current value of the parameter. */
  def getCurrentValue(): DataValue
  
  /** The data type of the parameter can be one of the following: FLOAT, INTEGER, STRING, BOOLEAN, DATE, DATETIME. */
  def getDataType(): ParameterDataType
  
  /**
    * If getAllowableValuesType is RANGE and getDataType is DATE or DATETIME,
    * this defines the step date period used in the Parameter UI control slider.
    * Otherwise it’s undefined/null.
    */
  def getDateStepPeriod(): PeriodType
  
  /** If getAllowableValuesType is RANGE, this defines the maximum allowable value, inclusive. Otherwise it’s undefined/null. */
  def getMaxValue(): DataValue
  
  /** If getAllowableValuesType is RANGE, this defines the minimum allowable value, inclusive. Otherwise it’s undefined/null. */
  def getMinValue(): DataValue
  
  /** A unique identifier for the parameter, as specified by the user. */
  def getName(): String
  
  /** If getAllowableValuesType is RANGE, this defines the step size used in the parameter UI control slider. Otherwise it’s undefined/null. */
  def getStepSize(): Double
}
object Parameter {
  
  inline def apply(
    getAllowableValues: CallbackTo[js.Array[DataValue]],
    getAllowableValuesType: CallbackTo[ParameterAllowableValuesType],
    getCurrentValue: CallbackTo[DataValue],
    getDataType: CallbackTo[ParameterDataType],
    getDateStepPeriod: CallbackTo[PeriodType],
    getMaxValue: CallbackTo[DataValue],
    getMinValue: CallbackTo[DataValue],
    getName: CallbackTo[String],
    getStepSize: CallbackTo[Double]
  ): Parameter = {
    val __obj = js.Dynamic.literal(getAllowableValues = getAllowableValues.toJsFn, getAllowableValuesType = getAllowableValuesType.toJsFn, getCurrentValue = getCurrentValue.toJsFn, getDataType = getDataType.toJsFn, getDateStepPeriod = getDateStepPeriod.toJsFn, getMaxValue = getMaxValue.toJsFn, getMinValue = getMinValue.toJsFn, getName = getName.toJsFn, getStepSize = getStepSize.toJsFn)
    __obj.asInstanceOf[Parameter]
  }
  
  extension [Self <: Parameter](x: Self) {
    
    inline def setGetAllowableValues(value: CallbackTo[js.Array[DataValue]]): Self = StObject.set(x, "getAllowableValues", value.toJsFn)
    
    inline def setGetAllowableValuesType(value: CallbackTo[ParameterAllowableValuesType]): Self = StObject.set(x, "getAllowableValuesType", value.toJsFn)
    
    inline def setGetCurrentValue(value: CallbackTo[DataValue]): Self = StObject.set(x, "getCurrentValue", value.toJsFn)
    
    inline def setGetDataType(value: CallbackTo[ParameterDataType]): Self = StObject.set(x, "getDataType", value.toJsFn)
    
    inline def setGetDateStepPeriod(value: CallbackTo[PeriodType]): Self = StObject.set(x, "getDateStepPeriod", value.toJsFn)
    
    inline def setGetMaxValue(value: CallbackTo[DataValue]): Self = StObject.set(x, "getMaxValue", value.toJsFn)
    
    inline def setGetMinValue(value: CallbackTo[DataValue]): Self = StObject.set(x, "getMinValue", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetStepSize(value: CallbackTo[Double]): Self = StObject.set(x, "getStepSize", value.toJsFn)
  }
}
