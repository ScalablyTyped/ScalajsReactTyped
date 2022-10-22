package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCsvClassifierRequest extends StObject {
  
  /**
    * Enables the processing of files that contain only one column.
    */
  var AllowSingleColumn: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Indicates whether the CSV file contains a header.
    */
  var ContainsHeader: js.UndefOr[CsvHeaderOption] = js.undefined
  
  /**
    * A custom symbol to denote what separates each column entry in the row.
    */
  var Delimiter: js.UndefOr[CsvColumnDelimiter] = js.undefined
  
  /**
    * Specifies not to trim values before identifying the type of column values. The default value is true.
    */
  var DisableValueTrimming: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A list of strings representing column names.
    */
  var Header: js.UndefOr[CsvHeader] = js.undefined
  
  /**
    * The name of the classifier.
    */
  var Name: NameString
  
  /**
    * A custom symbol to denote what combines content into a single column value. Must be different from the column delimiter.
    */
  var QuoteSymbol: js.UndefOr[CsvQuoteSymbol] = js.undefined
}
object CreateCsvClassifierRequest {
  
  inline def apply(Name: NameString): CreateCsvClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCsvClassifierRequest]
  }
  
  extension [Self <: CreateCsvClassifierRequest](x: Self) {
    
    inline def setAllowSingleColumn(value: NullableBoolean): Self = StObject.set(x, "AllowSingleColumn", value.asInstanceOf[js.Any])
    
    inline def setAllowSingleColumnUndefined: Self = StObject.set(x, "AllowSingleColumn", js.undefined)
    
    inline def setContainsHeader(value: CsvHeaderOption): Self = StObject.set(x, "ContainsHeader", value.asInstanceOf[js.Any])
    
    inline def setContainsHeaderUndefined: Self = StObject.set(x, "ContainsHeader", js.undefined)
    
    inline def setDelimiter(value: CsvColumnDelimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setDisableValueTrimming(value: NullableBoolean): Self = StObject.set(x, "DisableValueTrimming", value.asInstanceOf[js.Any])
    
    inline def setDisableValueTrimmingUndefined: Self = StObject.set(x, "DisableValueTrimming", js.undefined)
    
    inline def setHeader(value: CsvHeader): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    inline def setHeaderVarargs(value: NameString*): Self = StObject.set(x, "Header", js.Array(value*))
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuoteSymbol(value: CsvQuoteSymbol): Self = StObject.set(x, "QuoteSymbol", value.asInstanceOf[js.Any])
    
    inline def setQuoteSymbolUndefined: Self = StObject.set(x, "QuoteSymbol", js.undefined)
  }
}
