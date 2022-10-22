package typingsJapgolly.webpack.anon

import typingsJapgolly.webpack.mod.ModuleFactory
import typingsJapgolly.webpack.mod.ModuleProfile
import typingsJapgolly.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webpack.webpack.FactorizeModuleOptions & {  factoryResult :false | undefined} */
trait FactorizeModuleOptionsfac extends StObject {
  
  var context: js.UndefOr[String] = js.undefined
  
  var contextInfo: js.UndefOr[PartialModuleFactoryCreat] = js.undefined
  
  var currentProfile: ModuleProfile
  
  var dependencies: js.Array[typingsJapgolly.webpack.mod.Dependency]
  
  var factory: ModuleFactory
  
  /**
  	 * return full ModuleFactoryResult instead of only module
  	 */
  var factoryResult: js.UndefOr[Boolean] & js.UndefOr[`false`]
  
  var originModule: Null | typingsJapgolly.webpack.mod.Module
}
object FactorizeModuleOptionsfac {
  
  inline def apply(
    currentProfile: ModuleProfile,
    dependencies: js.Array[typingsJapgolly.webpack.mod.Dependency],
    factory: ModuleFactory,
    factoryResult: js.UndefOr[Boolean] & js.UndefOr[`false`]
  ): FactorizeModuleOptionsfac = {
    val __obj = js.Dynamic.literal(currentProfile = currentProfile.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], factoryResult = factoryResult.asInstanceOf[js.Any], originModule = null)
    __obj.asInstanceOf[FactorizeModuleOptionsfac]
  }
  
  extension [Self <: FactorizeModuleOptionsfac](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextInfo(value: PartialModuleFactoryCreat): Self = StObject.set(x, "contextInfo", value.asInstanceOf[js.Any])
    
    inline def setContextInfoUndefined: Self = StObject.set(x, "contextInfo", js.undefined)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCurrentProfile(value: ModuleProfile): Self = StObject.set(x, "currentProfile", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: js.Array[typingsJapgolly.webpack.mod.Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: typingsJapgolly.webpack.mod.Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setFactory(value: ModuleFactory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setFactoryResult(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "factoryResult", value.asInstanceOf[js.Any])
    
    inline def setOriginModule(value: typingsJapgolly.webpack.mod.Module): Self = StObject.set(x, "originModule", value.asInstanceOf[js.Any])
    
    inline def setOriginModuleNull: Self = StObject.set(x, "originModule", null)
  }
}
