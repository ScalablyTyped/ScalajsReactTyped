package typingsJapgolly.atAngularCore.atAngularCoreMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChanges extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  def ngOnChanges(changes: SimpleChanges): Unit
}

object OnChanges {
  @scala.inline
  def apply(ngOnChanges: SimpleChanges => Callback): OnChanges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ngOnChanges")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.atAngularCoreMod.SimpleChanges) => ngOnChanges(t0).runNow()))
    __obj.asInstanceOf[OnChanges]
  }
}

