package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.anon.AllowAutomaticSemicolonInsertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseOptions extends StObject {
  
  /* private */ var _allowAutomaticSemicolonInsertion: Any
  
  /* private */ var _languageVersion: Any
  
  def allowAutomaticSemicolonInsertion(): Boolean
  
  def languageVersion(): LanguageVersion
  
  def toJSON(key: Any): AllowAutomaticSemicolonInsertion
}
object ParseOptions {
  
  inline def apply(
    _allowAutomaticSemicolonInsertion: Any,
    _languageVersion: Any,
    allowAutomaticSemicolonInsertion: CallbackTo[Boolean],
    languageVersion: CallbackTo[LanguageVersion],
    toJSON: Any => AllowAutomaticSemicolonInsertion
  ): ParseOptions = {
    val __obj = js.Dynamic.literal(_allowAutomaticSemicolonInsertion = _allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], _languageVersion = _languageVersion.asInstanceOf[js.Any], allowAutomaticSemicolonInsertion = allowAutomaticSemicolonInsertion.toJsFn, languageVersion = languageVersion.toJsFn, toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[ParseOptions]
  }
  
  extension [Self <: ParseOptions](x: Self) {
    
    inline def setAllowAutomaticSemicolonInsertion(value: CallbackTo[Boolean]): Self = StObject.set(x, "allowAutomaticSemicolonInsertion", value.toJsFn)
    
    inline def setLanguageVersion(value: CallbackTo[LanguageVersion]): Self = StObject.set(x, "languageVersion", value.toJsFn)
    
    inline def setToJSON(value: Any => AllowAutomaticSemicolonInsertion): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    
    inline def set_allowAutomaticSemicolonInsertion(value: Any): Self = StObject.set(x, "_allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
    
    inline def set_languageVersion(value: Any): Self = StObject.set(x, "_languageVersion", value.asInstanceOf[js.Any])
  }
}
