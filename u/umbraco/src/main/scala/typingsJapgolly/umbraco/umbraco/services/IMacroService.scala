package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.macroService
  *
  *
  * @description
  * A service to return macro information such as generating syntax to insert a macro into an editor
  */
trait IMacroService extends StObject {
  
  /**
    * @ngdoc function
    * @name umbraco.services.macroService#generateWebFormsSyntax
    * @methodOf umbraco.services.macroService
    * @function
    *
    * @description
    * generates the syntax for inserting a macro into a rich text editor - this is the very old umbraco style syntax
    *
    * @param {object} args an object containing the macro alias and it's parameter values
    */
  def generateMacroSyntax(args: Any*): Unit
  
  /**
    * @ngdoc function
    * @name umbraco.services.macroService#generateMvcSyntax
    * @methodOf umbraco.services.macroService
    * @function
    *
    * @description
    * generates the syntax for inserting a macro into an mvc template
    *
    * @param {object} args an object containing the macro alias and it's parameter values
    */
  def generateMvcSyntax(args: Any*): Unit
  
  /**
    * @ngdoc function
    * @name umbraco.services.macroService#generateWebFormsSyntax
    * @methodOf umbraco.services.macroService
    * @function
    *
    * @description
    * generates the syntax for inserting a macro into a webforms templates
    *
    * @param {object} args an object containing the macro alias and it's parameter values
    */
  def generateWebFormsSyntax(args: Any*): Unit
}
object IMacroService {
  
  inline def apply(
    generateMacroSyntax: /* repeated */ Any => Callback,
    generateMvcSyntax: /* repeated */ Any => Callback,
    generateWebFormsSyntax: /* repeated */ Any => Callback
  ): IMacroService = {
    val __obj = js.Dynamic.literal(generateMacroSyntax = js.Any.fromFunction1((t0: /* repeated */ Any) => generateMacroSyntax(t0).runNow()), generateMvcSyntax = js.Any.fromFunction1((t0: /* repeated */ Any) => generateMvcSyntax(t0).runNow()), generateWebFormsSyntax = js.Any.fromFunction1((t0: /* repeated */ Any) => generateWebFormsSyntax(t0).runNow()))
    __obj.asInstanceOf[IMacroService]
  }
  
  extension [Self <: IMacroService](x: Self) {
    
    inline def setGenerateMacroSyntax(value: /* repeated */ Any => Callback): Self = StObject.set(x, "generateMacroSyntax", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setGenerateMvcSyntax(value: /* repeated */ Any => Callback): Self = StObject.set(x, "generateMvcSyntax", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setGenerateWebFormsSyntax(value: /* repeated */ Any => Callback): Self = StObject.set(x, "generateWebFormsSyntax", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
