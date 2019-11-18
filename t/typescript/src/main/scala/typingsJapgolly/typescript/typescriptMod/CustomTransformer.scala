package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTransformer extends js.Object {
  def transformBundle(node: Bundle): Bundle
  def transformSourceFile(node: SourceFile): SourceFile
}

object CustomTransformer {
  @scala.inline
  def apply(
    transformBundle: Bundle => CallbackTo[Bundle],
    transformSourceFile: SourceFile => CallbackTo[SourceFile]
  ): CustomTransformer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transformBundle")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.typescriptMod.Bundle) => transformBundle(t0).runNow()))
    __obj.updateDynamic("transformSourceFile")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.typescriptMod.SourceFile) => transformSourceFile(t0).runNow()))
    __obj.asInstanceOf[CustomTransformer]
  }
}

