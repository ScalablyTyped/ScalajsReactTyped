package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.CustomizeParameterEditors and ASPxClientReportDesigner.CustomizeParameterEditors events.
  */
@JSGlobal("ASPxClientCustomizeParameterEditorsEventArgs")
@js.native
open class ASPxClientCustomizeParameterEditorsEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientCustomizeParameterEditorsEventArgs {
  /**
    * For internal use. Initializes a new instance of the ASPxClientCustomizeParameterEditorsEventArgs class with the specified settings.
    * @param parameter An IParameterDescriptor object.
    * @param info An ISerializationInfo object.
    */
  def this(
    parameter: typingsJapgolly.devexpressWeb.ASPxDesignerElementParameterDescriptor,
    info: typingsJapgolly.devexpressWeb.ASPxDesignerElementSerializationInfo
  ) = this()
  
  /**
    * Provides access to an object that stores information required to serialize a parameter editor.
    */
  /* CompleteClass */
  var info: typingsJapgolly.devexpressWeb.ASPxDesignerElementSerializationInfo = js.native
  
  /**
    * Provides access to an object that stores information about a parameter.
    */
  /* CompleteClass */
  var parameter: typingsJapgolly.devexpressWeb.ASPxDesignerElementParameterDescriptor = js.native
}
