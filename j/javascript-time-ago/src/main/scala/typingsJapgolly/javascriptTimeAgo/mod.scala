package typingsJapgolly.javascriptTimeAgo

import typingsJapgolly.javascriptTimeAgo.localeMod.DefaultFormats
import typingsJapgolly.javascriptTimeAgo.localeMod.Duration
import typingsJapgolly.javascriptTimeAgo.localeMod.Formats
import typingsJapgolly.javascriptTimeAgo.localeMod.Locale
import typingsJapgolly.javascriptTimeAgo.localeMod.RTFFormatter
import typingsJapgolly.javascriptTimeAgo.localeMod.TimeUnit
import typingsJapgolly.javascriptTimeAgo.styleMod.FormatStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("javascript-time-ago", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TimeAgo {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
  }
  @JSImport("javascript-time-ago", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def addDefaultLocale(localeData: Locale): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addDefaultLocale")(localeData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def addLocale(localeData: Locale): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLocale")(localeData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def getDefaultLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultLocale")().asInstanceOf[String]
  
  /* static member */
  inline def intlDateTimeFormatSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("intlDateTimeFormatSupported")().asInstanceOf[Boolean]
  
  /* static member */
  inline def intlDateTimeFormatSupportedLocale(locale: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("intlDateTimeFormatSupportedLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  /* static member */
  inline def locale(localeData: Locale): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(localeData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def setDefaultLocale(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait TimeAgo extends StObject {
    
    def format(input: js.Date): String = js.native
    def format(input: js.Date, style: String): String = js.native
    def format(input: js.Date, style: FormatStyle): String = js.native
    def format(input: Double): String = js.native
    def format(input: Double, style: String): String = js.native
    def format(input: Double, style: FormatStyle): String = js.native
    
    def formatNumber(number: Double): String = js.native
    
    def formatValue(value: js.Date, unit: TimeUnit, localeData: Duration): String = js.native
    def formatValue(value: Double, unit: TimeUnit, localeData: Duration): String = js.native
    
    def getFormatter(flavor: DefaultFormats): RTFFormatter = js.native
    
    def getLocaleData(): Duration = js.native
    def getLocaleData(format: Formats): Duration = js.native
    
    // Defaults to "long"
    def getRule(value: js.Date, unit: TimeUnit, localeData: Duration): String = js.native
    def getRule(value: Double, unit: TimeUnit, localeData: Duration): String = js.native
  }
}
