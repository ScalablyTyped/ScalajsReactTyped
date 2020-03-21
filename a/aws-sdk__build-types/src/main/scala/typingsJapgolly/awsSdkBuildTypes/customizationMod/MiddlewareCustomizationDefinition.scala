package typingsJapgolly.awsSdkBuildTypes.customizationMod

import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.Middleware
import typingsJapgolly.awsSdkTypes.middlewareMod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareCustomizationDefinition extends CustomizationDefinition {
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
  @scala.inline
  def apply(
    expression: String,
    priority: Double,
    step: Step,
    `type`: Middleware,
    conditionExpression: String = null,
    configuration: ConfigurationDefinition = null,
    imports: js.Array[Import] = null,
    tags: String = null
  ): MiddlewareCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (conditionExpression != null) __obj.updateDynamic("conditionExpression")(conditionExpression.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareCustomizationDefinition]
  }
}

