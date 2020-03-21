package typingsJapgolly.phaser.Phaser.Types.Tweens

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.phaser.Phaser.Tweens.Tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenBuilderConfig extends js.Object {
  /**
    * Scope (this) for the callbacks. The default scope is the tween.
    */
  var callbackScope: js.UndefOr[js.Any] = js.undefined
  /**
    * The time the tween will wait before the onComplete event is dispatched once it has completed, in ms.
    */
  var completeDelay: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * The number of milliseconds to delay before the tween will start.
    */
  var delay: js.UndefOr[Double | js.Function] = js.undefined
  /**
    * The duration of the tween in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The easing equation to use for the tween.
    */
  var ease: js.UndefOr[String | js.Function] = js.undefined
  /**
    * Optional easing parameters.
    */
  var easeParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Horizontally flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipX` property.
    */
  var flipX: js.UndefOr[Boolean] = js.undefined
  /**
    * Vertically flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipY` property.
    */
  var flipY: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of milliseconds to hold the tween for before yoyo'ing.
    */
  var hold: js.UndefOr[Double] = js.undefined
  /**
    * The number of times the tween will repeat. (A value of 1 means the tween will play twice, as it repeated once.) The first loop starts after every property tween has completed once.
    */
  var loop: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * The time the tween will pause before starting either a yoyo or returning to the start for a repeat.
    */
  var loopDelay: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * Used when the Tween is part of a Timeline.
    */
  var offset: js.UndefOr[Double | js.Function | js.Object | js.Array[_]] = js.undefined
  /**
    * A function to call when the tween becomes active within the Tween Manager.
    */
  var onActive: js.UndefOr[TweenOnActiveCallback] = js.undefined
  /**
    * Additional parameters to pass to `onActive`.
    */
  var onActiveParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onActive`.
    */
  var onActiveScope: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to call when the tween completes.
    */
  var onComplete: js.UndefOr[TweenOnCompleteCallback] = js.undefined
  /**
    * Additional parameters to pass to `onComplete`.
    */
  var onCompleteParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onComplete`.
    */
  var onCompleteScope: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to call each time the tween loops.
    */
  var onLoop: js.UndefOr[TweenOnLoopCallback] = js.undefined
  /**
    * Additional parameters to pass to `onLoop`.
    */
  var onLoopParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onLoop`.
    */
  var onLoopScope: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to call each time the tween repeats. Called once per property per target.
    */
  var onRepeat: js.UndefOr[TweenOnRepeatCallback] = js.undefined
  /**
    * Additional parameters to pass to `onRepeat`.
    */
  var onRepeatParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onRepeat`.
    */
  var onRepeatScope: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to call when the tween starts playback, after any delays have expired.
    */
  var onStart: js.UndefOr[TweenOnStartCallback] = js.undefined
  /**
    * Additional parameters to pass to `onStart`.
    */
  var onStartParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onStart`.
    */
  var onStartScope: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to call each time the tween steps. Called once per property per target.
    */
  var onUpdate: js.UndefOr[TweenOnUpdateCallback] = js.undefined
  /**
    * Additional parameters to pass to `onUpdate`.
    */
  var onUpdateParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onUpdate`.
    */
  var onUpdateScope: js.UndefOr[js.Any] = js.undefined
  /**
    * A function to call each time the tween yoyos. Called once per property per target.
    */
  var onYoyo: js.UndefOr[TweenOnYoyoCallback] = js.undefined
  /**
    * Additional parameters to pass to `onYoyo`.
    */
  var onYoyoParams: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Scope (this) for `onYoyo`.
    */
  var onYoyoScope: js.UndefOr[js.Any] = js.undefined
  /**
    * Does the tween start in a paused state (true) or playing (false)?
    */
  var paused: js.UndefOr[Boolean] = js.undefined
  /**
    * The properties to tween.
    */
  var props: js.UndefOr[StringDictionary[Double | String | GetEndCallback | TweenPropConfig]] = js.undefined
  /**
    * The number of times each property tween repeats.
    */
  var repeat: js.UndefOr[Double] = js.undefined
  /**
    * The number of milliseconds to pause before a repeat.
    */
  var repeatDelay: js.UndefOr[Double] = js.undefined
  /**
    * The object, or an array of objects, to run the tween on.
    */
  var targets: js.Any
  /**
    * Use frames or milliseconds?
    */
  var useFrames: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
    */
  var yoyo: js.UndefOr[Boolean] = js.undefined
}

object TweenBuilderConfig {
  @scala.inline
  def apply(
    targets: js.Any,
    callbackScope: js.Any = null,
    completeDelay: Double | js.Function | js.Object | js.Array[_] = null,
    delay: Double | js.Function = null,
    duration: Int | Double = null,
    ease: String | js.Function = null,
    easeParams: js.Array[_] = null,
    flipX: js.UndefOr[Boolean] = js.undefined,
    flipY: js.UndefOr[Boolean] = js.undefined,
    hold: Int | Double = null,
    loop: Double | js.Function | js.Object | js.Array[_] = null,
    loopDelay: Double | js.Function | js.Object | js.Array[_] = null,
    offset: Double | js.Function | js.Object | js.Array[_] = null,
    onActive: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Callback = null,
    onActiveParams: js.Array[_] = null,
    onActiveScope: js.Any = null,
    onComplete: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Callback = null,
    onCompleteParams: js.Array[_] = null,
    onCompleteScope: js.Any = null,
    onLoop: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Callback = null,
    onLoopParams: js.Array[_] = null,
    onLoopScope: js.Any = null,
    onRepeat: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Callback = null,
    onRepeatParams: js.Array[_] = null,
    onRepeatScope: js.Any = null,
    onStart: (/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any) => Callback = null,
    onStartParams: js.Array[_] = null,
    onStartScope: js.Any = null,
    onUpdate: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Callback = null,
    onUpdateParams: js.Array[_] = null,
    onUpdateScope: js.Any = null,
    onYoyo: (/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any) => Callback = null,
    onYoyoParams: js.Array[_] = null,
    onYoyoScope: js.Any = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    props: StringDictionary[Double | String | GetEndCallback | TweenPropConfig] = null,
    repeat: Int | Double = null,
    repeatDelay: Int | Double = null,
    useFrames: js.UndefOr[Boolean] = js.undefined,
    yoyo: js.UndefOr[Boolean] = js.undefined
  ): TweenBuilderConfig = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    if (callbackScope != null) __obj.updateDynamic("callbackScope")(callbackScope.asInstanceOf[js.Any])
    if (completeDelay != null) __obj.updateDynamic("completeDelay")(completeDelay.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (easeParams != null) __obj.updateDynamic("easeParams")(easeParams.asInstanceOf[js.Any])
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX.asInstanceOf[js.Any])
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY.asInstanceOf[js.Any])
    if (hold != null) __obj.updateDynamic("hold")(hold.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopDelay != null) __obj.updateDynamic("loopDelay")(loopDelay.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onActive != null) __obj.updateDynamic("onActive")(js.Any.fromFunction3((t0: /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, t1: /* target */ js.Any, t2: /* repeated */ js.Any) => onActive(t0, t1, t2).runNow()))
    if (onActiveParams != null) __obj.updateDynamic("onActiveParams")(onActiveParams.asInstanceOf[js.Any])
    if (onActiveScope != null) __obj.updateDynamic("onActiveScope")(onActiveScope.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction3((t0: /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, t1: /* targets */ js.Array[js.Any], t2: /* repeated */ js.Any) => onComplete(t0, t1, t2).runNow()))
    if (onCompleteParams != null) __obj.updateDynamic("onCompleteParams")(onCompleteParams.asInstanceOf[js.Any])
    if (onCompleteScope != null) __obj.updateDynamic("onCompleteScope")(onCompleteScope.asInstanceOf[js.Any])
    if (onLoop != null) __obj.updateDynamic("onLoop")(js.Any.fromFunction3((t0: /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, t1: /* targets */ js.Array[js.Any], t2: /* repeated */ js.Any) => onLoop(t0, t1, t2).runNow()))
    if (onLoopParams != null) __obj.updateDynamic("onLoopParams")(onLoopParams.asInstanceOf[js.Any])
    if (onLoopScope != null) __obj.updateDynamic("onLoopScope")(onLoopScope.asInstanceOf[js.Any])
    if (onRepeat != null) __obj.updateDynamic("onRepeat")(js.Any.fromFunction3((t0: /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, t1: /* target */ js.Any, t2: /* repeated */ js.Any) => onRepeat(t0, t1, t2).runNow()))
    if (onRepeatParams != null) __obj.updateDynamic("onRepeatParams")(onRepeatParams.asInstanceOf[js.Any])
    if (onRepeatScope != null) __obj.updateDynamic("onRepeatScope")(onRepeatScope.asInstanceOf[js.Any])
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction3((t0: /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, t1: /* targets */ js.Array[js.Any], t2: /* repeated */ js.Any) => onStart(t0, t1, t2).runNow()))
    if (onStartParams != null) __obj.updateDynamic("onStartParams")(onStartParams.asInstanceOf[js.Any])
    if (onStartScope != null) __obj.updateDynamic("onStartScope")(onStartScope.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction3((t0: /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, t1: /* target */ js.Any, t2: /* repeated */ js.Any) => onUpdate(t0, t1, t2).runNow()))
    if (onUpdateParams != null) __obj.updateDynamic("onUpdateParams")(onUpdateParams.asInstanceOf[js.Any])
    if (onUpdateScope != null) __obj.updateDynamic("onUpdateScope")(onUpdateScope.asInstanceOf[js.Any])
    if (onYoyo != null) __obj.updateDynamic("onYoyo")(js.Any.fromFunction3((t0: /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, t1: /* target */ js.Any, t2: /* repeated */ js.Any) => onYoyo(t0, t1, t2).runNow()))
    if (onYoyoParams != null) __obj.updateDynamic("onYoyoParams")(onYoyoParams.asInstanceOf[js.Any])
    if (onYoyoScope != null) __obj.updateDynamic("onYoyoScope")(onYoyoScope.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(useFrames)) __obj.updateDynamic("useFrames")(useFrames.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenBuilderConfig]
  }
}

