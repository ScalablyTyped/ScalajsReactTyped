package typingsJapgolly.atAngularCore.atAngularCoreMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterContentInit extends js.Object {
  /**
    * A callback method that is invoked immediately after
    * Angular has completed initialization of all of the directive's
    * content.
    * It is invoked only once when the directive is instantiated.
    */
  def ngAfterContentInit(): Unit
}

object AfterContentInit {
  @scala.inline
  def apply(ngAfterContentInit: Callback): AfterContentInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ngAfterContentInit")(ngAfterContentInit.toJsFn)
    __obj.asInstanceOf[AfterContentInit]
  }
}

