package typingsJapgolly.javascriptTimeAgo

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`es-AR`
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typingsJapgolly.javascriptTimeAgo.localeMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeEsARMod extends Shortcut {
  
  @JSImport("javascript-time-ago/locale/es-AR", JSImport.Namespace)
  @js.native
  val ^ : Locale = js.native
  
  trait Locale extends StObject {
    
    var locale: `es-AR`
    
    var narrow: Duration
    
    def quantify(n: Double): one | two | few | other
    
    var short: Duration
  }
  object Locale {
    
    inline def apply(narrow: Duration, quantify: Double => one | two | few | other, short: Duration): Locale = {
      val __obj = js.Dynamic.literal(locale = "es-AR", narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setLocale(value: `es-AR`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setNarrow(value: Duration): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      inline def setQuantify(value: Double => one | two | few | other): Self = StObject.set(x, "quantify", js.Any.fromFunction1(value))
      
      inline def setShort(value: Duration): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Locale
  
  /* This means you don't have to write `^`, but can instead just say `localeEsARMod.foo` */
  override def _to: Locale = ^
}
