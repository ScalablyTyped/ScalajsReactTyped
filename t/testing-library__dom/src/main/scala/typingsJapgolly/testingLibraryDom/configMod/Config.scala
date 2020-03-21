package typingsJapgolly.testingLibraryDom.configMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var asyncUtilTimeout: Double
  var defaultHidden: Boolean
  var testIdAttribute: String
  def asyncWrapper(cb: js.Function1[/* repeated */ js.Any, _]): js.Promise[_]
}

object Config {
  @scala.inline
  def apply(
    asyncUtilTimeout: Double,
    asyncWrapper: js.Function1[/* repeated */ js.Any, js.Any] => CallbackTo[js.Promise[js.Any]],
    defaultHidden: Boolean,
    testIdAttribute: String
  ): Config = {
    val __obj = js.Dynamic.literal(asyncUtilTimeout = asyncUtilTimeout.asInstanceOf[js.Any], defaultHidden = defaultHidden.asInstanceOf[js.Any], testIdAttribute = testIdAttribute.asInstanceOf[js.Any])
    __obj.updateDynamic("asyncWrapper")(js.Any.fromFunction1((t0: js.Function1[/* repeated */ js.Any, js.Any]) => asyncWrapper(t0).runNow()))
    __obj.asInstanceOf[Config]
  }
}

