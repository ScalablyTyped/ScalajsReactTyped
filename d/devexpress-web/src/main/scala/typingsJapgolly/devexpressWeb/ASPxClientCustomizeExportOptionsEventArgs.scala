package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.CustomizeExportOptions and ASPxClientReportDesigner.PreviewCustomizeExportOptions events.
  */
trait ASPxClientCustomizeExportOptionsEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Returns the export options model for the specified export format. An export options model.
    * @param format An object that specifies the export format whose model should be returned.
    */
  def GetExportOptionsModel(format: Any): Any
  
  /**
    * Hides the entire <a href="https://devexpress.github.io/dotnet-eud/interface-elements-for-web/articles/document-viewer/exporting/export-a-document.html">Export Options</a> panel from the Web Document Viewer.
    */
  def HideExportOptionsPanel(): Unit
  
  /**
    * Hides the specified export format from the Export To drop-down list and the corresponding category from the <a href="https://devexpress.github.io/dotnet-eud/interface-elements-for-web/articles/document-viewer/exporting/export-a-document.html">Export Options</a> panel.
    * @param format An object that specifies the export format to hide.
    */
  def HideFormat(format: Any): Unit
  
  /**
    * Hides the specified options for the specified export format from the <a href="https://devexpress.github.io/dotnet-eud/interface-elements-for-web/articles/document-viewer/exporting/export-a-document.html">Export Options</a> panel.
    * @param format An object that specifies the export format whose options should be hidden.
    * @param properties An array of properties to hide.
    */
  def HideProperties(format: Any, properties: Any*): Unit
}
object ASPxClientCustomizeExportOptionsEventArgs {
  
  inline def apply(
    GetExportOptionsModel: Any => Any,
    HideExportOptionsPanel: Callback,
    HideFormat: Any => Callback,
    HideProperties: (Any, /* repeated */ Any) => Callback
  ): ASPxClientCustomizeExportOptionsEventArgs = {
    val __obj = js.Dynamic.literal(GetExportOptionsModel = js.Any.fromFunction1(GetExportOptionsModel), HideExportOptionsPanel = HideExportOptionsPanel.toJsFn, HideFormat = js.Any.fromFunction1((t0: Any) => HideFormat(t0).runNow()), HideProperties = js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (HideProperties(t0, t1)).runNow()))
    __obj.asInstanceOf[ASPxClientCustomizeExportOptionsEventArgs]
  }
  
  extension [Self <: ASPxClientCustomizeExportOptionsEventArgs](x: Self) {
    
    inline def setGetExportOptionsModel(value: Any => Any): Self = StObject.set(x, "GetExportOptionsModel", js.Any.fromFunction1(value))
    
    inline def setHideExportOptionsPanel(value: Callback): Self = StObject.set(x, "HideExportOptionsPanel", value.toJsFn)
    
    inline def setHideFormat(value: Any => Callback): Self = StObject.set(x, "HideFormat", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setHideProperties(value: (Any, /* repeated */ Any) => Callback): Self = StObject.set(x, "HideProperties", js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
  }
}
