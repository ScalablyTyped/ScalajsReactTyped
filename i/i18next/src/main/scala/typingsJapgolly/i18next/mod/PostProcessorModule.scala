package typingsJapgolly.i18next.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.i18next.i18nextStrings.postProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to extend or manipulate the translated values before returning them in `t` function.
  * Need to be a singleton object.
  */
trait PostProcessorModule extends Module {
  /** Unique name */
  var name: String
  @JSName("type")
  var type_PostProcessorModule: postProcessor
  def process(value: String, key: String, options: TOptions[StringMap], translator: js.Any): String
}

object PostProcessorModule {
  @scala.inline
  def apply(
    name: String,
    process: (String, String, TOptions[StringMap], js.Any) => CallbackTo[String],
    `type`: postProcessor
  ): PostProcessorModule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("process")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.i18next.mod.TOptions[typingsJapgolly.i18next.mod.StringMap], t3: js.Any) => process(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProcessorModule]
  }
}

