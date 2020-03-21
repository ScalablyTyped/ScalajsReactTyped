package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the events related to opening and saving reports in the Web Report Designer.
  */
@JSGlobal("ASPxClientReportDesignerDialogEventArgs")
@js.native
class ASPxClientReportDesignerDialogEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerDialogEventArgs class with the specified settings.
    * @param url Specifies the URL of the report currently being processed. This value is assigned to the ASPxClientReportDesignerDialogEventArgs.Url property.
    * @param report Specifies the report currently being processed. This value is assigned to the ASPxClientReportDesignerDialogEventArgs.Report property.
    */
  def this(url: String, report: js.Any) = this()
  /**
    * Specifies the report currently being processed.
    */
  var Report: js.Any = js.native
  /**
    * Specifies the URL of the report currently being processed.
    */
  var Url: String = js.native
}

