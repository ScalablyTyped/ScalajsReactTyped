package typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod

import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.ConfigCustomizationDefinition
  - typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.MiddlewareCustomizationDefinition
  - typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.ParserDecoratorCustomizationDefinition
  - typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.SyntheticParameterCustomizationDefinition
  - typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.ParameterSuppressionCustomizationDefinition
*/
trait CustomizationDefinition extends StObject
object CustomizationDefinition {
  
  inline def ConfigCustomizationDefinition(configuration: ConfigurationDefinition): typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.ConfigCustomizationDefinition = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Configuration")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.ConfigCustomizationDefinition]
  }
  
  inline def MiddlewareCustomizationDefinition(expression: String, priority: Double, step: Step): typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.MiddlewareCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Middleware")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.MiddlewareCustomizationDefinition]
  }
  
  inline def ParameterSuppressionCustomizationDefinition(location: input | output, name: String): typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.ParameterSuppressionCustomizationDefinition = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParameterSuppression")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.ParameterSuppressionCustomizationDefinition]
  }
  
  inline def ParserDecoratorCustomizationDefinition(expression: String, priority: Double): typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.ParserDecoratorCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParserDecorator")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.ParserDecoratorCustomizationDefinition]
  }
  
  inline def SyntheticParameterCustomizationDefinition(documentation: String, location: input | output, name: String, typeExpression: String): typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.SyntheticParameterCustomizationDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeExpression = typeExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SyntheticParameter")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.SyntheticParameterCustomizationDefinition]
  }
}
