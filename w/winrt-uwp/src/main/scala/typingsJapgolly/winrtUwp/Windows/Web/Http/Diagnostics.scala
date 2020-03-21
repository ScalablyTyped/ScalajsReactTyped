package typingsJapgolly.winrtUwp.Windows.Web.Http

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.System.Diagnostics.ProcessDiagnosticInfo
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.requestresponsecompleted
import typingsJapgolly.winrtUwp.winrtUwpStrings.requestsent
import typingsJapgolly.winrtUwp.winrtUwpStrings.responsereceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a diagnostic facility for tracing and profiling web traffic for applications build on HTTP protocols. */
@JSGlobal("Windows.Web.Http.Diagnostics")
@js.native
object Diagnostics extends js.Object {
  /** Provides a simple diagnostic facility for tracing and profiling web traffic in applications built on Microsoft’s HTTP stacks. */
  @js.native
  abstract class HttpDiagnosticProvider () extends js.Object {
    /** Subscribe to the RequestResponseCompleted event to receive a notification that a request has been submitted. */
    @JSName("onrequestresponsecompleted")
    var onrequestresponsecompleted_Original: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestResponseCompletedEventArgs] = js.native
    /** Subscribe to the RequestSent event to receive a notification that a request has been sent. */
    @JSName("onrequestsent")
    var onrequestsent_Original: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestSentEventArgs] = js.native
    /** Subscribe to the ResponseReceived event to receive a notification that a response has been received. */
    @JSName("onresponsereceived")
    var onresponsereceived_Original: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderResponseReceivedEventArgs] = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_requestresponsecompleted(
      `type`: requestresponsecompleted,
      listener: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestResponseCompletedEventArgs]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_requestsent(
      `type`: requestsent,
      listener: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestSentEventArgs]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_responsereceived(
      `type`: responsereceived,
      listener: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderResponseReceivedEventArgs]
    ): Unit = js.native
    /** Subscribe to the RequestResponseCompleted event to receive a notification that a request has been submitted. */
    def onrequestresponsecompleted(
      ev: HttpDiagnosticProviderRequestResponseCompletedEventArgs with WinRTEvent[HttpDiagnosticProvider]
    ): Unit = js.native
    /** Subscribe to the RequestSent event to receive a notification that a request has been sent. */
    def onrequestsent(ev: HttpDiagnosticProviderRequestSentEventArgs with WinRTEvent[HttpDiagnosticProvider]): Unit = js.native
    /** Subscribe to the ResponseReceived event to receive a notification that a response has been received. */
    def onresponsereceived(ev: HttpDiagnosticProviderResponseReceivedEventArgs with WinRTEvent[HttpDiagnosticProvider]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_requestresponsecompleted(
      `type`: requestresponsecompleted,
      listener: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestResponseCompletedEventArgs]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_requestsent(
      `type`: requestsent,
      listener: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderRequestSentEventArgs]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_responsereceived(
      `type`: responsereceived,
      listener: TypedEventHandler[HttpDiagnosticProvider, HttpDiagnosticProviderResponseReceivedEventArgs]
    ): Unit = js.native
    /** Starts the HttpDiagnosticProvider monitoring the attached process target. */
    def start(): Unit = js.native
    /** Stops the HttpDiagnosticProvider from monitoring the attached process target. */
    def stop(): Unit = js.native
  }
  
  /** Provides data for the RequestResponseCompleted event. */
  @js.native
  abstract class HttpDiagnosticProviderRequestResponseCompletedEventArgs () extends js.Object {
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    var activityId: String = js.native
    /** Gets the type of operation initiating this request. */
    var initiator: HttpDiagnosticRequestInitiator = js.native
    var processId: js.Any = js.native
     /* unmapped type */ /** Gets the URI of the requested response. */
    var requestedUri: Uri = js.native
    var sourceLocations: js.Any = js.native
     /* unmapped type */ var threadId: js.Any = js.native
     /* unmapped type */ /** Gets the timestamp for connection events. */
    var timestamps: HttpDiagnosticProviderRequestResponseTimestamps = js.native
  }
  
  /** Provides all the timestamps for connection events. */
  @js.native
  abstract class HttpDiagnosticProviderRequestResponseTimestamps () extends js.Object {
    /** Gets the last time local cache was checked. */
    var cacheCheckedTimestamp: js.Date = js.native
    /** Gets the timestamp for the end of the TCP connection phase. */
    var connectionCompletedTimestamp: js.Date = js.native
    /** Gets the timestamp for the start of the TCP connection phase. */
    var connectionInitiatedTimestamp: js.Date = js.native
    /** Gets the time of the DNS name resolution. */
    var nameResolvedTimestamp: js.Date = js.native
    /** Gets the timestamp for the last byte sent. */
    var requestCompletedTimestamp: js.Date = js.native
    /** Gets the timestamp for the first byte sent. */
    var requestSentTimestamp: js.Date = js.native
    /** Gets the timestamp for the last byte received. */
    var responseCompletedTimestamp: js.Date = js.native
    /** Gets the timestamp for the fir byte received. */
    var responseReceivedTimestamp: js.Date = js.native
    /** Gets the time of the SSL handshake negotiation. */
    var sslNegotiatedTimestamp: js.Date = js.native
  }
  
  /** Provides data for the RequestSent event. */
  @js.native
  abstract class HttpDiagnosticProviderRequestSentEventArgs () extends js.Object {
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    var activityId: String = js.native
    /** Gets the type of operation initiating this request. */
    var initiator: HttpDiagnosticRequestInitiator = js.native
    /** Gets the HttpRequestMessage including headers. */
    var message: HttpRequestMessage = js.native
    /** Gets the process ID. */
    var processId: Double = js.native
    /** Gets the source location call stack. */
    var sourceLocations: IVectorView[HttpDiagnosticSourceLocation] = js.native
    /** Gets the thread ID. */
    var threadId: Double = js.native
    /** Gets the timestamp of when the HttpRequestMessage was sent. */
    var timestamp: js.Date = js.native
  }
  
  /** Provides data for the ResponseReceived event. */
  @js.native
  abstract class HttpDiagnosticProviderResponseReceivedEventArgs () extends js.Object {
    /** Gets a locally unique ID for this activity, for correlating with other events. */
    var activityId: String = js.native
    /** Gets the HttpResponseMessage including headers, the status code, and data. */
    var message: HttpResponseMessage = js.native
    /** Gets the timestamp of when the HttpResponseMessage was received. */
    var timestamp: js.Date = js.native
  }
  
  @js.native
  sealed trait HttpDiagnosticRequestInitiator extends js.Object
  
  /** Contains the source location of the HTTP activity. */
  @js.native
  abstract class HttpDiagnosticSourceLocation () extends js.Object {
    /** Gets the column number. */
    var columnNumber: Double = js.native
    /** Gets the line number. */
    var lineNumber: Double = js.native
    /** Gets the source URI. */
    var sourceUri: Uri = js.native
  }
  
  /* static members */
  @js.native
  object HttpDiagnosticProvider extends js.Object {
    /**
      * Creates a new HttpDiagnosticProvider based on the specified ProcessDiagnosticInfo object.
      * @param processDiagnosticInfo The ProcessDiagnosticInfo that identifies the process to watch.
      * @return The newly created HttpDiagnosticProvider .
      */
    def createFromProcessDiagnosticInfo(processDiagnosticInfo: ProcessDiagnosticInfo): HttpDiagnosticProvider = js.native
  }
  
  /** Provides the source of the request. */
  @js.native
  object HttpDiagnosticRequestInitiator extends js.Object {
    /** An HTML download. */
    @js.native
    sealed trait htmlDownload extends HttpDiagnosticRequestInitiator
    
    /** An image resource. */
    @js.native
    sealed trait image extends HttpDiagnosticRequestInitiator
    
    /** A link. */
    @js.native
    sealed trait link extends HttpDiagnosticRequestInitiator
    
    /** A media resource. */
    @js.native
    sealed trait media extends HttpDiagnosticRequestInitiator
    
    /** An other resource. */
    @js.native
    sealed trait other extends HttpDiagnosticRequestInitiator
    
    /** A parsed element. */
    @js.native
    sealed trait parsedElement extends HttpDiagnosticRequestInitiator
    
    /** A pre-fetch request. */
    @js.native
    sealed trait prefetch extends HttpDiagnosticRequestInitiator
    
    /** A script resource. */
    @js.native
    sealed trait script extends HttpDiagnosticRequestInitiator
    
    /** A CSS element. */
    @js.native
    sealed trait style extends HttpDiagnosticRequestInitiator
    
    /** An XML HTTP request. */
    @js.native
    sealed trait xmlHttpRequest extends HttpDiagnosticRequestInitiator
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HttpDiagnosticRequestInitiator with Double] = js.native
    /* 7 */ @js.native
    object htmlDownload extends TopLevel[htmlDownload with Double]
    
    /* 2 */ @js.native
    object image extends TopLevel[image with Double]
    
    /* 3 */ @js.native
    object link extends TopLevel[link with Double]
    
    /* 6 */ @js.native
    object media extends TopLevel[media with Double]
    
    /* 9 */ @js.native
    object other extends TopLevel[other with Double]
    
    /* 0 */ @js.native
    object parsedElement extends TopLevel[parsedElement with Double]
    
    /* 8 */ @js.native
    object prefetch extends TopLevel[prefetch with Double]
    
    /* 1 */ @js.native
    object script extends TopLevel[script with Double]
    
    /* 4 */ @js.native
    object style extends TopLevel[style with Double]
    
    /* 5 */ @js.native
    object xmlHttpRequest extends TopLevel[xmlHttpRequest with Double]
    
  }
  
}

