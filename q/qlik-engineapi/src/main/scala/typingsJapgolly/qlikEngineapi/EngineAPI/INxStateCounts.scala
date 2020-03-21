package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxStateCounts...
  */
trait INxStateCounts extends js.Object {
  /**
    * Number of values in alternative state.
    * Integer
    */
  var qAlternative: Double
  /**
    * Number of values in deselected state.
    * Integer
    */
  var qDeselected: Double
  /**
    * Number of values in excluded state
    * Integer
    */
  var qExcluded: Double
  /**
    * Number of values in locked state.
    * Integer
    */
  var qLocked: Double
  /**
    * Number of values in locked excluded state.
    * Integer
    */
  var qLockedExcluded: Double
  /**
    * Number of values in optional state.
    * Integer
    */
  var qOption: js.UndefOr[Double] = js.undefined
  /**
    * Number of values in selected state.
    * Integer
    */
  var qSelected: Double
  /**
    * Number of values in selected excluded state.
    * Integer
    */
  var qSelectedExcluded: Double
}

object INxStateCounts {
  @scala.inline
  def apply(
    qAlternative: Double,
    qDeselected: Double,
    qExcluded: Double,
    qLocked: Double,
    qLockedExcluded: Double,
    qSelected: Double,
    qSelectedExcluded: Double,
    qOption: Int | Double = null
  ): INxStateCounts = {
    val __obj = js.Dynamic.literal(qAlternative = qAlternative.asInstanceOf[js.Any], qDeselected = qDeselected.asInstanceOf[js.Any], qExcluded = qExcluded.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qLockedExcluded = qLockedExcluded.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedExcluded = qSelectedExcluded.asInstanceOf[js.Any])
    if (qOption != null) __obj.updateDynamic("qOption")(qOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxStateCounts]
  }
}

