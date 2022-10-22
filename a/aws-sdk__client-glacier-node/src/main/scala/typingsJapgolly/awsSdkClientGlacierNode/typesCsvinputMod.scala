package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.IGNORE
import typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.NONE
import typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.USE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCsvinputMod {
  
  trait CSVInput extends StObject {
    
    /**
      * <p>A single character used to indicate that a row should be ignored when the character is present at the start of that row.</p>
      */
    var Comments: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A value used to separate individual fields from each other within a record.</p>
      */
    var FieldDelimiter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and <code>Use</code>.</p>
      */
    var FileHeaderInfo: js.UndefOr[USE | IGNORE | NONE | String] = js.undefined
    
    /**
      * <p>A value used as an escape character where the field delimiter is part of the value.</p>
      */
    var QuoteCharacter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A single character used for escaping the quotation-mark character inside an already escaped value.</p>
      */
    var QuoteEscapeCharacter: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A value used to separate individual records from each other.</p>
      */
    var RecordDelimiter: js.UndefOr[String] = js.undefined
  }
  object CSVInput {
    
    inline def apply(): CSVInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSVInput]
    }
    
    extension [Self <: CSVInput](x: Self) {
      
      inline def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
      
      inline def setFieldDelimiter(value: String): Self = StObject.set(x, "FieldDelimiter", value.asInstanceOf[js.Any])
      
      inline def setFieldDelimiterUndefined: Self = StObject.set(x, "FieldDelimiter", js.undefined)
      
      inline def setFileHeaderInfo(value: USE | IGNORE | NONE | String): Self = StObject.set(x, "FileHeaderInfo", value.asInstanceOf[js.Any])
      
      inline def setFileHeaderInfoUndefined: Self = StObject.set(x, "FileHeaderInfo", js.undefined)
      
      inline def setQuoteCharacter(value: String): Self = StObject.set(x, "QuoteCharacter", value.asInstanceOf[js.Any])
      
      inline def setQuoteCharacterUndefined: Self = StObject.set(x, "QuoteCharacter", js.undefined)
      
      inline def setQuoteEscapeCharacter(value: String): Self = StObject.set(x, "QuoteEscapeCharacter", value.asInstanceOf[js.Any])
      
      inline def setQuoteEscapeCharacterUndefined: Self = StObject.set(x, "QuoteEscapeCharacter", js.undefined)
      
      inline def setRecordDelimiter(value: String): Self = StObject.set(x, "RecordDelimiter", value.asInstanceOf[js.Any])
      
      inline def setRecordDelimiterUndefined: Self = StObject.set(x, "RecordDelimiter", js.undefined)
    }
  }
  
  type UnmarshalledCSVInput = CSVInput
}
