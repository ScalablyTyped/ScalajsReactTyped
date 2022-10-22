package typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod

import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.Middleware
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiddlewareCustomizationDefinition
  extends StObject
     with CustomizationDefinition {
  
  /**
    * An expression that should evaluate to a boolean that will determine if
    * the middleware is injected into the stack. This will be evaluated after
    * all configuration has been resolved; the configuration can be
    * dereferenced as `this.config`.
    */
  var conditionExpression: js.UndefOr[String] = js.undefined
  
  /**
    * Any configuration necessary for this middleware to be resolved.
    */
  var configuration: js.UndefOr[ConfigurationDefinition] = js.undefined
  
  /**
    * An expression that resolves to the middleware to inject.
    */
  var expression: String
  
  /**
    * Packages that must be imported to use this middleware.
    * Packages will be imported using the `import * as ${snake_case_package_name} from 'package-name';`
    * syntax.
    */
  var imports: js.UndefOr[js.Array[Import]] = js.undefined
  
  /**
    * The priority within the specified step with which the middleware should
    * be executed.
    */
  var priority: Double
  
  /**
    * The step in which to inject the middleware.
    */
  var step: Step
  
  /**
    * An expression that resolves to a set of tags to apply to this middleware.
    */
  var tags: js.UndefOr[String] = js.undefined
  
  var `type`: Middleware
}
object MiddlewareCustomizationDefinition {
  
  inline def apply(expression: String, priority: Double, step: Step): MiddlewareCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Middleware")
    __obj.asInstanceOf[MiddlewareCustomizationDefinition]
  }
  
  extension [Self <: MiddlewareCustomizationDefinition](x: Self) {
    
    inline def setConditionExpression(value: String): Self = StObject.set(x, "conditionExpression", value.asInstanceOf[js.Any])
    
    inline def setConditionExpressionUndefined: Self = StObject.set(x, "conditionExpression", js.undefined)
    
    inline def setConfiguration(value: ConfigurationDefinition): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setImports(value: js.Array[Import]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: Import*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: Middleware): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
