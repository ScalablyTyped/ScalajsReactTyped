package typingsJapgolly.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforePivotEnginePopulateEventArgs extends js.Object {
  /** returns the PivotGrid object
    */
  var pivotGridObject: js.UndefOr[js.Any] = js.undefined
}

object BeforePivotEnginePopulateEventArgs {
  @scala.inline
  def apply(pivotGridObject: js.Any = null): BeforePivotEnginePopulateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (pivotGridObject != null) __obj.updateDynamic("pivotGridObject")(pivotGridObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforePivotEnginePopulateEventArgs]
  }
}

