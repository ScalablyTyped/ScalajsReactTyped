package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.Excel.ErrorCellValueType.connect
import typingsJapgolly.officeJsPreview.Excel.RangeValueType.error
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Connect
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DataTypeNoConnection
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DataTypeServiceError
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Error
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ExternalLinks
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ExternalLinksAccessFailed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ExternalLinksFailedToRefresh
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ExternalLinksFileTooLarge
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ExternalLinksInvalidRequest
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ExternalLinksNonCloudLocation
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ExternalLinksServerError
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ExternalLinksThrottledByHost
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ExternalLinksUnAuthenticated
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.GenericServerError
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.MissingContent
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NumbersignCONNECTExclamationmark
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.OutdatedLinkedEntity
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.RequestThrottle
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ServiceError
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a #CONNECT! error.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait ConnectErrorCellValue
  extends StObject
     with ErrorCellValue {
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicType: js.UndefOr[error | Error] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    * When accessed through a `valuesAsJson` property, this string value aligns with the en-US locale.
    * When accessed through a `valuesAsJsonLocal` property, this string value aligns with the user's display locale.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicValue: js.UndefOr[NumbersignCONNECTExclamationmark | String] = js.undefined
  
  /**
    * Represents the type of `ConnectErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorSubType: js.UndefOr[
    ConnectErrorCellValueSubType | Unknown_ | ServiceError | ExternalLinks | ExternalLinksNonCloudLocation | DataTypeNoConnection | DataTypeServiceError | MissingContent | RequestThrottle | ExternalLinksFailedToRefresh | ExternalLinksAccessFailed | ExternalLinksServerError | ExternalLinksInvalidRequest | ExternalLinksUnAuthenticated | ExternalLinksThrottledByHost | ExternalLinksFileTooLarge | OutdatedLinkedEntity | GenericServerError
  ] = js.undefined
  
  /**
    * Represents the type of `ErrorCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var errorType: js.UndefOr[connect | Connect] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: typingsJapgolly.officeJsPreview.Excel.CellValueType.error | Error
}
object ConnectErrorCellValue {
  
  inline def apply(`type`: typingsJapgolly.officeJsPreview.Excel.CellValueType.error | Error): ConnectErrorCellValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectErrorCellValue]
  }
  
  extension [Self <: ConnectErrorCellValue](x: Self) {
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignCONNECTExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setErrorSubType(
      value: ConnectErrorCellValueSubType | Unknown_ | ServiceError | ExternalLinks | ExternalLinksNonCloudLocation | DataTypeNoConnection | DataTypeServiceError | MissingContent | RequestThrottle | ExternalLinksFailedToRefresh | ExternalLinksAccessFailed | ExternalLinksServerError | ExternalLinksInvalidRequest | ExternalLinksUnAuthenticated | ExternalLinksThrottledByHost | ExternalLinksFileTooLarge | OutdatedLinkedEntity | GenericServerError
    ): Self = StObject.set(x, "errorSubType", value.asInstanceOf[js.Any])
    
    inline def setErrorSubTypeUndefined: Self = StObject.set(x, "errorSubType", js.undefined)
    
    inline def setErrorType(value: connect | Connect): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setType(value: typingsJapgolly.officeJsPreview.Excel.CellValueType.error | Error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
