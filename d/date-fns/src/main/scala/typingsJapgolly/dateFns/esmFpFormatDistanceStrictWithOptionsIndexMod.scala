package typingsJapgolly.dateFns

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dateFns.anon.LocaleRoundingMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFpFormatDistanceStrictWithOptionsIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/formatDistanceStrictWithOptions/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn3[LocaleRoundingMethod, js.Date | Double, js.Date | Double, String] = js.native
    
    type _To = CurriedFn3[LocaleRoundingMethod, js.Date | Double, js.Date | Double, String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn3[LocaleRoundingMethod, js.Date | Double, js.Date | Double, String] = ^
  }
}
