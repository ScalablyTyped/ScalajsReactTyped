package typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreFactoryMod

import typingsJapgolly.atAngularCompiler.atAngularCompilerStrings.invalid
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExternalReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3FactoryMetadata because Already inherited */ trait R3ExpressionFactoryMetadata extends R3ConstructorFactoryMetadata {
  var expression: Expression
}

object R3ExpressionFactoryMetadata {
  @scala.inline
  def apply(
    expression: Expression,
    injectFn: ExternalReference,
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] | invalid = null
  ): R3ExpressionFactoryMetadata = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ExpressionFactoryMetadata]
  }
}

