package typingsJapgolly.atAngularCore.atAngularCoreMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnInit extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  def ngOnInit(): Unit
}

object OnInit {
  @scala.inline
  def apply(ngOnInit: Callback): OnInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ngOnInit")(ngOnInit.toJsFn)
    __obj.asInstanceOf[OnInit]
  }
}

