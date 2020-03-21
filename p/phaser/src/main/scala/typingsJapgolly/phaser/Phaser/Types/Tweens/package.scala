package typingsJapgolly.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Tweens {
  /**
    * A Tween Event.
    */
  type Event = java.lang.String
  type GetActiveCallback = js.Function6[
    /* target */ js.Any, 
    /* key */ java.lang.String, 
    /* value */ scala.Double, 
    /* targetIndex */ typingsJapgolly.phaser.integer, 
    /* totalTargets */ typingsJapgolly.phaser.integer, 
    /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, 
    scala.Unit
  ]
  type GetEndCallback = js.Function6[
    /* target */ js.Any, 
    /* key */ java.lang.String, 
    /* value */ scala.Double, 
    /* targetIndex */ typingsJapgolly.phaser.integer, 
    /* totalTargets */ typingsJapgolly.phaser.integer, 
    /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, 
    scala.Unit
  ]
  type GetStartCallback = js.Function6[
    /* target */ js.Any, 
    /* key */ java.lang.String, 
    /* value */ scala.Double, 
    /* targetIndex */ typingsJapgolly.phaser.integer, 
    /* totalTargets */ typingsJapgolly.phaser.integer, 
    /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, 
    scala.Unit
  ]
  type TimelineOnCompleteCallback = js.Function2[
    /* timeline */ typingsJapgolly.phaser.Phaser.Tweens.Timeline, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TimelineOnLoopCallback = js.Function2[
    /* timeline */ typingsJapgolly.phaser.Phaser.Tweens.Timeline, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TimelineOnStartCallback = js.Function2[
    /* timeline */ typingsJapgolly.phaser.Phaser.Tweens.Timeline, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TimelineOnUpdateCallback = js.Function2[
    /* timeline */ typingsJapgolly.phaser.Phaser.Tweens.Timeline, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TimelineOnYoyoCallback = js.Function2[
    /* timeline */ typingsJapgolly.phaser.Phaser.Tweens.Timeline, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnActiveCallback = js.Function3[
    /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, 
    /* target */ js.Any, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnCompleteCallback = js.Function3[
    /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, 
    /* targets */ js.Array[js.Any], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnLoopCallback = js.Function3[
    /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, 
    /* targets */ js.Array[js.Any], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnRepeatCallback = js.Function3[
    /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, 
    /* target */ js.Any, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnStartCallback = js.Function3[
    /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, 
    /* targets */ js.Array[js.Any], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnUpdateCallback = js.Function3[
    /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, 
    /* target */ js.Any, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type TweenOnYoyoCallback = js.Function3[
    /* tween */ typingsJapgolly.phaser.Phaser.Tweens.Tween, 
    /* target */ js.Any, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
}
