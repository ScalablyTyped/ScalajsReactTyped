package typingsJapgolly.formatjsIntlListformat

import typingsJapgolly.formatjsIntlListformat.formatjsIntlListformatStrings.`best fit`
import typingsJapgolly.formatjsIntlListformat.formatjsIntlListformatStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<@formatjs/intl-listformat.@formatjs/intl-listformat/lib.IntlListFormatOptions, 'localeMatcher'> */
  trait PickIntlListFormatOptions extends StObject {
    
    var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
  }
  object PickIntlListFormatOptions {
    
    inline def apply(): PickIntlListFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickIntlListFormatOptions]
    }
    
    extension [Self <: PickIntlListFormatOptions](x: Self) {
      
      inline def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    }
  }
}
