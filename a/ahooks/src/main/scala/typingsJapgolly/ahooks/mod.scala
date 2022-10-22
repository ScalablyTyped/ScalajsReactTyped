package typingsJapgolly.ahooks

import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.BeforeUnloadEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DeviceMotionEvent
import org.scalajs.dom.DeviceOrientationEvent
import org.scalajs.dom.Document
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Element
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.GamepadEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HashChangeEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MessageEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.MutationObserverInit
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.PopStateEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.StorageEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import org.scalajs.dom.Window
import typingsJapgolly.ahooks.ahooksStrings.DOMContentLoaded
import typingsJapgolly.ahooks.ahooksStrings.abort
import typingsJapgolly.ahooks.ahooksStrings.afterprint
import typingsJapgolly.ahooks.ahooksStrings.animationcancel
import typingsJapgolly.ahooks.ahooksStrings.animationend
import typingsJapgolly.ahooks.ahooksStrings.animationiteration
import typingsJapgolly.ahooks.ahooksStrings.animationstart
import typingsJapgolly.ahooks.ahooksStrings.auxclick
import typingsJapgolly.ahooks.ahooksStrings.beforeinput
import typingsJapgolly.ahooks.ahooksStrings.beforeprint
import typingsJapgolly.ahooks.ahooksStrings.beforeunload
import typingsJapgolly.ahooks.ahooksStrings.blur
import typingsJapgolly.ahooks.ahooksStrings.canplay
import typingsJapgolly.ahooks.ahooksStrings.canplaythrough
import typingsJapgolly.ahooks.ahooksStrings.change
import typingsJapgolly.ahooks.ahooksStrings.click
import typingsJapgolly.ahooks.ahooksStrings.close
import typingsJapgolly.ahooks.ahooksStrings.compositionend
import typingsJapgolly.ahooks.ahooksStrings.compositionstart
import typingsJapgolly.ahooks.ahooksStrings.compositionupdate
import typingsJapgolly.ahooks.ahooksStrings.contextmenu
import typingsJapgolly.ahooks.ahooksStrings.copy
import typingsJapgolly.ahooks.ahooksStrings.cuechange
import typingsJapgolly.ahooks.ahooksStrings.cut
import typingsJapgolly.ahooks.ahooksStrings.dblclick
import typingsJapgolly.ahooks.ahooksStrings.devicemotion
import typingsJapgolly.ahooks.ahooksStrings.deviceorientation
import typingsJapgolly.ahooks.ahooksStrings.drag
import typingsJapgolly.ahooks.ahooksStrings.dragend
import typingsJapgolly.ahooks.ahooksStrings.dragenter
import typingsJapgolly.ahooks.ahooksStrings.dragleave
import typingsJapgolly.ahooks.ahooksStrings.dragover
import typingsJapgolly.ahooks.ahooksStrings.dragstart
import typingsJapgolly.ahooks.ahooksStrings.drop
import typingsJapgolly.ahooks.ahooksStrings.durationchange
import typingsJapgolly.ahooks.ahooksStrings.emptied
import typingsJapgolly.ahooks.ahooksStrings.ended
import typingsJapgolly.ahooks.ahooksStrings.error
import typingsJapgolly.ahooks.ahooksStrings.focus
import typingsJapgolly.ahooks.ahooksStrings.focusin
import typingsJapgolly.ahooks.ahooksStrings.focusout
import typingsJapgolly.ahooks.ahooksStrings.formdata
import typingsJapgolly.ahooks.ahooksStrings.fullscreenchange
import typingsJapgolly.ahooks.ahooksStrings.fullscreenerror
import typingsJapgolly.ahooks.ahooksStrings.gamepadconnected
import typingsJapgolly.ahooks.ahooksStrings.gamepaddisconnected
import typingsJapgolly.ahooks.ahooksStrings.gotpointercapture
import typingsJapgolly.ahooks.ahooksStrings.hashchange
import typingsJapgolly.ahooks.ahooksStrings.input
import typingsJapgolly.ahooks.ahooksStrings.invalid
import typingsJapgolly.ahooks.ahooksStrings.keydown
import typingsJapgolly.ahooks.ahooksStrings.keypress
import typingsJapgolly.ahooks.ahooksStrings.keyup
import typingsJapgolly.ahooks.ahooksStrings.languagechange
import typingsJapgolly.ahooks.ahooksStrings.load
import typingsJapgolly.ahooks.ahooksStrings.loadeddata
import typingsJapgolly.ahooks.ahooksStrings.loadedmetadata
import typingsJapgolly.ahooks.ahooksStrings.loadstart
import typingsJapgolly.ahooks.ahooksStrings.lostpointercapture
import typingsJapgolly.ahooks.ahooksStrings.message
import typingsJapgolly.ahooks.ahooksStrings.messageerror
import typingsJapgolly.ahooks.ahooksStrings.mousedown
import typingsJapgolly.ahooks.ahooksStrings.mouseenter
import typingsJapgolly.ahooks.ahooksStrings.mouseleave
import typingsJapgolly.ahooks.ahooksStrings.mousemove
import typingsJapgolly.ahooks.ahooksStrings.mouseout
import typingsJapgolly.ahooks.ahooksStrings.mouseover
import typingsJapgolly.ahooks.ahooksStrings.mouseup
import typingsJapgolly.ahooks.ahooksStrings.offline
import typingsJapgolly.ahooks.ahooksStrings.online
import typingsJapgolly.ahooks.ahooksStrings.orientationchange
import typingsJapgolly.ahooks.ahooksStrings.pagehide
import typingsJapgolly.ahooks.ahooksStrings.pageshow
import typingsJapgolly.ahooks.ahooksStrings.paste
import typingsJapgolly.ahooks.ahooksStrings.pause
import typingsJapgolly.ahooks.ahooksStrings.play
import typingsJapgolly.ahooks.ahooksStrings.playing
import typingsJapgolly.ahooks.ahooksStrings.pointercancel
import typingsJapgolly.ahooks.ahooksStrings.pointerdown
import typingsJapgolly.ahooks.ahooksStrings.pointerenter
import typingsJapgolly.ahooks.ahooksStrings.pointerleave
import typingsJapgolly.ahooks.ahooksStrings.pointerlockchange
import typingsJapgolly.ahooks.ahooksStrings.pointerlockerror
import typingsJapgolly.ahooks.ahooksStrings.pointermove
import typingsJapgolly.ahooks.ahooksStrings.pointerout
import typingsJapgolly.ahooks.ahooksStrings.pointerover
import typingsJapgolly.ahooks.ahooksStrings.pointerup
import typingsJapgolly.ahooks.ahooksStrings.popstate
import typingsJapgolly.ahooks.ahooksStrings.progress
import typingsJapgolly.ahooks.ahooksStrings.ratechange
import typingsJapgolly.ahooks.ahooksStrings.readystatechange
import typingsJapgolly.ahooks.ahooksStrings.rejectionhandled
import typingsJapgolly.ahooks.ahooksStrings.reset
import typingsJapgolly.ahooks.ahooksStrings.resize
import typingsJapgolly.ahooks.ahooksStrings.scroll
import typingsJapgolly.ahooks.ahooksStrings.securitypolicyviolation
import typingsJapgolly.ahooks.ahooksStrings.seeked
import typingsJapgolly.ahooks.ahooksStrings.seeking
import typingsJapgolly.ahooks.ahooksStrings.select
import typingsJapgolly.ahooks.ahooksStrings.selectionchange
import typingsJapgolly.ahooks.ahooksStrings.selectstart
import typingsJapgolly.ahooks.ahooksStrings.slotchange
import typingsJapgolly.ahooks.ahooksStrings.stalled
import typingsJapgolly.ahooks.ahooksStrings.storage
import typingsJapgolly.ahooks.ahooksStrings.submit
import typingsJapgolly.ahooks.ahooksStrings.suspend
import typingsJapgolly.ahooks.ahooksStrings.timeupdate
import typingsJapgolly.ahooks.ahooksStrings.toggle
import typingsJapgolly.ahooks.ahooksStrings.touchcancel
import typingsJapgolly.ahooks.ahooksStrings.touchend
import typingsJapgolly.ahooks.ahooksStrings.touchmove
import typingsJapgolly.ahooks.ahooksStrings.touchstart
import typingsJapgolly.ahooks.ahooksStrings.transitioncancel
import typingsJapgolly.ahooks.ahooksStrings.transitionend
import typingsJapgolly.ahooks.ahooksStrings.transitionrun
import typingsJapgolly.ahooks.ahooksStrings.transitionstart
import typingsJapgolly.ahooks.ahooksStrings.unhandledrejection
import typingsJapgolly.ahooks.ahooksStrings.unload
import typingsJapgolly.ahooks.ahooksStrings.visibilitychange
import typingsJapgolly.ahooks.ahooksStrings.volumechange
import typingsJapgolly.ahooks.ahooksStrings.waiting
import typingsJapgolly.ahooks.ahooksStrings.webkitanimationend
import typingsJapgolly.ahooks.ahooksStrings.webkitanimationiteration
import typingsJapgolly.ahooks.ahooksStrings.webkitanimationstart
import typingsJapgolly.ahooks.ahooksStrings.webkittransitionend
import typingsJapgolly.ahooks.ahooksStrings.wheel
import typingsJapgolly.ahooks.anon.Add
import typingsJapgolly.ahooks.anon.AllSelected
import typingsJapgolly.ahooks.anon.Back
import typingsJapgolly.ahooks.anon.Cancel
import typingsJapgolly.ahooks.anon.Dec
import typingsJapgolly.ahooks.anon.EnterFullscreen
import typingsJapgolly.ahooks.anon.Flush
import typingsJapgolly.ahooks.anon.FnCall
import typingsJapgolly.ahooks.anon.Get
import typingsJapgolly.ahooks.anon.GetIndex
import typingsJapgolly.ahooks.anon.Immediate
import typingsJapgolly.ahooks.anon.Index
import typingsJapgolly.ahooks.anon.OnChange
import typingsJapgolly.ahooks.libCreateUpdateEffectMod.EffectHookType
import typingsJapgolly.ahooks.libCreateUseStorageStateMod.IFuncUpdater
import typingsJapgolly.ahooks.libUseAntdTableTypesMod.AntdTableOptions
import typingsJapgolly.ahooks.libUseAntdTableTypesMod.AntdTableResult
import typingsJapgolly.ahooks.libUseAntdTableTypesMod.Data
import typingsJapgolly.ahooks.libUseAntdTableTypesMod.Params
import typingsJapgolly.ahooks.libUseAntdTableTypesMod.Service
import typingsJapgolly.ahooks.libUseBooleanMod.Actions
import typingsJapgolly.ahooks.libUseControllableValueMod.Options
import typingsJapgolly.ahooks.libUseControllableValueMod.Props
import typingsJapgolly.ahooks.libUseControllableValueMod.StandardProps
import typingsJapgolly.ahooks.libUseCookieStateMod.State
import typingsJapgolly.ahooks.libUseCountDownMod.FormattedRes
import typingsJapgolly.ahooks.libUseDebounceDebounceOptionsMod.DebounceOptions
import typingsJapgolly.ahooks.libUseDebounceFnMod.noop
import typingsJapgolly.ahooks.libUseDocumentVisibilityMod.VisibilityState
import typingsJapgolly.ahooks.libUseEventEmitterMod.EventEmitter
import typingsJapgolly.ahooks.libUseEventListenerMod.Target
import typingsJapgolly.ahooks.libUseExternalMod.Status
import typingsJapgolly.ahooks.libUseFusionTableTypesMod.FusionTableOptions
import typingsJapgolly.ahooks.libUseFusionTableTypesMod.FusionTableResult
import typingsJapgolly.ahooks.libUseGetStateMod.GetStateAction
import typingsJapgolly.ahooks.libUseInfiniteScrollTypesMod.InfiniteScrollOptions
import typingsJapgolly.ahooks.libUseKeyPressMod.EventHandler
import typingsJapgolly.ahooks.libUseKeyPressMod.KeyFilter
import typingsJapgolly.ahooks.libUseLongPressMod.EventType
import typingsJapgolly.ahooks.libUseMouseMod.CursorState
import typingsJapgolly.ahooks.libUseNetworkMod.NetworkState
import typingsJapgolly.ahooks.libUsePaginationTypesMod.PaginationOptions
import typingsJapgolly.ahooks.libUsePaginationTypesMod.PaginationResult
import typingsJapgolly.ahooks.libUsePreviousMod.ShouldUpdateFunc
import typingsJapgolly.ahooks.libUseRequestSrcTypesMod.Plugin
import typingsJapgolly.ahooks.libUseRequestSrcTypesMod.Result
import typingsJapgolly.ahooks.libUseResetStateMod.ResetState
import typingsJapgolly.ahooks.libUseResponsiveMod.ResponsiveConfig
import typingsJapgolly.ahooks.libUseScrollMod.Position
import typingsJapgolly.ahooks.libUseScrollMod.ScrollListenController
import typingsJapgolly.ahooks.libUseSetStateMod.SetState
import typingsJapgolly.ahooks.libUseSizeMod.Size
import typingsJapgolly.ahooks.libUseThrottleThrottleOptionsMod.ThrottleOptions
import typingsJapgolly.ahooks.libUseTrackedEffectMod.Effect
import typingsJapgolly.ahooks.libUseWhyDidYouUpdateMod.IProps
import typingsJapgolly.ahooks.libUtilsDomTargetMod.BasicTarget
import typingsJapgolly.jsCookie.mod.CookieAttributes
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.EffectCallback
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.Map
import typingsJapgolly.std.MutationCallback
import typingsJapgolly.std.PageTransitionEvent
import typingsJapgolly.std.PromiseRejectionEvent
import typingsJapgolly.std.Record
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.Set
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ahooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  inline def clearCache(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearCache(key: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def configResponsive(config: ResponsiveConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configResponsive")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createUpdateEffect(hook: EffectHookType): EffectHookType = ^.asInstanceOf[js.Dynamic].applyDynamic("createUpdateEffect")(hook.asInstanceOf[js.Any]).asInstanceOf[EffectHookType]
  
  inline def useAntdTable[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams]): AntdTableResult[TData, TParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAntdTable")(service.asInstanceOf[js.Any]).asInstanceOf[AntdTableResult[TData, TParams]]
  inline def useAntdTable[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams], options: AntdTableOptions[TData, TParams]): AntdTableResult[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAntdTable")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AntdTableResult[TData, TParams]]
  
  inline def useAsyncEffect(effect: js.Function0[(AsyncGenerator[Unit, Unit, Unit]) | js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useAsyncEffect(effect: js.Function0[(AsyncGenerator[Unit, Unit, Unit]) | js.Promise[Unit]], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useBoolean(): js.Tuple2[Boolean, Actions] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBoolean")().asInstanceOf[js.Tuple2[Boolean, Actions]]
  inline def useBoolean(defaultValue: Boolean): js.Tuple2[Boolean, Actions] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBoolean")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Actions]]
  
  inline def useClickAway[T /* <: Event */](onClickAway: js.Function1[/* event */ T, Unit], target: js.Array[BasicTarget[Element]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useClickAway")(onClickAway.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useClickAway[T /* <: Event */](
    onClickAway: js.Function1[/* event */ T, Unit],
    target: js.Array[BasicTarget[Element]],
    eventName: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useClickAway")(onClickAway.asInstanceOf[js.Any], target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useClickAway[T /* <: Event */](
    onClickAway: js.Function1[/* event */ T, Unit],
    target: js.Array[BasicTarget[Element]],
    eventName: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useClickAway")(onClickAway.asInstanceOf[js.Any], target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useClickAway[T /* <: Event */](onClickAway: js.Function1[/* event */ T, Unit], target: BasicTarget[Element]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useClickAway")(onClickAway.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useClickAway[T /* <: Event */](onClickAway: js.Function1[/* event */ T, Unit], target: BasicTarget[Element], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useClickAway")(onClickAway.asInstanceOf[js.Any], target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useClickAway[T /* <: Event */](
    onClickAway: js.Function1[/* event */ T, Unit],
    target: BasicTarget[Element],
    eventName: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useClickAway")(onClickAway.asInstanceOf[js.Any], target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useControllableValue[T](): js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")().asInstanceOf[js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]]]
  inline def useControllableValue[T](props: Unit, options: Options[T]): js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]]]
  inline def useControllableValue[T](props: Props): js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]]]
  inline def useControllableValue[T](props: Props, options: Options[T]): js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, js.Function2[/* v */ SetStateAction[T], /* repeated */ Any, Unit]]]
  inline def useControllableValue[T](props: StandardProps[T]): js.Tuple2[T, js.Function1[/* v */ SetStateAction[T], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* v */ SetStateAction[T], Unit]]]
  
  inline def useCookieState(cookieKey: String): js.Tuple2[
    js.UndefOr[String], 
    js.Function2[
      /* newValue */ js.UndefOr[String | (js.Function1[/* prevState */ State, State])], 
      /* newOptions */ js.UndefOr[CookieAttributes], 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCookieState")(cookieKey.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.UndefOr[String], 
    js.Function2[
      /* newValue */ js.UndefOr[String | (js.Function1[/* prevState */ State, State])], 
      /* newOptions */ js.UndefOr[CookieAttributes], 
      Unit
    ]
  ]]
  inline def useCookieState(cookieKey: String, options: typingsJapgolly.ahooks.libUseCookieStateMod.Options): js.Tuple2[
    js.UndefOr[String], 
    js.Function2[
      /* newValue */ js.UndefOr[String | (js.Function1[/* prevState */ State, State])], 
      /* newOptions */ js.UndefOr[CookieAttributes], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCookieState")(cookieKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[String], 
    js.Function2[
      /* newValue */ js.UndefOr[String | (js.Function1[/* prevState */ State, State])], 
      /* newOptions */ js.UndefOr[CookieAttributes], 
      Unit
    ]
  ]]
  
  inline def useCountDown(): js.Tuple2[Double, FormattedRes] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCountDown")().asInstanceOf[js.Tuple2[Double, FormattedRes]]
  inline def useCountDown(options: typingsJapgolly.ahooks.libUseCountDownMod.Options): js.Tuple2[Double, FormattedRes] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCountDown")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, FormattedRes]]
  
  inline def useCounter(): js.Tuple2[Double, Dec] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCounter")().asInstanceOf[js.Tuple2[Double, Dec]]
  inline def useCounter(initialValue: Double): js.Tuple2[Double, Dec] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCounter")(initialValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Dec]]
  inline def useCounter(initialValue: Double, options: typingsJapgolly.ahooks.libUseCounterMod.Options): js.Tuple2[Double, Dec] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCounter")(initialValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Dec]]
  inline def useCounter(initialValue: Unit, options: typingsJapgolly.ahooks.libUseCounterMod.Options): js.Tuple2[Double, Dec] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCounter")(initialValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Dec]]
  
  inline def useCreation[T](factory: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCreation")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useDebounce[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebounce")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useDebounce[T](value: T, options: DebounceOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounce")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useDebounceEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useDebounceEffect(effect: EffectCallback, deps: Unit, options: DebounceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDebounceEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDebounceEffect(effect: EffectCallback, deps: DependencyList, options: DebounceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDebounceFn[T /* <: noop */](fn: T): Cancel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceFn")(fn.asInstanceOf[js.Any]).asInstanceOf[Cancel[T]]
  inline def useDebounceFn[T /* <: noop */](fn: T, options: DebounceOptions): Cancel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceFn")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cancel[T]]
  
  @JSImport("ahooks", "useDeepCompareEffect")
  @js.native
  val useDeepCompareEffect: FnCall = js.native
  
  @JSImport("ahooks", "useDeepCompareLayoutEffect")
  @js.native
  val useDeepCompareLayoutEffect: FnCall = js.native
  
  inline def useDocumentVisibility(): VisibilityState = ^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentVisibility")().asInstanceOf[VisibilityState]
  
  inline def useDrag[T](data: T, target: BasicTarget[Element]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDrag")(data.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDrag[T](data: T, target: BasicTarget[Element], options: typingsJapgolly.ahooks.libUseDragMod.Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDrag")(data.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDrop(target: BasicTarget[Element]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrop")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useDrop(target: BasicTarget[Element], options: typingsJapgolly.ahooks.libUseDropMod.Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDrop")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useDynamicList[T](): GetIndex[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDynamicList")().asInstanceOf[GetIndex[T]]
  inline def useDynamicList[T](initialList: js.Array[T]): GetIndex[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDynamicList")(initialList.asInstanceOf[js.Any]).asInstanceOf[GetIndex[T]]
  
  inline def useEventEmitter[T](): EventEmitter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventEmitter")().asInstanceOf[EventEmitter[T]]
  
  inline def useEventListener(
    eventName: String,
    handler: typingsJapgolly.ahooks.libUseEventListenerMod.noop,
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Target]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_DOMContentLoaded(eventName: DOMContentLoaded, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_DOMContentLoaded(
    eventName: DOMContentLoaded,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_abort(eventName: abort, handler: js.Function1[/* ev */ UIEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort(
    eventName: abort,
    handler: js.Function1[/* ev */ UIEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_afterprint(eventName: afterprint, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_afterprint(
    eventName: afterprint,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationcancel(eventName: animationcancel, handler: js.Function1[/* ev */ AnimationEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel(
    eventName: animationcancel,
    handler: js.Function1[/* ev */ AnimationEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationend(eventName: animationend, handler: js.Function1[/* ev */ AnimationEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend(
    eventName: animationend,
    handler: js.Function1[/* ev */ AnimationEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationiteration(eventName: animationiteration, handler: js.Function1[/* ev */ AnimationEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration(
    eventName: animationiteration,
    handler: js.Function1[/* ev */ AnimationEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationstart(eventName: animationstart, handler: js.Function1[/* ev */ AnimationEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart(
    eventName: animationstart,
    handler: js.Function1[/* ev */ AnimationEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_auxclick(eventName: auxclick, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick(
    eventName: auxclick,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_beforeinput(eventName: beforeinput, handler: js.Function1[/* ev */ InputEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeinput(
    eventName: beforeinput,
    handler: js.Function1[/* ev */ InputEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_beforeprint(eventName: beforeprint, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeprint(
    eventName: beforeprint,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_beforeunload(eventName: beforeunload, handler: js.Function1[/* ev */ BeforeUnloadEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeunload(
    eventName: beforeunload,
    handler: js.Function1[/* ev */ BeforeUnloadEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_blur(eventName: blur, handler: js.Function1[/* ev */ FocusEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur(
    eventName: blur,
    handler: js.Function1[/* ev */ FocusEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_canplay(eventName: canplay, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay(
    eventName: canplay,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_canplaythrough(eventName: canplaythrough, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough(
    eventName: canplaythrough,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_change(eventName: change, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change(
    eventName: change,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_click(eventName: click, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click(
    eventName: click,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_close(eventName: close, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close(
    eventName: close,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_compositionend(eventName: compositionend, handler: js.Function1[/* ev */ CompositionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionend(
    eventName: compositionend,
    handler: js.Function1[/* ev */ CompositionEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_compositionstart(eventName: compositionstart, handler: js.Function1[/* ev */ CompositionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionstart(
    eventName: compositionstart,
    handler: js.Function1[/* ev */ CompositionEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_compositionupdate(eventName: compositionupdate, handler: js.Function1[/* ev */ CompositionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionupdate(
    eventName: compositionupdate,
    handler: js.Function1[/* ev */ CompositionEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_contextmenu(eventName: contextmenu, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu(
    eventName: contextmenu,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_copy(eventName: copy, handler: js.Function1[/* ev */ ClipboardEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_copy(
    eventName: copy,
    handler: js.Function1[/* ev */ ClipboardEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_cuechange(eventName: cuechange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange(
    eventName: cuechange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_cut(eventName: cut, handler: js.Function1[/* ev */ ClipboardEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cut(
    eventName: cut,
    handler: js.Function1[/* ev */ ClipboardEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dblclick(eventName: dblclick, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick(
    eventName: dblclick,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_devicemotion(eventName: devicemotion, handler: js.Function1[/* ev */ DeviceMotionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_devicemotion(
    eventName: devicemotion,
    handler: js.Function1[/* ev */ DeviceMotionEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_deviceorientation(eventName: deviceorientation, handler: js.Function1[/* ev */ DeviceOrientationEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_deviceorientation(
    eventName: deviceorientation,
    handler: js.Function1[/* ev */ DeviceOrientationEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_drag(eventName: drag, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag(
    eventName: drag,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragend(eventName: dragend, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend(
    eventName: dragend,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragenter(eventName: dragenter, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter(
    eventName: dragenter,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragleave(eventName: dragleave, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave(
    eventName: dragleave,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragover(eventName: dragover, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover(
    eventName: dragover,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragstart(eventName: dragstart, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart(
    eventName: dragstart,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_drop(eventName: drop, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop(
    eventName: drop,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_durationchange(eventName: durationchange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange(
    eventName: durationchange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_emptied(eventName: emptied, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied(
    eventName: emptied,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_ended(eventName: ended, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended(
    eventName: ended,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_error(eventName: error, handler: js.Function1[/* ev */ ErrorEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error(
    eventName: error,
    handler: js.Function1[/* ev */ ErrorEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_focus(eventName: focus, handler: js.Function1[/* ev */ FocusEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus(
    eventName: focus,
    handler: js.Function1[/* ev */ FocusEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_focusin(eventName: focusin, handler: js.Function1[/* ev */ FocusEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin(
    eventName: focusin,
    handler: js.Function1[/* ev */ FocusEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_focusout(eventName: focusout, handler: js.Function1[/* ev */ FocusEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout(
    eventName: focusout,
    handler: js.Function1[/* ev */ FocusEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_formdata(eventName: formdata, handler: js.Function1[/* ev */ FormDataEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_formdata(
    eventName: formdata,
    handler: js.Function1[/* ev */ FormDataEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_fullscreenchange(eventName: fullscreenchange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenchange(
    eventName: fullscreenchange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | Element | HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_fullscreenerror(eventName: fullscreenerror, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenerror(
    eventName: fullscreenerror,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | Element | HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_gamepadconnected(eventName: gamepadconnected, handler: js.Function1[/* ev */ GamepadEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gamepadconnected(
    eventName: gamepadconnected,
    handler: js.Function1[/* ev */ GamepadEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_gamepaddisconnected(eventName: gamepaddisconnected, handler: js.Function1[/* ev */ GamepadEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gamepaddisconnected(
    eventName: gamepaddisconnected,
    handler: js.Function1[/* ev */ GamepadEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_gotpointercapture(eventName: gotpointercapture, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture(
    eventName: gotpointercapture,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_hashchange(eventName: hashchange, handler: js.Function1[/* ev */ HashChangeEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_hashchange(
    eventName: hashchange,
    handler: js.Function1[/* ev */ HashChangeEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_input(eventName: input, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input(
    eventName: input,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_invalid(eventName: invalid, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid(
    eventName: invalid,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_keydown(eventName: keydown, handler: js.Function1[/* ev */ KeyboardEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown(
    eventName: keydown,
    handler: js.Function1[/* ev */ KeyboardEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_keypress(eventName: keypress, handler: js.Function1[/* ev */ KeyboardEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress(
    eventName: keypress,
    handler: js.Function1[/* ev */ KeyboardEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_keyup(eventName: keyup, handler: js.Function1[/* ev */ KeyboardEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup(
    eventName: keyup,
    handler: js.Function1[/* ev */ KeyboardEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_languagechange(eventName: languagechange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_languagechange(
    eventName: languagechange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_load(eventName: load, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load(
    eventName: load,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_loadeddata(eventName: loadeddata, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata(
    eventName: loadeddata,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_loadedmetadata(eventName: loadedmetadata, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata(
    eventName: loadedmetadata,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_loadstart(eventName: loadstart, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart(
    eventName: loadstart,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_lostpointercapture(eventName: lostpointercapture, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture(
    eventName: lostpointercapture,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_message(eventName: message, handler: js.Function1[/* ev */ MessageEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_message(
    eventName: message,
    handler: js.Function1[/* ev */ MessageEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_messageerror(eventName: messageerror, handler: js.Function1[/* ev */ MessageEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_messageerror(
    eventName: messageerror,
    handler: js.Function1[/* ev */ MessageEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mousedown(eventName: mousedown, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown(
    eventName: mousedown,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseenter(eventName: mouseenter, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter(
    eventName: mouseenter,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseleave(eventName: mouseleave, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave(
    eventName: mouseleave,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mousemove(eventName: mousemove, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove(
    eventName: mousemove,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseout(eventName: mouseout, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout(
    eventName: mouseout,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseover(eventName: mouseover, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover(
    eventName: mouseover,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseup(eventName: mouseup, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup(
    eventName: mouseup,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_offline(eventName: offline, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_offline(
    eventName: offline,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_online(eventName: online, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_online(
    eventName: online,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_orientationchange(eventName: orientationchange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_orientationchange(
    eventName: orientationchange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pagehide(eventName: pagehide, handler: js.Function1[/* ev */ PageTransitionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pagehide(
    eventName: pagehide,
    handler: js.Function1[/* ev */ PageTransitionEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pageshow(eventName: pageshow, handler: js.Function1[/* ev */ PageTransitionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pageshow(
    eventName: pageshow,
    handler: js.Function1[/* ev */ PageTransitionEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_paste(eventName: paste, handler: js.Function1[/* ev */ ClipboardEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_paste(
    eventName: paste,
    handler: js.Function1[/* ev */ ClipboardEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pause(eventName: pause, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause(
    eventName: pause,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_play(eventName: play, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play(
    eventName: play,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_playing(eventName: playing, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing(
    eventName: playing,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointercancel(eventName: pointercancel, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel(
    eventName: pointercancel,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerdown(eventName: pointerdown, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown(
    eventName: pointerdown,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerenter(eventName: pointerenter, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter(
    eventName: pointerenter,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerleave(eventName: pointerleave, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave(
    eventName: pointerleave,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerlockchange(eventName: pointerlockchange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockchange(
    eventName: pointerlockchange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerlockerror(eventName: pointerlockerror, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockerror(
    eventName: pointerlockerror,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointermove(eventName: pointermove, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove(
    eventName: pointermove,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerout(eventName: pointerout, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout(
    eventName: pointerout,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerover(eventName: pointerover, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover(
    eventName: pointerover,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerup(eventName: pointerup, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup(
    eventName: pointerup,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_popstate(eventName: popstate, handler: js.Function1[/* ev */ PopStateEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_popstate(
    eventName: popstate,
    handler: js.Function1[/* ev */ PopStateEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_progress(eventName: progress, handler: js.Function1[/* ev */ ProgressEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress(
    eventName: progress,
    handler: js.Function1[/* ev */ ProgressEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_ratechange(eventName: ratechange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange(
    eventName: ratechange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_readystatechange(eventName: readystatechange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_readystatechange(
    eventName: readystatechange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_rejectionhandled(eventName: rejectionhandled, handler: js.Function1[/* ev */ PromiseRejectionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_rejectionhandled(
    eventName: rejectionhandled,
    handler: js.Function1[/* ev */ PromiseRejectionEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_reset(eventName: reset, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset(
    eventName: reset,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_resize(eventName: resize, handler: js.Function1[/* ev */ UIEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize(
    eventName: resize,
    handler: js.Function1[/* ev */ UIEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_scroll(eventName: scroll, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll(
    eventName: scroll,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: js.Function1[/* ev */ SecurityPolicyViolationEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: js.Function1[/* ev */ SecurityPolicyViolationEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_seeked(eventName: seeked, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked(
    eventName: seeked,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_seeking(eventName: seeking, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking(
    eventName: seeking,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_select(eventName: select, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select(
    eventName: select,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_selectionchange(eventName: selectionchange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange(
    eventName: selectionchange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_selectstart(eventName: selectstart, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart(
    eventName: selectstart,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_slotchange(eventName: slotchange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_slotchange(
    eventName: slotchange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_stalled(eventName: stalled, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled(
    eventName: stalled,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_storage(eventName: storage, handler: js.Function1[/* ev */ StorageEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_storage(
    eventName: storage,
    handler: js.Function1[/* ev */ StorageEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_submit(eventName: submit, handler: js.Function1[/* ev */ SubmitEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit(
    eventName: submit,
    handler: js.Function1[/* ev */ SubmitEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_suspend(eventName: suspend, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend(
    eventName: suspend,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_timeupdate(eventName: timeupdate, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate(
    eventName: timeupdate,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_toggle(eventName: toggle, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle(
    eventName: toggle,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchcancel(eventName: touchcancel, handler: js.Function1[/* ev */ TouchEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel(
    eventName: touchcancel,
    handler: js.Function1[/* ev */ TouchEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchend(eventName: touchend, handler: js.Function1[/* ev */ TouchEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend(
    eventName: touchend,
    handler: js.Function1[/* ev */ TouchEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchmove(eventName: touchmove, handler: js.Function1[/* ev */ TouchEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove(
    eventName: touchmove,
    handler: js.Function1[/* ev */ TouchEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchstart(eventName: touchstart, handler: js.Function1[/* ev */ TouchEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart(
    eventName: touchstart,
    handler: js.Function1[/* ev */ TouchEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitioncancel(eventName: transitioncancel, handler: js.Function1[/* ev */ TransitionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel(
    eventName: transitioncancel,
    handler: js.Function1[/* ev */ TransitionEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitionend(eventName: transitionend, handler: js.Function1[/* ev */ TransitionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend(
    eventName: transitionend,
    handler: js.Function1[/* ev */ TransitionEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitionrun(eventName: transitionrun, handler: js.Function1[/* ev */ TransitionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun(
    eventName: transitionrun,
    handler: js.Function1[/* ev */ TransitionEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitionstart(eventName: transitionstart, handler: js.Function1[/* ev */ TransitionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart(
    eventName: transitionstart,
    handler: js.Function1[/* ev */ TransitionEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_unhandledrejection(eventName: unhandledrejection, handler: js.Function1[/* ev */ PromiseRejectionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unhandledrejection(
    eventName: unhandledrejection,
    handler: js.Function1[/* ev */ PromiseRejectionEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_unload(eventName: unload, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_unload(
    eventName: unload,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_visibilitychange(eventName: visibilitychange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_visibilitychange(
    eventName: visibilitychange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_volumechange(eventName: volumechange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange(
    eventName: volumechange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_waiting(eventName: waiting, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting(
    eventName: waiting,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_webkitanimationend(eventName: webkitanimationend, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationend(
    eventName: webkitanimationend,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_webkitanimationiteration(eventName: webkitanimationiteration, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationiteration(
    eventName: webkitanimationiteration,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_webkitanimationstart(eventName: webkitanimationstart, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationstart(
    eventName: webkitanimationstart,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_webkittransitionend(eventName: webkittransitionend, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkittransitionend(
    eventName: webkittransitionend,
    handler: js.Function1[/* ev */ Event, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_wheel(eventName: wheel, handler: js.Function1[/* ev */ WheelEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel(
    eventName: wheel,
    handler: js.Function1[/* ev */ WheelEvent, Unit],
    options: typingsJapgolly.ahooks.libUseEventListenerMod.Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventTarget[T, U](): js.Tuple2[js.UndefOr[T], OnChange[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventTarget")().asInstanceOf[js.Tuple2[js.UndefOr[T], OnChange[U]]]
  inline def useEventTarget[T, U](options: typingsJapgolly.ahooks.libUseEventTargetMod.Options[T, U]): js.Tuple2[js.UndefOr[T], OnChange[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventTarget")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[T], OnChange[U]]]
  
  inline def useExternal(): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("useExternal")().asInstanceOf[Status]
  inline def useExternal(path: String): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("useExternal")(path.asInstanceOf[js.Any]).asInstanceOf[Status]
  inline def useExternal(path: String, options: typingsJapgolly.ahooks.libUseExternalMod.Options): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("useExternal")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Status]
  inline def useExternal(path: Unit, options: typingsJapgolly.ahooks.libUseExternalMod.Options): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("useExternal")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Status]
  
  inline def useFavicon(href: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFavicon")(href.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useFocusWithin(target: BasicTarget[Element]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def useFocusWithin(target: BasicTarget[Element], options: typingsJapgolly.ahooks.libUseFocusWithinMod.Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useFullscreen(target: BasicTarget[Element]): js.Tuple2[Boolean, EnterFullscreen] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullscreen")(target.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, EnterFullscreen]]
  inline def useFullscreen(target: BasicTarget[Element], options: typingsJapgolly.ahooks.libUseFullscreenMod.Options): js.Tuple2[Boolean, EnterFullscreen] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFullscreen")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, EnterFullscreen]]
  
  inline def useFusionTable[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams]): FusionTableResult[TData, TParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFusionTable")(service.asInstanceOf[js.Any]).asInstanceOf[FusionTableResult[TData, TParams]]
  inline def useFusionTable[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams], options: FusionTableOptions[TData, TParams]): FusionTableResult[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFusionTable")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FusionTableResult[TData, TParams]]
  
  inline def useGetState[S](): js.Tuple3[
    js.UndefOr[S], 
    Dispatch[SetStateAction[js.UndefOr[S]]], 
    GetStateAction[js.UndefOr[S]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGetState")().asInstanceOf[js.Tuple3[
    js.UndefOr[S], 
    Dispatch[SetStateAction[js.UndefOr[S]]], 
    GetStateAction[js.UndefOr[S]]
  ]]
  inline def useGetState[S](initialState: S): js.Tuple3[S, Dispatch[SetStateAction[S]], GetStateAction[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGetState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[S, Dispatch[SetStateAction[S]], GetStateAction[S]]]
  inline def useGetState[S](initialState: js.Function0[S]): js.Tuple3[S, Dispatch[SetStateAction[S]], GetStateAction[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGetState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[S, Dispatch[SetStateAction[S]], GetStateAction[S]]]
  
  inline def useHistoryTravel[T](): Back[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHistoryTravel")().asInstanceOf[Back[T]]
  inline def useHistoryTravel[T](initialValue: T): Back[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHistoryTravel")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Back[T]]
  
  inline def useHover(target: BasicTarget[Element]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useHover")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def useHover(target: BasicTarget[Element], options: typingsJapgolly.ahooks.libUseHoverMod.Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useHover")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useInViewport(target: BasicTarget[Element]): js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInViewport")(target.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Double]]]
  inline def useInViewport(target: BasicTarget[Element], options: typingsJapgolly.ahooks.libUseInViewportMod.Options): js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInViewport")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Double]]]
  
  inline def useInfiniteScroll[TData /* <: typingsJapgolly.ahooks.libUseInfiniteScrollTypesMod.Data */](service: typingsJapgolly.ahooks.libUseInfiniteScrollTypesMod.Service[TData]): typingsJapgolly.ahooks.anon.Data[TData] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteScroll")(service.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ahooks.anon.Data[TData]]
  inline def useInfiniteScroll[TData /* <: typingsJapgolly.ahooks.libUseInfiniteScrollTypesMod.Data */](
    service: typingsJapgolly.ahooks.libUseInfiniteScrollTypesMod.Service[TData],
    options: InfiniteScrollOptions[TData]
  ): typingsJapgolly.ahooks.anon.Data[TData] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteScroll")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ahooks.anon.Data[TData]]
  
  inline def useInterval(fn: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def useInterval(fn: js.Function0[Unit], delay: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def useInterval(fn: js.Function0[Unit], delay: Double, options: Immediate): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def useInterval(fn: js.Function0[Unit], delay: Unit, options: Immediate): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useeffect
    */
  /* was `typeof useEffect` */
  inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /* was `typeof useEffect` */
  inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useKeyPress(keyFilter: KeyFilter, eventHandler: EventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyPress")(keyFilter.asInstanceOf[js.Any], eventHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useKeyPress(
    keyFilter: KeyFilter,
    eventHandler: EventHandler,
    option: typingsJapgolly.ahooks.libUseKeyPressMod.Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyPress")(keyFilter.asInstanceOf[js.Any], eventHandler.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useLatest[T](value: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLatest")(value.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
  
  inline def useLocalStorageState[T](key: String): js.Tuple2[T, js.Function1[/* value */ T | IFuncUpdater[T], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStorageState")(key.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* value */ T | IFuncUpdater[T], Unit]]]
  inline def useLocalStorageState[T](key: String, options: typingsJapgolly.ahooks.libCreateUseStorageStateMod.Options[T]): js.Tuple2[T, js.Function1[/* value */ T | IFuncUpdater[T], Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStorageState")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, js.Function1[/* value */ T | IFuncUpdater[T], Unit]]]
  
  inline def useLockFn[P /* <: js.Array[Any] */, V /* <: Any */](fn: js.Function1[/* args */ P, js.Promise[V]]): js.Function1[/* args */ P, js.Promise[js.UndefOr[V]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLockFn")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ P, js.Promise[js.UndefOr[V]]]]
  
  inline def useLongPress(onLongPress: js.Function1[/* event */ EventType, Unit], target: BasicTarget[Element]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLongPress")(onLongPress.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useLongPress(
    onLongPress: js.Function1[/* event */ EventType, Unit],
    target: BasicTarget[Element],
    hasDelayMoveThresholdOnClickOnLongPressEnd: typingsJapgolly.ahooks.libUseLongPressMod.Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLongPress")(onLongPress.asInstanceOf[js.Any], target.asInstanceOf[js.Any], hasDelayMoveThresholdOnClickOnLongPressEnd.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useMap[K, T](): js.Tuple2[Map[K, T], Get[K, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMap")().asInstanceOf[js.Tuple2[Map[K, T], Get[K, T]]]
  inline def useMap[K, T](initialValue: js.Iterable[js.Tuple2[K, T]]): js.Tuple2[Map[K, T], Get[K, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMap")(initialValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Map[K, T], Get[K, T]]]
  
  inline def useMemoizedFn[T /* <: typingsJapgolly.ahooks.libUseMemoizedFnMod.noop */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemoizedFn")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def useMount(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMount")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useMouse(): CursorState = ^.asInstanceOf[js.Dynamic].applyDynamic("useMouse")().asInstanceOf[CursorState]
  inline def useMouse(target: BasicTarget[Element]): CursorState = ^.asInstanceOf[js.Dynamic].applyDynamic("useMouse")(target.asInstanceOf[js.Any]).asInstanceOf[CursorState]
  
  inline def useMutationObserver(callback: MutationCallback, target: BasicTarget[Element]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutationObserver")(callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useMutationObserver(callback: MutationCallback, target: BasicTarget[Element], options: MutationObserverInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutationObserver")(callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useNetwork(): NetworkState = ^.asInstanceOf[js.Dynamic].applyDynamic("useNetwork")().asInstanceOf[NetworkState]
  
  inline def usePagination[TData /* <: typingsJapgolly.ahooks.libUsePaginationTypesMod.Data */, TParams /* <: typingsJapgolly.ahooks.libUsePaginationTypesMod.Params */](service: typingsJapgolly.ahooks.libUsePaginationTypesMod.Service[TData, TParams]): PaginationResult[TData, TParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePagination")(service.asInstanceOf[js.Any]).asInstanceOf[PaginationResult[TData, TParams]]
  inline def usePagination[TData /* <: typingsJapgolly.ahooks.libUsePaginationTypesMod.Data */, TParams /* <: typingsJapgolly.ahooks.libUsePaginationTypesMod.Params */](
    service: typingsJapgolly.ahooks.libUsePaginationTypesMod.Service[TData, TParams],
    options: PaginationOptions[TData, TParams]
  ): PaginationResult[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("usePagination")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PaginationResult[TData, TParams]]
  
  inline def usePrevious[T](state: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def usePrevious[T](state: T, shouldUpdate: ShouldUpdateFunc[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(state.asInstanceOf[js.Any], shouldUpdate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def useRafInterval(fn: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRafInterval")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def useRafInterval(fn: js.Function0[Unit], delay: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRafInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def useRafInterval(fn: js.Function0[Unit], delay: Double, options: Immediate): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRafInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def useRafInterval(fn: js.Function0[Unit], delay: Unit, options: Immediate): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRafInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def useRafState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRafState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
  inline def useRafState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRafState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  inline def useRafState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRafState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  inline def useRafTimeout(fn: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRafTimeout")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def useRafTimeout(fn: js.Function0[Unit], delay: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRafTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def useReactive[S /* <: Record[String, Any] */](initialState: S): S = ^.asInstanceOf[js.Dynamic].applyDynamic("useReactive")(initialState.asInstanceOf[js.Any]).asInstanceOf[S]
  
  inline def useRequest[TData, TParams /* <: js.Array[Any] */](service: typingsJapgolly.ahooks.libUseRequestSrcTypesMod.Service[TData, TParams]): Result[TData, TParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRequest")(service.asInstanceOf[js.Any]).asInstanceOf[Result[TData, TParams]]
  inline def useRequest[TData, TParams /* <: js.Array[Any] */](
    service: typingsJapgolly.ahooks.libUseRequestSrcTypesMod.Service[TData, TParams],
    options: Unit,
    plugins: js.Array[Plugin[TData, TParams]]
  ): Result[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRequest")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Result[TData, TParams]]
  inline def useRequest[TData, TParams /* <: js.Array[Any] */](
    service: typingsJapgolly.ahooks.libUseRequestSrcTypesMod.Service[TData, TParams],
    options: typingsJapgolly.ahooks.libUseRequestSrcTypesMod.Options[TData, TParams]
  ): Result[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRequest")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result[TData, TParams]]
  inline def useRequest[TData, TParams /* <: js.Array[Any] */](
    service: typingsJapgolly.ahooks.libUseRequestSrcTypesMod.Service[TData, TParams],
    options: typingsJapgolly.ahooks.libUseRequestSrcTypesMod.Options[TData, TParams],
    plugins: js.Array[Plugin[TData, TParams]]
  ): Result[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRequest")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Result[TData, TParams]]
  
  inline def useResetState[S](initialState: S): js.Tuple3[S, Dispatch[SetStateAction[S]], ResetState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResetState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[S, Dispatch[SetStateAction[S]], ResetState]]
  inline def useResetState[S](initialState: js.Function0[S]): js.Tuple3[S, Dispatch[SetStateAction[S]], ResetState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResetState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[S, Dispatch[SetStateAction[S]], ResetState]]
  
  inline def useResponsive(): Record[String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResponsive")().asInstanceOf[Record[String, Boolean]]
  
  inline def useSafeState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
  inline def useSafeState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  inline def useSafeState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSafeState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  inline def useScroll(): js.UndefOr[Position] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScroll")().asInstanceOf[js.UndefOr[Position]]
  inline def useScroll(target: Unit, shouldUpdate: ScrollListenController): js.UndefOr[Position] = (^.asInstanceOf[js.Dynamic].applyDynamic("useScroll")(target.asInstanceOf[js.Any], shouldUpdate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Position]]
  inline def useScroll(target: typingsJapgolly.ahooks.libUseScrollMod.Target): js.UndefOr[Position] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScroll")(target.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Position]]
  inline def useScroll(target: typingsJapgolly.ahooks.libUseScrollMod.Target, shouldUpdate: ScrollListenController): js.UndefOr[Position] = (^.asInstanceOf[js.Dynamic].applyDynamic("useScroll")(target.asInstanceOf[js.Any], shouldUpdate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Position]]
  
  inline def useSelections[T](items: js.Array[T]): AllSelected[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelections")(items.asInstanceOf[js.Any]).asInstanceOf[AllSelected[T]]
  inline def useSelections[T](items: js.Array[T], defaultSelected: js.Array[T]): AllSelected[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSelections")(items.asInstanceOf[js.Any], defaultSelected.asInstanceOf[js.Any])).asInstanceOf[AllSelected[T]]
  
  inline def useSessionStorageState[T](key: String): js.Tuple2[T, js.Function1[/* value */ T | IFuncUpdater[T], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSessionStorageState")(key.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* value */ T | IFuncUpdater[T], Unit]]]
  inline def useSessionStorageState[T](key: String, options: typingsJapgolly.ahooks.libCreateUseStorageStateMod.Options[T]): js.Tuple2[T, js.Function1[/* value */ T | IFuncUpdater[T], Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSessionStorageState")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, js.Function1[/* value */ T | IFuncUpdater[T], Unit]]]
  
  inline def useSet[K](): js.Tuple2[Set[K], Add[K]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSet")().asInstanceOf[js.Tuple2[Set[K], Add[K]]]
  inline def useSet[K](initialValue: js.Iterable[K]): js.Tuple2[Set[K], Add[K]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSet")(initialValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Set[K], Add[K]]]
  
  inline def useSetState[S /* <: Record[String, Any] */](initialState: S): js.Tuple2[S, SetState[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, SetState[S]]]
  inline def useSetState[S /* <: Record[String, Any] */](initialState: js.Function0[S]): js.Tuple2[S, SetState[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, SetState[S]]]
  
  inline def useSize(target: BasicTarget[Element]): js.UndefOr[Size] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSize")(target.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Size]]
  
  inline def useTextSelection(): typingsJapgolly.ahooks.libUseTextSelectionMod.State = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextSelection")().asInstanceOf[typingsJapgolly.ahooks.libUseTextSelectionMod.State]
  inline def useTextSelection(target: BasicTarget[Document | Element]): typingsJapgolly.ahooks.libUseTextSelectionMod.State = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextSelection")(target.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ahooks.libUseTextSelectionMod.State]
  
  inline def useThrottle[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useThrottle")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useThrottle[T](value: T, options: ThrottleOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useThrottle")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useThrottleEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useThrottleEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useThrottleEffect(effect: EffectCallback, deps: Unit, options: ThrottleOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useThrottleEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useThrottleEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useThrottleEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useThrottleEffect(effect: EffectCallback, deps: DependencyList, options: ThrottleOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useThrottleEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useThrottleFn[T /* <: typingsJapgolly.ahooks.libUseThrottleFnMod.noop */](fn: T): Flush[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useThrottleFn")(fn.asInstanceOf[js.Any]).asInstanceOf[Flush[T]]
  inline def useThrottleFn[T /* <: typingsJapgolly.ahooks.libUseThrottleFnMod.noop */](fn: T, options: ThrottleOptions): Flush[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThrottleFn")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Flush[T]]
  
  inline def useTimeout(fn: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def useTimeout(fn: js.Function0[Unit], delay: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def useTitle(title: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useTitle")(title.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useTitle(title: String, options: typingsJapgolly.ahooks.libUseTitleMod.Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useTitle")(title.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useToggle[T](): js.Tuple2[Boolean, typingsJapgolly.ahooks.libUseToggleMod.Actions[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToggle")().asInstanceOf[js.Tuple2[Boolean, typingsJapgolly.ahooks.libUseToggleMod.Actions[T]]]
  inline def useToggle[T](defaultValue: T): js.Tuple2[T, typingsJapgolly.ahooks.libUseToggleMod.Actions[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useToggle")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, typingsJapgolly.ahooks.libUseToggleMod.Actions[T]]]
  inline def useToggle[T, U](defaultValue: T, reverseValue: U): js.Tuple2[T | U, typingsJapgolly.ahooks.libUseToggleMod.Actions[T | U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useToggle")(defaultValue.asInstanceOf[js.Any], reverseValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T | U, typingsJapgolly.ahooks.libUseToggleMod.Actions[T | U]]]
  
  inline def useTrackedEffect(effect: Effect): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useTrackedEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useTrackedEffect(effect: Effect, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useTrackedEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useUnmount(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUnmount")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useUnmountedRef(): MutableRefObject[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useUnmountedRef")().asInstanceOf[MutableRefObject[Boolean]]
  
  inline def useUpdate(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useUpdate")().asInstanceOf[js.Function0[Unit]]
  
  @JSImport("ahooks", "useUpdateEffect")
  @js.native
  val useUpdateEffect: FnCall = js.native
  
  @JSImport("ahooks", "useUpdateLayoutEffect")
  @js.native
  val useUpdateLayoutEffect: FnCall = js.native
  
  inline def useVirtualList[T](list: js.Array[T], options: typingsJapgolly.ahooks.libUseVirtualListMod.Options[T]): js.Tuple2[js.Array[Index[T]], js.Function1[/* index */ Double, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useVirtualList")(list.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Index[T]], js.Function1[/* index */ Double, Unit]]]
  
  inline def useWebSocket(socketUrl: String): typingsJapgolly.ahooks.libUseWebSocketMod.Result = ^.asInstanceOf[js.Dynamic].applyDynamic("useWebSocket")(socketUrl.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ahooks.libUseWebSocketMod.Result]
  inline def useWebSocket(socketUrl: String, options: typingsJapgolly.ahooks.libUseWebSocketMod.Options): typingsJapgolly.ahooks.libUseWebSocketMod.Result = (^.asInstanceOf[js.Dynamic].applyDynamic("useWebSocket")(socketUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ahooks.libUseWebSocketMod.Result]
  
  inline def useWhyDidYouUpdate(componentName: String, props: IProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWhyDidYouUpdate")(componentName.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
