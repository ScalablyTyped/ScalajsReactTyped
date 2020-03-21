package typingsJapgolly.rollupPluginTypescript2.ioptionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescript.mod.Bundle
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TransformationContext
import typingsJapgolly.typescript.mod.Transformer
import typingsJapgolly.typescript.mod.TransformerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomTransformer extends js.Object {
  var after: js.UndefOr[TransformerFactory[SourceFile]] = js.undefined
  var afterDeclarations: js.UndefOr[TransformerFactory[Bundle | SourceFile]] = js.undefined
  var before: js.UndefOr[TransformerFactory[SourceFile]] = js.undefined
}

object ICustomTransformer {
  @scala.inline
  def apply(
    after: /* context */ TransformationContext => CallbackTo[Transformer[SourceFile]] = null,
    afterDeclarations: /* context */ TransformationContext => CallbackTo[Transformer[Bundle | SourceFile]] = null,
    before: /* context */ TransformationContext => CallbackTo[Transformer[SourceFile]] = null
  ): ICustomTransformer = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.typescript.mod.TransformationContext) => after(t0).runNow()))
    if (afterDeclarations != null) __obj.updateDynamic("afterDeclarations")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.typescript.mod.TransformationContext) => afterDeclarations(t0).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.typescript.mod.TransformationContext) => before(t0).runNow()))
    __obj.asInstanceOf[ICustomTransformer]
  }
}

