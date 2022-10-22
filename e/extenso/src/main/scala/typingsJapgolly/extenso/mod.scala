package typingsJapgolly.extenso

import typingsJapgolly.extenso.anon.Decimal
import typingsJapgolly.extenso.anon.Type
import typingsJapgolly.extenso.extensoStrings.br
import typingsJapgolly.extenso.extensoStrings.currency
import typingsJapgolly.extenso.extensoStrings.formal
import typingsJapgolly.extenso.extensoStrings.informal
import typingsJapgolly.extenso.extensoStrings.long
import typingsJapgolly.extenso.extensoStrings.number
import typingsJapgolly.extenso.extensoStrings.pt
import typingsJapgolly.extenso.extensoStrings.short
import typingsJapgolly.extenso.mod.Extenso.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(number: String): String = ^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(number: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(number: Double): String = ^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(number: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("extenso", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Extenso {
    
    trait BaseOptions extends StObject {
      
      var locale: js.UndefOr[br | pt] = js.undefined
      
      var negative: js.UndefOr[formal | informal] = js.undefined
      
      var scale: js.UndefOr[short | long] = js.undefined
    }
    object BaseOptions {
      
      inline def apply(): BaseOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseOptions]
      }
      
      extension [Self <: BaseOptions](x: Self) {
        
        inline def setLocale(value: br | pt): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        inline def setNegative(value: formal | informal): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
        
        inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
        
        inline def setScale(value: short | long): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
        
        inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      }
    }
    
    trait CurrencyModeOptions
      extends StObject
         with BaseOptions
         with Options {
      
      var currency: js.UndefOr[Type] = js.undefined
      
      var mode: currency
    }
    object CurrencyModeOptions {
      
      inline def apply(): CurrencyModeOptions = {
        val __obj = js.Dynamic.literal(mode = "currency")
        __obj.asInstanceOf[CurrencyModeOptions]
      }
      
      extension [Self <: CurrencyModeOptions](x: Self) {
        
        inline def setCurrency(value: Type): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setMode(value: currency): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      }
    }
    
    trait NumberModeOptions
      extends StObject
         with BaseOptions
         with Options {
      
      var mode: js.UndefOr[number] = js.undefined
      
      var number: js.UndefOr[Decimal] = js.undefined
    }
    object NumberModeOptions {
      
      inline def apply(): NumberModeOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NumberModeOptions]
      }
      
      extension [Self <: NumberModeOptions](x: Self) {
        
        inline def setMode(value: number): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setNumber(value: Decimal): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
        
        inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.extenso.mod.Extenso.NumberModeOptions
      - typingsJapgolly.extenso.mod.Extenso.CurrencyModeOptions
    */
    trait Options extends StObject
    object Options {
      
      inline def CurrencyModeOptions(): typingsJapgolly.extenso.mod.Extenso.CurrencyModeOptions = {
        val __obj = js.Dynamic.literal(mode = "currency")
        __obj.asInstanceOf[typingsJapgolly.extenso.mod.Extenso.CurrencyModeOptions]
      }
      
      inline def NumberModeOptions(): typingsJapgolly.extenso.mod.Extenso.NumberModeOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.extenso.mod.Extenso.NumberModeOptions]
      }
    }
  }
}
