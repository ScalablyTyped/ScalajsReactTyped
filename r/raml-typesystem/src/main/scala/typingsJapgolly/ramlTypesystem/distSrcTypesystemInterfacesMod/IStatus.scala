package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStatus
  extends StObject
     with IHasExtra {
  
  /**
    * Unique identifier
    */
  def getCode(): String
  
  /**
    * returns primitive error statuses gathered recurrently, returns warnings to.
    */
  def getErrors(): js.Array[IStatus]
  
  def getFilePath(): String
  
  def getInternalPath(): IValidationPath
  
  def getInternalRange(): RangeObject
  
  /**
    * returns human readable message associated with this status
    */
  def getMessage(): String
  
  def getSeverity(): Double
  
  /**
    * return an object which raised this status
    */
  def getSource(): Any
  
  /**
    * returns an array of nested statuses
    */
  def getSubStatuses(): js.Array[IStatus]
  
  def getValidationPath(): IValidationPath
  
  /**
    * returns path to this status
    */
  def getValidationPathAsString(): String
  
  /**
    * return true if this status contains a error
    */
  def isError(): Boolean
  
  /**
    * return true if this status is just information
    */
  def isInfo(): Boolean
  
  /**
    * returns true if status does not have errors
    */
  def isOk(): Boolean
  
  /**
    * return true if this status contains a warning
    */
  def isWarning(): Boolean
  
  def setCode(c: String): Unit
  
  def setMessage(m: String): Unit
  
  def setValidationPath(p: IValidationPath): Unit
}
object IStatus {
  
  inline def apply(
    getCode: CallbackTo[String],
    getErrors: CallbackTo[js.Array[IStatus]],
    getExtra: String => Any,
    getFilePath: CallbackTo[String],
    getInternalPath: CallbackTo[IValidationPath],
    getInternalRange: CallbackTo[RangeObject],
    getMessage: CallbackTo[String],
    getSeverity: CallbackTo[Double],
    getSource: CallbackTo[Any],
    getSubStatuses: CallbackTo[js.Array[IStatus]],
    getValidationPath: CallbackTo[IValidationPath],
    getValidationPathAsString: CallbackTo[String],
    isError: CallbackTo[Boolean],
    isInfo: CallbackTo[Boolean],
    isOk: CallbackTo[Boolean],
    isWarning: CallbackTo[Boolean],
    putExtra: (String, Any) => Callback,
    setCode: String => Callback,
    setMessage: String => Callback,
    setValidationPath: IValidationPath => Callback
  ): IStatus = {
    val __obj = js.Dynamic.literal(getCode = getCode.toJsFn, getErrors = getErrors.toJsFn, getExtra = js.Any.fromFunction1(getExtra), getFilePath = getFilePath.toJsFn, getInternalPath = getInternalPath.toJsFn, getInternalRange = getInternalRange.toJsFn, getMessage = getMessage.toJsFn, getSeverity = getSeverity.toJsFn, getSource = getSource.toJsFn, getSubStatuses = getSubStatuses.toJsFn, getValidationPath = getValidationPath.toJsFn, getValidationPathAsString = getValidationPathAsString.toJsFn, isError = isError.toJsFn, isInfo = isInfo.toJsFn, isOk = isOk.toJsFn, isWarning = isWarning.toJsFn, putExtra = js.Any.fromFunction2((t0: String, t1: Any) => (putExtra(t0, t1)).runNow()), setCode = js.Any.fromFunction1((t0: String) => setCode(t0).runNow()), setMessage = js.Any.fromFunction1((t0: String) => setMessage(t0).runNow()), setValidationPath = js.Any.fromFunction1((t0: IValidationPath) => setValidationPath(t0).runNow()))
    __obj.asInstanceOf[IStatus]
  }
  
  extension [Self <: IStatus](x: Self) {
    
    inline def setGetCode(value: CallbackTo[String]): Self = StObject.set(x, "getCode", value.toJsFn)
    
    inline def setGetErrors(value: CallbackTo[js.Array[IStatus]]): Self = StObject.set(x, "getErrors", value.toJsFn)
    
    inline def setGetFilePath(value: CallbackTo[String]): Self = StObject.set(x, "getFilePath", value.toJsFn)
    
    inline def setGetInternalPath(value: CallbackTo[IValidationPath]): Self = StObject.set(x, "getInternalPath", value.toJsFn)
    
    inline def setGetInternalRange(value: CallbackTo[RangeObject]): Self = StObject.set(x, "getInternalRange", value.toJsFn)
    
    inline def setGetMessage(value: CallbackTo[String]): Self = StObject.set(x, "getMessage", value.toJsFn)
    
    inline def setGetSeverity(value: CallbackTo[Double]): Self = StObject.set(x, "getSeverity", value.toJsFn)
    
    inline def setGetSource(value: CallbackTo[Any]): Self = StObject.set(x, "getSource", value.toJsFn)
    
    inline def setGetSubStatuses(value: CallbackTo[js.Array[IStatus]]): Self = StObject.set(x, "getSubStatuses", value.toJsFn)
    
    inline def setGetValidationPath(value: CallbackTo[IValidationPath]): Self = StObject.set(x, "getValidationPath", value.toJsFn)
    
    inline def setGetValidationPathAsString(value: CallbackTo[String]): Self = StObject.set(x, "getValidationPathAsString", value.toJsFn)
    
    inline def setIsError(value: CallbackTo[Boolean]): Self = StObject.set(x, "isError", value.toJsFn)
    
    inline def setIsInfo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInfo", value.toJsFn)
    
    inline def setIsOk(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOk", value.toJsFn)
    
    inline def setIsWarning(value: CallbackTo[Boolean]): Self = StObject.set(x, "isWarning", value.toJsFn)
    
    inline def setSetCode(value: String => Callback): Self = StObject.set(x, "setCode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetMessage(value: String => Callback): Self = StObject.set(x, "setMessage", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetValidationPath(value: IValidationPath => Callback): Self = StObject.set(x, "setValidationPath", js.Any.fromFunction1((t0: IValidationPath) => value(t0).runNow()))
  }
}
