package typingsJapgolly.serverless.anon

import typingsJapgolly.serverless.classesPluginMod.ConfigurationVariablesSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDisabledAtPrepopulation extends StObject {
  
  var isDisabledAtPrepopulation: js.UndefOr[Boolean] = js.undefined
  
  def resolve(variableSource: Any): js.Promise[Any]
  @JSName("resolve")
  var resolve_Original: ConfigurationVariablesSource
  
  var serviceName: js.UndefOr[String] = js.undefined
}
object IsDisabledAtPrepopulation {
  
  inline def apply(resolve: /* variableSource */ Any => js.Promise[Any]): IsDisabledAtPrepopulation = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[IsDisabledAtPrepopulation]
  }
  
  extension [Self <: IsDisabledAtPrepopulation](x: Self) {
    
    inline def setIsDisabledAtPrepopulation(value: Boolean): Self = StObject.set(x, "isDisabledAtPrepopulation", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledAtPrepopulationUndefined: Self = StObject.set(x, "isDisabledAtPrepopulation", js.undefined)
    
    inline def setResolve(value: /* variableSource */ Any => js.Promise[Any]): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
