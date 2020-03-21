package typingsJapgolly.webcomponentsJs.mod._Global_

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webcomponentsJs.mod.CustomElementConstructor
import typingsJapgolly.webcomponentsJs.mod.CustomElementInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  def registerElement(name: String, prototype: CustomElementInit): CustomElementConstructor
}

object Document {
  @scala.inline
  def apply(registerElement: (String, CustomElementInit) => CallbackTo[CustomElementConstructor]): Document = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerElement")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.webcomponentsJs.mod.CustomElementInit) => registerElement(t0, t1).runNow()))
    __obj.asInstanceOf[Document]
  }
}

