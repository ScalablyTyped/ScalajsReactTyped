package typingsJapgolly.javascriptTimeAgo

import typingsJapgolly.javascriptTimeAgo.gradationMod.Gradation
import typingsJapgolly.javascriptTimeAgo.gradationMod.Unit
import typingsJapgolly.javascriptTimeAgo.localeMod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleMod {
  
  type CustomFormatter = js.Function1[/* options */ CustomFormatterOptions, js.UndefOr[String]]
  
  trait CustomFormatterOptions extends StObject {
    
    var date: js.UndefOr[js.Date] = js.undefined
    
    var elapsed: Double
    
    var locale: Locale
    
    var now: Double
    
    var time: Double
  }
  object CustomFormatterOptions {
    
    inline def apply(elapsed: Double, locale: Locale, now: Double, time: Double): CustomFormatterOptions = {
      val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomFormatterOptions]
    }
    
    extension [Self <: CustomFormatterOptions](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setNow(value: Double): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.tiny
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.narrow
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.short
    - typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.long
  */
  trait Flavour extends StObject
  object Flavour {
    
    inline def long: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.long = "long".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.long]
    
    inline def narrow: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.narrow = "narrow".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.narrow]
    
    inline def short: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.short = "short".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.short]
    
    inline def `short-time`: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time` = "short-time".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`]
    
    inline def tiny: typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.tiny]
  }
  
  trait FormatStyle extends StObject {
    
    var custom: js.UndefOr[CustomFormatter] = js.undefined
    
    var flavour: js.UndefOr[js.Array[Flavour]] = js.undefined
    
    var format: js.UndefOr[js.Function2[/* date */ js.Date | Double, /* locale */ Locale, String]] = js.undefined
    
    var gradation: js.UndefOr[js.Array[Gradation]] = js.undefined
    
    var units: js.UndefOr[Unit] = js.undefined
  }
  object FormatStyle {
    
    inline def apply(): FormatStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatStyle]
    }
    
    extension [Self <: FormatStyle](x: Self) {
      
      inline def setCustom(value: /* options */ CustomFormatterOptions => js.UndefOr[String]): Self = StObject.set(x, "custom", js.Any.fromFunction1(value))
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setFlavour(value: js.Array[Flavour]): Self = StObject.set(x, "flavour", value.asInstanceOf[js.Any])
      
      inline def setFlavourUndefined: Self = StObject.set(x, "flavour", js.undefined)
      
      inline def setFlavourVarargs(value: Flavour*): Self = StObject.set(x, "flavour", js.Array(value*))
      
      inline def setFormat(value: (/* date */ js.Date | Double, /* locale */ Locale) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGradation(value: js.Array[Gradation]): Self = StObject.set(x, "gradation", value.asInstanceOf[js.Any])
      
      inline def setGradationUndefined: Self = StObject.set(x, "gradation", js.undefined)
      
      inline def setGradationVarargs(value: Gradation*): Self = StObject.set(x, "gradation", js.Array(value*))
      
      inline def setUnits(value: Unit): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
}
