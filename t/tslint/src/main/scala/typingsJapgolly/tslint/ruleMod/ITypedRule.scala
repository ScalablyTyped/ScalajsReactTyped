package typingsJapgolly.tslint.ruleMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tslint.walkerWalkerMod.IWalker
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypedRule extends IRule {
  def applyWithProgram(sourceFile: SourceFile, program: Program): js.Array[RuleFailure]
}

object ITypedRule {
  @scala.inline
  def apply(
    apply: SourceFile => CallbackTo[js.Array[RuleFailure]],
    applyWithProgram: (SourceFile, Program) => CallbackTo[js.Array[RuleFailure]],
    applyWithWalker: IWalker => CallbackTo[js.Array[RuleFailure]],
    getOptions: CallbackTo[IOptions],
    isEnabled: CallbackTo[Boolean]
  ): ITypedRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.SourceFile) => apply(t0).runNow()))
    __obj.updateDynamic("applyWithProgram")(js.Any.fromFunction2((t0: typingsJapgolly.typescript.mod.SourceFile, t1: typingsJapgolly.typescript.mod.Program) => applyWithProgram(t0, t1).runNow()))
    __obj.updateDynamic("applyWithWalker")(js.Any.fromFunction1((t0: typingsJapgolly.tslint.walkerWalkerMod.IWalker) => applyWithWalker(t0).runNow()))
    __obj.updateDynamic("getOptions")(getOptions.toJsFn)
    __obj.updateDynamic("isEnabled")(isEnabled.toJsFn)
    __obj.asInstanceOf[ITypedRule]
  }
}

