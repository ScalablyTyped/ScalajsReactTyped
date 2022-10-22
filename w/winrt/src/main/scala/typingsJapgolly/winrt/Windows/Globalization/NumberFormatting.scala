package typingsJapgolly.winrt.Windows.Globalization

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NumberFormatting {
  
  trait CurrencyFormatter
    extends StObject
       with ICurrencyFormatter
  object CurrencyFormatter {
    
    inline def apply(
      currency: String,
      format: Double => String,
      formatDouble: Double => String,
      formatInt: Double => String,
      formatUInt: Double => String,
      fractionDigits: Double,
      geographicRegion: String,
      integerDigits: Double,
      isDecimalPointAlwaysDisplayed: Boolean,
      isGrouped: Boolean,
      languages: IVectorView[String],
      numeralSystem: String,
      parseDouble: String => Double,
      parseInt: String => Double,
      parseUInt: String => Double,
      resolvedGeographicRegion: String,
      resolvedLanguage: String
    ): CurrencyFormatter = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt), fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt), resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrencyFormatter]
    }
  }
  
  trait DecimalFormatter
    extends StObject
       with INumberFormatterOptions
       with INumberFormatter
       with INumberFormatter2
       with INumberParser
  object DecimalFormatter {
    
    inline def apply(
      format: Double => String,
      formatDouble: Double => String,
      formatInt: Double => String,
      formatUInt: Double => String,
      fractionDigits: Double,
      geographicRegion: String,
      integerDigits: Double,
      isDecimalPointAlwaysDisplayed: Boolean,
      isGrouped: Boolean,
      languages: IVectorView[String],
      numeralSystem: String,
      parseDouble: String => Double,
      parseInt: String => Double,
      parseUInt: String => Double,
      resolvedGeographicRegion: String,
      resolvedLanguage: String
    ): DecimalFormatter = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt), fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt), resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecimalFormatter]
    }
  }
  
  trait ICurrencyFormatter
    extends StObject
       with INumberFormatterOptions
       with INumberFormatter
       with INumberFormatter2
       with INumberParser {
    
    var currency: String
  }
  object ICurrencyFormatter {
    
    inline def apply(
      currency: String,
      format: Double => String,
      formatDouble: Double => String,
      formatInt: Double => String,
      formatUInt: Double => String,
      fractionDigits: Double,
      geographicRegion: String,
      integerDigits: Double,
      isDecimalPointAlwaysDisplayed: Boolean,
      isGrouped: Boolean,
      languages: IVectorView[String],
      numeralSystem: String,
      parseDouble: String => Double,
      parseInt: String => Double,
      parseUInt: String => Double,
      resolvedGeographicRegion: String,
      resolvedLanguage: String
    ): ICurrencyFormatter = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt), fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt), resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICurrencyFormatter]
    }
    
    extension [Self <: ICurrencyFormatter](x: Self) {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICurrencyFormatterFactory extends StObject {
    
    def createCurrencyFormatterCode(currencyCode: String): CurrencyFormatter
    
    def createCurrencyFormatterCodeContext(currencyCode: String, languages: IIterable[String], geographicRegion: String): CurrencyFormatter
  }
  object ICurrencyFormatterFactory {
    
    inline def apply(
      createCurrencyFormatterCode: String => CurrencyFormatter,
      createCurrencyFormatterCodeContext: (String, IIterable[String], String) => CurrencyFormatter
    ): ICurrencyFormatterFactory = {
      val __obj = js.Dynamic.literal(createCurrencyFormatterCode = js.Any.fromFunction1(createCurrencyFormatterCode), createCurrencyFormatterCodeContext = js.Any.fromFunction3(createCurrencyFormatterCodeContext))
      __obj.asInstanceOf[ICurrencyFormatterFactory]
    }
    
    extension [Self <: ICurrencyFormatterFactory](x: Self) {
      
      inline def setCreateCurrencyFormatterCode(value: String => CurrencyFormatter): Self = StObject.set(x, "createCurrencyFormatterCode", js.Any.fromFunction1(value))
      
      inline def setCreateCurrencyFormatterCodeContext(value: (String, IIterable[String], String) => CurrencyFormatter): Self = StObject.set(x, "createCurrencyFormatterCodeContext", js.Any.fromFunction3(value))
    }
  }
  
  trait IDecimalFormatterFactory extends StObject {
    
    def createDecimalFormatter(languages: IIterable[String], geographicRegion: String): DecimalFormatter
  }
  object IDecimalFormatterFactory {
    
    inline def apply(createDecimalFormatter: (IIterable[String], String) => DecimalFormatter): IDecimalFormatterFactory = {
      val __obj = js.Dynamic.literal(createDecimalFormatter = js.Any.fromFunction2(createDecimalFormatter))
      __obj.asInstanceOf[IDecimalFormatterFactory]
    }
    
    extension [Self <: IDecimalFormatterFactory](x: Self) {
      
      inline def setCreateDecimalFormatter(value: (IIterable[String], String) => DecimalFormatter): Self = StObject.set(x, "createDecimalFormatter", js.Any.fromFunction2(value))
    }
  }
  
  trait INumberFormatter extends StObject {
    
    def format(value: Double): String
  }
  object INumberFormatter {
    
    inline def apply(format: Double => String): INumberFormatter = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
      __obj.asInstanceOf[INumberFormatter]
    }
    
    extension [Self <: INumberFormatter](x: Self) {
      
      inline def setFormat(value: Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    }
  }
  
  trait INumberFormatter2 extends StObject {
    
    def formatDouble(value: Double): String
    
    def formatInt(value: Double): String
    
    def formatUInt(value: Double): String
  }
  object INumberFormatter2 {
    
    inline def apply(formatDouble: Double => String, formatInt: Double => String, formatUInt: Double => String): INumberFormatter2 = {
      val __obj = js.Dynamic.literal(formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt))
      __obj.asInstanceOf[INumberFormatter2]
    }
    
    extension [Self <: INumberFormatter2](x: Self) {
      
      inline def setFormatDouble(value: Double => String): Self = StObject.set(x, "formatDouble", js.Any.fromFunction1(value))
      
      inline def setFormatInt(value: Double => String): Self = StObject.set(x, "formatInt", js.Any.fromFunction1(value))
      
      inline def setFormatUInt(value: Double => String): Self = StObject.set(x, "formatUInt", js.Any.fromFunction1(value))
    }
  }
  
  trait INumberFormatterOptions extends StObject {
    
    var fractionDigits: Double
    
    var geographicRegion: String
    
    var integerDigits: Double
    
    var isDecimalPointAlwaysDisplayed: Boolean
    
    var isGrouped: Boolean
    
    var languages: IVectorView[String]
    
    var numeralSystem: String
    
    var resolvedGeographicRegion: String
    
    var resolvedLanguage: String
  }
  object INumberFormatterOptions {
    
    inline def apply(
      fractionDigits: Double,
      geographicRegion: String,
      integerDigits: Double,
      isDecimalPointAlwaysDisplayed: Boolean,
      isGrouped: Boolean,
      languages: IVectorView[String],
      numeralSystem: String,
      resolvedGeographicRegion: String,
      resolvedLanguage: String
    ): INumberFormatterOptions = {
      val __obj = js.Dynamic.literal(fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[INumberFormatterOptions]
    }
    
    extension [Self <: INumberFormatterOptions](x: Self) {
      
      inline def setFractionDigits(value: Double): Self = StObject.set(x, "fractionDigits", value.asInstanceOf[js.Any])
      
      inline def setGeographicRegion(value: String): Self = StObject.set(x, "geographicRegion", value.asInstanceOf[js.Any])
      
      inline def setIntegerDigits(value: Double): Self = StObject.set(x, "integerDigits", value.asInstanceOf[js.Any])
      
      inline def setIsDecimalPointAlwaysDisplayed(value: Boolean): Self = StObject.set(x, "isDecimalPointAlwaysDisplayed", value.asInstanceOf[js.Any])
      
      inline def setIsGrouped(value: Boolean): Self = StObject.set(x, "isGrouped", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: IVectorView[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setNumeralSystem(value: String): Self = StObject.set(x, "numeralSystem", value.asInstanceOf[js.Any])
      
      inline def setResolvedGeographicRegion(value: String): Self = StObject.set(x, "resolvedGeographicRegion", value.asInstanceOf[js.Any])
      
      inline def setResolvedLanguage(value: String): Self = StObject.set(x, "resolvedLanguage", value.asInstanceOf[js.Any])
    }
  }
  
  trait INumberParser extends StObject {
    
    def parseDouble(text: String): Double
    
    def parseInt(text: String): Double
    
    def parseUInt(text: String): Double
  }
  object INumberParser {
    
    inline def apply(parseDouble: String => Double, parseInt: String => Double, parseUInt: String => Double): INumberParser = {
      val __obj = js.Dynamic.literal(parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt))
      __obj.asInstanceOf[INumberParser]
    }
    
    extension [Self <: INumberParser](x: Self) {
      
      inline def setParseDouble(value: String => Double): Self = StObject.set(x, "parseDouble", js.Any.fromFunction1(value))
      
      inline def setParseInt(value: String => Double): Self = StObject.set(x, "parseInt", js.Any.fromFunction1(value))
      
      inline def setParseUInt(value: String => Double): Self = StObject.set(x, "parseUInt", js.Any.fromFunction1(value))
    }
  }
  
  trait IPercentFormatterFactory extends StObject {
    
    def createPercentFormatter(languages: IIterable[String], geographicRegion: String): PercentFormatter
  }
  object IPercentFormatterFactory {
    
    inline def apply(createPercentFormatter: (IIterable[String], String) => PercentFormatter): IPercentFormatterFactory = {
      val __obj = js.Dynamic.literal(createPercentFormatter = js.Any.fromFunction2(createPercentFormatter))
      __obj.asInstanceOf[IPercentFormatterFactory]
    }
    
    extension [Self <: IPercentFormatterFactory](x: Self) {
      
      inline def setCreatePercentFormatter(value: (IIterable[String], String) => PercentFormatter): Self = StObject.set(x, "createPercentFormatter", js.Any.fromFunction2(value))
    }
  }
  
  trait IPermilleFormatterFactory extends StObject {
    
    def createPermilleFormatter(languages: IIterable[String], geographicRegion: String): PermilleFormatter
  }
  object IPermilleFormatterFactory {
    
    inline def apply(createPermilleFormatter: (IIterable[String], String) => PermilleFormatter): IPermilleFormatterFactory = {
      val __obj = js.Dynamic.literal(createPermilleFormatter = js.Any.fromFunction2(createPermilleFormatter))
      __obj.asInstanceOf[IPermilleFormatterFactory]
    }
    
    extension [Self <: IPermilleFormatterFactory](x: Self) {
      
      inline def setCreatePermilleFormatter(value: (IIterable[String], String) => PermilleFormatter): Self = StObject.set(x, "createPermilleFormatter", js.Any.fromFunction2(value))
    }
  }
  
  trait PercentFormatter
    extends StObject
       with INumberFormatterOptions
       with INumberFormatter
       with INumberFormatter2
       with INumberParser
  object PercentFormatter {
    
    inline def apply(
      format: Double => String,
      formatDouble: Double => String,
      formatInt: Double => String,
      formatUInt: Double => String,
      fractionDigits: Double,
      geographicRegion: String,
      integerDigits: Double,
      isDecimalPointAlwaysDisplayed: Boolean,
      isGrouped: Boolean,
      languages: IVectorView[String],
      numeralSystem: String,
      parseDouble: String => Double,
      parseInt: String => Double,
      parseUInt: String => Double,
      resolvedGeographicRegion: String,
      resolvedLanguage: String
    ): PercentFormatter = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt), fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt), resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[PercentFormatter]
    }
  }
  
  trait PermilleFormatter
    extends StObject
       with INumberFormatterOptions
       with INumberFormatter
       with INumberFormatter2
       with INumberParser
  object PermilleFormatter {
    
    inline def apply(
      format: Double => String,
      formatDouble: Double => String,
      formatInt: Double => String,
      formatUInt: Double => String,
      fractionDigits: Double,
      geographicRegion: String,
      integerDigits: Double,
      isDecimalPointAlwaysDisplayed: Boolean,
      isGrouped: Boolean,
      languages: IVectorView[String],
      numeralSystem: String,
      parseDouble: String => Double,
      parseInt: String => Double,
      parseUInt: String => Double,
      resolvedGeographicRegion: String,
      resolvedLanguage: String
    ): PermilleFormatter = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt), fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt), resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermilleFormatter]
    }
  }
}
