package typingsJapgolly.microsoftAjax.global.Sys

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
  
  @JSGlobal("Sys.Net")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Manages the flow of the Web requests issued by the Sys.Net.WebRequest object to the associated executor object.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397435(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Net.IWebRequestManager")
  @js.native
  //#region Constructor
  /**
    * Initializes a new instance of the Sys.Net.WebRequestManager class when implemented in a derived class.
    */
  open class IWebRequestManager ()
    extends StObject
       with typingsJapgolly.microsoftAjax.Sys.Net.IWebRequestManager {
    
    //#endregion
    //#region Methods
    /**
      * Registers a handler for the completed request event of the WebRequestManager.
      * @param handler
      *      The function registered to handle the completed request event.
      */
    /* CompleteClass */
    override def add_completedRequest(
      handler: js.Function2[
          /* sender */ typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor, 
          /* eventArgs */ typingsJapgolly.microsoftAjax.Sys.EventArgs, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Registers a handler for processing the invoking request event of the WebRequestManager.
      * @param handler
      *      The function registered to handle the invoking request event.
      */
    /* CompleteClass */
    override def add_invokingRequest(
      handler: js.Function2[
          /* sender */ typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor, 
          /* networkRequestEventArgs */ typingsJapgolly.microsoftAjax.Sys.Net.NetworkRequestEventArgs, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Sends Web requests to the default network executor.
      * This member supports the client-script infrastructure and is not intended to be used directly from your code.
      * @param WebRequest
      *      An instance of the Sys.Net.WebRequest class.
      */
    /* CompleteClass */
    override def executeRequest(WebRequest: typingsJapgolly.microsoftAjax.Sys.Net.WebRequest): Unit = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets or sets the default network executor type that is used to make network requests.
      * @return
      *      The object that represents the default Web request executor.
      */
    /* CompleteClass */
    override def get_defaultExecutorType(): typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor = js.native
    
    /**
      * Gets or sets the time-out for the default network executor.
      * @return
      *      An integer value that indicates the current time-out for the default executor.
      */
    /* CompleteClass */
    override def get_defaultTimeout(): Double = js.native
    
    /**
      * Removes the event handler set by the add_completedRequest method.
      * Use the remove_ completedRequest method to remove the event handler you set using the add_ completedRequest method.
      * @param handler
      *      The function that handles the completed request event.
      */
    /* CompleteClass */
    override def remove_completedRequest(
      handler: js.Function2[
          /* sender */ typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor, 
          /* eventArgs */ typingsJapgolly.microsoftAjax.Sys.EventArgs, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Removes the event handler set by the add_invokingRequest method.
      * Use the remove_invokingRequest method to remove the event handler you set using the add_invokingRequest method.
      * @param handler
      *          The function that handles the invoking request event.
      */
    /* CompleteClass */
    override def remove_invokingRequest(
      handler: js.Function2[
          /* sender */ typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor, 
          /* networkRequestEventArgs */ typingsJapgolly.microsoftAjax.Sys.Net.NetworkRequestEventArgs, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Gets or sets the default network executor type that is used to make network requests.
      * @param value
      *          A reference to an implementation of the WebRequestExecutor class.
      */
    /* CompleteClass */
    override def set_defaultExecutorType(value: typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor): Unit = js.native
    
    /**
      * Gets or sets the time-out for the default network executor.
      *
      * @throws Sys.ArgumentOutOfRangeException An invalid parameter was passed.
      * @param value
      *          The time in milliseconds that the default executor should wait before timing out a Web request. This value must be 0 or a positive integer.
      */
    /* CompleteClass */
    override def set_defaultTimeout(value: Double): Unit = js.native
  }
  
  /**
    * Contains information about a Web request that is ready to be sent to the current Sys.Net.WebRequestExecutor instance.
    * This class represents the type for the second parameter of the callback function added by the add_invokingRequest method.
    * The callback function is called before the Web request is routed to the current instance of the WebRequestExecutor class.
    *
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397488(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Net.NetworkRequestEventArgs")
  @js.native
  open class NetworkRequestEventArgs protected ()
    extends StObject
       with typingsJapgolly.microsoftAjax.Sys.Net.NetworkRequestEventArgs {
    //#region Constructors
    /**
      * Initializes a new instance of the Sys.Net.NetworkRequestEventArgs. class.
      * @param value
      *      The current WebRequest instance.
      */
    def this(value: typingsJapgolly.microsoftAjax.Sys.Net.WebRequest) = this()
    
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
    /* CompleteClass */
    override def get_webRequest(): typingsJapgolly.microsoftAjax.Sys.Net.WebRequest = js.native
  }
  
  /**
    * Provides the script API to make a Web request.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310979(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Net.WebRequest")
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the Sys.Net.WebRequest class.
    */
  open class WebRequest ()
    extends StObject
       with typingsJapgolly.microsoftAjax.Sys.Net.WebRequest {
    
    /**
      * Registers a handler for the completed request event of the Web request.
      * @see {@link http://msdn.microsoft.com/en-us/library/bb310841(v=vs.100).aspx}
      */
    /* CompleteClass */
    override def add_completed(
      handler: js.Function2[
          /* reference */ Any, 
          /* eventArgs */ typingsJapgolly.microsoftAjax.Sys.EventArgs, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Raises the completed event for the associated Sys.Net.WebRequest instance.
      * @param eventArgs
      *           The value to pass to the Web request completed event handler.
      */
    /* CompleteClass */
    override def completed(eventArgs: typingsJapgolly.microsoftAjax.Sys.EventArgs): Unit = js.native
    
    /**
      * Gets the resolved URL of the Sys.Net.WebRequest instance.
      * @returns The resolved URL that the Web request is directed to.
      */
    /* CompleteClass */
    override def getResolvedUrl(): String = js.native
    
    /* CompleteClass */
    override def get_body(): String = js.native
    
    /* CompleteClass */
    override def get_executor(): typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor = js.native
    
    /* CompleteClass */
    override def get_headers(): StringDictionary[String] = js.native
    
    /* CompleteClass */
    override def get_httpVerb(): String = js.native
    
    /* CompleteClass */
    override def get_timeout(): Double = js.native
    
    //#endregion
    //#region Members
    /* CompleteClass */
    override def get_url(): String = js.native
    
    /* CompleteClass */
    override def get_userContext(): Any = js.native
    
    /**
      * Executes a Web request.
      */
    /* CompleteClass */
    override def invoke(): Unit = js.native
    
    /**
      * Removes the event handler added by the add_completed method.
      * @see {@link http://msdn.microsoft.com/en-us/library/bb397454(v=vs.100).aspx}
      */
    /* CompleteClass */
    override def remove_completed(
      handler: js.Function2[
          /* reference */ Any, 
          /* eventArgs */ typingsJapgolly.microsoftAjax.Sys.EventArgs, 
          Unit
        ]
    ): Unit = js.native
    
    /* CompleteClass */
    override def set_body(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_executor(value: typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor): Unit = js.native
    
    /* CompleteClass */
    override def set_httpVerb(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_timeout(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def set_url(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_userContext(value: Any): Unit = js.native
  }
  
  /**
    * Provides the abstract base class from which network executors derive.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397434(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Net.WebRequestExecutor")
  @js.native
  //#region Constructors
  /**
    * Initializes a Sys.Net.WebRequestExecutor instance when implemented in a derived class.
    */
  open class WebRequestExecutor ()
    extends StObject
       with typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor {
    
    //#endregion
    //#region Methods
    /**
      * Stops the pending network request issued by the executor.
      * The specifics of aborting a request vary depending on how an executor is implemented.
      * However, all executors that derive from WebRequestExecutor must set their state to aborted and must raise the completed event of the associated Sys.Net.WebRequest object.
      * The executor properties do not contain consistent data after abort has been called.
      */
    /* CompleteClass */
    override def abort(): Unit = js.native
    
    /**
      * Instructs the executor to execute a Web request.
      * When this method is called, the executor packages the content of the Web request instance and initiates processing.
      * This method is intended to be used by a custom executor. If you are implementing a custom executor, you instantiate the executor, assign it to the Web request instance, and then invoke the method on the executor instance.
      * @see {@link http://msdn.microsoft.com/en-us/library/bb383834(v=vs.100).aspx}
      */
    /* CompleteClass */
    override def executeRequest(): Unit = js.native
    
    /**
      * Gets all the response headers for the current request.
      * If a request finished successfully and with valid response data, this method returns all the response headers.
      * @return All the response headers
      * @see {@link http://msdn.microsoft.com/en-us/library/bb310805(v=vs.100).aspx}
      */
    /* CompleteClass */
    override def getAllResponseHeaders(): String = js.native
    
    /**
      * Gets the value of the specified response header.
      * @return The specified response header.
      */
    /* CompleteClass */
    override def getResponseHeader(key: String): String = js.native
    
    /**
      * Gets a value indicating whether the request associated with the executor was aborted.
      * When the current instance of the Sys.Net.WebRequestExecutor class is aborted, it must set its state to aborted and it must raise the completed event of the associated request object.
      * @return true if the request associated with the executor was aborted; otherwise, false.
      */
    /* CompleteClass */
    override def get_aborted(): Boolean = js.native
    
    /**
      * Gets a value indicating whether the request completed successfully.
      * Successful completion usually means a well-formed response was received by the executor.
      * If a response was received, the current instance of the Sys.Net.WebRequestExecutor class must set its state to completed.
      * It must also raise the completed event of the associated request object.
      * @return true if the request completed successfully; otherwise, false.
      */
    /* CompleteClass */
    override def get_responseAvailable(): Boolean = js.native
    
    /**
      * Gets the text representation of the response body. When a request has completed successfully with valid response data, this property returns the text that is contained in the response body.
      * @return The text representation of the response body.
      */
    /* CompleteClass */
    override def get_responseData(): String = js.native
    
    /**
      * Returns a value indicating whether the executor has started processing the request.
      * The executor returns true if substantial processing of the request has started. For executors that make network calls, substantial processing means that a network call has been started.
      * @return true if the executor has started processing the request; otherwise, false.
      */
    /* CompleteClass */
    override def get_started(): Boolean = js.native
    
    /**
      * Gets a success status code.
      * The statusCode property returns an integer that specifies that a request completed successfully and with valid response data.
      * @return An integer that represents a status code.
      */
    /* CompleteClass */
    override def get_statusCode(): Double = js.native
    
    /**
      * Gets status information about a request that completed successfully.
      * The statusText property returns status information if a request completed successfully and with valid response data.
      * @return the status text
      */
    /* CompleteClass */
    override def get_statusText(): String = js.native
    
    /**
      * Gets a value indicating whether the request timed out.
      * Executors use the time-out information associated with the request to raise the completed event on the associated WebRequest object.
      * @return true if the request timed out; otherwise, false.
      */
    /* CompleteClass */
    override def get_timedOut(): Boolean = js.native
    
    /**
      * Gets the WebRequest object associated with the executor.
      * @return The WebRequest object associated with the current executor instance.
      */
    /* CompleteClass */
    override def get_webRequest(): typingsJapgolly.microsoftAjax.Sys.Net.WebRequest = js.native
    
    /**
      * Attempts to get the response to the current request as an XMLDOM object.
      * If a request finished successfully with valid response data, this method tries to get the response as an XMLDOM object.
      */
    /* CompleteClass */
    override def get_xml(): XMLDocument = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets the JSON-evaluated object from the response.
      * @return The JSON-evaluated response object.
      */
    /* CompleteClass */
    override def `object`(): Any = js.native
  }
  
  @JSGlobal("Sys.Net.WebRequestManager")
  @js.native
  def WebRequestManager: typingsJapgolly.microsoftAjax.Sys.Net.IWebRequestManager = js.native
  inline def WebRequestManager_=(x: typingsJapgolly.microsoftAjax.Sys.Net.IWebRequestManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebRequestManager")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Sys.Net.WebServiceError")
  @js.native
  open class WebServiceError ()
    extends StObject
       with typingsJapgolly.microsoftAjax.Sys.Net.WebServiceError {
    
    /* CompleteClass */
    override def get_errorObject(): Any = js.native
    
    /* CompleteClass */
    override def get_exceptionType(): Any = js.native
    
    /* CompleteClass */
    override def get_message(): String = js.native
    
    /* CompleteClass */
    override def get_stackTrace(): String = js.native
    
    /* CompleteClass */
    override def get_statusCode(): Double = js.native
    
    /* CompleteClass */
    override def get_timedOut(): Boolean = js.native
  }
  
  /**
    * Generated Proxy Classes
    * Enables your application to call Web services asynchronously by using ECMAScript (JavaScript).
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310823(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Net.WebServiceProxy")
  @js.native
  open class WebServiceProxy ()
    extends StObject
       with typingsJapgolly.microsoftAjax.Sys.Net.WebServiceProxy
  object WebServiceProxy {
    
    @JSGlobal("Sys.Net.WebServiceProxy")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def invoke(
      servicePath: String,
      methodName: String,
      useGet: js.UndefOr[Boolean],
      params: js.UndefOr[Any],
      onSuccess: js.UndefOr[
          js.Function2[
            /* result */ String, 
            /* eventArgs */ typingsJapgolly.microsoftAjax.Sys.EventArgs, 
            Unit
          ]
        ],
      onFailure: js.UndefOr[
          js.Function1[/* error */ typingsJapgolly.microsoftAjax.Sys.Net.WebServiceError, Unit]
        ],
      userContext: js.UndefOr[Any],
      timeout: js.UndefOr[Double],
      enableJsonp: js.UndefOr[Boolean],
      jsonpCallbackParameter: js.UndefOr[String]
    ): typingsJapgolly.microsoftAjax.Sys.Net.WebRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(servicePath.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], useGet.asInstanceOf[js.Any], params.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onFailure.asInstanceOf[js.Any], userContext.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], enableJsonp.asInstanceOf[js.Any], jsonpCallbackParameter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.microsoftAjax.Sys.Net.WebRequest]
  }
}
