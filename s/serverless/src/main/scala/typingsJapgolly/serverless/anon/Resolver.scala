package typingsJapgolly.serverless.anon

import typingsJapgolly.serverless.classesPluginMod.VariableResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolver extends StObject {
  
  var isDisabledAtPrepopulation: js.UndefOr[Boolean] = js.undefined
  
  def resolver(variableSource: String): js.Promise[Any]
  @JSName("resolver")
  var resolver_Original: VariableResolver
  
  var serviceName: js.UndefOr[String] = js.undefined
}
object Resolver {
  
  inline def apply(resolver: /* variableSource */ String => js.Promise[Any]): Resolver = {
    val __obj = js.Dynamic.literal(resolver = js.Any.fromFunction1(resolver))
    __obj.asInstanceOf[Resolver]
  }
  
  extension [Self <: Resolver](x: Self) {
    
    inline def setIsDisabledAtPrepopulation(value: Boolean): Self = StObject.set(x, "isDisabledAtPrepopulation", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledAtPrepopulationUndefined: Self = StObject.set(x, "isDisabledAtPrepopulation", js.undefined)
    
    inline def setResolver(value: /* variableSource */ String => js.Promise[Any]): Self = StObject.set(x, "resolver", js.Any.fromFunction1(value))
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
