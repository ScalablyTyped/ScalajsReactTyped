package typingsJapgolly.snowflakeSdk.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /**
    * Returns the id of this column.
    */
  def getId(): Double
  
  /**
    * Returns the index of this column.
    */
  def getIndex(): Double
  
  /**
    * Returns the name of this column.
    */
  def getName(): String
  
  /**
    * Returns the scale associated with this column.
    */
  def getScale(): Double
  
  /**
    * Returns the type associated with this column.
    */
  def getType(): String
  
  /**
    * Returns true if this column is type ARRAY.
    */
  def isArray(): Boolean
  
  /**
    * Returns true if this column is type BINARY.
    */
  def isBinary(): Boolean
  
  /**
    * Returns true if this column is type BOOLEAN.
    */
  def isBoolean(): Boolean
  
  /**
    * Returns true if this column is type DATE.
    */
  def isDate(): Boolean
  
  /**
    * Determines if this column is nullable.
    */
  def isNullable(): Boolean
  
  /**
    * Returns true if this column is type NUMBER.
    */
  def isNumber(): Boolean
  
  /**
    * Returns true if this column is type OBJECT.
    */
  def isObject(): Boolean
  
  /**
    * Returns true if this column is type STRING.
    */
  def isString(): Boolean
  
  /**
    * Returns true if this column is type TIME.
    */
  def isTime(): Boolean
  
  /**
    * Returns true if this column is type TIMESTAMP.
    */
  def isTimestamp(): Boolean
  
  /**
    * Returns true if this column is type TIMESTAMP_LTZ.
    */
  def isTimestampLtz(): Boolean
  
  /**
    * Returns true if this column is type TIMESTAMP_NTZ.
    */
  def isTimestampNtz(): Boolean
  
  /**
    * Returns true if this column is type TIMESTAMP_TZ.
    */
  def isTimestampTz(): Boolean
  
  /**
    * Returns true if this column is type VARIANT.
    */
  def isVariant(): Boolean
}
object Column {
  
  inline def apply(
    getId: CallbackTo[Double],
    getIndex: CallbackTo[Double],
    getName: CallbackTo[String],
    getScale: CallbackTo[Double],
    getType: CallbackTo[String],
    isArray: CallbackTo[Boolean],
    isBinary: CallbackTo[Boolean],
    isBoolean: CallbackTo[Boolean],
    isDate: CallbackTo[Boolean],
    isNullable: CallbackTo[Boolean],
    isNumber: CallbackTo[Boolean],
    isObject: CallbackTo[Boolean],
    isString: CallbackTo[Boolean],
    isTime: CallbackTo[Boolean],
    isTimestamp: CallbackTo[Boolean],
    isTimestampLtz: CallbackTo[Boolean],
    isTimestampNtz: CallbackTo[Boolean],
    isTimestampTz: CallbackTo[Boolean],
    isVariant: CallbackTo[Boolean]
  ): Column = {
    val __obj = js.Dynamic.literal(getId = getId.toJsFn, getIndex = getIndex.toJsFn, getName = getName.toJsFn, getScale = getScale.toJsFn, getType = getType.toJsFn, isArray = isArray.toJsFn, isBinary = isBinary.toJsFn, isBoolean = isBoolean.toJsFn, isDate = isDate.toJsFn, isNullable = isNullable.toJsFn, isNumber = isNumber.toJsFn, isObject = isObject.toJsFn, isString = isString.toJsFn, isTime = isTime.toJsFn, isTimestamp = isTimestamp.toJsFn, isTimestampLtz = isTimestampLtz.toJsFn, isTimestampNtz = isTimestampNtz.toJsFn, isTimestampTz = isTimestampTz.toJsFn, isVariant = isVariant.toJsFn)
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetScale(value: CallbackTo[Double]): Self = StObject.set(x, "getScale", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setIsArray(value: CallbackTo[Boolean]): Self = StObject.set(x, "isArray", value.toJsFn)
    
    inline def setIsBinary(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBinary", value.toJsFn)
    
    inline def setIsBoolean(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBoolean", value.toJsFn)
    
    inline def setIsDate(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDate", value.toJsFn)
    
    inline def setIsNullable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNullable", value.toJsFn)
    
    inline def setIsNumber(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNumber", value.toJsFn)
    
    inline def setIsObject(value: CallbackTo[Boolean]): Self = StObject.set(x, "isObject", value.toJsFn)
    
    inline def setIsString(value: CallbackTo[Boolean]): Self = StObject.set(x, "isString", value.toJsFn)
    
    inline def setIsTime(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTime", value.toJsFn)
    
    inline def setIsTimestamp(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTimestamp", value.toJsFn)
    
    inline def setIsTimestampLtz(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTimestampLtz", value.toJsFn)
    
    inline def setIsTimestampNtz(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTimestampNtz", value.toJsFn)
    
    inline def setIsTimestampTz(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTimestampTz", value.toJsFn)
    
    inline def setIsVariant(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVariant", value.toJsFn)
  }
}
