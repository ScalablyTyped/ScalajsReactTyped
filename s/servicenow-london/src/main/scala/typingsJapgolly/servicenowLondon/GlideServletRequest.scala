package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideServletRequest extends StObject {
  
  def getContentType(): String
  
  def getHeader(name: String): String
  
  def getHeaderNames(): String
  
  def getHeaders(name: String): String
  
  def getParameter(name: String): String
  
  def getParameterNames(): String
  
  def getQueryString(): String
  
  def writeOutput(mimeType: String, output: String): Unit
}
object GlideServletRequest {
  
  inline def apply(
    getContentType: CallbackTo[String],
    getHeader: String => String,
    getHeaderNames: CallbackTo[String],
    getHeaders: String => String,
    getParameter: String => String,
    getParameterNames: CallbackTo[String],
    getQueryString: CallbackTo[String],
    writeOutput: (String, String) => Callback
  ): GlideServletRequest = {
    val __obj = js.Dynamic.literal(getContentType = getContentType.toJsFn, getHeader = js.Any.fromFunction1(getHeader), getHeaderNames = getHeaderNames.toJsFn, getHeaders = js.Any.fromFunction1(getHeaders), getParameter = js.Any.fromFunction1(getParameter), getParameterNames = getParameterNames.toJsFn, getQueryString = getQueryString.toJsFn, writeOutput = js.Any.fromFunction2((t0: String, t1: String) => (writeOutput(t0, t1)).runNow()))
    __obj.asInstanceOf[GlideServletRequest]
  }
  
  extension [Self <: GlideServletRequest](x: Self) {
    
    inline def setGetContentType(value: CallbackTo[String]): Self = StObject.set(x, "getContentType", value.toJsFn)
    
    inline def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    inline def setGetHeaderNames(value: CallbackTo[String]): Self = StObject.set(x, "getHeaderNames", value.toJsFn)
    
    inline def setGetHeaders(value: String => String): Self = StObject.set(x, "getHeaders", js.Any.fromFunction1(value))
    
    inline def setGetParameter(value: String => String): Self = StObject.set(x, "getParameter", js.Any.fromFunction1(value))
    
    inline def setGetParameterNames(value: CallbackTo[String]): Self = StObject.set(x, "getParameterNames", value.toJsFn)
    
    inline def setGetQueryString(value: CallbackTo[String]): Self = StObject.set(x, "getQueryString", value.toJsFn)
    
    inline def setWriteOutput(value: (String, String) => Callback): Self = StObject.set(x, "writeOutput", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
