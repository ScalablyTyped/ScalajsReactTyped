package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.std.stdStrings.MSGestureChange
import typingsJapgolly.std.stdStrings.MSGestureDoubleTap
import typingsJapgolly.std.stdStrings.MSGestureEnd
import typingsJapgolly.std.stdStrings.MSGestureHold
import typingsJapgolly.std.stdStrings.MSGestureStart
import typingsJapgolly.std.stdStrings.MSGestureTap
import typingsJapgolly.std.stdStrings.MSInertiaStart
import typingsJapgolly.std.stdStrings.MSPointerCancel
import typingsJapgolly.std.stdStrings.MSPointerDown
import typingsJapgolly.std.stdStrings.MSPointerEnter
import typingsJapgolly.std.stdStrings.MSPointerLeave
import typingsJapgolly.std.stdStrings.MSPointerMove
import typingsJapgolly.std.stdStrings.MSPointerOut
import typingsJapgolly.std.stdStrings.MSPointerOver
import typingsJapgolly.std.stdStrings.MSPointerUp
import typingsJapgolly.std.stdStrings.compassneedscalibration
import typingsJapgolly.std.stdStrings.devicelight
import typingsJapgolly.std.stdStrings.devicemotion
import typingsJapgolly.std.stdStrings.deviceorientation
import typingsJapgolly.std.stdStrings.deviceorientationabsolute
import typingsJapgolly.std.stdStrings.mousewheel
import typingsJapgolly.std.stdStrings.orientationchange
import typingsJapgolly.std.stdStrings.readystatechange
import typingsJapgolly.std.stdStrings.vrdisplayactivate
import typingsJapgolly.std.stdStrings.vrdisplayblur
import typingsJapgolly.std.stdStrings.vrdisplayconnect
import typingsJapgolly.std.stdStrings.vrdisplaydeactivate
import typingsJapgolly.std.stdStrings.vrdisplaydisconnect
import typingsJapgolly.std.stdStrings.vrdisplayfocus
import typingsJapgolly.std.stdStrings.vrdisplaypointerrestricted
import typingsJapgolly.std.stdStrings.vrdisplaypointerunrestricted
import typingsJapgolly.std.stdStrings.vrdisplaypresentchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A window containing a DOM document; the document property points to the DOM document loaded in that window. */
@js.native
trait Window
  extends EventTarget
     with AnimationFrameProvider
     with GlobalEventHandlers
     with IDBEnvironment
     with WindowBase64
     with WindowConsole
     with WindowEventHandlers
     with WindowLocalStorage
     with WindowOrWorkerGlobalScope
     with WindowSessionStorage
     with WindowTimers
     with /* index */ NumberDictionary[Window] {
  val applicationCache: org.scalajs.dom.raw.ApplicationCache = js.native
  val clientInformation: org.scalajs.dom.raw.Navigator = js.native
  val closed: scala.Boolean = js.native
  var customElements: CustomElementRegistry = js.native
  var defaultStatus: java.lang.String = js.native
  val devicePixelRatio: Double = js.native
  val doNotTrack: java.lang.String = js.native
  val document: org.scalajs.dom.raw.Document = js.native
  /** @deprecated */
  val event: js.UndefOr[org.scalajs.dom.raw.Event] = js.native
  /** @deprecated */
  val external: org.scalajs.dom.raw.External = js.native
  val frameElement: org.scalajs.dom.raw.Element = js.native
  val frames: org.scalajs.dom.raw.Window = js.native
  val history: org.scalajs.dom.raw.History = js.native
  /* InferMemberOverrides */
  override val indexedDB: org.scalajs.dom.raw.IDBFactory = js.native
  val innerHeight: Double = js.native
  val innerWidth: Double = js.native
  val isSecureContext: scala.Boolean = js.native
  val length: Double = js.native
  var location: org.scalajs.dom.raw.Location = js.native
  val locationbar: BarProp = js.native
  val menubar: BarProp = js.native
  val msContentScript: ExtensionScriptApis = js.native
  var name: java.lang.String = js.native
  val navigator: org.scalajs.dom.raw.Navigator = js.native
  var offscreenBuffering: java.lang.String | scala.Boolean = js.native
  var oncompassneedscalibration: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var ondevicelight: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]) | Null = js.native
  var ondevicemotion: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent, 
    _
  ]) | Null = js.native
  var ondeviceorientation: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
    _
  ]) | Null = js.native
  var ondeviceorientationabsolute: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
    _
  ]) | Null = js.native
  var onmousewheel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmsgesturechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmsgesturedoubletap: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmsgestureend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmsgesturehold: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmsgesturestart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmsgesturetap: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmsinertiastart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmspointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmspointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmspointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmspointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmspointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmspointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmspointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onmspointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  /** @deprecated */
  var onorientationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]) | Null = js.native
  var onvrdisplayactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onvrdisplayblur: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onvrdisplayconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onvrdisplayfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onvrdisplaypointerrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onvrdisplaypointerunrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var opener: js.Any = js.native
  /** @deprecated */
  val orientation: java.lang.String | Double = js.native
  val outerHeight: Double = js.native
  val outerWidth: Double = js.native
  val pageXOffset: Double = js.native
  val pageYOffset: Double = js.native
  val parent: org.scalajs.dom.raw.Window = js.native
  val personalbar: BarProp = js.native
  val screen: org.scalajs.dom.raw.Screen = js.native
  val screenLeft: Double = js.native
  val screenTop: Double = js.native
  val screenX: Double = js.native
  val screenY: Double = js.native
  val scrollX: Double = js.native
  val scrollY: Double = js.native
  val scrollbars: BarProp = js.native
  val self: org.scalajs.dom.raw.Window with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any) = js.native
  val speechSynthesis: SpeechSynthesis = js.native
  var status: java.lang.String = js.native
  val statusbar: BarProp = js.native
  val styleMedia: org.scalajs.dom.raw.StyleMedia = js.native
  val toolbar: BarProp = js.native
  val top: org.scalajs.dom.raw.Window = js.native
  val window: org.scalajs.dom.raw.Window with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any) = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * 
    * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * 
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * 
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
    * 
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
    * 
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
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
    options: scala.Boolean
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
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent, 
      _
    ],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def alert(): Unit = js.native
  def alert(message: js.Any): Unit = js.native
  /* InferMemberOverrides */
  override def atob(encodedString: java.lang.String): java.lang.String = js.native
  def blur(): Unit = js.native
  /* InferMemberOverrides */
  override def btoa(rawString: java.lang.String): java.lang.String = js.native
  /** @deprecated */
  def captureEvents(): Unit = js.native
  def close(): Unit = js.native
  def confirm(): scala.Boolean = js.native
  def confirm(message: java.lang.String): scala.Boolean = js.native
  def departFocus(navigationReason: NavigationReason, origin: FocusNavigationOrigin): Unit = js.native
  def focus(): Unit = js.native
  def getComputedStyle(elt: org.scalajs.dom.raw.Element): org.scalajs.dom.raw.CSSStyleDeclaration = js.native
  def getComputedStyle(elt: org.scalajs.dom.raw.Element, pseudoElt: java.lang.String): org.scalajs.dom.raw.CSSStyleDeclaration = js.native
  def getMatchedCSSRules(elt: org.scalajs.dom.raw.Element): org.scalajs.dom.raw.CSSRuleList = js.native
  def getMatchedCSSRules(elt: org.scalajs.dom.raw.Element, pseudoElt: java.lang.String): org.scalajs.dom.raw.CSSRuleList = js.native
  def getSelection(): org.scalajs.dom.raw.Selection | Null = js.native
  def matchMedia(query: java.lang.String): org.scalajs.dom.raw.MediaQueryList = js.native
  def moveBy(x: Double, y: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def msWriteProfilerMark(profilerMarkName: java.lang.String): Unit = js.native
  def open(): org.scalajs.dom.raw.Window | Null = js.native
  def open(url: java.lang.String): org.scalajs.dom.raw.Window | Null = js.native
  def open(url: java.lang.String, target: java.lang.String): org.scalajs.dom.raw.Window | Null = js.native
  def open(url: java.lang.String, target: java.lang.String, features: java.lang.String): org.scalajs.dom.raw.Window | Null = js.native
  def open(
    url: java.lang.String,
    target: java.lang.String,
    features: java.lang.String,
    replace: scala.Boolean
  ): org.scalajs.dom.raw.Window | Null = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String): Unit = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String, transfer: js.Array[Transferable]): Unit = js.native
  def print(): Unit = js.native
  def prompt(): java.lang.String | Null = js.native
  def prompt(message: java.lang.String): java.lang.String | Null = js.native
  def prompt(message: java.lang.String, _default: java.lang.String): java.lang.String | Null = js.native
  /** @deprecated */
  def releaseEvents(): Unit = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
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
    options: scala.Boolean
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
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
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
  def stop(): Unit = js.native
  def webkitCancelAnimationFrame(handle: Double): Unit = js.native
  def webkitConvertPointFromNodeToPage(node: org.scalajs.dom.raw.Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitConvertPointFromPageToNode(node: org.scalajs.dom.raw.Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
}

@JSGlobal("Window")
@js.native
object Window extends Instantiable0[Window]

@JSGlobal("window")
@js.native
object window
  extends TopLevel[
      Window with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any)
    ]

