package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.ParametersReset and ASPxClientReportDesigner.PreviewParametersReset events.
  */
@JSGlobal("ASPxClientParametersResetEventArgs")
@js.native
open class ASPxClientParametersResetEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientParametersResetEventArgs {
  /**
    * Initializes a new instance of the ASPxClientParametersResetEventArgs class with the specified settings.
    * @param parametersModel A View Model object for report parameters. This value is assigned to the ASPxClientParametersResetEventArgs.ParametersViewModel property.
    * @param parameters An array of IParameter objects. This value is assigned to the ASPxClientParametersResetEventArgs.Parameters property.
    */
  def this(
    parametersModel: Any,
    parameters: js.Array[typingsJapgolly.devexpressWeb.ASPxClientWebDocumentViewerParameter]
  ) = this()
  
  /**
    * Provides access to report parameters whose values have been reset.
    */
  /* CompleteClass */
  var Parameters: js.Array[typingsJapgolly.devexpressWeb.ASPxClientWebDocumentViewerParameter] = js.native
  
  /**
    * Provides access to a View Model for report parameters.
    */
  /* CompleteClass */
  var ParametersViewModel: Any = js.native
}
