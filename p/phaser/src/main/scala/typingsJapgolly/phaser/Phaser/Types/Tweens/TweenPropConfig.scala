package typingsJapgolly.phaser.Phaser.Types.Tweens

import japgolly.scalajs.react.Callback
import typingsJapgolly.phaser.Phaser.Tweens.Tween
import typingsJapgolly.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenPropConfig extends js.Object {
  /**
    * Time in ms/frames before tween will start.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Duration of the tween in ms/frames.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The ease function this tween uses.
    */
  var ease: js.UndefOr[String | js.Function] = js.undefined
  /**
    * Should toggleFlipX be called when yoyo or repeat happens?
    */
  var flipX: js.UndefOr[Boolean] = js.undefined
  /**
    * Should toggleFlipY be called when yoyo or repeat happens?
    */
  var flipY: js.UndefOr[Boolean] = js.undefined
  /**
    * What the property will be set to immediately when this tween becomes active.
    */
  var getActive: js.UndefOr[GetActiveCallback] = js.undefined
  /**
    * What the property will be at the END of the Tween.
    */
  var getEnd: js.UndefOr[GetEndCallback] = js.undefined
  /**
    * What the property will be at the START of the Tween.
    */
  var getStart: js.UndefOr[GetStartCallback] = js.undefined
  /**
    * Time in ms/frames the tween will pause before repeating or returning to its starting value if yoyo is set to true.
    */
  var hold: js.UndefOr[Double] = js.undefined
  /**
    * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    */
  var repeat: js.UndefOr[Double] = js.undefined
  /**
    * Time in ms/frames before the repeat will start.
    */
  var repeatDelay: js.UndefOr[Double] = js.undefined
  /**
    * What the property will be at the END of the Tween.
    */
  var value: js.UndefOr[Double | String | GetEndCallback | TweenPropConfig] = js.undefined
  /**
    * Determines whether the tween should return back to its start value after hold has expired.
    */
  var yoyo: js.UndefOr[Boolean] = js.undefined
}

object TweenPropConfig {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    duration: Int | Double = null,
    ease: String | js.Function = null,
    flipX: js.UndefOr[Boolean] = js.undefined,
    flipY: js.UndefOr[Boolean] = js.undefined,
    getActive: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Callback = null,
    getEnd: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Callback = null,
    getStart: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Callback = null,
    hold: Int | Double = null,
    repeat: Int | Double = null,
    repeatDelay: Int | Double = null,
    value: Double | String | GetEndCallback | TweenPropConfig = null,
    yoyo: js.UndefOr[Boolean] = js.undefined
  ): TweenPropConfig = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX.asInstanceOf[js.Any])
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY.asInstanceOf[js.Any])
    if (getActive != null) __obj.updateDynamic("getActive")(js.Any.fromFunction6((t0: /* target */ js.Any, t1: /* key */ java.lang.String, t2: /* value */ scala.Double, t3: /* targetIndex */ typingsJapgolly.phaser.integer, t4: /* totalTargets */ typingsJapgolly.phaser.integer, t5: /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween) => getActive(t0, t1, t2, t3, t4, t5).runNow()))
    if (getEnd != null) __obj.updateDynamic("getEnd")(js.Any.fromFunction6((t0: /* target */ js.Any, t1: /* key */ java.lang.String, t2: /* value */ scala.Double, t3: /* targetIndex */ typingsJapgolly.phaser.integer, t4: /* totalTargets */ typingsJapgolly.phaser.integer, t5: /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween) => getEnd(t0, t1, t2, t3, t4, t5).runNow()))
    if (getStart != null) __obj.updateDynamic("getStart")(js.Any.fromFunction6((t0: /* target */ js.Any, t1: /* key */ java.lang.String, t2: /* value */ scala.Double, t3: /* targetIndex */ typingsJapgolly.phaser.integer, t4: /* totalTargets */ typingsJapgolly.phaser.integer, t5: /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween) => getStart(t0, t1, t2, t3, t4, t5).runNow()))
    if (hold != null) __obj.updateDynamic("hold")(hold.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenPropConfig]
  }
}

