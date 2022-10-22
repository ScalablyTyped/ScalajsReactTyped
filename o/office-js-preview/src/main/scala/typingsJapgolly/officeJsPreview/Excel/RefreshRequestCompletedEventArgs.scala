package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LinkedDataTypeRefreshRequestCompleted
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Local
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The argument that is passed to the event handler upon completion of refresh request to an external service or link.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait RefreshRequestCompletedEventArgs extends StObject {
  
  /**
    * Indicates if the request to refresh was successful.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshed: Boolean
  
  /**
    * The unique ID of the object whose refresh request was completed.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var serviceId: Double
  
  /**
    * Gets the source of the event. See `Excel.EventSource` for details.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var source: EventSource | Local | Remote
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: LinkedDataTypeRefreshRequestCompleted
  
  /**
    * An array that contains any warnings generated from the refresh request.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object RefreshRequestCompletedEventArgs {
  
  inline def apply(refreshed: Boolean, serviceId: Double, source: EventSource | Local | Remote): RefreshRequestCompletedEventArgs = {
    val __obj = js.Dynamic.literal(refreshed = refreshed.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LinkedDataTypeRefreshRequestCompleted")
    __obj.asInstanceOf[RefreshRequestCompletedEventArgs]
  }
  
  extension [Self <: RefreshRequestCompletedEventArgs](x: Self) {
    
    inline def setRefreshed(value: Boolean): Self = StObject.set(x, "refreshed", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: Double): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: LinkedDataTypeRefreshRequestCompleted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
