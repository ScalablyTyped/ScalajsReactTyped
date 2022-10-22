package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerOptions extends StObject {
  
  var defaultPageSize: js.UndefOr[PDFViewerDefaultPageSize] = js.undefined
  
  var dplProcessing: js.UndefOr[PDFViewerDplProcessing] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* e */ PDFViewerErrorEvent, Unit]] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var messages: js.UndefOr[PDFViewerMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ PDFViewerOpenEvent, Unit]] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var pdfjsProcessing: js.UndefOr[PDFViewerPdfjsProcessing] = js.undefined
  
  var render: js.UndefOr[js.Function1[/* e */ PDFViewerRenderEvent, Unit]] = js.undefined
  
  var toolbar: js.UndefOr[Boolean | PDFViewerToolbar] = js.undefined
  
  var view: js.UndefOr[PDFViewerView] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object PDFViewerOptions {
  
  inline def apply(): PDFViewerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerOptions]
  }
  
  extension [Self <: PDFViewerOptions](x: Self) {
    
    inline def setDefaultPageSize(value: PDFViewerDefaultPageSize): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
    
    inline def setDefaultPageSizeUndefined: Self = StObject.set(x, "defaultPageSize", js.undefined)
    
    inline def setDplProcessing(value: PDFViewerDplProcessing): Self = StObject.set(x, "dplProcessing", value.asInstanceOf[js.Any])
    
    inline def setDplProcessingUndefined: Self = StObject.set(x, "dplProcessing", js.undefined)
    
    inline def setError(value: /* e */ PDFViewerErrorEvent => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* e */ PDFViewerErrorEvent) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMessages(value: PDFViewerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ PDFViewerOpenEvent => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: /* e */ PDFViewerOpenEvent) => value(t0).runNow()))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPdfjsProcessing(value: PDFViewerPdfjsProcessing): Self = StObject.set(x, "pdfjsProcessing", value.asInstanceOf[js.Any])
    
    inline def setPdfjsProcessingUndefined: Self = StObject.set(x, "pdfjsProcessing", js.undefined)
    
    inline def setRender(value: /* e */ PDFViewerRenderEvent => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: /* e */ PDFViewerRenderEvent) => value(t0).runNow()))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setToolbar(value: Boolean | PDFViewerToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setView(value: PDFViewerView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
