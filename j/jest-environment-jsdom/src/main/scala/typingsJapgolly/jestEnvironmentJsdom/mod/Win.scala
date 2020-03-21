package typingsJapgolly.jestEnvironmentJsdom.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
import org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
import org.scalajs.dom.experimental.serviceworkers.CacheStorage
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.BeforeUnloadEvent
import org.scalajs.dom.raw.CSSRuleList
import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HashChangeEvent
import org.scalajs.dom.raw.IDBFactory
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MediaQueryList
import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.PopStateEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.Selection
import org.scalajs.dom.raw.Storage
import org.scalajs.dom.raw.StorageEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsJapgolly.istanbulLibCoverage.mod.CoverageMapData
import typingsJapgolly.jestEnvironmentJsdom.AnonStackTraceLimit
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSGestureChange
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSGestureDoubleTap
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSGestureEnd
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSGestureHold
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSGestureStart
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSGestureTap
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSInertiaStart
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerCancel
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerDown
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerEnter
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerLeave
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerMove
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerOut
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerOver
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.MSPointerUp
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.abort
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.afterprint
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.animationcancel
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.animationend
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.animationiteration
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.animationstart
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.auxclick
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.beforeprint
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.beforeunload
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.blur
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.cancel
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.canplay
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.canplaythrough
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.change
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.click
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.close
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.compassneedscalibration
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.contextmenu
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.cuechange
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dblclick
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.devicelight
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.devicemotion
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.deviceorientation
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.deviceorientationabsolute
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.drag
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dragend
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dragenter
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dragexit
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dragleave
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dragover
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.dragstart
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.drop
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.durationchange
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.emptied
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.ended
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.error
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.focus
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.focusin
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.focusout
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.gotpointercapture
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.hashchange
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.input
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.invalid
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.keydown
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.keypress
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.keyup
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.languagechange
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.load
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.loadeddata
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.loadedmetadata
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.loadstart
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.lostpointercapture
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.message
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.messageerror
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mousedown
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mouseenter
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mouseleave
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mousemove
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mouseout
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mouseover
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mouseup
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.mousewheel
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.offline
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.online
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.orientationchange
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pagehide
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pageshow
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pause
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.play
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.playing
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointercancel
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointerdown
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointerenter
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointerleave
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointermove
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointerout
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointerover
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.pointerup
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.popstate
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.progress
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.ratechange
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.readystatechange
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.rejectionhandled
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.reset
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.resize
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.scroll
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.securitypolicyviolation
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.seeked
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.seeking
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.select
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.selectionchange
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.selectstart
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.stalled
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.storage
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.submit
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.suspend
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.timeupdate
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.toggle
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.touchcancel
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.touchend
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.touchmove
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.touchstart
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.transitioncancel
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.transitionend
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.transitionrun
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.transitionstart
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.unhandledrejection
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.unload
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.volumechange
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplayactivate
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplayblur
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplayconnect
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplaydeactivate
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplaydisconnect
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplayfocus
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplaypointerrestricted
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplaypointerunrestricted
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.vrdisplaypresentchange
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.waiting
import typingsJapgolly.jestEnvironmentJsdom.jestEnvironmentJsdomStrings.wheel
import typingsJapgolly.jestTypes.ItBaseconcurrentItConcurr
import typingsJapgolly.jestTypes.globalMod.BlockFn
import typingsJapgolly.jestTypes.globalMod.BlockName
import typingsJapgolly.jestTypes.globalMod.Describe
import typingsJapgolly.jestTypes.globalMod.DescribeBase
import typingsJapgolly.jestTypes.globalMod.ItBase
import typingsJapgolly.jestTypes.globalMod.ItConcurrent
import typingsJapgolly.jestTypes.globalMod.Jasmine
import typingsJapgolly.jestTypes.globalMod.TestFn
import typingsJapgolly.jestTypes.globalMod.TestName
import typingsJapgolly.node.FnCallSRadix
import typingsJapgolly.node.FnCallUriComponent
import typingsJapgolly.node.NodeJS.Global
import typingsJapgolly.node.NodeJS.Immediate
import typingsJapgolly.node.NodeJS.Process
import typingsJapgolly.node.NodeJS.Timeout
import typingsJapgolly.node.TypeofBuffer
import typingsJapgolly.node.TypeofIntl
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.ApplicationCache_
import typingsJapgolly.std.ArrayBufferConstructor
import typingsJapgolly.std.ArrayConstructor
import typingsJapgolly.std.BarProp
import typingsJapgolly.std.BooleanConstructor
import typingsJapgolly.std.Console_
import typingsJapgolly.std.Crypto_
import typingsJapgolly.std.CustomElementRegistry
import typingsJapgolly.std.DataViewConstructor
import typingsJapgolly.std.DateConstructor
import typingsJapgolly.std.DeviceLightEvent
import typingsJapgolly.std.Document_
import typingsJapgolly.std.ErrorConstructor
import typingsJapgolly.std.EvalErrorConstructor
import typingsJapgolly.std.EventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.Event_
import typingsJapgolly.std.ExtensionScriptApis
import typingsJapgolly.std.External_
import typingsJapgolly.std.Float32ArrayConstructor
import typingsJapgolly.std.Float64ArrayConstructor
import typingsJapgolly.std.FocusNavigationOrigin
import typingsJapgolly.std.FrameRequestCallback
import typingsJapgolly.std.FunctionConstructor
import typingsJapgolly.std.History_
import typingsJapgolly.std.ImageBitmap
import typingsJapgolly.std.ImageBitmapSource
import typingsJapgolly.std.Int16ArrayConstructor
import typingsJapgolly.std.Int32ArrayConstructor
import typingsJapgolly.std.Int8ArrayConstructor
import typingsJapgolly.std.Location_
import typingsJapgolly.std.MapConstructor
import typingsJapgolly.std.NavigationReason
import typingsJapgolly.std.Navigator_
import typingsJapgolly.std.NumberConstructor
import typingsJapgolly.std.ObjectConstructor
import typingsJapgolly.std.OnErrorEventHandler
import typingsJapgolly.std.PageTransitionEvent
import typingsJapgolly.std.Performance_
import typingsJapgolly.std.PromiseConstructor
import typingsJapgolly.std.PromiseRejectionEvent
import typingsJapgolly.std.RangeErrorConstructor
import typingsJapgolly.std.ReferenceErrorConstructor
import typingsJapgolly.std.RegExpConstructor
import typingsJapgolly.std.RequestInfo
import typingsJapgolly.std.Screen_
import typingsJapgolly.std.ScrollToOptions
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SetConstructor
import typingsJapgolly.std.SpeechSynthesis_
import typingsJapgolly.std.StringConstructor
import typingsJapgolly.std.StyleMedia_
import typingsJapgolly.std.SyntaxErrorConstructor
import typingsJapgolly.std.TimerHandler
import typingsJapgolly.std.Transferable
import typingsJapgolly.std.TypeErrorConstructor
import typingsJapgolly.std.URIErrorConstructor
import typingsJapgolly.std.Uint16ArrayConstructor
import typingsJapgolly.std.Uint32ArrayConstructor
import typingsJapgolly.std.Uint8ArrayConstructor
import typingsJapgolly.std.Uint8ClampedArrayConstructor
import typingsJapgolly.std.VoidFunction
import typingsJapgolly.std.WeakMapConstructor
import typingsJapgolly.std.WeakSetConstructor
import typingsJapgolly.std.WebKitPoint
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Window & @jest/types.@jest/types.Global.Global & {  Error  :{  stackTraceLimit  :number}} */
@js.native
trait Win
  extends /* extras */ StringDictionary[js.Any]
     with /* index */ NumberDictionary[Window_] {
  var ArrayBuffer: ArrayBufferConstructor = js.native
  @JSName("Array")
  var Array_Original: ArrayConstructor = js.native
  @JSName("Boolean")
  var Boolean_Original: BooleanConstructor = js.native
  var Buffer: TypeofBuffer = js.native
  var DataView: DataViewConstructor = js.native
  @JSName("Date")
  var Date_Original: DateConstructor = js.native
  @JSName("Error")
  var Error_Original: ErrorConstructor with AnonStackTraceLimit = js.native
  @JSName("EvalError")
  var EvalError_Original: EvalErrorConstructor = js.native
  var Float32Array: Float32ArrayConstructor = js.native
  var Float64Array: Float64ArrayConstructor = js.native
  @JSName("Function")
  var Function_Original: FunctionConstructor = js.native
  var GLOBAL: Global = js.native
  var Infinity: Double = js.native
  var Int16Array: Int16ArrayConstructor = js.native
  var Int32Array: Int32ArrayConstructor = js.native
  var Int8Array: Int8ArrayConstructor = js.native
  var Intl: TypeofIntl = js.native
  var JSON: typingsJapgolly.std.JSON = js.native
  var Map: MapConstructor = js.native
  var Math: typingsJapgolly.std.Math = js.native
  var NaN: Double = js.native
  @JSName("Number")
  var Number_Original: NumberConstructor = js.native
  @JSName("Object")
  var Object_Original: ObjectConstructor = js.native
  var Promise: PromiseConstructor = js.native
  @JSName("RangeError")
  var RangeError_Original: RangeErrorConstructor = js.native
  @JSName("ReferenceError")
  var ReferenceError_Original: ReferenceErrorConstructor = js.native
  @JSName("RegExp")
  var RegExp_Original: RegExpConstructor = js.native
  var Set: SetConstructor = js.native
  @JSName("String")
  var String_Original: StringConstructor = js.native
  var Symbol: js.Function = js.native
  @JSName("SyntaxError")
  var SyntaxError_Original: SyntaxErrorConstructor = js.native
  @JSName("TypeError")
  var TypeError_Original: TypeErrorConstructor = js.native
  @JSName("URIError")
  var URIError_Original: URIErrorConstructor = js.native
  var Uint16Array: Uint16ArrayConstructor = js.native
  var Uint32Array: Uint32ArrayConstructor = js.native
  var Uint8Array: Uint8ArrayConstructor = js.native
  var Uint8ClampedArray: Uint8ClampedArrayConstructor = js.native
  var WeakMap: WeakMapConstructor = js.native
  var WeakSet: WeakSetConstructor = js.native
  var __coverage__ : CoverageMapData = js.native
  val applicationCache: ApplicationCache_ = js.native
  val caches: CacheStorage = js.native
  val clientInformation: Navigator_ = js.native
  val closed: Boolean = js.native
  val console: Console_ with typingsJapgolly.node.Console_ = js.native
  val crypto: Crypto_ = js.native
  var customElements: CustomElementRegistry = js.native
  @JSName("decodeURIComponent")
  var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ String, String] = js.native
  @JSName("decodeURI")
  var decodeURI_Original: js.Function1[/* encodedURI */ String, String] = js.native
  var defaultStatus: String = js.native
  @JSName("describe")
  var describe_Original: Describe = js.native
  val devicePixelRatio: Double = js.native
  val doNotTrack: String = js.native
  val document: Document_ = js.native
  @JSName("encodeURIComponent")
  var encodeURIComponent_Original: FnCallUriComponent = js.native
  @JSName("encodeURI")
  var encodeURI_Original: js.Function1[/* uri */ String, String] = js.native
  @JSName("eval")
  var eval_Original: js.Function1[/* x */ String, _] = js.native
  /** @deprecated */
  val event: js.UndefOr[Event_] = js.native
  /** @deprecated */
  val external: External_ = js.native
  @JSName("fdescribe")
  var fdescribe_Original: DescribeBase = js.native
  @JSName("fit")
  var fit_Original: ItBaseconcurrentItConcurr = js.native
  val frameElement: Element = js.native
  val frames: Window_ = js.native
  var global: Global = js.native
  val history: History_ = js.native
  val indexedDB: IDBFactory = js.native
  val innerHeight: Double = js.native
  val innerWidth: Double = js.native
  @JSName("isFinite")
  var isFinite_Original: js.Function1[/* number */ Double, Boolean] = js.native
  @JSName("isNaN")
  var isNaN_Original: js.Function1[/* number */ Double, Boolean] = js.native
  val isSecureContext: Boolean = js.native
  @JSName("it")
  var it_Original: ItConcurrent = js.native
  var jasmine: Jasmine = js.native
  val length: Double = js.native
  val localStorage: Storage = js.native
  var location: Location_ = js.native
  val locationbar: BarProp = js.native
  val menubar: BarProp = js.native
  val msContentScript: ExtensionScriptApis = js.native
  var name: String = js.native
  val navigator: Navigator_ = js.native
  var offscreenBuffering: String | Boolean = js.native
  /**
    * Fires when the user aborts the download.
    * @param ev The event.
    */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null = js.native
  var onafterprint: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onanimationcancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
  var onanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
  var onanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
  var onanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
  var onauxclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
  var onbeforeprint: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onbeforeunload: (js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]) | Null = js.native
  /**
    * Fires when the object loses the input focus.
    * @param ev The focus event.
    */
  var onblur: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null = js.native
  var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs when playback is possible, but would require further buffering.
    * @param ev The event.
    */
  var oncanplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var oncanplaythrough: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Fires when the contents of the object or selection have changed.
    * @param ev The event.
    */
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Fires when the user clicks the left mouse button on the object
    * @param ev The mouse event.
    */
  var onclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var oncompassneedscalibration: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Fires when the user clicks the right mouse button in the client area, opening the context menu.
    * @param ev The mouse event.
    */
  var oncontextmenu: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
  var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Fires when the user double-clicks the object.
    * @param ev The mouse event.
    */
  var ondblclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
  var ondevicelight: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]) | Null = js.native
  var ondevicemotion: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]) | Null = js.native
  var ondeviceorientation: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]) | Null = js.native
  var ondeviceorientationabsolute: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]) | Null = js.native
  /**
    * Fires on the source object continuously during a drag operation.
    * @param ev The event.
    */
  var ondrag: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
  /**
    * Fires on the source object when the user releases the mouse at the close of a drag operation.
    * @param ev The event.
    */
  var ondragend: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
  /**
    * Fires on the target element when the user drags the object to a valid drop target.
    * @param ev The drag event.
    */
  var ondragenter: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
  var ondragexit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
    * @param ev The drag event.
    */
  var ondragleave: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
  /**
    * Fires on the target element continuously while the user drags the object over a valid drop target.
    * @param ev The event.
    */
  var ondragover: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
  /**
    * Fires on the source object when the user starts to drag a text selection or selected object.
    * @param ev The event.
    */
  var ondragstart: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
  var ondrop: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
  /**
    * Occurs when the duration attribute is updated.
    * @param ev The event.
    */
  var ondurationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs when the media element is reset to its initial state.
    * @param ev The event.
    */
  var onemptied: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs when the end of playback is reached.
    * @param ev The event
    */
  var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Fires when an error occurs during object loading.
    * @param ev The event.
    */
  var onerror: OnErrorEventHandler = js.native
  /**
    * Fires when the object receives focus.
    * @param ev The event.
    */
  var onfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null = js.native
  var ongotpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
  var onhashchange: (js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]) | Null = js.native
  var oninput: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var oninvalid: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Fires when the user presses a key.
    * @param ev The keyboard event
    */
  var onkeydown: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
  /**
    * Fires when the user presses an alphanumeric key.
    * @param ev The event.
    */
  var onkeypress: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
  /**
    * Fires when the user releases a key.
    * @param ev The keyboard event
    */
  var onkeyup: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
  var onlanguagechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Fires immediately after the browser loads the object.
    * @param ev The event.
    */
  var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs when media data is loaded at the current playback position.
    * @param ev The event.
    */
  var onloadeddata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs when the duration and dimensions of the media have been determined.
    * @param ev The event.
    */
  var onloadedmetadata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs when Internet Explorer begins looking for media data.
    * @param ev The event.
    */
  var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onlostpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]) | Null = js.native
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]) | Null = js.native
  /**
    * Fires when the user clicks the object with either mouse button.
    * @param ev The mouse event.
    */
  var onmousedown: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
  var onmouseenter: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
  var onmouseleave: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
  /**
    * Fires when the user moves the mouse over the object.
    * @param ev The mouse event.
    */
  var onmousemove: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
  /**
    * Fires when the user moves the mouse pointer outside the boundaries of the object.
    * @param ev The mouse event.
    */
  var onmouseout: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
  /**
    * Fires when the user moves the mouse pointer into the object.
    * @param ev The mouse event.
    */
  var onmouseover: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
  /**
    * Fires when the user releases a mouse button while the mouse is over the object.
    * @param ev The mouse event.
    */
  var onmouseup: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
  var onmousewheel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmsgesturechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmsgesturedoubletap: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmsgestureend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmsgesturehold: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmsgesturestart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmsgesturetap: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmsinertiastart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmspointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmspointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmspointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmspointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmspointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmspointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmspointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmspointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onoffline: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var ononline: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /** @deprecated */
  var onorientationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onpagehide: (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]) | Null = js.native
  var onpageshow: (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]) | Null = js.native
  /**
    * Occurs when playback is paused.
    * @param ev The event.
    */
  var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs when the play method is requested.
    * @param ev The event.
    */
  var onplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs when the audio or video has started playing.
    * @param ev The event.
    */
  var onplaying: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onpointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
  var onpointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
  var onpointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
  var onpointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
  var onpointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
  var onpointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
  var onpointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
  var onpointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
  var onpopstate: (js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]) | Null = js.native
  /**
    * Occurs to indicate progress while downloading media data.
    * @param ev The event.
    */
  var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | Null = js.native
  /**
    * Occurs when the playback rate is increased or decreased.
    * @param ev The event.
    */
  var onratechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | Null = js.native
  var onrejectionhandled: (js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]) | Null = js.native
  /**
    * Fires when the user resets a form.
    * @param ev The event.
    */
  var onreset: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onresize: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null = js.native
  /**
    * Fires when the user repositions the scroll box in the scroll bar on the object.
    * @param ev The event.
    */
  var onscroll: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]) | Null = js.native
  /**
    * Occurs when the seek operation ends.
    * @param ev The event.
    */
  var onseeked: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs when the current playback position is moved.
    * @param ev The event.
    */
  var onseeking: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Fires when the current selection changes.
    * @param ev The event.
    */
  var onselect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onselectionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onselectstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs when the download has stopped.
    * @param ev The event.
    */
  var onstalled: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onstorage: (js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]) | Null = js.native
  var onsubmit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs if the load operation has been intentionally halted.
    * @param ev The event.
    */
  var onsuspend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs to indicate the current playback position.
    * @param ev The event.
    */
  var ontimeupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var ontoggle: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  var ontransitioncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
  var ontransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
  var ontransitionrun: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
  var ontransitionstart: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
  var onunhandledrejection: (js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]) | Null = js.native
  var onunload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs when the volume is changed, or playback is muted or unmuted.
    * @param ev The event.
    */
  var onvolumechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplayactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplayblur: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplayconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplayfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplaypointerrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplaypointerunrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  /**
    * Occurs when playback stops because the next frame of a video resource is not available.
    * @param ev The event.
    */
  var onwaiting: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onwheel: (js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]) | Null = js.native
  var opener: js.Any = js.native
  /** @deprecated */
  val orientation: String | Double = js.native
  val origin: String = js.native
  val outerHeight: Double = js.native
  val outerWidth: Double = js.native
  val pageXOffset: Double = js.native
  val pageYOffset: Double = js.native
  val parent: Window_ = js.native
  @JSName("parseFloat")
  var parseFloat_Original: js.Function1[/* string */ String, Double] = js.native
  @JSName("parseInt")
  var parseInt_Original: FnCallSRadix = js.native
  val performance: Performance_ = js.native
  val personalbar: BarProp = js.native
  var process: Process = js.native
  @JSName("queueMicrotask")
  var queueMicrotask_Original: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
  /**
    * @deprecated Use `global`.
    */
  var root: Global = js.native
  val screen: Screen_ = js.native
  val screenLeft: Double = js.native
  val screenTop: Double = js.native
  val screenX: Double = js.native
  val screenY: Double = js.native
  val scrollX: Double = js.native
  val scrollY: Double = js.native
  val scrollbars: BarProp = js.native
  val self: Window_ with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any) = js.native
  val sessionStorage: Storage = js.native
  val speechSynthesis: SpeechSynthesis_ = js.native
  var status: String = js.native
  val statusbar: BarProp = js.native
  val styleMedia: StyleMedia_ = js.native
  @JSName("test")
  var test_Original: ItConcurrent = js.native
  val toolbar: BarProp = js.native
  val top: Window_ = js.native
  var undefined: js.UndefOr[scala.Nothing] = js.native
  var v8debug: js.UndefOr[js.Any] = js.native
  val window: Window_ with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any) = js.native
  @JSName("xdescribe")
  var xdescribe_Original: DescribeBase = js.native
  @JSName("xit")
  var xit_Original: ItBase = js.native
  @JSName("xtest")
  var xtest_Original: ItBase = js.native
  def Array(): js.Array[_] = js.native
  def Array(arrayLength: Double): js.Array[_] = js.native
  def Array[T](items: T*): js.Array[T] = js.native
  @JSName("Array")
  def Array_T[T](arrayLength: Double): js.Array[T] = js.native
  def Boolean[T](): scala.Boolean = js.native
  def Boolean[T](value: T): scala.Boolean = js.native
  def Date(): String = js.native
  def Error(): js.Error = js.native
  def Error(message: String): js.Error = js.native
  def EvalError(): js.EvalError = js.native
  def EvalError(message: String): js.EvalError = js.native
  @JSName("EvalError")
  def EvalError_Error(): js.Error = js.native
  @JSName("EvalError")
  def EvalError_Error(message: String): js.Error = js.native
  def Function(args: String*): js.Function = js.native
  def Number(): Double = js.native
  def Number(value: js.Any): Double = js.native
  def Object(): js.Any = js.native
  def Object(value: js.Any): js.Any = js.native
  def RangeError(): js.RangeError = js.native
  def RangeError(message: String): js.RangeError = js.native
  @JSName("RangeError")
  def RangeError_Error(): js.Error = js.native
  @JSName("RangeError")
  def RangeError_Error(message: String): js.Error = js.native
  def ReferenceError(): js.ReferenceError = js.native
  def ReferenceError(message: String): js.ReferenceError = js.native
  @JSName("ReferenceError")
  def ReferenceError_Error(): js.Error = js.native
  @JSName("ReferenceError")
  def ReferenceError_Error(message: String): js.Error = js.native
  def RegExp(pattern: String): js.RegExp = js.native
  def RegExp(pattern: String, flags: String): js.RegExp = js.native
  def RegExp(pattern: typingsJapgolly.std.RegExp): js.RegExp = js.native
  def RegExp(pattern: typingsJapgolly.std.RegExp, flags: String): js.RegExp = js.native
  def String(): java.lang.String = js.native
  def String(value: js.Any): java.lang.String = js.native
  def SyntaxError(): js.Error = js.native
  def SyntaxError(message: String): js.Error = js.native
  @JSName("SyntaxError")
  def SyntaxError_SyntaxError(): js.SyntaxError = js.native
  @JSName("SyntaxError")
  def SyntaxError_SyntaxError(message: String): js.SyntaxError = js.native
  def TypeError(): js.TypeError = js.native
  def TypeError(message: String): js.TypeError = js.native
  @JSName("TypeError")
  def TypeError_Error(): js.Error = js.native
  @JSName("TypeError")
  def TypeError_Error(message: String): js.Error = js.native
  def URIError(): js.URIError = js.native
  def URIError(message: String): js.URIError = js.native
  @JSName("URIError")
  def URIError_Error(): js.Error = js.native
  @JSName("URIError")
  def URIError_Error(message: String): js.Error = js.native
  def addEventListener(`type`: String): Unit = js.native
  def addEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
  def addEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(`type`: MSGestureChange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(`type`: MSGestureDoubleTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(`type`: MSGestureEnd, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(`type`: MSGestureHold, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(`type`: MSGestureStart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(`type`: MSGestureTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(`type`: MSInertiaStart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(`type`: MSPointerCancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(`type`: MSPointerDown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(`type`: MSPointerEnter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(`type`: MSPointerLeave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(`type`: MSPointerMove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(`type`: MSPointerOut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(`type`: MSPointerOver, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(`type`: MSPointerUp, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(`type`: animationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(`type`: hashchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(`type`: languagechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(`type`: messageerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(`type`: mousewheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(`type`: pointercancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(`type`: popstate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(`type`: storage, listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(`type`: vrdisplayactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(`type`: vrdisplayblur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(`type`: vrdisplayconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(`type`: vrdisplaydeactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(`type`: vrdisplaydisconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(`type`: vrdisplayfocus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def alert(): Unit = js.native
  def alert(message: js.Any): Unit = js.native
  def atob(data: String): String = js.native
  def blur(): Unit = js.native
  def btoa(data: String): String = js.native
  def cancelAnimationFrame(handle: Double): Unit = js.native
  /** @deprecated */
  def captureEvents(): Unit = js.native
  def clearImmediate(immediateId: Immediate): Unit = js.native
  def clearInterval(): Unit = js.native
  def clearInterval(handle: Double): Unit = js.native
  def clearInterval(intervalId: Timeout): Unit = js.native
  def clearTimeout(): Unit = js.native
  def clearTimeout(handle: Double): Unit = js.native
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  def close(): Unit = js.native
  def confirm(): Boolean = js.native
  def confirm(message: String): Boolean = js.native
  def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
  def decodeURI(encodedURI: String): String = js.native
  def decodeURIComponent(encodedURIComponent: String): String = js.native
  def departFocus(navigationReason: NavigationReason, origin: FocusNavigationOrigin): Unit = js.native
  def describe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  /**
    * Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
    */
  def dispatchEvent(event: Event_): Boolean = js.native
  def encodeURI(uri: String): String = js.native
  def encodeURIComponent(uriComponent: String): String = js.native
  def encodeURIComponent(uriComponent: Boolean): String = js.native
  def encodeURIComponent(uriComponent: Double): String = js.native
  def escape(str: String): String = js.native
  def eval(x: String): js.Any = js.native
  def fail(): Unit = js.native
  def fdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def fit(testName: TestName, fn: TestFn): Unit = js.native
  def fit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  def focus(): Unit = js.native
  def gc(): Unit = js.native
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: String): CSSStyleDeclaration = js.native
  def getMatchedCSSRules(elt: Element): CSSRuleList = js.native
  def getMatchedCSSRules(elt: Element, pseudoElt: String): CSSRuleList = js.native
  def getSelection(): Selection | Null = js.native
  def isFinite(number: Double): Boolean = js.native
  def isNaN(number: Double): Boolean = js.native
  def it(testName: TestName, fn: TestFn): Unit = js.native
  def it(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  def matchMedia(query: String): MediaQueryList = js.native
  def moveBy(x: Double, y: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def msWriteProfilerMark(profilerMarkName: String): Unit = js.native
  def open(): Window_ | Null = js.native
  def open(url: String): Window_ | Null = js.native
  def open(url: String, target: String): Window_ | Null = js.native
  def open(url: String, target: String, features: String): Window_ | Null = js.native
  def open(url: String, target: String, features: String, replace: Boolean): Window_ | Null = js.native
  def parseFloat(string: String): Double = js.native
  def parseInt(s: String): Double = js.native
  def parseInt(s: String, radix: Double): Double = js.native
  def pending(): Unit = js.native
  def postMessage(message: js.Any, targetOrigin: String): Unit = js.native
  def postMessage(message: js.Any, targetOrigin: String, transfer: js.Array[Transferable]): Unit = js.native
  def print(): Unit = js.native
  def prompt(): String | Null = js.native
  def prompt(message: String): String | Null = js.native
  def prompt(message: String, _default: String): String | Null = js.native
  def queueMicrotask(callback: js.Function0[Unit] | VoidFunction): Unit = js.native
  /** @deprecated */
  def releaseEvents(): Unit = js.native
  def removeEventListener(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, callback: Null, options: EventListenerOptions): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(`type`: MSGestureChange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(`type`: MSGestureDoubleTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(`type`: MSGestureEnd, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(`type`: MSGestureHold, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(`type`: MSGestureStart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(`type`: MSGestureTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(`type`: MSInertiaStart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(`type`: MSPointerCancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(`type`: MSPointerDown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(`type`: MSPointerEnter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(`type`: MSPointerLeave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(`type`: MSPointerMove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(`type`: MSPointerOut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(`type`: MSPointerOver, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(`type`: MSPointerUp, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(`type`: animationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(`type`: hashchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(`type`: languagechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(`type`: messageerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(`type`: mousewheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(`type`: pointercancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(`type`: popstate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(`type`: storage, listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(`type`: vrdisplayactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(`type`: vrdisplayblur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(`type`: vrdisplayconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(`type`: vrdisplaydeactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(`type`: vrdisplaydisconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(`type`: vrdisplayfocus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  def resizeBy(x: Double, y: Double): Unit = js.native
  def resizeTo(x: Double, y: Double): Unit = js.native
  def scroll(): Unit = js.native
  def scroll(options: ScrollToOptions): Unit = js.native
  def scroll(x: Double, y: Double): Unit = js.native
  def scrollBy(): Unit = js.native
  def scrollBy(options: ScrollToOptions): Unit = js.native
  def scrollBy(x: Double, y: Double): Unit = js.native
  def scrollTo(): Unit = js.native
  def scrollTo(options: ScrollToOptions): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  def setInterval(handler: TimerHandler): Double = js.native
  def setInterval(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  def setTimeout(handler: TimerHandler): Double = js.native
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
  def spyOn(): Unit = js.native
  def spyOnProperty(): Unit = js.native
  def stop(): Unit = js.native
  def test(testName: TestName, fn: TestFn): Unit = js.native
  def test(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  def unescape(str: String): String = js.native
  def webkitCancelAnimationFrame(handle: Double): Unit = js.native
  def webkitConvertPointFromNodeToPage(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitConvertPointFromPageToNode(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  def xdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  def xit(testName: TestName, fn: TestFn): Unit = js.native
  def xit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  def xtest(testName: TestName, fn: TestFn): Unit = js.native
  def xtest(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
}

