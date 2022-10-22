package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitBuildAngular.srcUtilsI18nOptionsMod.I18nOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18n extends StObject {
  
  var i18n: I18nOptions
}
object I18n {
  
  inline def apply(i18n: I18nOptions): I18n = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18n]
  }
  
  extension [Self <: I18n](x: Self) {
    
    inline def setI18n(value: I18nOptions): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
  }
}
