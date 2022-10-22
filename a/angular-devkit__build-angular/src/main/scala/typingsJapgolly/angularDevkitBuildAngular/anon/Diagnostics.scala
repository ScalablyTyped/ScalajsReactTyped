package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularLocalize.mod.ɵParsedTranslation
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diagnostics extends StObject {
  
  var diagnostics: typingsJapgolly.angularLocalize.toolsMod.Diagnostics
  
  var format: String
  
  var integrity: String
  
  var locale: js.UndefOr[String] = js.undefined
  
  var translations: Record[String, ɵParsedTranslation]
}
object Diagnostics {
  
  inline def apply(
    diagnostics: typingsJapgolly.angularLocalize.toolsMod.Diagnostics,
    format: String,
    integrity: String,
    translations: Record[String, ɵParsedTranslation]
  ): Diagnostics = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostics]
  }
  
  extension [Self <: Diagnostics](x: Self) {
    
    inline def setDiagnostics(value: typingsJapgolly.angularLocalize.toolsMod.Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setTranslations(value: Record[String, ɵParsedTranslation]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
  }
}
