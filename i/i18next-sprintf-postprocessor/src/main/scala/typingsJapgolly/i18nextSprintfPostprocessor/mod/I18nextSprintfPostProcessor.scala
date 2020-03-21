package typingsJapgolly.i18nextSprintfPostprocessor.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.i18next.mod.PostProcessorModule
import typingsJapgolly.i18nextSprintfPostprocessor.AnonPostProcess
import typingsJapgolly.i18nextSprintfPostprocessor.i18nextSprintfPostprocessorStrings.postProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nextSprintfPostProcessor extends PostProcessorModule {
  @JSName("type")
  var type_I18nextSprintfPostProcessor: postProcessor
  def overloadTranslationOptionHandler(args: js.Array[String]): AnonPostProcess
  def process(value: js.Any, key: String, options: js.Any): js.Any
}

object I18nextSprintfPostProcessor {
  @scala.inline
  def apply(
    name: String,
    overloadTranslationOptionHandler: js.Array[String] => CallbackTo[AnonPostProcess],
    process: (js.Any, String, js.Any) => CallbackTo[js.Any],
    `type`: postProcessor
  ): I18nextSprintfPostProcessor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("overloadTranslationOptionHandler")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => overloadTranslationOptionHandler(t0).runNow()))
    __obj.updateDynamic("process")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: js.Any) => process(t0, t1, t2).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nextSprintfPostProcessor]
  }
}

