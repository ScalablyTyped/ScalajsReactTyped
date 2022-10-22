package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Schema
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsI18nOptionsMod.I18nOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOptions extends StObject {
  
  var buildOptions: Schema
  
  var i18n: I18nOptions
}
object BuildOptions {
  
  inline def apply(buildOptions: Schema, i18n: I18nOptions): BuildOptions = {
    val __obj = js.Dynamic.literal(buildOptions = buildOptions.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptions]
  }
  
  extension [Self <: BuildOptions](x: Self) {
    
    inline def setBuildOptions(value: Schema): Self = StObject.set(x, "buildOptions", value.asInstanceOf[js.Any])
    
    inline def setI18n(value: I18nOptions): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
  }
}
