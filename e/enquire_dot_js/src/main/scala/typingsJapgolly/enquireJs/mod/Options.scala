package typingsJapgolly.enquireJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If set to true, defers execution of the setup function until the first time the media query is matched
    */
  var deferSetup: js.UndefOr[Boolean] = js.undefined
  /**
    * If supplied, triggered when handler is unregistered. Place cleanup code here
    */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If supplied, triggered when a media query matches.
    */
  var `match`: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If supplied, triggered once, when the handler is registered.
    */
  var setup: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If supplied, triggered when the media query transitions from a matched state to an unmatched state.
    */
  var unmatch: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    deferSetup: js.UndefOr[Boolean] = js.undefined,
    destroy: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    `match`: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    setup: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    unmatch: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deferSetup)) __obj.updateDynamic("deferSetup")(deferSetup.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    `match`.foreach(p => __obj.updateDynamic("match")(p.toJsFn))
    setup.foreach(p => __obj.updateDynamic("setup")(p.toJsFn))
    unmatch.foreach(p => __obj.updateDynamic("unmatch")(p.toJsFn))
    __obj.asInstanceOf[Options]
  }
}

