package typingsJapgolly.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.servicenow.servicenow.RESTResponseV2
import typingsJapgolly.servicenow.servicenow.RestHTTPMethods
import typingsJapgolly.servicenow.servicenow.SOAPResponseV2
import typingsJapgolly.servicenow.servicenowStrings.all
import typingsJapgolly.servicenow.servicenowStrings.basic
import typingsJapgolly.servicenow.servicenowStrings.elevated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snWs {
  
  @js.native
  trait RESTMessageV2 extends StObject {
    
    def execute(): RESTResponseV2 = js.native
    
    def executeAsync(): RESTResponseV2 = js.native
    
    def getEndpoint(): String = js.native
    
    def getRequestBody(): String = js.native
    
    def getRequestHeader(headerName: String): String = js.native
    
    def getRequestHeaders(): js.Object = js.native
    
    def saveResponseBodyAsAttachment(tableName: String, recordSysId: String, fileName: String): Unit = js.native
    def saveResponseBodyAsAttachment(tableName: String, recordSysId: String, fileName: String, encryptContext: String): Unit = js.native
    
    def setAuthenticationProfile(`type`: String, profileId: String): Unit = js.native
    
    def setBasicAuth(userName: String, userPass: String): Unit = js.native
    
    def setEccCorrelator(correlator: String): Unit = js.native
    
    def setEccParameter(name: String, value: String): Unit = js.native
    
    def setEndpoint(endpoint: String): Unit = js.native
    
    def setHttpMethod(method: RestHTTPMethods): Unit = js.native
    
    def setHttpTimeout(timeoutMs: Double): Unit = js.native
    
    def setLogLevel(level: basic | elevated | all): Unit = js.native
    
    def setMIDServer(midServer: String): Unit = js.native
    
    def setMutualAuth(profileName: String): Unit = js.native
    
    def setQueryParameter(name: String, value: String): Unit = js.native
    
    def setRequestBody(body: String): Unit = js.native
    
    def setRequestBodyFromAttachment(sys_id: String): Unit = js.native
    
    def setRequestBodyFromStream(stream: js.Object): Unit = js.native
    
    def setRequestHeader(name: String, value: String): Unit = js.native
    
    def setRequestorProfile(requestorContext: String, requestorId: String): Unit = js.native
    
    def setStringParameter(name: String, value: String): Unit = js.native
    
    def setStringParameterNoEscape(name: String, value: String): Unit = js.native
  }
  
  trait SOAPMessageV2 extends StObject {
    
    def execute(): SOAPResponseV2
    
    def executeAsync(): SOAPResponseV2
    
    def getEndpoint(): String
    
    def getRequestBody(): String
    
    def getRequestHeader(headerName: String): String
    
    def getRequestHeaders(): js.Object
    
    def setBasicAuth(userName: String, userPass: String): Unit
    
    def setEccCorrelator(correlator: String): Unit
    
    def setEccParameter(name: String, value: String): Unit
    
    def setEndpoint(endpoint: String): Unit
    
    def setHttpMethod(method: String): Unit
    
    def setHttpTimeout(timeoutMs: Double): Unit
    
    def setMIDServer(midServer: String): Unit
    
    def setMutualAuth(profileName: String): Unit
    
    def setRequestBody(body: String): Unit
    
    def setRequestHeader(name: String, value: String): Unit
    
    def setStringParameter(name: String, value: String): Unit
    
    def setStringParameterNoEscape(name: String, value: String): Unit
    
    def setWSSecurity(keystoreId: String, keystoreAlias: String, keystorePassword: String, certificateId: String): Unit
  }
  object SOAPMessageV2 {
    
    inline def apply(
      execute: CallbackTo[SOAPResponseV2],
      executeAsync: CallbackTo[SOAPResponseV2],
      getEndpoint: CallbackTo[String],
      getRequestBody: CallbackTo[String],
      getRequestHeader: String => String,
      getRequestHeaders: CallbackTo[js.Object],
      setBasicAuth: (String, String) => Callback,
      setEccCorrelator: String => Callback,
      setEccParameter: (String, String) => Callback,
      setEndpoint: String => Callback,
      setHttpMethod: String => Callback,
      setHttpTimeout: Double => Callback,
      setMIDServer: String => Callback,
      setMutualAuth: String => Callback,
      setRequestBody: String => Callback,
      setRequestHeader: (String, String) => Callback,
      setStringParameter: (String, String) => Callback,
      setStringParameterNoEscape: (String, String) => Callback,
      setWSSecurity: (String, String, String, String) => Callback
    ): SOAPMessageV2 = {
      val __obj = js.Dynamic.literal(execute = execute.toJsFn, executeAsync = executeAsync.toJsFn, getEndpoint = getEndpoint.toJsFn, getRequestBody = getRequestBody.toJsFn, getRequestHeader = js.Any.fromFunction1(getRequestHeader), getRequestHeaders = getRequestHeaders.toJsFn, setBasicAuth = js.Any.fromFunction2((t0: String, t1: String) => (setBasicAuth(t0, t1)).runNow()), setEccCorrelator = js.Any.fromFunction1((t0: String) => setEccCorrelator(t0).runNow()), setEccParameter = js.Any.fromFunction2((t0: String, t1: String) => (setEccParameter(t0, t1)).runNow()), setEndpoint = js.Any.fromFunction1((t0: String) => setEndpoint(t0).runNow()), setHttpMethod = js.Any.fromFunction1((t0: String) => setHttpMethod(t0).runNow()), setHttpTimeout = js.Any.fromFunction1((t0: Double) => setHttpTimeout(t0).runNow()), setMIDServer = js.Any.fromFunction1((t0: String) => setMIDServer(t0).runNow()), setMutualAuth = js.Any.fromFunction1((t0: String) => setMutualAuth(t0).runNow()), setRequestBody = js.Any.fromFunction1((t0: String) => setRequestBody(t0).runNow()), setRequestHeader = js.Any.fromFunction2((t0: String, t1: String) => (setRequestHeader(t0, t1)).runNow()), setStringParameter = js.Any.fromFunction2((t0: String, t1: String) => (setStringParameter(t0, t1)).runNow()), setStringParameterNoEscape = js.Any.fromFunction2((t0: String, t1: String) => (setStringParameterNoEscape(t0, t1)).runNow()), setWSSecurity = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (setWSSecurity(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[SOAPMessageV2]
    }
    
    extension [Self <: SOAPMessageV2](x: Self) {
      
      inline def setExecute(value: CallbackTo[SOAPResponseV2]): Self = StObject.set(x, "execute", value.toJsFn)
      
      inline def setExecuteAsync(value: CallbackTo[SOAPResponseV2]): Self = StObject.set(x, "executeAsync", value.toJsFn)
      
      inline def setGetEndpoint(value: CallbackTo[String]): Self = StObject.set(x, "getEndpoint", value.toJsFn)
      
      inline def setGetRequestBody(value: CallbackTo[String]): Self = StObject.set(x, "getRequestBody", value.toJsFn)
      
      inline def setGetRequestHeader(value: String => String): Self = StObject.set(x, "getRequestHeader", js.Any.fromFunction1(value))
      
      inline def setGetRequestHeaders(value: CallbackTo[js.Object]): Self = StObject.set(x, "getRequestHeaders", value.toJsFn)
      
      inline def setSetBasicAuth(value: (String, String) => Callback): Self = StObject.set(x, "setBasicAuth", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetEccCorrelator(value: String => Callback): Self = StObject.set(x, "setEccCorrelator", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetEccParameter(value: (String, String) => Callback): Self = StObject.set(x, "setEccParameter", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetEndpoint(value: String => Callback): Self = StObject.set(x, "setEndpoint", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetHttpMethod(value: String => Callback): Self = StObject.set(x, "setHttpMethod", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetHttpTimeout(value: Double => Callback): Self = StObject.set(x, "setHttpTimeout", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetMIDServer(value: String => Callback): Self = StObject.set(x, "setMIDServer", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetMutualAuth(value: String => Callback): Self = StObject.set(x, "setMutualAuth", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetRequestBody(value: String => Callback): Self = StObject.set(x, "setRequestBody", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetRequestHeader(value: (String, String) => Callback): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetStringParameter(value: (String, String) => Callback): Self = StObject.set(x, "setStringParameter", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetStringParameterNoEscape(value: (String, String) => Callback): Self = StObject.set(x, "setStringParameterNoEscape", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetWSSecurity(value: (String, String, String, String) => Callback): Self = StObject.set(x, "setWSSecurity", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
}
