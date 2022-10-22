package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitBuildAngular.srcUtilsI18nOptionsMod.I18nOptions
import typingsJapgolly.typescript.mod.ScriptTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSourceRoot extends StObject {
  
  var config: typingsJapgolly.webpack.mod.Configuration
  
  var i18n: I18nOptions
  
  var projectRoot: String
  
  var projectSourceRoot: js.UndefOr[String] = js.undefined
  
  var target: ScriptTarget
}
object ProjectSourceRoot {
  
  inline def apply(
    config: typingsJapgolly.webpack.mod.Configuration,
    i18n: I18nOptions,
    projectRoot: String,
    target: ScriptTarget
  ): ProjectSourceRoot = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSourceRoot]
  }
  
  extension [Self <: ProjectSourceRoot](x: Self) {
    
    inline def setConfig(value: typingsJapgolly.webpack.mod.Configuration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setI18n(value: I18nOptions): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setProjectSourceRoot(value: String): Self = StObject.set(x, "projectSourceRoot", value.asInstanceOf[js.Any])
    
    inline def setProjectSourceRootUndefined: Self = StObject.set(x, "projectSourceRoot", js.undefined)
    
    inline def setTarget(value: ScriptTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
