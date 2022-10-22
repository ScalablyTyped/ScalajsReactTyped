package typingsJapgolly.microsoftAjax.Sys

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Exception Types
// Really not a types
///**
//* Raised when a function or method is invoked and at least one of the passed arguments does not meet the parameter specification of the called function or method.
//**/
//class ArgumentException {
//}
///**
//* Raised when an argument has an invalid value of null.
//**/
//class ArgumentNullException {
//}
///**
//* Raised when an argument value is outside an acceptable range.
//**/
//class ArgumentOutOfRangeException {
//}
///**
//* Raised when a parameter is not an allowed type.
//**/
//class ArgumentTypeException {
//}
///**
//* Raised when an argument for a required method parameter is undefined.
//**/
//class ArgumentUndefinedException {
//}
///**
//*
//**/
//class FormatException {
//}
///**
//* Raised when a call to a method has failed, but the reason was not invalid arguments.
//**/
//class InvalidOperationException {
//}
///**
//* Raised when a requested method is not supported by an object.
//**/
//class NotImplementedException {
//}
///**
//* Raised when an invalid number of arguments have been passed to a function.
//**/
//class ParameterCountException {
//}
///**
//* Raised by the Microsoft Ajax Library framework when a script does not load successfully. This exception should not be thrown by the developer.
//**/
//class ScriptLoadFailedException {
//}
//#endregion
//#region Sys.Net Namespace
/**
  * The Sys.Net namespace contains classes that manage communication between AJAX-enabled ASP.NET client applications and Web services on the server. For more information, see Using Web Services in ASP.NET AJAX. The Sys.Net namespace is part of the Microsoft Ajax Library.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310860(v=vs.100).aspx}
  */
object Net {
  
  /**
    * Manages the flow of the Web requests issued by the Sys.Net.WebRequest object to the associated executor object.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397435(v=vs.100).aspx}
    */
  trait IWebRequestManager extends StObject {
    
    //#endregion
    //#region Methods
    /**
      * Registers a handler for the completed request event of the WebRequestManager.
      * @param handler
      *      The function registered to handle the completed request event.
      */
    def add_completedRequest(handler: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit]): Unit
    
    /**
      * Registers a handler for processing the invoking request event of the WebRequestManager.
      * @param handler
      *      The function registered to handle the invoking request event.
      */
    def add_invokingRequest(
      handler: js.Function2[
          /* sender */ WebRequestExecutor, 
          /* networkRequestEventArgs */ NetworkRequestEventArgs, 
          Unit
        ]
    ): Unit
    
    /**
      * Sends Web requests to the default network executor.
      * This member supports the client-script infrastructure and is not intended to be used directly from your code.
      * @param WebRequest
      *      An instance of the Sys.Net.WebRequest class.
      */
    def executeRequest(WebRequest: WebRequest): Unit
    
    //#endregion
    //#region Properties
    /**
      * Gets or sets the default network executor type that is used to make network requests.
      * @return
      *      The object that represents the default Web request executor.
      */
    def get_defaultExecutorType(): WebRequestExecutor
    
    /**
      * Gets or sets the time-out for the default network executor.
      * @return
      *      An integer value that indicates the current time-out for the default executor.
      */
    def get_defaultTimeout(): Double
    
    /**
      * Removes the event handler set by the add_completedRequest method.
      * Use the remove_ completedRequest method to remove the event handler you set using the add_ completedRequest method.
      * @param handler
      *      The function that handles the completed request event.
      */
    def remove_completedRequest(handler: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit]): Unit
    
    /**
      * Removes the event handler set by the add_invokingRequest method.
      * Use the remove_invokingRequest method to remove the event handler you set using the add_invokingRequest method.
      * @param handler
      *          The function that handles the invoking request event.
      */
    def remove_invokingRequest(
      handler: js.Function2[
          /* sender */ WebRequestExecutor, 
          /* networkRequestEventArgs */ NetworkRequestEventArgs, 
          Unit
        ]
    ): Unit
    
    /**
      * Gets or sets the default network executor type that is used to make network requests.
      * @param value
      *          A reference to an implementation of the WebRequestExecutor class.
      */
    def set_defaultExecutorType(value: WebRequestExecutor): Unit
    
    /**
      * Gets or sets the time-out for the default network executor.
      *
      * @throws Sys.ArgumentOutOfRangeException An invalid parameter was passed.
      * @param value
      *          The time in milliseconds that the default executor should wait before timing out a Web request. This value must be 0 or a positive integer.
      */
    def set_defaultTimeout(value: Double): Unit
  }
  object IWebRequestManager {
    
    inline def apply(
      add_completedRequest: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit] => Callback,
      add_invokingRequest: js.Function2[
          /* sender */ WebRequestExecutor, 
          /* networkRequestEventArgs */ NetworkRequestEventArgs, 
          Unit
        ] => Callback,
      executeRequest: WebRequest => Callback,
      get_defaultExecutorType: CallbackTo[WebRequestExecutor],
      get_defaultTimeout: CallbackTo[Double],
      remove_completedRequest: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit] => Callback,
      remove_invokingRequest: js.Function2[
          /* sender */ WebRequestExecutor, 
          /* networkRequestEventArgs */ NetworkRequestEventArgs, 
          Unit
        ] => Callback,
      set_defaultExecutorType: WebRequestExecutor => Callback,
      set_defaultTimeout: Double => Callback
    ): IWebRequestManager = {
      val __obj = js.Dynamic.literal(add_completedRequest = js.Any.fromFunction1((t0: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit]) => add_completedRequest(t0).runNow()), add_invokingRequest = js.Any.fromFunction1((t0: js.Function2[
          /* sender */ WebRequestExecutor, 
          /* networkRequestEventArgs */ NetworkRequestEventArgs, 
          Unit
        ]) => add_invokingRequest(t0).runNow()), executeRequest = js.Any.fromFunction1((t0: WebRequest) => executeRequest(t0).runNow()), get_defaultExecutorType = get_defaultExecutorType.toJsFn, get_defaultTimeout = get_defaultTimeout.toJsFn, remove_completedRequest = js.Any.fromFunction1((t0: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit]) => remove_completedRequest(t0).runNow()), remove_invokingRequest = js.Any.fromFunction1((t0: js.Function2[
          /* sender */ WebRequestExecutor, 
          /* networkRequestEventArgs */ NetworkRequestEventArgs, 
          Unit
        ]) => remove_invokingRequest(t0).runNow()), set_defaultExecutorType = js.Any.fromFunction1((t0: WebRequestExecutor) => set_defaultExecutorType(t0).runNow()), set_defaultTimeout = js.Any.fromFunction1((t0: Double) => set_defaultTimeout(t0).runNow()))
      __obj.asInstanceOf[IWebRequestManager]
    }
    
    extension [Self <: IWebRequestManager](x: Self) {
      
      inline def setAdd_completedRequest(value: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit] => Callback): Self = StObject.set(x, "add_completedRequest", js.Any.fromFunction1((t0: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit]) => value(t0).runNow()))
      
      inline def setAdd_invokingRequest(
        value: js.Function2[
              /* sender */ WebRequestExecutor, 
              /* networkRequestEventArgs */ NetworkRequestEventArgs, 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "add_invokingRequest", js.Any.fromFunction1((t0: js.Function2[
              /* sender */ WebRequestExecutor, 
              /* networkRequestEventArgs */ NetworkRequestEventArgs, 
              Unit
            ]) => value(t0).runNow()))
      
      inline def setExecuteRequest(value: WebRequest => Callback): Self = StObject.set(x, "executeRequest", js.Any.fromFunction1((t0: WebRequest) => value(t0).runNow()))
      
      inline def setGet_defaultExecutorType(value: CallbackTo[WebRequestExecutor]): Self = StObject.set(x, "get_defaultExecutorType", value.toJsFn)
      
      inline def setGet_defaultTimeout(value: CallbackTo[Double]): Self = StObject.set(x, "get_defaultTimeout", value.toJsFn)
      
      inline def setRemove_completedRequest(value: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit] => Callback): Self = StObject.set(x, "remove_completedRequest", js.Any.fromFunction1((t0: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit]) => value(t0).runNow()))
      
      inline def setRemove_invokingRequest(
        value: js.Function2[
              /* sender */ WebRequestExecutor, 
              /* networkRequestEventArgs */ NetworkRequestEventArgs, 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "remove_invokingRequest", js.Any.fromFunction1((t0: js.Function2[
              /* sender */ WebRequestExecutor, 
              /* networkRequestEventArgs */ NetworkRequestEventArgs, 
              Unit
            ]) => value(t0).runNow()))
      
      inline def setSet_defaultExecutorType(value: WebRequestExecutor => Callback): Self = StObject.set(x, "set_defaultExecutorType", js.Any.fromFunction1((t0: WebRequestExecutor) => value(t0).runNow()))
      
      inline def setSet_defaultTimeout(value: Double => Callback): Self = StObject.set(x, "set_defaultTimeout", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  /**
    * Contains information about a Web request that is ready to be sent to the current Sys.Net.WebRequestExecutor instance.
    * This class represents the type for the second parameter of the callback function added by the add_invokingRequest method.
    * The callback function is called before the Web request is routed to the current instance of the WebRequestExecutor class.
    *
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397488(v=vs.100).aspx}
    */
  trait NetworkRequestEventArgs extends StObject {
    
    //#endregion
    //#region Methods
    //#endregion
    //#region Properties
    /**
      * Gets the Web request to be routed to the current Sys.Net.WebRequestExecutor instance.
      * Use this property to inspect the contents of a Web request before it is routed to the current instance of the Sys.Net.WebRequestExecutor class.
      * You can access the Web request instance from the handler that is called before the request is routed.
      * This event handler is added by using the add_invokingRequest method.
      * @return
      *      The WebRequest.
      */
    def get_webRequest(): WebRequest
  }
  object NetworkRequestEventArgs {
    
    inline def apply(get_webRequest: CallbackTo[WebRequest]): NetworkRequestEventArgs = {
      val __obj = js.Dynamic.literal(get_webRequest = get_webRequest.toJsFn)
      __obj.asInstanceOf[NetworkRequestEventArgs]
    }
    
    extension [Self <: NetworkRequestEventArgs](x: Self) {
      
      inline def setGet_webRequest(value: CallbackTo[WebRequest]): Self = StObject.set(x, "get_webRequest", value.toJsFn)
    }
  }
  
  /**
    * Provides the script API to make a Web request.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310979(v=vs.100).aspx}
    */
  trait WebRequest extends StObject {
    
    /**
      * Registers a handler for the completed request event of the Web request.
      * @see {@link http://msdn.microsoft.com/en-us/library/bb310841(v=vs.100).aspx}
      */
    def add_completed(handler: js.Function2[/* reference */ Any, /* eventArgs */ EventArgs, Unit]): Unit
    
    /**
      * Raises the completed event for the associated Sys.Net.WebRequest instance.
      * @param eventArgs
      *           The value to pass to the Web request completed event handler.
      */
    def completed(eventArgs: EventArgs): Unit
    
    /**
      * Gets the resolved URL of the Sys.Net.WebRequest instance.
      * @returns The resolved URL that the Web request is directed to.
      */
    def getResolvedUrl(): String
    
    def get_body(): String
    
    def get_executor(): WebRequestExecutor
    
    def get_headers(): StringDictionary[String]
    
    def get_httpVerb(): String
    
    def get_timeout(): Double
    
    //#endregion
    //#region Members
    def get_url(): String
    
    def get_userContext(): Any
    
    /**
      * Executes a Web request.
      */
    def invoke(): Unit
    
    /**
      * Removes the event handler added by the add_completed method.
      * @see {@link http://msdn.microsoft.com/en-us/library/bb397454(v=vs.100).aspx}
      */
    def remove_completed(handler: js.Function2[/* reference */ Any, /* eventArgs */ EventArgs, Unit]): Unit
    
    def set_body(value: String): Unit
    
    def set_executor(value: WebRequestExecutor): Unit
    
    def set_httpVerb(value: String): Unit
    
    def set_timeout(value: Double): Unit
    
    def set_url(value: String): Unit
    
    def set_userContext(value: Any): Unit
  }
  object WebRequest {
    
    inline def apply(
      add_completed: js.Function2[/* reference */ Any, /* eventArgs */ EventArgs, Unit] => Callback,
      completed: EventArgs => Callback,
      getResolvedUrl: CallbackTo[String],
      get_body: CallbackTo[String],
      get_executor: CallbackTo[WebRequestExecutor],
      get_headers: CallbackTo[StringDictionary[String]],
      get_httpVerb: CallbackTo[String],
      get_timeout: CallbackTo[Double],
      get_url: CallbackTo[String],
      get_userContext: CallbackTo[Any],
      invoke: Callback,
      remove_completed: js.Function2[/* reference */ Any, /* eventArgs */ EventArgs, Unit] => Callback,
      set_body: String => Callback,
      set_executor: WebRequestExecutor => Callback,
      set_httpVerb: String => Callback,
      set_timeout: Double => Callback,
      set_url: String => Callback,
      set_userContext: Any => Callback
    ): WebRequest = {
      val __obj = js.Dynamic.literal(add_completed = js.Any.fromFunction1((t0: js.Function2[/* reference */ Any, /* eventArgs */ EventArgs, Unit]) => add_completed(t0).runNow()), completed = js.Any.fromFunction1((t0: EventArgs) => completed(t0).runNow()), getResolvedUrl = getResolvedUrl.toJsFn, get_body = get_body.toJsFn, get_executor = get_executor.toJsFn, get_headers = get_headers.toJsFn, get_httpVerb = get_httpVerb.toJsFn, get_timeout = get_timeout.toJsFn, get_url = get_url.toJsFn, get_userContext = get_userContext.toJsFn, invoke = invoke.toJsFn, remove_completed = js.Any.fromFunction1((t0: js.Function2[/* reference */ Any, /* eventArgs */ EventArgs, Unit]) => remove_completed(t0).runNow()), set_body = js.Any.fromFunction1((t0: String) => set_body(t0).runNow()), set_executor = js.Any.fromFunction1((t0: WebRequestExecutor) => set_executor(t0).runNow()), set_httpVerb = js.Any.fromFunction1((t0: String) => set_httpVerb(t0).runNow()), set_timeout = js.Any.fromFunction1((t0: Double) => set_timeout(t0).runNow()), set_url = js.Any.fromFunction1((t0: String) => set_url(t0).runNow()), set_userContext = js.Any.fromFunction1((t0: Any) => set_userContext(t0).runNow()))
      __obj.asInstanceOf[WebRequest]
    }
    
    extension [Self <: WebRequest](x: Self) {
      
      inline def setAdd_completed(value: js.Function2[/* reference */ Any, /* eventArgs */ EventArgs, Unit] => Callback): Self = StObject.set(x, "add_completed", js.Any.fromFunction1((t0: js.Function2[/* reference */ Any, /* eventArgs */ EventArgs, Unit]) => value(t0).runNow()))
      
      inline def setCompleted(value: EventArgs => Callback): Self = StObject.set(x, "completed", js.Any.fromFunction1((t0: EventArgs) => value(t0).runNow()))
      
      inline def setGetResolvedUrl(value: CallbackTo[String]): Self = StObject.set(x, "getResolvedUrl", value.toJsFn)
      
      inline def setGet_body(value: CallbackTo[String]): Self = StObject.set(x, "get_body", value.toJsFn)
      
      inline def setGet_executor(value: CallbackTo[WebRequestExecutor]): Self = StObject.set(x, "get_executor", value.toJsFn)
      
      inline def setGet_headers(value: CallbackTo[StringDictionary[String]]): Self = StObject.set(x, "get_headers", value.toJsFn)
      
      inline def setGet_httpVerb(value: CallbackTo[String]): Self = StObject.set(x, "get_httpVerb", value.toJsFn)
      
      inline def setGet_timeout(value: CallbackTo[Double]): Self = StObject.set(x, "get_timeout", value.toJsFn)
      
      inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
      
      inline def setGet_userContext(value: CallbackTo[Any]): Self = StObject.set(x, "get_userContext", value.toJsFn)
      
      inline def setInvoke(value: Callback): Self = StObject.set(x, "invoke", value.toJsFn)
      
      inline def setRemove_completed(value: js.Function2[/* reference */ Any, /* eventArgs */ EventArgs, Unit] => Callback): Self = StObject.set(x, "remove_completed", js.Any.fromFunction1((t0: js.Function2[/* reference */ Any, /* eventArgs */ EventArgs, Unit]) => value(t0).runNow()))
      
      inline def setSet_body(value: String => Callback): Self = StObject.set(x, "set_body", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSet_executor(value: WebRequestExecutor => Callback): Self = StObject.set(x, "set_executor", js.Any.fromFunction1((t0: WebRequestExecutor) => value(t0).runNow()))
      
      inline def setSet_httpVerb(value: String => Callback): Self = StObject.set(x, "set_httpVerb", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSet_timeout(value: Double => Callback): Self = StObject.set(x, "set_timeout", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSet_url(value: String => Callback): Self = StObject.set(x, "set_url", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSet_userContext(value: Any => Callback): Self = StObject.set(x, "set_userContext", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  /**
    * Provides the abstract base class from which network executors derive.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397434(v=vs.100).aspx}
    */
  trait WebRequestExecutor extends StObject {
    
    //#endregion
    //#region Methods
    /**
      * Stops the pending network request issued by the executor.
      * The specifics of aborting a request vary depending on how an executor is implemented.
      * However, all executors that derive from WebRequestExecutor must set their state to aborted and must raise the completed event of the associated Sys.Net.WebRequest object.
      * The executor properties do not contain consistent data after abort has been called.
      */
    def abort(): Unit
    
    /**
      * Instructs the executor to execute a Web request.
      * When this method is called, the executor packages the content of the Web request instance and initiates processing.
      * This method is intended to be used by a custom executor. If you are implementing a custom executor, you instantiate the executor, assign it to the Web request instance, and then invoke the method on the executor instance.
      * @see {@link http://msdn.microsoft.com/en-us/library/bb383834(v=vs.100).aspx}
      */
    def executeRequest(): Unit
    
    /**
      * Gets all the response headers for the current request.
      * If a request finished successfully and with valid response data, this method returns all the response headers.
      * @return All the response headers
      * @see {@link http://msdn.microsoft.com/en-us/library/bb310805(v=vs.100).aspx}
      */
    def getAllResponseHeaders(): String
    
    /**
      * Gets the value of the specified response header.
      * @return The specified response header.
      */
    def getResponseHeader(key: String): String
    
    /**
      * Gets a value indicating whether the request associated with the executor was aborted.
      * When the current instance of the Sys.Net.WebRequestExecutor class is aborted, it must set its state to aborted and it must raise the completed event of the associated request object.
      * @return true if the request associated with the executor was aborted; otherwise, false.
      */
    def get_aborted(): Boolean
    
    /**
      * Gets a value indicating whether the request completed successfully.
      * Successful completion usually means a well-formed response was received by the executor.
      * If a response was received, the current instance of the Sys.Net.WebRequestExecutor class must set its state to completed.
      * It must also raise the completed event of the associated request object.
      * @return true if the request completed successfully; otherwise, false.
      */
    def get_responseAvailable(): Boolean
    
    /**
      * Gets the text representation of the response body. When a request has completed successfully with valid response data, this property returns the text that is contained in the response body.
      * @return The text representation of the response body.
      */
    def get_responseData(): String
    
    /**
      * Returns a value indicating whether the executor has started processing the request.
      * The executor returns true if substantial processing of the request has started. For executors that make network calls, substantial processing means that a network call has been started.
      * @return true if the executor has started processing the request; otherwise, false.
      */
    def get_started(): Boolean
    
    /**
      * Gets a success status code.
      * The statusCode property returns an integer that specifies that a request completed successfully and with valid response data.
      * @return An integer that represents a status code.
      */
    def get_statusCode(): Double
    
    /**
      * Gets status information about a request that completed successfully.
      * The statusText property returns status information if a request completed successfully and with valid response data.
      * @return the status text
      */
    def get_statusText(): String
    
    /**
      * Gets a value indicating whether the request timed out.
      * Executors use the time-out information associated with the request to raise the completed event on the associated WebRequest object.
      * @return true if the request timed out; otherwise, false.
      */
    def get_timedOut(): Boolean
    
    /**
      * Gets the WebRequest object associated with the executor.
      * @return The WebRequest object associated with the current executor instance.
      */
    def get_webRequest(): WebRequest
    
    /**
      * Attempts to get the response to the current request as an XMLDOM object.
      * If a request finished successfully with valid response data, this method tries to get the response as an XMLDOM object.
      */
    def get_xml(): XMLDocument
    
    //#endregion
    //#region Properties
    /**
      * Gets the JSON-evaluated object from the response.
      * @return The JSON-evaluated response object.
      */
    def `object`(): Any
  }
  object WebRequestExecutor {
    
    inline def apply(
      abort: Callback,
      executeRequest: Callback,
      getAllResponseHeaders: CallbackTo[String],
      getResponseHeader: String => String,
      get_aborted: CallbackTo[Boolean],
      get_responseAvailable: CallbackTo[Boolean],
      get_responseData: CallbackTo[String],
      get_started: CallbackTo[Boolean],
      get_statusCode: CallbackTo[Double],
      get_statusText: CallbackTo[String],
      get_timedOut: CallbackTo[Boolean],
      get_webRequest: CallbackTo[WebRequest],
      get_xml: CallbackTo[XMLDocument],
      `object`: CallbackTo[Any]
    ): WebRequestExecutor = {
      val __obj = js.Dynamic.literal(abort = abort.toJsFn, executeRequest = executeRequest.toJsFn, getAllResponseHeaders = getAllResponseHeaders.toJsFn, getResponseHeader = js.Any.fromFunction1(getResponseHeader), get_aborted = get_aborted.toJsFn, get_responseAvailable = get_responseAvailable.toJsFn, get_responseData = get_responseData.toJsFn, get_started = get_started.toJsFn, get_statusCode = get_statusCode.toJsFn, get_statusText = get_statusText.toJsFn, get_timedOut = get_timedOut.toJsFn, get_webRequest = get_webRequest.toJsFn, get_xml = get_xml.toJsFn)
      __obj.updateDynamic("object")(`object`.toJsFn)
      __obj.asInstanceOf[WebRequestExecutor]
    }
    
    extension [Self <: WebRequestExecutor](x: Self) {
      
      inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
      
      inline def setExecuteRequest(value: Callback): Self = StObject.set(x, "executeRequest", value.toJsFn)
      
      inline def setGetAllResponseHeaders(value: CallbackTo[String]): Self = StObject.set(x, "getAllResponseHeaders", value.toJsFn)
      
      inline def setGetResponseHeader(value: String => String): Self = StObject.set(x, "getResponseHeader", js.Any.fromFunction1(value))
      
      inline def setGet_aborted(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_aborted", value.toJsFn)
      
      inline def setGet_responseAvailable(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_responseAvailable", value.toJsFn)
      
      inline def setGet_responseData(value: CallbackTo[String]): Self = StObject.set(x, "get_responseData", value.toJsFn)
      
      inline def setGet_started(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_started", value.toJsFn)
      
      inline def setGet_statusCode(value: CallbackTo[Double]): Self = StObject.set(x, "get_statusCode", value.toJsFn)
      
      inline def setGet_statusText(value: CallbackTo[String]): Self = StObject.set(x, "get_statusText", value.toJsFn)
      
      inline def setGet_timedOut(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_timedOut", value.toJsFn)
      
      inline def setGet_webRequest(value: CallbackTo[WebRequest]): Self = StObject.set(x, "get_webRequest", value.toJsFn)
      
      inline def setGet_xml(value: CallbackTo[XMLDocument]): Self = StObject.set(x, "get_xml", value.toJsFn)
      
      inline def setObject(value: CallbackTo[Any]): Self = StObject.set(x, "object", value.toJsFn)
    }
  }
  
  trait WebServiceError extends StObject {
    
    def get_errorObject(): Any
    
    def get_exceptionType(): Any
    
    def get_message(): String
    
    def get_stackTrace(): String
    
    def get_statusCode(): Double
    
    def get_timedOut(): Boolean
  }
  object WebServiceError {
    
    inline def apply(
      get_errorObject: CallbackTo[Any],
      get_exceptionType: CallbackTo[Any],
      get_message: CallbackTo[String],
      get_stackTrace: CallbackTo[String],
      get_statusCode: CallbackTo[Double],
      get_timedOut: CallbackTo[Boolean]
    ): WebServiceError = {
      val __obj = js.Dynamic.literal(get_errorObject = get_errorObject.toJsFn, get_exceptionType = get_exceptionType.toJsFn, get_message = get_message.toJsFn, get_stackTrace = get_stackTrace.toJsFn, get_statusCode = get_statusCode.toJsFn, get_timedOut = get_timedOut.toJsFn)
      __obj.asInstanceOf[WebServiceError]
    }
    
    extension [Self <: WebServiceError](x: Self) {
      
      inline def setGet_errorObject(value: CallbackTo[Any]): Self = StObject.set(x, "get_errorObject", value.toJsFn)
      
      inline def setGet_exceptionType(value: CallbackTo[Any]): Self = StObject.set(x, "get_exceptionType", value.toJsFn)
      
      inline def setGet_message(value: CallbackTo[String]): Self = StObject.set(x, "get_message", value.toJsFn)
      
      inline def setGet_stackTrace(value: CallbackTo[String]): Self = StObject.set(x, "get_stackTrace", value.toJsFn)
      
      inline def setGet_statusCode(value: CallbackTo[Double]): Self = StObject.set(x, "get_statusCode", value.toJsFn)
      
      inline def setGet_timedOut(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_timedOut", value.toJsFn)
    }
  }
  
  /**
    * Generated Proxy Classes
    * Enables your application to call Web services asynchronously by using ECMAScript (JavaScript).
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310823(v=vs.100).aspx}
    */
  trait WebServiceProxy extends StObject
}
