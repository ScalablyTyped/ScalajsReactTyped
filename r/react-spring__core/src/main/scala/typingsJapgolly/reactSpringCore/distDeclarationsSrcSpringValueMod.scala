package typingsJapgolly.reactSpringCore

import typingsJapgolly.reactSpringCore.anon.Default
import typingsJapgolly.reactSpringCore.anon.From
import typingsJapgolly.reactSpringCore.anon.Loop
import typingsJapgolly.reactSpringCore.distDeclarationsSrcAnimationMod.Animation
import typingsJapgolly.reactSpringCore.distDeclarationsSrcFrameValueMod.FrameValue
import typingsJapgolly.reactSpringCore.distDeclarationsSrcRunAsyncMod.RunAsyncProps
import typingsJapgolly.reactSpringCore.distDeclarationsSrcRunAsyncMod.RunAsyncState
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesCommonMod.StringKeys
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnChange
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnPause
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnProps
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnRest
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnResume
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnStart
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesInternalMod.AnimationRange
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesInternalMod.AnimationResolver
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesObjectsMod.AnimationResult
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesObjectsMod.SpringConfig
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesPropsMod.EventProp
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesPropsMod.MatchProp
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesPropsMod.SpringProps
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesPropsMod.SpringUpdate
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesPropsMod.VelocityProp
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Extract
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcSpringValueMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/SpringValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-spring/core/dist/declarations/src/SpringValue", "SpringValue")
  @js.native
  open class SpringValue[T] () extends FrameValue[T] {
    def this(from: Exclude[T, js.Object]) = this()
    def this(props: SpringUpdate[T]) = this()
    def this(from: Exclude[T, js.Object], props: SpringUpdate[T]) = this()
    
    /** Update the `animation.to` value, which might be a `FluidValue` */
    /* protected */ def _focus(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> */ Any) | T
    ): Unit = js.native
    
    /** The counter for tracking `scheduleProps` calls */
    /* protected */ var _lastCallId: Double = js.native
    
    /** The last `scheduleProps` call that changed the `to` prop */
    /* protected */ var _lastToId: Double = js.native
    
    /* protected */ var _memoizedDuration: Double = js.native
    
    /** Merge props into the current animation */
    /* protected */ def _merge(
      range: AnimationRange[T],
      props: RunAsyncProps[SpringValue[T]],
      resolve: AnimationResolver[SpringValue[T]]
    ): Unit = js.native
    
    /* protected */ def _onStart(): Unit = js.native
    
    /** The promise resolvers of pending `start` calls */
    /* protected */ var _pendingCalls: Set[AnimationResolver[this.type]] = js.native
    
    /**
      * Parse the `to` and `from` range from the given `props` object.
      *
      * This also ensures the initial value is available to animated components
      * during the render phase.
      */
    /* protected */ def _prepareNode(props: Default): From = js.native
    
    /* protected */ def _resume(): Unit = js.native
    
    /**
      * Update the current value from outside the frameloop,
      * and return the `Animated` node.
      */
    /* protected */ def _set(
      arg: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> */ Any) | T
    ): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated */ Any
      ] = js.native
    /* protected */ def _set(
      arg: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> */ Any) | T,
      idle: Boolean
    ): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated */ Any
      ] = js.native
    
    /* protected */ def _start(): Unit = js.native
    
    /** The state for `runAsync` calls */
    /* protected */ var _state: RunAsyncState[SpringValue[T]] = js.native
    
    /**
      * Exit the frameloop and notify `onRest` listeners.
      *
      * Always wrap `_stop` calls with `batchedUpdates`.
      */
    /* protected */ def _stop(): Unit = js.native
    /* protected */ def _stop(goal: Any): Unit = js.native
    /* protected */ def _stop(goal: Any, cancel: Boolean): Unit = js.native
    /* protected */ def _stop(goal: Unit, cancel: Boolean): Unit = js.native
    
    /** Every update is processed by this method before merging. */
    /* protected */ def _update(hasProps: SpringProps[T]): js.Promise[AnimationResult[SpringValue[T]]] = js.native
    /* protected */ def _update(hasProps: SpringProps[T], isLoop: Boolean): js.Promise[AnimationResult[SpringValue[T]]] = js.native
    
    /** The animation state */
    var animation: Animation[T] = js.native
    
    /** Some props have customizable default values */
    var defaultProps: DefaultSpringProps[T] = js.native
    
    /** Skip to the end of the current animation. */
    def finish(): this.type = js.native
    
    def goal: T = js.native
    
    /**
      * When true, this value has been animated at least once.
      */
    def hasAnimated: Boolean = js.native
    
    /**
      * When true, this value has an unfinished animation,
      * which is either active or paused.
      */
    def isAnimating: Boolean = js.native
    
    /**
      *
      *
      */
    def isDelayed: js.UndefOr[Boolean] = js.native
    
    /**
      * When true, all current and future animations are paused.
      */
    def isPaused: Boolean = js.native
    
    /**
      * Freeze the active animation in time, as well as any updates merged
      * before `resume` is called.
      */
    def pause(): Unit = js.native
    
    /** The queue of pending props */
    var queue: js.UndefOr[js.Array[SpringUpdate[T]]] = js.native
    
    /** Restart the animation. */
    def reset(): Unit = js.native
    
    /** Resume the animation if paused. */
    def resume(): Unit = js.native
    
    /** Set the current value, while stopping the current animation */
    def set(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> */ Any) | T
    ): this.type = js.native
    
    /**
      * Update this value's animation using the queue of pending props,
      * and unpause the current animation (if one is frozen).
      *
      * When arguments are passed, a new animation is created, and the
      * queued animations are left alone.
      */
    def start(): js.Promise[AnimationResult[this.type]] = js.native
    def start(props: SpringUpdate[T]): js.Promise[AnimationResult[this.type]] = js.native
    def start(to: T): js.Promise[AnimationResult[this.type]] = js.native
    def start(to: T, props: SpringProps[T]): js.Promise[AnimationResult[this.type]] = js.native
    
    /**
      * Stop the current animation, and cancel any delayed updates.
      *
      * Pass `true` to call `onRest` with `cancelled: true`.
      */
    def stop(): this.type = js.native
    def stop(cancel: Boolean): this.type = js.native
    
    /** Push props into the pending queue. */
    def update(props: SpringUpdate[T]): this.type = js.native
    
    def velocity: VelocityProp[T] = js.native
  }
  
  inline def createLoopUpdate[T](props: T & Loop): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoopUpdate")(props.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def createLoopUpdate[T](props: T & Loop, loop: Any): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoopUpdate")(props.asInstanceOf[js.Any], loop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def createLoopUpdate[T](props: T & Loop, loop: Any, to: Any): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoopUpdate")(props.asInstanceOf[js.Any], loop.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def createLoopUpdate[T](props: T & Loop, loop: Unit, to: Any): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoopUpdate")(props.asInstanceOf[js.Any], loop.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def createUpdate(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createUpdate")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def declareUpdate(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("declareUpdate")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* Inlined parent std.Pick<@react-spring/core.@react-spring/core/dist/declarations/src/types.SpringProps<T>, 'pause' | 'cancel' | 'immediate' | 'config'> */
  /* Inlined parent @react-spring/core.@react-spring/core/dist/declarations/src/types/internal.PickEventFns<@react-spring/core.@react-spring/core/dist/declarations/src/types.SpringProps<T>> */
  trait DefaultSpringProps[T] extends StObject {
    
    var cancel: js.UndefOr[MatchProp[T]] = js.undefined
    
    var config: js.UndefOr[SpringConfig | (js.Function1[/* key */ StringKeys[T], SpringConfig])] = js.undefined
    
    var immediate: js.UndefOr[MatchProp[T]] = js.undefined
    
    var onChange: js.UndefOr[
        Extract[js.UndefOr[EventProp[OnChange[SpringValue[T], SpringValue[T], Unit]]], js.Function]
      ] = js.undefined
    
    var onPause: js.UndefOr[
        Extract[js.UndefOr[EventProp[OnPause[SpringValue[T], SpringValue[T], Unit]]], js.Function]
      ] = js.undefined
    
    var onProps: js.UndefOr[Extract[js.UndefOr[EventProp[OnProps[T]]], js.Function]] = js.undefined
    
    var onRest: js.UndefOr[
        Extract[js.UndefOr[EventProp[OnRest[SpringValue[T], SpringValue[T], Unit]]], js.Function]
      ] = js.undefined
    
    var onResume: js.UndefOr[
        Extract[js.UndefOr[EventProp[OnResume[SpringValue[T], SpringValue[T], Unit]]], js.Function]
      ] = js.undefined
    
    var onStart: js.UndefOr[
        Extract[js.UndefOr[EventProp[OnStart[SpringValue[T], SpringValue[T], Unit]]], js.Function]
      ] = js.undefined
    
    var pause: js.UndefOr[MatchProp[T]] = js.undefined
  }
  object DefaultSpringProps {
    
    inline def apply[T](): DefaultSpringProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultSpringProps[T]]
    }
    
    extension [Self <: DefaultSpringProps[?], T](x: Self & DefaultSpringProps[T]) {
      
      inline def setCancel(value: MatchProp[T]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCancelVarargs(value: StringKeys[T]*): Self = StObject.set(x, "cancel", js.Array(value*))
      
      inline def setConfig(value: SpringConfig | (js.Function1[/* key */ StringKeys[T], SpringConfig])): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigFunction1(value: /* key */ StringKeys[T] => SpringConfig): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setImmediate(value: MatchProp[T]): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "immediate", js.Any.fromFunction1(value))
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setImmediateVarargs(value: StringKeys[T]*): Self = StObject.set(x, "immediate", js.Array(value*))
      
      inline def setOnChange(value: Extract[js.UndefOr[EventProp[OnChange[SpringValue[T], SpringValue[T], Unit]]], js.Function]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnPause(value: Extract[js.UndefOr[EventProp[OnPause[SpringValue[T], SpringValue[T], Unit]]], js.Function]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnProps(value: Extract[js.UndefOr[EventProp[OnProps[T]]], js.Function]): Self = StObject.set(x, "onProps", value.asInstanceOf[js.Any])
      
      inline def setOnPropsUndefined: Self = StObject.set(x, "onProps", js.undefined)
      
      inline def setOnRest(value: Extract[js.UndefOr[EventProp[OnRest[SpringValue[T], SpringValue[T], Unit]]], js.Function]): Self = StObject.set(x, "onRest", value.asInstanceOf[js.Any])
      
      inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      inline def setOnResume(value: Extract[js.UndefOr[EventProp[OnResume[SpringValue[T], SpringValue[T], Unit]]], js.Function]): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
      
      inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
      
      inline def setOnStart(value: Extract[js.UndefOr[EventProp[OnStart[SpringValue[T], SpringValue[T], Unit]]], js.Function]): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setPause(value: MatchProp[T]): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPauseVarargs(value: StringKeys[T]*): Self = StObject.set(x, "pause", js.Array(value*))
    }
  }
}
