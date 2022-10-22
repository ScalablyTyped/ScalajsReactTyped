package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.hyperformulaStrings.Comma
import typingsJapgolly.hyperformula.hyperformulaStrings.Dot
import typingsJapgolly.hyperformula.hyperformulaStrings.Semicolon
import typingsJapgolly.hyperformula.hyperformulaStrings.Verticalline
import typingsJapgolly.hyperformula.hyperformulaStrings.any
import typingsJapgolly.hyperformula.hyperformulaStrings.standard
import typingsJapgolly.hyperformula.typingsCellMod.TranslatableErrorType
import typingsJapgolly.hyperformula.typingsI18nMod.TranslationPackage
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserParserConfigMod {
  
  trait ParserConfig extends StObject {
    
    var arrayColumnSeparator: Comma | Semicolon
    
    var arrayRowSeparator: Semicolon | Verticalline
    
    var decimalSeparator: Dot | Comma
    
    var errorMapping: Record[String, TranslatableErrorType]
    
    var functionArgSeparator: String
    
    var ignoreWhiteSpace: standard | any
    
    var maxColumns: Double
    
    var maxRows: Double
    
    var translationPackage: TranslationPackage
  }
  object ParserConfig {
    
    inline def apply(
      arrayColumnSeparator: Comma | Semicolon,
      arrayRowSeparator: Semicolon | Verticalline,
      decimalSeparator: Dot | Comma,
      errorMapping: Record[String, TranslatableErrorType],
      functionArgSeparator: String,
      ignoreWhiteSpace: standard | any,
      maxColumns: Double,
      maxRows: Double,
      translationPackage: TranslationPackage
    ): ParserConfig = {
      val __obj = js.Dynamic.literal(arrayColumnSeparator = arrayColumnSeparator.asInstanceOf[js.Any], arrayRowSeparator = arrayRowSeparator.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], errorMapping = errorMapping.asInstanceOf[js.Any], functionArgSeparator = functionArgSeparator.asInstanceOf[js.Any], ignoreWhiteSpace = ignoreWhiteSpace.asInstanceOf[js.Any], maxColumns = maxColumns.asInstanceOf[js.Any], maxRows = maxRows.asInstanceOf[js.Any], translationPackage = translationPackage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParserConfig]
    }
    
    extension [Self <: ParserConfig](x: Self) {
      
      inline def setArrayColumnSeparator(value: Comma | Semicolon): Self = StObject.set(x, "arrayColumnSeparator", value.asInstanceOf[js.Any])
      
      inline def setArrayRowSeparator(value: Semicolon | Verticalline): Self = StObject.set(x, "arrayRowSeparator", value.asInstanceOf[js.Any])
      
      inline def setDecimalSeparator(value: Dot | Comma): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setErrorMapping(value: Record[String, TranslatableErrorType]): Self = StObject.set(x, "errorMapping", value.asInstanceOf[js.Any])
      
      inline def setFunctionArgSeparator(value: String): Self = StObject.set(x, "functionArgSeparator", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWhiteSpace(value: standard | any): Self = StObject.set(x, "ignoreWhiteSpace", value.asInstanceOf[js.Any])
      
      inline def setMaxColumns(value: Double): Self = StObject.set(x, "maxColumns", value.asInstanceOf[js.Any])
      
      inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      inline def setTranslationPackage(value: TranslationPackage): Self = StObject.set(x, "translationPackage", value.asInstanceOf[js.Any])
    }
  }
}
