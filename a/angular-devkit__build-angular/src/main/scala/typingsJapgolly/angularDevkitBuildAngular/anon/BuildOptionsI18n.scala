package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.Schema
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsI18nOptionsMod.I18nOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOptionsI18n extends StObject {
  
  var buildOptions: Schema
  
  var i18n: I18nOptions
}
object BuildOptionsI18n {
  
  inline def apply(buildOptions: Schema, i18n: I18nOptions): BuildOptionsI18n = {
    val __obj = js.Dynamic.literal(buildOptions = buildOptions.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptionsI18n]
  }
  
  extension [Self <: BuildOptionsI18n](x: Self) {
    
    inline def setBuildOptions(value: Schema): Self = StObject.set(x, "buildOptions", value.asInstanceOf[js.Any])
    
    inline def setI18n(value: I18nOptions): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
  }
}
