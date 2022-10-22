package typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.UnifiedConfigurationPropertyDefinition
  - typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.EnvironmentForkedConfigurationPropertyDefinition
*/
trait ConfigurationPropertyDefinition extends StObject
object ConfigurationPropertyDefinition {
  
  inline def EnvironmentForkedConfigurationPropertyDefinition(
    browser: ConfigurationPropertyDefinitionRuntimeAttributes & AdditionalDocumentation,
    documentation: String,
    inputType: String,
    node: ConfigurationPropertyDefinitionRuntimeAttributes & AdditionalDocumentation,
    universal: ConfigurationPropertyDefinitionRuntimeAttributes & AdditionalDocumentation
  ): typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.EnvironmentForkedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("forked")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.EnvironmentForkedConfigurationPropertyDefinition]
  }
  
  inline def UnifiedConfigurationPropertyDefinition(documentation: String, inputType: String, required: Boolean): typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.UnifiedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unified")
    __obj.asInstanceOf[typingsJapgolly.awsSdkBuildTypes.buildCustomizationMod.UnifiedConfigurationPropertyDefinition]
  }
}
