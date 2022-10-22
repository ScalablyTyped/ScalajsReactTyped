package typingsJapgolly.animejs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.SVGElement
import typingsJapgolly.animejs.animejsStrings.center
import typingsJapgolly.animejs.animejsStrings.first
import typingsJapgolly.animejs.animejsStrings.last
import typingsJapgolly.animejs.animejsStrings.normal
import typingsJapgolly.animejs.animejsStrings.reverse
import typingsJapgolly.animejs.animejsStrings.x
import typingsJapgolly.animejs.animejsStrings.y
import typingsJapgolly.animejs.anon.El
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(params: AnimeParams): AnimeInstance = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[AnimeInstance]
  
  @JSImport("animejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bezier(x1: Double, y1: Double, x2: Double, y2: Double): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("bezier")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  
  inline def get(targets: AnimeTarget, prop: String): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(targets.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def path(): js.Function1[/* prop */ String, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")().asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: String): js.Function1[/* prop */ String, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: String, percent: Double): js.Function1[/* prop */ String, El] = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: HTMLElement): js.Function1[/* prop */ String, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: HTMLElement, percent: Double): js.Function1[/* prop */ String, El] = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: SVGElement): js.Function1[/* prop */ String, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: SVGElement, percent: Double): js.Function1[/* prop */ String, El] = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: Null, percent: Double): js.Function1[/* prop */ String, El] = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prop */ String, El]]
  
  inline def random(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def remove(targets: js.Array[AnimeTarget]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(targets.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def remove(targets: AnimeTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(targets.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("animejs", "running")
  @js.native
  val running: js.Array[AnimeInstance] = js.native
  
  inline def set(targets: AnimeTarget, value: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(targets.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDashoffset(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setDashoffset")().asInstanceOf[Double]
  inline def setDashoffset(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setDashoffset")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def setDashoffset(el: SVGElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setDashoffset")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("animejs", "speed")
  @js.native
  val speed: Double = js.native
  
  inline def stagger(value: String): FunctionBasedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: String, options: StaggerOptions): FunctionBasedParameter = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: js.Array[Double | String]): FunctionBasedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: js.Array[Double | String], options: StaggerOptions): FunctionBasedParameter = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: Double): FunctionBasedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: Double, options: StaggerOptions): FunctionBasedParameter = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionBasedParameter]
  
  // Timeline
  inline def timeline(): AnimeTimelineInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("timeline")().asInstanceOf[AnimeTimelineInstance]
  inline def timeline(params: js.Array[AnimeInstance]): AnimeTimelineInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("timeline")(params.asInstanceOf[js.Any]).asInstanceOf[AnimeTimelineInstance]
  inline def timeline(params: AnimeParams): AnimeTimelineInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("timeline")(params.asInstanceOf[js.Any]).asInstanceOf[AnimeTimelineInstance]
  
  // Helpers
  @JSImport("animejs", "version")
  @js.native
  val version: String = js.native
  
  trait Animatable extends StObject {
    
    var id: Double
    
    var target: HTMLElement
    
    var total: Double
    
    var transforms: js.Object
  }
  object Animatable {
    
    inline def apply(id: Double, target: HTMLElement, total: Double, transforms: js.Object): Animatable = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animatable]
    }
    
    extension [Self <: Animatable](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTransforms(value: js.Object): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    }
  }
  
  trait Animation extends StObject {
    
    var animatable: Animatable
    
    var currentValue: String
    
    var delay: Double
    
    var duration: Double
    
    var endDelay: Double
    
    var property: String
    
    var tweens: js.Array[js.Object]
    
    var `type`: String
  }
  object Animation {
    
    inline def apply(
      animatable: Animatable,
      currentValue: String,
      delay: Double,
      duration: Double,
      endDelay: Double,
      property: String,
      tweens: js.Array[js.Object],
      `type`: String
    ): Animation = {
      val __obj = js.Dynamic.literal(animatable = animatable.asInstanceOf[js.Any], currentValue = currentValue.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], endDelay = endDelay.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], tweens = tweens.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animation]
    }
    
    extension [Self <: Animation](x: Self) {
      
      inline def setAnimatable(value: Animatable): Self = StObject.set(x, "animatable", value.asInstanceOf[js.Any])
      
      inline def setCurrentValue(value: String): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEndDelay(value: Double): Self = StObject.set(x, "endDelay", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setTweens(value: js.Array[js.Object]): Self = StObject.set(x, "tweens", value.asInstanceOf[js.Any])
      
      inline def setTweensVarargs(value: js.Object*): Self = StObject.set(x, "tweens", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnimeAnimParams
    extends StObject
       with AnimeCallBack
       with /* AnyAnimatedProperty */ StringDictionary[Any] {
    
    var delay: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var duration: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var easing: js.UndefOr[
        EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
      ] = js.undefined
    
    var elasticity: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var endDelay: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var keyframes: js.UndefOr[js.Array[AnimeAnimParams]] = js.undefined
    
    var round: js.UndefOr[Double | Boolean | FunctionBasedParameter] = js.undefined
    
    var targets: js.UndefOr[AnimeTarget | js.Array[AnimeTarget]] = js.undefined
  }
  object AnimeAnimParams {
    
    inline def apply(): AnimeAnimParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimeAnimParams]
    }
    
    extension [Self <: AnimeAnimParams](x: Self) {
      
      inline def setDelay(value: Double | FunctionBasedParameter): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double | FunctionBasedParameter): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "duration", js.Any.fromFunction3(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(
        value: EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
      ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingFunction1(value: /* el */ HTMLElement => String): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingFunction3(
        value: (/* el */ HTMLElement, /* index */ Double, /* length */ Double) => js.Function1[/* time */ Double, Double]
      ): Self = StObject.set(x, "easing", js.Any.fromFunction3(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setElasticity(value: Double | FunctionBasedParameter): Self = StObject.set(x, "elasticity", value.asInstanceOf[js.Any])
      
      inline def setElasticityFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "elasticity", js.Any.fromFunction3(value))
      
      inline def setElasticityUndefined: Self = StObject.set(x, "elasticity", js.undefined)
      
      inline def setEndDelay(value: Double | FunctionBasedParameter): Self = StObject.set(x, "endDelay", value.asInstanceOf[js.Any])
      
      inline def setEndDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "endDelay", js.Any.fromFunction3(value))
      
      inline def setEndDelayUndefined: Self = StObject.set(x, "endDelay", js.undefined)
      
      inline def setKeyframes(value: js.Array[AnimeAnimParams]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      inline def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
      
      inline def setKeyframesVarargs(value: AnimeAnimParams*): Self = StObject.set(x, "keyframes", js.Array(value*))
      
      inline def setRound(value: Double | Boolean | FunctionBasedParameter): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "round", js.Any.fromFunction3(value))
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setTargets(value: AnimeTarget | js.Array[AnimeTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsNull: Self = StObject.set(x, "targets", null)
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: AnimeTarget*): Self = StObject.set(x, "targets", js.Array(value*))
    }
  }
  
  trait AnimeCallBack extends StObject {
    
    var begin: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var change: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var changeBegin: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var changeComplete: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var complete: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var loopBegin: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var loopComplete: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var update: js.UndefOr[AnimeCallbackFunction] = js.undefined
  }
  object AnimeCallBack {
    
    inline def apply(): AnimeCallBack = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimeCallBack]
    }
    
    extension [Self <: AnimeCallBack](x: Self) {
      
      inline def setBegin(value: /* anim */ AnimeInstance => Callback): Self = StObject.set(x, "begin", js.Any.fromFunction1((t0: /* anim */ AnimeInstance) => value(t0).runNow()))
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setChange(value: /* anim */ AnimeInstance => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* anim */ AnimeInstance) => value(t0).runNow()))
      
      inline def setChangeBegin(value: /* anim */ AnimeInstance => Callback): Self = StObject.set(x, "changeBegin", js.Any.fromFunction1((t0: /* anim */ AnimeInstance) => value(t0).runNow()))
      
      inline def setChangeBeginUndefined: Self = StObject.set(x, "changeBegin", js.undefined)
      
      inline def setChangeComplete(value: /* anim */ AnimeInstance => Callback): Self = StObject.set(x, "changeComplete", js.Any.fromFunction1((t0: /* anim */ AnimeInstance) => value(t0).runNow()))
      
      inline def setChangeCompleteUndefined: Self = StObject.set(x, "changeComplete", js.undefined)
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setComplete(value: /* anim */ AnimeInstance => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* anim */ AnimeInstance) => value(t0).runNow()))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setLoopBegin(value: /* anim */ AnimeInstance => Callback): Self = StObject.set(x, "loopBegin", js.Any.fromFunction1((t0: /* anim */ AnimeInstance) => value(t0).runNow()))
      
      inline def setLoopBeginUndefined: Self = StObject.set(x, "loopBegin", js.undefined)
      
      inline def setLoopComplete(value: /* anim */ AnimeInstance => Callback): Self = StObject.set(x, "loopComplete", js.Any.fromFunction1((t0: /* anim */ AnimeInstance) => value(t0).runNow()))
      
      inline def setLoopCompleteUndefined: Self = StObject.set(x, "loopComplete", js.undefined)
      
      inline def setUpdate(value: /* anim */ AnimeInstance => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* anim */ AnimeInstance) => value(t0).runNow()))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  type AnimeCallbackFunction = js.Function1[/* anim */ AnimeInstance, Unit]
  
  trait AnimeInstance
    extends StObject
       with AnimeCallBack {
    
    var animatables: js.Array[Animatable]
    
    var animations: js.Array[Animation]
    
    var autoplay: Boolean
    
    var began: Boolean
    
    var completed: Boolean
    
    var currentTime: Double
    
    var delay: Double
    
    var direction: String
    
    var duration: Double
    
    var finished: js.Promise[Unit]
    
    var loop: Double | Boolean
    
    def pause(): Unit
    
    var paused: Boolean
    
    def play(): Unit
    
    var progress: Double
    
    var remaining: Double
    
    def restart(): Unit
    
    def reverse(): Unit
    
    var reversed: Boolean
    
    def seek(time: Double): Unit
    
    def tick(time: Double): Unit
    
    var timelineOffset: Double
  }
  object AnimeInstance {
    
    inline def apply(
      animatables: js.Array[Animatable],
      animations: js.Array[Animation],
      autoplay: Boolean,
      began: Boolean,
      completed: Boolean,
      currentTime: Double,
      delay: Double,
      direction: String,
      duration: Double,
      finished: js.Promise[Unit],
      loop: Double | Boolean,
      pause: Callback,
      paused: Boolean,
      play: Callback,
      progress: Double,
      remaining: Double,
      restart: Callback,
      reverse: Callback,
      reversed: Boolean,
      seek: Double => Callback,
      tick: Double => Callback,
      timelineOffset: Double
    ): AnimeInstance = {
      val __obj = js.Dynamic.literal(animatables = animatables.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], began = began.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], pause = pause.toJsFn, paused = paused.asInstanceOf[js.Any], play = play.toJsFn, progress = progress.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], restart = restart.toJsFn, reverse = reverse.toJsFn, reversed = reversed.asInstanceOf[js.Any], seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), tick = js.Any.fromFunction1((t0: Double) => tick(t0).runNow()), timelineOffset = timelineOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimeInstance]
    }
    
    extension [Self <: AnimeInstance](x: Self) {
      
      inline def setAnimatables(value: js.Array[Animatable]): Self = StObject.set(x, "animatables", value.asInstanceOf[js.Any])
      
      inline def setAnimatablesVarargs(value: Animatable*): Self = StObject.set(x, "animatables", js.Array(value*))
      
      inline def setAnimations(value: js.Array[Animation]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setAnimationsVarargs(value: Animation*): Self = StObject.set(x, "animations", js.Array(value*))
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setBegan(value: Boolean): Self = StObject.set(x, "began", value.asInstanceOf[js.Any])
      
      inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFinished(value: js.Promise[Unit]): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setLoop(value: Double | Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      inline def setRestart(value: Callback): Self = StObject.set(x, "restart", value.toJsFn)
      
      inline def setReverse(value: Callback): Self = StObject.set(x, "reverse", value.toJsFn)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setTick(value: Double => Callback): Self = StObject.set(x, "tick", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setTimelineOffset(value: Double): Self = StObject.set(x, "timelineOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnimeInstanceParams
    extends StObject
       with AnimeCallBack {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var direction: js.UndefOr[DirectionOptions | String] = js.undefined
    
    var loop: js.UndefOr[Double | Boolean] = js.undefined
  }
  object AnimeInstanceParams {
    
    inline def apply(): AnimeInstanceParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimeInstanceParams]
    }
    
    extension [Self <: AnimeInstanceParams](x: Self) {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setDirection(value: DirectionOptions | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setLoop(value: Double | Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.animejs.mod.AnimeCallBack because Already inherited
  - typingsJapgolly.animejs.mod.AnimeAnimParams because var conflicts: begin, change, changeBegin, changeComplete, complete, loopBegin, loopComplete, update. Inlined targets, duration, delay, endDelay, elasticity, round, keyframes, easing */ trait AnimeParams
    extends StObject
       with AnimeInstanceParams
       with /* AnyAnimatedProperty */ StringDictionary[Any] {
    
    var delay: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var duration: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var easing: js.UndefOr[
        EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
      ] = js.undefined
    
    var elasticity: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var endDelay: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var keyframes: js.UndefOr[js.Array[AnimeAnimParams]] = js.undefined
    
    var round: js.UndefOr[Double | Boolean | FunctionBasedParameter] = js.undefined
    
    var targets: js.UndefOr[AnimeTarget | js.Array[AnimeTarget]] = js.undefined
  }
  object AnimeParams {
    
    inline def apply(): AnimeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimeParams]
    }
    
    extension [Self <: AnimeParams](x: Self) {
      
      inline def setDelay(value: Double | FunctionBasedParameter): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double | FunctionBasedParameter): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "duration", js.Any.fromFunction3(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(
        value: EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
      ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingFunction1(value: /* el */ HTMLElement => String): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingFunction3(
        value: (/* el */ HTMLElement, /* index */ Double, /* length */ Double) => js.Function1[/* time */ Double, Double]
      ): Self = StObject.set(x, "easing", js.Any.fromFunction3(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setElasticity(value: Double | FunctionBasedParameter): Self = StObject.set(x, "elasticity", value.asInstanceOf[js.Any])
      
      inline def setElasticityFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "elasticity", js.Any.fromFunction3(value))
      
      inline def setElasticityUndefined: Self = StObject.set(x, "elasticity", js.undefined)
      
      inline def setEndDelay(value: Double | FunctionBasedParameter): Self = StObject.set(x, "endDelay", value.asInstanceOf[js.Any])
      
      inline def setEndDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "endDelay", js.Any.fromFunction3(value))
      
      inline def setEndDelayUndefined: Self = StObject.set(x, "endDelay", js.undefined)
      
      inline def setKeyframes(value: js.Array[AnimeAnimParams]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      inline def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
      
      inline def setKeyframesVarargs(value: AnimeAnimParams*): Self = StObject.set(x, "keyframes", js.Array(value*))
      
      inline def setRound(value: Double | Boolean | FunctionBasedParameter): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "round", js.Any.fromFunction3(value))
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setTargets(value: AnimeTarget | js.Array[AnimeTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsNull: Self = StObject.set(x, "targets", null)
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: AnimeTarget*): Self = StObject.set(x, "targets", js.Array(value*))
    }
  }
  
  // Allowing null is necessary because DOM queries may not return anything.
  type AnimeTarget = String | js.Object | HTMLElement | SVGElement | NodeList[Node] | Null
  
  trait AnimeTimelineAnimParams
    extends StObject
       with AnimeAnimParams {
    
    var timelineOffset: Double | String | FunctionBasedParameter
  }
  object AnimeTimelineAnimParams {
    
    inline def apply(timelineOffset: Double | String | FunctionBasedParameter): AnimeTimelineAnimParams = {
      val __obj = js.Dynamic.literal(timelineOffset = timelineOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimeTimelineAnimParams]
    }
    
    extension [Self <: AnimeTimelineAnimParams](x: Self) {
      
      inline def setTimelineOffset(value: Double | String | FunctionBasedParameter): Self = StObject.set(x, "timelineOffset", value.asInstanceOf[js.Any])
      
      inline def setTimelineOffsetFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "timelineOffset", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait AnimeTimelineInstance
    extends StObject
       with AnimeInstance {
    
    def add(params: AnimeAnimParams): AnimeTimelineInstance = js.native
    def add(params: AnimeAnimParams, timelineOffset: String): AnimeTimelineInstance = js.native
    def add(params: AnimeAnimParams, timelineOffset: Double): AnimeTimelineInstance = js.native
  }
  
  type CustomEasingFunction = js.Function3[
    /* el */ HTMLElement, 
    /* index */ Double, 
    /* length */ Double, 
    js.Function1[/* time */ Double, Double]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.animejs.animejsStrings.reverse
    - typingsJapgolly.animejs.animejsStrings.alternate
    - typingsJapgolly.animejs.animejsStrings.normal
  */
  trait DirectionOptions extends StObject
  object DirectionOptions {
    
    inline def alternate: typingsJapgolly.animejs.animejsStrings.alternate = "alternate".asInstanceOf[typingsJapgolly.animejs.animejsStrings.alternate]
    
    inline def normal: typingsJapgolly.animejs.animejsStrings.normal = "normal".asInstanceOf[typingsJapgolly.animejs.animejsStrings.normal]
    
    inline def reverse: typingsJapgolly.animejs.animejsStrings.reverse = "reverse".asInstanceOf[typingsJapgolly.animejs.animejsStrings.reverse]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.animejs.animejsStrings.linear
    - typingsJapgolly.animejs.animejsStrings.easeInQuad
    - typingsJapgolly.animejs.animejsStrings.easeInCubic
    - typingsJapgolly.animejs.animejsStrings.easeInQuart
    - typingsJapgolly.animejs.animejsStrings.easeInQuint
    - typingsJapgolly.animejs.animejsStrings.easeInSine
    - typingsJapgolly.animejs.animejsStrings.easeInExpo
    - typingsJapgolly.animejs.animejsStrings.easeInCirc
    - typingsJapgolly.animejs.animejsStrings.easeInBack
    - typingsJapgolly.animejs.animejsStrings.easeInElastic
    - typingsJapgolly.animejs.animejsStrings.easeInBounce
    - typingsJapgolly.animejs.animejsStrings.easeOutQuad
    - typingsJapgolly.animejs.animejsStrings.easeOutCubic
    - typingsJapgolly.animejs.animejsStrings.easeOutQuart
    - typingsJapgolly.animejs.animejsStrings.easeOutQuint
    - typingsJapgolly.animejs.animejsStrings.easeOutSine
    - typingsJapgolly.animejs.animejsStrings.easeOutExpo
    - typingsJapgolly.animejs.animejsStrings.easeOutCirc
    - typingsJapgolly.animejs.animejsStrings.easeOutBack
    - typingsJapgolly.animejs.animejsStrings.easeOutElastic
    - typingsJapgolly.animejs.animejsStrings.easeOutBounce
    - typingsJapgolly.animejs.animejsStrings.easeInOutQuad
    - typingsJapgolly.animejs.animejsStrings.easeInOutCubic
    - typingsJapgolly.animejs.animejsStrings.easeInOutQuart
    - typingsJapgolly.animejs.animejsStrings.easeInOutQuint
    - typingsJapgolly.animejs.animejsStrings.easeInOutSine
    - typingsJapgolly.animejs.animejsStrings.easeInOutExpo
    - typingsJapgolly.animejs.animejsStrings.easeInOutCirc
    - typingsJapgolly.animejs.animejsStrings.easeInOutBack
    - typingsJapgolly.animejs.animejsStrings.easeInOutElastic
    - typingsJapgolly.animejs.animejsStrings.easeInOutBounce
  */
  trait EasingOptions extends StObject
  object EasingOptions {
    
    inline def easeInBack: typingsJapgolly.animejs.animejsStrings.easeInBack = "easeInBack".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInBack]
    
    inline def easeInBounce: typingsJapgolly.animejs.animejsStrings.easeInBounce = "easeInBounce".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInBounce]
    
    inline def easeInCirc: typingsJapgolly.animejs.animejsStrings.easeInCirc = "easeInCirc".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInCirc]
    
    inline def easeInCubic: typingsJapgolly.animejs.animejsStrings.easeInCubic = "easeInCubic".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInCubic]
    
    inline def easeInElastic: typingsJapgolly.animejs.animejsStrings.easeInElastic = "easeInElastic".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInElastic]
    
    inline def easeInExpo: typingsJapgolly.animejs.animejsStrings.easeInExpo = "easeInExpo".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInExpo]
    
    inline def easeInOutBack: typingsJapgolly.animejs.animejsStrings.easeInOutBack = "easeInOutBack".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInOutBack]
    
    inline def easeInOutBounce: typingsJapgolly.animejs.animejsStrings.easeInOutBounce = "easeInOutBounce".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInOutBounce]
    
    inline def easeInOutCirc: typingsJapgolly.animejs.animejsStrings.easeInOutCirc = "easeInOutCirc".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInOutCirc]
    
    inline def easeInOutCubic: typingsJapgolly.animejs.animejsStrings.easeInOutCubic = "easeInOutCubic".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInOutCubic]
    
    inline def easeInOutElastic: typingsJapgolly.animejs.animejsStrings.easeInOutElastic = "easeInOutElastic".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInOutElastic]
    
    inline def easeInOutExpo: typingsJapgolly.animejs.animejsStrings.easeInOutExpo = "easeInOutExpo".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInOutExpo]
    
    inline def easeInOutQuad: typingsJapgolly.animejs.animejsStrings.easeInOutQuad = "easeInOutQuad".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInOutQuad]
    
    inline def easeInOutQuart: typingsJapgolly.animejs.animejsStrings.easeInOutQuart = "easeInOutQuart".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInOutQuart]
    
    inline def easeInOutQuint: typingsJapgolly.animejs.animejsStrings.easeInOutQuint = "easeInOutQuint".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInOutQuint]
    
    inline def easeInOutSine: typingsJapgolly.animejs.animejsStrings.easeInOutSine = "easeInOutSine".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInOutSine]
    
    inline def easeInQuad: typingsJapgolly.animejs.animejsStrings.easeInQuad = "easeInQuad".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInQuad]
    
    inline def easeInQuart: typingsJapgolly.animejs.animejsStrings.easeInQuart = "easeInQuart".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInQuart]
    
    inline def easeInQuint: typingsJapgolly.animejs.animejsStrings.easeInQuint = "easeInQuint".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInQuint]
    
    inline def easeInSine: typingsJapgolly.animejs.animejsStrings.easeInSine = "easeInSine".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeInSine]
    
    inline def easeOutBack: typingsJapgolly.animejs.animejsStrings.easeOutBack = "easeOutBack".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeOutBack]
    
    inline def easeOutBounce: typingsJapgolly.animejs.animejsStrings.easeOutBounce = "easeOutBounce".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeOutBounce]
    
    inline def easeOutCirc: typingsJapgolly.animejs.animejsStrings.easeOutCirc = "easeOutCirc".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeOutCirc]
    
    inline def easeOutCubic: typingsJapgolly.animejs.animejsStrings.easeOutCubic = "easeOutCubic".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeOutCubic]
    
    inline def easeOutElastic: typingsJapgolly.animejs.animejsStrings.easeOutElastic = "easeOutElastic".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeOutElastic]
    
    inline def easeOutExpo: typingsJapgolly.animejs.animejsStrings.easeOutExpo = "easeOutExpo".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeOutExpo]
    
    inline def easeOutQuad: typingsJapgolly.animejs.animejsStrings.easeOutQuad = "easeOutQuad".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeOutQuad]
    
    inline def easeOutQuart: typingsJapgolly.animejs.animejsStrings.easeOutQuart = "easeOutQuart".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeOutQuart]
    
    inline def easeOutQuint: typingsJapgolly.animejs.animejsStrings.easeOutQuint = "easeOutQuint".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeOutQuint]
    
    inline def easeOutSine: typingsJapgolly.animejs.animejsStrings.easeOutSine = "easeOutSine".asInstanceOf[typingsJapgolly.animejs.animejsStrings.easeOutSine]
    
    inline def linear: typingsJapgolly.animejs.animejsStrings.linear = "linear".asInstanceOf[typingsJapgolly.animejs.animejsStrings.linear]
  }
  
  type FunctionBasedParameter = js.Function3[/* element */ HTMLElement, /* index */ Double, /* length */ Double, Double]
  
  trait StaggerOptions extends StObject {
    
    var axis: js.UndefOr[x | y] = js.undefined
    
    var direction: js.UndefOr[normal | reverse] = js.undefined
    
    var easing: js.UndefOr[CustomEasingFunction | String | EasingOptions] = js.undefined
    
    var from: js.UndefOr[first | last | center | Double] = js.undefined
    
    var grid: js.UndefOr[js.Array[Double]] = js.undefined
    
    var start: js.UndefOr[Double | String] = js.undefined
  }
  object StaggerOptions {
    
    inline def apply(): StaggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaggerOptions]
    }
    
    extension [Self <: StaggerOptions](x: Self) {
      
      inline def setAxis(value: typingsJapgolly.animejs.animejsStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setDirection(value: normal | reverse): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEasing(value: CustomEasingFunction | String | EasingOptions): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingFunction3(
        value: (/* el */ HTMLElement, /* index */ Double, /* length */ Double) => js.Function1[/* time */ Double, Double]
      ): Self = StObject.set(x, "easing", js.Any.fromFunction3(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setFrom(value: first | last | center | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGrid(value: js.Array[Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setGridVarargs(value: Double*): Self = StObject.set(x, "grid", js.Array(value*))
      
      inline def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
