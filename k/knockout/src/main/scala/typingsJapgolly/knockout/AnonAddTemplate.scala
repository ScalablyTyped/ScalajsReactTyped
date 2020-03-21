package typingsJapgolly.knockout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddTemplate extends js.Object {
  def addTemplate(templateName: String, templateMarkup: String): Unit
  def createJavaScriptEvaluatorBlock(script: String): String
  def renderTemplateSource(templateSource: js.Object, bindingContext: KnockoutBindingContext, options: js.Object): js.Array[Node]
}

object AnonAddTemplate {
  @scala.inline
  def apply(
    addTemplate: (String, String) => Callback,
    createJavaScriptEvaluatorBlock: String => CallbackTo[String],
    renderTemplateSource: (js.Object, KnockoutBindingContext, js.Object) => CallbackTo[js.Array[Node]]
  ): AnonAddTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addTemplate")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addTemplate(t0, t1).runNow()))
    __obj.updateDynamic("createJavaScriptEvaluatorBlock")(js.Any.fromFunction1((t0: java.lang.String) => createJavaScriptEvaluatorBlock(t0).runNow()))
    __obj.updateDynamic("renderTemplateSource")(js.Any.fromFunction3((t0: js.Object, t1: typingsJapgolly.knockout.KnockoutBindingContext, t2: js.Object) => renderTemplateSource(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonAddTemplate]
  }
}

