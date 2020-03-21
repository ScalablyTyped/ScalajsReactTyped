package typingsJapgolly.qlik

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlik.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetContent extends js.Object {
  def getContent(variable: String, callback: js.Function2[/* value */ Variable, /* app */ this.type, Unit]): js.Promise[_]
  def setContent(variable: String, value: String): Unit
}

object AnonGetContent {
  @scala.inline
  def apply(
    getContent: (String, js.Function2[/* value */ Variable, AnonGetContent, Unit]) => CallbackTo[js.Promise[js.Any]],
    setContent: (String, String) => Callback
  ): AnonGetContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* value */ typingsJapgolly.qlik.mod.Variable, 
  typingsJapgolly.qlik.AnonGetContent, 
  scala.Unit]) => getContent(t0, t1).runNow()))
    __obj.updateDynamic("setContent")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setContent(t0, t1).runNow()))
    __obj.asInstanceOf[AnonGetContent]
  }
}

