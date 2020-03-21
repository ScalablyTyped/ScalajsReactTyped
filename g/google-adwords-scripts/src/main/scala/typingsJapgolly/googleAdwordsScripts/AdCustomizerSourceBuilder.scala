package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdCustomizerSourceBuilder[AdCustomizerSource] extends AdWordsBuilder[AdCustomizerSource] {
  def addAttribute(name: String, `type`: String): AdCustomizerSourceBuilder[AdCustomizerSource]
  def addAttributes(attributes: js.Object): AdCustomizerSourceBuilder[AdCustomizerSource]
  def withName(name: String): AdCustomizerSourceBuilder[AdCustomizerSource]
}

object AdCustomizerSourceBuilder {
  @scala.inline
  def apply[AdCustomizerSource](
    addAttribute: (String, String) => CallbackTo[AdCustomizerSourceBuilder[AdCustomizerSource]],
    addAttributes: js.Object => CallbackTo[AdCustomizerSourceBuilder[AdCustomizerSource]],
    build: CallbackTo[AdWordsOperation[AdCustomizerSource]],
    withName: String => CallbackTo[AdCustomizerSourceBuilder[AdCustomizerSource]]
  ): AdCustomizerSourceBuilder[AdCustomizerSource] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAttribute")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addAttribute(t0, t1).runNow()))
    __obj.updateDynamic("addAttributes")(js.Any.fromFunction1((t0: js.Object) => addAttributes(t0).runNow()))
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withName")(js.Any.fromFunction1((t0: java.lang.String) => withName(t0).runNow()))
    __obj.asInstanceOf[AdCustomizerSourceBuilder[AdCustomizerSource]]
  }
}

