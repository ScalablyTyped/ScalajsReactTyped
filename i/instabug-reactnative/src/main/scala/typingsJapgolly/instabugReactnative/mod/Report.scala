package typingsJapgolly.instabugReactnative.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Report extends StObject {
  
  /**
    * Attach a file to the report to be sent.
    * @param {string} data 
    * @param {string} fileName 
    */
  def addFileAttachmentWithData(data: String, filename: String): Unit
  
  /**
    * Attach a file to the report to be sent.
    * @param {string} url 
    * @param {string} fileName 
    */
  def addFileAttachmentWithUrl(url: String, filename: String): Unit
  
  /**
    * Append a console log to the report to be sent.
    * @param {string} consoleLog 
    */
  def appendConsoleLog(consoleLog: String): Unit
  
  /**
    * Append a tag to the report to be sent.
    * @param {string} tag 
    */
  def appendTag(tag: String): Unit
  
  /**
    * Attach debug log to the report to be sent.
    * @param {string} log 
    */
  def logDebug(log: String): Unit
  
  /**
    * Attach error log to the report to be sent.
    * @param {string} log 
    */
  def logError(log: String): Unit
  
  /**
    * Attach info log to the report to be sent.
    * @param {string} log 
    */
  def logInfo(log: String): Unit
  
  /**
    * Attach verbose log to the report to be sent.
    * @param {string} log 
    */
  def logVerbose(log: String): Unit
  
  /**
    * Attach warn log to the report to be sent.
    * @param {string} log 
    */
  def logWarn(log: String): Unit
  
  /**
    * Add a user attribute with key and value to the report to be sent.
    * @param {string} key 
    * @param {string} value 
    */
  def setUserAttribute(key: String, value: String): Unit
}
object Report {
  
  inline def apply(
    addFileAttachmentWithData: (String, String) => Callback,
    addFileAttachmentWithUrl: (String, String) => Callback,
    appendConsoleLog: String => Callback,
    appendTag: String => Callback,
    logDebug: String => Callback,
    logError: String => Callback,
    logInfo: String => Callback,
    logVerbose: String => Callback,
    logWarn: String => Callback,
    setUserAttribute: (String, String) => Callback
  ): Report = {
    val __obj = js.Dynamic.literal(addFileAttachmentWithData = js.Any.fromFunction2((t0: String, t1: String) => (addFileAttachmentWithData(t0, t1)).runNow()), addFileAttachmentWithUrl = js.Any.fromFunction2((t0: String, t1: String) => (addFileAttachmentWithUrl(t0, t1)).runNow()), appendConsoleLog = js.Any.fromFunction1((t0: String) => appendConsoleLog(t0).runNow()), appendTag = js.Any.fromFunction1((t0: String) => appendTag(t0).runNow()), logDebug = js.Any.fromFunction1((t0: String) => logDebug(t0).runNow()), logError = js.Any.fromFunction1((t0: String) => logError(t0).runNow()), logInfo = js.Any.fromFunction1((t0: String) => logInfo(t0).runNow()), logVerbose = js.Any.fromFunction1((t0: String) => logVerbose(t0).runNow()), logWarn = js.Any.fromFunction1((t0: String) => logWarn(t0).runNow()), setUserAttribute = js.Any.fromFunction2((t0: String, t1: String) => (setUserAttribute(t0, t1)).runNow()))
    __obj.asInstanceOf[Report]
  }
  
  extension [Self <: Report](x: Self) {
    
    inline def setAddFileAttachmentWithData(value: (String, String) => Callback): Self = StObject.set(x, "addFileAttachmentWithData", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setAddFileAttachmentWithUrl(value: (String, String) => Callback): Self = StObject.set(x, "addFileAttachmentWithUrl", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setAppendConsoleLog(value: String => Callback): Self = StObject.set(x, "appendConsoleLog", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAppendTag(value: String => Callback): Self = StObject.set(x, "appendTag", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLogDebug(value: String => Callback): Self = StObject.set(x, "logDebug", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLogError(value: String => Callback): Self = StObject.set(x, "logError", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLogInfo(value: String => Callback): Self = StObject.set(x, "logInfo", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLogVerbose(value: String => Callback): Self = StObject.set(x, "logVerbose", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLogWarn(value: String => Callback): Self = StObject.set(x, "logWarn", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetUserAttribute(value: (String, String) => Callback): Self = StObject.set(x, "setUserAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
