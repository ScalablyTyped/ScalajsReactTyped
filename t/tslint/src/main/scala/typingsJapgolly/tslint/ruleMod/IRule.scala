package typingsJapgolly.tslint.ruleMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tslint.walkerWalkerMod.IWalker
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRule extends js.Object {
  @JSName("apply")
  def apply(sourceFile: SourceFile): js.Array[RuleFailure]
  def applyWithWalker(walker: IWalker): js.Array[RuleFailure]
  def getOptions(): IOptions
  def isEnabled(): Boolean
}

object IRule {
  @scala.inline
  def apply(
    apply: SourceFile => CallbackTo[js.Array[RuleFailure]],
    applyWithWalker: IWalker => CallbackTo[js.Array[RuleFailure]],
    getOptions: CallbackTo[IOptions],
    isEnabled: CallbackTo[Boolean]
  ): IRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.SourceFile) => apply(t0).runNow()))
    __obj.updateDynamic("applyWithWalker")(js.Any.fromFunction1((t0: typingsJapgolly.tslint.walkerWalkerMod.IWalker) => applyWithWalker(t0).runNow()))
    __obj.updateDynamic("getOptions")(getOptions.toJsFn)
    __obj.updateDynamic("isEnabled")(isEnabled.toJsFn)
    __obj.asInstanceOf[IRule]
  }
}

