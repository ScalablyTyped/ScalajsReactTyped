package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Obsolete. Use the MVCxClientDocumentViewer class instead.
  */
@JSGlobal("MVCxClientReportViewer")
@js.native
class MVCxClientReportViewer () extends ASPxClientReportViewer {
  /**
    * Occurs before performing a document export request.
    */
  var BeforeExportRequest: ASPxClientEvent[MVCxClientBeforeExportRequestEventHandler[MVCxClientReportViewer]] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientReportViewer: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientReportViewer]] = js.native
}

