package typingsJapgolly.reactSpringCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactSpringCore.anon.ToForwardProps
import typingsJapgolly.reactSpringCore.anon.ToUndefined
import typingsJapgolly.reactSpringCore.anon.`7`
import typingsJapgolly.reactSpringCore.distDeclarationsSrcControllerMod.Controller
import typingsJapgolly.reactSpringCore.distDeclarationsSrcSpringRefMod.SpringRef
import typingsJapgolly.reactSpringCore.distDeclarationsSrcSpringValueMod.SpringValue
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesCommonMod.RawValues
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesCommonMod.StringKeys
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnChange
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnPause
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnProps
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnResolve
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnRest
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnResume
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.OnStart
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.SpringToFn
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesObjectsMod.SpringConfig
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.callId
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.cancel
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.children
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.config
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.default
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.delay
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.enter
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.expires
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.from
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.immediate
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.initial
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.items
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.keys
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.leave
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.loop
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.parentId
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.pause
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.ref
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.reset
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.reverse
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.sort
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.to
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.trail
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.update
import typingsJapgolly.reactSpringTypes.utilMod.Constrain
import typingsJapgolly.reactSpringTypes.utilMod.Falsy
import typingsJapgolly.reactSpringTypes.utilMod.Lookup
import typingsJapgolly.reactSpringTypes.utilMod.Merge
import typingsJapgolly.reactSpringTypes.utilMod.OneOrMore
import typingsJapgolly.reactSpringTypes.utilMod.Remap
import typingsJapgolly.reactSpringTypes.utilMod.UnknownProps
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTypesPropsMod {
  
  trait AnimationProps[T] extends StObject {
    
    /**
      * Override the default props with this update.
      */
    var default: js.UndefOr[Boolean | SpringProps[T]] = js.undefined
    
    /**
      * Cancel all animations by using `true`, or some animations by using a key
      * or an array of keys.
      */
    var cancel: js.UndefOr[MatchProp[T]] = js.undefined
    
    /**
      * Configure the spring behavior for each key.
      */
    var config: js.UndefOr[SpringConfig | (js.Function1[/* key */ StringKeys[T], SpringConfig])] = js.undefined
    
    /**
      * Milliseconds to wait before applying the other props.
      */
    var delay: js.UndefOr[Double | (js.Function1[/* key */ StringKeys[T], Double])] = js.undefined
    
    /**
      * When true, props jump to their goal values instead of animating.
      */
    var immediate: js.UndefOr[MatchProp[T]] = js.undefined
    
    /**
      * Pause all animations by using `true`, or some animations by using a key
      * or an array of keys.
      */
    var pause: js.UndefOr[MatchProp[T]] = js.undefined
    
    /**
      * Start the next animations at their values in the `from` prop.
      */
    var reset: js.UndefOr[MatchProp[T]] = js.undefined
    
    /**
      * Swap the `to` and `from` props.
      */
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object AnimationProps {
    
    inline def apply[T](): AnimationProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationProps[T]]
    }
    
    extension [Self <: AnimationProps[?], T](x: Self & AnimationProps[T]) {
      
      inline def setCancel(value: MatchProp[T]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCancelVarargs(value: StringKeys[T]*): Self = StObject.set(x, "cancel", js.Array(value*))
      
      inline def setConfig(value: SpringConfig | (js.Function1[/* key */ StringKeys[T], SpringConfig])): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigFunction1(value: /* key */ StringKeys[T] => SpringConfig): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDefault(value: Boolean | SpringProps[T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDelay(value: Double | (js.Function1[/* key */ StringKeys[T], Double])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayFunction1(value: /* key */ StringKeys[T] => Double): Self = StObject.set(x, "delay", js.Any.fromFunction1(value))
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setImmediate(value: MatchProp[T]): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "immediate", js.Any.fromFunction1(value))
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setImmediateVarargs(value: StringKeys[T]*): Self = StObject.set(x, "immediate", js.Array(value*))
      
      inline def setPause(value: MatchProp[T]): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPauseVarargs(value: StringKeys[T]*): Self = StObject.set(x, "pause", js.Array(value*))
      
      inline def setReset(value: MatchProp[T]): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetFunction1(value: /* key */ StringKeys[T] => Boolean): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setResetVarargs(value: StringKeys[T]*): Self = StObject.set(x, "reset", js.Array(value*))
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  trait ControllerProps[State /* <: Lookup[Any] */, Item]
    extends StObject
       with AnimationProps[State] {
    
    var from: js.UndefOr[GoalValues[State] | Falsy] = js.undefined
    
    var loop: js.UndefOr[LoopProp[ControllerUpdate[Lookup[Any], Unit]]] = js.undefined
    
    /**
      * Called once per frame when animations are active
      *
      * Also accepts an object for per-key events
      */
    var onChange: js.UndefOr[
        (OnChange[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.OnChange<@react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<State[P]>, @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<State>, Item>} */ js.Any)
      ] = js.undefined
    
    var onPause: js.UndefOr[
        (OnPause[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.OnPause<@react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<State[P]>, @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<State>, Item>} */ js.Any)
      ] = js.undefined
    
    /**
      * Called after an animation is updated by new props.
      * Useful for manipulation
      *
      * Also accepts an object for per-key events
      */
    var onProps: js.UndefOr[
        OnProps[State] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.OnProps<State[P]>} */ js.Any)
      ] = js.undefined
    
    /**
      * Called when the promise for this update is resolved.
      */
    var onResolve: js.UndefOr[OnResolve[SpringValue[State], Controller[State], Item]] = js.undefined
    
    /**
      * Called when the # of animating values hits 0
      *
      * Also accepts an object for per-key events
      */
    var onRest: js.UndefOr[
        (OnRest[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.OnRest<@react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<State[P]>, @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<State>, Item>} */ js.Any)
      ] = js.undefined
    
    var onResume: js.UndefOr[
        (OnResume[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.OnResume<@react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<State[P]>, @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<State>, Item>} */ js.Any)
      ] = js.undefined
    
    /**
      * Called when the # of animating values exceeds 0
      *
      * Also accepts an object for per-key events
      */
    var onStart: js.UndefOr[
        (OnStart[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.OnStart<@react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<State[P]>, @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<State>, Item>} */ js.Any)
      ] = js.undefined
    
    var ref: js.UndefOr[SpringRef[State]] = js.undefined
  }
  object ControllerProps {
    
    inline def apply[State /* <: Lookup[Any] */, Item](): ControllerProps[State, Item] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControllerProps[State, Item]]
    }
    
    extension [Self <: ControllerProps[?, ?], State /* <: Lookup[Any] */, Item](x: Self & (ControllerProps[State, Item])) {
      
      inline def setFrom(value: GoalValues[State] | Falsy): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromNull: Self = StObject.set(x, "from", null)
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLoop(value: LoopProp[ControllerUpdate[Lookup[Any], Unit]]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopCallbackTo(value: CallbackTo[Boolean | (ControllerUpdate[Lookup[Any], Unit])]): Self = StObject.set(x, "loop", value.toJsFn)
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnChange(
        value: (OnChange[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.OnChange<@react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<State[P]>, @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<State>, Item>} */ js.Any)
      ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnPause(
        value: (OnPause[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.OnPause<@react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<State[P]>, @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<State>, Item>} */ js.Any)
      ): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnProps(
        value: OnProps[State] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.OnProps<State[P]>} */ js.Any)
      ): Self = StObject.set(x, "onProps", value.asInstanceOf[js.Any])
      
      inline def setOnPropsFunction2(value: (/* props */ SpringProps[State], /* spring */ SpringValue[State]) => Callback): Self = StObject.set(x, "onProps", js.Any.fromFunction2((t0: /* props */ SpringProps[State], t1: /* spring */ SpringValue[State]) => (value(t0, t1)).runNow()))
      
      inline def setOnPropsUndefined: Self = StObject.set(x, "onProps", js.undefined)
      
      inline def setOnResolve(value: OnResolve[SpringValue[State], Controller[State], Item]): Self = StObject.set(x, "onResolve", value.asInstanceOf[js.Any])
      
      inline def setOnResolveUndefined: Self = StObject.set(x, "onResolve", js.undefined)
      
      inline def setOnRest(
        value: (OnRest[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.OnRest<@react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<State[P]>, @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<State>, Item>} */ js.Any)
      ): Self = StObject.set(x, "onRest", value.asInstanceOf[js.Any])
      
      inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      inline def setOnResume(
        value: (OnResume[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.OnResume<@react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<State[P]>, @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<State>, Item>} */ js.Any)
      ): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
      
      inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
      
      inline def setOnStart(
        value: (OnStart[SpringValue[State], Controller[State], Item]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof State ]:? @react-spring/core.@react-spring/core/dist/declarations/src/types/functions.OnStart<@react-spring/core.@react-spring/core/dist/declarations/src/SpringValue.SpringValue<State[P]>, @react-spring/core.@react-spring/core/dist/declarations/src/Controller.Controller<State>, Item>} */ js.Any)
      ): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setRef(value: SpringRef[State]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  type ControllerUpdate[State /* <: Lookup[Any] */, Item] = Any & ToProps[State] & (ControllerProps[State, Item])
  
  type EventProp[T] = T | Lookup[js.UndefOr[T]]
  
  type ForwardProps[T /* <: js.Object */] = RawValues[
    Omit[
      Constrain[T, js.Object], 
      config | from | to | ref | loop | pause | reset | cancel | reverse | immediate | default | delay | items | trail | sort | expires | initial | enter | update | leave | children | keys | callId | parentId
    ]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T] extends [@react-spring/core.@react-spring/core/dist/declarations/src/types/common.IsPlainObject<T>] ? @react-spring/core.@react-spring/core/dist/declarations/src/types/props.GoalValues<T> | @react-spring/types.@react-spring/types/util.Falsy : @react-spring/core.@react-spring/core/dist/declarations/src/types/props.GoalValue<T>
    }}}
    */
  @js.native
  trait GoalProp[T] extends StObject
  
  type GoalValue[T] = js.UndefOr[
    T | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> */ Any) | UnknownProps | Null
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidProps<T> * / any extends infer Props ? {[ P in keyof Props ]:? Props[P] | null} : never
    }}}
    */
  @js.native
  trait GoalValues[T] extends StObject
  
  type InferTo[T /* <: js.Object */] = Merge[
    ToForwardProps[T], 
    Pick[
      T, 
      (/* keyof T */ String) & (config | from | to | ref | loop | pause | reset | cancel | reverse | immediate | default | delay | items | trail | sort | expires | initial | enter | update | leave | children | keys | callId | parentId)
    ]
  ]
  
  type InlineToProps[T] = Remap[GoalValues[T] & ToUndefined]
  
  type LoopProp[T /* <: js.Object */] = Boolean | T | (js.Function0[Boolean | T])
  
  type MatchProp[T] = Boolean | OneOrMore[StringKeys[T]] | (js.Function1[/* key */ StringKeys[T], Boolean])
  
  type PickAnimated[Props /* <: js.Object */, Fwd] = Any & (/* import warning: importer.ImportType#apply Failed type conversion: [Props] extends [@react-spring/types.@react-spring/types.Any] ? @react-spring/types.@react-spring/types/util.Lookup<any> : [object] extends [Props] ? @react-spring/types.@react-spring/types/util.Lookup<any> : @react-spring/types.@react-spring/types/util.ObjectFromUnion<Props extends {  from :infer From} ? From extends (): any ? std.ReturnType<From> : @react-spring/types.@react-spring/types/util.ObjectType<From> : @react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionKey & keyof Props extends never ? @react-spring/core.@react-spring/core/dist/declarations/src/types/props.ToValues<Props, Fwd> : @react-spring/core.@react-spring/core/dist/declarations/src/types/transition.TransitionValues<Props>> */ js.Any)
  
  trait ReservedEventProps extends StObject {
    
    var onChange: js.UndefOr[Any] = js.undefined
    
    var onDestroyed: js.UndefOr[Any] = js.undefined
    
    var onPause: js.UndefOr[Any] = js.undefined
    
    var onProps: js.UndefOr[Any] = js.undefined
    
    var onResolve: js.UndefOr[Any] = js.undefined
    
    var onRest: js.UndefOr[Any] = js.undefined
    
    var onResume: js.UndefOr[Any] = js.undefined
    
    var onStart: js.UndefOr[Any] = js.undefined
  }
  object ReservedEventProps {
    
    inline def apply(): ReservedEventProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReservedEventProps]
    }
    
    extension [Self <: ReservedEventProps](x: Self) {
      
      inline def setOnChange(value: Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDestroyed(value: Any): Self = StObject.set(x, "onDestroyed", value.asInstanceOf[js.Any])
      
      inline def setOnDestroyedUndefined: Self = StObject.set(x, "onDestroyed", js.undefined)
      
      inline def setOnPause(value: Any): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnProps(value: Any): Self = StObject.set(x, "onProps", value.asInstanceOf[js.Any])
      
      inline def setOnPropsUndefined: Self = StObject.set(x, "onProps", js.undefined)
      
      inline def setOnResolve(value: Any): Self = StObject.set(x, "onResolve", value.asInstanceOf[js.Any])
      
      inline def setOnResolveUndefined: Self = StObject.set(x, "onResolve", js.undefined)
      
      inline def setOnRest(value: Any): Self = StObject.set(x, "onRest", value.asInstanceOf[js.Any])
      
      inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      inline def setOnResume(value: Any): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
      
      inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
      
      inline def setOnStart(value: Any): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
  
  trait ReservedProps
    extends StObject
       with ReservedEventProps {
    
    var default: js.UndefOr[Any] = js.undefined
    
    var callId: js.UndefOr[Any] = js.undefined
    
    var cancel: js.UndefOr[Any] = js.undefined
    
    var children: js.UndefOr[Any] = js.undefined
    
    var config: js.UndefOr[Any] = js.undefined
    
    var delay: js.UndefOr[Any] = js.undefined
    
    var enter: js.UndefOr[Any] = js.undefined
    
    var expires: js.UndefOr[Any] = js.undefined
    
    var from: js.UndefOr[Any] = js.undefined
    
    var immediate: js.UndefOr[Any] = js.undefined
    
    var initial: js.UndefOr[Any] = js.undefined
    
    var items: js.UndefOr[Any] = js.undefined
    
    var keys: js.UndefOr[Any] = js.undefined
    
    var leave: js.UndefOr[Any] = js.undefined
    
    var loop: js.UndefOr[Any] = js.undefined
    
    var parentId: js.UndefOr[Any] = js.undefined
    
    var pause: js.UndefOr[Any] = js.undefined
    
    var ref: js.UndefOr[Any] = js.undefined
    
    var reset: js.UndefOr[Any] = js.undefined
    
    var reverse: js.UndefOr[Any] = js.undefined
    
    var sort: js.UndefOr[Any] = js.undefined
    
    var to: js.UndefOr[Any] = js.undefined
    
    var trail: js.UndefOr[Any] = js.undefined
    
    var update: js.UndefOr[Any] = js.undefined
  }
  object ReservedProps {
    
    inline def apply(): ReservedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReservedProps]
    }
    
    extension [Self <: ReservedProps](x: Self) {
      
      inline def setCallId(value: Any): Self = StObject.set(x, "callId", value.asInstanceOf[js.Any])
      
      inline def setCallIdUndefined: Self = StObject.set(x, "callId", js.undefined)
      
      inline def setCancel(value: Any): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDelay(value: Any): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEnter(value: Any): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExpires(value: Any): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setFrom(value: Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setImmediate(value: Any): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setInitial(value: Any): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setKeys(value: Any): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setLeave(value: Any): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
      
      inline def setLoop(value: Any): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setParentId(value: Any): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setPause(value: Any): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setRef(value: Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setReset(value: Any): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setReverse(value: Any): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSort(value: Any): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setTo(value: Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setTrail(value: Any): Self = StObject.set(x, "trail", value.asInstanceOf[js.Any])
      
      inline def setTrailUndefined: Self = StObject.set(x, "trail", js.undefined)
      
      inline def setUpdate(value: Any): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  type SpringChain[T] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core/dist/declarations/src/types/common.IsPlainObject<T>] ? @react-spring/core.@react-spring/core/dist/declarations/src/types/props.ControllerUpdate<T, undefined> : @react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringTo<T> | @react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringUpdate<T> */ js.Any
  ]
  
  trait SpringProps[T]
    extends StObject
       with AnimationProps[T] {
    
    var from: js.UndefOr[GoalValue[T]] = js.undefined
    
    var loop: js.UndefOr[LoopProp[SpringUpdate[Any]]] = js.undefined
    
    /**
      * Called when a spring has its value changed.
      */
    var onChange: js.UndefOr[EventProp[OnChange[SpringValue[T], SpringValue[T], Unit]]] = js.undefined
    
    var onPause: js.UndefOr[EventProp[OnPause[SpringValue[T], SpringValue[T], Unit]]] = js.undefined
    
    /**
      * Called after an animation is updated by new props,
      * even if the animation remains idle.
      */
    var onProps: js.UndefOr[EventProp[OnProps[T]]] = js.undefined
    
    /**
      * Called when all animations come to a stand-still.
      */
    var onRest: js.UndefOr[EventProp[OnRest[SpringValue[T], SpringValue[T], Unit]]] = js.undefined
    
    var onResume: js.UndefOr[EventProp[OnResume[SpringValue[T], SpringValue[T], Unit]]] = js.undefined
    
    /**
      * Called when an animation moves for the first time.
      */
    var onStart: js.UndefOr[EventProp[OnStart[SpringValue[T], SpringValue[T], Unit]]] = js.undefined
  }
  object SpringProps {
    
    inline def apply[T](): SpringProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpringProps[T]]
    }
    
    extension [Self <: SpringProps[?], T](x: Self & SpringProps[T]) {
      
      inline def setFrom(value: GoalValue[T]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromNull: Self = StObject.set(x, "from", null)
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLoop(value: LoopProp[SpringUpdate[Any]]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopCallbackTo(value: CallbackTo[Boolean | SpringUpdate[Any]]): Self = StObject.set(x, "loop", value.toJsFn)
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnChange(value: EventProp[OnChange[SpringValue[T], SpringValue[T], Unit]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnPause(value: EventProp[OnPause[SpringValue[T], SpringValue[T], Unit]]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnProps(value: EventProp[OnProps[T]]): Self = StObject.set(x, "onProps", value.asInstanceOf[js.Any])
      
      inline def setOnPropsFunction2(value: (/* props */ SpringProps[T], /* spring */ SpringValue[T]) => Callback): Self = StObject.set(x, "onProps", js.Any.fromFunction2((t0: /* props */ SpringProps[T], t1: /* spring */ SpringValue[T]) => (value(t0, t1)).runNow()))
      
      inline def setOnPropsUndefined: Self = StObject.set(x, "onProps", js.undefined)
      
      inline def setOnRest(value: EventProp[OnRest[SpringValue[T], SpringValue[T], Unit]]): Self = StObject.set(x, "onRest", value.asInstanceOf[js.Any])
      
      inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      inline def setOnResume(value: EventProp[OnResume[SpringValue[T], SpringValue[T], Unit]]): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
      
      inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
      
      inline def setOnStart(value: EventProp[OnStart[SpringValue[T], SpringValue[T], Unit]]): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
  
  type SpringTo[T] = (/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core/dist/declarations/src/types/common.IsPlainObject<T>] ? never : T | / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> * / any */ js.Any) | SpringChain[T] | SpringToFn[T] | Falsy
  
  type SpringUpdate[T] = ToProps[T] & SpringProps[T]
  
  type SpringsUpdate[State /* <: Lookup[Any] */] = (OneOrMore[ControllerUpdate[State, Unit]]) | (js.Function2[
    /* index */ Double, 
    /* ctrl */ Controller[State], 
    (ControllerUpdate[State, Unit]) | Null
  ])
  
  type ToProps[T] = `7`[T] | (/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core/dist/declarations/src/types/common.IsPlainObject<T>] ? @react-spring/core.@react-spring/core/dist/declarations/src/types/props.InlineToProps<T> : never */ js.Any)
  
  /**
    * Pick the values of the `to` prop. Forward props are *not* included.
    */
  type ToValues[Props /* <: js.Object */, AndForward] = Any & (/* import warning: importer.ImportType#apply Failed type conversion: AndForward extends true ? @react-spring/core.@react-spring/core/dist/declarations/src/types/props.ForwardProps<Props> : unknown */ js.Any)
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.ReadonlyArray<number | string> ? std.Array<number> : number
    }}}
    */
  @js.native
  trait VelocityProp[T] extends StObject
}
