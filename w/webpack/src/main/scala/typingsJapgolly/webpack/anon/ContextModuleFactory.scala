package typingsJapgolly.webpack.anon

import typingsJapgolly.webpack.mod.NormalModuleFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextModuleFactory extends StObject {
  
  var contextModuleFactory: typingsJapgolly.webpack.mod.ContextModuleFactory
  
  var normalModuleFactory: NormalModuleFactory
}
object ContextModuleFactory {
  
  inline def apply(
    contextModuleFactory: typingsJapgolly.webpack.mod.ContextModuleFactory,
    normalModuleFactory: NormalModuleFactory
  ): ContextModuleFactory = {
    val __obj = js.Dynamic.literal(contextModuleFactory = contextModuleFactory.asInstanceOf[js.Any], normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextModuleFactory]
  }
  
  extension [Self <: ContextModuleFactory](x: Self) {
    
    inline def setContextModuleFactory(value: typingsJapgolly.webpack.mod.ContextModuleFactory): Self = StObject.set(x, "contextModuleFactory", value.asInstanceOf[js.Any])
    
    inline def setNormalModuleFactory(value: NormalModuleFactory): Self = StObject.set(x, "normalModuleFactory", value.asInstanceOf[js.Any])
  }
}
