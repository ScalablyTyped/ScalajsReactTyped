package typingsJapgolly.jupyterlabTranslation

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabTranslation.libTokensMod.ITranslator
import typingsJapgolly.jupyterlabTranslation.libTokensMod.TranslationBundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseMod {
  
  @JSImport("@jupyterlab/translation/lib/base", "nullTranslator")
  @js.native
  val nullTranslator: NullTranslator_ = js.native
  
  /**
    * A translator that loads a dummy language bundle that returns the same input
    * strings.
    */
  trait NullTranslator_
    extends StObject
       with ITranslator {
    
    /* private */ var _languageBundle: Any
    
    def locale(): String
  }
  object NullTranslator_ {
    
    inline def apply(_languageBundle: Any, load: String => TranslationBundle, locale: CallbackTo[String]): NullTranslator_ = {
      val __obj = js.Dynamic.literal(_languageBundle = _languageBundle.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), locale = locale.toJsFn)
      __obj.asInstanceOf[NullTranslator_]
    }
    
    extension [Self <: NullTranslator_](x: Self) {
      
      inline def setLocale(value: CallbackTo[String]): Self = StObject.set(x, "locale", value.toJsFn)
      
      inline def set_languageBundle(value: Any): Self = StObject.set(x, "_languageBundle", value.asInstanceOf[js.Any])
    }
  }
}
