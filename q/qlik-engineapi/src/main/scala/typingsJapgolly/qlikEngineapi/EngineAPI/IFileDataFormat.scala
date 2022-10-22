package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FileDataFormat...
  */
trait IFileDataFormat extends StObject {
  
  /**
    * Character set used in the file.
    */
  var qCodePage: Double
  
  /**
    * String that marks the beginning of the comment line.
    * Example: # or //
    * The engine ignores the commented lines during the data load.
    * This property is only used for delimited files.
    */
  var qComment: String
  
  /**
    * Information about the delimiter.
    * This property is used for delimited files.
    */
  var qDelimiter: IDelimiterInfo
  
  /**
    * Positions of the field breaks in the table.
    * This property is used for fixed record data files.
    */
  var qFixedWidthDelimiters: String
  
  /**
    * Size of the header.
    * Example: If the header size is 2, the first two rows in the file are considered as header and not as data.
    * The header can contain the field names.
    */
  var qHeaderSize: Double
  
  /**
    * Is set to true, the end-of-file character is not taken into account during reload.
    * This property is used for delimited files and fixed record data files.
    */
  var qIgnoreEOF: Boolean
  
  /**
    * One of:
    *
    * - embedded labels (field names are present in the file)
    * - no labels
    * - explicit labels (for DIFfiles)
    */
  var qLabel: String
  
  /**
    * One of:
    *
    * - None (no quotes)
    * - MSQ (Modern Style Quoting)
    * - Standard (quotes " " or ' ' can be used, but only if they
    * are the first and last non blank characters of a field value.)
    * This property is used for delimited files.
    */
  var qQuote: String
  
  /**
    * Record length.
    * Each record (row of data) contains a number of columns with a fixed field size.
    * This property is used for fixed record data files.
    */
  var qRecordSize: Double
  
  /**
    * Number of spaces that one tab character represents in the table file.
    * This property is used for fixed record data files.
    */
  var qTabSize: Double
  
  /**
    * Type of the file.
    */
  var qType: FileDataFormatType
}
object IFileDataFormat {
  
  inline def apply(
    qCodePage: Double,
    qComment: String,
    qDelimiter: IDelimiterInfo,
    qFixedWidthDelimiters: String,
    qHeaderSize: Double,
    qIgnoreEOF: Boolean,
    qLabel: String,
    qQuote: String,
    qRecordSize: Double,
    qTabSize: Double,
    qType: FileDataFormatType
  ): IFileDataFormat = {
    val __obj = js.Dynamic.literal(qCodePage = qCodePage.asInstanceOf[js.Any], qComment = qComment.asInstanceOf[js.Any], qDelimiter = qDelimiter.asInstanceOf[js.Any], qFixedWidthDelimiters = qFixedWidthDelimiters.asInstanceOf[js.Any], qHeaderSize = qHeaderSize.asInstanceOf[js.Any], qIgnoreEOF = qIgnoreEOF.asInstanceOf[js.Any], qLabel = qLabel.asInstanceOf[js.Any], qQuote = qQuote.asInstanceOf[js.Any], qRecordSize = qRecordSize.asInstanceOf[js.Any], qTabSize = qTabSize.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDataFormat]
  }
  
  extension [Self <: IFileDataFormat](x: Self) {
    
    inline def setQCodePage(value: Double): Self = StObject.set(x, "qCodePage", value.asInstanceOf[js.Any])
    
    inline def setQComment(value: String): Self = StObject.set(x, "qComment", value.asInstanceOf[js.Any])
    
    inline def setQDelimiter(value: IDelimiterInfo): Self = StObject.set(x, "qDelimiter", value.asInstanceOf[js.Any])
    
    inline def setQFixedWidthDelimiters(value: String): Self = StObject.set(x, "qFixedWidthDelimiters", value.asInstanceOf[js.Any])
    
    inline def setQHeaderSize(value: Double): Self = StObject.set(x, "qHeaderSize", value.asInstanceOf[js.Any])
    
    inline def setQIgnoreEOF(value: Boolean): Self = StObject.set(x, "qIgnoreEOF", value.asInstanceOf[js.Any])
    
    inline def setQLabel(value: String): Self = StObject.set(x, "qLabel", value.asInstanceOf[js.Any])
    
    inline def setQQuote(value: String): Self = StObject.set(x, "qQuote", value.asInstanceOf[js.Any])
    
    inline def setQRecordSize(value: Double): Self = StObject.set(x, "qRecordSize", value.asInstanceOf[js.Any])
    
    inline def setQTabSize(value: Double): Self = StObject.set(x, "qTabSize", value.asInstanceOf[js.Any])
    
    inline def setQType(value: FileDataFormatType): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
