package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeToolbox event.
  */
@JSGlobal("ASPxClientReportDesignerCustomizeToolboxEventArgs")
@js.native
open class ASPxClientReportDesignerCustomizeToolboxEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientReportDesignerCustomizeToolboxEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerCustomizeToolboxEventArgs class with the specified settings.
    * @param controlsFactory An object that provides information about all controls available in the Toolbox. This object is assigned to the ASPxClientReportDesignerCustomizeToolboxEventArgs.ControlsFactory property.
    */
  def this(controlsFactory: typingsJapgolly.devexpressWeb.ASPxDesignerControlsFactory) = this()
  
  /**
    * Provides information about all controls available in the Toolbox.
    */
  /* CompleteClass */
  var ControlsFactory: typingsJapgolly.devexpressWeb.ASPxDesignerControlsFactory = js.native
}
