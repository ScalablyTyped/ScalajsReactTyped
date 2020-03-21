package typingsJapgolly.ionicCore.componentsMod.Components

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRefresher extends js.Object {
  /**
    * Time it takes to close the refresher.
    */
  var closeDuration: String
  /**
    * If `true`, the refresher will be hidden.
    */
  var disabled: Boolean
  /**
    * How much to multiply the pull speed by. To slow the pull animation down, pass a number less than `1`. To speed up the pull, pass a number greater than `1`. The default value is `1` which is equal to the speed of the cursor. If a negative value is passed in, the factor will be `1` instead.  For example: If the value passed is `1.2` and the content is dragged by `10` pixels, instead of `10` pixels the content will be pulled by `12` pixels (an increase of 20 percent). If the value passed is `0.8`, the dragged amount will be `8` pixels, less than the amount the cursor has moved.
    */
  var pullFactor: Double
  /**
    * The maximum distance of the pull until the refresher will automatically go into the `refreshing` state. Defaults to the result of `pullMin + 60`.
    */
  var pullMax: Double
  /**
    * The minimum distance the user must pull down until the refresher will go into the `refreshing` state.
    */
  var pullMin: Double
  /**
    * Time it takes the refresher to to snap back to the `refreshing` state.
    */
  var snapbackDuration: String
  /**
    * Changes the refresher's state from `refreshing` to `cancelling`.
    */
  def cancel(): js.Promise[Unit]
  /**
    * Call `complete()` when your async operation has completed. For example, the `refreshing` state is while the app is performing an asynchronous operation, such as receiving more data from an AJAX request. Once the data has been received, you then call this method to signify that the refreshing has completed and to close the refresher. This method also changes the refresher's state from `refreshing` to `completing`.
    */
  def complete(): js.Promise[Unit]
  /**
    * A number representing how far down the user has pulled. The number `0` represents the user hasn't pulled down at all. The number `1`, and anything greater than `1`, represents that the user has pulled far enough down that when they let go then the refresh will happen. If they let go and the number is less than `1`, then the refresh will not happen, and the content will return to it's original position.
    */
  def getProgress(): js.Promise[Double]
}

object IonRefresher {
  @scala.inline
  def apply(
    cancel: CallbackTo[js.Promise[Unit]],
    closeDuration: String,
    complete: CallbackTo[js.Promise[Unit]],
    disabled: Boolean,
    getProgress: CallbackTo[js.Promise[Double]],
    pullFactor: Double,
    pullMax: Double,
    pullMin: Double,
    snapbackDuration: String
  ): IonRefresher = {
    val __obj = js.Dynamic.literal(closeDuration = closeDuration.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], pullFactor = pullFactor.asInstanceOf[js.Any], pullMax = pullMax.asInstanceOf[js.Any], pullMin = pullMin.asInstanceOf[js.Any], snapbackDuration = snapbackDuration.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.updateDynamic("getProgress")(getProgress.toJsFn)
    __obj.asInstanceOf[IonRefresher]
  }
}

