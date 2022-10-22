package typingsJapgolly.std.global

import org.scalajs.dom.Console
import org.scalajs.dom.Crypto
import org.scalajs.dom.Document
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.External
import org.scalajs.dom.History
import org.scalajs.dom.Location
import org.scalajs.dom.Navigator
import org.scalajs.dom.Performance
import org.scalajs.dom.RequestInit
import org.scalajs.dom.Screen
import org.scalajs.dom.Window
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.AggregateErrorConstructor
import typingsJapgolly.std.ArrayBufferConstructor
import typingsJapgolly.std.ArrayConstructor
import typingsJapgolly.std.BigInt64ArrayConstructor
import typingsJapgolly.std.BigIntConstructor
import typingsJapgolly.std.BigUint64ArrayConstructor
import typingsJapgolly.std.BooleanConstructor
import typingsJapgolly.std.DataViewConstructor
import typingsJapgolly.std.DateConstructor
import typingsJapgolly.std.EnumeratorConstructor
import typingsJapgolly.std.ErrorConstructor
import typingsJapgolly.std.EvalErrorConstructor
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.FinalizationRegistryConstructor
import typingsJapgolly.std.Float32ArrayConstructor
import typingsJapgolly.std.Float64ArrayConstructor
import typingsJapgolly.std.FrameRequestCallback
import typingsJapgolly.std.FunctionConstructor
import typingsJapgolly.std.IdleRequestCallback
import typingsJapgolly.std.IdleRequestOptions
import typingsJapgolly.std.ImageBitmapOptions
import typingsJapgolly.std.ImageBitmapSource
import typingsJapgolly.std.Int16ArrayConstructor
import typingsJapgolly.std.Int32ArrayConstructor
import typingsJapgolly.std.Int8ArrayConstructor
import typingsJapgolly.std.MapConstructor
import typingsJapgolly.std.NumberConstructor
import typingsJapgolly.std.ObjectConstructor
import typingsJapgolly.std.OnErrorEventHandler
import typingsJapgolly.std.PromiseConstructor
import typingsJapgolly.std.ProxyConstructor
import typingsJapgolly.std.RangeErrorConstructor
import typingsJapgolly.std.ReferenceErrorConstructor
import typingsJapgolly.std.RegExpConstructor
import typingsJapgolly.std.RequestInfo
import typingsJapgolly.std.ScrollToOptions
import typingsJapgolly.std.SetConstructor
import typingsJapgolly.std.SharedArrayBufferConstructor
import typingsJapgolly.std.SpeechSynthesis
import typingsJapgolly.std.StringConstructor
import typingsJapgolly.std.StructuredSerializeOptions
import typingsJapgolly.std.SymbolConstructor
import typingsJapgolly.std.SyntaxErrorConstructor
import typingsJapgolly.std.TimerHandler
import typingsJapgolly.std.Transferable
import typingsJapgolly.std.TypeErrorConstructor
import typingsJapgolly.std.URIErrorConstructor
import typingsJapgolly.std.Uint16ArrayConstructor
import typingsJapgolly.std.Uint32ArrayConstructor
import typingsJapgolly.std.Uint8ArrayConstructor
import typingsJapgolly.std.Uint8ClampedArrayConstructor
import typingsJapgolly.std.VBArrayConstructor
import typingsJapgolly.std.VisualViewport
import typingsJapgolly.std.VoidFunction
import typingsJapgolly.std.WeakMapConstructor
import typingsJapgolly.std.WeakRefConstructor
import typingsJapgolly.std.WeakSetConstructor
import typingsJapgolly.std.WindowPostMessageOptions
import typingsJapgolly.std.stdStrings.DOMContentLoaded
import typingsJapgolly.std.stdStrings.abort
import typingsJapgolly.std.stdStrings.afterprint
import typingsJapgolly.std.stdStrings.animationcancel
import typingsJapgolly.std.stdStrings.animationend
import typingsJapgolly.std.stdStrings.animationiteration
import typingsJapgolly.std.stdStrings.animationstart
import typingsJapgolly.std.stdStrings.auxclick
import typingsJapgolly.std.stdStrings.beforeinput
import typingsJapgolly.std.stdStrings.beforeprint
import typingsJapgolly.std.stdStrings.beforeunload
import typingsJapgolly.std.stdStrings.canplay
import typingsJapgolly.std.stdStrings.canplaythrough
import typingsJapgolly.std.stdStrings.change
import typingsJapgolly.std.stdStrings.click
import typingsJapgolly.std.stdStrings.compositionend
import typingsJapgolly.std.stdStrings.compositionstart
import typingsJapgolly.std.stdStrings.compositionupdate
import typingsJapgolly.std.stdStrings.contextmenu
import typingsJapgolly.std.stdStrings.cuechange
import typingsJapgolly.std.stdStrings.dblclick
import typingsJapgolly.std.stdStrings.devicemotion
import typingsJapgolly.std.stdStrings.deviceorientation
import typingsJapgolly.std.stdStrings.drag
import typingsJapgolly.std.stdStrings.dragend
import typingsJapgolly.std.stdStrings.dragenter
import typingsJapgolly.std.stdStrings.dragleave
import typingsJapgolly.std.stdStrings.dragover
import typingsJapgolly.std.stdStrings.dragstart
import typingsJapgolly.std.stdStrings.drop
import typingsJapgolly.std.stdStrings.durationchange
import typingsJapgolly.std.stdStrings.emptied
import typingsJapgolly.std.stdStrings.ended
import typingsJapgolly.std.stdStrings.error
import typingsJapgolly.std.stdStrings.focusin
import typingsJapgolly.std.stdStrings.focusout
import typingsJapgolly.std.stdStrings.formdata
import typingsJapgolly.std.stdStrings.gamepadconnected
import typingsJapgolly.std.stdStrings.gamepaddisconnected
import typingsJapgolly.std.stdStrings.gotpointercapture
import typingsJapgolly.std.stdStrings.hashchange
import typingsJapgolly.std.stdStrings.input
import typingsJapgolly.std.stdStrings.invalid
import typingsJapgolly.std.stdStrings.keydown
import typingsJapgolly.std.stdStrings.keypress
import typingsJapgolly.std.stdStrings.keyup
import typingsJapgolly.std.stdStrings.languagechange
import typingsJapgolly.std.stdStrings.load
import typingsJapgolly.std.stdStrings.loadeddata
import typingsJapgolly.std.stdStrings.loadedmetadata
import typingsJapgolly.std.stdStrings.loadstart
import typingsJapgolly.std.stdStrings.lostpointercapture
import typingsJapgolly.std.stdStrings.message
import typingsJapgolly.std.stdStrings.messageerror
import typingsJapgolly.std.stdStrings.mousedown
import typingsJapgolly.std.stdStrings.mouseenter
import typingsJapgolly.std.stdStrings.mouseleave
import typingsJapgolly.std.stdStrings.mousemove
import typingsJapgolly.std.stdStrings.mouseout
import typingsJapgolly.std.stdStrings.mouseover
import typingsJapgolly.std.stdStrings.mouseup
import typingsJapgolly.std.stdStrings.offline
import typingsJapgolly.std.stdStrings.online
import typingsJapgolly.std.stdStrings.orientationchange
import typingsJapgolly.std.stdStrings.pagehide
import typingsJapgolly.std.stdStrings.pageshow
import typingsJapgolly.std.stdStrings.pause
import typingsJapgolly.std.stdStrings.play
import typingsJapgolly.std.stdStrings.playing
import typingsJapgolly.std.stdStrings.pointercancel
import typingsJapgolly.std.stdStrings.pointerdown
import typingsJapgolly.std.stdStrings.pointerenter
import typingsJapgolly.std.stdStrings.pointerleave
import typingsJapgolly.std.stdStrings.pointermove
import typingsJapgolly.std.stdStrings.pointerout
import typingsJapgolly.std.stdStrings.pointerover
import typingsJapgolly.std.stdStrings.pointerup
import typingsJapgolly.std.stdStrings.popstate
import typingsJapgolly.std.stdStrings.progress
import typingsJapgolly.std.stdStrings.ratechange
import typingsJapgolly.std.stdStrings.rejectionhandled
import typingsJapgolly.std.stdStrings.reset
import typingsJapgolly.std.stdStrings.resize
import typingsJapgolly.std.stdStrings.securitypolicyviolation
import typingsJapgolly.std.stdStrings.seeked
import typingsJapgolly.std.stdStrings.seeking
import typingsJapgolly.std.stdStrings.select
import typingsJapgolly.std.stdStrings.selectionchange
import typingsJapgolly.std.stdStrings.selectstart
import typingsJapgolly.std.stdStrings.slotchange
import typingsJapgolly.std.stdStrings.stalled
import typingsJapgolly.std.stdStrings.storage
import typingsJapgolly.std.stdStrings.submit
import typingsJapgolly.std.stdStrings.suspend
import typingsJapgolly.std.stdStrings.timeupdate
import typingsJapgolly.std.stdStrings.toggle
import typingsJapgolly.std.stdStrings.touchcancel
import typingsJapgolly.std.stdStrings.touchend
import typingsJapgolly.std.stdStrings.touchmove
import typingsJapgolly.std.stdStrings.touchstart
import typingsJapgolly.std.stdStrings.transitioncancel
import typingsJapgolly.std.stdStrings.transitionend
import typingsJapgolly.std.stdStrings.transitionrun
import typingsJapgolly.std.stdStrings.transitionstart
import typingsJapgolly.std.stdStrings.unhandledrejection
import typingsJapgolly.std.stdStrings.unload
import typingsJapgolly.std.stdStrings.volumechange
import typingsJapgolly.std.stdStrings.waiting
import typingsJapgolly.std.stdStrings.webkitanimationend
import typingsJapgolly.std.stdStrings.webkitanimationiteration
import typingsJapgolly.std.stdStrings.webkitanimationstart
import typingsJapgolly.std.stdStrings.webkittransitionend
import typingsJapgolly.std.stdStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ActiveXObject: typingsJapgolly.std.ActiveXObject = js.Dynamic.global.selectDynamic("ActiveXObject").asInstanceOf[typingsJapgolly.std.ActiveXObject]
inline def ActiveXObject_=(x: typingsJapgolly.std.ActiveXObject): Unit = js.Dynamic.global.updateDynamic("ActiveXObject")(x.asInstanceOf[js.Any])

inline def AggregateError_=(x: AggregateErrorConstructor): Unit = js.Dynamic.global.updateDynamic("AggregateError")(x.asInstanceOf[js.Any])

inline def ArrayBuffer_=(x: ArrayBufferConstructor): Unit = js.Dynamic.global.updateDynamic("ArrayBuffer")(x.asInstanceOf[js.Any])

inline def Array_=(x: ArrayConstructor): Unit = js.Dynamic.global.updateDynamic("Array")(x.asInstanceOf[js.Any])

inline def Atomics: typingsJapgolly.std.Atomics = js.Dynamic.global.selectDynamic("Atomics").asInstanceOf[typingsJapgolly.std.Atomics]
inline def Atomics_=(x: typingsJapgolly.std.Atomics): Unit = js.Dynamic.global.updateDynamic("Atomics")(x.asInstanceOf[js.Any])

inline def BigInt: BigIntConstructor = js.Dynamic.global.selectDynamic("BigInt").asInstanceOf[BigIntConstructor]

inline def BigInt64Array_=(x: BigInt64ArrayConstructor): Unit = js.Dynamic.global.updateDynamic("BigInt64Array")(x.asInstanceOf[js.Any])

inline def BigInt_=(x: BigIntConstructor): Unit = js.Dynamic.global.updateDynamic("BigInt")(x.asInstanceOf[js.Any])

inline def BigUint64Array_=(x: BigUint64ArrayConstructor): Unit = js.Dynamic.global.updateDynamic("BigUint64Array")(x.asInstanceOf[js.Any])

inline def Boolean_=(x: BooleanConstructor): Unit = js.Dynamic.global.updateDynamic("Boolean")(x.asInstanceOf[js.Any])

inline def DataView_=(x: DataViewConstructor): Unit = js.Dynamic.global.updateDynamic("DataView")(x.asInstanceOf[js.Any])

inline def Date_=(x: DateConstructor): Unit = js.Dynamic.global.updateDynamic("Date")(x.asInstanceOf[js.Any])

inline def Enumerator_=(x: EnumeratorConstructor): Unit = js.Dynamic.global.updateDynamic("Enumerator")(x.asInstanceOf[js.Any])

inline def Error_=(x: ErrorConstructor): Unit = js.Dynamic.global.updateDynamic("Error")(x.asInstanceOf[js.Any])

inline def EvalError_=(x: EvalErrorConstructor): Unit = js.Dynamic.global.updateDynamic("EvalError")(x.asInstanceOf[js.Any])

inline def FinalizationRegistry_=(x: FinalizationRegistryConstructor): Unit = js.Dynamic.global.updateDynamic("FinalizationRegistry")(x.asInstanceOf[js.Any])

inline def Float32Array_=(x: Float32ArrayConstructor): Unit = js.Dynamic.global.updateDynamic("Float32Array")(x.asInstanceOf[js.Any])

inline def Float64Array_=(x: Float64ArrayConstructor): Unit = js.Dynamic.global.updateDynamic("Float64Array")(x.asInstanceOf[js.Any])

inline def Function_=(x: FunctionConstructor): Unit = js.Dynamic.global.updateDynamic("Function")(x.asInstanceOf[js.Any])

inline def Infinity: Double = js.Dynamic.global.selectDynamic("Infinity").asInstanceOf[Double]
inline def Infinity_=(x: Double): Unit = js.Dynamic.global.updateDynamic("Infinity")(x.asInstanceOf[js.Any])

inline def Int16Array_=(x: Int16ArrayConstructor): Unit = js.Dynamic.global.updateDynamic("Int16Array")(x.asInstanceOf[js.Any])

inline def Int32Array_=(x: Int32ArrayConstructor): Unit = js.Dynamic.global.updateDynamic("Int32Array")(x.asInstanceOf[js.Any])

inline def Int8Array_=(x: Int8ArrayConstructor): Unit = js.Dynamic.global.updateDynamic("Int8Array")(x.asInstanceOf[js.Any])

/**
  * An intrinsic object that provides functions to convert JavaScript values to and from the JavaScript Object Notation (JSON) format.
  */
inline def JSON: typingsJapgolly.std.JSON = js.Dynamic.global.selectDynamic("JSON").asInstanceOf[typingsJapgolly.std.JSON]
inline def JSON_=(x: typingsJapgolly.std.JSON): Unit = js.Dynamic.global.updateDynamic("JSON")(x.asInstanceOf[js.Any])

inline def Map_=(x: MapConstructor): Unit = js.Dynamic.global.updateDynamic("Map")(x.asInstanceOf[js.Any])

/** An intrinsic object that provides basic mathematics functionality and constants. */
inline def Math: typingsJapgolly.std.Math = js.Dynamic.global.selectDynamic("Math").asInstanceOf[typingsJapgolly.std.Math]
inline def Math_=(x: typingsJapgolly.std.Math): Unit = js.Dynamic.global.updateDynamic("Math")(x.asInstanceOf[js.Any])

/////////////////////////////
/// ECMAScript APIs
/////////////////////////////
inline def NaN: Double = js.Dynamic.global.selectDynamic("NaN").asInstanceOf[Double]
inline def NaN_=(x: Double): Unit = js.Dynamic.global.updateDynamic("NaN")(x.asInstanceOf[js.Any])

inline def Number_=(x: NumberConstructor): Unit = js.Dynamic.global.updateDynamic("Number")(x.asInstanceOf[js.Any])

inline def Object_=(x: ObjectConstructor): Unit = js.Dynamic.global.updateDynamic("Object")(x.asInstanceOf[js.Any])

inline def Promise_=(x: PromiseConstructor): Unit = js.Dynamic.global.updateDynamic("Promise")(x.asInstanceOf[js.Any])

inline def Proxy: ProxyConstructor = js.Dynamic.global.selectDynamic("Proxy").asInstanceOf[ProxyConstructor]
inline def Proxy_=(x: ProxyConstructor): Unit = js.Dynamic.global.updateDynamic("Proxy")(x.asInstanceOf[js.Any])

inline def RangeError_=(x: RangeErrorConstructor): Unit = js.Dynamic.global.updateDynamic("RangeError")(x.asInstanceOf[js.Any])

inline def ReferenceError_=(x: ReferenceErrorConstructor): Unit = js.Dynamic.global.updateDynamic("ReferenceError")(x.asInstanceOf[js.Any])

inline def RegExp_=(x: RegExpConstructor): Unit = js.Dynamic.global.updateDynamic("RegExp")(x.asInstanceOf[js.Any])

inline def Set_=(x: SetConstructor): Unit = js.Dynamic.global.updateDynamic("Set")(x.asInstanceOf[js.Any])

inline def SharedArrayBuffer_=(x: SharedArrayBufferConstructor): Unit = js.Dynamic.global.updateDynamic("SharedArrayBuffer")(x.asInstanceOf[js.Any])

inline def String_=(x: StringConstructor): Unit = js.Dynamic.global.updateDynamic("String")(x.asInstanceOf[js.Any])

inline def Symbol: SymbolConstructor = js.Dynamic.global.selectDynamic("Symbol").asInstanceOf[SymbolConstructor]

inline def SyntaxError_=(x: SyntaxErrorConstructor): Unit = js.Dynamic.global.updateDynamic("SyntaxError")(x.asInstanceOf[js.Any])

inline def TypeError_=(x: TypeErrorConstructor): Unit = js.Dynamic.global.updateDynamic("TypeError")(x.asInstanceOf[js.Any])

inline def URIError_=(x: URIErrorConstructor): Unit = js.Dynamic.global.updateDynamic("URIError")(x.asInstanceOf[js.Any])

inline def Uint16Array_=(x: Uint16ArrayConstructor): Unit = js.Dynamic.global.updateDynamic("Uint16Array")(x.asInstanceOf[js.Any])

inline def Uint32Array_=(x: Uint32ArrayConstructor): Unit = js.Dynamic.global.updateDynamic("Uint32Array")(x.asInstanceOf[js.Any])

inline def Uint8Array_=(x: Uint8ArrayConstructor): Unit = js.Dynamic.global.updateDynamic("Uint8Array")(x.asInstanceOf[js.Any])

inline def Uint8ClampedArray_=(x: Uint8ClampedArrayConstructor): Unit = js.Dynamic.global.updateDynamic("Uint8ClampedArray")(x.asInstanceOf[js.Any])

inline def VBArray_=(x: VBArrayConstructor): Unit = js.Dynamic.global.updateDynamic("VBArray")(x.asInstanceOf[js.Any])

inline def WeakMap_=(x: WeakMapConstructor): Unit = js.Dynamic.global.updateDynamic("WeakMap")(x.asInstanceOf[js.Any])

inline def WeakRef_=(x: WeakRefConstructor): Unit = js.Dynamic.global.updateDynamic("WeakRef")(x.asInstanceOf[js.Any])

inline def WeakSet_=(x: WeakSetConstructor): Unit = js.Dynamic.global.updateDynamic("WeakSet")(x.asInstanceOf[js.Any])

inline def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener(
  `type`: java.lang.String,
  listener: EventListenerOrEventListenerObject,
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_DOMContentLoaded(`type`: DOMContentLoaded, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_DOMContentLoaded(
  `type`: DOMContentLoaded,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_DOMContentLoaded(
  `type`: DOMContentLoaded,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_abort(
  `type`: abort,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_abort(
  `type`: abort,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_abort(
  `type`: abort,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_afterprint(
  `type`: afterprint,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_afterprint(
  `type`: afterprint,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_animationcancel(
  `type`: animationcancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_animationcancel(
  `type`: animationcancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_animationcancel(
  `type`: animationcancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_animationend(
  `type`: animationend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_animationend(
  `type`: animationend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_animationend(
  `type`: animationend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_animationiteration(
  `type`: animationiteration,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_animationiteration(
  `type`: animationiteration,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_animationiteration(
  `type`: animationiteration,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_animationstart(
  `type`: animationstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_animationstart(
  `type`: animationstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_animationstart(
  `type`: animationstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_auxclick(
  `type`: auxclick,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_auxclick(
  `type`: auxclick,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_auxclick(
  `type`: auxclick,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_beforeinput(
  `type`: beforeinput,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.InputEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_beforeinput(
  `type`: beforeinput,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.InputEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_beforeinput(
  `type`: beforeinput,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.InputEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_beforeprint(
  `type`: beforeprint,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_beforeprint(
  `type`: beforeprint,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_beforeunload(
  `type`: beforeunload,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.BeforeUnloadEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_beforeunload(
  `type`: beforeunload,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.BeforeUnloadEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_beforeunload(
  `type`: beforeunload,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.BeforeUnloadEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_blur(
  `type`: typingsJapgolly.std.stdStrings.blur,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_blur(
  `type`: typingsJapgolly.std.stdStrings.blur,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_blur(
  `type`: typingsJapgolly.std.stdStrings.blur,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_canplay(
  `type`: canplay,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_canplay(
  `type`: canplay,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_canplaythrough(
  `type`: canplaythrough,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_canplaythrough(
  `type`: canplaythrough,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_change(
  `type`: change,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_change(
  `type`: change,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_click(
  `type`: click,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_click(
  `type`: click,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_click(
  `type`: click,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_close(
  `type`: typingsJapgolly.std.stdStrings.close,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_close(
  `type`: typingsJapgolly.std.stdStrings.close,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_close(
  `type`: typingsJapgolly.std.stdStrings.close,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_compositionend(
  `type`: compositionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_compositionend(
  `type`: compositionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_compositionend(
  `type`: compositionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_compositionstart(
  `type`: compositionstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_compositionstart(
  `type`: compositionstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_compositionstart(
  `type`: compositionstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_compositionupdate(
  `type`: compositionupdate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_compositionupdate(
  `type`: compositionupdate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_compositionupdate(
  `type`: compositionupdate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_contextmenu(
  `type`: contextmenu,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_contextmenu(
  `type`: contextmenu,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_contextmenu(
  `type`: contextmenu,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_cuechange(
  `type`: cuechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_cuechange(
  `type`: cuechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_dblclick(
  `type`: dblclick,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_dblclick(
  `type`: dblclick,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_dblclick(
  `type`: dblclick,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_devicemotion(
  `type`: devicemotion,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_devicemotion(
  `type`: devicemotion,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_devicemotion(
  `type`: devicemotion,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_deviceorientation(
  `type`: deviceorientation,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_deviceorientation(
  `type`: deviceorientation,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_deviceorientation(
  `type`: deviceorientation,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_drag(
  `type`: drag,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_drag(
  `type`: drag,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_drag(
  `type`: drag,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_dragend(
  `type`: dragend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_dragend(
  `type`: dragend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_dragend(
  `type`: dragend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_dragenter(
  `type`: dragenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_dragenter(
  `type`: dragenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_dragenter(
  `type`: dragenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_dragleave(
  `type`: dragleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_dragleave(
  `type`: dragleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_dragleave(
  `type`: dragleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_dragover(
  `type`: dragover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_dragover(
  `type`: dragover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_dragover(
  `type`: dragover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_dragstart(
  `type`: dragstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_dragstart(
  `type`: dragstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_dragstart(
  `type`: dragstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_drop(
  `type`: drop,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_drop(
  `type`: drop,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_drop(
  `type`: drop,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_durationchange(
  `type`: durationchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_durationchange(
  `type`: durationchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_emptied(
  `type`: emptied,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_emptied(
  `type`: emptied,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_ended(
  `type`: ended,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_ended(
  `type`: ended,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_error(
  `type`: error,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ErrorEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_error(
  `type`: error,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ErrorEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_error(
  `type`: error,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ErrorEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_focus(
  `type`: typingsJapgolly.std.stdStrings.focus,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_focus(
  `type`: typingsJapgolly.std.stdStrings.focus,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_focus(
  `type`: typingsJapgolly.std.stdStrings.focus,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_focusin(
  `type`: focusin,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_focusin(
  `type`: focusin,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_focusin(
  `type`: focusin,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_focusout(
  `type`: focusout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_focusout(
  `type`: focusout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_focusout(
  `type`: focusout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_formdata(
  `type`: formdata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.FormDataEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_formdata(
  `type`: formdata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.FormDataEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_formdata(
  `type`: formdata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.FormDataEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_gamepadconnected(
  `type`: gamepadconnected,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_gamepadconnected(
  `type`: gamepadconnected,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_gamepadconnected(
  `type`: gamepadconnected,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_gamepaddisconnected(
  `type`: gamepaddisconnected,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_gamepaddisconnected(
  `type`: gamepaddisconnected,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_gamepaddisconnected(
  `type`: gamepaddisconnected,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_gotpointercapture(
  `type`: gotpointercapture,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_gotpointercapture(
  `type`: gotpointercapture,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_gotpointercapture(
  `type`: gotpointercapture,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_hashchange(
  `type`: hashchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.HashChangeEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_hashchange(
  `type`: hashchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.HashChangeEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_hashchange(
  `type`: hashchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.HashChangeEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_input(
  `type`: input,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_input(
  `type`: input,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_invalid(
  `type`: invalid,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_invalid(
  `type`: invalid,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_keydown(
  `type`: keydown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_keydown(
  `type`: keydown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_keydown(
  `type`: keydown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_keypress(
  `type`: keypress,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_keypress(
  `type`: keypress,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_keypress(
  `type`: keypress,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_keyup(
  `type`: keyup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_keyup(
  `type`: keyup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_keyup(
  `type`: keyup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_languagechange(`type`: languagechange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_languagechange(
  `type`: languagechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_languagechange(
  `type`: languagechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_load(
  `type`: load,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_load(
  `type`: load,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_loadeddata(
  `type`: loadeddata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_loadeddata(
  `type`: loadeddata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_loadedmetadata(
  `type`: loadedmetadata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_loadedmetadata(
  `type`: loadedmetadata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_loadstart(
  `type`: loadstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_loadstart(
  `type`: loadstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_lostpointercapture(
  `type`: lostpointercapture,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_lostpointercapture(
  `type`: lostpointercapture,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_lostpointercapture(
  `type`: lostpointercapture,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_message(
  `type`: message,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_message(
  `type`: message,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_message(
  `type`: message,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_messageerror(
  `type`: messageerror,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_messageerror(
  `type`: messageerror,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_messageerror(
  `type`: messageerror,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_mousedown(
  `type`: mousedown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mousedown(
  `type`: mousedown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mousedown(
  `type`: mousedown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_mouseenter(
  `type`: mouseenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mouseenter(
  `type`: mouseenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mouseenter(
  `type`: mouseenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_mouseleave(
  `type`: mouseleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mouseleave(
  `type`: mouseleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mouseleave(
  `type`: mouseleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_mousemove(
  `type`: mousemove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mousemove(
  `type`: mousemove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mousemove(
  `type`: mousemove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_mouseout(
  `type`: mouseout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mouseout(
  `type`: mouseout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mouseout(
  `type`: mouseout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_mouseover(
  `type`: mouseover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mouseover(
  `type`: mouseover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mouseover(
  `type`: mouseover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_mouseup(
  `type`: mouseup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mouseup(
  `type`: mouseup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_mouseup(
  `type`: mouseup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_offline(
  `type`: offline,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_offline(
  `type`: offline,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_online(
  `type`: online,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_online(
  `type`: online,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_orientationchange(
  `type`: orientationchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_orientationchange(
  `type`: orientationchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_pagehide(
  `type`: pagehide,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pagehide(
  `type`: pagehide,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pagehide(
  `type`: pagehide,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_pageshow(
  `type`: pageshow,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pageshow(
  `type`: pageshow,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pageshow(
  `type`: pageshow,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pause(
  `type`: pause,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pause(
  `type`: pause,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_play(
  `type`: play,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_play(
  `type`: play,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_playing(
  `type`: playing,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_playing(
  `type`: playing,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_pointercancel(
  `type`: pointercancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointercancel(
  `type`: pointercancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointercancel(
  `type`: pointercancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_pointerdown(
  `type`: pointerdown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointerdown(
  `type`: pointerdown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointerdown(
  `type`: pointerdown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_pointerenter(
  `type`: pointerenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointerenter(
  `type`: pointerenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointerenter(
  `type`: pointerenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_pointerleave(
  `type`: pointerleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointerleave(
  `type`: pointerleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointerleave(
  `type`: pointerleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_pointermove(
  `type`: pointermove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointermove(
  `type`: pointermove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointermove(
  `type`: pointermove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_pointerout(
  `type`: pointerout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointerout(
  `type`: pointerout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointerout(
  `type`: pointerout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_pointerover(
  `type`: pointerover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointerover(
  `type`: pointerover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointerover(
  `type`: pointerover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_pointerup(
  `type`: pointerup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointerup(
  `type`: pointerup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_pointerup(
  `type`: pointerup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_popstate(
  `type`: popstate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PopStateEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_popstate(
  `type`: popstate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PopStateEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_popstate(
  `type`: popstate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PopStateEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_progress(
  `type`: progress,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ProgressEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_progress(
  `type`: progress,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ProgressEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_progress(
  `type`: progress,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ProgressEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_ratechange(
  `type`: ratechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_ratechange(
  `type`: ratechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_rejectionhandled(
  `type`: rejectionhandled,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_rejectionhandled(
  `type`: rejectionhandled,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_rejectionhandled(
  `type`: rejectionhandled,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_reset(
  `type`: reset,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_reset(
  `type`: reset,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_resize(
  `type`: resize,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_resize(
  `type`: resize,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_resize(
  `type`: resize,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_scroll(
  `type`: typingsJapgolly.std.stdStrings.scroll,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_scroll(
  `type`: typingsJapgolly.std.stdStrings.scroll,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_scroll(
  `type`: typingsJapgolly.std.stdStrings.scroll,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_securitypolicyviolation(
  `type`: securitypolicyviolation,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SecurityPolicyViolationEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_securitypolicyviolation(
  `type`: securitypolicyviolation,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SecurityPolicyViolationEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_securitypolicyviolation(
  `type`: securitypolicyviolation,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SecurityPolicyViolationEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_seeked(
  `type`: seeked,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_seeked(
  `type`: seeked,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_seeking(
  `type`: seeking,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_seeking(
  `type`: seeking,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_select(
  `type`: select,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_select(
  `type`: select,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_selectionchange(
  `type`: selectionchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_selectionchange(
  `type`: selectionchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_selectstart(
  `type`: selectstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_selectstart(
  `type`: selectstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_slotchange(`type`: slotchange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_slotchange(
  `type`: slotchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_slotchange(
  `type`: slotchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_stalled(
  `type`: stalled,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_stalled(
  `type`: stalled,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_storage(
  `type`: storage,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.StorageEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_storage(
  `type`: storage,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.StorageEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_storage(
  `type`: storage,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.StorageEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_submit(
  `type`: submit,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SubmitEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_submit(
  `type`: submit,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SubmitEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_submit(
  `type`: submit,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SubmitEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_suspend(
  `type`: suspend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_suspend(
  `type`: suspend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_timeupdate(
  `type`: timeupdate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_timeupdate(
  `type`: timeupdate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_toggle(
  `type`: toggle,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_toggle(
  `type`: toggle,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_touchcancel(
  `type`: touchcancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_touchcancel(
  `type`: touchcancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_touchcancel(
  `type`: touchcancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_touchend(
  `type`: touchend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_touchend(
  `type`: touchend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_touchend(
  `type`: touchend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_touchmove(
  `type`: touchmove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_touchmove(
  `type`: touchmove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_touchmove(
  `type`: touchmove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_touchstart(
  `type`: touchstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_touchstart(
  `type`: touchstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_touchstart(
  `type`: touchstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_transitioncancel(
  `type`: transitioncancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_transitioncancel(
  `type`: transitioncancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_transitioncancel(
  `type`: transitioncancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_transitionend(
  `type`: transitionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_transitionend(
  `type`: transitionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_transitionend(
  `type`: transitionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_transitionrun(
  `type`: transitionrun,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_transitionrun(
  `type`: transitionrun,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_transitionrun(
  `type`: transitionrun,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_transitionstart(
  `type`: transitionstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_transitionstart(
  `type`: transitionstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_transitionstart(
  `type`: transitionstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_unhandledrejection(
  `type`: unhandledrejection,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_unhandledrejection(
  `type`: unhandledrejection,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_unhandledrejection(
  `type`: unhandledrejection,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_unload(
  `type`: unload,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_unload(
  `type`: unload,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_volumechange(
  `type`: volumechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_volumechange(
  `type`: volumechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_waiting(
  `type`: waiting,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_waiting(
  `type`: waiting,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_webkitanimationend(`type`: webkitanimationend, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_webkitanimationend(
  `type`: webkitanimationend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_webkitanimationend(
  `type`: webkitanimationend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_webkitanimationiteration(
  `type`: webkitanimationiteration,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_webkitanimationiteration(
  `type`: webkitanimationiteration,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_webkitanimationiteration(
  `type`: webkitanimationiteration,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_webkitanimationstart(`type`: webkitanimationstart, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_webkitanimationstart(
  `type`: webkitanimationstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_webkitanimationstart(
  `type`: webkitanimationstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_webkittransitionend(`type`: webkittransitionend, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_webkittransitionend(
  `type`: webkittransitionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_webkittransitionend(
  `type`: webkittransitionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEventListener_wheel(
  `type`: wheel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.WheelEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_wheel(
  `type`: wheel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.WheelEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEventListener_wheel(
  `type`: wheel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.WheelEvent, Any],
  options: AddEventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def alert(): Unit = js.Dynamic.global.applyDynamic("alert")().asInstanceOf[Unit]
inline def alert(message: Any): Unit = js.Dynamic.global.applyDynamic("alert")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def atob(data: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("atob")(data.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def blur(): Unit = js.Dynamic.global.applyDynamic("blur")().asInstanceOf[Unit]

inline def btoa(data: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("btoa")(data.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/** Available only in secure contexts. */
inline def caches: org.scalajs.dom.CacheStorage = js.Dynamic.global.selectDynamic("caches").asInstanceOf[org.scalajs.dom.CacheStorage]
inline def caches_=(x: org.scalajs.dom.CacheStorage): Unit = js.Dynamic.global.updateDynamic("caches")(x.asInstanceOf[js.Any])

inline def cancelAnimationFrame(handle: Double): Unit = js.Dynamic.global.applyDynamic("cancelAnimationFrame")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def cancelIdleCallback(handle: Double): Unit = js.Dynamic.global.applyDynamic("cancelIdleCallback")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** @deprecated */
inline def captureEvents(): Unit = js.Dynamic.global.applyDynamic("captureEvents")().asInstanceOf[Unit]

inline def clearInterval(): Unit = js.Dynamic.global.applyDynamic("clearInterval")().asInstanceOf[Unit]
inline def clearInterval(id: Double): Unit = js.Dynamic.global.applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def clearTimeout(): Unit = js.Dynamic.global.applyDynamic("clearTimeout")().asInstanceOf[Unit]
inline def clearTimeout(id: Double): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** @deprecated This is a legacy alias of `navigator`. */
inline def clientInformation: Navigator = js.Dynamic.global.selectDynamic("clientInformation").asInstanceOf[Navigator]
inline def clientInformation_=(x: Navigator): Unit = js.Dynamic.global.updateDynamic("clientInformation")(x.asInstanceOf[js.Any])

/** Closes the window. */
inline def close(): Unit = js.Dynamic.global.applyDynamic("close")().asInstanceOf[Unit]

/** Returns true if the window has been closed, false otherwise. */
inline def closed: scala.Boolean = js.Dynamic.global.selectDynamic("closed").asInstanceOf[scala.Boolean]
inline def closed_=(x: scala.Boolean): Unit = js.Dynamic.global.updateDynamic("closed")(x.asInstanceOf[js.Any])

inline def confirm(): scala.Boolean = js.Dynamic.global.applyDynamic("confirm")().asInstanceOf[scala.Boolean]
inline def confirm(message: java.lang.String): scala.Boolean = js.Dynamic.global.applyDynamic("confirm")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def console: Console = js.Dynamic.global.selectDynamic("console").asInstanceOf[Console]
inline def console_=(x: Console): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])

inline def createImageBitmap(image: ImageBitmapSource): js.Promise[typingsJapgolly.std.ImageBitmap] = js.Dynamic.global.applyDynamic("createImageBitmap")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.std.ImageBitmap]]
inline def createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions): js.Promise[typingsJapgolly.std.ImageBitmap] = (js.Dynamic.global.applyDynamic("createImageBitmap")(image.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.std.ImageBitmap]]
inline def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[typingsJapgolly.std.ImageBitmap] = (js.Dynamic.global.applyDynamic("createImageBitmap")(image.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.std.ImageBitmap]]
inline def createImageBitmap(
  image: ImageBitmapSource,
  sx: Double,
  sy: Double,
  sw: Double,
  sh: Double,
  options: ImageBitmapOptions
): js.Promise[typingsJapgolly.std.ImageBitmap] = (js.Dynamic.global.applyDynamic("createImageBitmap")(image.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.std.ImageBitmap]]

inline def crossOriginIsolated: scala.Boolean = js.Dynamic.global.selectDynamic("crossOriginIsolated").asInstanceOf[scala.Boolean]
inline def crossOriginIsolated_=(x: scala.Boolean): Unit = js.Dynamic.global.updateDynamic("crossOriginIsolated")(x.asInstanceOf[js.Any])

inline def crypto: Crypto = js.Dynamic.global.selectDynamic("crypto").asInstanceOf[Crypto]
inline def crypto_=(x: Crypto): Unit = js.Dynamic.global.updateDynamic("crypto")(x.asInstanceOf[js.Any])

/** Defines a new custom element, mapping the given name to the given constructor as an autonomous custom element. */
inline def customElements: typingsJapgolly.std.CustomElementRegistry = js.Dynamic.global.selectDynamic("customElements").asInstanceOf[typingsJapgolly.std.CustomElementRegistry]
inline def customElements_=(x: typingsJapgolly.std.CustomElementRegistry): Unit = js.Dynamic.global.updateDynamic("customElements")(x.asInstanceOf[js.Any])

/**
  * Gets the unencoded version of an encoded Uniform Resource Identifier (URI).
  * @param encodedURI A value representing an encoded URI.
  */
inline def decodeURI(encodedURI: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("decodeURI")(encodedURI.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/**
  * Gets the unencoded version of an encoded component of a Uniform Resource Identifier (URI).
  * @param encodedURIComponent A value representing an encoded URI component.
  */
inline def decodeURIComponent(encodedURIComponent: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("decodeURIComponent")(encodedURIComponent.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def devicePixelRatio: Double = js.Dynamic.global.selectDynamic("devicePixelRatio").asInstanceOf[Double]
inline def devicePixelRatio_=(x: Double): Unit = js.Dynamic.global.updateDynamic("devicePixelRatio")(x.asInstanceOf[js.Any])

/** Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise. */
inline def dispatchEvent(event: Event): scala.Boolean = js.Dynamic.global.applyDynamic("dispatchEvent")(event.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def document: Document = js.Dynamic.global.selectDynamic("document").asInstanceOf[Document]
inline def document_=(x: Document): Unit = js.Dynamic.global.updateDynamic("document")(x.asInstanceOf[js.Any])

/**
  * Encodes a text string as a valid Uniform Resource Identifier (URI)
  * @param uri A value representing an unencoded URI.
  */
inline def encodeURI(uri: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("encodeURI")(uri.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/**
  * Encodes a text string as a valid component of a Uniform Resource Identifier (URI).
  * @param uriComponent A value representing an unencoded URI component.
  */
inline def encodeURIComponent(uriComponent: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("encodeURIComponent")(uriComponent.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def encodeURIComponent(uriComponent: scala.Boolean): java.lang.String = js.Dynamic.global.applyDynamic("encodeURIComponent")(uriComponent.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def encodeURIComponent(uriComponent: Double): java.lang.String = js.Dynamic.global.applyDynamic("encodeURIComponent")(uriComponent.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/**
  * Computes a new string in which certain characters have been replaced by a hexadecimal escape sequence.
  * @deprecated A legacy feature for browser compatibility
  * @param string A string value
  */
inline def escape(string: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("escape")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/**
  * Evaluates JavaScript code and executes it.
  * @param x A String value that contains valid JavaScript code.
  */
inline def eval(x: java.lang.String): Any = js.Dynamic.global.applyDynamic("eval")(x.asInstanceOf[js.Any]).asInstanceOf[Any]

/** @deprecated */
inline def event: js.UndefOr[Event] = js.Dynamic.global.selectDynamic("event").asInstanceOf[js.UndefOr[Event]]
inline def event_=(x: js.UndefOr[Event]): Unit = js.Dynamic.global.updateDynamic("event")(x.asInstanceOf[js.Any])

/** @deprecated */
inline def external: External = js.Dynamic.global.selectDynamic("external").asInstanceOf[External]
inline def external_=(x: External): Unit = js.Dynamic.global.updateDynamic("external")(x.asInstanceOf[js.Any])

inline def fetch(input: org.scalajs.dom.URL): js.Promise[org.scalajs.dom.Response] = js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[org.scalajs.dom.Response]]
inline def fetch(input: org.scalajs.dom.URL, init: RequestInit): js.Promise[org.scalajs.dom.Response] = (js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[org.scalajs.dom.Response]]
inline def fetch(input: RequestInfo): js.Promise[org.scalajs.dom.Response] = js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[org.scalajs.dom.Response]]
inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.Response] = (js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[org.scalajs.dom.Response]]

/** Moves the focus to the window's browsing context, if any. */
inline def focus(): Unit = js.Dynamic.global.applyDynamic("focus")().asInstanceOf[Unit]

inline def frameElement: org.scalajs.dom.Element | Null = js.Dynamic.global.selectDynamic("frameElement").asInstanceOf[org.scalajs.dom.Element | Null]
inline def frameElement_=(x: org.scalajs.dom.Element | Null): Unit = js.Dynamic.global.updateDynamic("frameElement")(x.asInstanceOf[js.Any])

inline def frames: Window = js.Dynamic.global.selectDynamic("frames").asInstanceOf[Window]
inline def frames_=(x: Window): Unit = js.Dynamic.global.updateDynamic("frames")(x.asInstanceOf[js.Any])

inline def getComputedStyle(elt: org.scalajs.dom.Element): org.scalajs.dom.CSSStyleDeclaration = js.Dynamic.global.applyDynamic("getComputedStyle")(elt.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.CSSStyleDeclaration]
inline def getComputedStyle(elt: org.scalajs.dom.Element, pseudoElt: java.lang.String): org.scalajs.dom.CSSStyleDeclaration = (js.Dynamic.global.applyDynamic("getComputedStyle")(elt.asInstanceOf[js.Any], pseudoElt.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.CSSStyleDeclaration]

inline def getSelection(): org.scalajs.dom.Selection | Null = js.Dynamic.global.applyDynamic("getSelection")().asInstanceOf[org.scalajs.dom.Selection | Null]

inline def history: History = js.Dynamic.global.selectDynamic("history").asInstanceOf[History]
inline def history_=(x: History): Unit = js.Dynamic.global.updateDynamic("history")(x.asInstanceOf[js.Any])

/////////////////////////////
/// WorkerGlobalScope APIs
/////////////////////////////
// These are only available in a Web Worker
inline def importScripts(urls: java.lang.String*): Unit = js.Dynamic.global.applyDynamic("importScripts")(urls.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]

inline def indexedDB: org.scalajs.dom.IDBFactory = js.Dynamic.global.selectDynamic("indexedDB").asInstanceOf[org.scalajs.dom.IDBFactory]
inline def indexedDB_=(x: org.scalajs.dom.IDBFactory): Unit = js.Dynamic.global.updateDynamic("indexedDB")(x.asInstanceOf[js.Any])

inline def innerHeight: Double = js.Dynamic.global.selectDynamic("innerHeight").asInstanceOf[Double]
inline def innerHeight_=(x: Double): Unit = js.Dynamic.global.updateDynamic("innerHeight")(x.asInstanceOf[js.Any])

inline def innerWidth: Double = js.Dynamic.global.selectDynamic("innerWidth").asInstanceOf[Double]
inline def innerWidth_=(x: Double): Unit = js.Dynamic.global.updateDynamic("innerWidth")(x.asInstanceOf[js.Any])

/**
  * Determines whether a supplied number is finite.
  * @param number Any numeric value.
  */
inline def isFinite(number: Double): scala.Boolean = js.Dynamic.global.applyDynamic("isFinite")(number.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a number).
  * @param number A numeric value.
  */
inline def isNaN(number: Double): scala.Boolean = js.Dynamic.global.applyDynamic("isNaN")(number.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isSecureContext: scala.Boolean = js.Dynamic.global.selectDynamic("isSecureContext").asInstanceOf[scala.Boolean]
inline def isSecureContext_=(x: scala.Boolean): Unit = js.Dynamic.global.updateDynamic("isSecureContext")(x.asInstanceOf[js.Any])

inline def length: Double = js.Dynamic.global.selectDynamic("length").asInstanceOf[Double]
inline def length_=(x: Double): Unit = js.Dynamic.global.updateDynamic("length")(x.asInstanceOf[js.Any])

inline def localStorage: org.scalajs.dom.Storage = js.Dynamic.global.selectDynamic("localStorage").asInstanceOf[org.scalajs.dom.Storage]
inline def localStorage_=(x: org.scalajs.dom.Storage): Unit = js.Dynamic.global.updateDynamic("localStorage")(x.asInstanceOf[js.Any])

inline def location: Location = js.Dynamic.global.selectDynamic("location").asInstanceOf[Location]
inline def location_=(x: Location): Unit = js.Dynamic.global.updateDynamic("location")(x.asInstanceOf[js.Any])

/** Returns true if the location bar is visible; otherwise, returns false. */
inline def locationbar: typingsJapgolly.std.BarProp = js.Dynamic.global.selectDynamic("locationbar").asInstanceOf[typingsJapgolly.std.BarProp]
inline def locationbar_=(x: typingsJapgolly.std.BarProp): Unit = js.Dynamic.global.updateDynamic("locationbar")(x.asInstanceOf[js.Any])

inline def matchMedia(query: java.lang.String): org.scalajs.dom.MediaQueryList = js.Dynamic.global.applyDynamic("matchMedia")(query.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.MediaQueryList]

/** Returns true if the menu bar is visible; otherwise, returns false. */
inline def menubar: typingsJapgolly.std.BarProp = js.Dynamic.global.selectDynamic("menubar").asInstanceOf[typingsJapgolly.std.BarProp]
inline def menubar_=(x: typingsJapgolly.std.BarProp): Unit = js.Dynamic.global.updateDynamic("menubar")(x.asInstanceOf[js.Any])

inline def moveBy(x: Double, y: Double): Unit = (js.Dynamic.global.applyDynamic("moveBy")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def moveTo(x: Double, y: Double): Unit = (js.Dynamic.global.applyDynamic("moveTo")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** @deprecated */
inline def name: Unit = js.Dynamic.global.selectDynamic("name").asInstanceOf[Unit]

inline def navigator: Navigator = js.Dynamic.global.selectDynamic("navigator").asInstanceOf[Navigator]
inline def navigator_=(x: Navigator): Unit = js.Dynamic.global.updateDynamic("navigator")(x.asInstanceOf[js.Any])

/**
  * Fires when the user aborts the download.
  * @param ev The event.
  */
inline def onabort: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onabort").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any]) | Null]
inline def onabort_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onabort")(x.asInstanceOf[js.Any])

inline def onafterprint: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onafterprint").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onafterprint_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onafterprint")(x.asInstanceOf[js.Any])

inline def onanimationcancel: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onanimationcancel").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null]
inline def onanimationcancel_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onanimationcancel")(x.asInstanceOf[js.Any])

inline def onanimationend: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onanimationend").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null]
inline def onanimationend_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onanimationend")(x.asInstanceOf[js.Any])

inline def onanimationiteration: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onanimationiteration").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null]
inline def onanimationiteration_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onanimationiteration")(x.asInstanceOf[js.Any])

inline def onanimationstart: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onanimationstart").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null]
inline def onanimationstart_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onanimationstart")(x.asInstanceOf[js.Any])

inline def onauxclick: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onauxclick").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null]
inline def onauxclick_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onauxclick")(x.asInstanceOf[js.Any])

inline def onbeforeprint: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onbeforeprint").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onbeforeprint_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onbeforeprint")(x.asInstanceOf[js.Any])

inline def onbeforeunload: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.BeforeUnloadEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onbeforeunload").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.BeforeUnloadEvent, Any]) | Null]
inline def onbeforeunload_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.BeforeUnloadEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onbeforeunload")(x.asInstanceOf[js.Any])

/**
  * Fires when the object loses the input focus.
  * @param ev The focus event.
  */
inline def onblur: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onblur").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]) | Null]
inline def onblur_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onblur")(x.asInstanceOf[js.Any])

/**
  * Occurs when playback is possible, but would require further buffering.
  * @param ev The event.
  */
inline def oncanplay: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("oncanplay").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def oncanplay_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("oncanplay")(x.asInstanceOf[js.Any])

inline def oncanplaythrough: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("oncanplaythrough").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def oncanplaythrough_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("oncanplaythrough")(x.asInstanceOf[js.Any])

/**
  * Fires when the contents of the object or selection have changed.
  * @param ev The event.
  */
inline def onchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onchange").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onchange_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onchange")(x.asInstanceOf[js.Any])

/**
  * Fires when the user clicks the left mouse button on the object
  * @param ev The mouse event.
  */
inline def onclick: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onclick").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null]
inline def onclick_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onclick")(x.asInstanceOf[js.Any])

inline def onclose: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onclose").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onclose_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onclose")(x.asInstanceOf[js.Any])

/**
  * Fires when the user clicks the right mouse button in the client area, opening the context menu.
  * @param ev The mouse event.
  */
inline def oncontextmenu: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.Dynamic.global.selectDynamic("oncontextmenu").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null]
inline def oncontextmenu_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("oncontextmenu")(x.asInstanceOf[js.Any])

inline def oncuechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("oncuechange").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def oncuechange_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("oncuechange")(x.asInstanceOf[js.Any])

/**
  * Fires when the user double-clicks the object.
  * @param ev The mouse event.
  */
inline def ondblclick: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ondblclick").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null]
inline def ondblclick_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ondblclick")(x.asInstanceOf[js.Any])

/** Available only in secure contexts. */
inline def ondevicemotion: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ondevicemotion").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any]) | Null]
inline def ondevicemotion_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ondevicemotion")(x.asInstanceOf[js.Any])

/** Available only in secure contexts. */
inline def ondeviceorientation: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ondeviceorientation").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]) | Null]
inline def ondeviceorientation_=(
  x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]) | Null
): Unit = js.Dynamic.global.updateDynamic("ondeviceorientation")(x.asInstanceOf[js.Any])

/**
  * Fires on the source object continuously during a drag operation.
  * @param ev The event.
  */
inline def ondrag: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ondrag").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null]
inline def ondrag_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ondrag")(x.asInstanceOf[js.Any])

/**
  * Fires on the source object when the user releases the mouse at the close of a drag operation.
  * @param ev The event.
  */
inline def ondragend: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ondragend").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null]
inline def ondragend_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ondragend")(x.asInstanceOf[js.Any])

/**
  * Fires on the target element when the user drags the object to a valid drop target.
  * @param ev The drag event.
  */
inline def ondragenter: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ondragenter").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null]
inline def ondragenter_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ondragenter")(x.asInstanceOf[js.Any])

/**
  * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
  * @param ev The drag event.
  */
inline def ondragleave: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ondragleave").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null]
inline def ondragleave_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ondragleave")(x.asInstanceOf[js.Any])

/**
  * Fires on the target element continuously while the user drags the object over a valid drop target.
  * @param ev The event.
  */
inline def ondragover: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ondragover").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null]
inline def ondragover_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ondragover")(x.asInstanceOf[js.Any])

/**
  * Fires on the source object when the user starts to drag a text selection or selected object.
  * @param ev The event.
  */
inline def ondragstart: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ondragstart").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null]
inline def ondragstart_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ondragstart")(x.asInstanceOf[js.Any])

inline def ondrop: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ondrop").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null]
inline def ondrop_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ondrop")(x.asInstanceOf[js.Any])

/**
  * Occurs when the duration attribute is updated.
  * @param ev The event.
  */
inline def ondurationchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("ondurationchange").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def ondurationchange_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ondurationchange")(x.asInstanceOf[js.Any])

/**
  * Occurs when the media element is reset to its initial state.
  * @param ev The event.
  */
inline def onemptied: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onemptied").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onemptied_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onemptied")(x.asInstanceOf[js.Any])

/**
  * Occurs when the end of playback is reached.
  * @param ev The event
  */
inline def onended: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onended").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onended_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onended")(x.asInstanceOf[js.Any])

/**
  * Fires when an error occurs during object loading.
  * @param ev The event.
  */
inline def onerror: OnErrorEventHandler = js.Dynamic.global.selectDynamic("onerror").asInstanceOf[OnErrorEventHandler]
inline def onerror_=(x: OnErrorEventHandler): Unit = js.Dynamic.global.updateDynamic("onerror")(x.asInstanceOf[js.Any])

/**
  * Fires when the object receives focus.
  * @param ev The event.
  */
inline def onfocus: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onfocus").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]) | Null]
inline def onfocus_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onfocus")(x.asInstanceOf[js.Any])

inline def onformdata: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.FormDataEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onformdata").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.FormDataEvent, Any]) | Null]
inline def onformdata_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.FormDataEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onformdata")(x.asInstanceOf[js.Any])

inline def ongamepadconnected: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ongamepadconnected").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any]) | Null]
inline def ongamepadconnected_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ongamepadconnected")(x.asInstanceOf[js.Any])

inline def ongamepaddisconnected: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ongamepaddisconnected").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any]) | Null]
inline def ongamepaddisconnected_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ongamepaddisconnected")(x.asInstanceOf[js.Any])

inline def ongotpointercapture: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ongotpointercapture").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null]
inline def ongotpointercapture_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ongotpointercapture")(x.asInstanceOf[js.Any])

inline def onhashchange: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.HashChangeEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onhashchange").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.HashChangeEvent, Any]) | Null]
inline def onhashchange_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.HashChangeEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onhashchange")(x.asInstanceOf[js.Any])

inline def oninput: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("oninput").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def oninput_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("oninput")(x.asInstanceOf[js.Any])

inline def oninvalid: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("oninvalid").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def oninvalid_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("oninvalid")(x.asInstanceOf[js.Any])

/**
  * Fires when the user presses a key.
  * @param ev The keyboard event
  */
inline def onkeydown: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onkeydown").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null]
inline def onkeydown_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onkeydown")(x.asInstanceOf[js.Any])

/**
  * Fires when the user presses an alphanumeric key.
  * @param ev The event.
  * @deprecated
  */
inline def onkeypress: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onkeypress").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null]
inline def onkeypress_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onkeypress")(x.asInstanceOf[js.Any])

/**
  * Fires when the user releases a key.
  * @param ev The keyboard event
  */
inline def onkeyup: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onkeyup").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null]
inline def onkeyup_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onkeyup")(x.asInstanceOf[js.Any])

inline def onlanguagechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onlanguagechange").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onlanguagechange_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onlanguagechange")(x.asInstanceOf[js.Any])

/**
  * Fires immediately after the browser loads the object.
  * @param ev The event.
  */
inline def onload: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onload").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onload_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onload")(x.asInstanceOf[js.Any])

/**
  * Occurs when media data is loaded at the current playback position.
  * @param ev The event.
  */
inline def onloadeddata: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onloadeddata").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onloadeddata_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onloadeddata")(x.asInstanceOf[js.Any])

/**
  * Occurs when the duration and dimensions of the media have been determined.
  * @param ev The event.
  */
inline def onloadedmetadata: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onloadedmetadata").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onloadedmetadata_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onloadedmetadata")(x.asInstanceOf[js.Any])

/**
  * Occurs when Internet Explorer begins looking for media data.
  * @param ev The event.
  */
inline def onloadstart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onloadstart").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onloadstart_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onloadstart")(x.asInstanceOf[js.Any])

inline def onlostpointercapture: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onlostpointercapture").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null]
inline def onlostpointercapture_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onlostpointercapture")(x.asInstanceOf[js.Any])

inline def onmessage: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onmessage").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any]) | Null]
inline def onmessage_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onmessage")(x.asInstanceOf[js.Any])

inline def onmessageerror: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onmessageerror").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any]) | Null]
inline def onmessageerror_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onmessageerror")(x.asInstanceOf[js.Any])

/**
  * Fires when the user clicks the object with either mouse button.
  * @param ev The mouse event.
  */
inline def onmousedown: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onmousedown").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null]
inline def onmousedown_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onmousedown")(x.asInstanceOf[js.Any])

inline def onmouseenter: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onmouseenter").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null]
inline def onmouseenter_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onmouseenter")(x.asInstanceOf[js.Any])

inline def onmouseleave: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onmouseleave").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null]
inline def onmouseleave_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onmouseleave")(x.asInstanceOf[js.Any])

/**
  * Fires when the user moves the mouse over the object.
  * @param ev The mouse event.
  */
inline def onmousemove: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onmousemove").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null]
inline def onmousemove_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onmousemove")(x.asInstanceOf[js.Any])

/**
  * Fires when the user moves the mouse pointer outside the boundaries of the object.
  * @param ev The mouse event.
  */
inline def onmouseout: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onmouseout").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null]
inline def onmouseout_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onmouseout")(x.asInstanceOf[js.Any])

/**
  * Fires when the user moves the mouse pointer into the object.
  * @param ev The mouse event.
  */
inline def onmouseover: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onmouseover").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null]
inline def onmouseover_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onmouseover")(x.asInstanceOf[js.Any])

/**
  * Fires when the user releases a mouse button while the mouse is over the object.
  * @param ev The mouse event.
  */
inline def onmouseup: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onmouseup").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null]
inline def onmouseup_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onmouseup")(x.asInstanceOf[js.Any])

inline def onoffline: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onoffline").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onoffline_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onoffline")(x.asInstanceOf[js.Any])

inline def ononline: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("ononline").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def ononline_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ononline")(x.asInstanceOf[js.Any])

/** @deprecated */
inline def onorientationchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onorientationchange").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onorientationchange_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onorientationchange")(x.asInstanceOf[js.Any])

inline def onpagehide: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onpagehide").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any]) | Null]
inline def onpagehide_=(
  x: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any]) | Null
): Unit = js.Dynamic.global.updateDynamic("onpagehide")(x.asInstanceOf[js.Any])

inline def onpageshow: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onpageshow").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any]) | Null]
inline def onpageshow_=(
  x: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any]) | Null
): Unit = js.Dynamic.global.updateDynamic("onpageshow")(x.asInstanceOf[js.Any])

/**
  * Occurs when playback is paused.
  * @param ev The event.
  */
inline def onpause: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onpause").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onpause_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onpause")(x.asInstanceOf[js.Any])

/**
  * Occurs when the play method is requested.
  * @param ev The event.
  */
inline def onplay: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onplay").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onplay_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onplay")(x.asInstanceOf[js.Any])

/**
  * Occurs when the audio or video has started playing.
  * @param ev The event.
  */
inline def onplaying: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onplaying").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onplaying_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onplaying")(x.asInstanceOf[js.Any])

inline def onpointercancel: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onpointercancel").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null]
inline def onpointercancel_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onpointercancel")(x.asInstanceOf[js.Any])

inline def onpointerdown: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onpointerdown").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null]
inline def onpointerdown_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onpointerdown")(x.asInstanceOf[js.Any])

inline def onpointerenter: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onpointerenter").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null]
inline def onpointerenter_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onpointerenter")(x.asInstanceOf[js.Any])

inline def onpointerleave: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onpointerleave").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null]
inline def onpointerleave_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onpointerleave")(x.asInstanceOf[js.Any])

inline def onpointermove: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onpointermove").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null]
inline def onpointermove_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onpointermove")(x.asInstanceOf[js.Any])

inline def onpointerout: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onpointerout").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null]
inline def onpointerout_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onpointerout")(x.asInstanceOf[js.Any])

inline def onpointerover: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onpointerover").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null]
inline def onpointerover_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onpointerover")(x.asInstanceOf[js.Any])

inline def onpointerup: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onpointerup").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null]
inline def onpointerup_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onpointerup")(x.asInstanceOf[js.Any])

inline def onpopstate: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PopStateEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onpopstate").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PopStateEvent, Any]) | Null]
inline def onpopstate_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PopStateEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onpopstate")(x.asInstanceOf[js.Any])

/**
  * Occurs to indicate progress while downloading media data.
  * @param ev The event.
  */
inline def onprogress: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ProgressEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onprogress").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ProgressEvent, Any]) | Null]
inline def onprogress_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ProgressEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onprogress")(x.asInstanceOf[js.Any])

/**
  * Occurs when the playback rate is increased or decreased.
  * @param ev The event.
  */
inline def onratechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onratechange").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onratechange_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onratechange")(x.asInstanceOf[js.Any])

inline def onrejectionhandled: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onrejectionhandled").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any]) | Null]
inline def onrejectionhandled_=(
  x: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any]) | Null
): Unit = js.Dynamic.global.updateDynamic("onrejectionhandled")(x.asInstanceOf[js.Any])

/**
  * Fires when the user resets a form.
  * @param ev The event.
  */
inline def onreset: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onreset").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onreset_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onreset")(x.asInstanceOf[js.Any])

inline def onresize: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onresize").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any]) | Null]
inline def onresize_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onresize")(x.asInstanceOf[js.Any])

/**
  * Fires when the user repositions the scroll box in the scroll bar on the object.
  * @param ev The event.
  */
inline def onscroll: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onscroll").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onscroll_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onscroll")(x.asInstanceOf[js.Any])

inline def onsecuritypolicyviolation: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SecurityPolicyViolationEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onsecuritypolicyviolation").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SecurityPolicyViolationEvent, Any]) | Null]
inline def onsecuritypolicyviolation_=(
  x: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SecurityPolicyViolationEvent, Any]) | Null
): Unit = js.Dynamic.global.updateDynamic("onsecuritypolicyviolation")(x.asInstanceOf[js.Any])

/**
  * Occurs when the seek operation ends.
  * @param ev The event.
  */
inline def onseeked: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onseeked").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onseeked_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onseeked")(x.asInstanceOf[js.Any])

/**
  * Occurs when the current playback position is moved.
  * @param ev The event.
  */
inline def onseeking: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onseeking").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onseeking_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onseeking")(x.asInstanceOf[js.Any])

/**
  * Fires when the current selection changes.
  * @param ev The event.
  */
inline def onselect: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onselect").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onselect_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onselect")(x.asInstanceOf[js.Any])

inline def onselectionchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onselectionchange").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onselectionchange_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onselectionchange")(x.asInstanceOf[js.Any])

inline def onselectstart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onselectstart").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onselectstart_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onselectstart")(x.asInstanceOf[js.Any])

inline def onslotchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onslotchange").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onslotchange_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onslotchange")(x.asInstanceOf[js.Any])

/**
  * Occurs when the download has stopped.
  * @param ev The event.
  */
inline def onstalled: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onstalled").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onstalled_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onstalled")(x.asInstanceOf[js.Any])

inline def onstorage: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.StorageEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onstorage").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.StorageEvent, Any]) | Null]
inline def onstorage_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.StorageEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onstorage")(x.asInstanceOf[js.Any])

inline def onsubmit: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SubmitEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onsubmit").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SubmitEvent, Any]) | Null]
inline def onsubmit_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SubmitEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onsubmit")(x.asInstanceOf[js.Any])

/**
  * Occurs if the load operation has been intentionally halted.
  * @param ev The event.
  */
inline def onsuspend: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onsuspend").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onsuspend_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onsuspend")(x.asInstanceOf[js.Any])

/**
  * Occurs to indicate the current playback position.
  * @param ev The event.
  */
inline def ontimeupdate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("ontimeupdate").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def ontimeupdate_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ontimeupdate")(x.asInstanceOf[js.Any])

inline def ontoggle: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("ontoggle").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def ontoggle_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ontoggle")(x.asInstanceOf[js.Any])

inline def ontouchcancel: js.UndefOr[
(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null] = js.Dynamic.global.selectDynamic("ontouchcancel").asInstanceOf[js.UndefOr[
(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null]]
inline def ontouchcancel_=(
  x: js.UndefOr[
  (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null
]
): Unit = js.Dynamic.global.updateDynamic("ontouchcancel")(x.asInstanceOf[js.Any])

inline def ontouchend: js.UndefOr[
(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null] = js.Dynamic.global.selectDynamic("ontouchend").asInstanceOf[js.UndefOr[
(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null]]
inline def ontouchend_=(
  x: js.UndefOr[
  (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null
]
): Unit = js.Dynamic.global.updateDynamic("ontouchend")(x.asInstanceOf[js.Any])

inline def ontouchmove: js.UndefOr[
(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null] = js.Dynamic.global.selectDynamic("ontouchmove").asInstanceOf[js.UndefOr[
(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null]]
inline def ontouchmove_=(
  x: js.UndefOr[
  (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null
]
): Unit = js.Dynamic.global.updateDynamic("ontouchmove")(x.asInstanceOf[js.Any])

inline def ontouchstart: js.UndefOr[
(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null] = js.Dynamic.global.selectDynamic("ontouchstart").asInstanceOf[js.UndefOr[
(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null]]
inline def ontouchstart_=(
  x: js.UndefOr[
  (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]) | Null
]
): Unit = js.Dynamic.global.updateDynamic("ontouchstart")(x.asInstanceOf[js.Any])

inline def ontransitioncancel: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ontransitioncancel").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null]
inline def ontransitioncancel_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ontransitioncancel")(x.asInstanceOf[js.Any])

inline def ontransitionend: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ontransitionend").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null]
inline def ontransitionend_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ontransitionend")(x.asInstanceOf[js.Any])

inline def ontransitionrun: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ontransitionrun").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null]
inline def ontransitionrun_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ontransitionrun")(x.asInstanceOf[js.Any])

inline def ontransitionstart: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null = js.Dynamic.global.selectDynamic("ontransitionstart").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null]
inline def ontransitionstart_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("ontransitionstart")(x.asInstanceOf[js.Any])

inline def onunhandledrejection: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onunhandledrejection").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any]) | Null]
inline def onunhandledrejection_=(
  x: (js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any]) | Null
): Unit = js.Dynamic.global.updateDynamic("onunhandledrejection")(x.asInstanceOf[js.Any])

inline def onunload: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onunload").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onunload_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onunload")(x.asInstanceOf[js.Any])

/**
  * Occurs when the volume is changed, or playback is muted or unmuted.
  * @param ev The event.
  */
inline def onvolumechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onvolumechange").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onvolumechange_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onvolumechange")(x.asInstanceOf[js.Any])

/**
  * Occurs when playback stops because the next frame of a video resource is not available.
  * @param ev The event.
  */
inline def onwaiting: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onwaiting").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onwaiting_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onwaiting")(x.asInstanceOf[js.Any])

/** @deprecated This is a legacy alias of `onanimationend`. */
inline def onwebkitanimationend: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onwebkitanimationend").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onwebkitanimationend_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onwebkitanimationend")(x.asInstanceOf[js.Any])

/** @deprecated This is a legacy alias of `onanimationiteration`. */
inline def onwebkitanimationiteration: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onwebkitanimationiteration").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onwebkitanimationiteration_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onwebkitanimationiteration")(x.asInstanceOf[js.Any])

/** @deprecated This is a legacy alias of `onanimationstart`. */
inline def onwebkitanimationstart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onwebkitanimationstart").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onwebkitanimationstart_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onwebkitanimationstart")(x.asInstanceOf[js.Any])

/** @deprecated This is a legacy alias of `ontransitionend`. */
inline def onwebkittransitionend: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null = js.Dynamic.global.selectDynamic("onwebkittransitionend").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null]
inline def onwebkittransitionend_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onwebkittransitionend")(x.asInstanceOf[js.Any])

inline def onwheel: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.WheelEvent, Any]) | Null = js.Dynamic.global.selectDynamic("onwheel").asInstanceOf[(js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.WheelEvent, Any]) | Null]
inline def onwheel_=(x: (js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.WheelEvent, Any]) | Null): Unit = js.Dynamic.global.updateDynamic("onwheel")(x.asInstanceOf[js.Any])

inline def open(): Window | Null = js.Dynamic.global.applyDynamic("open")().asInstanceOf[Window | Null]
inline def open(url: java.lang.String): Window | Null = js.Dynamic.global.applyDynamic("open")(url.asInstanceOf[js.Any]).asInstanceOf[Window | Null]
inline def open(url: java.lang.String, target: java.lang.String): Window | Null = (js.Dynamic.global.applyDynamic("open")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Window | Null]
inline def open(url: java.lang.String, target: java.lang.String, features: java.lang.String): Window | Null = (js.Dynamic.global.applyDynamic("open")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Window | Null]
inline def open(url: java.lang.String, target: Unit, features: java.lang.String): Window | Null = (js.Dynamic.global.applyDynamic("open")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Window | Null]
inline def open(url: org.scalajs.dom.URL): Window | Null = js.Dynamic.global.applyDynamic("open")(url.asInstanceOf[js.Any]).asInstanceOf[Window | Null]
inline def open(url: org.scalajs.dom.URL, target: java.lang.String): Window | Null = (js.Dynamic.global.applyDynamic("open")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Window | Null]
inline def open(url: org.scalajs.dom.URL, target: java.lang.String, features: java.lang.String): Window | Null = (js.Dynamic.global.applyDynamic("open")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Window | Null]
inline def open(url: org.scalajs.dom.URL, target: Unit, features: java.lang.String): Window | Null = (js.Dynamic.global.applyDynamic("open")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Window | Null]
inline def open(url: Unit, target: java.lang.String): Window | Null = (js.Dynamic.global.applyDynamic("open")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Window | Null]
inline def open(url: Unit, target: java.lang.String, features: java.lang.String): Window | Null = (js.Dynamic.global.applyDynamic("open")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Window | Null]
inline def open(url: Unit, target: Unit, features: java.lang.String): Window | Null = (js.Dynamic.global.applyDynamic("open")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Window | Null]

inline def opener: Any = js.Dynamic.global.selectDynamic("opener").asInstanceOf[Any]
inline def opener_=(x: Any): Unit = js.Dynamic.global.updateDynamic("opener")(x.asInstanceOf[js.Any])

/** @deprecated */
inline def orientation: Double = js.Dynamic.global.selectDynamic("orientation").asInstanceOf[Double]
inline def orientation_=(x: Double): Unit = js.Dynamic.global.updateDynamic("orientation")(x.asInstanceOf[js.Any])

inline def origin: java.lang.String = js.Dynamic.global.selectDynamic("origin").asInstanceOf[java.lang.String]
inline def origin_=(x: java.lang.String): Unit = js.Dynamic.global.updateDynamic("origin")(x.asInstanceOf[js.Any])

inline def outerHeight: Double = js.Dynamic.global.selectDynamic("outerHeight").asInstanceOf[Double]
inline def outerHeight_=(x: Double): Unit = js.Dynamic.global.updateDynamic("outerHeight")(x.asInstanceOf[js.Any])

inline def outerWidth: Double = js.Dynamic.global.selectDynamic("outerWidth").asInstanceOf[Double]
inline def outerWidth_=(x: Double): Unit = js.Dynamic.global.updateDynamic("outerWidth")(x.asInstanceOf[js.Any])

/** @deprecated This is a legacy alias of `scrollX`. */
inline def pageXOffset: Double = js.Dynamic.global.selectDynamic("pageXOffset").asInstanceOf[Double]
inline def pageXOffset_=(x: Double): Unit = js.Dynamic.global.updateDynamic("pageXOffset")(x.asInstanceOf[js.Any])

/** @deprecated This is a legacy alias of `scrollY`. */
inline def pageYOffset: Double = js.Dynamic.global.selectDynamic("pageYOffset").asInstanceOf[Double]
inline def pageYOffset_=(x: Double): Unit = js.Dynamic.global.updateDynamic("pageYOffset")(x.asInstanceOf[js.Any])

/**
  * Refers to either the parent WindowProxy, or itself.
  *
  * It can rarely be null e.g. for contentWindow of an iframe that is already removed from the parent.
  */
inline def parent: Window = js.Dynamic.global.selectDynamic("parent").asInstanceOf[Window]
inline def parent_=(x: Window): Unit = js.Dynamic.global.updateDynamic("parent")(x.asInstanceOf[js.Any])

/**
  * Converts a string to a floating-point number.
  * @param string A string that contains a floating-point number.
  */
inline def parseFloat(string: java.lang.String): Double = js.Dynamic.global.applyDynamic("parseFloat")(string.asInstanceOf[js.Any]).asInstanceOf[Double]

/**
  * Converts a string to an integer.
  * @param string A string to convert into a number.
  * @param radix A value between 2 and 36 that specifies the base of the number in `string`.
  * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
  * All other strings are considered decimal.
  */
inline def parseInt(string: java.lang.String): Double = js.Dynamic.global.applyDynamic("parseInt")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def parseInt(string: java.lang.String, radix: Double): Double = (js.Dynamic.global.applyDynamic("parseInt")(string.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def performance: Performance = js.Dynamic.global.selectDynamic("performance").asInstanceOf[Performance]
inline def performance_=(x: Performance): Unit = js.Dynamic.global.updateDynamic("performance")(x.asInstanceOf[js.Any])

/** Returns true if the personal bar is visible; otherwise, returns false. */
inline def personalbar: typingsJapgolly.std.BarProp = js.Dynamic.global.selectDynamic("personalbar").asInstanceOf[typingsJapgolly.std.BarProp]
inline def personalbar_=(x: typingsJapgolly.std.BarProp): Unit = js.Dynamic.global.updateDynamic("personalbar")(x.asInstanceOf[js.Any])

inline def postMessage(message: Any): Unit = js.Dynamic.global.applyDynamic("postMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def postMessage(message: Any, options: WindowPostMessageOptions): Unit = (js.Dynamic.global.applyDynamic("postMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
/**
  * Posts a message to the given window. Messages can be structured objects, e.g. nested objects and arrays, can contain JavaScript values (strings, numbers, Date objects, etc), and can contain certain data objects such as File Blob, FileList, and ArrayBuffer objects.
  *
  * Objects listed in the transfer member of options are transferred, not just cloned, meaning that they are no longer usable on the sending side.
  *
  * A target origin can be specified using the targetOrigin member of options. If not provided, it defaults to "/". This default restricts the message to same-origin targets only.
  *
  * If the origin of the target window doesn't match the given target origin, the message is discarded, to avoid information leakage. To send the message to the target regardless of origin, set the target origin to "*".
  *
  * Throws a "DataCloneError" DOMException if transfer array contains duplicate objects or if message could not be cloned.
  */
inline def postMessage(message: Any, targetOrigin: java.lang.String): Unit = (js.Dynamic.global.applyDynamic("postMessage")(message.asInstanceOf[js.Any], targetOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def postMessage(message: Any, targetOrigin: java.lang.String, transfer: js.Array[Transferable]): Unit = (js.Dynamic.global.applyDynamic("postMessage")(message.asInstanceOf[js.Any], targetOrigin.asInstanceOf[js.Any], transfer.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def print(): Unit = js.Dynamic.global.applyDynamic("print")().asInstanceOf[Unit]

inline def prompt(): java.lang.String | Null = js.Dynamic.global.applyDynamic("prompt")().asInstanceOf[java.lang.String | Null]
inline def prompt(message: java.lang.String): java.lang.String | Null = js.Dynamic.global.applyDynamic("prompt")(message.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | Null]
inline def prompt(message: java.lang.String, _default: java.lang.String): java.lang.String | Null = (js.Dynamic.global.applyDynamic("prompt")(message.asInstanceOf[js.Any], _default.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | Null]
inline def prompt(message: Unit, _default: java.lang.String): java.lang.String | Null = (js.Dynamic.global.applyDynamic("prompt")(message.asInstanceOf[js.Any], _default.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | Null]

inline def queueMicrotask(callback: VoidFunction): Unit = js.Dynamic.global.applyDynamic("queueMicrotask")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** @deprecated */
inline def releaseEvents(): Unit = js.Dynamic.global.applyDynamic("releaseEvents")().asInstanceOf[Unit]

inline def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener(
  `type`: java.lang.String,
  listener: EventListenerOrEventListenerObject,
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_DOMContentLoaded(`type`: DOMContentLoaded, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_DOMContentLoaded(
  `type`: DOMContentLoaded,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_DOMContentLoaded(
  `type`: DOMContentLoaded,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_abort(
  `type`: abort,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_abort(
  `type`: abort,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_abort(
  `type`: abort,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_afterprint(
  `type`: afterprint,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_afterprint(
  `type`: afterprint,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_animationcancel(
  `type`: animationcancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_animationcancel(
  `type`: animationcancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_animationcancel(
  `type`: animationcancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_animationend(
  `type`: animationend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_animationend(
  `type`: animationend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_animationend(
  `type`: animationend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_animationiteration(
  `type`: animationiteration,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_animationiteration(
  `type`: animationiteration,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_animationiteration(
  `type`: animationiteration,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_animationstart(
  `type`: animationstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_animationstart(
  `type`: animationstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_animationstart(
  `type`: animationstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.AnimationEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_auxclick(
  `type`: auxclick,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_auxclick(
  `type`: auxclick,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_auxclick(
  `type`: auxclick,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_beforeinput(
  `type`: beforeinput,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.InputEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_beforeinput(
  `type`: beforeinput,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.InputEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_beforeinput(
  `type`: beforeinput,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.InputEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_beforeprint(
  `type`: beforeprint,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_beforeprint(
  `type`: beforeprint,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_beforeunload(
  `type`: beforeunload,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.BeforeUnloadEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_beforeunload(
  `type`: beforeunload,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.BeforeUnloadEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_beforeunload(
  `type`: beforeunload,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.BeforeUnloadEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_blur(
  `type`: typingsJapgolly.std.stdStrings.blur,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_blur(
  `type`: typingsJapgolly.std.stdStrings.blur,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_blur(
  `type`: typingsJapgolly.std.stdStrings.blur,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_canplay(
  `type`: canplay,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_canplay(
  `type`: canplay,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_canplaythrough(
  `type`: canplaythrough,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_canplaythrough(
  `type`: canplaythrough,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_change(
  `type`: change,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_change(
  `type`: change,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_click(
  `type`: click,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_click(
  `type`: click,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_click(
  `type`: click,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_close(
  `type`: typingsJapgolly.std.stdStrings.close,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_close(
  `type`: typingsJapgolly.std.stdStrings.close,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_close(
  `type`: typingsJapgolly.std.stdStrings.close,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_compositionend(
  `type`: compositionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_compositionend(
  `type`: compositionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_compositionend(
  `type`: compositionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_compositionstart(
  `type`: compositionstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_compositionstart(
  `type`: compositionstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_compositionstart(
  `type`: compositionstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_compositionupdate(
  `type`: compositionupdate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_compositionupdate(
  `type`: compositionupdate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_compositionupdate(
  `type`: compositionupdate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.CompositionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_contextmenu(
  `type`: contextmenu,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_contextmenu(
  `type`: contextmenu,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_contextmenu(
  `type`: contextmenu,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_cuechange(
  `type`: cuechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_cuechange(
  `type`: cuechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_dblclick(
  `type`: dblclick,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_dblclick(
  `type`: dblclick,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_dblclick(
  `type`: dblclick,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_devicemotion(
  `type`: devicemotion,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_devicemotion(
  `type`: devicemotion,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_devicemotion(
  `type`: devicemotion,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_deviceorientation(
  `type`: deviceorientation,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_deviceorientation(
  `type`: deviceorientation,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_deviceorientation(
  `type`: deviceorientation,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_drag(
  `type`: drag,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_drag(
  `type`: drag,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_drag(
  `type`: drag,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_dragend(
  `type`: dragend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_dragend(
  `type`: dragend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_dragend(
  `type`: dragend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_dragenter(
  `type`: dragenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_dragenter(
  `type`: dragenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_dragenter(
  `type`: dragenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_dragleave(
  `type`: dragleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_dragleave(
  `type`: dragleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_dragleave(
  `type`: dragleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_dragover(
  `type`: dragover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_dragover(
  `type`: dragover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_dragover(
  `type`: dragover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_dragstart(
  `type`: dragstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_dragstart(
  `type`: dragstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_dragstart(
  `type`: dragstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_drop(
  `type`: drop,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_drop(
  `type`: drop,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_drop(
  `type`: drop,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.DragEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_durationchange(
  `type`: durationchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_durationchange(
  `type`: durationchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_emptied(
  `type`: emptied,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_emptied(
  `type`: emptied,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_ended(
  `type`: ended,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_ended(
  `type`: ended,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_error(
  `type`: error,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ErrorEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_error(
  `type`: error,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ErrorEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_error(
  `type`: error,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ErrorEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_focus(
  `type`: typingsJapgolly.std.stdStrings.focus,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_focus(
  `type`: typingsJapgolly.std.stdStrings.focus,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_focus(
  `type`: typingsJapgolly.std.stdStrings.focus,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_focusin(
  `type`: focusin,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_focusin(
  `type`: focusin,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_focusin(
  `type`: focusin,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_focusout(
  `type`: focusout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_focusout(
  `type`: focusout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_focusout(
  `type`: focusout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.FocusEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_formdata(
  `type`: formdata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.FormDataEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_formdata(
  `type`: formdata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.FormDataEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_formdata(
  `type`: formdata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.FormDataEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_gamepadconnected(
  `type`: gamepadconnected,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_gamepadconnected(
  `type`: gamepadconnected,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_gamepadconnected(
  `type`: gamepadconnected,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_gamepaddisconnected(
  `type`: gamepaddisconnected,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_gamepaddisconnected(
  `type`: gamepaddisconnected,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_gamepaddisconnected(
  `type`: gamepaddisconnected,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.GamepadEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_gotpointercapture(
  `type`: gotpointercapture,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_gotpointercapture(
  `type`: gotpointercapture,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_gotpointercapture(
  `type`: gotpointercapture,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_hashchange(
  `type`: hashchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.HashChangeEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_hashchange(
  `type`: hashchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.HashChangeEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_hashchange(
  `type`: hashchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.HashChangeEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_input(
  `type`: input,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_input(
  `type`: input,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_invalid(
  `type`: invalid,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_invalid(
  `type`: invalid,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_keydown(
  `type`: keydown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_keydown(
  `type`: keydown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_keydown(
  `type`: keydown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_keypress(
  `type`: keypress,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_keypress(
  `type`: keypress,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_keypress(
  `type`: keypress,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_keyup(
  `type`: keyup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_keyup(
  `type`: keyup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_keyup(
  `type`: keyup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.KeyboardEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_languagechange(`type`: languagechange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_languagechange(
  `type`: languagechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_languagechange(
  `type`: languagechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_load(
  `type`: load,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_load(
  `type`: load,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_loadeddata(
  `type`: loadeddata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_loadeddata(
  `type`: loadeddata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_loadedmetadata(
  `type`: loadedmetadata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_loadedmetadata(
  `type`: loadedmetadata,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_loadstart(
  `type`: loadstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_loadstart(
  `type`: loadstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_lostpointercapture(
  `type`: lostpointercapture,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_lostpointercapture(
  `type`: lostpointercapture,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_lostpointercapture(
  `type`: lostpointercapture,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_message(
  `type`: message,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_message(
  `type`: message,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_message(
  `type`: message,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_messageerror(
  `type`: messageerror,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_messageerror(
  `type`: messageerror,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_messageerror(
  `type`: messageerror,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MessageEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_mousedown(
  `type`: mousedown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mousedown(
  `type`: mousedown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mousedown(
  `type`: mousedown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_mouseenter(
  `type`: mouseenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mouseenter(
  `type`: mouseenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mouseenter(
  `type`: mouseenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_mouseleave(
  `type`: mouseleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mouseleave(
  `type`: mouseleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mouseleave(
  `type`: mouseleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_mousemove(
  `type`: mousemove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mousemove(
  `type`: mousemove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mousemove(
  `type`: mousemove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_mouseout(
  `type`: mouseout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mouseout(
  `type`: mouseout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mouseout(
  `type`: mouseout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_mouseover(
  `type`: mouseover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mouseover(
  `type`: mouseover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mouseover(
  `type`: mouseover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_mouseup(
  `type`: mouseup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mouseup(
  `type`: mouseup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_mouseup(
  `type`: mouseup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.MouseEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_offline(
  `type`: offline,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_offline(
  `type`: offline,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_online(
  `type`: online,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_online(
  `type`: online,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_orientationchange(
  `type`: orientationchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_orientationchange(
  `type`: orientationchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_pagehide(
  `type`: pagehide,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pagehide(
  `type`: pagehide,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pagehide(
  `type`: pagehide,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_pageshow(
  `type`: pageshow,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pageshow(
  `type`: pageshow,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pageshow(
  `type`: pageshow,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PageTransitionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pause(
  `type`: pause,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pause(
  `type`: pause,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_play(
  `type`: play,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_play(
  `type`: play,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_playing(
  `type`: playing,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_playing(
  `type`: playing,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_pointercancel(
  `type`: pointercancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointercancel(
  `type`: pointercancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointercancel(
  `type`: pointercancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_pointerdown(
  `type`: pointerdown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointerdown(
  `type`: pointerdown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointerdown(
  `type`: pointerdown,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_pointerenter(
  `type`: pointerenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointerenter(
  `type`: pointerenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointerenter(
  `type`: pointerenter,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_pointerleave(
  `type`: pointerleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointerleave(
  `type`: pointerleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointerleave(
  `type`: pointerleave,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_pointermove(
  `type`: pointermove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointermove(
  `type`: pointermove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointermove(
  `type`: pointermove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_pointerout(
  `type`: pointerout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointerout(
  `type`: pointerout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointerout(
  `type`: pointerout,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_pointerover(
  `type`: pointerover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointerover(
  `type`: pointerover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointerover(
  `type`: pointerover,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_pointerup(
  `type`: pointerup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointerup(
  `type`: pointerup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_pointerup(
  `type`: pointerup,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PointerEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_popstate(
  `type`: popstate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PopStateEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_popstate(
  `type`: popstate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PopStateEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_popstate(
  `type`: popstate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.PopStateEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_progress(
  `type`: progress,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ProgressEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_progress(
  `type`: progress,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ProgressEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_progress(
  `type`: progress,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.ProgressEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_ratechange(
  `type`: ratechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_ratechange(
  `type`: ratechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_rejectionhandled(
  `type`: rejectionhandled,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_rejectionhandled(
  `type`: rejectionhandled,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_rejectionhandled(
  `type`: rejectionhandled,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_reset(
  `type`: reset,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_reset(
  `type`: reset,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_resize(
  `type`: resize,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_resize(
  `type`: resize,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_resize(
  `type`: resize,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.UIEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_scroll(
  `type`: typingsJapgolly.std.stdStrings.scroll,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_scroll(
  `type`: typingsJapgolly.std.stdStrings.scroll,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_scroll(
  `type`: typingsJapgolly.std.stdStrings.scroll,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_securitypolicyviolation(
  `type`: securitypolicyviolation,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SecurityPolicyViolationEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_securitypolicyviolation(
  `type`: securitypolicyviolation,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SecurityPolicyViolationEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_securitypolicyviolation(
  `type`: securitypolicyviolation,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SecurityPolicyViolationEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_seeked(
  `type`: seeked,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_seeked(
  `type`: seeked,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_seeking(
  `type`: seeking,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_seeking(
  `type`: seeking,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_select(
  `type`: select,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_select(
  `type`: select,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_selectionchange(
  `type`: selectionchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_selectionchange(
  `type`: selectionchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_selectstart(
  `type`: selectstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_selectstart(
  `type`: selectstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_slotchange(`type`: slotchange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_slotchange(
  `type`: slotchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_slotchange(
  `type`: slotchange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_stalled(
  `type`: stalled,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_stalled(
  `type`: stalled,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_storage(
  `type`: storage,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.StorageEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_storage(
  `type`: storage,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.StorageEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_storage(
  `type`: storage,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.StorageEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_submit(
  `type`: submit,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SubmitEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_submit(
  `type`: submit,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SubmitEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_submit(
  `type`: submit,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.SubmitEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_suspend(
  `type`: suspend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_suspend(
  `type`: suspend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_timeupdate(
  `type`: timeupdate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_timeupdate(
  `type`: timeupdate,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_toggle(
  `type`: toggle,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_toggle(
  `type`: toggle,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_touchcancel(
  `type`: touchcancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_touchcancel(
  `type`: touchcancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_touchcancel(
  `type`: touchcancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_touchend(
  `type`: touchend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_touchend(
  `type`: touchend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_touchend(
  `type`: touchend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_touchmove(
  `type`: touchmove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_touchmove(
  `type`: touchmove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_touchmove(
  `type`: touchmove,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_touchstart(
  `type`: touchstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_touchstart(
  `type`: touchstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_touchstart(
  `type`: touchstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TouchEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_transitioncancel(
  `type`: transitioncancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_transitioncancel(
  `type`: transitioncancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_transitioncancel(
  `type`: transitioncancel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_transitionend(
  `type`: transitionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_transitionend(
  `type`: transitionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_transitionend(
  `type`: transitionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_transitionrun(
  `type`: transitionrun,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_transitionrun(
  `type`: transitionrun,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_transitionrun(
  `type`: transitionrun,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_transitionstart(
  `type`: transitionstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_transitionstart(
  `type`: transitionstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_transitionstart(
  `type`: transitionstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.TransitionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_unhandledrejection(
  `type`: unhandledrejection,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_unhandledrejection(
  `type`: unhandledrejection,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_unhandledrejection(
  `type`: unhandledrejection,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ typingsJapgolly.std.PromiseRejectionEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_unload(
  `type`: unload,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_unload(
  `type`: unload,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_volumechange(
  `type`: volumechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_volumechange(
  `type`: volumechange,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_waiting(
  `type`: waiting,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_waiting(
  `type`: waiting,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_webkitanimationend(`type`: webkitanimationend, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_webkitanimationend(
  `type`: webkitanimationend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_webkitanimationend(
  `type`: webkitanimationend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_webkitanimationiteration(
  `type`: webkitanimationiteration,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_webkitanimationiteration(
  `type`: webkitanimationiteration,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_webkitanimationiteration(
  `type`: webkitanimationiteration,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_webkitanimationstart(`type`: webkitanimationstart, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_webkitanimationstart(
  `type`: webkitanimationstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_webkitanimationstart(
  `type`: webkitanimationstart,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_webkittransitionend(`type`: webkittransitionend, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any]): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_webkittransitionend(
  `type`: webkittransitionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_webkittransitionend(
  `type`: webkittransitionend,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEventListener_wheel(
  `type`: wheel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.WheelEvent, Any]
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_wheel(
  `type`: wheel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.WheelEvent, Any],
  options: EventListenerOptions
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEventListener_wheel(
  `type`: wheel,
  listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.WheelEvent, Any],
  options: scala.Boolean
): Unit = (js.Dynamic.global.applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def reportError(e: Any): Unit = js.Dynamic.global.applyDynamic("reportError")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def requestAnimationFrame(callback: FrameRequestCallback): Double = js.Dynamic.global.applyDynamic("requestAnimationFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def requestIdleCallback(callback: IdleRequestCallback): Double = js.Dynamic.global.applyDynamic("requestIdleCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def requestIdleCallback(callback: IdleRequestCallback, options: IdleRequestOptions): Double = (js.Dynamic.global.applyDynamic("requestIdleCallback")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def resizeBy(x: Double, y: Double): Unit = (js.Dynamic.global.applyDynamic("resizeBy")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resizeTo(width: Double, height: Double): Unit = (js.Dynamic.global.applyDynamic("resizeTo")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def screen: Screen = js.Dynamic.global.selectDynamic("screen").asInstanceOf[Screen]

inline def screenLeft: Double = js.Dynamic.global.selectDynamic("screenLeft").asInstanceOf[Double]
inline def screenLeft_=(x: Double): Unit = js.Dynamic.global.updateDynamic("screenLeft")(x.asInstanceOf[js.Any])

inline def screenTop: Double = js.Dynamic.global.selectDynamic("screenTop").asInstanceOf[Double]
inline def screenTop_=(x: Double): Unit = js.Dynamic.global.updateDynamic("screenTop")(x.asInstanceOf[js.Any])

inline def screenX: Double = js.Dynamic.global.selectDynamic("screenX").asInstanceOf[Double]
inline def screenX_=(x: Double): Unit = js.Dynamic.global.updateDynamic("screenX")(x.asInstanceOf[js.Any])

inline def screenY: Double = js.Dynamic.global.selectDynamic("screenY").asInstanceOf[Double]
inline def screenY_=(x: Double): Unit = js.Dynamic.global.updateDynamic("screenY")(x.asInstanceOf[js.Any])

inline def screen_=(x: Screen): Unit = js.Dynamic.global.updateDynamic("screen")(x.asInstanceOf[js.Any])

inline def scroll(): Unit = js.Dynamic.global.applyDynamic("scroll")().asInstanceOf[Unit]
inline def scroll(options: ScrollToOptions): Unit = js.Dynamic.global.applyDynamic("scroll")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def scroll(x: Double, y: Double): Unit = (js.Dynamic.global.applyDynamic("scroll")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def scrollBy(): Unit = js.Dynamic.global.applyDynamic("scrollBy")().asInstanceOf[Unit]
inline def scrollBy(options: ScrollToOptions): Unit = js.Dynamic.global.applyDynamic("scrollBy")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def scrollBy(x: Double, y: Double): Unit = (js.Dynamic.global.applyDynamic("scrollBy")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def scrollTo(): Unit = js.Dynamic.global.applyDynamic("scrollTo")().asInstanceOf[Unit]
inline def scrollTo(options: ScrollToOptions): Unit = js.Dynamic.global.applyDynamic("scrollTo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def scrollTo(x: Double, y: Double): Unit = (js.Dynamic.global.applyDynamic("scrollTo")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def scrollX: Double = js.Dynamic.global.selectDynamic("scrollX").asInstanceOf[Double]
inline def scrollX_=(x: Double): Unit = js.Dynamic.global.updateDynamic("scrollX")(x.asInstanceOf[js.Any])

inline def scrollY: Double = js.Dynamic.global.selectDynamic("scrollY").asInstanceOf[Double]
inline def scrollY_=(x: Double): Unit = js.Dynamic.global.updateDynamic("scrollY")(x.asInstanceOf[js.Any])

/** Returns true if the scrollbars are visible; otherwise, returns false. */
inline def scrollbars: typingsJapgolly.std.BarProp = js.Dynamic.global.selectDynamic("scrollbars").asInstanceOf[typingsJapgolly.std.BarProp]
inline def scrollbars_=(x: typingsJapgolly.std.BarProp): Unit = js.Dynamic.global.updateDynamic("scrollbars")(x.asInstanceOf[js.Any])

inline def self: Window & (/* globalThis */ Any) = js.Dynamic.global.selectDynamic("self").asInstanceOf[Window & (/* globalThis */ Any)]
inline def self_=(x: Window & (/* globalThis */ Any)): Unit = js.Dynamic.global.updateDynamic("self")(x.asInstanceOf[js.Any])

inline def sessionStorage: org.scalajs.dom.Storage = js.Dynamic.global.selectDynamic("sessionStorage").asInstanceOf[org.scalajs.dom.Storage]
inline def sessionStorage_=(x: org.scalajs.dom.Storage): Unit = js.Dynamic.global.updateDynamic("sessionStorage")(x.asInstanceOf[js.Any])

inline def setInterval(handler: TimerHandler, timeout: Double, arguments: Any*): Double = (js.Dynamic.global.applyDynamic("setInterval")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(arguments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
inline def setInterval(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = (js.Dynamic.global.applyDynamic("setInterval")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(arguments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]

inline def setTimeout(handler: TimerHandler, timeout: Double, arguments: Any*): Double = (js.Dynamic.global.applyDynamic("setTimeout")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(arguments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
inline def setTimeout(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = (js.Dynamic.global.applyDynamic("setTimeout")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(arguments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]

inline def speechSynthesis: SpeechSynthesis = js.Dynamic.global.selectDynamic("speechSynthesis").asInstanceOf[SpeechSynthesis]
inline def speechSynthesis_=(x: SpeechSynthesis): Unit = js.Dynamic.global.updateDynamic("speechSynthesis")(x.asInstanceOf[js.Any])

/** @deprecated */
inline def status: java.lang.String = js.Dynamic.global.selectDynamic("status").asInstanceOf[java.lang.String]
inline def status_=(x: java.lang.String): Unit = js.Dynamic.global.updateDynamic("status")(x.asInstanceOf[js.Any])

/** Returns true if the status bar is visible; otherwise, returns false. */
inline def statusbar: typingsJapgolly.std.BarProp = js.Dynamic.global.selectDynamic("statusbar").asInstanceOf[typingsJapgolly.std.BarProp]
inline def statusbar_=(x: typingsJapgolly.std.BarProp): Unit = js.Dynamic.global.updateDynamic("statusbar")(x.asInstanceOf[js.Any])

/** Cancels the document load. */
inline def stop(): Unit = js.Dynamic.global.applyDynamic("stop")().asInstanceOf[Unit]

inline def structuredClone(value: Any): Any = js.Dynamic.global.applyDynamic("structuredClone")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def structuredClone(value: Any, options: StructuredSerializeOptions): Any = (js.Dynamic.global.applyDynamic("structuredClone")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def toString_(): java.lang.String = js.Dynamic.global.applyDynamic("toString")().asInstanceOf[java.lang.String]

/** Returns true if the toolbar is visible; otherwise, returns false. */
inline def toolbar: typingsJapgolly.std.BarProp = js.Dynamic.global.selectDynamic("toolbar").asInstanceOf[typingsJapgolly.std.BarProp]
inline def toolbar_=(x: typingsJapgolly.std.BarProp): Unit = js.Dynamic.global.updateDynamic("toolbar")(x.asInstanceOf[js.Any])

inline def top: Window | Null = js.Dynamic.global.selectDynamic("top").asInstanceOf[Window | Null]
inline def top_=(x: Window | Null): Unit = js.Dynamic.global.updateDynamic("top")(x.asInstanceOf[js.Any])

/**
  * Computes a new string in which hexadecimal escape sequences are replaced with the character that it represents.
  * @deprecated A legacy feature for browser compatibility
  * @param string A string value
  */
inline def unescape(string: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("unescape")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def visualViewport: VisualViewport | Null = js.Dynamic.global.selectDynamic("visualViewport").asInstanceOf[VisualViewport | Null]
inline def visualViewport_=(x: VisualViewport | Null): Unit = js.Dynamic.global.updateDynamic("visualViewport")(x.asInstanceOf[js.Any])

inline def window: Window & (/* globalThis */ Any) = js.Dynamic.global.selectDynamic("window").asInstanceOf[Window & (/* globalThis */ Any)]
inline def window_=(x: Window & (/* globalThis */ Any)): Unit = js.Dynamic.global.updateDynamic("window")(x.asInstanceOf[js.Any])
