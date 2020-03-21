package typingsJapgolly.angularCompiler.stylingBuilderMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import typingsJapgolly.angularCompiler.outputAstMod.ExternalReference
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylingInstruction extends js.Object {
  var allocateBindingSlots: Double
  var reference: ExternalReference
  var sourceSpan: ParseSourceSpan | Null
  var supportsInterpolation: js.UndefOr[Boolean] = js.undefined
  def params(convertFn: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]]): js.Array[Expression]
}

object StylingInstruction {
  @scala.inline
  def apply(
    allocateBindingSlots: Double,
    params: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]] => CallbackTo[js.Array[Expression]],
    reference: ExternalReference,
    sourceSpan: ParseSourceSpan = null,
    supportsInterpolation: js.UndefOr[Boolean] = js.undefined
  ): StylingInstruction = {
    val __obj = js.Dynamic.literal(allocateBindingSlots = allocateBindingSlots.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("params")(js.Any.fromFunction1((t0: js.Function1[
  /* value */ js.Any, 
  typingsJapgolly.angularCompiler.outputAstMod.Expression | js.Array[typingsJapgolly.angularCompiler.outputAstMod.Expression]]) => params(t0).runNow()))
    if (sourceSpan != null) __obj.updateDynamic("sourceSpan")(sourceSpan.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsInterpolation)) __obj.updateDynamic("supportsInterpolation")(supportsInterpolation.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylingInstruction]
  }
}

