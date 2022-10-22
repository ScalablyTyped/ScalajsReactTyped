package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.error
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.ignore
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.warning
import typingsJapgolly.angularDevkitBuildAngular.srcBabelPresetsApplicationMod.I18nPluginCreators
import typingsJapgolly.angularLocalize.mod.ɵParsedTranslation
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var locale: String
  
  var missingTranslationBehavior: js.UndefOr[error | warning | ignore] = js.undefined
  
  var pluginCreators: I18nPluginCreators
  
  var translation: js.UndefOr[Record[String, ɵParsedTranslation]] = js.undefined
  
  var translationFiles: js.UndefOr[js.Array[String]] = js.undefined
}
object Locale {
  
  inline def apply(locale: String, pluginCreators: I18nPluginCreators): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], pluginCreators = pluginCreators.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  extension [Self <: Locale](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMissingTranslationBehavior(value: error | warning | ignore): Self = StObject.set(x, "missingTranslationBehavior", value.asInstanceOf[js.Any])
    
    inline def setMissingTranslationBehaviorUndefined: Self = StObject.set(x, "missingTranslationBehavior", js.undefined)
    
    inline def setPluginCreators(value: I18nPluginCreators): Self = StObject.set(x, "pluginCreators", value.asInstanceOf[js.Any])
    
    inline def setTranslation(value: Record[String, ɵParsedTranslation]): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    inline def setTranslationFiles(value: js.Array[String]): Self = StObject.set(x, "translationFiles", value.asInstanceOf[js.Any])
    
    inline def setTranslationFilesUndefined: Self = StObject.set(x, "translationFiles", js.undefined)
    
    inline def setTranslationFilesVarargs(value: String*): Self = StObject.set(x, "translationFiles", js.Array(value*))
    
    inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
  }
}
