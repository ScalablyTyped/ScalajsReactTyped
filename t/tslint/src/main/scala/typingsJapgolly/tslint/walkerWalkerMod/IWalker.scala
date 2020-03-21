package typingsJapgolly.tslint.walkerWalkerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tslint.ruleMod.RuleFailure
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWalker extends js.Object {
  def getFailures(): js.Array[RuleFailure]
  def getSourceFile(): SourceFile
  def walk(sourceFile: SourceFile): Unit
}

object IWalker {
  @scala.inline
  def apply(
    getFailures: CallbackTo[js.Array[RuleFailure]],
    getSourceFile: CallbackTo[SourceFile],
    walk: SourceFile => Callback
  ): IWalker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFailures")(getFailures.toJsFn)
    __obj.updateDynamic("getSourceFile")(getSourceFile.toJsFn)
    __obj.updateDynamic("walk")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.SourceFile) => walk(t0).runNow()))
    __obj.asInstanceOf[IWalker]
  }
}

