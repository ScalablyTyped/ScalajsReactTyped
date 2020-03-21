package typingsJapgolly.vueTemplateCompiler.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions extends js.Object {
  var staticKeys: js.UndefOr[js.Array[String]] = js.undefined
  var transformCode: js.UndefOr[js.Function2[/* el */ ASTElement, /* code */ String, String]] = js.undefined
  def genData(el: ASTElement): String
  def postTransformNode(el: ASTElement): Unit
  def preTransformNode(el: ASTElement): js.UndefOr[ASTElement]
  def transformNode(el: ASTElement): js.UndefOr[ASTElement]
}

object ModuleOptions {
  @scala.inline
  def apply(
    genData: ASTElement => CallbackTo[String],
    postTransformNode: ASTElement => Callback,
    preTransformNode: ASTElement => CallbackTo[js.UndefOr[ASTElement]],
    transformNode: ASTElement => CallbackTo[js.UndefOr[ASTElement]],
    staticKeys: js.Array[String] = null,
    transformCode: (/* el */ ASTElement, /* code */ String) => CallbackTo[String] = null
  ): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("genData")(js.Any.fromFunction1((t0: typingsJapgolly.vueTemplateCompiler.mod.ASTElement) => genData(t0).runNow()))
    __obj.updateDynamic("postTransformNode")(js.Any.fromFunction1((t0: typingsJapgolly.vueTemplateCompiler.mod.ASTElement) => postTransformNode(t0).runNow()))
    __obj.updateDynamic("preTransformNode")(js.Any.fromFunction1((t0: typingsJapgolly.vueTemplateCompiler.mod.ASTElement) => preTransformNode(t0).runNow()))
    __obj.updateDynamic("transformNode")(js.Any.fromFunction1((t0: typingsJapgolly.vueTemplateCompiler.mod.ASTElement) => transformNode(t0).runNow()))
    if (staticKeys != null) __obj.updateDynamic("staticKeys")(staticKeys.asInstanceOf[js.Any])
    if (transformCode != null) __obj.updateDynamic("transformCode")(js.Any.fromFunction2((t0: /* el */ typingsJapgolly.vueTemplateCompiler.mod.ASTElement, t1: /* code */ java.lang.String) => transformCode(t0, t1).runNow()))
    __obj.asInstanceOf[ModuleOptions]
  }
}

