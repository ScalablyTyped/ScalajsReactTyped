package typingsJapgolly.angularMeteor

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularMeteor.mod.meteor.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBind extends js.Object {
  /**
    * @param scope - The scope the document will be bound to.
    * @param model - The name of the scope's model variable that the document will be bound to.
    */
  def bind(scope: IScope, model: String): Unit
}

object AnonBind {
  @scala.inline
  def apply(bind: (IScope, String) => Callback): AnonBind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(js.Any.fromFunction2((t0: typingsJapgolly.angularMeteor.mod.meteor.IScope, t1: java.lang.String) => bind(t0, t1).runNow()))
    __obj.asInstanceOf[AnonBind]
  }
}

