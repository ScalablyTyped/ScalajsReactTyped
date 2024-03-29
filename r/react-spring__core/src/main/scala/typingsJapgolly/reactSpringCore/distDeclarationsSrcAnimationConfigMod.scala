package typingsJapgolly.reactSpringCore

import typingsJapgolly.reactSpringCore.anon.PartialAnimationConfig
import typingsJapgolly.reactSpringTypes.interpolationMod.EasingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimationConfigMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/AnimationConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-spring/core/dist/declarations/src/AnimationConfig", "AnimationConfig")
  @js.native
  open class AnimationConfig () extends StObject {
    
    /**
      * When above zero, the spring will bounce instead of overshooting when
      * exceeding its goal value. Its velocity is multiplied by `-1 + bounce`
      * whenever its current value equals or exceeds its goal. For example,
      * setting `bounce` to `0.5` chops the velocity in half on each bounce,
      * in addition to any friction.
      */
    var bounce: js.UndefOr[Double] = js.native
    
    /**
      * Avoid overshooting by ending abruptly at the goal value.
      */
    var clamp: Boolean = js.native
    
    /**
      * The damping ratio, which dictates how the spring slows down.
      *
      * Set to `0` to never slow down. Set to `1` to slow down without bouncing.
      * Between `0` and `1` is for you to explore.
      *
      * Only works when `frequency` is defined.
      *
      * Defaults to 1
      */
    var damping: Double = js.native
    
    /**
      * "Decay animations" decelerate without an explicit goal value.
      * Useful for scrolling animations.
      *
      * Use `true` for the default exponential decay factor (`0.998`).
      *
      * When a `number` between `0` and `1` is given, a lower number makes the
      * animation slow down faster. And setting to `1` would make an unending
      * animation.
      */
    var decay: js.UndefOr[Boolean | Double] = js.native
    
    /**
      * Animation length in number of milliseconds.
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * The animation curve. Only used when `duration` is defined.
      *
      * Defaults to quadratic ease-in-out.
      */
    var easing: EasingFunction = js.native
    
    /**
      * The natural frequency (in seconds), which dictates the number of bounces
      * per second when no damping exists.
      *
      * When defined, `tension` is derived from this, and `friction` is derived
      * from `tension` and `damping`.
      */
    var frequency: js.UndefOr[Double] = js.native
    
    /**
      * The damping ratio coefficient, or just the damping ratio when `speed` is defined.
      *
      * When `speed` is defined, this value should be between 0 and 1.
      *
      * Higher friction means the spring will slow down faster.
      */
    var friction: Double = js.native
    
    /**
      * Higher mass means more friction is required to slow down.
      *
      * Defaults to 1, which works fine most of the time.
      */
    var mass: Double = js.native
    
    /**
      * The smallest distance from a value before that distance is essentially zero.
      *
      * This helps in deciding when a spring is "at rest". The spring must be within
      * this distance from its final value, and its velocity must be lower than this
      * value too (unless `restVelocity` is defined).
      */
    var precision: js.UndefOr[Double] = js.native
    
    /**
      * For `duration` animations only. Note: The `duration` is not affected
      * by this property.
      *
      * Defaults to `0`, which means "start from the beginning".
      *
      * Setting to `1+` makes an immediate animation.
      *
      * Setting to `0.5` means "start from the middle of the easing function".
      *
      * Any number `>= 0` and `<= 1` makes sense here.
      */
    var progress: js.UndefOr[Double] = js.native
    
    /**
      * The smallest velocity before the animation is considered "not moving".
      *
      * When undefined, `precision` is used instead.
      */
    var restVelocity: js.UndefOr[Double] = js.native
    
    /**
      * While animating, round to the nearest multiple of this number.
      * The `from` and `to` values are never rounded, as well as any value
      * passed to the `set` method of an animated value.
      */
    var round: js.UndefOr[Double] = js.native
    
    /**
      * With higher tension, the spring will resist bouncing and try harder to stop at its end value.
      *
      * When tension is zero, no animation occurs.
      */
    var tension: Double = js.native
    
    /**
      * The initial velocity of one or more values.
      */
    var velocity: Double | js.Array[Double] = js.native
  }
  
  inline def mergeConfig(config: AnimationConfig, newConfig: PartialAnimationConfig): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfig")(config.asInstanceOf[js.Any], newConfig.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def mergeConfig(config: AnimationConfig, newConfig: PartialAnimationConfig, defaultConfig: PartialAnimationConfig): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfig")(config.asInstanceOf[js.Any], newConfig.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any])).asInstanceOf[Any]
}
