package typingsJapgolly.qlikVisualizationextensions.SelectionStateAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQSelectionState extends js.Object {
  /**
    * Number of back steps available.
    */
  var backCount: Double
  /**
    * Number of forward steps available. OnData notification will be triggered after each update.
    */
  var forwardCount: Double
  /**
    * Selections
    */
  var selections: IQFieldSelections
  /**
    * State name. $ for default state.
    */
  var stateName: String
  /**
    * Cleara all selections in this state.
    * @param lockedAlso - Use to also clear locked fields.
    * @return - A promise of a Qlik engine reply.
    */
  def clearAll(lockedAlso: Boolean): IPromise[_]
  /**
    * Locks all selections in this state.
    * @return - A promise of a Qlik engine reply.
    */
  def lockAll(): IPromise[_]
  /**
    * Unlocks all selections in this state.
    * @return - A promise of a Qlik engine reply.
    */
  def unlockAll(): IPromise[_]
}

object IQSelectionState {
  @scala.inline
  def apply(
    backCount: Double,
    clearAll: Boolean => CallbackTo[IPromise[js.Any]],
    forwardCount: Double,
    lockAll: CallbackTo[IPromise[js.Any]],
    selections: IQFieldSelections,
    stateName: String,
    unlockAll: CallbackTo[IPromise[js.Any]]
  ): IQSelectionState = {
    val __obj = js.Dynamic.literal(backCount = backCount.asInstanceOf[js.Any], forwardCount = forwardCount.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateName = stateName.asInstanceOf[js.Any])
    __obj.updateDynamic("clearAll")(js.Any.fromFunction1((t0: scala.Boolean) => clearAll(t0).runNow()))
    __obj.updateDynamic("lockAll")(lockAll.toJsFn)
    __obj.updateDynamic("unlockAll")(unlockAll.toJsFn)
    __obj.asInstanceOf[IQSelectionState]
  }
}

