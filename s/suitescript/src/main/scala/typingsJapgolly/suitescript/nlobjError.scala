package typingsJapgolly.suitescript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjError used system or user-defined error object.
  *
  * @classDescription Encapsulation of errors thrown during script execution.
  * @return {nlobjError}
  * @constructor
  */
trait nlobjError extends StObject {
  
  /**
    * return the error code for this system or user-defined error.
    * @return {string}
    *
    * @method
    * @memberOf nlobjError
    *
    * @since 2008.2
    * @return
    */
  def getCode(): String
  
  /**
    * return the error description for this error.
    * @return {string}
    *
    * @method
    * @memberOf nlobjError
    *
    * @since 2008.2
    * @return
    */
  def getDetails(): String
  
  /**
    * return the error db ID for this error (if it was an unhandled unexpected error).
    * @return {string}
    *
    * @method
    * @memberOf nlobjError
    *
    * @since 2008.2
    * @return
    */
  def getId(): String
  
  /**
    * return the internalid of the record if this error was thrown in an aftersubmit script.
    * @return {int}
    *
    * @method
    * @memberOf nlobjError
    *
    * @since 2008.2
    * @return
    */
  def getInternalId(): Any
  
  /**
    * return a stacktrace containing the location of the error.
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjError
    *
    * @since 2008.2
    */
  def getStackTrace(): Unit
  
  /**
    * return the userevent script name where this error was thrown.
    * @return {string}
    *
    * @method
    * @memberOf nlobjError
    *
    * @since 2008.2
    * @return
    */
  def getUserEvent(): String
}
object nlobjError {
  
  inline def apply(
    getCode: CallbackTo[String],
    getDetails: CallbackTo[String],
    getId: CallbackTo[String],
    getInternalId: CallbackTo[Any],
    getStackTrace: Callback,
    getUserEvent: CallbackTo[String]
  ): nlobjError = {
    val __obj = js.Dynamic.literal(getCode = getCode.toJsFn, getDetails = getDetails.toJsFn, getId = getId.toJsFn, getInternalId = getInternalId.toJsFn, getStackTrace = getStackTrace.toJsFn, getUserEvent = getUserEvent.toJsFn)
    __obj.asInstanceOf[nlobjError]
  }
  
  extension [Self <: nlobjError](x: Self) {
    
    inline def setGetCode(value: CallbackTo[String]): Self = StObject.set(x, "getCode", value.toJsFn)
    
    inline def setGetDetails(value: CallbackTo[String]): Self = StObject.set(x, "getDetails", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetInternalId(value: CallbackTo[Any]): Self = StObject.set(x, "getInternalId", value.toJsFn)
    
    inline def setGetStackTrace(value: Callback): Self = StObject.set(x, "getStackTrace", value.toJsFn)
    
    inline def setGetUserEvent(value: CallbackTo[String]): Self = StObject.set(x, "getUserEvent", value.toJsFn)
  }
}
